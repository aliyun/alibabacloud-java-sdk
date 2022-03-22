// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeQpsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeScdnDomainRealTimeQpsDataResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnDomainRealTimeQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeQpsDataResponseBody self = new DescribeScdnDomainRealTimeQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeQpsDataResponseBody setData(DescribeScdnDomainRealTimeQpsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScdnDomainRealTimeQpsDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeScdnDomainRealTimeQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel extends TeaModel {
        @NameInMap("Qps")
        public Float qps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel self = new DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeScdnDomainRealTimeQpsDataResponseBodyData extends TeaModel {
        @NameInMap("QpsModel")
        public java.util.List<DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel;

        public static DescribeScdnDomainRealTimeQpsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainRealTimeQpsDataResponseBodyData self = new DescribeScdnDomainRealTimeQpsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainRealTimeQpsDataResponseBodyData setQpsModel(java.util.List<DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel> qpsModel) {
            this.qpsModel = qpsModel;
            return this;
        }
        public java.util.List<DescribeScdnDomainRealTimeQpsDataResponseBodyDataQpsModel> getQpsModel() {
            return this.qpsModel;
        }

    }

}
