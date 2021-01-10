// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsTaskResponseBodyData data;

    public static GetDWSSubsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTaskResponseBody self = new GetDWSSubsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsTaskResponseBody setData(GetDWSSubsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsTaskResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsTaskResponseBodyData extends TeaModel {
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

        public static GetDWSSubsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsTaskResponseBodyData self = new GetDWSSubsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsTaskResponseBodyData setClusterUrl(String clusterUrl) {
            this.clusterUrl = clusterUrl;
            return this;
        }
        public String getClusterUrl() {
            return this.clusterUrl;
        }

        public GetDWSSubsTaskResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDWSSubsTaskResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetDWSSubsTaskResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetDWSSubsTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDWSSubsTaskResponseBodyData setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public GetDWSSubsTaskResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDWSSubsTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDWSSubsTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDWSSubsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDWSSubsTaskResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

}
