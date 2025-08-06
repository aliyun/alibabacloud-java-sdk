// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCloudMonitorConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetMessageCloudMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCloudMonitorConfigResponseBody self = new SetMessageCloudMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMessageCloudMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
