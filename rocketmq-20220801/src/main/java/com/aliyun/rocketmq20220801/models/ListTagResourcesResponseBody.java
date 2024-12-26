// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return result</p>
     */
    @NameInMap("data")
    public ListTagResourcesResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>F00C6A70-C782-5DD6-9D11-0CFC710100C7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

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

    public ListTagResourcesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListTagResourcesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListTagResourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static class ListTagResourcesResponseBodyDataTagResources extends TeaModel {
        /**
         * <p>UID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1876441048322426</p>
         */
        @NameInMap("aliUid")
        public Long aliUid;

        /**
         * <p>Tag category.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-pe334n08h08</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>Visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyDataTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyDataTagResources self = new ListTagResourcesResponseBodyDataTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyDataTagResources setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListTagResourcesResponseBodyDataTagResources setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
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

        public ListTagResourcesResponseBodyDataTagResources setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
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
         * <p>The position from which the next query starts.</p>
         * 
         * <strong>example:</strong>
         * <p>d09e2b63e1b12d905b7080ff70</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F00C6A70-C782-5DD6-9D11-0CFC710100C7</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>Resource tag relationships.</p>
         */
        @NameInMap("tagResources")
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

        public ListTagResourcesResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
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
