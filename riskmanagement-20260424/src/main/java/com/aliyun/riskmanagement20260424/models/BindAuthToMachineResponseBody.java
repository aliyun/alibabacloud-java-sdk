// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindAuthToMachineResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BindAuthToMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineResponseBody self = new BindAuthToMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAuthToMachineResponseBody setData(BindAuthToMachineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAuthToMachineResponseBodyData getData() {
        return this.data;
    }

    public BindAuthToMachineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAuthToMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAuthToMachineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAuthToMachineResponseBodyDataBody extends TeaModel {
        @NameInMap("BindCount")
        public Integer bindCount;

        @NameInMap("InsufficientCoreCount")
        public Integer insufficientCoreCount;

        @NameInMap("InsufficientEcsCount")
        public Integer insufficientEcsCount;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultCode")
        public Integer resultCode;

        @NameInMap("UnBindCount")
        public Integer unBindCount;

        public static BindAuthToMachineResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            BindAuthToMachineResponseBodyDataBody self = new BindAuthToMachineResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public BindAuthToMachineResponseBodyDataBody setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Integer getBindCount() {
            return this.bindCount;
        }

        public BindAuthToMachineResponseBodyDataBody setInsufficientCoreCount(Integer insufficientCoreCount) {
            this.insufficientCoreCount = insufficientCoreCount;
            return this;
        }
        public Integer getInsufficientCoreCount() {
            return this.insufficientCoreCount;
        }

        public BindAuthToMachineResponseBodyDataBody setInsufficientEcsCount(Integer insufficientEcsCount) {
            this.insufficientEcsCount = insufficientEcsCount;
            return this;
        }
        public Integer getInsufficientEcsCount() {
            return this.insufficientEcsCount;
        }

        public BindAuthToMachineResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public BindAuthToMachineResponseBodyDataBody setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

        public BindAuthToMachineResponseBodyDataBody setUnBindCount(Integer unBindCount) {
            this.unBindCount = unBindCount;
            return this;
        }
        public Integer getUnBindCount() {
            return this.unBindCount;
        }

    }

    public static class BindAuthToMachineResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public BindAuthToMachineResponseBodyDataBody body;

        public static BindAuthToMachineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAuthToMachineResponseBodyData self = new BindAuthToMachineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAuthToMachineResponseBodyData setBody(BindAuthToMachineResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public BindAuthToMachineResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
