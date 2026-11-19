// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105.models;

import com.aliyun.tea.*;

public class StreamVoiceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A3677B53-C3AE-5F04-953E-AA332CABB87B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StreamVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StreamVoiceResponseBody self = new StreamVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StreamVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
