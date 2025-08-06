// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCDNStatisSumResponseBody extends TeaModel {
    @NameInMap("CDNStatisList")
    public GetCDNStatisSumResponseBodyCDNStatisList CDNStatisList;

    @NameInMap("MaxBpsDataValue")
    public Long maxBpsDataValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SumFlowDataValue")
    public Long sumFlowDataValue;

    public static GetCDNStatisSumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisSumResponseBody self = new GetCDNStatisSumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCDNStatisSumResponseBody setCDNStatisList(GetCDNStatisSumResponseBodyCDNStatisList CDNStatisList) {
        this.CDNStatisList = CDNStatisList;
        return this;
    }
    public GetCDNStatisSumResponseBodyCDNStatisList getCDNStatisList() {
        return this.CDNStatisList;
    }

    public GetCDNStatisSumResponseBody setMaxBpsDataValue(Long maxBpsDataValue) {
        this.maxBpsDataValue = maxBpsDataValue;
        return this;
    }
    public Long getMaxBpsDataValue() {
        return this.maxBpsDataValue;
    }

    public GetCDNStatisSumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCDNStatisSumResponseBody setSumFlowDataValue(Long sumFlowDataValue) {
        this.sumFlowDataValue = sumFlowDataValue;
        return this;
    }
    public Long getSumFlowDataValue() {
        return this.sumFlowDataValue;
    }

    public static class GetCDNStatisSumResponseBodyCDNStatisListCDNMetric extends TeaModel {
        @NameInMap("BpsDataDomesticValue")
        public Long bpsDataDomesticValue;

        @NameInMap("BpsDataOverseasValue")
        public Long bpsDataOverseasValue;

        @NameInMap("BpsDataValue")
        public Long bpsDataValue;

        @NameInMap("FlowDataDomesticValue")
        public Long flowDataDomesticValue;

        @NameInMap("FlowDataOverseasValue")
        public Long flowDataOverseasValue;

        @NameInMap("FlowDataValue")
        public Long flowDataValue;

        @NameInMap("StatTime")
        public String statTime;

        public static GetCDNStatisSumResponseBodyCDNStatisListCDNMetric build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisSumResponseBodyCDNStatisListCDNMetric self = new GetCDNStatisSumResponseBodyCDNStatisListCDNMetric();
            return TeaModel.build(map, self);
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setBpsDataDomesticValue(Long bpsDataDomesticValue) {
            this.bpsDataDomesticValue = bpsDataDomesticValue;
            return this;
        }
        public Long getBpsDataDomesticValue() {
            return this.bpsDataDomesticValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setBpsDataOverseasValue(Long bpsDataOverseasValue) {
            this.bpsDataOverseasValue = bpsDataOverseasValue;
            return this;
        }
        public Long getBpsDataOverseasValue() {
            return this.bpsDataOverseasValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setBpsDataValue(Long bpsDataValue) {
            this.bpsDataValue = bpsDataValue;
            return this;
        }
        public Long getBpsDataValue() {
            return this.bpsDataValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setFlowDataDomesticValue(Long flowDataDomesticValue) {
            this.flowDataDomesticValue = flowDataDomesticValue;
            return this;
        }
        public Long getFlowDataDomesticValue() {
            return this.flowDataDomesticValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setFlowDataOverseasValue(Long flowDataOverseasValue) {
            this.flowDataOverseasValue = flowDataOverseasValue;
            return this;
        }
        public Long getFlowDataOverseasValue() {
            return this.flowDataOverseasValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setFlowDataValue(Long flowDataValue) {
            this.flowDataValue = flowDataValue;
            return this;
        }
        public Long getFlowDataValue() {
            return this.flowDataValue;
        }

        public GetCDNStatisSumResponseBodyCDNStatisListCDNMetric setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

    }

    public static class GetCDNStatisSumResponseBodyCDNStatisList extends TeaModel {
        @NameInMap("CDNMetric")
        public java.util.List<GetCDNStatisSumResponseBodyCDNStatisListCDNMetric> CDNMetric;

        public static GetCDNStatisSumResponseBodyCDNStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisSumResponseBodyCDNStatisList self = new GetCDNStatisSumResponseBodyCDNStatisList();
            return TeaModel.build(map, self);
        }

        public GetCDNStatisSumResponseBodyCDNStatisList setCDNMetric(java.util.List<GetCDNStatisSumResponseBodyCDNStatisListCDNMetric> CDNMetric) {
            this.CDNMetric = CDNMetric;
            return this;
        }
        public java.util.List<GetCDNStatisSumResponseBodyCDNStatisListCDNMetric> getCDNMetric() {
            return this.CDNMetric;
        }

    }

}
