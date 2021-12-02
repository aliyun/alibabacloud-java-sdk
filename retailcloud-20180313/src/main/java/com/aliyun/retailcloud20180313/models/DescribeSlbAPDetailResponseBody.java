// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeSlbAPDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSlbAPDetailResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSlbAPDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlbAPDetailResponseBody self = new DescribeSlbAPDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlbAPDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSlbAPDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeSlbAPDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlbAPDetailResponseBody setResult(DescribeSlbAPDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSlbAPDetailResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeSlbAPDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSlbAPDetailResponseBodyResult extends TeaModel {
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

        public static DescribeSlbAPDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlbAPDetailResponseBodyResult self = new DescribeSlbAPDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSlbAPDetailResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeSlbAPDetailResponseBodyResult setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeSlbAPDetailResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeSlbAPDetailResponseBodyResult setEstablishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public DescribeSlbAPDetailResponseBodyResult setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeSlbAPDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSlbAPDetailResponseBodyResult setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public DescribeSlbAPDetailResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeSlbAPDetailResponseBodyResult setRealServerPort(Integer realServerPort) {
            this.realServerPort = realServerPort;
            return this;
        }
        public Integer getRealServerPort() {
            return this.realServerPort;
        }

        public DescribeSlbAPDetailResponseBodyResult setSlbAPId(Long slbAPId) {
            this.slbAPId = slbAPId;
            return this;
        }
        public Long getSlbAPId() {
            return this.slbAPId;
        }

        public DescribeSlbAPDetailResponseBodyResult setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeSlbAPDetailResponseBodyResult setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public DescribeSlbAPDetailResponseBodyResult setSslCertId(String sslCertId) {
            this.sslCertId = sslCertId;
            return this;
        }
        public String getSslCertId() {
            return this.sslCertId;
        }

        public DescribeSlbAPDetailResponseBodyResult setStickySession(Integer stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public Integer getStickySession() {
            return this.stickySession;
        }

    }

}
