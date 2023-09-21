// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerPortraitResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListHoneypotAttackerPortraitResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListHoneypotAttackerPortraitResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHoneypotAttackerPortraitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAttackerPortraitResponseBody self = new ListHoneypotAttackerPortraitResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAttackerPortraitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHoneypotAttackerPortraitResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHoneypotAttackerPortraitResponseBody setList(java.util.List<ListHoneypotAttackerPortraitResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListHoneypotAttackerPortraitResponseBodyList> getList() {
        return this.list;
    }

    public ListHoneypotAttackerPortraitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHoneypotAttackerPortraitResponseBody setPageInfo(ListHoneypotAttackerPortraitResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListHoneypotAttackerPortraitResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListHoneypotAttackerPortraitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotAttackerPortraitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHoneypotAttackerPortraitResponseBodyListNetwork extends TeaModel {
        @NameInMap("ExternalIp")
        public java.util.List<String> externalIp;

        @NameInMap("InternalIp")
        public java.util.List<String> internalIp;

        @NameInMap("RealIp")
        public java.util.List<String> realIp;

        public static ListHoneypotAttackerPortraitResponseBodyListNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAttackerPortraitResponseBodyListNetwork self = new ListHoneypotAttackerPortraitResponseBodyListNetwork();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAttackerPortraitResponseBodyListNetwork setExternalIp(java.util.List<String> externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public java.util.List<String> getExternalIp() {
            return this.externalIp;
        }

        public ListHoneypotAttackerPortraitResponseBodyListNetwork setInternalIp(java.util.List<String> internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public java.util.List<String> getInternalIp() {
            return this.internalIp;
        }

        public ListHoneypotAttackerPortraitResponseBodyListNetwork setRealIp(java.util.List<String> realIp) {
            this.realIp = realIp;
            return this;
        }
        public java.util.List<String> getRealIp() {
            return this.realIp;
        }

    }

    public static class ListHoneypotAttackerPortraitResponseBodyList extends TeaModel {
        @NameInMap("AttackCount")
        public Integer attackCount;

        @NameInMap("Browser")
        public java.util.List<String> browser;

        @NameInMap("Host")
        public java.util.List<String> host;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Network")
        public ListHoneypotAttackerPortraitResponseBodyListNetwork network;

        @NameInMap("PortraitId")
        public String portraitId;

        @NameInMap("Social")
        public java.util.List<String> social;

        public static ListHoneypotAttackerPortraitResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAttackerPortraitResponseBodyList self = new ListHoneypotAttackerPortraitResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAttackerPortraitResponseBodyList setAttackCount(Integer attackCount) {
            this.attackCount = attackCount;
            return this;
        }
        public Integer getAttackCount() {
            return this.attackCount;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setBrowser(java.util.List<String> browser) {
            this.browser = browser;
            return this;
        }
        public java.util.List<String> getBrowser() {
            return this.browser;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setNetwork(ListHoneypotAttackerPortraitResponseBodyListNetwork network) {
            this.network = network;
            return this;
        }
        public ListHoneypotAttackerPortraitResponseBodyListNetwork getNetwork() {
            return this.network;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setPortraitId(String portraitId) {
            this.portraitId = portraitId;
            return this;
        }
        public String getPortraitId() {
            return this.portraitId;
        }

        public ListHoneypotAttackerPortraitResponseBodyList setSocial(java.util.List<String> social) {
            this.social = social;
            return this;
        }
        public java.util.List<String> getSocial() {
            return this.social;
        }

    }

    public static class ListHoneypotAttackerPortraitResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHoneypotAttackerPortraitResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHoneypotAttackerPortraitResponseBodyPageInfo self = new ListHoneypotAttackerPortraitResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListHoneypotAttackerPortraitResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListHoneypotAttackerPortraitResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListHoneypotAttackerPortraitResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHoneypotAttackerPortraitResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
