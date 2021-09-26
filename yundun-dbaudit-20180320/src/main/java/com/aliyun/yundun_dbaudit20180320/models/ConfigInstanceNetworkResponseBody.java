// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ConfigInstanceNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigInstanceNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceNetworkResponseBody self = new ConfigInstanceNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
