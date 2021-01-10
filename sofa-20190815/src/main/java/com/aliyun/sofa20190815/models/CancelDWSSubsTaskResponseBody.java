// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelDWSSubsTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CancelDWSSubsTaskResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CancelDWSSubsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDWSSubsTaskResponseBody self = new CancelDWSSubsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDWSSubsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelDWSSubsTaskResponseBody setData(CancelDWSSubsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelDWSSubsTaskResponseBodyData getData() {
        return this.data;
    }

    public CancelDWSSubsTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CancelDWSSubsTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CancelDWSSubsTaskResponseBodyData extends TeaModel {
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

        public static CancelDWSSubsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelDWSSubsTaskResponseBodyData self = new CancelDWSSubsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelDWSSubsTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CancelDWSSubsTaskResponseBodyData setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public CancelDWSSubsTaskResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CancelDWSSubsTaskResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public CancelDWSSubsTaskResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public CancelDWSSubsTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CancelDWSSubsTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CancelDWSSubsTaskResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public CancelDWSSubsTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CancelDWSSubsTaskResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public CancelDWSSubsTaskResponseBodyData setClusterUrl(String clusterUrl) {
            this.clusterUrl = clusterUrl;
            return this;
        }
        public String getClusterUrl() {
            return this.clusterUrl;
        }

    }

}
