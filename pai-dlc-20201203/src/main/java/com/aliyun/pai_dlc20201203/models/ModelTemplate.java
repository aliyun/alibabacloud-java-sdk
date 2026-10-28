// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ModelTemplate extends TeaModel {
    /**
     * <p>The collection where the model template resides. Default value: QuickStartTemplate.</p>
     * 
     * <strong>example:</strong>
     * <p>QuickStartTemplate</p>
     */
    @NameInMap("Collections")
    public String collections;

    /**
     * <p>The name of the model template.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-VL-32B-Instruct-PAI_template</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The provider of the model template. Default value: pai, which indicates that the model template is officially provided by PAI.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    public static ModelTemplate build(java.util.Map<String, ?> map) throws Exception {
        ModelTemplate self = new ModelTemplate();
        return TeaModel.build(map, self);
    }

    public ModelTemplate setCollections(String collections) {
        this.collections = collections;
        return this;
    }
    public String getCollections() {
        return this.collections;
    }

    public ModelTemplate setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelTemplate setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
