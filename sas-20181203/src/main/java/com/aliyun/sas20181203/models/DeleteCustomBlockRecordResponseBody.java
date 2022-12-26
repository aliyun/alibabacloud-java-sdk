// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomBlockRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomBlockRecordResponseBody self = new DeleteCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
