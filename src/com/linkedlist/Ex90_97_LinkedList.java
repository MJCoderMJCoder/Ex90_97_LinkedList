package com.linkedlist;

import java.util.LinkedList;

public class Ex90_97_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("����"); //����������Ԫ��
		list.add("����");
		list.add("");
		list.add("����");
		list.add("����");
		int size = list.size(); //��ȡ�����еĽڵ����
		System.out.println("�����й���" + size + "��Ԫ�أ��ֱ�Ϊ��");
		for(int i = 0; i < size; i++) {
			if (list.get(i) == "") {
				list.set(i, "�����"); //�������еĿ��ַ��滻Ϊ������ӡ�
			}
		}
		System.out.println(list); //��������е�Ԫ��
	}
}
