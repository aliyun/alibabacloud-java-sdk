// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTopReferVisitResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TopReferList")
    public DescribeScdnDomainTopReferVisitResponseBodyTopReferList topReferList;

    public static DescribeScdnDomainTopReferVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTopReferVisitResponseBody self = new DescribeScdnDomainTopReferVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTopReferVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainTopReferVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainTopReferVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainTopReferVisitResponseBody setTopReferList(DescribeScdnDomainTopReferVisitResponseBodyTopReferList topReferList) {
        this.topReferList = topReferList;
        return this;
    }
    public DescribeScdnDomainTopReferVisitResponseBodyTopReferList getTopReferList() {
        return this.topReferList;
    }

    public static class DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList extends TeaModel {
        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        @NameInMap("ReferDetail")
        public String referDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList self = new DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList setReferDetail(String referDetail) {
            this.referDetail = referDetail;
            return this;
        }
        public String getReferDetail() {
            return this.referDetail;
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeScdnDomainTopReferVisitResponseBodyTopReferList extends TeaModel {
        @NameInMap("ReferList")
        public java.util.List<DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList> referList;

        public static DescribeScdnDomainTopReferVisitResponseBodyTopReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopReferVisitResponseBodyTopReferList self = new DescribeScdnDomainTopReferVisitResponseBodyTopReferList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopReferVisitResponseBodyTopReferList setReferList(java.util.List<DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList> referList) {
            this.referList = referList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopReferVisitResponseBodyTopReferListReferList> getReferList() {
            return this.referList;
        }

    }

}
