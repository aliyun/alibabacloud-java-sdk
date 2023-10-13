// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @NameInMap("DBInstanceNetInfos")
    public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos> DBInstanceNetInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList extends TeaModel {
        @NameInMap("Port")
        public Integer port;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("PortList")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosPortList> portList;

        @NameInMap("UserVisible")
        public Boolean userVisible;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos();
            return TeaModel.build(map, self);
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
