// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class QueryProcessor extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("category")
    public String category;

    @NameInMap("domain")
    public String domain;

    @NameInMap("indexes")
    public java.util.List<String> indexes;

    @NameInMap("name")
    public String name;

    @NameInMap("processors")
    public java.util.List<java.util.Map<String, ?>> processors;

    public static QueryProcessor build(java.util.Map<String, ?> map) throws Exception {
        QueryProcessor self = new QueryProcessor();
        return TeaModel.build(map, self);
    }

    public QueryProcessor setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public QueryProcessor setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryProcessor setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public QueryProcessor setIndexes(java.util.List<String> indexes) {
        this.indexes = indexes;
        return this;
    }
    public java.util.List<String> getIndexes() {
        return this.indexes;
    }

    public QueryProcessor setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryProcessor setProcessors(java.util.List<java.util.Map<String, ?>> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

}
