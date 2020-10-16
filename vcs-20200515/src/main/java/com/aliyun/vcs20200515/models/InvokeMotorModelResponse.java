// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class InvokeMotorModelResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public InvokeMotorModelResponseData data;

    public static InvokeMotorModelResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeMotorModelResponse self = new InvokeMotorModelResponse();
        return TeaModel.build(map, self);
    }

    public InvokeMotorModelResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeMotorModelResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeMotorModelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeMotorModelResponse setData(InvokeMotorModelResponseData data) {
        this.data = data;
        return this;
    }
    public InvokeMotorModelResponseData getData() {
        return this.data;
    }

    public static class InvokeMotorModelResponseData extends TeaModel {
        @NameInMap("StructList")
        @Validation(required = true)
        public String structList;

        public static InvokeMotorModelResponseData build(java.util.Map<String, ?> map) throws Exception {
            InvokeMotorModelResponseData self = new InvokeMotorModelResponseData();
            return TeaModel.build(map, self);
        }

        public InvokeMotorModelResponseData setStructList(String structList) {
            this.structList = structList;
            return this;
        }
        public String getStructList() {
            return this.structList;
        }

    }

}
