// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyCustVariableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("failType")
        public String failType;

        @NameInMap("message")
        public String message;

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
