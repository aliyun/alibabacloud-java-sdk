// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateTrafficControlTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskConfigResponseBody self = new GenerateTrafficControlTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GenerateTrafficControlTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
