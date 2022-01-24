// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

        public static CreateResourceShareResponseBodyResourceShare build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareResponseBodyResourceShare self = new CreateResourceShareResponseBodyResourceShare();
            return TeaModel.build(map, self);
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
