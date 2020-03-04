package com.tunatillera.web.util.mapper;

public interface EntityModelMapper<Entity, Model> {
	Model entityToModel(Entity entity);
	Entity modelToEntity(Model model);
}
