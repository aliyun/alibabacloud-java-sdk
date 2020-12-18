// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceShare")
    @Validation(required = true)
    public CreateResourceShareResponseResourceShare resourceShare;

    public static CreateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareResponse self = new CreateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceShareResponse setResourceShare(CreateResourceShareResponseResourceShare resourceShare) {
        this.resourceShare = resourceShare;
        return this;
    }
    public CreateResourceShareResponseResourceShare getResourceShare() {
        return this.resourceShare;
    }

    public static class CreateResourceShareResponseResourceShare extends TeaModel {
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

        public static CreateResourceShareResponseResourceShare build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareResponseResourceShare self = new CreateResourceShareResponseResourceShare();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareResponseResourceShare setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public CreateResourceShareResponseResourceShare setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public CreateResourceShareResponseResourceShare setResourceShareOwner(String resourceShareOwner) {
            this.resourceShareOwner = resourceShareOwner;
            return this;
        }
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        public CreateResourceShareResponseResourceShare setResourceShareStatus(String resourceShareStatus) {
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        public CreateResourceShareResponseResourceShare setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateResourceShareResponseResourceShare setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
