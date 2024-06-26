// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class MassPushResponseBody extends TeaModel {
    @NameInMap("MessageIds")
    public MassPushResponseBodyMessageIds messageIds;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MassPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MassPushResponseBody self = new MassPushResponseBody();
        return TeaModel.build(map, self);
    }

    public MassPushResponseBody setMessageIds(MassPushResponseBodyMessageIds messageIds) {
        this.messageIds = messageIds;
        return this;
    }
    public MassPushResponseBodyMessageIds getMessageIds() {
        return this.messageIds;
    }

    public MassPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MassPushResponseBodyMessageIds extends TeaModel {
        @NameInMap("MessageId")
        public java.util.List<String> messageId;

        public static MassPushResponseBodyMessageIds build(java.util.Map<String, ?> map) throws Exception {
            MassPushResponseBodyMessageIds self = new MassPushResponseBodyMessageIds();
            return TeaModel.build(map, self);
        }

        public MassPushResponseBodyMessageIds setMessageId(java.util.List<String> messageId) {
            this.messageId = messageId;
            return this;
        }
        public java.util.List<String> getMessageId() {
            return this.messageId;
        }

    }

}
