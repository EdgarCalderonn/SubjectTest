package com.edgar.SubjectTest.shared.infrastructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperDto<I, O> {

	public I domDto(O o);

	public O dtoDom(I i);

	public default List<I> listDomDto(List<O> list) {
		return list.stream().map(o -> this.domDto(o)).collect(Collectors.toList());
	}

	public default List<O> listDtoDom(List<I> list) {
		return list.stream().map(this::dtoDom).collect(Collectors.toList());
	}

}
