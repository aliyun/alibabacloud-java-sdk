// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsTasksResponseBodyData data;

    public static GetDWSSubsTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTasksResponseBody self = new GetDWSSubsTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsTasksResponseBody setData(GetDWSSubsTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsTasksResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsTasksResponseBodyDataTasks extends TeaModel {
        @NameInMap("ClusterUrl")
        public String clusterUrl;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Consumer")
        public String consumer;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModify")
        public Long gmtModify;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("TableId")
        public String tableId;

        public static GetDWSSubsTasksResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsTasksResponseBodyDataTasks self = new GetDWSSubsTasksResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsTasksResponseBodyDataTasks setClusterUrl(String clusterUrl) {
            this.clusterUrl = clusterUrl;
            return this;
        }
        public String getClusterUrl() {
            return this.clusterUrl;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDWSSubsTasksResponseBodyDataTasks setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

    public static class GetDWSSubsTasksResponseBodyData extends TeaModel {
        @NameInMap("CurrentPageCount")
        public Long currentPageCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Tasks")
        public java.util.List<GetDWSSubsTasksResponseBodyDataTasks> tasks;

        public static GetDWSSubsTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsTasksResponseBodyData self = new GetDWSSubsTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsTasksResponseBodyData setCurrentPageCount(Long currentPageCount) {
            this.currentPageCount = currentPageCount;
            return this;
        }
        public Long getCurrentPageCount() {
            return this.currentPageCount;
        }

        public GetDWSSubsTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetDWSSubsTasksResponseBodyData setTasks(java.util.List<GetDWSSubsTasksResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetDWSSubsTasksResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
