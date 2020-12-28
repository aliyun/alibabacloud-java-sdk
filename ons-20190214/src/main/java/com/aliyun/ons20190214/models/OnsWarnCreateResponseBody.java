// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnCreateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsWarnCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnCreateResponseBody self = new OnsWarnCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsWarnCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
