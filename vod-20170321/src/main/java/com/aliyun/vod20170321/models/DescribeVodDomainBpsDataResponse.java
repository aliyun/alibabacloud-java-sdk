// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataResponse extends TeaModel {
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

    @NameInMap("LocationNameEn")
    @Validation(required = true)
    public String locationNameEn;

    @NameInMap("IspNameEn")
    @Validation(required = true)
    public String ispNameEn;

    @NameInMap("DataInterval")
    @Validation(required = true)
    public String dataInterval;

    @NameInMap("BpsDataPerInterval")
    @Validation(required = true)
    public DescribeVodDomainBpsDataResponseBpsDataPerInterval bpsDataPerInterval;

    public static DescribeVodDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataResponse self = new DescribeVodDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainBpsDataResponseBpsDataPerIntervalDataModule extends TeaModel {
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

        public static DescribeVodDomainBpsDataResponseBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataResponseBpsDataPerIntervalDataModule self = new DescribeVodDomainBpsDataResponseBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainBpsDataResponseBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainBpsDataResponseBpsDataPerIntervalDataModule> dataModule;

        public static DescribeVodDomainBpsDataResponseBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainBpsDataResponseBpsDataPerInterval self = new DescribeVodDomainBpsDataResponseBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

    }

}
