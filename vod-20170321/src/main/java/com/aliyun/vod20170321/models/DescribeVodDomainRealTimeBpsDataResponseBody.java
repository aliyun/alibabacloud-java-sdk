// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeVodDomainRealTimeBpsDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeBpsDataResponseBody self = new DescribeVodDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeBpsDataResponseBody setData(DescribeVodDomainRealTimeBpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVodDomainRealTimeBpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeVodDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel extends TeaModel {
        @NameInMap("Bps")
        public Float bps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel self = new DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

        public DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeVodDomainRealTimeBpsDataResponseBodyData extends TeaModel {
        @NameInMap("BpsModel")
        public java.util.List<DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel;

        public static DescribeVodDomainRealTimeBpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainRealTimeBpsDataResponseBodyData self = new DescribeVodDomainRealTimeBpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainRealTimeBpsDataResponseBodyData setBpsModel(java.util.List<DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel) {
            this.bpsModel = bpsModel;
            return this;
        }
        public java.util.List<DescribeVodDomainRealTimeBpsDataResponseBodyDataBpsModel> getBpsModel() {
            return this.bpsModel;
        }

    }

}
