// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetInstanceFeatureGateResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public GetInstanceFeatureGateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>B67D142D-D54E-184F-A306-22BDC01B2XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetInstanceFeatureGateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceFeatureGateResponseBody self = new GetInstanceFeatureGateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceFeatureGateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetInstanceFeatureGateResponseBody setData(GetInstanceFeatureGateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceFeatureGateResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceFeatureGateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetInstanceFeatureGateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetInstanceFeatureGateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceFeatureGateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceFeatureGateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInstanceFeatureGateResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetInstanceFeatureGateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConsoleControlRestart")
        public Boolean consoleControlRestart;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableManageMv")
        public Boolean enableManageMv;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullManagedSecurityGroup")
        public Boolean fullManagedSecurityGroup;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MountDlfMetaToken")
        public Boolean mountDlfMetaToken;

        @NameInMap("SupportAddConfigTypes")
        public java.util.List<String> supportAddConfigTypes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportBackup")
        public Boolean supportBackup;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCreateAgent")
        public Boolean supportCreateAgent;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCreateNonStandardNodeGroup")
        public Boolean supportCreateNonStandardNodeGroup;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEed")
        public Boolean supportEed;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEnableAi")
        public Boolean supportEnableAi;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEnableSSL")
        public Boolean supportEnableSSL;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastModeModifyConfig")
        public Boolean supportFastModeModifyConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastModeModifyResource")
        public Boolean supportFastModeModifyResource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastRestart")
        public Boolean supportFastRestart;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFeGateway")
        public Boolean supportFeGateway;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportHostAlias")
        public Boolean supportHostAlias;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportModifyTimezone")
        public Boolean supportModifyTimezone;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportMultiAZ")
        public Boolean supportMultiAZ;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseComputeNode")
        public Boolean useComputeNode;

        public static GetInstanceFeatureGateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceFeatureGateResponseBodyData self = new GetInstanceFeatureGateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceFeatureGateResponseBodyData setConsoleControlRestart(Boolean consoleControlRestart) {
            this.consoleControlRestart = consoleControlRestart;
            return this;
        }
        public Boolean getConsoleControlRestart() {
            return this.consoleControlRestart;
        }

        public GetInstanceFeatureGateResponseBodyData setEnableManageMv(Boolean enableManageMv) {
            this.enableManageMv = enableManageMv;
            return this;
        }
        public Boolean getEnableManageMv() {
            return this.enableManageMv;
        }

        public GetInstanceFeatureGateResponseBodyData setFullManagedSecurityGroup(Boolean fullManagedSecurityGroup) {
            this.fullManagedSecurityGroup = fullManagedSecurityGroup;
            return this;
        }
        public Boolean getFullManagedSecurityGroup() {
            return this.fullManagedSecurityGroup;
        }

        public GetInstanceFeatureGateResponseBodyData setMountDlfMetaToken(Boolean mountDlfMetaToken) {
            this.mountDlfMetaToken = mountDlfMetaToken;
            return this;
        }
        public Boolean getMountDlfMetaToken() {
            return this.mountDlfMetaToken;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportAddConfigTypes(java.util.List<String> supportAddConfigTypes) {
            this.supportAddConfigTypes = supportAddConfigTypes;
            return this;
        }
        public java.util.List<String> getSupportAddConfigTypes() {
            return this.supportAddConfigTypes;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportBackup(Boolean supportBackup) {
            this.supportBackup = supportBackup;
            return this;
        }
        public Boolean getSupportBackup() {
            return this.supportBackup;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportCreateAgent(Boolean supportCreateAgent) {
            this.supportCreateAgent = supportCreateAgent;
            return this;
        }
        public Boolean getSupportCreateAgent() {
            return this.supportCreateAgent;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportCreateNonStandardNodeGroup(Boolean supportCreateNonStandardNodeGroup) {
            this.supportCreateNonStandardNodeGroup = supportCreateNonStandardNodeGroup;
            return this;
        }
        public Boolean getSupportCreateNonStandardNodeGroup() {
            return this.supportCreateNonStandardNodeGroup;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportEed(Boolean supportEed) {
            this.supportEed = supportEed;
            return this;
        }
        public Boolean getSupportEed() {
            return this.supportEed;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportEnableAi(Boolean supportEnableAi) {
            this.supportEnableAi = supportEnableAi;
            return this;
        }
        public Boolean getSupportEnableAi() {
            return this.supportEnableAi;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportEnableSSL(Boolean supportEnableSSL) {
            this.supportEnableSSL = supportEnableSSL;
            return this;
        }
        public Boolean getSupportEnableSSL() {
            return this.supportEnableSSL;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportFastModeModifyConfig(Boolean supportFastModeModifyConfig) {
            this.supportFastModeModifyConfig = supportFastModeModifyConfig;
            return this;
        }
        public Boolean getSupportFastModeModifyConfig() {
            return this.supportFastModeModifyConfig;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportFastModeModifyResource(Boolean supportFastModeModifyResource) {
            this.supportFastModeModifyResource = supportFastModeModifyResource;
            return this;
        }
        public Boolean getSupportFastModeModifyResource() {
            return this.supportFastModeModifyResource;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportFastRestart(Boolean supportFastRestart) {
            this.supportFastRestart = supportFastRestart;
            return this;
        }
        public Boolean getSupportFastRestart() {
            return this.supportFastRestart;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportFeGateway(Boolean supportFeGateway) {
            this.supportFeGateway = supportFeGateway;
            return this;
        }
        public Boolean getSupportFeGateway() {
            return this.supportFeGateway;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportHostAlias(Boolean supportHostAlias) {
            this.supportHostAlias = supportHostAlias;
            return this;
        }
        public Boolean getSupportHostAlias() {
            return this.supportHostAlias;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportModifyTimezone(Boolean supportModifyTimezone) {
            this.supportModifyTimezone = supportModifyTimezone;
            return this;
        }
        public Boolean getSupportModifyTimezone() {
            return this.supportModifyTimezone;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportMultiAZ(Boolean supportMultiAZ) {
            this.supportMultiAZ = supportMultiAZ;
            return this;
        }
        public Boolean getSupportMultiAZ() {
            return this.supportMultiAZ;
        }

        public GetInstanceFeatureGateResponseBodyData setUseComputeNode(Boolean useComputeNode) {
            this.useComputeNode = useComputeNode;
            return this;
        }
        public Boolean getUseComputeNode() {
            return this.useComputeNode;
        }

    }

}
