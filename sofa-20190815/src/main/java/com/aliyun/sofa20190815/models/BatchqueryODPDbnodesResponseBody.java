// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPDbnodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPDbnodesResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPDbnodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPDbnodesResponseBody self = new BatchqueryODPDbnodesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPDbnodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPDbnodesResponseBody setData(java.util.List<BatchqueryODPDbnodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPDbnodesResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPDbnodesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPDbnodesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping extends TeaModel {
        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("DbUrl")
        public String dbUrl;

        public static BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping self = new BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping setDbUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }
        public String getDbUrl() {
            return this.dbUrl;
        }

    }

    public static class BatchqueryODPDbnodesResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("OverMaxRetryCount")
        public Boolean overMaxRetryCount;

        @NameInMap("ProbeFailMsg")
        public String probeFailMsg;

        @NameInMap("Url")
        public String url;

        @NameInMap("LastProbeTime")
        public String lastProbeTime;

        @NameInMap("DatacenterVipMapping")
        public java.util.List<BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping> datacenterVipMapping;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Password")
        public String password;

        @NameInMap("Description")
        public String description;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("NetMode")
        public String netMode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("CheckDbStatus")
        public Boolean checkDbStatus;

        @NameInMap("Username")
        public String username;

        public static BatchqueryODPDbnodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPDbnodesResponseBodyData self = new BatchqueryODPDbnodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPDbnodesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchqueryODPDbnodesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public BatchqueryODPDbnodesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPDbnodesResponseBodyData setOverMaxRetryCount(Boolean overMaxRetryCount) {
            this.overMaxRetryCount = overMaxRetryCount;
            return this;
        }
        public Boolean getOverMaxRetryCount() {
            return this.overMaxRetryCount;
        }

        public BatchqueryODPDbnodesResponseBodyData setProbeFailMsg(String probeFailMsg) {
            this.probeFailMsg = probeFailMsg;
            return this;
        }
        public String getProbeFailMsg() {
            return this.probeFailMsg;
        }

        public BatchqueryODPDbnodesResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public BatchqueryODPDbnodesResponseBodyData setLastProbeTime(String lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }
        public String getLastProbeTime() {
            return this.lastProbeTime;
        }

        public BatchqueryODPDbnodesResponseBodyData setDatacenterVipMapping(java.util.List<BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping> datacenterVipMapping) {
            this.datacenterVipMapping = datacenterVipMapping;
            return this;
        }
        public java.util.List<BatchqueryODPDbnodesResponseBodyDataDatacenterVipMapping> getDatacenterVipMapping() {
            return this.datacenterVipMapping;
        }

        public BatchqueryODPDbnodesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPDbnodesResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public BatchqueryODPDbnodesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchqueryODPDbnodesResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public BatchqueryODPDbnodesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPDbnodesResponseBodyData setNetMode(String netMode) {
            this.netMode = netMode;
            return this;
        }
        public String getNetMode() {
            return this.netMode;
        }

        public BatchqueryODPDbnodesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPDbnodesResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public BatchqueryODPDbnodesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchqueryODPDbnodesResponseBodyData setCheckDbStatus(Boolean checkDbStatus) {
            this.checkDbStatus = checkDbStatus;
            return this;
        }
        public Boolean getCheckDbStatus() {
            return this.checkDbStatus;
        }

        public BatchqueryODPDbnodesResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
