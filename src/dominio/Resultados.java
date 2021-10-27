/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;



/**
 *
 * @author DELL
 */
public class Resultados {
   private int id;
    private String fecha;
    private String numeroCitologico;
    private String laboratorio;
    private String caracteristicasMuestra;
    private String diagnosticoCitologico;
    private String atencedentesVacunaVPH;
    private String repetirEstudio;
    private String motivo;
    private String RFCcitologo;
    private String revisionPatologo;
    private String diagnosticoPatologo;
    private String RFCpatologo;
    private String pruebaHibridacion;
    private String resultadoHibridacion;
    private Paciente paciente;

    public Resultados() {
    }

    public Resultados(String fecha, String numeroCitologico, String laboratorio, String caracteristicasMuestra, String diagnosticoCitologico, String atencedentesVacunaVPH, String repetirEstudio, String motivo, String RFCcitologo, String revisionPatologo, String diagnosticoPatologo, String RFCpatologo, String pruebaHibridacion, String resultadoHibridacion, Paciente paciente) {
        this.fecha = fecha;
        this.numeroCitologico = numeroCitologico;
        this.laboratorio = laboratorio;
        this.caracteristicasMuestra = caracteristicasMuestra;
        this.diagnosticoCitologico = diagnosticoCitologico;
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
        this.repetirEstudio = repetirEstudio;
        this.motivo = motivo;
        this.RFCcitologo = RFCcitologo;
        this.revisionPatologo = revisionPatologo;
        this.diagnosticoPatologo = diagnosticoPatologo;
        this.RFCpatologo = RFCpatologo;
        this.pruebaHibridacion = pruebaHibridacion;
        this.resultadoHibridacion = resultadoHibridacion;
        this.paciente = paciente;
    }

    public Resultados(int id, String fecha, String numeroCitologico, String laboratorio, String caracteristicasMuestra, String diagnosticoCitologico, String atencedentesVacunaVPH, String repetirEstudio, String motivo, String RFCcitologo, String revisionPatologo, String diagnosticoPatologo, String RFCpatologo, String pruebaHibridacion, String resultadoHibridacion, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.numeroCitologico = numeroCitologico;
        this.laboratorio = laboratorio;
        this.caracteristicasMuestra = caracteristicasMuestra;
        this.diagnosticoCitologico = diagnosticoCitologico;
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
        this.repetirEstudio = repetirEstudio;
        this.motivo = motivo;
        this.RFCcitologo = RFCcitologo;
        this.revisionPatologo = revisionPatologo;
        this.diagnosticoPatologo = diagnosticoPatologo;
        this.RFCpatologo = RFCpatologo;
        this.pruebaHibridacion = pruebaHibridacion;
        this.resultadoHibridacion = resultadoHibridacion;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroCitologico() {
        return numeroCitologico;
    }

    public void setNumeroCitologico(String numeroCitologico) {
        this.numeroCitologico = numeroCitologico;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getCaracteristicasMuestra() {
        return caracteristicasMuestra;
    }

    public void setCaracteristicasMuestra(String caracteristicasMuestra) {
        this.caracteristicasMuestra = caracteristicasMuestra;
    }

    public String getDiagnosticoCitologico() {
        return diagnosticoCitologico;
    }

    public void setDiagnosticoCitologico(String diagnosticoCitologico) {
        this.diagnosticoCitologico = diagnosticoCitologico;
    }

    public String getAtencedentesVacunaVPH() {
        return atencedentesVacunaVPH;
    }

    public void setAtencedentesVacunaVPH(String atencedentesVacunaVPH) {
        this.atencedentesVacunaVPH = atencedentesVacunaVPH;
    }

    public String getRepetirEstudio() {
        return repetirEstudio;
    }

    public void setRepetirEstudio(String repetirEstudio) {
        this.repetirEstudio = repetirEstudio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getRFCcitologo() {
        return RFCcitologo;
    }

    public void setRFCcitologo(String RFCcitologo) {
        this.RFCcitologo = RFCcitologo;
    }

    public String getRevisionPatologo() {
        return revisionPatologo;
    }

    public void setRevisionPatologo(String revisionPatologo) {
        this.revisionPatologo = revisionPatologo;
    }

    public String getDiagnosticoPatologo() {
        return diagnosticoPatologo;
    }

    public void setDiagnosticoPatologo(String diagnosticoPatologo) {
        this.diagnosticoPatologo = diagnosticoPatologo;
    }

    public String getRFCpatologo() {
        return RFCpatologo;
    }

    public void setRFCpatologo(String RFCpatologo) {
        this.RFCpatologo = RFCpatologo;
    }

    public String getPruebaHibridacion() {
        return pruebaHibridacion;
    }

    public void setPruebaHibridacion(String pruebaHibridacion) {
        this.pruebaHibridacion = pruebaHibridacion;
    }

    public String getResultadoHibridacion() {
        return resultadoHibridacion;
    }

    public void setResultadoHibridacion(String resultadoHibridacion) {
        this.resultadoHibridacion = resultadoHibridacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
