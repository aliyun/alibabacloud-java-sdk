// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicUpdateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>81979ADA-4A78-4F64-9DEC-5700446D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicUpdateResponseBody self = new OnsTopicUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
