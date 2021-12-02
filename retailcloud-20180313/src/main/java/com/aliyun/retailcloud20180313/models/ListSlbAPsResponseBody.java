// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListSlbAPsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListSlbAPsResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSlbAPsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlbAPsResponseBody self = new ListSlbAPsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlbAPsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSlbAPsResponseBody setData(java.util.List<ListSlbAPsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSlbAPsResponseBodyData> getData() {
        return this.data;
    }

    public ListSlbAPsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListSlbAPsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlbAPsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlbAPsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlbAPsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSlbAPsResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("EstablishedTimeout")
        public Integer establishedTimeout;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkMode")
        public String networkMode;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RealServerPort")
        public Integer realServerPort;

        @NameInMap("SlbAPId")
        public Long slbAPId;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SslCertId")
        public String sslCertId;

        @NameInMap("StickySession")
        public Integer stickySession;

        public static ListSlbAPsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSlbAPsResponseBodyData self = new ListSlbAPsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSlbAPsResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListSlbAPsResponseBodyData setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public ListSlbAPsResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public ListSlbAPsResponseBodyData setEstablishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public ListSlbAPsResponseBodyData setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public ListSlbAPsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSlbAPsResponseBodyData setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public ListSlbAPsResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListSlbAPsResponseBodyData setRealServerPort(Integer realServerPort) {
            this.realServerPort = realServerPort;
            return this;
        }
        public Integer getRealServerPort() {
            return this.realServerPort;
        }

        public ListSlbAPsResponseBodyData setSlbAPId(Long slbAPId) {
            this.slbAPId = slbAPId;
            return this;
        }
        public Long getSlbAPId() {
            return this.slbAPId;
        }

        public ListSlbAPsResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListSlbAPsResponseBodyData setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListSlbAPsResponseBodyData setSslCertId(String sslCertId) {
            this.sslCertId = sslCertId;
            return this;
        }
        public String getSslCertId() {
            return this.sslCertId;
        }

        public ListSlbAPsResponseBodyData setStickySession(Integer stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public Integer getStickySession() {
            return this.stickySession;
        }

    }

}
