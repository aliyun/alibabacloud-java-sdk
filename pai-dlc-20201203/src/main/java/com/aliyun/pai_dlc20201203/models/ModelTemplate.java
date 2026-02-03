// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ModelTemplate extends TeaModel {
    @NameInMap("Collections")
    public String collections;

    @NameInMap("ModelName")
    public String modelName;

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
