// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleProxyResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultJson")
    public String resultJson;

    public static ConsoleProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConsoleProxyResponseBody self = new ConsoleProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public ConsoleProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsoleProxyResponseBody setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
