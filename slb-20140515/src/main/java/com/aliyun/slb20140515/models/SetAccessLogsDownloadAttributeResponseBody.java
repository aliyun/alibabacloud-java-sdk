// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessLogsDownloadAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessLogsDownloadAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessLogsDownloadAttributeResponseBody self = new SetAccessLogsDownloadAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessLogsDownloadAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
