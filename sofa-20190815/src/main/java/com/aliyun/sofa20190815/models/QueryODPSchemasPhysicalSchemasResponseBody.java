// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasPhysicalSchemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPSchemasPhysicalSchemasResponseBodyData> data;

    public static QueryODPSchemasPhysicalSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasPhysicalSchemasResponseBody self = new QueryODPSchemasPhysicalSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasPhysicalSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSchemasPhysicalSchemasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSchemasPhysicalSchemasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSchemasPhysicalSchemasResponseBody setData(java.util.List<QueryODPSchemasPhysicalSchemasResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPSchemasPhysicalSchemasResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPSchemasPhysicalSchemasResponseBodyData extends TeaModel {
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("RelSchemaName")
        public String relSchemaName;

        @NameInMap("Username")
        public String username;

        public static QueryODPSchemasPhysicalSchemasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasPhysicalSchemasResponseBodyData self = new QueryODPSchemasPhysicalSchemasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasPhysicalSchemasResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public QueryODPSchemasPhysicalSchemasResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public QueryODPSchemasPhysicalSchemasResponseBodyData setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public QueryODPSchemasPhysicalSchemasResponseBodyData setRelSchemaName(String relSchemaName) {
            this.relSchemaName = relSchemaName;
            return this;
        }
        public String getRelSchemaName() {
            return this.relSchemaName;
        }

        public QueryODPSchemasPhysicalSchemasResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
