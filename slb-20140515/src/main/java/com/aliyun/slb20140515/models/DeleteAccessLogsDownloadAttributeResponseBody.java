// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteAccessLogsDownloadAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessLogsDownloadAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessLogsDownloadAttributeResponseBody self = new DeleteAccessLogsDownloadAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessLogsDownloadAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
