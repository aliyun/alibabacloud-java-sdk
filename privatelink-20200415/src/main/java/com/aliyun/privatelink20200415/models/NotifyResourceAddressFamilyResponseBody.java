// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class NotifyResourceAddressFamilyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static NotifyResourceAddressFamilyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyResourceAddressFamilyResponseBody self = new NotifyResourceAddressFamilyResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyResourceAddressFamilyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
