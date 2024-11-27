// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListExecutorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListExecutorsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsResponseBody self = new ListExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListExecutorsResponseBody setData(java.util.List<ListExecutorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExecutorsResponseBodyData> getData() {
        return this.data;
    }

    public ListExecutorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExecutorsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.10:9999/">http://192.168.1.10:9999/</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.10</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDesignated")
        public Boolean isDesignated;

        /**
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>2.0.2</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListExecutorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyData self = new ListExecutorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListExecutorsResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListExecutorsResponseBodyData setIsDesignated(Boolean isDesignated) {
            this.isDesignated = isDesignated;
            return this;
        }
        public Boolean getIsDesignated() {
            return this.isDesignated;
        }

        public ListExecutorsResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListExecutorsResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListExecutorsResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListExecutorsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
