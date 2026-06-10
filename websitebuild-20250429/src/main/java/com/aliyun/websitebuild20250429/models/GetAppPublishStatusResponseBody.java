// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPublishStatusResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Response data</p>
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
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>Abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
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
        /**
         * <p>Indicates whether quick rollback is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanQuickRevert")
        public String canQuickRevert;

        /**
         * <p>Current operation step of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>Deployment channel</p>
         * 
         * <strong>example:</strong>
         * <p>PC,WEAPP</p>
         */
        @NameInMap("DeployChannel")
        public String deployChannel;

        /**
         * <p>Application description</p>
         * 
         * <strong>example:</strong>
         * <p>/bak-&gt;serverless.handler(2020091300200279)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Publishing procedure</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ErrorStep")
        public String errorStep;

        /**
         * <p>Indicates whether the job is finished.</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>Indicates whether the invocation succeeded. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The invocation succeeded.</p>
         * </li>
         * <li><p><code>false</code>: Failed to invoke.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>Additional description information.</p>
         * 
         * <strong>example:</strong>
         * <p>common notify successfully.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Sorting type: ASC or DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>Job completion percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>Publish number</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishNumber")
        public String publishNumber;

        /**
         * <p>Publish order ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishOrderId")
        public Long publishOrderId;

        /**
         * <p>Scheduled publish time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The site ID, which can be obtained by invoking the <a href="~~ListSites~~">ListSites</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>Error Level, including FATAL, ERROR, WARNING, and CRITICAL.</p>
         */
        @NameInMap("Steps")
        public java.util.List<String> steps;

        @NameInMap("Subchannel")
        public String subchannel;

        public static GetAppPublishStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppPublishStatusResponseBodyModule self = new GetAppPublishStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppPublishStatusResponseBodyModule setCanQuickRevert(String canQuickRevert) {
            this.canQuickRevert = canQuickRevert;
            return this;
        }
        public String getCanQuickRevert() {
            return this.canQuickRevert;
        }

        public GetAppPublishStatusResponseBodyModule setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
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

        public GetAppPublishStatusResponseBodyModule setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
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

        public GetAppPublishStatusResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
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

    }

}
