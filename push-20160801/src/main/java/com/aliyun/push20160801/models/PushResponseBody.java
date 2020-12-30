// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MessageId")
    public String messageId;

    public static PushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushResponseBody self = new PushResponseBody();
        return TeaModel.build(map, self);
    }

    public PushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
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
