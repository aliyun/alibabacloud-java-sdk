// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponseBody extends TeaModel {
    /**
     * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F23CFB6-A721-4E90-AC1E-0E30FA8B45DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource shares.</p>
     */
    @NameInMap("ResourceShares")
    public java.util.List<ListResourceSharesResponseBodyResourceShares> resourceShares;

    public static ListResourceSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharesResponseBody self = new ListResourceSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceSharesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceSharesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceSharesResponseBody setResourceShares(java.util.List<ListResourceSharesResponseBodyResourceShares> resourceShares) {
        this.resourceShares = resourceShares;
        return this;
    }
    public java.util.List<ListResourceSharesResponseBodyResourceShares> getResourceShares() {
        return this.resourceShares;
    }

    public static class ListResourceSharesResponseBodyResourceSharesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListResourceSharesResponseBodyResourceSharesTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharesResponseBodyResourceSharesTags self = new ListResourceSharesResponseBodyResourceSharesTags();
            return TeaModel.build(map, self);
        }

        public ListResourceSharesResponseBodyResourceSharesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceSharesResponseBodyResourceSharesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceSharesResponseBodyResourceShares extends TeaModel {
        /**
         * <p>Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
         * <ul>
         * <li>false: Resources in the resource share can be shared only with accounts in the resource directory.</li>
         * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowExternalTargets")
        public Boolean allowExternalTargets;

        /**
         * <p>The time when the resource share was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-03T02:20:31.292Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-PqysnzIj****</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The name of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The owner of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("ResourceShareOwner")
        public String resourceShareOwner;

        /**
         * <p>The status of the resource share. Valid values:</p>
         * <ul>
         * <li>Active: The resource share is enabled.</li>
         * <li>Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</li>
         * <li>Deleting: The resource share is being deleted.</li>
         * <li>Deleted: The resource share is deleted.</li>
         * </ul>
         * <blockquote>
         * <p> The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ResourceShareStatus")
        public String resourceShareStatus;

        @NameInMap("Tags")
        public java.util.List<ListResourceSharesResponseBodyResourceSharesTags> tags;

        /**
         * <p>The time when the resource share was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-03T08:01:43.638Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceSharesResponseBodyResourceShares build(java.util.Map<String, ?> map) throws Exception {
            ListResourceSharesResponseBodyResourceShares self = new ListResourceSharesResponseBodyResourceShares();
            return TeaModel.build(map, self);
        }

        public ListResourceSharesResponseBodyResourceShares setAllowExternalTargets(Boolean allowExternalTargets) {
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }
        public Boolean getAllowExternalTargets() {
            return this.allowExternalTargets;
        }

        public ListResourceSharesResponseBodyResourceShares setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public ListResourceSharesResponseBodyResourceShares setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public ListResourceSharesResponseBodyResourceShares setTags(java.util.List<ListResourceSharesResponseBodyResourceSharesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListResourceSharesResponseBodyResourceSharesTags> getTags() {
            return this.tags;
        }

        public ListResourceSharesResponseBodyResourceShares setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
