// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2860A3A4-D8C1-4EF4-954E-84A3945E26E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the resource share.</p>
     */
    @NameInMap("ResourceShare")
    public UpdateResourceShareResponseBodyResourceShare resourceShare;

    public static UpdateResourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceShareResponseBody self = new UpdateResourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceShareResponseBody setResourceShare(UpdateResourceShareResponseBodyResourceShare resourceShare) {
        this.resourceShare = resourceShare;
        return this;
    }
    public UpdateResourceShareResponseBodyResourceShare getResourceShare() {
        return this.resourceShare;
    }

    public static class UpdateResourceShareResponseBodyResourceShare extends TeaModel {
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
         * <p>2020-12-03T08:02:22.413Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-qSkW1HBY****</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The name of the resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
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

        /**
         * <p>The time when the resource share was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-04T08:55:25.382Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateResourceShareResponseBodyResourceShare build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceShareResponseBodyResourceShare self = new UpdateResourceShareResponseBodyResourceShare();
            return TeaModel.build(map, self);
        }

        public UpdateResourceShareResponseBodyResourceShare setAllowExternalTargets(Boolean allowExternalTargets) {
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }
        public Boolean getAllowExternalTargets() {
            return this.allowExternalTargets;
        }

        public UpdateResourceShareResponseBodyResourceShare setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateResourceShareResponseBodyResourceShare setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public UpdateResourceShareResponseBodyResourceShare setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public UpdateResourceShareResponseBodyResourceShare setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public UpdateResourceShareResponseBodyResourceShare setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public UpdateResourceShareResponseBodyResourceShare setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
