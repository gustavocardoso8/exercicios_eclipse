����   < P  Familia41/CavaloHeranca  Familia41/AnimaisHeranca correr Z <init> (Ljava/lang/String;IZ)V Code
     (Ljava/lang/String;I)V	     LineNumberTable LocalVariableTable this LFamilia41/CavaloHeranca; nome Ljava/lang/String; idade I isCorrer ()Z 	setCorrer (Z)V imprimirMovimento ()V
    	   " ! java/lang/System # $ out Ljava/io/PrintStream; & É muito rápido, corre demais
 ( * ) java/io/PrintStream + , println (Ljava/lang/String;)V StackMapTable imprimirInfo 0 java/lang/StringBuilder 2 
Cavalo: 
Nome: 
 / 4  ,
  6 7 8 getNome ()Ljava/lang/String;
 / : ; < append -(Ljava/lang/String;)Ljava/lang/StringBuilder; > 
Idade: 
  @ A B getIdade ()I
 / D ; E (I)Ljava/lang/StringBuilder;
 / G H 8 toString getSom K Som: 
  M I 8 
SourceFile CavaloHeranca.java !                	   \     *+� 
*� �           	  
      *                               	   /     *� �                            	   >     *� �       
                             	   K     *� � � %� '�                            -      .   	   T     &� � /Y1� 3*� 5� 9=� 9*� ?� C� F� '�       
     %         &      I 8  	   >     � /YJ� 3*� L� 9� F�           !              N    O