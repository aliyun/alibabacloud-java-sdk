// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysResponse extends TeaModel {
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

    @NameInMap("CustomerGateways")
    @Validation(required = true)
    public DescribeCustomerGatewaysResponseCustomerGateways customerGateways;

    public static DescribeCustomerGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewaysResponse self = new DescribeCustomerGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerGatewaysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCustomerGatewaysResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomerGatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomerGatewaysResponse setCustomerGateways(DescribeCustomerGatewaysResponseCustomerGateways customerGateways) {
        this.customerGateways = customerGateways;
        return this;
    }
    public DescribeCustomerGatewaysResponseCustomerGateways getCustomerGateways() {
        return this.customerGateways;
    }

    public static class DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway extends TeaModel {
        @NameInMap("CustomerGatewayId")
        @Validation(required = true)
        public String customerGatewayId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Asn")
        @Validation(required = true)
        public Integer asn;

        public static DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway self = new DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway setAsn(Integer asn) {
            this.asn = asn;
            return this;
        }
        public Integer getAsn() {
            return this.asn;
        }

    }

    public static class DescribeCustomerGatewaysResponseCustomerGateways extends TeaModel {
        @NameInMap("CustomerGateway")
        @Validation(required = true)
        public java.util.List<DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway> customerGateway;

        public static DescribeCustomerGatewaysResponseCustomerGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseCustomerGateways self = new DescribeCustomerGatewaysResponseCustomerGateways();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseCustomerGateways setCustomerGateway(java.util.List<DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway> customerGateway) {
            this.customerGateway = customerGateway;
            return this;
        }
        public java.util.List<DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway> getCustomerGateway() {
            return this.customerGateway;
        }

    }

}
