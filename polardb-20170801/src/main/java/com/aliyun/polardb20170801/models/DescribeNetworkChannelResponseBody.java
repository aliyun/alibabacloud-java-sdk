// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeNetworkChannelResponseBody extends TeaModel {
    @NameInMap("ChannelInfos")
    public java.util.List<DescribeNetworkChannelResponseBodyChannelInfos> channelInfos;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkChannelResponseBody self = new DescribeNetworkChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkChannelResponseBody setChannelInfos(java.util.List<DescribeNetworkChannelResponseBodyChannelInfos> channelInfos) {
        this.channelInfos = channelInfos;
        return this;
    }
    public java.util.List<DescribeNetworkChannelResponseBodyChannelInfos> getChannelInfos() {
        return this.channelInfos;
    }

    public DescribeNetworkChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkChannelResponseBodyChannelInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ch4</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>test update</p>
         */
        @NameInMap("Notes")
        public String notes;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        @NameInMap("TargetDBClusterId")
        public String targetDBClusterId;

        /**
         * <strong>example:</strong>
         * <p>33.<em>.</em>.240</p>
         */
        @NameInMap("TargetIp")
        public String targetIp;

        /**
         * <strong>example:</strong>
         * <p>3389</p>
         */
        @NameInMap("TargetPort")
        public String targetPort;

        /**
         * <strong>example:</strong>
         * <p>polardb_for_postgresql</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>vpc-2ze13g2c6j7j2jl*******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNetworkChannelResponseBodyChannelInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkChannelResponseBodyChannelInfos self = new DescribeNetworkChannelResponseBodyChannelInfos();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setNotes(String notes) {
            this.notes = notes;
            return this;
        }
        public String getNotes() {
            return this.notes;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setTargetDBClusterId(String targetDBClusterId) {
            this.targetDBClusterId = targetDBClusterId;
            return this;
        }
        public String getTargetDBClusterId() {
            return this.targetDBClusterId;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setTargetIp(String targetIp) {
            this.targetIp = targetIp;
            return this;
        }
        public String getTargetIp() {
            return this.targetIp;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeNetworkChannelResponseBodyChannelInfos setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
