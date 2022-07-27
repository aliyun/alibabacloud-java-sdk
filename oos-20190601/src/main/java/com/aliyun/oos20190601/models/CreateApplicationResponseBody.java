// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setApplication(CreateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public CreateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplication self = new CreateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplication setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationResponseBodyApplication setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public CreateApplicationResponseBodyApplication setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
