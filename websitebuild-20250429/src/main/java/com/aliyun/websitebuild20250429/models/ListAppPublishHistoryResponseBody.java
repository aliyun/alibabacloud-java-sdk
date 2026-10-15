// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPublishHistoryResponseBody extends TeaModel {
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
     * <p>The name of the frontend application.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
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
     * <p>The dynamic message. This parameter is not used and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The maximum number of entries to return for a single query. Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The data table module. Valid values:</p>
     * <ul>
     * <li>ABTest: experiment data table</li>
     * <li>ExperimentTool: experiment tool table</li>
     * <li>DataDiagnosis: data diagnostics</li>
     * </ul>
     */
    @NameInMap("Module")
    public ListAppPublishHistoryResponseBodyModule module;

    /**
     * <p>The token used to start the next query. This parameter is empty if no next query is available.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    public static ListAppPublishHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPublishHistoryResponseBody self = new ListAppPublishHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPublishHistoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppPublishHistoryResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppPublishHistoryResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppPublishHistoryResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppPublishHistoryResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppPublishHistoryResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppPublishHistoryResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppPublishHistoryResponseBody setModule(ListAppPublishHistoryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppPublishHistoryResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppPublishHistoryResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppPublishHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPublishHistoryResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppPublishHistoryResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppPublishHistoryResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppPublishHistoryResponseBodyModuleHistory extends TeaModel {
        /**
         * <p>Indicates whether quick rollback is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanQuickRevert")
        public String canQuickRevert;

        /**
         * <p>The commit hash of the code.</p>
         */
        @NameInMap("CommitHash")
        public String commitHash;

        /**
         * <p>The current step number.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>The code of the current release step.</p>
         */
        @NameInMap("CurrentStepCode")
        public String currentStepCode;

        /**
         * <p>The deployment channel.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("DeployChannel")
        public String deployChannel;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>PSKB</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The release process.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorStep")
        public String errorStep;

        /**
         * <p>The code of the release step where the error occurred.</p>
         */
        @NameInMap("ErrorStepCode")
        public String errorStepCode;

        /**
         * <p>Indicates whether the operation is completed.</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>Indicates whether the resource allocation for the financial unit is successful. Valid values:</p>
         * <ul>
         * <li>true: successful</li>
         * <li>false: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
         * <p>The code of the release order type.</p>
         */
        @NameInMap("OrderTypeCode")
        public String orderTypeCode;

        /**
         * <p>The transcoding progress.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The release number.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishNumber")
        public String publishNumber;

        /**
         * <p>The release order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishOrderId")
        public Long publishOrderId;

        /**
         * <p>The release time, in the UTC format yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.SSS\&quot;Z\&quot;.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The list of release step codes.</p>
         */
        @NameInMap("StepCodes")
        public java.util.List<String> stepCodes;

        /**
         * <p>The specific configurations of the component.</p>
         */
        @NameInMap("Steps")
        public java.util.List<String> steps;

        /**
         * <p>The release subchannel.</p>
         */
        @NameInMap("Subchannel")
        public String subchannel;

        public static ListAppPublishHistoryResponseBodyModuleHistory build(java.util.Map<String, ?> map) throws Exception {
            ListAppPublishHistoryResponseBodyModuleHistory self = new ListAppPublishHistoryResponseBodyModuleHistory();
            return TeaModel.build(map, self);
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setCanQuickRevert(String canQuickRevert) {
            this.canQuickRevert = canQuickRevert;
            return this;
        }
        public String getCanQuickRevert() {
            return this.canQuickRevert;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setCommitHash(String commitHash) {
            this.commitHash = commitHash;
            return this;
        }
        public String getCommitHash() {
            return this.commitHash;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setCurrentStepCode(String currentStepCode) {
            this.currentStepCode = currentStepCode;
            return this;
        }
        public String getCurrentStepCode() {
            return this.currentStepCode;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setDeployChannel(String deployChannel) {
            this.deployChannel = deployChannel;
            return this;
        }
        public String getDeployChannel() {
            return this.deployChannel;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setErrorStep(String errorStep) {
            this.errorStep = errorStep;
            return this;
        }
        public String getErrorStep() {
            return this.errorStep;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setErrorStepCode(String errorStepCode) {
            this.errorStepCode = errorStepCode;
            return this;
        }
        public String getErrorStepCode() {
            return this.errorStepCode;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setOrderTypeCode(String orderTypeCode) {
            this.orderTypeCode = orderTypeCode;
            return this;
        }
        public String getOrderTypeCode() {
            return this.orderTypeCode;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setPublishNumber(String publishNumber) {
            this.publishNumber = publishNumber;
            return this;
        }
        public String getPublishNumber() {
            return this.publishNumber;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setPublishOrderId(Long publishOrderId) {
            this.publishOrderId = publishOrderId;
            return this;
        }
        public Long getPublishOrderId() {
            return this.publishOrderId;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setStepCodes(java.util.List<String> stepCodes) {
            this.stepCodes = stepCodes;
            return this;
        }
        public java.util.List<String> getStepCodes() {
            return this.stepCodes;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setSteps(java.util.List<String> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<String> getSteps() {
            return this.steps;
        }

        public ListAppPublishHistoryResponseBodyModuleHistory setSubchannel(String subchannel) {
            this.subchannel = subchannel;
            return this;
        }
        public String getSubchannel() {
            return this.subchannel;
        }

    }

    public static class ListAppPublishHistoryResponseBodyModule extends TeaModel {
        /**
         * <p>The ID of the current release order.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CurrentPublishOrderId")
        public Long currentPublishOrderId;

        /**
         * <p>Specifies whether to display the history of applying alert templates to application groups. Valid values:</p>
         * <ul>
         * <li>true: displayed.</li>
         * <li>false: not displayed. Default value.</li>
         * </ul>
         */
        @NameInMap("History")
        public java.util.List<ListAppPublishHistoryResponseBodyModuleHistory> history;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListAppPublishHistoryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppPublishHistoryResponseBodyModule self = new ListAppPublishHistoryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppPublishHistoryResponseBodyModule setCurrentPublishOrderId(Long currentPublishOrderId) {
            this.currentPublishOrderId = currentPublishOrderId;
            return this;
        }
        public Long getCurrentPublishOrderId() {
            return this.currentPublishOrderId;
        }

        public ListAppPublishHistoryResponseBodyModule setHistory(java.util.List<ListAppPublishHistoryResponseBodyModuleHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<ListAppPublishHistoryResponseBodyModuleHistory> getHistory() {
            return this.history;
        }

        public ListAppPublishHistoryResponseBodyModule setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListAppPublishHistoryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppPublishHistoryResponseBodyModule setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
