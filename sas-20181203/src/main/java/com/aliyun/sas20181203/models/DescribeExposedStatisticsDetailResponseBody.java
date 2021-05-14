// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo;

    @NameInMap("StatisticsDetails")
    public java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> statisticsDetails;

    public static DescribeExposedStatisticsDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailResponseBody self = new DescribeExposedStatisticsDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedStatisticsDetailResponseBody setPageInfo(DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeExposedStatisticsDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeExposedStatisticsDetailResponseBody setStatisticsDetails(java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> statisticsDetails) {
        this.statisticsDetails = statisticsDetails;
        return this;
    }
    public java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> getStatisticsDetails() {
        return this.statisticsDetails;
    }

    public static class DescribeExposedStatisticsDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeExposedStatisticsDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedStatisticsDetailResponseBodyPageInfo self = new DescribeExposedStatisticsDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeExposedStatisticsDetailResponseBodyStatisticsDetails extends TeaModel {
        @NameInMap("ExposureIp")
        public String exposureIp;

        @NameInMap("ExposurePort")
        public String exposurePort;

        @NameInMap("ExposureTypeInstanceName")
        public String exposureTypeInstanceName;

        @NameInMap("ExposedCount")
        public Integer exposedCount;

        @NameInMap("ExposureType")
        public String exposureType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ExposureComponent")
        public String exposureComponent;

        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        public static DescribeExposedStatisticsDetailResponseBodyStatisticsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedStatisticsDetailResponseBodyStatisticsDetails self = new DescribeExposedStatisticsDetailResponseBodyStatisticsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureIp(String exposureIp) {
            this.exposureIp = exposureIp;
            return this;
        }
        public String getExposureIp() {
            return this.exposureIp;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposurePort(String exposurePort) {
            this.exposurePort = exposurePort;
            return this;
        }
        public String getExposurePort() {
            return this.exposurePort;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureTypeInstanceName(String exposureTypeInstanceName) {
            this.exposureTypeInstanceName = exposureTypeInstanceName;
            return this;
        }
        public String getExposureTypeInstanceName() {
            return this.exposureTypeInstanceName;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposedCount(Integer exposedCount) {
            this.exposedCount = exposedCount;
            return this;
        }
        public Integer getExposedCount() {
            return this.exposedCount;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureType(String exposureType) {
            this.exposureType = exposureType;
            return this;
        }
        public String getExposureType() {
            return this.exposureType;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureComponent(String exposureComponent) {
            this.exposureComponent = exposureComponent;
            return this;
        }
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureTypeId(String exposureTypeId) {
            this.exposureTypeId = exposureTypeId;
            return this;
        }
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

    }

}
