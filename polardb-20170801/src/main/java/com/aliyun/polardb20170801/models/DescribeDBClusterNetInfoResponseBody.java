// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    @NameInMap("DBClusterNetInfos")
    public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos DBClusterNetInfos;

    @NameInMap("DBNodeNetInfos")
    public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos DBNodeNetInfos;

    /**
     * <strong>example:</strong>
     * <p>72D99256-ACF1-5F86-831F-8CB53E9C23ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoResponseBody self = new DescribeDBClusterNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoResponseBody setClusterNetworkType(String clusterNetworkType) {
        this.clusterNetworkType = clusterNetworkType;
        return this;
    }
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    public DescribeDBClusterNetInfoResponseBody setDBClusterNetInfos(DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos DBClusterNetInfos) {
        this.DBClusterNetInfos = DBClusterNetInfos;
        return this;
    }
    public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos getDBClusterNetInfos() {
        return this.DBClusterNetInfos;
    }

    public DescribeDBClusterNetInfoResponseBody setDBNodeNetInfos(DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos DBNodeNetInfos) {
        this.DBNodeNetInfos = DBNodeNetInfos;
        return this;
    }
    public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos getDBNodeNetInfos() {
        return this.DBNodeNetInfos;
    }

    public DescribeDBClusterNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pc-****************.pg.polardb.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>MPP</p>
         */
        @NameInMap("ConnectionStringType")
        public String connectionStringType;

        /**
         * <strong>example:</strong>
         * <p>121.<em>.</em>.173</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <strong>example:</strong>
         * <p>1521</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1li3eavsz8oaexq15dw</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo self = new DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setConnectionStringType(String connectionStringType) {
            this.connectionStringType = connectionStringType;
            return this;
        }
        public String getConnectionStringType() {
            return this.connectionStringType;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos extends TeaModel {
        @NameInMap("DBClusterNetInfo")
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo> DBClusterNetInfo;

        public static DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos self = new DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBClusterNetInfos setDBClusterNetInfo(java.util.List<DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo> DBClusterNetInfo) {
            this.DBClusterNetInfo = DBClusterNetInfo;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBClusterNetInfosDBClusterNetInfo> getDBClusterNetInfo() {
            return this.DBClusterNetInfo;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pc-****************.pg.polardb.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>47.<em>.</em>.203</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>vpc-****************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-*************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo self = new DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos extends TeaModel {
        @NameInMap("NetInfo")
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo> netInfo;

        public static DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos self = new DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos setNetInfo(java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo> netInfo) {
            this.netInfo = netInfo;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfosNetInfo> getNetInfo() {
            return this.netInfo;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>Writer</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        @NameInMap("NetInfos")
        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos netInfos;

        public static DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo self = new DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo setNetInfos(DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos netInfos) {
            this.netInfos = netInfos;
            return this;
        }
        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfoNetInfos getNetInfos() {
            return this.netInfos;
        }

    }

    public static class DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos extends TeaModel {
        @NameInMap("DBNodeNetInfo")
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo> DBNodeNetInfo;

        public static DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos self = new DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNetInfoResponseBodyDBNodeNetInfos setDBNodeNetInfo(java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo> DBNodeNetInfo) {
            this.DBNodeNetInfo = DBNodeNetInfo;
            return this;
        }
        public java.util.List<DescribeDBClusterNetInfoResponseBodyDBNodeNetInfosDBNodeNetInfo> getDBNodeNetInfo() {
            return this.DBNodeNetInfo;
        }

    }

}
