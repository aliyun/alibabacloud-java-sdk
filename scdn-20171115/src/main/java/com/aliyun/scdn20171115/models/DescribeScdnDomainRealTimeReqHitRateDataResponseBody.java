// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeReqHitRateDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData data;

    public static DescribeScdnDomainRealTimeReqHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeReqHitRateDataResponseBody self = new DescribeScdnDomainRealTimeReqHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponseBody setData(DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel extends TeaModel {
        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel self = new DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setReqHitRate(Float reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData extends TeaModel {
        @NameInMap("ReqHitRateDataModel")
        public java.util.List<DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel;

        public static DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData self = new DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeReqHitRateDataResponseBodyData setReqHitRateDataModel(java.util.List<DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> reqHitRateDataModel) {
            this.reqHitRateDataModel = reqHitRateDataModel;
            return this;
        }
        public java.util.List<DescribeScdnDomainRealTimeReqHitRateDataResponseBodyDataReqHitRateDataModel> getReqHitRateDataModel() {
            return this.reqHitRateDataModel;
        }

    }

}
