// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPSqlAuditInstancesResponseBodyData data;

    public static QueryODPSqlAuditInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditInstancesResponseBody self = new QueryODPSqlAuditInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSqlAuditInstancesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSqlAuditInstancesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSqlAuditInstancesResponseBody setData(QueryODPSqlAuditInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPSqlAuditInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas extends TeaModel {
        @NameInMap("Opened")
        public Boolean opened;

        @NameInMap("SchemaName")
        public String schemaName;

        public static QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas self = new QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas setOpened(Boolean opened) {
            this.opened = opened;
            return this;
        }
        public Boolean getOpened() {
            return this.opened;
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class QueryODPSqlAuditInstancesResponseBodyDataInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OpenedCount")
        public Long openedCount;

        @NameInMap("Schemas")
        public java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas> schemas;

        public static QueryODPSqlAuditInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditInstancesResponseBodyDataInstances self = new QueryODPSqlAuditInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstances setOpenedCount(Long openedCount) {
            this.openedCount = openedCount;
            return this;
        }
        public Long getOpenedCount() {
            return this.openedCount;
        }

        public QueryODPSqlAuditInstancesResponseBodyDataInstances setSchemas(java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstancesSchemas> getSchemas() {
            return this.schemas;
        }

    }

    public static class QueryODPSqlAuditInstancesResponseBodyData extends TeaModel {
        @NameInMap("SlsOpened")
        public Boolean slsOpened;

        @NameInMap("Instances")
        public java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstances> instances;

        public static QueryODPSqlAuditInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditInstancesResponseBodyData self = new QueryODPSqlAuditInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditInstancesResponseBodyData setSlsOpened(Boolean slsOpened) {
            this.slsOpened = slsOpened;
            return this;
        }
        public Boolean getSlsOpened() {
            return this.slsOpened;
        }

        public QueryODPSqlAuditInstancesResponseBodyData setInstances(java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<QueryODPSqlAuditInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

    }

}
