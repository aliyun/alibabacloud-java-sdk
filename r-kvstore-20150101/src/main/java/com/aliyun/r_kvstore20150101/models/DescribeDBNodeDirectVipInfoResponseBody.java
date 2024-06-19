// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBNodeDirectVipInfoResponseBody extends TeaModel {
    /**
     * <p>The virtual IP addresses (VIPs) of shards in an ApsaraDB for Redis cluster instance.</p>
     */
    @NameInMap("DirectVipInfo")
    public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo directVipInfo;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBNodeDirectVipInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodeDirectVipInfoResponseBody self = new DescribeDBNodeDirectVipInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodeDirectVipInfoResponseBody setDirectVipInfo(DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo directVipInfo) {
        this.directVipInfo = directVipInfo;
        return this;
    }
    public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo getDirectVipInfo() {
        return this.directVipInfo;
    }

    public DescribeDBNodeDirectVipInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBNodeDirectVipInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo extends TeaModel {
        /**
         * <p>The network type of the security group. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong>: Virtual Private Cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The shard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-8vb3679b04551444-db-2</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The port number. Valid values: <strong>1024</strong> to <strong>65535</strong>. Default value: <strong>6379</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The VIP of the shard.</p>
         * 
         * <strong>example:</strong>
         * <p>100.115.61.8</p>
         */
        @NameInMap("Vip")
        public String vip;

        public static DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo self = new DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

    public static class DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo extends TeaModel {
        @NameInMap("VipInfo")
        public java.util.List<DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo> vipInfo;

        public static DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo self = new DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo setVipInfo(java.util.List<DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo> vipInfo) {
            this.vipInfo = vipInfo;
            return this;
        }
        public java.util.List<DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfoVipInfo> getVipInfo() {
            return this.vipInfo;
        }

    }

}
