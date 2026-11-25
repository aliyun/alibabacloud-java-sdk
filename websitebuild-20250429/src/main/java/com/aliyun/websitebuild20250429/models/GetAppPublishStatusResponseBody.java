// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPublishStatusResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
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
     * <p>The dynamic message.</p>
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
    public GetAppPublishStatusResponseBodyModule module;

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

    public static GetAppPublishStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPublishStatusResponseBody self = new GetAppPublishStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPublishStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppPublishStatusResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppPublishStatusResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppPublishStatusResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppPublishStatusResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppPublishStatusResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppPublishStatusResponseBody setModule(GetAppPublishStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppPublishStatusResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppPublishStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppPublishStatusResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppPublishStatusResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppPublishStatusResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppPublishStatusResponseBodyModule extends TeaModel {
        @NameInMap("ArtifactDigest")
        public String artifactDigest;

        @NameInMap("AuditId")
        public String auditId;

        @NameInMap("BindingId")
        public String bindingId;

        /**
         * <p>Indicates whether quick rollback is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanQuickRevert")
        public String canQuickRevert;

        @NameInMap("CandidateId")
        public String candidateId;

        @NameInMap("CandidateStatus")
        public String candidateStatus;

        @NameInMap("CommitHash")
        public String commitHash;

        /**
         * <p>The current step number of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>The code of the current publish step.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("CurrentStepCode")
        public String currentStepCode;

        /**
         * <p>The deployment channel.</p>
         * 
         * <strong>example:</strong>
         * <p>PC,WEAPP</p>
         */
        @NameInMap("DeployChannel")
        public String deployChannel;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>/bak-&gt;serverless.handler(2020091300200279)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The publish process.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ErrorStep")
        public String errorStep;

        /**
         * <p>The code of the publish step where the error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILDING</p>
         */
        @NameInMap("ErrorStepCode")
        public String errorStepCode;

        /**
         * <p>Indicates whether the task is completed.</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The call is successful.</p>
         * </li>
         * <li><p><code>false</code>: The call fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>common notify successfully.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The sort order. Valid values: ASC and DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The code of the publish order type.</p>
         * 
         * <strong>example:</strong>
         * <p>DEPLOY</p>
         */
        @NameInMap("OrderTypeCode")
        public String orderTypeCode;

        /**
         * <p>The completion percentage of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Percent")
        public Integer percent;

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

        @NameInMap("PublishDiagnostics")
        public String publishDiagnostics;

        @NameInMap("PublishEnv")
        public String publishEnv;

        /**
         * <p>The publish number.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishNumber")
        public String publishNumber;

        /**
         * <p>The publish order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishOrderId")
        public Long publishOrderId;

        /**
         * <p>The scheduled publish time in UTC format yyyy-MM-dd&quot;T&quot;HH:mm:ss.SSS&quot;Z&quot;.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("ReadbackStatus")
        public String readbackStatus;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>The list of publish step codes.</p>
         */
        @NameInMap("StepCodes")
        public java.util.List<String> stepCodes;

        /**
         * <p>The error level. Valid values: FATAL, ERROR, WARNING, and CRITICAL.</p>
         */
        @NameInMap("Steps")
        public java.util.List<String> steps;

        /**
         * <p>The publish subchannel.</p>
         * 
         * <strong>example:</strong>
         * <p>wx0123456789abcdef</p>
         */
        @NameInMap("Subchannel")
        public String subchannel;

        @NameInMap("SubmitIntentStatus")
        public String submitIntentStatus;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("UploadAttemptId")
        public String uploadAttemptId;

        @NameInMap("UploadLeaseState")
        public String uploadLeaseState;

        @NameInMap("UploadSequence")
        public Long uploadSequence;

        @NameInMap("UploadTicketState")
        public String uploadTicketState;

        public static GetAppPublishStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppPublishStatusResponseBodyModule self = new GetAppPublishStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppPublishStatusResponseBodyModule setArtifactDigest(String artifactDigest) {
            this.artifactDigest = artifactDigest;
            return this;
        }
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        public GetAppPublishStatusResponseBodyModule setAuditId(String auditId) {
            this.auditId = auditId;
            return this;
        }
        public String getAuditId() {
            return this.auditId;
        }

        public GetAppPublishStatusResponseBodyModule setBindingId(String bindingId) {
            this.bindingId = bindingId;
            return this;
        }
        public String getBindingId() {
            return this.bindingId;
        }

        public GetAppPublishStatusResponseBodyModule setCanQuickRevert(String canQuickRevert) {
            this.canQuickRevert = canQuickRevert;
            return this;
        }
        public String getCanQuickRevert() {
            return this.canQuickRevert;
        }

        public GetAppPublishStatusResponseBodyModule setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public GetAppPublishStatusResponseBodyModule setCandidateStatus(String candidateStatus) {
            this.candidateStatus = candidateStatus;
            return this;
        }
        public String getCandidateStatus() {
            return this.candidateStatus;
        }

        public GetAppPublishStatusResponseBodyModule setCommitHash(String commitHash) {
            this.commitHash = commitHash;
            return this;
        }
        public String getCommitHash() {
            return this.commitHash;
        }

        public GetAppPublishStatusResponseBodyModule setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public GetAppPublishStatusResponseBodyModule setCurrentStepCode(String currentStepCode) {
            this.currentStepCode = currentStepCode;
            return this;
        }
        public String getCurrentStepCode() {
            return this.currentStepCode;
        }

        public GetAppPublishStatusResponseBodyModule setDeployChannel(String deployChannel) {
            this.deployChannel = deployChannel;
            return this;
        }
        public String getDeployChannel() {
            return this.deployChannel;
        }

        public GetAppPublishStatusResponseBodyModule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppPublishStatusResponseBodyModule setErrorStep(String errorStep) {
            this.errorStep = errorStep;
            return this;
        }
        public String getErrorStep() {
            return this.errorStep;
        }

        public GetAppPublishStatusResponseBodyModule setErrorStepCode(String errorStepCode) {
            this.errorStepCode = errorStepCode;
            return this;
        }
        public String getErrorStepCode() {
            return this.errorStepCode;
        }

        public GetAppPublishStatusResponseBodyModule setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public GetAppPublishStatusResponseBodyModule setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public GetAppPublishStatusResponseBodyModule setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetAppPublishStatusResponseBodyModule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetAppPublishStatusResponseBodyModule setOrderTypeCode(String orderTypeCode) {
            this.orderTypeCode = orderTypeCode;
            return this;
        }
        public String getOrderTypeCode() {
            return this.orderTypeCode;
        }

        public GetAppPublishStatusResponseBodyModule setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public GetAppPublishStatusResponseBodyModule setPlatformAppid(String platformAppid) {
            this.platformAppid = platformAppid;
            return this;
        }
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        public GetAppPublishStatusResponseBodyModule setPluginDeclarationHash(String pluginDeclarationHash) {
            this.pluginDeclarationHash = pluginDeclarationHash;
            return this;
        }
        public String getPluginDeclarationHash() {
            return this.pluginDeclarationHash;
        }

        public GetAppPublishStatusResponseBodyModule setPluginState(String pluginState) {
            this.pluginState = pluginState;
            return this;
        }
        public String getPluginState() {
            return this.pluginState;
        }

        public GetAppPublishStatusResponseBodyModule setPrivacyDraftId(String privacyDraftId) {
            this.privacyDraftId = privacyDraftId;
            return this;
        }
        public String getPrivacyDraftId() {
            return this.privacyDraftId;
        }

        public GetAppPublishStatusResponseBodyModule setPrivacyRevision(String privacyRevision) {
            this.privacyRevision = privacyRevision;
            return this;
        }
        public String getPrivacyRevision() {
            return this.privacyRevision;
        }

        public GetAppPublishStatusResponseBodyModule setPublishDiagnostics(String publishDiagnostics) {
            this.publishDiagnostics = publishDiagnostics;
            return this;
        }
        public String getPublishDiagnostics() {
            return this.publishDiagnostics;
        }

        public GetAppPublishStatusResponseBodyModule setPublishEnv(String publishEnv) {
            this.publishEnv = publishEnv;
            return this;
        }
        public String getPublishEnv() {
            return this.publishEnv;
        }

        public GetAppPublishStatusResponseBodyModule setPublishNumber(String publishNumber) {
            this.publishNumber = publishNumber;
            return this;
        }
        public String getPublishNumber() {
            return this.publishNumber;
        }

        public GetAppPublishStatusResponseBodyModule setPublishOrderId(Long publishOrderId) {
            this.publishOrderId = publishOrderId;
            return this;
        }
        public Long getPublishOrderId() {
            return this.publishOrderId;
        }

        public GetAppPublishStatusResponseBodyModule setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public GetAppPublishStatusResponseBodyModule setReadbackStatus(String readbackStatus) {
            this.readbackStatus = readbackStatus;
            return this;
        }
        public String getReadbackStatus() {
            return this.readbackStatus;
        }

        public GetAppPublishStatusResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public GetAppPublishStatusResponseBodyModule setStepCodes(java.util.List<String> stepCodes) {
            this.stepCodes = stepCodes;
            return this;
        }
        public java.util.List<String> getStepCodes() {
            return this.stepCodes;
        }

        public GetAppPublishStatusResponseBodyModule setSteps(java.util.List<String> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<String> getSteps() {
            return this.steps;
        }

        public GetAppPublishStatusResponseBodyModule setSubchannel(String subchannel) {
            this.subchannel = subchannel;
            return this;
        }
        public String getSubchannel() {
            return this.subchannel;
        }

        public GetAppPublishStatusResponseBodyModule setSubmitIntentStatus(String submitIntentStatus) {
            this.submitIntentStatus = submitIntentStatus;
            return this;
        }
        public String getSubmitIntentStatus() {
            return this.submitIntentStatus;
        }

        public GetAppPublishStatusResponseBodyModule setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetAppPublishStatusResponseBodyModule setUploadAttemptId(String uploadAttemptId) {
            this.uploadAttemptId = uploadAttemptId;
            return this;
        }
        public String getUploadAttemptId() {
            return this.uploadAttemptId;
        }

        public GetAppPublishStatusResponseBodyModule setUploadLeaseState(String uploadLeaseState) {
            this.uploadLeaseState = uploadLeaseState;
            return this;
        }
        public String getUploadLeaseState() {
            return this.uploadLeaseState;
        }

        public GetAppPublishStatusResponseBodyModule setUploadSequence(Long uploadSequence) {
            this.uploadSequence = uploadSequence;
            return this;
        }
        public Long getUploadSequence() {
            return this.uploadSequence;
        }

        public GetAppPublishStatusResponseBodyModule setUploadTicketState(String uploadTicketState) {
            this.uploadTicketState = uploadTicketState;
            return this;
        }
        public String getUploadTicketState() {
            return this.uploadTicketState;
        }

    }

}
