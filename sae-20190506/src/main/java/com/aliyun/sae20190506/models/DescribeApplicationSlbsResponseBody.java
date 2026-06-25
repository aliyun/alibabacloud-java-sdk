// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><code>2xx</code>: The request is successful.</p>
     * </li>
     * <li><p><code>3xx</code>: The request is redirected.</p>
     * </li>
     * <li><p><code>4xx</code>: A client error occurs.</p>
     * </li>
     * <li><p><code>5xx</code>: A server error occurs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationSlbsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <code>success</code> is returned.</p>
     * </li>
     * <li><p>If the request fails, a specific error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configuration of the SLB instance was obtained. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The configuration was obtained.</p>
     * </li>
     * <li><p><code>false</code>: The configuration failed to be obtained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of a request.</p>
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
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>The cookie that is configured on the server.</p>
         * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces. It cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code> and <code>StickySessionType</code> is set to <code>server</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wwe</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The cookie timeout period. Unit: seconds. Valid values: <code>1</code> to <code>86400</code>.</p>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code> and <code>StickySessionType</code> is set to <code>insert</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>The time when the rule was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1741247308294</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableConnectionDrain")
        public Boolean enableConnectionDrain;

        /**
         * <p>The ID of the CA certificate for the HTTPS protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCaCertId")
        public String httpsCaCertId;

        /**
         * <p>The ID of the certificate for the HTTPS protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The listening port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The supported protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Indicates whether session persistence is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StickySession")
        public Boolean stickySession;

        /**
         * <p>The cookie handling method. Valid values:</p>
         * <ul>
         * <li><p><code>insert</code>: inserts a cookie. When a client makes the first request, the SLB instance inserts a cookie into the response. The next request from the client contains the cookie, and the SLB instance forwards the request to the same backend server.</p>
         * </li>
         * <li><p><code>server</code>: rewrites a cookie. When the SLB instance detects a user-defined cookie, it rewrites the cookie. The next request from the client contains the new cookie, and the SLB instance forwards the request to the same backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DescribeApplicationSlbsResponseBodyDataInternet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataInternet self = new DescribeApplicationSlbsResponseBodyDataInternet();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
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

        public DescribeApplicationSlbsResponseBodyDataInternet setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationSlbsResponseBodyDataInternet setEnableConnectionDrain(Boolean enableConnectionDrain) {
            this.enableConnectionDrain = enableConnectionDrain;
            return this;
        }
        public Boolean getEnableConnectionDrain() {
            return this.enableConnectionDrain;
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

        public DescribeApplicationSlbsResponseBodyDataInternet setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class DescribeApplicationSlbsResponseBodyDataIntranet extends TeaModel {
        @NameInMap("ConnectionDrainTimeout")
        public Integer connectionDrainTimeout;

        /**
         * <p>The cookie that is configured on the server.</p>
         * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or spaces. It cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code> and <code>StickySessionType</code> is set to <code>server</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wwe</p>
         */
        @NameInMap("Cookie")
        public String cookie;

        /**
         * <p>The cookie timeout period. Unit: seconds. Valid values: <code>1</code> to <code>86400</code>.</p>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code> and <code>StickySessionType</code> is set to <code>insert</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("CookieTimeout")
        public Integer cookieTimeout;

        /**
         * <p>The time when the rule was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1741247308294</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableConnectionDrain")
        public Boolean enableConnectionDrain;

        /**
         * <p>The ID of the CA certificate for the HTTPS protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCaCertId")
        public String httpsCaCertId;

        /**
         * <p>The ID of the certificate for the HTTPS protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>1513561019707729_16f37aae5f3_-375882821_-169099****</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The listening port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The supported protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Indicates whether session persistence is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StickySession")
        public Boolean stickySession;

        /**
         * <p>The cookie handling method. Valid values:</p>
         * <ul>
         * <li><p><code>insert</code>: inserts a cookie. When a client makes the first request, the SLB instance inserts a cookie into the response. The next request from the client contains the cookie, and the SLB instance forwards the request to the same backend server.</p>
         * </li>
         * <li><p><code>server</code>: rewrites a cookie. When the SLB instance detects a user-defined cookie, it rewrites the cookie. The next request from the client contains the new cookie, and the SLB instance forwards the request to the same backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <code>StickySession</code> is set to <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        @NameInMap("StickySessionType")
        public String stickySessionType;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DescribeApplicationSlbsResponseBodyDataIntranet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataIntranet self = new DescribeApplicationSlbsResponseBodyDataIntranet();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setConnectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
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

        public DescribeApplicationSlbsResponseBodyDataIntranet setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationSlbsResponseBodyDataIntranet setEnableConnectionDrain(Boolean enableConnectionDrain) {
            this.enableConnectionDrain = enableConnectionDrain;
            return this;
        }
        public Boolean getEnableConnectionDrain() {
            return this.enableConnectionDrain;
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

        public DescribeApplicationSlbsResponseBodyDataIntranet setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class DescribeApplicationSlbsResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The configurations of the Internet-facing SLB instance.</p>
         */
        @NameInMap("Internet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> internet;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>59.74.**.**</code></p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The billing method of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        @NameInMap("InternetSlbChargeType")
        public String internetSlbChargeType;

        /**
         * <p>Indicates whether the Internet-facing SLB instance has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InternetSlbExpired")
        public Boolean internetSlbExpired;

        /**
         * <p>The ID of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6xc7wybefehnv45****</p>
         */
        @NameInMap("InternetSlbId")
        public String internetSlbId;

        /**
         * <p>The configurations of the internal-facing SLB instance.</p>
         */
        @NameInMap("Intranet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> intranet;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The billing method of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PayBySpec</p>
         */
        @NameInMap("IntranetSlbChargeType")
        public String intranetSlbChargeType;

        /**
         * <p>Indicates whether the internal-facing SLB instance has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IntranetSlbExpired")
        public Boolean intranetSlbExpired;

        /**
         * <p>The ID of the internal-facing SLB instance.</p>
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

        public DescribeApplicationSlbsResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationSlbsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeApplicationSlbsResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
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

        public DescribeApplicationSlbsResponseBodyData setInternetSlbChargeType(String internetSlbChargeType) {
            this.internetSlbChargeType = internetSlbChargeType;
            return this;
        }
        public String getInternetSlbChargeType() {
            return this.internetSlbChargeType;
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

        public DescribeApplicationSlbsResponseBodyData setIntranetSlbChargeType(String intranetSlbChargeType) {
            this.intranetSlbChargeType = intranetSlbChargeType;
            return this;
        }
        public String getIntranetSlbChargeType() {
            return this.intranetSlbChargeType;
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
