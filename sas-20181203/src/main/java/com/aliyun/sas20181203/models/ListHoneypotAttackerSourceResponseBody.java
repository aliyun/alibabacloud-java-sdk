// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListHoneypotAttackerSourceResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListHoneypotAttackerSourceResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotAttackerSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAttackerSourceResponseBody self = new ListHoneypotAttackerSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAttackerSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotAttackerSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotAttackerSourceResponseBody setList(java.util.List<ListHoneypotAttackerSourceResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListHoneypotAttackerSourceResponseBodyList> getList() {
        return this.list;
    }

    public ListHoneypotAttackerSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotAttackerSourceResponseBody setPageInfo(ListHoneypotAttackerSourceResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotAttackerSourceResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotAttackerSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotAttackerSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotAttackerSourceResponseBodyList extends TeaModel {
        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("LastTargetHoneypot")
        public String lastTargetHoneypot;

        @NameInMap("LastTargetIp")
        public String lastTargetIp;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SrcIp")
        public String srcIp;

        public static ListHoneypotAttackerSourceResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAttackerSourceResponseBodyList self = new ListHoneypotAttackerSourceResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAttackerSourceResponseBodyList setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public ListHoneypotAttackerSourceResponseBodyList setLastTargetHoneypot(String lastTargetHoneypot) {
            this.lastTargetHoneypot = lastTargetHoneypot;
            return this;
        }
        public String getLastTargetHoneypot() {
            return this.lastTargetHoneypot;
        }

        public ListHoneypotAttackerSourceResponseBodyList setLastTargetIp(String lastTargetIp) {
            this.lastTargetIp = lastTargetIp;
            return this;
        }
        public String getLastTargetIp() {
            return this.lastTargetIp;
        }

        public ListHoneypotAttackerSourceResponseBodyList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListHoneypotAttackerSourceResponseBodyList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListHoneypotAttackerSourceResponseBodyList setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

    }

    public static class ListHoneypotAttackerSourceResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotAttackerSourceResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAttackerSourceResponseBodyPageInfo self = new ListHoneypotAttackerSourceResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAttackerSourceResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotAttackerSourceResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotAttackerSourceResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotAttackerSourceResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
