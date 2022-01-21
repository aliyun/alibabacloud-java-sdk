// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class TransferResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TransferResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TransferResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferResourceResponseBody self = new TransferResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TransferResourceResponseBody setData(TransferResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TransferResourceResponseBodyData getData() {
        return this.data;
    }

    public TransferResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TransferResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransferResourceResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ProcEnv")
        public String procEnv;

        public static TransferResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransferResourceResponseBodyData self = new TransferResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransferResourceResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TransferResourceResponseBodyData setProcEnv(String procEnv) {
            this.procEnv = procEnv;
            return this;
        }
        public String getProcEnv() {
            return this.procEnv;
        }

    }

}
