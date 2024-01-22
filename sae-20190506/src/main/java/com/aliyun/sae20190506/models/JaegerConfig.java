// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class JaegerConfig extends TeaModel {
    @NameInMap("endpoint")
    public String endpoint;

    public static JaegerConfig build(java.util.Map<String, ?> map) throws Exception {
        JaegerConfig self = new JaegerConfig();
        return TeaModel.build(map, self);
    }

    public JaegerConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
