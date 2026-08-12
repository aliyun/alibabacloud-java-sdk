// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetInstanceFeatureGateResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetInstanceFeatureGateResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B67D142D-D54E-184F-A306-22BDC01B2XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of instances.</p>
     * 
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
         * <p>Whether the restart process can be controlled from the console.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConsoleControlRestart")
        public Boolean consoleControlRestart;

        /**
         * <p>Whether materialized views can be managed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableManageMv")
        public Boolean enableManageMv;

        /**
         * <p>Whether managed security groups are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullManagedSecurityGroup")
        public Boolean fullManagedSecurityGroup;

        /**
         * <p>Whether DLF meta tokens can be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MountDlfMetaToken")
        public Boolean mountDlfMetaToken;

        /**
         * <p>A list of new configuration types.</p>
         */
        @NameInMap("SupportAddConfigTypes")
        public java.util.List<String> supportAddConfigTypes;

        /**
         * <p>Whether data backup is supported.</p>
         * <ul>
         * <li><p><strong>1</strong>: Supports data backup.</p>
         * </li>
         * <li><p><strong>2</strong>: Does not support data backup.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportBackup")
        public Boolean supportBackup;

        /**
         * <p>Whether agents can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCreateAgent")
        public Boolean supportCreateAgent;

        /**
         * <p>Whether compute groups with specifications other than <code>standard</code> can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCreateNonStandardNodeGroup")
        public Boolean supportCreateNonStandardNodeGroup;

        /**
         * <p>Whether elastic ephemeral disks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEed")
        public Boolean supportEed;

        /**
         * <p>Whether the AI function is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEnableAi")
        public Boolean supportEnableAi;

        /**
         * <p>Whether SSL can be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEnableSSL")
        public Boolean supportEnableSSL;

        /**
         * <p>Whether fast restart is supported for configuration changes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastModeModifyConfig")
        public Boolean supportFastModeModifyConfig;

        /**
         * <p>Whether resources can be modified by using fast restart.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastModeModifyResource")
        public Boolean supportFastModeModifyResource;

        /**
         * <p>Whether fast restart is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastRestart")
        public Boolean supportFastRestart;

        /**
         * <p>Whether the FE gateway is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFeGateway")
        public Boolean supportFeGateway;

        /**
         * <p>Whether custom domain names are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportHostAlias")
        public Boolean supportHostAlias;

        /**
         * <p>Whether the time zone can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportModifyTimezone")
        public Boolean supportModifyTimezone;

        /**
         * <p>Whether observers can be deployed across multiple availability zones (AZs).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportMultiAZ")
        public Boolean supportMultiAZ;

        /**
         * <p>Whether the instance uses compute nodes (CNs).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseComputeNode")
        public Boolean useComputeNode;

        @NameInMap("supportCompactionService")
        public Boolean supportCompactionService;

        /**
         * <p>Whether the Compaction Service allowlist feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportCompactionServiceWhiteList")
        public Boolean supportCompactionServiceWhiteList;

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

        public GetInstanceFeatureGateResponseBodyData setSupportCompactionService(Boolean supportCompactionService) {
            this.supportCompactionService = supportCompactionService;
            return this;
        }
        public Boolean getSupportCompactionService() {
            return this.supportCompactionService;
        }

        public GetInstanceFeatureGateResponseBodyData setSupportCompactionServiceWhiteList(Boolean supportCompactionServiceWhiteList) {
            this.supportCompactionServiceWhiteList = supportCompactionServiceWhiteList;
            return this;
        }
        public Boolean getSupportCompactionServiceWhiteList() {
            return this.supportCompactionServiceWhiteList;
        }

    }

}
