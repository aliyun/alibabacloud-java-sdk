// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotResponseBody extends TeaModel {
    // The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
    @NameInMap("Code")
    public String code;

    // The number of images that are used for the honeypot.
    @NameInMap("Count")
    public Integer count;

    // An array consisting of the information about the images that are used for the honeypot.
    @NameInMap("Data")
    public java.util.List<ListAvailableHoneypotResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListAvailableHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableHoneypotResponseBody self = new ListAvailableHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableHoneypotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableHoneypotResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAvailableHoneypotResponseBody setData(java.util.List<ListAvailableHoneypotResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableHoneypotResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableHoneypotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAvailableHoneypotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableHoneypotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvailableHoneypotResponseBodyData extends TeaModel {
        // The display name of the image that is used for the honeypot.
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        // The ID of the image that is used for the honeypot.
        @NameInMap("HoneypotImageId")
        public String honeypotImageId;

        // The name of the image that is used for the honeypot.
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        // The type of the image that is used for the honeypot.
        @NameInMap("HoneypotImageType")
        public String honeypotImageType;

        // The version of the image that is used for the honeypot.
        @NameInMap("HoneypotImageVersion")
        public String honeypotImageVersion;

        // The port that is supported by the honeypot. The value is in the JSON format. The value contains the following fields:
        // 
        // *   **log_type**: the log type
        // *   **proto**: the supported protocol
        // *   **description**: the description
        // *   **ports**: the supported ports
        // *   **port_str**: the supported port number of the string type
        // *   **type**: the type
        @NameInMap("Multiports")
        public String multiports;

        // The protocol that is supported by the honeypot.
        @NameInMap("Proto")
        public String proto;

        // The service port of the honeypot.
        @NameInMap("ServicePort")
        public String servicePort;

        // The configuration template of the honeypot.
        @NameInMap("Template")
        public String template;

        public static ListAvailableHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableHoneypotResponseBodyData self = new ListAvailableHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public ListAvailableHoneypotResponseBodyData setHoneypotImageId(String honeypotImageId) {
            this.honeypotImageId = honeypotImageId;
            return this;
        }
        public String getHoneypotImageId() {
            return this.honeypotImageId;
        }

        public ListAvailableHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public ListAvailableHoneypotResponseBodyData setHoneypotImageType(String honeypotImageType) {
            this.honeypotImageType = honeypotImageType;
            return this;
        }
        public String getHoneypotImageType() {
            return this.honeypotImageType;
        }

        public ListAvailableHoneypotResponseBodyData setHoneypotImageVersion(String honeypotImageVersion) {
            this.honeypotImageVersion = honeypotImageVersion;
            return this;
        }
        public String getHoneypotImageVersion() {
            return this.honeypotImageVersion;
        }

        public ListAvailableHoneypotResponseBodyData setMultiports(String multiports) {
            this.multiports = multiports;
            return this;
        }
        public String getMultiports() {
            return this.multiports;
        }

        public ListAvailableHoneypotResponseBodyData setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public ListAvailableHoneypotResponseBodyData setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public ListAvailableHoneypotResponseBodyData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
