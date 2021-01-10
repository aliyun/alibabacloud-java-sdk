// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterOverviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSJdbcwriterOverviewResponseBodyData data;

    public static GetDWSJdbcwriterOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterOverviewResponseBody self = new GetDWSJdbcwriterOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSJdbcwriterOverviewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSJdbcwriterOverviewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSJdbcwriterOverviewResponseBody setData(GetDWSJdbcwriterOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSJdbcwriterOverviewResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList extends TeaModel {
        @NameInMap("CrawlerDelay")
        public Long crawlerDelay;

        @NameInMap("CrawlerName")
        public String crawlerName;

        @NameInMap("DestDbtype")
        public String destDbtype;

        @NameInMap("Iops")
        public Long iops;

        @NameInMap("JdbcwriterDelay")
        public Long jdbcwriterDelay;

        @NameInMap("JdbcwriterName")
        public String jdbcwriterName;

        @NameInMap("Location")
        public String location;

        @NameInMap("MonitorTime")
        public String monitorTime;

        @NameInMap("Rps")
        public Long rps;

        @NameInMap("SourceDbtype")
        public String sourceDbtype;

        @NameInMap("Status")
        public Long status;

        public static GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList self = new GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setCrawlerDelay(Long crawlerDelay) {
            this.crawlerDelay = crawlerDelay;
            return this;
        }
        public Long getCrawlerDelay() {
            return this.crawlerDelay;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setCrawlerName(String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }
        public String getCrawlerName() {
            return this.crawlerName;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setDestDbtype(String destDbtype) {
            this.destDbtype = destDbtype;
            return this;
        }
        public String getDestDbtype() {
            return this.destDbtype;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setIops(Long iops) {
            this.iops = iops;
            return this;
        }
        public Long getIops() {
            return this.iops;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setJdbcwriterDelay(Long jdbcwriterDelay) {
            this.jdbcwriterDelay = jdbcwriterDelay;
            return this;
        }
        public Long getJdbcwriterDelay() {
            return this.jdbcwriterDelay;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setJdbcwriterName(String jdbcwriterName) {
            this.jdbcwriterName = jdbcwriterName;
            return this;
        }
        public String getJdbcwriterName() {
            return this.jdbcwriterName;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setMonitorTime(String monitorTime) {
            this.monitorTime = monitorTime;
            return this;
        }
        public String getMonitorTime() {
            return this.monitorTime;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setRps(Long rps) {
            this.rps = rps;
            return this;
        }
        public Long getRps() {
            return this.rps;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setSourceDbtype(String sourceDbtype) {
            this.sourceDbtype = sourceDbtype;
            return this;
        }
        public String getSourceDbtype() {
            return this.sourceDbtype;
        }

        public GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetDWSJdbcwriterOverviewResponseBodyData extends TeaModel {
        @NameInMap("PageTotal")
        public Long pageTotal;

        @NameInMap("DestDbTypeList")
        public java.util.List<String> destDbTypeList;

        @NameInMap("JdbcwriterOverviewList")
        public java.util.List<GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList> jdbcwriterOverviewList;

        public static GetDWSJdbcwriterOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterOverviewResponseBodyData self = new GetDWSJdbcwriterOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterOverviewResponseBodyData setPageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Long getPageTotal() {
            return this.pageTotal;
        }

        public GetDWSJdbcwriterOverviewResponseBodyData setDestDbTypeList(java.util.List<String> destDbTypeList) {
            this.destDbTypeList = destDbTypeList;
            return this;
        }
        public java.util.List<String> getDestDbTypeList() {
            return this.destDbTypeList;
        }

        public GetDWSJdbcwriterOverviewResponseBodyData setJdbcwriterOverviewList(java.util.List<GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList> jdbcwriterOverviewList) {
            this.jdbcwriterOverviewList = jdbcwriterOverviewList;
            return this;
        }
        public java.util.List<GetDWSJdbcwriterOverviewResponseBodyDataJdbcwriterOverviewList> getJdbcwriterOverviewList() {
            return this.jdbcwriterOverviewList;
        }

    }

}
