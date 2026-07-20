// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindAuthToMachineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BEE90F8C-EDC2-5394-953B-D07A121612B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InsufficientCoreCount")
        public Integer insufficientCoreCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InsufficientEcsCount")
        public Integer insufficientEcsCount;

        /**
         * <strong>example:</strong>
         * <p>F799C1E4-D4C6-5964-A6D1-4BA9CCF105F2</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResultCode")
        public Integer resultCode;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
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
