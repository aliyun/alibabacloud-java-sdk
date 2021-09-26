// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateReportPushTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateReportPushTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReportPushTaskResponseBody self = new CreateReportPushTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReportPushTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
