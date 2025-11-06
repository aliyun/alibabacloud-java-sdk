// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipInviteMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RtcSipInviteMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RtcSipInviteMemberResponseBody self = new RtcSipInviteMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public RtcSipInviteMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
