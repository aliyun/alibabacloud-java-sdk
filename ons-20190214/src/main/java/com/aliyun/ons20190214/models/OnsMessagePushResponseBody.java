// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePushResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B8EDC90D-F726-4B9E-8BEF-F0DD25EC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsMessagePushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePushResponseBody self = new OnsMessagePushResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessagePushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
