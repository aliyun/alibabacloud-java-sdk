// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
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
    public ListTagResourcesResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <br>
     * <p>- The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>- The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether mapping relationships between applications and tags were queried successfully. Valid values:</p>
     * <br>
     * <p>*   **true**: The query was successful.</p>
     * <p>*   **false**: The query failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagResourcesResponseBody setData(ListTagResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTagResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListTagResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagResourcesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListTagResourcesResponseBodyDataTagResources extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. Set the value to `application`.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyDataTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyDataTagResources self = new ListTagResourcesResponseBodyDataTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyDataTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyDataTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyDataTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyDataTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyData extends TeaModel {
        /**
         * <p>A maximum of 50 entries can be returned for a query. If a query generates more than 50 entries, the NextToken parameter is returned with the first 50 entries. You can use the NextToken parameter value to retrieve the subsequent entries that are not returned in the current query result.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The mapping relationships between applications and tags.</p>
         */
        @NameInMap("TagResources")
        public java.util.List<ListTagResourcesResponseBodyDataTagResources> tagResources;

        public static ListTagResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyData self = new ListTagResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTagResourcesResponseBodyData setTagResources(java.util.List<ListTagResourcesResponseBodyDataTagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyDataTagResources> getTagResources() {
            return this.tagResources;
        }

    }

}
