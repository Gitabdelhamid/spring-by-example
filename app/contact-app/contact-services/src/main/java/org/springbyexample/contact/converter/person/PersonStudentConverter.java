/*
 * Copyright 2007-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springbyexample.contact.converter.person;

import org.dozer.Mapper;
import org.springbyexample.converter.AbstractMapperListConverter;
import org.springbyexample.schema.beans.person.Person;
import org.springbyexample.schema.beans.person.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Converts between a <code>Person</code> and a <code>Student</code> converter.
 *
 * @author David Winterfeldt
 */
@Component
public class PersonStudentConverter extends AbstractMapperListConverter<Person, Student> {

    @Autowired
    public PersonStudentConverter(Mapper mapper) {
        super(mapper, Person.class, Student.class);
    }

}