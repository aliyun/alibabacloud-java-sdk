// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The network information list of the BE instances.</p>
     */
    @NameInMap("DBClustersNetInfos")
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBClustersNetInfos> DBClustersNetInfos;

    /**
     * <p>The network information of the instance.</p>
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
         * <p>The connection port number.</p>
         * 
         * <strong>example:</strong>
         * <p>9030/8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The port type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQLPort/HttpPort</p>
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
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>8.131.<em><strong>.</strong></em></p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC/PUBLIC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port list.</p>
         */
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
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC instance ID.</p>
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
         * <p>The connection port number.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQLPort</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The port type. Valid values:</p>
         * <ul>
         * <li><p><strong>HttpPort</strong>: HTTP protocol port.</p>
         * </li>
         * <li><p><strong>MySQLPort</strong>: MySQL protocol port.</p>
         * </li>
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
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-h033cnd****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: virtual private cloud (VPC).</p>
         * </li>
         * <li><p><strong>PUBLIC</strong>: Internet.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port objects.</p>
         */
        @NameInMap("PortList")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList> portList;

        /**
         * <p>Indicates whether the network information is visible to users. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Visible to users.</p>
         * </li>
         * <li><p><strong>false</strong>: Not visible to users.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserVisible")
        public Boolean userVisible;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz90scxq6ods388ft****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC instance ID.</p>
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
