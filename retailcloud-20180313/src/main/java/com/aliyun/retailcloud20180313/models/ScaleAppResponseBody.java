// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ScaleAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ScaleAppResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ScaleAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleAppResponseBody self = new ScaleAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ScaleAppResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ScaleAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScaleAppResponseBody setResult(ScaleAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ScaleAppResponseBodyResult getResult() {
        return this.result;
    }

    public ScaleAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ScaleAppResponseBodyResult extends TeaModel {
        @NameInMap("Admitted")
        public Boolean admitted;

        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("DeployOrderId")
        public Long deployOrderId;

        public static ScaleAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ScaleAppResponseBodyResult self = new ScaleAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ScaleAppResponseBodyResult setAdmitted(Boolean admitted) {
            this.admitted = admitted;
            return this;
        }
        public Boolean getAdmitted() {
            return this.admitted;
        }

        public ScaleAppResponseBodyResult setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public ScaleAppResponseBodyResult setDeployOrderId(Long deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

    }

}
