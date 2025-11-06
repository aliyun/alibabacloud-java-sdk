// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcCancelSipInviteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EB3C3C75-74D5-5F01-9F3C-9974261BAED4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RtcCancelSipInviteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RtcCancelSipInviteResponseBody self = new RtcCancelSipInviteResponseBody();
        return TeaModel.build(map, self);
    }

    public RtcCancelSipInviteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
