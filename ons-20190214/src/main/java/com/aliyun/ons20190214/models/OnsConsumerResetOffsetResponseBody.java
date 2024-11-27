// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerResetOffsetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D52C68F8-EC5D-4294-BFFF-1A6A25AF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerResetOffsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerResetOffsetResponseBody self = new OnsConsumerResetOffsetResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerResetOffsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
