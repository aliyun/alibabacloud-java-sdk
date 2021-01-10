// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSSubsTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDWSSubsTaskResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateDWSSubsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSSubsTaskResponseBody self = new CreateDWSSubsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDWSSubsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDWSSubsTaskResponseBody setData(CreateDWSSubsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDWSSubsTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateDWSSubsTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateDWSSubsTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateDWSSubsTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtModify")
        public Long gmtModify;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Consumer")
        public String consumer;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Group")
        public String group;

        @NameInMap("ClusterUrl")
        public String clusterUrl;

        public static CreateDWSSubsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDWSSubsTaskResponseBodyData self = new CreateDWSSubsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDWSSubsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDWSSubsTaskResponseBodyData setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public CreateDWSSubsTaskResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateDWSSubsTaskResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public CreateDWSSubsTaskResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public CreateDWSSubsTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDWSSubsTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDWSSubsTaskResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public CreateDWSSubsTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateDWSSubsTaskResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public CreateDWSSubsTaskResponseBodyData setClusterUrl(String clusterUrl) {
            this.clusterUrl = clusterUrl;
            return this;
        }
        public String getClusterUrl() {
            return this.clusterUrl;
        }

    }

}
