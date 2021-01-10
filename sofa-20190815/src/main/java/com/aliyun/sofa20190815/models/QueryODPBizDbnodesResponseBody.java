// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPBizDbnodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPBizDbnodesResponseBodyData> data;

    public static QueryODPBizDbnodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPBizDbnodesResponseBody self = new QueryODPBizDbnodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPBizDbnodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPBizDbnodesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPBizDbnodesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPBizDbnodesResponseBody setData(java.util.List<QueryODPBizDbnodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPBizDbnodesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPBizDbnodesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("NetMode")
        public String netMode;

        @NameInMap("Port")
        public Long port;

        @NameInMap("VpcId")
        public String vpcId;

        public static QueryODPBizDbnodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPBizDbnodesResponseBodyData self = new QueryODPBizDbnodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPBizDbnodesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryODPBizDbnodesResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public QueryODPBizDbnodesResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public QueryODPBizDbnodesResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryODPBizDbnodesResponseBodyData setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public QueryODPBizDbnodesResponseBodyData setNetMode(String netMode) {
            this.netMode = netMode;
            return this;
        }
        public String getNetMode() {
            return this.netMode;
        }

        public QueryODPBizDbnodesResponseBodyData setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryODPBizDbnodesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
