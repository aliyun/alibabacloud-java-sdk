// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of images that are used for the honeypot.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6C24D883-984D-52FD-BB66-5F89F86E4837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The display name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>RuoYi</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:007095d6de9c7a343e9fc1f74a7efc9c5de9d5454789d2fa505a1b3fc62****</p>
         */
        @NameInMap("HoneypotImageId")
        public String honeypotImageId;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The type of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("HoneypotImageType")
        public String honeypotImageType;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2</p>
         */
        @NameInMap("HoneypotImageVersion")
        public String honeypotImageVersion;

        /**
         * <p>The port that is supported by the honeypot. The value is in the JSON format. Valid values:</p>
         * <ul>
         * <li><strong>log_type</strong>: the log type</li>
         * <li><strong>proto</strong>: the supported protocol</li>
         * <li><strong>description</strong>: the description</li>
         * <li><strong>ports</strong>: the supported ports</li>
         * <li><strong>port_str</strong>: the supported port number of the string type</li>
         * <li><strong>type</strong>: the type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;log_type&quot;:&quot;web&quot;,&quot;proto&quot;:&quot;tcp&quot;,&quot;description&quot;:&quot;webServerPort&quot;,&quot;ports&quot;:[80.0],&quot;port_str&quot;:&quot;80&quot;,&quot;type&quot;:&quot;web&quot;}]</p>
         */
        @NameInMap("Multiports")
        public String multiports;

        /**
         * <p>The protocol that is supported by the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The service port of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>27017.0</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        /**
         * <p>The configuration template of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
