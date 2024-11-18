// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C3FA051-61DC-4F3E-81E9-E4830524DF4B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource share.</p>
     */
    @NameInMap("ResourceShare")
    public CreateResourceShareResponseBodyResourceShare resourceShare;

    public static CreateResourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareResponseBody self = new CreateResourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceShareResponseBody setResourceShare(CreateResourceShareResponseBodyResourceShare resourceShare) {
        this.resourceShare = resourceShare;
        return this;
    }
    public CreateResourceShareResponseBodyResourceShare getResourceShare() {
        return this.resourceShare;
    }

    public static class CreateResourceShareResponseBodyResourceShare extends TeaModel {
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
         * <p> The system automatically deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
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
         * <p>2020-12-03T08:02:22.413Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateResourceShareResponseBodyResourceShare build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareResponseBodyResourceShare self = new CreateResourceShareResponseBodyResourceShare();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareResponseBodyResourceShare setAllowExternalTargets(Boolean allowExternalTargets) {
            this.allowExternalTargets = allowExternalTargets;
            return this;
        }
        public Boolean getAllowExternalTargets() {
            return this.allowExternalTargets;
        }

        public CreateResourceShareResponseBodyResourceShare setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateResourceShareResponseBodyResourceShare setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public CreateResourceShareResponseBodyResourceShare setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public CreateResourceShareResponseBodyResourceShare setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public CreateResourceShareResponseBodyResourceShare setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public CreateResourceShareResponseBodyResourceShare setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
