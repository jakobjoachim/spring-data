/*
 * DISCLAIMER
 *
 * Copyright 2017 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.springframework.core.mapping;

import java.util.Optional;

import com.arangodb.springframework.annotation.*;
import org.springframework.data.mapping.PersistentProperty;

/**
 * @author Mark Vollmary
 *
 */
public interface ArangoPersistentProperty extends PersistentProperty<ArangoPersistentProperty> {

	String getFieldName();

	@Override
	ArangoPersistentEntity<?> getOwner();

	boolean isArangoIdProperty();

	boolean isRevProperty();

	Optional<Ref> getRef();

	Optional<Relations> getRelations();

	Optional<From> getFrom();

	Optional<To> getTo();

    Optional<ComputedValueField> getComputedValue();

	Optional<PersistentIndexed> getPersistentIndexed();

	Optional<GeoIndexed> getGeoIndexed();

	@Deprecated
	Optional<FulltextIndexed> getFulltextIndexed();

	Optional<TtlIndexed> getTtlIndexed();
}
