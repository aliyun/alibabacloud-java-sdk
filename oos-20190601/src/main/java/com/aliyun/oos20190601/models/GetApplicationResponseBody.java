// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetApplicationResponseBodyApplication setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
