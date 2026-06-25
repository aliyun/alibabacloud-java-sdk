// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsForSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Client error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListApplicationsForSwimmingLaneResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>The parameter is an empty string if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message. Valid values:</p>
     * <ul>
     * <li><p><strong>success</strong> is returned if the request is successful.</p>
     * </li>
     * <li><p>A specific error code is returned if the request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The trace ID used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListApplicationsForSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForSwimmingLaneResponseBody self = new ListApplicationsForSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForSwimmingLaneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationsForSwimmingLaneResponseBody setData(java.util.List<ListApplicationsForSwimmingLaneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApplicationsForSwimmingLaneResponseBodyData> getData() {
        return this.data;
    }

    public ListApplicationsForSwimmingLaneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListApplicationsForSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationsForSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForSwimmingLaneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApplicationsForSwimmingLaneResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the baseline application.</p>
         * 
         * <strong>example:</strong>
         * <p>8c573618-8d72-4407-baf4-f7b64b******</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <p>The name of the baseline application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("BaseAppName")
        public String baseAppName;

        /**
         * <p>The ID of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-hvm47******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <p>The name of the MSE instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <p>The ID of the namespace in which the MSE instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        /**
         * <p>The canary tags configured for the application.</p>
         */
        @NameInMap("ServiceTags")
        public java.util.Map<String, String> serviceTags;

        public static ListApplicationsForSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForSwimmingLaneResponseBodyData self = new ListApplicationsForSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setBaseAppId(String baseAppId) {
            this.baseAppId = baseAppId;
            return this;
        }
        public String getBaseAppId() {
            return this.baseAppId;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setBaseAppName(String baseAppName) {
            this.baseAppName = baseAppName;
            return this;
        }
        public String getBaseAppName() {
            return this.baseAppName;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public ListApplicationsForSwimmingLaneResponseBodyData setServiceTags(java.util.Map<String, String> serviceTags) {
            this.serviceTags = serviceTags;
            return this;
        }
        public java.util.Map<String, String> getServiceTags() {
            return this.serviceTags;
        }

    }

}
