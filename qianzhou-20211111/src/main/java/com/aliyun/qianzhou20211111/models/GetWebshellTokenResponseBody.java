// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetWebshellTokenResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GetWebshellTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebshellTokenResponseBody self = new GetWebshellTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebshellTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
