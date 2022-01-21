// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosCarsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QosCars")
    public DescribeQosCarsResponseBodyQosCars qosCars;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeQosCarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosCarsResponseBody self = new DescribeQosCarsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQosCarsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeQosCarsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeQosCarsResponseBody setQosCars(DescribeQosCarsResponseBodyQosCars qosCars) {
        this.qosCars = qosCars;
        return this;
    }
    public DescribeQosCarsResponseBodyQosCars getQosCars() {
        return this.qosCars;
    }

    public DescribeQosCarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQosCarsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeQosCarsResponseBodyQosCarsQosCar extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("MaxBandwidthAbs")
        public Integer maxBandwidthAbs;

        @NameInMap("MaxBandwidthPercent")
        public Integer maxBandwidthPercent;

        @NameInMap("MinBandwidthAbs")
        public Integer minBandwidthAbs;

        @NameInMap("MinBandwidthPercent")
        public Integer minBandwidthPercent;

        @NameInMap("Name")
        public String name;

        @NameInMap("PercentSourceType")
        public String percentSourceType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("QosCarId")
        public String qosCarId;

        @NameInMap("QosId")
        public String qosId;

        public static DescribeQosCarsResponseBodyQosCarsQosCar build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosCarsResponseBodyQosCarsQosCar self = new DescribeQosCarsResponseBodyQosCarsQosCar();
            return TeaModel.build(map, self);
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setMaxBandwidthAbs(Integer maxBandwidthAbs) {
            this.maxBandwidthAbs = maxBandwidthAbs;
            return this;
        }
        public Integer getMaxBandwidthAbs() {
            return this.maxBandwidthAbs;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setMaxBandwidthPercent(Integer maxBandwidthPercent) {
            this.maxBandwidthPercent = maxBandwidthPercent;
            return this;
        }
        public Integer getMaxBandwidthPercent() {
            return this.maxBandwidthPercent;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setMinBandwidthAbs(Integer minBandwidthAbs) {
            this.minBandwidthAbs = minBandwidthAbs;
            return this;
        }
        public Integer getMinBandwidthAbs() {
            return this.minBandwidthAbs;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setMinBandwidthPercent(Integer minBandwidthPercent) {
            this.minBandwidthPercent = minBandwidthPercent;
            return this;
        }
        public Integer getMinBandwidthPercent() {
            return this.minBandwidthPercent;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setPercentSourceType(String percentSourceType) {
            this.percentSourceType = percentSourceType;
            return this;
        }
        public String getPercentSourceType() {
            return this.percentSourceType;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setQosCarId(String qosCarId) {
            this.qosCarId = qosCarId;
            return this;
        }
        public String getQosCarId() {
            return this.qosCarId;
        }

        public DescribeQosCarsResponseBodyQosCarsQosCar setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

    }

    public static class DescribeQosCarsResponseBodyQosCars extends TeaModel {
        @NameInMap("QosCar")
        public java.util.List<DescribeQosCarsResponseBodyQosCarsQosCar> qosCar;

        public static DescribeQosCarsResponseBodyQosCars build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosCarsResponseBodyQosCars self = new DescribeQosCarsResponseBodyQosCars();
            return TeaModel.build(map, self);
        }

        public DescribeQosCarsResponseBodyQosCars setQosCar(java.util.List<DescribeQosCarsResponseBodyQosCarsQosCar> qosCar) {
            this.qosCar = qosCar;
            return this;
        }
        public java.util.List<DescribeQosCarsResponseBodyQosCarsQosCar> getQosCar() {
            return this.qosCar;
        }

    }

}
