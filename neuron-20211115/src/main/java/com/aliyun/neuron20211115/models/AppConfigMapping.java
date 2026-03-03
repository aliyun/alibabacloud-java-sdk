// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AppConfigMapping extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>list</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>page_eo4r5y6a</p>
     */
    @NameInMap("modelId")
    public String modelId;

    public static AppConfigMapping build(java.util.Map<String, ?> map) throws Exception {
        AppConfigMapping self = new AppConfigMapping();
        return TeaModel.build(map, self);
    }

    public AppConfigMapping setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AppConfigMapping setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
