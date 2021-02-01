package com.coderscampus.olaf.assignment07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		sut.add(1);
		Integer value = sut.get(0);

		assertEquals(1, value);
	}

	@Test
	void should_add_many_items_to_list() {

		long x = 1000000;
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < x; i++) {
			sut.add(i);
		}

		for (int i = 0; i < x; i++) {
			assertEquals(i, sut.get(i));
		}
	}

	@Test
	void should_insert_item_at_last_index_into_list() {

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 100; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() + 1;
		sut.add(99, 1000);

		assertEquals(1000, sut.get(99));
		assertEquals(sut.getSize(), expectedSize);

	}

	@Test
	void should_insert_item_at_first_index_into_list() {

		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 100; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() + 1;
		sut.add(0, 1000);

		assertEquals(1000, sut.get(0));
		assertEquals(sut.getSize(), expectedSize);

	}

	@Test
	void should_remove_item_at_first_index_from_list() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 24; i++) {
			sut.add(i);
		}

		Integer nextItem = sut.get(1);
		Integer expectedSize = sut.getSize() - 1;

		sut.remove(0);

		boolean nullElement = false;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				nullElement = true;
		}

		assertEquals(sut.get(0), nextItem);
		assertEquals(sut.getSize(), expectedSize);
		assertEquals(false, nullElement);
	}

	@Test
	void should_remove_item_at_mid_index_from_list() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 24; i++) {
			sut.add(i);
		}

		Integer nextItem = sut.get(5 + 1);
		Integer expectedSize = sut.getSize() - 1;

		sut.remove(5);

		boolean nullElement = false;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				nullElement = true;
		}

		assertEquals(sut.get(5), nextItem);
		assertEquals(sut.getSize(), expectedSize);
		assertEquals(false, nullElement);
	}

	@Test
	void should_remove_item_at_last_index_from_list() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 100; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(99);

		boolean nullElement = false;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				nullElement = true;
		}

		assertEquals(sut.getSize(), expectedSize);
		assertEquals(false, nullElement);
	}

	@Test
	void should_remove_item_at_first_index_from_full_list() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(0);

		boolean nullElement = false;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				nullElement = true;
		}

		assertEquals(sut.getSize(), expectedSize);
		assertEquals(false, nullElement);
	}

	@Test
	void should_remove_item_at_last_index_from_full_list() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}

		Integer expectedSize = sut.getSize() - 1;

		sut.remove(9);

		boolean nullElement = false;
		for (int i = 0; i < sut.getSize(); i++) {
			if (sut.get(i) == null)
				nullElement = true;
		}

		assertEquals(sut.getSize(), expectedSize);
		assertEquals(false, nullElement);
	}

}
