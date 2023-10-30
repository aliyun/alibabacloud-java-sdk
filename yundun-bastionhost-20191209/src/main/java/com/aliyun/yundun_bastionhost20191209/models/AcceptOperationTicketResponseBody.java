// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptOperationTicketResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptOperationTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptOperationTicketResponseBody self = new AcceptOperationTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptOperationTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
