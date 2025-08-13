// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelIsUsingRequest extends TeaModel {
    /**
     * <p>Model code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ebgdsa</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>Model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27269</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v1</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Model status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModelIsUsingRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelIsUsingRequest self = new ModelIsUsingRequest();
        return TeaModel.build(map, self);
    }

    public ModelIsUsingRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ModelIsUsingRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ModelIsUsingRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelIsUsingRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModelIsUsingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
