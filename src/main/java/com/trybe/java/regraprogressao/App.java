package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Calcula a média de aprovação com base nas notas e pesos das atividades. Solicita ao usuário a
   * quantidade de atividades a serem cadastradas, nome de cada atividade, peso e nota obtida para
   * cada atividade. Em seguida, calcula a média ponderada com base nos pesos e exibe uma mensagem
   * informando se o aluno foi aprovado ou não.
   */

  public void ApprovalMedia() {

    float dividend = 0f;
    float divider = 0f;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    short numberOfActivities = scanner.nextShort();

    for (int i = 1; i <= numberOfActivities; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      scanner.nextLine();
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      short activityWeight = scanner.nextShort();

      System.out.println("Digite a nota obtida para Projeto " + activityName + ":");
      short projectNote = scanner.nextShort();

      dividend += activityWeight * projectNote;
      divider += activityWeight;
    }
    scanner.close();

    float finalMedia = dividend / divider;

    if (finalMedia >= 85) {
      System.out.println("Parabéns! Você alcançou " + finalMedia + "%!"
          + " E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out
          .println("Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalMedia + "%"
              + ", você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    App app = new App();
    app.ApprovalMedia();
  }
}
