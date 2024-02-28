// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBNodeDirectVipInfoResponseBody extends TeaModel {
    /**
     * <p>The VIPs of shards in the cluster instance.</p>
     */
    @NameInMap("DirectVipInfo")
    public DescribeDBNodeDirectVipInfoResponseBodyDirectVipInfo directVipInfo;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
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
         * <br>
         * <p>*   **vpc**: Virtual Private Cloud (VPC)</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The shard ID.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The port number. Valid values: **1024** to **65535**. Default value: **6379**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The VIP of the shard.</p>
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
