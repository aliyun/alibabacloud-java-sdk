// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsDLQMessageResendByIdResponseBodyData data;

    public static OnsDLQMessageResendByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdResponseBody self = new OnsDLQMessageResendByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsDLQMessageResendByIdResponseBody setData(OnsDLQMessageResendByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsDLQMessageResendByIdResponseBodyData getData() {
        return this.data;
    }

    public static class OnsDLQMessageResendByIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public java.util.List<String> msgId;

        public static OnsDLQMessageResendByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessageResendByIdResponseBodyData self = new OnsDLQMessageResendByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessageResendByIdResponseBodyData setMsgId(java.util.List<String> msgId) {
            this.msgId = msgId;
            return this;
        }
        public java.util.List<String> getMsgId() {
            return this.msgId;
        }

    }

}
