// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvironmentDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppEnvironmentDetailResponseBodyResult result;

    public static DescribeAppEnvironmentDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvironmentDetailResponseBody self = new DescribeAppEnvironmentDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvironmentDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppEnvironmentDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeAppEnvironmentDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppEnvironmentDetailResponseBody setResult(DescribeAppEnvironmentDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppEnvironmentDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppEnvironmentDetailResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppSchemaId")
        public Long appSchemaId;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("EnvTypeName")
        public String envTypeName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Replicas")
        public Integer replicas;

        public static DescribeAppEnvironmentDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvironmentDetailResponseBodyResult self = new DescribeAppEnvironmentDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setAppSchemaId(Long appSchemaId) {
            this.appSchemaId = appSchemaId;
            return this;
        }
        public Long getAppSchemaId() {
            return this.appSchemaId;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setEnvTypeName(String envTypeName) {
            this.envTypeName = envTypeName;
            return this;
        }
        public String getEnvTypeName() {
            return this.envTypeName;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAppEnvironmentDetailResponseBodyResult setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
