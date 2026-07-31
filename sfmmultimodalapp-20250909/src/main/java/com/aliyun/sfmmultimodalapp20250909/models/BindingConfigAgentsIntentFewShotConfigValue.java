// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class BindingConfigAgentsIntentFewShotConfigValue extends TeaModel {
    @NameInMap("Query")
    public String query;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    public static BindingConfigAgentsIntentFewShotConfigValue build(java.util.Map<String, ?> map) throws Exception {
        BindingConfigAgentsIntentFewShotConfigValue self = new BindingConfigAgentsIntentFewShotConfigValue();
        return TeaModel.build(map, self);
    }

    public BindingConfigAgentsIntentFewShotConfigValue setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public BindingConfigAgentsIntentFewShotConfigValue setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
