// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Catalog extends TeaModel {
    @NameInMap("extensionConf")
    public java.util.Map<String, String> extensionConf;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    public static Catalog build(java.util.Map<String, ?> map) throws Exception {
        Catalog self = new Catalog();
        return TeaModel.build(map, self);
    }

    public Catalog setExtensionConf(java.util.Map<String, String> extensionConf) {
        this.extensionConf = extensionConf;
        return this;
    }
    public java.util.Map<String, String> getExtensionConf() {
        return this.extensionConf;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Catalog setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

}
