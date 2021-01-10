// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerOverviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSCrawlerOverviewResponseBodyData data;

    public static GetDWSCrawlerOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerOverviewResponseBody self = new GetDWSCrawlerOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSCrawlerOverviewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSCrawlerOverviewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSCrawlerOverviewResponseBody setData(GetDWSCrawlerOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSCrawlerOverviewResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList extends TeaModel {
        @NameInMap("BeginTimeStamp")
        public String beginTimeStamp;

        @NameInMap("Conn")
        public Long conn;

        @NameInMap("CrawlerDelay")
        public Long crawlerDelay;

        @NameInMap("CrawlerName")
        public String crawlerName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EndTimeStamp")
        public String endTimeStamp;

        @NameInMap("Ios")
        public Long ios;

        @NameInMap("Location")
        public String location;

        @NameInMap("MonitorTime")
        public String monitorTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tps")
        public String tps;

        public static GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList self = new GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setBeginTimeStamp(String beginTimeStamp) {
            this.beginTimeStamp = beginTimeStamp;
            return this;
        }
        public String getBeginTimeStamp() {
            return this.beginTimeStamp;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setConn(Long conn) {
            this.conn = conn;
            return this;
        }
        public Long getConn() {
            return this.conn;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setCrawlerDelay(Long crawlerDelay) {
            this.crawlerDelay = crawlerDelay;
            return this;
        }
        public Long getCrawlerDelay() {
            return this.crawlerDelay;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setCrawlerName(String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }
        public String getCrawlerName() {
            return this.crawlerName;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setEndTimeStamp(String endTimeStamp) {
            this.endTimeStamp = endTimeStamp;
            return this;
        }
        public String getEndTimeStamp() {
            return this.endTimeStamp;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setIos(Long ios) {
            this.ios = ios;
            return this;
        }
        public Long getIos() {
            return this.ios;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setMonitorTime(String monitorTime) {
            this.monitorTime = monitorTime;
            return this;
        }
        public String getMonitorTime() {
            return this.monitorTime;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList setTps(String tps) {
            this.tps = tps;
            return this;
        }
        public String getTps() {
            return this.tps;
        }

    }

    public static class GetDWSCrawlerOverviewResponseBodyData extends TeaModel {
        @NameInMap("PageTotal")
        public Long pageTotal;

        @NameInMap("DbTypeList")
        public java.util.List<String> dbTypeList;

        @NameInMap("CrawlerOverviewList")
        public java.util.List<GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList> crawlerOverviewList;

        public static GetDWSCrawlerOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerOverviewResponseBodyData self = new GetDWSCrawlerOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerOverviewResponseBodyData setPageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Long getPageTotal() {
            return this.pageTotal;
        }

        public GetDWSCrawlerOverviewResponseBodyData setDbTypeList(java.util.List<String> dbTypeList) {
            this.dbTypeList = dbTypeList;
            return this;
        }
        public java.util.List<String> getDbTypeList() {
            return this.dbTypeList;
        }

        public GetDWSCrawlerOverviewResponseBodyData setCrawlerOverviewList(java.util.List<GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList> crawlerOverviewList) {
            this.crawlerOverviewList = crawlerOverviewList;
            return this;
        }
        public java.util.List<GetDWSCrawlerOverviewResponseBodyDataCrawlerOverviewList> getCrawlerOverviewList() {
            return this.crawlerOverviewList;
        }

    }

}
