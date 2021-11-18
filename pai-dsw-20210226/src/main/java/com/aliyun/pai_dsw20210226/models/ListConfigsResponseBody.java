// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<Config> configs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setConfigs(java.util.List<Config> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<Config> getConfigs() {
        return this.configs;
    }

    public ListConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
