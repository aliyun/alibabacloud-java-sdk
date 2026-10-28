// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ModelConfig extends TeaModel {
    /**
     * <p>The name of the output model. The output model of a joint training job is registered in the Models section of AI Asset Management under this name.</p>
     * 
     * <strong>example:</strong>
     * <p>model_a</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model template configuration. This configuration is required if you want to deploy the output model to Elastic Algorithm Service (EAS) with one click.</p>
     */
    @NameInMap("ModelTemplate")
    public ModelTemplate modelTemplate;

    public static ModelConfig build(java.util.Map<String, ?> map) throws Exception {
        ModelConfig self = new ModelConfig();
        return TeaModel.build(map, self);
    }

    public ModelConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelConfig setModelTemplate(ModelTemplate modelTemplate) {
        this.modelTemplate = modelTemplate;
        return this;
    }
    public ModelTemplate getModelTemplate() {
        return this.modelTemplate;
    }

}
