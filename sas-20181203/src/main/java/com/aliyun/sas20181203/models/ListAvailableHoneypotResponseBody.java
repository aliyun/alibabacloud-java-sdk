// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of images that are used for the honeypot.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array consisting of the information about the images that are used for the honeypot.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAvailableHoneypotResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The display name of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The ID of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageId")
        public String honeypotImageId;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The type of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageType")
        public String honeypotImageType;

        /**
         * <p>The version of the image that is used for the honeypot.</p>
         */
        @NameInMap("HoneypotImageVersion")
        public String honeypotImageVersion;

        /**
         * <p>The port that is supported by the honeypot. The value is in the JSON format. The value contains the following fields:</p>
         * <br>
         * <p>*   **log_type**: the log type</p>
         * <p>*   **proto**: the supported protocol</p>
         * <p>*   **description**: the description</p>
         * <p>*   **ports**: the supported ports</p>
         * <p>*   **port_str**: the supported port number of the string type</p>
         * <p>*   **type**: the type</p>
         */
        @NameInMap("Multiports")
        public String multiports;

        /**
         * <p>The protocol that is supported by the honeypot.</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The service port of the honeypot.</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        /**
         * <p>The configuration template of the honeypot.</p>
         */
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
