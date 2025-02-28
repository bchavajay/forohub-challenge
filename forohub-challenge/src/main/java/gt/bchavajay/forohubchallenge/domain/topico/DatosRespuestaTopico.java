package gt.bchavajay.forohubchallenge.domain.topico;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje,
                                   String fecha, String estatus, Long autor,
                                   String curso){

    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(),
                topico.getEstatus().toString(), topico.getAutor(), topico.getCurso().toString());
    }

}

