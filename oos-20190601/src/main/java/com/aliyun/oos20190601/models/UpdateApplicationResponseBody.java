// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public UpdateApplicationResponseBodyApplication application;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponseBody self = new UpdateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponseBody setApplication(UpdateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public UpdateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public UpdateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationResponseBodyApplication self = new UpdateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationResponseBodyApplication setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationResponseBodyApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateApplicationResponseBodyApplication setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public UpdateApplicationResponseBodyApplication setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
