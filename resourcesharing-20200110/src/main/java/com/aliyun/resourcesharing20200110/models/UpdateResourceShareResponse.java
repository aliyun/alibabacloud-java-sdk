// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceShare")
    @Validation(required = true)
    public UpdateResourceShareResponseResourceShare resourceShare;

    public static UpdateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceShareResponse self = new UpdateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceShareResponse setResourceShare(UpdateResourceShareResponseResourceShare resourceShare) {
        this.resourceShare = resourceShare;
        return this;
    }
    public UpdateResourceShareResponseResourceShare getResourceShare() {
        return this.resourceShare;
    }

    public static class UpdateResourceShareResponseResourceShare extends TeaModel {
        @NameInMap("ResourceShareId")
        @Validation(required = true)
        public String resourceShareId;

        @NameInMap("ResourceShareName")
        @Validation(required = true)
        public String resourceShareName;

        @NameInMap("ResourceShareOwner")
        @Validation(required = true)
        public String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        @Validation(required = true)
        public String resourceShareStatus;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static UpdateResourceShareResponseResourceShare build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourceShareResponseResourceShare self = new UpdateResourceShareResponseResourceShare();
            return TeaModel.build(map, self);
        }

        public UpdateResourceShareResponseResourceShare setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public UpdateResourceShareResponseResourceShare setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public UpdateResourceShareResponseResourceShare setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public UpdateResourceShareResponseResourceShare setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public UpdateResourceShareResponseResourceShare setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateResourceShareResponseResourceShare setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
