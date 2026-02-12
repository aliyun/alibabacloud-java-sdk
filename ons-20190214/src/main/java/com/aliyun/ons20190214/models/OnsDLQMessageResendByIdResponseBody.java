// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public OnsDLQMessageResendByIdResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D94CC769-4DC3-4690-A868-9D0631B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsDLQMessageResendByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdResponseBody self = new OnsDLQMessageResendByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdResponseBody setData(OnsDLQMessageResendByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsDLQMessageResendByIdResponseBodyData getData() {
        return this.data;
    }

    public OnsDLQMessageResendByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
