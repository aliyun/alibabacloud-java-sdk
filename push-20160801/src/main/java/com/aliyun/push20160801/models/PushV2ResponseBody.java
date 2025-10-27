// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11747540****88320</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>159E4422-6624-****-8943-DFD98D34858C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushV2ResponseBody self = new PushV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public PushV2ResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
