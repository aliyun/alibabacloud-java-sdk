// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionCurrentVersionRequest extends TeaModel {
    /**
     * <p>The category. By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The industry. By default, this parameter is left empty, which indicates General-purpose Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>ecommerce</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li>PAAS. This is the default value.</li>
     * <li>SAAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAAS</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The type of the model. The following features correspond to different model types:</p>
     * <ul>
     * <li>CTR model: tf_checkpoint</li>
     * <li>Popularity model: pop</li>
     * <li>Category model: offline_inference</li>
     * <li>Hotword model: offline_inference</li>
     * <li>Shading model: offline_inference</li>
     * <li>Drop-down suggestion model: offline_inference</li>
     * <li>Word segmentation model: text</li>
     * <li>Word weight model: tf_checkpoint</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf_checkpoint</p>
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
