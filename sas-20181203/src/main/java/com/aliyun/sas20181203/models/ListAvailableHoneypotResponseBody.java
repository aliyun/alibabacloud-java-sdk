// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableHoneypotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListAvailableHoneypotResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        @NameInMap("HoneypotImageId")
        public String honeypotImageId;

        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        @NameInMap("HoneypotImageType")
        public String honeypotImageType;

        @NameInMap("HoneypotImageVersion")
        public String honeypotImageVersion;

        @NameInMap("Multiports")
        public String multiports;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("ServicePort")
        public String servicePort;

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
