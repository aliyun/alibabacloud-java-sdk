// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class InvokeMotorModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InvokeMotorModelResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InvokeMotorModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeMotorModelResponseBody self = new InvokeMotorModelResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeMotorModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeMotorModelResponseBody setData(InvokeMotorModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeMotorModelResponseBodyData getData() {
        return this.data;
    }

    public InvokeMotorModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeMotorModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvokeMotorModelResponseBodyData extends TeaModel {
        @NameInMap("StructList")
        public String structList;

        public static InvokeMotorModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeMotorModelResponseBodyData self = new InvokeMotorModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeMotorModelResponseBodyData setStructList(String structList) {
            this.structList = structList;
            return this;
        }
        public String getStructList() {
            return this.structList;
        }

    }

}
