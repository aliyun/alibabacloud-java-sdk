// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckSecurityEventIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdResponseBody self = new CheckSecurityEventIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckSecurityEventIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
