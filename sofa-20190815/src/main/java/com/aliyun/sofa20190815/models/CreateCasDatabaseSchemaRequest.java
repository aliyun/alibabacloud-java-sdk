// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseSchemaRequest extends TeaModel {
    @NameInMap("CharSet")
    public String charSet;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("GrantMap")
    public java.util.List<CreateCasDatabaseSchemaRequestGrantMap> grantMap;

    public static CreateCasDatabaseSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseSchemaRequest self = new CreateCasDatabaseSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseSchemaRequest setCharSet(String charSet) {
        this.charSet = charSet;
        return this;
    }
    public String getCharSet() {
        return this.charSet;
    }

    public CreateCasDatabaseSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCasDatabaseSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCasDatabaseSchemaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasDatabaseSchemaRequest setGrantMap(java.util.List<CreateCasDatabaseSchemaRequestGrantMap> grantMap) {
        this.grantMap = grantMap;
        return this;
    }
    public java.util.List<CreateCasDatabaseSchemaRequestGrantMap> getGrantMap() {
        return this.grantMap;
    }

    public static class CreateCasDatabaseSchemaRequestGrantMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateCasDatabaseSchemaRequestGrantMap build(java.util.Map<String, ?> map) throws Exception {
            CreateCasDatabaseSchemaRequestGrantMap self = new CreateCasDatabaseSchemaRequestGrantMap();
            return TeaModel.build(map, self);
        }

        public CreateCasDatabaseSchemaRequestGrantMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCasDatabaseSchemaRequestGrantMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
