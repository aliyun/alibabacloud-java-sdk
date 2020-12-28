// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsWarnDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnDeleteResponseBody self = new OnsWarnDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsWarnDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
