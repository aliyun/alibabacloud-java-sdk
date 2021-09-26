// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigInstanceWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhiteListResponseBody self = new ConfigInstanceWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
