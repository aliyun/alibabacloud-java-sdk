// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterResponseBody extends TeaModel {
    /**
     * <p>The user who created the common parameter.</p>
     */
    @NameInMap("Parameter")
    public UpdateParameterResponseBodyParameter parameter;

    /**
     * <p>The time when the common parameter was updated.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterResponseBody self = new UpdateParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateParameterResponseBody setParameter(UpdateParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public UpdateParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the common parameter. The description must be 1 to 200 characters in length.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>Updates a common parameter.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The information of the common parameter.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The user who updated the common parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The region ID of the resource.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The description of the common parameter.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateParameterResponseBodyParameter self = new UpdateParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public UpdateParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public UpdateParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdateParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public UpdateParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public UpdateParameterResponseBodyParameter setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public UpdateParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdateParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
