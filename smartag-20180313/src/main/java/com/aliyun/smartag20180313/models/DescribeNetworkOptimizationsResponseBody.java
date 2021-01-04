// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationsResponseBody extends TeaModel {
    @NameInMap("NetworkOptimizations")
    public DescribeNetworkOptimizationsResponseBodyNetworkOptimizations networkOptimizations;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeNetworkOptimizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationsResponseBody self = new DescribeNetworkOptimizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationsResponseBody setNetworkOptimizations(DescribeNetworkOptimizationsResponseBodyNetworkOptimizations networkOptimizations) {
        this.networkOptimizations = networkOptimizations;
        return this;
    }
    public DescribeNetworkOptimizationsResponseBodyNetworkOptimizations getNetworkOptimizations() {
        return this.networkOptimizations;
    }

    public DescribeNetworkOptimizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkOptimizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkOptimizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkOptimizationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization extends TeaModel {
        @NameInMap("SagCount")
        public Integer sagCount;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CcnId")
        public String ccnId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        public static DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization self = new DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setSagCount(Integer sagCount) {
            this.sagCount = sagCount;
            return this;
        }
        public Integer getSagCount() {
            return this.sagCount;
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeNetworkOptimizationsResponseBodyNetworkOptimizations extends TeaModel {
        @NameInMap("NetworkOptimization")
        public java.util.List<DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization> networkOptimization;

        public static DescribeNetworkOptimizationsResponseBodyNetworkOptimizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkOptimizationsResponseBodyNetworkOptimizations self = new DescribeNetworkOptimizationsResponseBodyNetworkOptimizations();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkOptimizationsResponseBodyNetworkOptimizations setNetworkOptimization(java.util.List<DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization> networkOptimization) {
            this.networkOptimization = networkOptimization;
            return this;
        }
        public java.util.List<DescribeNetworkOptimizationsResponseBodyNetworkOptimizationsNetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

    }

}
