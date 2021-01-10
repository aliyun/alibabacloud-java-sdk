// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPDbnodesRelatedPhysicalSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData> data;

    public static QueryODPDbnodesRelatedPhysicalSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPDbnodesRelatedPhysicalSchemasResponseBody self = new QueryODPDbnodesRelatedPhysicalSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPDbnodesRelatedPhysicalSchemasResponseBody setData(java.util.List<QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SchemaName")
        public String schemaName;

        public static QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData self = new QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPDbnodesRelatedPhysicalSchemasResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

}
