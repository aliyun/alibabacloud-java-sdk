// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ExecuteSqlInstanceRequest extends TeaModel {
    @NameInMap("combineParam")
    public java.util.Map<String, ?> combineParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from test</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>vpc_hz_domain_1</p>
     */
    @NameInMap("domain")
    public String domain;

    @NameInMap("dynamicParam")
    public java.util.Map<String, ?> dynamicParam;

    @NameInMap("kvpair")
    public java.util.Map<String, ?> kvpair;

    @NameInMap("params")
    public java.util.Map<String, ?> params;

    @NameInMap("staticParam")
    public java.util.Map<String, ?> staticParam;

    public static ExecuteSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSqlInstanceRequest self = new ExecuteSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSqlInstanceRequest setCombineParam(java.util.Map<String, ?> combineParam) {
        this.combineParam = combineParam;
        return this;
    }
    public java.util.Map<String, ?> getCombineParam() {
        return this.combineParam;
    }

    public ExecuteSqlInstanceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecuteSqlInstanceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ExecuteSqlInstanceRequest setDynamicParam(java.util.Map<String, ?> dynamicParam) {
        this.dynamicParam = dynamicParam;
        return this;
    }
    public java.util.Map<String, ?> getDynamicParam() {
        return this.dynamicParam;
    }

    public ExecuteSqlInstanceRequest setKvpair(java.util.Map<String, ?> kvpair) {
        this.kvpair = kvpair;
        return this;
    }
    public java.util.Map<String, ?> getKvpair() {
        return this.kvpair;
    }

    public ExecuteSqlInstanceRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public ExecuteSqlInstanceRequest setStaticParam(java.util.Map<String, ?> staticParam) {
        this.staticParam = staticParam;
        return this;
    }
    public java.util.Map<String, ?> getStaticParam() {
        return this.staticParam;
    }

}
