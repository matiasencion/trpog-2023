package Logica;

import java.util.Collection;

import java.util.Map;
import java.util.Set;

import java.time.LocalDate;

import excepciones.KeywordRepetida;
import excepciones.OfertaNoExisteException;
import excepciones.OfertaRepetidaException;
import excepciones.TOfertaRepetidaException;
import excepciones.UsuarioNoExisteException;

public interface IContOferta {

        public abstract void altaOferta(String nicknameEmpresa, String nombreTOferta, String nombreOferta,
                        String descripcion,
                        String horaI, String horaF, float sueldo, String ciudad, String depto, LocalDate fecha,
                        Set<String> keywords, String paquete, String foto) throws OfertaRepetidaException;

        public abstract void modificarOferta(String nombre);

        public abstract Oferta getOferta(String nombre) throws OfertaNoExisteException;

        public abstract Collection<Oferta> getOfertas();

        public abstract void agregarTOferta(String name, String descr, int expo, int duration, float cost,
                        LocalDate date)
                        throws TOfertaRepetidaException;

        public abstract void AltaDeKeyword(String nombre) throws KeywordRepetida;

        public abstract String getInfoOfertaString(String nombre)throws OfertaNoExisteException;

        public abstract String getInfoPostulantesString(String nombre)throws OfertaNoExisteException;

        public abstract void PostulacionOfertaLaboral(String nombreOferta, String nickPostulante, String CVreducido,
                        String motivacion, String fecha) throws UsuarioNoExisteException,OfertaNoExisteException;

        public abstract Collection<String> listarEmpresas();

        public abstract Collection<String> listarTOfertas();

        public abstract Collection<String> listarKeywords();

        public abstract Collection<String> getNombresPaquetesDisponibles();

        public abstract void agregarPaquete(String nombre, String descripcion, String Duracion, String Descuento,
                        String fechaDeAlta, String foto) throws TOfertaRepetidaException;

        public abstract Collection<String> getNombreTOfertas();

        public abstract TOferta getTOferta(String nombre);
        
        public abstract Collection<String> getOfertaKeyword(String oferta);

        public abstract Collection<String> listarOfertas();

        public abstract String getEmpresaOferta(String nombreOferta)throws OfertaNoExisteException;

        public abstract String getInfoOfertaBasico(String nombreOferta)throws OfertaNoExisteException;

        public abstract Collection<String> listarPaquetes();

        public abstract String getInfoPaquete(String nombrePaquete);

        public abstract Collection<String> getNombresTOPaquetes(String nombrePaquete);

        public abstract void agregarPTP(String nombrePaquete, String nombreTipo, int cantidad)
                        throws TOfertaRepetidaException;

        public abstract String getInfoTipo(String tipo);

        public abstract void verificarOferta(String oferta, boolean valor, LocalDate fecha) throws Exception;

        public abstract DTPublicar getInfoPublicar(String oferta)throws OfertaNoExisteException;

        public abstract DTPaquete getDTPaquete(String paquete);

        public abstract Collection<DTPaquete> getPaquetesComprados(String empresa);

        /* RETORNA UN MAP CON EL <PAQUETE, DTCOMPRAPAQUETE> */
        public abstract Map<String, DTCompraPaquete> getCompraPaquetesEmpresa(String empresa);

        public abstract void compraPaquete(String empresa, String paquete, LocalDate fecha) throws Exception;

        public abstract Collection<DTOferta> infoOferta();
        public abstract Collection<DTOferta> infoOfertaConfirmada();

        public abstract DTOferta getDTOferta(String oferta)throws OfertaNoExisteException;

        public abstract Collection<DTPaquete> infoPaquetes();
        
        public abstract Collection<DTTipoOferta> infoTOferta();
        public abstract Collection<DTPaquete> infoPaquetesNoComprados(String nickname);
}
