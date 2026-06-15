// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushV2ResponseBody extends TeaModel {
    /**
     * <p>List of message IDs.</p>
     */
    @NameInMap("MessageIds")
    public java.util.List<String> messageIds;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>159E4422-6624-****-8943-DFD98D34858C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MassPushV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MassPushV2ResponseBody self = new MassPushV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public MassPushV2ResponseBody setMessageIds(java.util.List<String> messageIds) {
        this.messageIds = messageIds;
        return this;
    }
    public java.util.List<String> getMessageIds() {
        return this.messageIds;
    }

    public MassPushV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
