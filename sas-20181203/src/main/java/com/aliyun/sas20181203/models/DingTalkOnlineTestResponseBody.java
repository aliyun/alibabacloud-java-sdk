// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DingTalkOnlineTestResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2E96F605-1BE3-5954-83A5-AE96C617****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DingTalkOnlineTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DingTalkOnlineTestResponseBody self = new DingTalkOnlineTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DingTalkOnlineTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
