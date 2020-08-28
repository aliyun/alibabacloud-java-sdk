// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Area")
    @Validation(required = true)
    public String area;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("UsageDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainUsageDataResponseUsageDataPerInterval usageDataPerInterval;

    public static DescribeVodDomainUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUsageDataResponse self = new DescribeVodDomainUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainUsageDataResponseUsageDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeVodDomainUsageDataResponseUsageDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUsageDataResponseUsageDataPerIntervalDataModule self = new DescribeVodDomainUsageDataResponseUsageDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainUsageDataResponseUsageDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainUsageDataResponseUsageDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainUsageDataResponseUsageDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainUsageDataResponseUsageDataPerInterval self = new DescribeVodDomainUsageDataResponseUsageDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
