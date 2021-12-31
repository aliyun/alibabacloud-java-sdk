// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionCurrentVersionRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("domain")
    public String domain;

    @NameInMap("functionType")
    public String functionType;

    @NameInMap("modelType")
    public String modelType;

    public static GetFunctionCurrentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCurrentVersionRequest self = new GetFunctionCurrentVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionCurrentVersionRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetFunctionCurrentVersionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetFunctionCurrentVersionRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public GetFunctionCurrentVersionRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

}
