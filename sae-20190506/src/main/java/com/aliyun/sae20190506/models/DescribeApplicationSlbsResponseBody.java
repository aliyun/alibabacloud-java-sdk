// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationSlbsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about the SLB instances that are associated with an application was obtained successfully. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the information was obtained successfully.</p>
     * <p>*   **false**: indicates that the information failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
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
        /**
         * <p>The ID of the SSL certificate issued by Alibaba Cloud.</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The port specified for the SLB listener.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The supported protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The container port.</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static DescribeApplicationSlbsResponseBodyDataInternet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataInternet self = new DescribeApplicationSlbsResponseBodyDataInternet();
            return TeaModel.build(map, self);
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

        public DescribeApplicationSlbsResponseBodyDataInternet setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class DescribeApplicationSlbsResponseBodyDataIntranet extends TeaModel {
        /**
         * <p>The ID of the SSL certificate issued by Alibaba Cloud.</p>
         */
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        /**
         * <p>The port specified for the SLB listener.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The supported protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The container port.</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static DescribeApplicationSlbsResponseBodyDataIntranet build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationSlbsResponseBodyDataIntranet self = new DescribeApplicationSlbsResponseBodyDataIntranet();
            return TeaModel.build(map, self);
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
         * <p>Configurations of Internet-facing SLB instances.</p>
         */
        @NameInMap("Internet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> internet;

        /**
         * <p>The IP address of the Internet-facing SLB instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("InternetSlbExpired")
        public Boolean internetSlbExpired;

        /**
         * <p>The ID of the Internet-facing SLB instance.</p>
         */
        @NameInMap("InternetSlbId")
        public String internetSlbId;

        /**
         * <p>Configurations of internal-facing SLB instances.</p>
         */
        @NameInMap("Intranet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> intranet;

        /**
         * <p>The IP address of the internal-facing SLB instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("IntranetSlbExpired")
        public Boolean intranetSlbExpired;

        /**
         * <p>The ID of the internal-facing SLB instance.</p>
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
