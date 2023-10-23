// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRuleResponseBody extends TeaModel {
    @NameInMap("BindVpcs")
    public java.util.List<DescribeResolverRuleResponseBodyBindVpcs> bindVpcs;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("ForwardIps")
    public java.util.List<DescribeResolverRuleResponseBodyForwardIps> forwardIps;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRuleResponseBody self = new DescribeResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRuleResponseBody setBindVpcs(java.util.List<DescribeResolverRuleResponseBodyBindVpcs> bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public java.util.List<DescribeResolverRuleResponseBodyBindVpcs> getBindVpcs() {
        return this.bindVpcs;
    }

    public DescribeResolverRuleResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeResolverRuleResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeResolverRuleResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeResolverRuleResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public DescribeResolverRuleResponseBody setForwardIps(java.util.List<DescribeResolverRuleResponseBodyForwardIps> forwardIps) {
        this.forwardIps = forwardIps;
        return this;
    }
    public java.util.List<DescribeResolverRuleResponseBodyForwardIps> getForwardIps() {
        return this.forwardIps;
    }

    public DescribeResolverRuleResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeResolverRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverRuleResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeResolverRuleResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeResolverRuleResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeResolverRuleResponseBody setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribeResolverRuleResponseBodyBindVpcs extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>Vpc ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcType")
        public String vpcType;

        @NameInMap("VpcUserId")
        public String vpcUserId;

        public static DescribeResolverRuleResponseBodyBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRuleResponseBodyBindVpcs self = new DescribeResolverRuleResponseBodyBindVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRuleResponseBodyBindVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public DescribeResolverRuleResponseBodyBindVpcs setVpcUserId(String vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public String getVpcUserId() {
            return this.vpcUserId;
        }

    }

    public static class DescribeResolverRuleResponseBodyForwardIps extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        public static DescribeResolverRuleResponseBodyForwardIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRuleResponseBodyForwardIps self = new DescribeResolverRuleResponseBodyForwardIps();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRuleResponseBodyForwardIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverRuleResponseBodyForwardIps setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
