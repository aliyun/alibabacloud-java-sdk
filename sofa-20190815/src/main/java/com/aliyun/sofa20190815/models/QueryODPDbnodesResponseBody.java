// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPDbnodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPDbnodesResponseBodyData data;

    public static QueryODPDbnodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPDbnodesResponseBody self = new QueryODPDbnodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPDbnodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPDbnodesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPDbnodesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPDbnodesResponseBody setData(QueryODPDbnodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPDbnodesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPDbnodesResponseBodyDataDatacenterVipMapping extends TeaModel {
        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("DbUrl")
        public String dbUrl;

        public static QueryODPDbnodesResponseBodyDataDatacenterVipMapping build(java.util.Map<String, ?> map) throws Exception {
            QueryODPDbnodesResponseBodyDataDatacenterVipMapping self = new QueryODPDbnodesResponseBodyDataDatacenterVipMapping();
            return TeaModel.build(map, self);
        }

        public QueryODPDbnodesResponseBodyDataDatacenterVipMapping setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public QueryODPDbnodesResponseBodyDataDatacenterVipMapping setDbUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }
        public String getDbUrl() {
            return this.dbUrl;
        }

    }

    public static class QueryODPDbnodesResponseBodyData extends TeaModel {
        @NameInMap("CheckDbStatus")
        public Boolean checkDbStatus;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastProbeTime")
        public String lastProbeTime;

        @NameInMap("NetMode")
        public String netMode;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OverMaxRetryCount")
        public Boolean overMaxRetryCount;

        @NameInMap("Password")
        public String password;

        @NameInMap("ProbeFailMsg")
        public String probeFailMsg;

        @NameInMap("Status")
        public String status;

        @NameInMap("Url")
        public String url;

        @NameInMap("Username")
        public String username;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("DatacenterVipMapping")
        public java.util.List<QueryODPDbnodesResponseBodyDataDatacenterVipMapping> datacenterVipMapping;

        public static QueryODPDbnodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPDbnodesResponseBodyData self = new QueryODPDbnodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPDbnodesResponseBodyData setCheckDbStatus(Boolean checkDbStatus) {
            this.checkDbStatus = checkDbStatus;
            return this;
        }
        public Boolean getCheckDbStatus() {
            return this.checkDbStatus;
        }

        public QueryODPDbnodesResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public QueryODPDbnodesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryODPDbnodesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPDbnodesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPDbnodesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPDbnodesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPDbnodesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPDbnodesResponseBodyData setLastProbeTime(String lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }
        public String getLastProbeTime() {
            return this.lastProbeTime;
        }

        public QueryODPDbnodesResponseBodyData setNetMode(String netMode) {
            this.netMode = netMode;
            return this;
        }
        public String getNetMode() {
            return this.netMode;
        }

        public QueryODPDbnodesResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public QueryODPDbnodesResponseBodyData setOverMaxRetryCount(Boolean overMaxRetryCount) {
            this.overMaxRetryCount = overMaxRetryCount;
            return this;
        }
        public Boolean getOverMaxRetryCount() {
            return this.overMaxRetryCount;
        }

        public QueryODPDbnodesResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryODPDbnodesResponseBodyData setProbeFailMsg(String probeFailMsg) {
            this.probeFailMsg = probeFailMsg;
            return this;
        }
        public String getProbeFailMsg() {
            return this.probeFailMsg;
        }

        public QueryODPDbnodesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryODPDbnodesResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryODPDbnodesResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryODPDbnodesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryODPDbnodesResponseBodyData setDatacenterVipMapping(java.util.List<QueryODPDbnodesResponseBodyDataDatacenterVipMapping> datacenterVipMapping) {
            this.datacenterVipMapping = datacenterVipMapping;
            return this;
        }
        public java.util.List<QueryODPDbnodesResponseBodyDataDatacenterVipMapping> getDatacenterVipMapping() {
            return this.datacenterVipMapping;
        }

    }

}
