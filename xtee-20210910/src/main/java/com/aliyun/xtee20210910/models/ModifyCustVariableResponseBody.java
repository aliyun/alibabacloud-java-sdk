// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyCustVariableResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<ModifyCustVariableResponseBodyResultObject> resultObject;

    public static ModifyCustVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustVariableResponseBody self = new ModifyCustVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCustVariableResponseBody setResultObject(java.util.List<ModifyCustVariableResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<ModifyCustVariableResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class ModifyCustVariableResponseBodyResultObject extends TeaModel {
        /**
         * <p>Failure type</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("failType")
        public String failType;

        /**
         * <p>Detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Whether the operation was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static ModifyCustVariableResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustVariableResponseBodyResultObject self = new ModifyCustVariableResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ModifyCustVariableResponseBodyResultObject setFailType(String failType) {
            this.failType = failType;
            return this;
        }
        public String getFailType() {
            return this.failType;
        }

        public ModifyCustVariableResponseBodyResultObject setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyCustVariableResponseBodyResultObject setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
