package com.practice.logics;

import java.util.LinkedList;

import com.practice.logics.diff_match_patch.Diff;

public class DifferenceTest {
	public static void main(String[] args) {
		diff_match_patch diff = new diff_match_patch();
		LinkedList<Diff> diffList = diff.diff_main("hi There","hi khere");
		diffList.stream().forEach(d->{
			System.out.println(d);
		});
	}
}
