// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionCurrentVersionRequest extends TeaModel {
    /**
     * <p>The category. By default, this parameter is left empty.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The industry. By default, this parameter is left empty, which indicates General-purpose Edition.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   PAAS. This is the default value.</p>
     * <p>*   SAAS.</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The type of the model. The following features correspond to different model types:</p>
     * <br>
     * <p>*   CTR model: tf_checkpoint</p>
     * <p>*   Popularity model: pop</p>
     * <p>*   Category model: offline_inference</p>
     * <p>*   Hotword model: offline_inference</p>
     * <p>*   Shading model: offline_inference</p>
     * <p>*   Drop-down suggestion model: offline_inference</p>
     * <p>*   Word segmentation model: text</p>
     * <p>*   Word weight model: tf_checkpoint</p>
     */
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
