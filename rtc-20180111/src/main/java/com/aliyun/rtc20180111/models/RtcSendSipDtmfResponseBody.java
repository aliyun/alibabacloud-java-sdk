// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSendSipDtmfResponseBody extends TeaModel {
    /**
     * <p>The request ID. This is the unique identifier returned for each API call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RtcSendSipDtmfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RtcSendSipDtmfResponseBody self = new RtcSendSipDtmfResponseBody();
        return TeaModel.build(map, self);
    }

    public RtcSendSipDtmfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
