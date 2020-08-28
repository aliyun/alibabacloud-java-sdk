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

    }

    public static class DescribeCustomerGatewaysResponseCustomerGateways extends TeaModel {
        @NameInMap("CustomerGateway")
        @Validation(required = true)
        public java.util.List<DescribeCustomerGatewaysResponseCustomerGatewaysCustomerGateway> customerGateway;

        public static DescribeCustomerGatewaysResponseCustomerGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseCustomerGateways self = new DescribeCustomerGatewaysResponseCustomerGateways();
            return TeaModel.build(map, self);
        }

    }

}
