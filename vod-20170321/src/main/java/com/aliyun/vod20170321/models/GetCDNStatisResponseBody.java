// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCDNStatisResponseBody extends TeaModel {
    @NameInMap("CDNStatisList")
    public GetCDNStatisResponseBodyCDNStatisList CDNStatisList;

    @NameInMap("MaxBpsDataValue")
    public Long maxBpsDataValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SumFlowDataValue")
    public Long sumFlowDataValue;

    public static GetCDNStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisResponseBody self = new GetCDNStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCDNStatisResponseBody setCDNStatisList(GetCDNStatisResponseBodyCDNStatisList CDNStatisList) {
        this.CDNStatisList = CDNStatisList;
        return this;
    }
    public GetCDNStatisResponseBodyCDNStatisList getCDNStatisList() {
        return this.CDNStatisList;
    }

    public GetCDNStatisResponseBody setMaxBpsDataValue(Long maxBpsDataValue) {
        this.maxBpsDataValue = maxBpsDataValue;
        return this;
    }
    public Long getMaxBpsDataValue() {
        return this.maxBpsDataValue;
    }

    public GetCDNStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCDNStatisResponseBody setSumFlowDataValue(Long sumFlowDataValue) {
        this.sumFlowDataValue = sumFlowDataValue;
        return this;
    }
    public Long getSumFlowDataValue() {
        return this.sumFlowDataValue;
    }

    public static class GetCDNStatisResponseBodyCDNStatisListCDNMetric extends TeaModel {
        @NameInMap("BpsDataDomesticValue")
        public Long bpsDataDomesticValue;

        @NameInMap("BpsDataOverseasValue")
        public Long bpsDataOverseasValue;

        @NameInMap("BpsDataValue")
        public Long bpsDataValue;

        @NameInMap("CdnDomain")
        public String cdnDomain;

        @NameInMap("FlowDataDomesticValue")
        public Long flowDataDomesticValue;

        @NameInMap("FlowDataOverseasValue")
        public Long flowDataOverseasValue;

        @NameInMap("FlowDataValue")
        public Long flowDataValue;

        @NameInMap("Id")
        public Long id;

        @NameInMap("StatTime")
        public String statTime;

        public static GetCDNStatisResponseBodyCDNStatisListCDNMetric build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisResponseBodyCDNStatisListCDNMetric self = new GetCDNStatisResponseBodyCDNStatisListCDNMetric();
            return TeaModel.build(map, self);
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setBpsDataDomesticValue(Long bpsDataDomesticValue) {
            this.bpsDataDomesticValue = bpsDataDomesticValue;
            return this;
        }
        public Long getBpsDataDomesticValue() {
            return this.bpsDataDomesticValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setBpsDataOverseasValue(Long bpsDataOverseasValue) {
            this.bpsDataOverseasValue = bpsDataOverseasValue;
            return this;
        }
        public Long getBpsDataOverseasValue() {
            return this.bpsDataOverseasValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setBpsDataValue(Long bpsDataValue) {
            this.bpsDataValue = bpsDataValue;
            return this;
        }
        public Long getBpsDataValue() {
            return this.bpsDataValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setCdnDomain(String cdnDomain) {
            this.cdnDomain = cdnDomain;
            return this;
        }
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setFlowDataDomesticValue(Long flowDataDomesticValue) {
            this.flowDataDomesticValue = flowDataDomesticValue;
            return this;
        }
        public Long getFlowDataDomesticValue() {
            return this.flowDataDomesticValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setFlowDataOverseasValue(Long flowDataOverseasValue) {
            this.flowDataOverseasValue = flowDataOverseasValue;
            return this;
        }
        public Long getFlowDataOverseasValue() {
            return this.flowDataOverseasValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setFlowDataValue(Long flowDataValue) {
            this.flowDataValue = flowDataValue;
            return this;
        }
        public Long getFlowDataValue() {
            return this.flowDataValue;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCDNStatisResponseBodyCDNStatisListCDNMetric setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

    }

    public static class GetCDNStatisResponseBodyCDNStatisList extends TeaModel {
        @NameInMap("CDNMetric")
        public java.util.List<GetCDNStatisResponseBodyCDNStatisListCDNMetric> CDNMetric;

        public static GetCDNStatisResponseBodyCDNStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetCDNStatisResponseBodyCDNStatisList self = new GetCDNStatisResponseBodyCDNStatisList();
            return TeaModel.build(map, self);
        }

        public GetCDNStatisResponseBodyCDNStatisList setCDNMetric(java.util.List<GetCDNStatisResponseBodyCDNStatisListCDNMetric> CDNMetric) {
            this.CDNMetric = CDNMetric;
            return this;
        }
        public java.util.List<GetCDNStatisResponseBodyCDNStatisListCDNMetric> getCDNMetric() {
            return this.CDNMetric;
        }

    }

}
