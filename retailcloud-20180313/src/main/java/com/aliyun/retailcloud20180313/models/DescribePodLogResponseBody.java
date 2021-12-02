// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePodLogResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePodLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePodLogResponseBody self = new DescribePodLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePodLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePodLogResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribePodLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePodLogResponseBody setResult(DescribePodLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePodLogResponseBodyResult getResult() {
        return this.result;
    }

    public DescribePodLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePodLogResponseBodyResultDeployStepList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StepCode")
        public String stepCode;

        @NameInMap("StepLog")
        public String stepLog;

        @NameInMap("StepName")
        public String stepName;

        public static DescribePodLogResponseBodyResultDeployStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribePodLogResponseBodyResultDeployStepList self = new DescribePodLogResponseBodyResultDeployStepList();
            return TeaModel.build(map, self);
        }

        public DescribePodLogResponseBodyResultDeployStepList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePodLogResponseBodyResultDeployStepList setStepCode(String stepCode) {
            this.stepCode = stepCode;
            return this;
        }
        public String getStepCode() {
            return this.stepCode;
        }

        public DescribePodLogResponseBodyResultDeployStepList setStepLog(String stepLog) {
            this.stepLog = stepLog;
            return this;
        }
        public String getStepLog() {
            return this.stepLog;
        }

        public DescribePodLogResponseBodyResultDeployStepList setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

    }

    public static class DescribePodLogResponseBodyResult extends TeaModel {
        @NameInMap("DeployOrderName")
        public String deployOrderName;

        @NameInMap("DeployStepList")
        public java.util.List<DescribePodLogResponseBodyResultDeployStepList> deployStepList;

        @NameInMap("EnvTypeName")
        public String envTypeName;

        public static DescribePodLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePodLogResponseBodyResult self = new DescribePodLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePodLogResponseBodyResult setDeployOrderName(String deployOrderName) {
            this.deployOrderName = deployOrderName;
            return this;
        }
        public String getDeployOrderName() {
            return this.deployOrderName;
        }

        public DescribePodLogResponseBodyResult setDeployStepList(java.util.List<DescribePodLogResponseBodyResultDeployStepList> deployStepList) {
            this.deployStepList = deployStepList;
            return this;
        }
        public java.util.List<DescribePodLogResponseBodyResultDeployStepList> getDeployStepList() {
            return this.deployStepList;
        }

        public DescribePodLogResponseBodyResult setEnvTypeName(String envTypeName) {
            this.envTypeName = envTypeName;
            return this;
        }
        public String getEnvTypeName() {
            return this.envTypeName;
        }

    }

}
