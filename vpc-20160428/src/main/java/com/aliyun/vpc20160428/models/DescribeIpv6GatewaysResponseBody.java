// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Ipv6Gateways")
    public DescribeIpv6GatewaysResponseBodyIpv6Gateways ipv6Gateways;

    public static DescribeIpv6GatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysResponseBody self = new DescribeIpv6GatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpv6GatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6GatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6GatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6GatewaysResponseBody setIpv6Gateways(DescribeIpv6GatewaysResponseBodyIpv6Gateways ipv6Gateways) {
        this.ipv6Gateways = ipv6Gateways;
        return this;
    }
    public DescribeIpv6GatewaysResponseBodyIpv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Description")
        public String description;

        @NameInMap("Ipv6GatewayId")
        public String ipv6GatewayId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway self = new DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setIpv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeIpv6GatewaysResponseBodyIpv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> ipv6Gateway;

        public static DescribeIpv6GatewaysResponseBodyIpv6Gateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseBodyIpv6Gateways self = new DescribeIpv6GatewaysResponseBodyIpv6Gateways();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseBodyIpv6Gateways setIpv6Gateway(java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> ipv6Gateway) {
            this.ipv6Gateway = ipv6Gateway;
            return this;
        }
        public java.util.List<DescribeIpv6GatewaysResponseBodyIpv6GatewaysIpv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

    }

}
