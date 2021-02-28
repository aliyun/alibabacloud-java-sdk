// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTopUrlVisitResponseBody extends TeaModel {
    @NameInMap("Url500List")
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl500List url500List;

    @NameInMap("Url200List")
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl200List url200List;

    @NameInMap("Url400List")
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl400List url400List;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Url300List")
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl300List url300List;

    @NameInMap("AllUrlList")
    public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList allUrlList;

    public static DescribeScdnDomainTopUrlVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTopUrlVisitResponseBody self = new DescribeScdnDomainTopUrlVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setUrl500List(DescribeScdnDomainTopUrlVisitResponseBodyUrl500List url500List) {
        this.url500List = url500List;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl500List getUrl500List() {
        return this.url500List;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setUrl200List(DescribeScdnDomainTopUrlVisitResponseBodyUrl200List url200List) {
        this.url200List = url200List;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl200List getUrl200List() {
        return this.url200List;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setUrl400List(DescribeScdnDomainTopUrlVisitResponseBodyUrl400List url400List) {
        this.url400List = url400List;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl400List getUrl400List() {
        return this.url400List;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setUrl300List(DescribeScdnDomainTopUrlVisitResponseBodyUrl300List url300List) {
        this.url300List = url300List;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBodyUrl300List getUrl300List() {
        return this.url300List;
    }

    public DescribeScdnDomainTopUrlVisitResponseBody setAllUrlList(DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList allUrlList) {
        this.allUrlList = allUrlList;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList getAllUrlList() {
        return this.allUrlList;
    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        public String urlDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl500List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl500List build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl500List self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl500List();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl500List setUrlList(java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        public String urlDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl200List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl200List build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl200List self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl200List();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl200List setUrlList(java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        public String urlDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl400List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl400List build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl400List self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl400List();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl400List setUrlList(java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        public String urlDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyUrl300List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList;

        public static DescribeScdnDomainTopUrlVisitResponseBodyUrl300List build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyUrl300List self = new DescribeScdnDomainTopUrlVisitResponseBodyUrl300List();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyUrl300List setUrlList(java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList extends TeaModel {
        @NameInMap("UrlDetail")
        public String urlDetail;

        @NameInMap("VisitData")
        public String visitData;

        @NameInMap("VisitProportion")
        public Float visitProportion;

        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        public static DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

    }

    public static class DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList;

        public static DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList self = new DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainTopUrlVisitResponseBodyAllUrlList setUrlList(java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeScdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> getUrlList() {
            return this.urlList;
        }

    }

}
