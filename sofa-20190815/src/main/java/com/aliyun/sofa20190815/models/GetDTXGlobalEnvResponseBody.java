// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXGlobalEnvResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetDTXGlobalEnvResponseBodyData data;

    public static GetDTXGlobalEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDTXGlobalEnvResponseBody self = new GetDTXGlobalEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDTXGlobalEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDTXGlobalEnvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDTXGlobalEnvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDTXGlobalEnvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDTXGlobalEnvResponseBody setData(GetDTXGlobalEnvResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDTXGlobalEnvResponseBodyData getData() {
        return this.data;
    }

    public static class GetDTXGlobalEnvResponseBodyData extends TeaModel {
        @NameInMap("Env")
        public String env;

        @NameInMap("IsPublicCloud")
        public Boolean isPublicCloud;

        @NameInMap("RecoveryMode")
        public String recoveryMode;

        @NameInMap("Tenant")
        public String tenant;

        public static GetDTXGlobalEnvResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDTXGlobalEnvResponseBodyData self = new GetDTXGlobalEnvResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDTXGlobalEnvResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetDTXGlobalEnvResponseBodyData setIsPublicCloud(Boolean isPublicCloud) {
            this.isPublicCloud = isPublicCloud;
            return this;
        }
        public Boolean getIsPublicCloud() {
            return this.isPublicCloud;
        }

        public GetDTXGlobalEnvResponseBodyData setRecoveryMode(String recoveryMode) {
            this.recoveryMode = recoveryMode;
            return this;
        }
        public String getRecoveryMode() {
            return this.recoveryMode;
        }

        public GetDTXGlobalEnvResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

    }

}
