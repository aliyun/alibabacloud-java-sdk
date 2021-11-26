// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeApplicationSlbsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

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
        @NameInMap("HttpsCertId")
        public String httpsCertId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

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
        @NameInMap("Internet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataInternet> internet;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("InternetSlbId")
        public String internetSlbId;

        @NameInMap("Intranet")
        public java.util.List<DescribeApplicationSlbsResponseBodyDataIntranet> intranet;

        @NameInMap("IntranetIp")
        public String intranetIp;

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

        public DescribeApplicationSlbsResponseBodyData setIntranetSlbId(String intranetSlbId) {
            this.intranetSlbId = intranetSlbId;
            return this;
        }
        public String getIntranetSlbId() {
            return this.intranetSlbId;
        }

    }

}
