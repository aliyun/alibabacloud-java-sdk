// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelMessageContactUpdateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelMessageContactUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMessageContactUpdateResponseBody self = new CancelMessageContactUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMessageContactUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
