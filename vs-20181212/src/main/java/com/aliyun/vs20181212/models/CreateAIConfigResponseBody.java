// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateAIConfigResponseBody extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIConfigResponseBody self = new CreateAIConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIConfigResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public CreateAIConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
