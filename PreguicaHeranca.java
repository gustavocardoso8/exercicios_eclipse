����   < P  Familia41/PreguicaHeranca  Familia41/AnimaisHeranca subirArvore Z <init> (Ljava/lang/String;IZ)V Code
     (Ljava/lang/String;I)V	     LineNumberTable LocalVariableTable this LFamilia41/PreguicaHeranca; nome Ljava/lang/String; idade I isSubirArvore ()Z setSubirArvore (Z)V imprimirMovimento ()V
    	   " ! java/lang/System # $ out Ljava/io/PrintStream; & !Está sempre no alto das árvores
 ( * ) java/io/PrintStream + , println (Ljava/lang/String;)V StackMapTable imprimirInfo 0 java/lang/StringBuilder 2 
A Preguça: 
Nome: 
 / 4  ,
  6 7 8 getNome ()Ljava/lang/String;
 / : ; < append -(Ljava/lang/String;)Ljava/lang/StringBuilder; > 
Idade: 
  @ A B getIdade ()I
 / D ; E (I)Ljava/lang/StringBuilder;
 / G H 8 toString getSom K Som: 
  M I 8 
SourceFile PreguicaHeranca.java !                	   \     *+� 
*� �           	  
      *                               	   /     *� �                            	   >     *� �       
                             	   K     *� � � %� '�                            -      .   	   T     &� � /Y1� 3*� 5� 9=� 9*� ?� C� F� '�       
     %         &      I 8  	   >     � /YJ� 3*� L� 9� F�           !              N    O