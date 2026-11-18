// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListExecutorGroupResponseBody extends TeaModel {
    /**
     * <p>The total count of data under the current request conditions. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public ListExecutorGroupResponseBodyData data;

    /**
     * <p>The maximum number of entries to return for this request. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position from which the current call returns data. An empty value indicates that all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that specifies the position from which the current call returns data. An empty value indicates that all data has been read. You do not need to specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListExecutorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorGroupResponseBody self = new ListExecutorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExecutorGroupResponseBody setData(ListExecutorGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExecutorGroupResponseBodyData getData() {
        return this.data;
    }

    public ListExecutorGroupResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutorGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExecutorGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExecutorGroupResponseBodyDataRecordsCiteList extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Tornado</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Description")
        public String description;

        public static ListExecutorGroupResponseBodyDataRecordsCiteList build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorGroupResponseBodyDataRecordsCiteList self = new ListExecutorGroupResponseBodyDataRecordsCiteList();
            return TeaModel.build(map, self);
        }

        public ListExecutorGroupResponseBodyDataRecordsCiteList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListExecutorGroupResponseBodyDataRecordsCiteList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListExecutorGroupResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The client key.</p>
         * 
         * <strong>example:</strong>
         * <p>f/HElmWgOgmb0mlbRRkNuQ==</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>Specifies whether to enable <strong>automatic start and stop</strong>. Valid values:</p>
         * <ul>
         * <li>true: Enabled. If no tasks are scheduled for a period of time, the agent automatically hibernates. If tasks are scheduled for a period of time, the agent wakes up in advance.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoScale")
        public Boolean autoScale;

        /**
         * <p>The list of referenced applications.</p>
         */
        @NameInMap("CiteList")
        public java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> citeList;

        /**
         * <p>The CloudMonitor workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>scx-workspace-acd09a5d-4133-43cc-889d-c33a122afb6e</p>
         */
        @NameInMap("CmsWorkspaceId")
        public String cmsWorkspaceId;

        /**
         * <p>The current number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CurrentJobs")
        public Integer currentJobs;

        /**
         * <p>The description of the executor group.</p>
         * 
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnableJobs")
        public Integer enableJobs;

        /**
         * <p>The integration method. Valid values:</p>
         * <ul>
         * <li>manual</li>
         * <li>acs_sandbox</li>
         * <li>k8s_service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs_sandbox</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The maximum number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        /**
         * <p>The name of the executor group.</p>
         * 
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The list of resolved workers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;address&quot;:&quot;<a href="http://192.168.2.34:8084%22%7D%5D">http://192.168.2.34:8084&quot;}]</a></p>
         */
        @NameInMap("ResolvedWorkers")
        public String resolvedWorkers;

        /**
         * <p>The ID of the executor group.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WorkerId")
        public Long workerId;

        /**
         * <p>The executor type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerType")
        public String workerType;

        /**
         * <p>The list of specified machines in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
         */
        @NameInMap("Workers")
        public String workers;

        /**
         * <p>The extended parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("XAttrs")
        public String XAttrs;

        public static ListExecutorGroupResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorGroupResponseBodyDataRecords self = new ListExecutorGroupResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListExecutorGroupResponseBodyDataRecords setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListExecutorGroupResponseBodyDataRecords setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListExecutorGroupResponseBodyDataRecords setAutoScale(Boolean autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        public ListExecutorGroupResponseBodyDataRecords setCiteList(java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> citeList) {
            this.citeList = citeList;
            return this;
        }
        public java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> getCiteList() {
            return this.citeList;
        }

        public ListExecutorGroupResponseBodyDataRecords setCmsWorkspaceId(String cmsWorkspaceId) {
            this.cmsWorkspaceId = cmsWorkspaceId;
            return this;
        }
        public String getCmsWorkspaceId() {
            return this.cmsWorkspaceId;
        }

        public ListExecutorGroupResponseBodyDataRecords setCurrentJobs(Integer currentJobs) {
            this.currentJobs = currentJobs;
            return this;
        }
        public Integer getCurrentJobs() {
            return this.currentJobs;
        }

        public ListExecutorGroupResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExecutorGroupResponseBodyDataRecords setEnableJobs(Integer enableJobs) {
            this.enableJobs = enableJobs;
            return this;
        }
        public Integer getEnableJobs() {
            return this.enableJobs;
        }

        public ListExecutorGroupResponseBodyDataRecords setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListExecutorGroupResponseBodyDataRecords setMaxJobs(Integer maxJobs) {
            this.maxJobs = maxJobs;
            return this;
        }
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        public ListExecutorGroupResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExecutorGroupResponseBodyDataRecords setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public ListExecutorGroupResponseBodyDataRecords setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListExecutorGroupResponseBodyDataRecords setResolvedWorkers(String resolvedWorkers) {
            this.resolvedWorkers = resolvedWorkers;
            return this;
        }
        public String getResolvedWorkers() {
            return this.resolvedWorkers;
        }

        public ListExecutorGroupResponseBodyDataRecords setWorkerId(Long workerId) {
            this.workerId = workerId;
            return this;
        }
        public Long getWorkerId() {
            return this.workerId;
        }

        public ListExecutorGroupResponseBodyDataRecords setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

        public ListExecutorGroupResponseBodyDataRecords setWorkers(String workers) {
            this.workers = workers;
            return this;
        }
        public String getWorkers() {
            return this.workers;
        }

        public ListExecutorGroupResponseBodyDataRecords setXAttrs(String XAttrs) {
            this.XAttrs = XAttrs;
            return this;
        }
        public String getXAttrs() {
            return this.XAttrs;
        }

    }

    public static class ListExecutorGroupResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
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
        public java.util.List<ListExecutorGroupResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListExecutorGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorGroupResponseBodyData self = new ListExecutorGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExecutorGroupResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListExecutorGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListExecutorGroupResponseBodyData setRecords(java.util.List<ListExecutorGroupResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListExecutorGroupResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListExecutorGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
