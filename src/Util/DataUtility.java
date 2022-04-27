package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public abstract class DataUtility {

    private static SimpleDateFormat formatoPadrao = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Método que transforma um String em objeto do tipo Date
     *
     * @param DataInformada
     * @return Date
     */
    public static Date transformarStringEmData(String DataInformada) {
        Date dataTransformada = null;
        try {
            dataTransformada = formatoPadrao.parse(DataInformada);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return dataTransformada;
    }

    /**
     * Verifica se a data informada é hoje
     *
     * @param dataInformada
     * @return boolean
     */
    public static boolean iSDataHoje(Date dataInformada) {

        return dataInformada.equals(new Date());

    }

    /**
     * Verifica se a data informada é maior que hoje
     *
     * @param dataInformada
     * @return boolean
     */
    public static boolean iSDataInformadaMaiorQueHoje(Date dataInformada) {

        return dataInformada.after(new Date());

    }

    /**
     * Verifica se a data informada é menor que hoje
     *
     * @param dataInformada
     * @return boolean
     */
    public static boolean iSDataInformadaMenorQueHoje(Date dataInformada) {

        return dataInformada.before(new Date());

    }

    /**
     * Método para formatar uma data no formato escolhido
     *
     * @param dataInformada
     * @return String
     */
    public static String formatarDataComPadrao(Date dataInformada, String padrao) {

        String dataFormatada = null;

        formatoPadrao.applyPattern(padrao);
        dataFormatada = formatoPadrao.format(dataInformada);
        formatoPadrao.applyPattern("dd/MM/yyyy");

        return dataFormatada;

    }

    /**
     * Método para formatar uma data no formato padrao dd/MM/yyyy
     *
     * @param dataInformada
     * @return String
     */
    public static String formatarDataComPadraoEscolhido(Date dataInformada) {
        if (dataInformada == null) {
            return null;
        }
        return formatoPadrao.format(dataInformada);
    }

    /**
     * Método que transforma um objeto do tipo Date em um objeto LocalDate
     *
     * @param dataInformada
     * @return LocalDate
     *
     */
    public static LocalDate dateParaLocalDate(Date dataInformada) {
        return dataInformada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Método para calcular a idade
     *
     * @param dataNascimento
     * @return int
     *
     */
    public static int calcularIdade(Date dataNascimento) {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dateParaLocalDate(dataNascimento), hoje);
        return periodo.getYears();
    }

    /**
     * Retorna o dia da semana que vai cair a data
     *
     * @param dataInformada
     * @return Integer Calendar.DAY_OF_WEEK
     */
    public static Integer retornarDiaDaSemana(Date dataInformada) {

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataInformada);
        return calendario.get(Calendar.DAY_OF_WEEK);

    }

    /**
     * Verifica se a data é Sexta, Sábado ou Domingo.
     *
     * @param dataInformada
     * @return Integer Calendar.DAY_OF_WEEK
     */
    public static boolean isSextaSabadoDomingo(Date dataInformada) {
        Integer diaSemana = retornarDiaDaSemana(dataInformada);
        if (diaSemana == Calendar.FRIDAY || diaSemana == Calendar.SATURDAY
                || diaSemana == Calendar.SUNDAY) {
            return true;
        }
        return false;
    }
}
