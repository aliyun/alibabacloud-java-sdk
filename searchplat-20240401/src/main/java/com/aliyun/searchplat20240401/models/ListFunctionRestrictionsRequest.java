// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListFunctionRestrictionsRequest extends TeaModel {
    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>native</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("source")
    public String source;

    public static ListFunctionRestrictionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionRestrictionsRequest self = new ListFunctionRestrictionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionRestrictionsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListFunctionRestrictionsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListFunctionRestrictionsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
