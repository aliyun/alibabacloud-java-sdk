// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListPublishedServicesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request is successful.</li>
     * <li><strong>3xx</strong>: The request is redirected.</li>
     * <li><strong>4xx</strong>: A request error occurred.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the microservice list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPublishedServicesResponseBodyData> data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.Obviously</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request is abnormal, a specific error code is returned.</li>
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
     * <p>Indicates whether the list of published microservices is successfully retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The list is successfully retrieved.</li>
     * <li><strong>false</strong>: The list fails to be retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListPublishedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesResponseBody self = new ListPublishedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPublishedServicesResponseBody setData(java.util.List<ListPublishedServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPublishedServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListPublishedServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPublishedServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPublishedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishedServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPublishedServicesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListPublishedServicesResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>A reserved field. This field is currently meaningless.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Group2Ip")
        public String group2Ip;

        /**
         * <p>The group to which the consumed service belongs.</p>
         */
        @NameInMap("Groups")
        public java.util.List<String> groups;

        /**
         * <p>The service subscription addresses.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The published service name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.nodejs.ItemService</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the published service.</p>
         * 
         * <strong>example:</strong>
         * <p>RPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the published service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListPublishedServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPublishedServicesResponseBodyData self = new ListPublishedServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPublishedServicesResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListPublishedServicesResponseBodyData setGroup2Ip(String group2Ip) {
            this.group2Ip = group2Ip;
            return this;
        }
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        public ListPublishedServicesResponseBodyData setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public ListPublishedServicesResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListPublishedServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublishedServicesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPublishedServicesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
