// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceParamsRequest extends TeaModel {
    @NameInMap("combineParam")
    public java.util.Map<String, ?> combineParam;

    @NameInMap("dynamicParam")
    public java.util.Map<String, ?> dynamicParam;

    @NameInMap("kvpair")
    public java.util.Map<String, ?> kvpair;

    @NameInMap("params")
    public java.util.Map<String, ?> params;

    @NameInMap("staticParam")
    public java.util.Map<String, ?> staticParam;

    public static UpdateSqlInstanceParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceParamsRequest self = new UpdateSqlInstanceParamsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceParamsRequest setCombineParam(java.util.Map<String, ?> combineParam) {
        this.combineParam = combineParam;
        return this;
    }
    public java.util.Map<String, ?> getCombineParam() {
        return this.combineParam;
    }

    public UpdateSqlInstanceParamsRequest setDynamicParam(java.util.Map<String, ?> dynamicParam) {
        this.dynamicParam = dynamicParam;
        return this;
    }
    public java.util.Map<String, ?> getDynamicParam() {
        return this.dynamicParam;
    }

    public UpdateSqlInstanceParamsRequest setKvpair(java.util.Map<String, ?> kvpair) {
        this.kvpair = kvpair;
        return this;
    }
    public java.util.Map<String, ?> getKvpair() {
        return this.kvpair;
    }

    public UpdateSqlInstanceParamsRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public UpdateSqlInstanceParamsRequest setStaticParam(java.util.Map<String, ?> staticParam) {
        this.staticParam = staticParam;
        return this;
    }
    public java.util.Map<String, ?> getStaticParam() {
        return this.staticParam;
    }

}
