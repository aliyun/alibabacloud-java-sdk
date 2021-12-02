// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeployAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeployAppResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeployAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployAppResponseBody self = new DeployAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeployAppResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployAppResponseBody setResult(DeployAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeployAppResponseBodyResult getResult() {
        return this.result;
    }

    public DeployAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployAppResponseBodyResult extends TeaModel {
        @NameInMap("Admitted")
        public Boolean admitted;

        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("DeployOrderId")
        public Long deployOrderId;

        public static DeployAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeployAppResponseBodyResult self = new DeployAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeployAppResponseBodyResult setAdmitted(Boolean admitted) {
            this.admitted = admitted;
            return this;
        }
        public Boolean getAdmitted() {
            return this.admitted;
        }

        public DeployAppResponseBodyResult setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public DeployAppResponseBodyResult setDeployOrderId(Long deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public Long getDeployOrderId() {
            return this.deployOrderId;
        }

    }

}
