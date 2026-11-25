// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PublishAppInstanceResponseBody extends TeaModel {
    /**
     * <p>The access denial information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Specifies whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The app name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message. This parameter is currently unused and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public PublishAppInstanceResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>System exception</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static PublishAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishAppInstanceResponseBody self = new PublishAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishAppInstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public PublishAppInstanceResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public PublishAppInstanceResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PublishAppInstanceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public PublishAppInstanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PublishAppInstanceResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public PublishAppInstanceResponseBody setModule(PublishAppInstanceResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public PublishAppInstanceResponseBodyModule getModule() {
        return this.module;
    }

    public PublishAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishAppInstanceResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public PublishAppInstanceResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public PublishAppInstanceResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class PublishAppInstanceResponseBodyModule extends TeaModel {
        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        @NameInMap("AuditId")
        public String auditId;

        @NameInMap("CandidateId")
        public String candidateId;

        @NameInMap("CandidateStatus")
        public String candidateStatus;

        @NameInMap("CommitHash")
        public String commitHash;

        @NameInMap("PlatformAppid")
        public String platformAppid;

        @NameInMap("PluginDeclarationHash")
        public String pluginDeclarationHash;

        @NameInMap("PluginState")
        public String pluginState;

        @NameInMap("PrivacyDraftId")
        public String privacyDraftId;

        @NameInMap("PrivacyRevision")
        public String privacyRevision;

        @NameInMap("PublishEnv")
        public String publishEnv;

        @NameInMap("PublishNumber")
        public String publishNumber;

        /**
         * <p>The publish order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("PublishOrderId")
        public Long publishOrderId;

        @NameInMap("ReadbackStatus")
        public String readbackStatus;

        @NameInMap("SubmitIntentStatus")
        public String submitIntentStatus;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("UploadSequence")
        public Long uploadSequence;

        public static PublishAppInstanceResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            PublishAppInstanceResponseBodyModule self = new PublishAppInstanceResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public PublishAppInstanceResponseBodyModule setArtifactDigest(String artifactDigest) {
            this.artifactDigest = artifactDigest;
            return this;
        }
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        public PublishAppInstanceResponseBodyModule setAuditId(String auditId) {
            this.auditId = auditId;
            return this;
        }
        public String getAuditId() {
            return this.auditId;
        }

        public PublishAppInstanceResponseBodyModule setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public PublishAppInstanceResponseBodyModule setCandidateStatus(String candidateStatus) {
            this.candidateStatus = candidateStatus;
            return this;
        }
        public String getCandidateStatus() {
            return this.candidateStatus;
        }

        public PublishAppInstanceResponseBodyModule setCommitHash(String commitHash) {
            this.commitHash = commitHash;
            return this;
        }
        public String getCommitHash() {
            return this.commitHash;
        }

        public PublishAppInstanceResponseBodyModule setPlatformAppid(String platformAppid) {
            this.platformAppid = platformAppid;
            return this;
        }
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        public PublishAppInstanceResponseBodyModule setPluginDeclarationHash(String pluginDeclarationHash) {
            this.pluginDeclarationHash = pluginDeclarationHash;
            return this;
        }
        public String getPluginDeclarationHash() {
            return this.pluginDeclarationHash;
        }

        public PublishAppInstanceResponseBodyModule setPluginState(String pluginState) {
            this.pluginState = pluginState;
            return this;
        }
        public String getPluginState() {
            return this.pluginState;
        }

        public PublishAppInstanceResponseBodyModule setPrivacyDraftId(String privacyDraftId) {
            this.privacyDraftId = privacyDraftId;
            return this;
        }
        public String getPrivacyDraftId() {
            return this.privacyDraftId;
        }

        public PublishAppInstanceResponseBodyModule setPrivacyRevision(String privacyRevision) {
            this.privacyRevision = privacyRevision;
            return this;
        }
        public String getPrivacyRevision() {
            return this.privacyRevision;
        }

        public PublishAppInstanceResponseBodyModule setPublishEnv(String publishEnv) {
            this.publishEnv = publishEnv;
            return this;
        }
        public String getPublishEnv() {
            return this.publishEnv;
        }

        public PublishAppInstanceResponseBodyModule setPublishNumber(String publishNumber) {
            this.publishNumber = publishNumber;
            return this;
        }
        public String getPublishNumber() {
            return this.publishNumber;
        }

        public PublishAppInstanceResponseBodyModule setPublishOrderId(Long publishOrderId) {
            this.publishOrderId = publishOrderId;
            return this;
        }
        public Long getPublishOrderId() {
            return this.publishOrderId;
        }

        public PublishAppInstanceResponseBodyModule setReadbackStatus(String readbackStatus) {
            this.readbackStatus = readbackStatus;
            return this;
        }
        public String getReadbackStatus() {
            return this.readbackStatus;
        }

        public PublishAppInstanceResponseBodyModule setSubmitIntentStatus(String submitIntentStatus) {
            this.submitIntentStatus = submitIntentStatus;
            return this;
        }
        public String getSubmitIntentStatus() {
            return this.submitIntentStatus;
        }

        public PublishAppInstanceResponseBodyModule setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public PublishAppInstanceResponseBodyModule setUploadSequence(Long uploadSequence) {
            this.uploadSequence = uploadSequence;
            return this;
        }
        public Long getUploadSequence() {
            return this.uploadSequence;
        }

    }

}
