// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Application")
    public UpdateApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F1F00F41-D24C-5377-831B-C97F739CE1AB</p>
     */
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
        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T09:17:46Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>My-Application</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The time when the application was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T10:17:46Z</p>
         */
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
