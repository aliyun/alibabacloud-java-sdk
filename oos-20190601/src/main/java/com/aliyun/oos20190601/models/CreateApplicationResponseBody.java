// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>274917E8-8E74-5928-A82F-4940F52F7ACB</p>
     */
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
        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T09:17:46Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Myapplication</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The time when the application was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T09:17:46Z</p>
         */
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
