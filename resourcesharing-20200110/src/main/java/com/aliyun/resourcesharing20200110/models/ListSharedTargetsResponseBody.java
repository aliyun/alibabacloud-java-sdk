// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedTargetsResponseBody extends TeaModel {
    /**
     * <p>The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the principals.</p>
     */
    @NameInMap("SharedTargets")
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets;

    public static ListSharedTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedTargetsResponseBody self = new ListSharedTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedTargetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSharedTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedTargetsResponseBody setSharedTargets(java.util.List<ListSharedTargetsResponseBodySharedTargets> sharedTargets) {
        this.sharedTargets = sharedTargets;
        return this;
    }
    public java.util.List<ListSharedTargetsResponseBodySharedTargets> getSharedTargets() {
        return this.sharedTargets;
    }

    public static class ListSharedTargetsResponseBodySharedTargets extends TeaModel {
        /**
         * <p>The time when the principal was associated with the resource share.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
         * <br>
         * <p>*   true: The principal is outside the resource directory.</p>
         * <p>*   false: The principal is in the resource directory.</p>
         */
        @NameInMap("External")
        public Boolean external;

        /**
         * <p>The ID of the resource share.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The ID of the principal or resource owner.</p>
         * <br>
         * <p>*   If the value of `ResourceOwner` is `Self`, the value of this parameter is the ID of a principal.</p>
         * <p>*   If the value of `ResourceOwner` is `OtherAccounts`, the value of this parameter is the ID of a resource owner.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetProperty")
        public String targetProperty;

        /**
         * <p>The time when the association of the principal was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListSharedTargetsResponseBodySharedTargets build(java.util.Map<String, ?> map) throws Exception {
            ListSharedTargetsResponseBodySharedTargets self = new ListSharedTargetsResponseBodySharedTargets();
            return TeaModel.build(map, self);
        }

        public ListSharedTargetsResponseBodySharedTargets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSharedTargetsResponseBodySharedTargets setExternal(Boolean external) {
            this.external = external;
            return this;
        }
        public Boolean getExternal() {
            return this.external;
        }

        public ListSharedTargetsResponseBodySharedTargets setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListSharedTargetsResponseBodySharedTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListSharedTargetsResponseBodySharedTargets setTargetProperty(String targetProperty) {
            this.targetProperty = targetProperty;
            return this;
        }
        public String getTargetProperty() {
            return this.targetProperty;
        }

        public ListSharedTargetsResponseBodySharedTargets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
