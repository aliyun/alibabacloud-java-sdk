// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("ResourceShareOwner")
        public String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        public String resourceShareStatus;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateResourceShareResponseBodyResourceShare build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceShareResponseBodyResourceShare self = new UpdateResourceShareResponseBodyResourceShare();
            return TeaModel.build(map, self);
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
