// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The network information about the backend (BE) clusters.</p>
     */
    @NameInMap("DBClustersNetInfos")
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos> DBClustersNetInfos;

    /**
     * <p>The network information about the instance.</p>
     */
    @NameInMap("DBInstanceNetInfos")
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos> DBInstanceNetInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponseBody setDBClustersNetInfos(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos> DBClustersNetInfos) {
        this.DBClustersNetInfos = DBClustersNetInfos;
        return this;
    }
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos> getDBClustersNetInfos() {
        return this.DBClustersNetInfos;
    }

    public DescribeDBInstanceNetInfoResponseBody setDBInstanceNetInfos(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos> DBInstanceNetInfos) {
        this.DBInstanceNetInfos = DBInstanceNetInfos;
        return this;
    }
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos> getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    public DescribeDBInstanceNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList extends TeaModel {
        /**
         * <p>The port that is used to connect to the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQLPort/HttpPort</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>9030/8080</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList self = new DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-****-be</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The connection string of the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address of the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8.131.<em><strong>.</strong></em></p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The network type of the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC/PUBLIC</p>
         */
        @NameInMap("NetType")
        public String netType;

        @NameInMap("PortList")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList> portList;

        /**
         * <p>Indicates whether the network information is visible to users.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("UserVisible")
        public Boolean userVisible;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-****-fe-20230816101006</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos self = new DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setPortList(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfosPortList> getPortList() {
            return this.portList;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setUserVisible(Boolean userVisible) {
            this.userVisible = userVisible;
            return this;
        }
        public Boolean getUserVisible() {
            return this.userVisible;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList extends TeaModel {
        /**
         * <p>The port that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQLPort</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol of the port. Valid values:</p>
         * <ul>
         * <li><strong>HttpPort</strong>: HTTP port.</li>
         * <li><strong>MySQLPort</strong>: MySQL port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9030</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-****-be</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The connection string of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-h033cnd****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: indicates a virtual private cloud (VPC)-connected instance.</li>
         * <li><strong>PUBLIC</strong>: indicates an Internet-connected instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The ports.</p>
         */
        @NameInMap("PortList")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList> portList;

        /**
         * <p>Indicates whether the network information is visible to users. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserVisible")
        public Boolean userVisible;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz90scxq6ods388ft****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-h033cnd****-fe-20230816101006</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6mlqti065rer6m0****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setPortList(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList> getPortList() {
            return this.portList;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setUserVisible(Boolean userVisible) {
            this.userVisible = userVisible;
            return this;
        }
        public Boolean getUserVisible() {
            return this.userVisible;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
