// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DataSourcePluginsValue extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("fromFields")
    public String fromFields;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    public static DataSourcePluginsValue build(java.util.Map<String, ?> map) throws Exception {
        DataSourcePluginsValue self = new DataSourcePluginsValue();
        return TeaModel.build(map, self);
    }

    public DataSourcePluginsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataSourcePluginsValue setFromFields(String fromFields) {
        this.fromFields = fromFields;
        return this;
    }
    public String getFromFields() {
        return this.fromFields;
    }

    public DataSourcePluginsValue setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

}
