// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ModelConfig extends TeaModel {
    @NameInMap("ModelName")
    public String modelName;

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
