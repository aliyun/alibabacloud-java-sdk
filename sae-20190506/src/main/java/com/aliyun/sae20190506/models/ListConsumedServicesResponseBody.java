// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListConsumedServicesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the call was successful.</p>
     * <p>*   **3xx**: indicates that the call was redirected.</p>
     * <p>*   **4xx**: indicates that the call failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the microservices.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListConsumedServicesResponseBodyData> data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <br>
     * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information. Valid values:</p>
     * <br>
     * <p>*   If the call is successful, **success** is returned.</p>
     * <p>*   If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the microservice list was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The list was obtained.</p>
     * <p>*   **false**: The list failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListConsumedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesResponseBody self = new ListConsumedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumedServicesResponseBody setData(java.util.List<ListConsumedServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConsumedServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListConsumedServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListConsumedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsumedServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConsumedServicesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListConsumedServicesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("Group2Ip")
        public String group2Ip;

        /**
         * <p>The service group that corresponds to the published service.</p>
         */
        @NameInMap("Groups")
        public java.util.List<String> groups;

        /**
         * <p>The subscription address of the service.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The name of the published service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the published service.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the published service</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListConsumedServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumedServicesResponseBodyData self = new ListConsumedServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumedServicesResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListConsumedServicesResponseBodyData setGroup2Ip(String group2Ip) {
            this.group2Ip = group2Ip;
            return this;
        }
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        public ListConsumedServicesResponseBodyData setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public ListConsumedServicesResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListConsumedServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConsumedServicesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListConsumedServicesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
