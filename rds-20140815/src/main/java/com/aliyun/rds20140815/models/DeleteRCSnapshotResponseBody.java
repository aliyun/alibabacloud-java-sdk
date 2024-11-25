// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCSnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BE834C8-3C25-5AF8-BE3E-C8A690602A7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCSnapshotResponseBody self = new DeleteRCSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
