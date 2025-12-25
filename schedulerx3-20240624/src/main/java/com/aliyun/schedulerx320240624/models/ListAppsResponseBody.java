// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListAppsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2C3E52FF-CBE9-5C0E-8252-37ACFF1F5EFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppsResponseBody setData(ListAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseBodyData getData() {
        return this.data;
    }

    public ListAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppsResponseBodyDataRecords extends TeaModel {
        /**
         * <p>AccessToken</p>
         * 
         * <strong>example:</strong>
         * <p>2f4ddeab8e344ed68e0402cf9b8502ffv3</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppType")
        public Integer appType;

        /**
         * <strong>example:</strong>
         * <p>1827811800555555</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecutorNum")
        public Long executorNum;

        /**
         * <strong>example:</strong>
         * <p>43885</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("JobNum")
        public Integer jobNum;

        @NameInMap("LabelRouteStrategy")
        public Integer labelRouteStrategy;

        /**
         * <strong>example:</strong>
         * <p><a href="http://28.5.128.3:80">http://28.5.128.3:80</a></p>
         */
        @NameInMap("Leader")
        public String leader;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        @Deprecated
        public Integer maxJobs;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1827811800555555</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerRegistry")
        public String workerRegistry;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("WorkflowNum")
        public Integer workflowNum;

        public static ListAppsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataRecords self = new ListAppsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyDataRecords setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public ListAppsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyDataRecords setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListAppsResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListAppsResponseBodyDataRecords setEnableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        public ListAppsResponseBodyDataRecords setExecutorNum(Long executorNum) {
            this.executorNum = executorNum;
            return this;
        }
        public Long getExecutorNum() {
            return this.executorNum;
        }

        public ListAppsResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppsResponseBodyDataRecords setJobNum(Integer jobNum) {
            this.jobNum = jobNum;
            return this;
        }
        public Integer getJobNum() {
            return this.jobNum;
        }

        public ListAppsResponseBodyDataRecords setLabelRouteStrategy(Integer labelRouteStrategy) {
            this.labelRouteStrategy = labelRouteStrategy;
            return this;
        }
        public Integer getLabelRouteStrategy() {
            return this.labelRouteStrategy;
        }

        public ListAppsResponseBodyDataRecords setLeader(String leader) {
            this.leader = leader;
            return this;
        }
        public String getLeader() {
            return this.leader;
        }

        public ListAppsResponseBodyDataRecords setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        @Deprecated
        public ListAppsResponseBodyDataRecords setMaxJobs(Integer maxJobs) {
            this.maxJobs = maxJobs;
            return this;
        }
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        public ListAppsResponseBodyDataRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAppsResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public ListAppsResponseBodyDataRecords setWorkerRegistry(String workerRegistry) {
            this.workerRegistry = workerRegistry;
            return this;
        }
        public String getWorkerRegistry() {
            return this.workerRegistry;
        }

        public ListAppsResponseBodyDataRecords setWorkflowNum(Integer workflowNum) {
            this.workflowNum = workflowNum;
            return this;
        }
        public Integer getWorkflowNum() {
            return this.workflowNum;
        }

    }

    public static class ListAppsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListAppsResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyData self = new ListAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAppsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppsResponseBodyData setRecords(java.util.List<ListAppsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListAppsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListAppsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
