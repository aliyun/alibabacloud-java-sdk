// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CustomerGateways")
    public DescribeCustomerGatewaysResponseBodyCustomerGateways customerGateways;

    public static DescribeCustomerGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewaysResponseBody self = new DescribeCustomerGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCustomerGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomerGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomerGatewaysResponseBody setCustomerGateways(DescribeCustomerGatewaysResponseBodyCustomerGateways customerGateways) {
        this.customerGateways = customerGateways;
        return this;
    }
    public DescribeCustomerGatewaysResponseBodyCustomerGateways getCustomerGateways() {
        return this.customerGateways;
    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Asn")
        public Integer asn;

        @NameInMap("Description")
        public String description;

        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Name")
        public String name;

        public static DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway self = new DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setAsn(Integer asn) {
            this.asn = asn;
            return this;
        }
        public Integer getAsn() {
            return this.asn;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGateways extends TeaModel {
        @NameInMap("CustomerGateway")
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> customerGateway;

        public static DescribeCustomerGatewaysResponseBodyCustomerGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGateways self = new DescribeCustomerGatewaysResponseBodyCustomerGateways();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGateways setCustomerGateway(java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> customerGateway) {
            this.customerGateway = customerGateway;
            return this;
        }
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> getCustomerGateway() {
            return this.customerGateway;
        }

    }

}
