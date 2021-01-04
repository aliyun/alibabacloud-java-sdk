// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationSagsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SmartAccessGateways")
    public DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways smartAccessGateways;

    public static DescribeNetworkOptimizationSagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationSagsResponseBody self = new DescribeNetworkOptimizationSagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationSagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkOptimizationSagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkOptimizationSagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkOptimizationSagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkOptimizationSagsResponseBody setSmartAccessGateways(DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways smartAccessGateways) {
        this.smartAccessGateways = smartAccessGateways;
        return this;
    }
    public DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    public static class DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("MaxBandwidth")
        public String maxBandwidth;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        public static DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway self = new DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setMaxBandwidth(String maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public String getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways extends TeaModel {
        @NameInMap("SmartAccessGateway")
        public java.util.List<DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway;

        public static DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways self = new DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationSagsResponseBodySmartAccessGateways setSmartAccessGateway(java.util.List<DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway) {
            this.smartAccessGateway = smartAccessGateway;
            return this;
        }
        public java.util.List<DescribeNetworkOptimizationSagsResponseBodySmartAccessGatewaysSmartAccessGateway> getSmartAccessGateway() {
            return this.smartAccessGateway;
        }

    }

}
