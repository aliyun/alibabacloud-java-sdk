// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeResponseBody self = new RestartDBNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
