// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeResolverRulesResponseBodyRules> rules;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeResolverRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverRulesResponseBody self = new DescribeResolverRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResolverRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResolverRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResolverRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResolverRulesResponseBody setRules(java.util.List<DescribeResolverRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeResolverRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeResolverRulesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeResolverRulesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeResolverRulesResponseBodyRulesBindVpcs extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcType")
        public String vpcType;

        public static DescribeResolverRulesResponseBodyRulesBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesBindVpcs self = new DescribeResolverRulesResponseBodyRulesBindVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeResolverRulesResponseBodyRulesBindVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

    public static class DescribeResolverRulesResponseBodyRulesForwardIps extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        public static DescribeResolverRulesResponseBodyRulesForwardIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRulesForwardIps self = new DescribeResolverRulesResponseBodyRulesForwardIps();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRulesForwardIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeResolverRulesResponseBodyRulesForwardIps setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeResolverRulesResponseBodyRules extends TeaModel {
        @NameInMap("BindVpcs")
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> bindVpcs;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("ForwardIps")
        public java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> forwardIps;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeResolverRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeResolverRulesResponseBodyRules self = new DescribeResolverRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeResolverRulesResponseBodyRules setBindVpcs(java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesBindVpcs> getBindVpcs() {
            return this.bindVpcs;
        }

        public DescribeResolverRulesResponseBodyRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeResolverRulesResponseBodyRules setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeResolverRulesResponseBodyRules setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeResolverRulesResponseBodyRules setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeResolverRulesResponseBodyRules setForwardIps(java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> forwardIps) {
            this.forwardIps = forwardIps;
            return this;
        }
        public java.util.List<DescribeResolverRulesResponseBodyRulesForwardIps> getForwardIps() {
            return this.forwardIps;
        }

        public DescribeResolverRulesResponseBodyRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResolverRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResolverRulesResponseBodyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeResolverRulesResponseBodyRules setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeResolverRulesResponseBodyRules setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeResolverRulesResponseBodyRules setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
