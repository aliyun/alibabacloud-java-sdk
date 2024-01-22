// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TracingConfig extends TeaModel {
    @NameInMap("jaegerConfig")
    public JaegerConfig jaegerConfig;

    @NameInMap("params")
    public Object params;

    @NameInMap("type")
    public String type;

    public static TracingConfig build(java.util.Map<String, ?> map) throws Exception {
        TracingConfig self = new TracingConfig();
        return TeaModel.build(map, self);
    }

    public TracingConfig setJaegerConfig(JaegerConfig jaegerConfig) {
        this.jaegerConfig = jaegerConfig;
        return this;
    }
    public JaegerConfig getJaegerConfig() {
        return this.jaegerConfig;
    }

    public TracingConfig setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public TracingConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
