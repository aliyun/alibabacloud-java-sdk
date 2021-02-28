// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeScdnDomainRealTimeBpsDataResponseBodyData data;

    public static DescribeScdnDomainRealTimeBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeBpsDataResponseBody self = new DescribeScdnDomainRealTimeBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainRealTimeBpsDataResponseBody setData(DescribeScdnDomainRealTimeBpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScdnDomainRealTimeBpsDataResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("Bps")
        public Float bps;

        public static DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel self = new DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel setBps(Float bps) {
            this.bps = bps;
            return this;
        }
        public Float getBps() {
            return this.bps;
        }

    }

    public static class DescribeScdnDomainRealTimeBpsDataResponseBodyData extends TeaModel {
        @NameInMap("BpsModel")
        public java.util.List<DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel;

        public static DescribeScdnDomainRealTimeBpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeBpsDataResponseBodyData self = new DescribeScdnDomainRealTimeBpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeBpsDataResponseBodyData setBpsModel(java.util.List<DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel> bpsModel) {
            this.bpsModel = bpsModel;
            return this;
        }
        public java.util.List<DescribeScdnDomainRealTimeBpsDataResponseBodyDataBpsModel> getBpsModel() {
            return this.bpsModel;
        }

    }

}
