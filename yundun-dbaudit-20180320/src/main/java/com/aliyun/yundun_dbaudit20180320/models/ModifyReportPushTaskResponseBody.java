// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyReportPushTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReportPushTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReportPushTaskResponseBody self = new ModifyReportPushTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReportPushTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
