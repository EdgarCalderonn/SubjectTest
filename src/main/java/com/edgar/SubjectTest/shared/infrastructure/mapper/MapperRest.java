package com.edgar.SubjectTest.shared.infrastructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperRest<I, O> {

	public I domRest(O o);

	public O restDom(I i);

	public default List<I> listDomRest(List<O> list) {
		return list.stream().map(o -> domRest(o)).collect(Collectors.toList());
	}

	public default List<O> listRestDom(List<I> list) {
		return list.stream().map(i -> restDom(i)).collect(Collectors.toList());
	}
}
