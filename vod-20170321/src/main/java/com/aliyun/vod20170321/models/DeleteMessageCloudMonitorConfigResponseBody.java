// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCloudMonitorConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMessageCloudMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCloudMonitorConfigResponseBody self = new DeleteMessageCloudMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCloudMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
