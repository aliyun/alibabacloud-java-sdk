// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class Domain extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("functions")
    public java.util.Map<String, java.util.List<String>> functions;

    @NameInMap("name")
    public String name;

    public static Domain build(java.util.Map<String, ?> map) throws Exception {
        Domain self = new Domain();
        return TeaModel.build(map, self);
    }

    public Domain setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Domain setFunctions(java.util.Map<String, java.util.List<String>> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getFunctions() {
        return this.functions;
    }

    public Domain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
