// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPublishHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Module")
    public ListAppPublishHistoryResponseBodyModule module;

    /**
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
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanQuickRevert")
        public String canQuickRevert;

        /**
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <strong>example:</strong>
         * <p>PC</p>
         */
        @NameInMap("DeployChannel")
        public String deployChannel;

        /**
         * <strong>example:</strong>
         * <p>PSKB</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorStep")
        public String errorStep;

        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishNumber")
        public String publishNumber;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PublishOrderId")
        public Long publishOrderId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("Steps")
        public java.util.List<String> steps;

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

        public ListAppPublishHistoryResponseBodyModuleHistory setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
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

        public ListAppPublishHistoryResponseBodyModuleHistory setSteps(java.util.List<String> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<String> getSteps() {
            return this.steps;
        }

    }

    public static class ListAppPublishHistoryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CurrentPublishOrderId")
        public Long currentPublishOrderId;

        @NameInMap("History")
        public java.util.List<ListAppPublishHistoryResponseBodyModuleHistory> history;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
