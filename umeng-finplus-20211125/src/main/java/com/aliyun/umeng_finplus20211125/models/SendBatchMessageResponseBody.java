// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class SendBatchMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SendBatchMessageResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SendBatchMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageResponseBody self = new SendBatchMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBatchMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendBatchMessageResponseBody setData(java.util.List<SendBatchMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SendBatchMessageResponseBodyData> getData() {
        return this.data;
    }

    public SendBatchMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendBatchMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SendBatchMessageResponseBodyData extends TeaModel {
        @NameInMap("mobile")
        public String mobile;

        @NameInMap("taskId")
        public String taskId;

        public static SendBatchMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendBatchMessageResponseBodyData self = new SendBatchMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendBatchMessageResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public SendBatchMessageResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
