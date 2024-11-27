// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateOperationTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OperationTicketId")
    public String operationTicketId;

    /**
     * <strong>example:</strong>
     * <p>0ECCC399-4D35-48A7-8379-5C6180E66235</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOperationTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOperationTicketResponseBody self = new CreateOperationTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOperationTicketResponseBody setOperationTicketId(String operationTicketId) {
        this.operationTicketId = operationTicketId;
        return this;
    }
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    public CreateOperationTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
