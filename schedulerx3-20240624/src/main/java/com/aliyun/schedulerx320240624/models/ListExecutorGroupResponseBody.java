// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListExecutorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListExecutorGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
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
         * <strong>example:</strong>
         * <p>Tornado</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
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
         * <strong>example:</strong>
         * <p>f/HElmWgOgmb0mlbRRkNuQ==</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>api_key</p>
         */
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("CiteList")
        public java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> citeList;

        /**
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("WorkerId")
        public Long workerId;

        /**
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("WorkerType")
        public String workerType;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;address&quot;:&quot;<a href="http://47.111.188.191:18789%22%7D%5D">http://47.111.188.191:18789&quot;}]</a></p>
         */
        @NameInMap("Workers")
        public String workers;

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

        public ListExecutorGroupResponseBodyDataRecords setCiteList(java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> citeList) {
            this.citeList = citeList;
            return this;
        }
        public java.util.List<ListExecutorGroupResponseBodyDataRecordsCiteList> getCiteList() {
            return this.citeList;
        }

        public ListExecutorGroupResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    }

    public static class ListExecutorGroupResponseBodyData extends TeaModel {
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
        public java.util.List<ListExecutorGroupResponseBodyDataRecords> records;

        /**
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
