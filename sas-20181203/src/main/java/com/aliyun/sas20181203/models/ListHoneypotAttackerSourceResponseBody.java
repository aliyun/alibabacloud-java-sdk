// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerSourceResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The source IP addresses of the attack.</p>
     */
    @NameInMap("List")
    public java.util.List<ListHoneypotAttackerSourceResponseBodyList> list;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListHoneypotAttackerSourceResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9915DC4D-B4DA-5140-8138-FD80636*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The total number of attack events.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The most recent honeypot that was attacked.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc tcp honeypot</p>
         */
        @NameInMap("LastTargetHoneypot")
        public String lastTargetHoneypot;

        /**
         * <p>The most recent IP address that was attacked.</p>
         * 
         * <strong>example:</strong>
         * <p>144.23.66.***</p>
         */
        @NameInMap("LastTargetIp")
        public String lastTargetIp;

        /**
         * <p>The last time when the attack event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1693446913000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: low</li>
         * <li><strong>3</strong>: medium</li>
         * <li><strong>4</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>101.102.61.***</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
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
