// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Ipv6Gateways")
    @Validation(required = true)
    public DescribeIpv6GatewaysResponseIpv6Gateways ipv6Gateways;

    public static DescribeIpv6GatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysResponse self = new DescribeIpv6GatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6GatewaysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpv6GatewaysResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6GatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6GatewaysResponse setIpv6Gateways(DescribeIpv6GatewaysResponseIpv6Gateways ipv6Gateways) {
        this.ipv6Gateways = ipv6Gateways;
        return this;
    }
    public DescribeIpv6GatewaysResponseIpv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
    }

    public static class DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Ipv6GatewayId")
        @Validation(required = true)
        public String ipv6GatewayId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway self = new DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setIpv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        public String getIpv6GatewayId() {
            return this.ipv6GatewayId;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

    public static class DescribeIpv6GatewaysResponseIpv6Gateways extends TeaModel {
        @NameInMap("Ipv6Gateway")
        @Validation(required = true)
        public java.util.List<DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway> ipv6Gateway;

        public static DescribeIpv6GatewaysResponseIpv6Gateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6GatewaysResponseIpv6Gateways self = new DescribeIpv6GatewaysResponseIpv6Gateways();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6GatewaysResponseIpv6Gateways setIpv6Gateway(java.util.List<DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway> ipv6Gateway) {
            this.ipv6Gateway = ipv6Gateway;
            return this;
        }
        public java.util.List<DescribeIpv6GatewaysResponseIpv6GatewaysIpv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

    }

}
