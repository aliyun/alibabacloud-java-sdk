// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectOperationTicketResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RejectOperationTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectOperationTicketResponseBody self = new RejectOperationTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectOperationTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
