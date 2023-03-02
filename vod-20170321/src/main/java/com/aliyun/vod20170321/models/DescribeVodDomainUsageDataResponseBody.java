// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataResponseBody extends TeaModel {
    /**
     * <p>The region where the data was queried.</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The time interval between the returned entries. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The domain name for CDN.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range in which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range in which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the content based on which the data is generated. Valid values:</p>
     * <br>
     * <p>*   **static**</p>
     * <p>*   **dynamic**</p>
     * <p>*   **all**</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The details of traffic or bandwidth data.</p>
     */
    @NameInMap("UsageDataPerInterval")
    public DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval;

    public static DescribeVodDomainUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUsageDataResponseBody self = new DescribeVodDomainUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUsageDataResponseBody setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeVodDomainUsageDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeVodDomainUsageDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodDomainUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainUsageDataResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVodDomainUsageDataResponseBody setUsageDataPerInterval(DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval usageDataPerInterval) {
        this.usageDataPerInterval = usageDataPerInterval;
        return this;
    }
    public DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval getUsageDataPerInterval() {
        return this.usageDataPerInterval;
    }

    public static class DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule extends TeaModel {
        /**
         * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The traffic or bandwidth data. The unit of bandwidth is bit/s.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule self = new DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval self = new DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainUsageDataResponseBodyUsageDataPerInterval setDataModule(java.util.List<DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeVodDomainUsageDataResponseBodyUsageDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
