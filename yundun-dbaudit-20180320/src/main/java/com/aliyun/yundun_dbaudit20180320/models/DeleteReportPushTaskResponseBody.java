// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteReportPushTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReportPushTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportPushTaskResponseBody self = new DeleteReportPushTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReportPushTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
