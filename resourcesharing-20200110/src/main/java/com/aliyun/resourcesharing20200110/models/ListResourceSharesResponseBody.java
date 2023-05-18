// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharesResponseBody extends TeaModel {
    /**
     * <p>The information of the resource shares.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The time when the resource share was updated.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the resource share.</p>
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

    public static class ListResourceSharesResponseBodyResourceShares extends TeaModel {
        @NameInMap("AllowExternalTargets")
        public Boolean allowExternalTargets;

        /**
         * <p>The status of the resource share. Valid values:</p>
         * <br>
         * <p>*   Active: The resource share is enabled.</p>
         * <p>*   Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</p>
         * <p>*   Deleting: The resource share is being deleted.</p>
         * <p>*   Deleted: The resource share is deleted.</p>
         * <br>
         * <p>>  The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
         * <br>
         * <p>*   false: Resources in the resource share can be shared only with accounts in the resource directory.</p>
         * <p>*   true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The time when the resource share was created.</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The ID of the resource share.</p>
         */
        @NameInMap("ResourceShareOwner")
        public String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        public String resourceShareStatus;

        /**
         * <p>The owner of the resource share.</p>
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

        public ListResourceSharesResponseBodyResourceShares setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
