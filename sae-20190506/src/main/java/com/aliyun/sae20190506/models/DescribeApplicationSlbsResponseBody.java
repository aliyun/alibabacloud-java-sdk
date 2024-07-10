// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the information about the SLB instances that are associated with an application was obtained successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates that the information was obtained successfully.</li>
     * <li><strong>false</strong>: indicates that the information failed to be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Configurations of internal-facing SLB instances.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationSlbsResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><strong>success</strong> is returned when the request succeeds.</li>
     * <li>An error code is returned when the request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationSlbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSlbsResponseBody self = new DescribeApplicationSlbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSlbsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationSlbsResponseBody setData(DescribeApplicationSlbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationSlbsResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationSlbsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationSlbsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationSlbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationSlbsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationSlbsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationSlbsResponseBodyDataInternet extends TeaModel {
        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("HttpsCaCertId")
        public String httpsCaCertId;

        /**
         * <p>The supported protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The ID of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("StickySession")
        public Boolean stickySession;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The port specified for the SLB listener.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static DescribeApplicationSlbsResponseBodyDataInternet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataInternet self = new DescribeApplicationSlbsResponseBodyDataInternet();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setHttpsCaCertId(String httpsCaCertId) {
            this.httpsCaCertId = httpsCaCertId;
            return this;
        }
        public String getHttpsCaCertId() {
            return this.httpsCaCertId;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setHttpsCertId(String httpsCertId) {
            this.httpsCertId = httpsCertId;
            return this;
        }
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setStickySession(Boolean stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public Boolean getStickySession() {
            return this.stickySession;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class DescribeApplicationSlbsResponseBodyDataIntranet extends TeaModel {
        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        @NameInMap("HttpsCaCertId")
        public String httpsCaCertId;

        /**
         * <p>The supported protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The IP address of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("StickySession")
        public Boolean stickySession;

        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The port specified for the SLB listener.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static DescribeApplicationSlbsResponseBodyDataIntranet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataIntranet self = new DescribeApplicationSlbsResponseBodyDataIntranet();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setCookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setHttpsCaCertId(String httpsCaCertId) {
            this.httpsCaCertId = httpsCaCertId;
            return this;
        }
        public String getHttpsCaCertId() {
            return this.httpsCaCertId;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setHttpsCertId(String httpsCertId) {
            this.httpsCertId = httpsCertId;
            return this;
        }
        public String getHttpsCertId() {
            return this.httpsCertId;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setStickySession(Boolean stickySession) {
            this.stickySession = stickySession;
            return this;
        }
        public Boolean getStickySession() {
            return this.stickySession;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setStickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }
        public String getStickySessionType() {
            return this.stickySessionType;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class DescribeApplicationSlbsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the SSL certificate issued by Alibaba Cloud.</p>
         */
        @NameInMap("Internet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> internet;

        /**
         * <p>The ID of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>59.74.**.**</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("InternetSlbExpired")
        public Boolean internetSlbExpired;

        /**
         * <p>Configurations of Internet-facing SLB instances.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6xc7wybefehnv45****</p>
         */
        @NameInMap("InternetSlbId")
        public String internetSlbId;

        /**
         * <p>The ID of the SSL certificate issued by Alibaba Cloud.</p>
         */
        @NameInMap("Intranet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> intranet;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("IntranetSlbExpired")
        public Boolean intranetSlbExpired;

        /**
         * <p>The IP address of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6xc7wybefehnv45****</p>
         */
        @NameInMap("IntranetSlbId")
        public String intranetSlbId;

        public static DescribeApplicationSlbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyData self = new DescribeApplicationSlbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSlbsResponseBodyData setInternet(java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> internet) {
            this.internet = internet;
            return this;
        }
        public java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> getInternet() {
            return this.internet;
        }

        public DescribeApplicationSlbsResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeApplicationSlbsResponseBodyData setInternetSlbExpired(Boolean internetSlbExpired) {
            this.internetSlbExpired = internetSlbExpired;
            return this;
        }
        public Boolean getInternetSlbExpired() {
            return this.internetSlbExpired;
        }

        public DescribeApplicationSlbsResponseBodyData setInternetSlbId(String internetSlbId) {
            this.internetSlbId = internetSlbId;
            return this;
        }
        public String getInternetSlbId() {
            return this.internetSlbId;
        }

        public DescribeApplicationSlbsResponseBodyData setIntranet(java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> intranet) {
            this.intranet = intranet;
            return this;
        }
        public java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> getIntranet() {
            return this.intranet;
        }

        public DescribeApplicationSlbsResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeApplicationSlbsResponseBodyData setIntranetSlbExpired(Boolean intranetSlbExpired) {
            this.intranetSlbExpired = intranetSlbExpired;
            return this;
        }
        public Boolean getIntranetSlbExpired() {
            return this.intranetSlbExpired;
        }

        public DescribeApplicationSlbsResponseBodyData setIntranetSlbId(String intranetSlbId) {
            this.intranetSlbId = intranetSlbId;
            return this;
        }
        public String getIntranetSlbId() {
            return this.intranetSlbId;
        }

    }

}
