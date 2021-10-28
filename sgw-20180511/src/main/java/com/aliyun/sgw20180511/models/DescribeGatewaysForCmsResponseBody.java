// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysForCmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Gateways")
    public DescribeGatewaysForCmsResponseBodyGateways gateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGatewaysForCmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysForCmsResponseBody self = new DescribeGatewaysForCmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysForCmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewaysForCmsResponseBody setGateways(DescribeGatewaysForCmsResponseBodyGateways gateways) {
        this.gateways = gateways;
        return this;
    }
    public DescribeGatewaysForCmsResponseBodyGateways getGateways() {
        return this.gateways;
    }

    public DescribeGatewaysForCmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewaysForCmsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewaysForCmsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewaysForCmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewaysForCmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewaysForCmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGatewaysForCmsResponseBodyGatewaysGateway extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("Name")
        public String name;

        public static DescribeGatewaysForCmsResponseBodyGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysForCmsResponseBodyGatewaysGateway self = new DescribeGatewaysForCmsResponseBodyGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysForCmsResponseBodyGatewaysGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGatewaysForCmsResponseBodyGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewaysForCmsResponseBodyGatewaysGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGatewaysForCmsResponseBodyGateways extends TeaModel {
        @NameInMap("Gateway")
        public java.util.List<DescribeGatewaysForCmsResponseBodyGatewaysGateway> gateway;

        public static DescribeGatewaysForCmsResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewaysForCmsResponseBodyGateways self = new DescribeGatewaysForCmsResponseBodyGateways();
            return TeaModel.build(map, self);
        }

        public DescribeGatewaysForCmsResponseBodyGateways setGateway(java.util.List<DescribeGatewaysForCmsResponseBodyGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<DescribeGatewaysForCmsResponseBodyGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

}
