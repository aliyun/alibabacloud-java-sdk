// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataResponse extends TeaModel {
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

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("TrafficDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainTrafficDataResponseTrafficDataPerInterval trafficDataPerInterval;

    public static DescribeVodDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTrafficDataResponse self = new DescribeVodDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainTrafficDataResponseTrafficDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("DomesticValue")
        @Validation(required = true)
        public String domesticValue;

        @NameInMap("OverseasValue")
        @Validation(required = true)
        public String overseasValue;

        @NameInMap("HttpsValue")
        @Validation(required = true)
        public String httpsValue;

        @NameInMap("HttpsDomesticValue")
        @Validation(required = true)
        public String httpsDomesticValue;

        @NameInMap("HttpsOverseasValue")
        @Validation(required = true)
        public String httpsOverseasValue;

        public static DescribeVodDomainTrafficDataResponseTrafficDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseTrafficDataPerIntervalDataModule self = new DescribeVodDomainTrafficDataResponseTrafficDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainTrafficDataResponseTrafficDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainTrafficDataResponseTrafficDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainTrafficDataResponseTrafficDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainTrafficDataResponseTrafficDataPerInterval self = new DescribeVodDomainTrafficDataResponseTrafficDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
