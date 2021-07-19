// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateSecretParameterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Parameter")
    public UpdateSecretParameterResponseBodyParameter parameter;

    public static UpdateSecretParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretParameterResponseBody self = new UpdateSecretParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretParameterResponseBody setParameter(UpdateSecretParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateSecretParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public static class UpdateSecretParameterResponseBodyParameter extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Description")
        public String description;

        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("ShareType")
        public String shareType;

        public static UpdateSecretParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretParameterResponseBodyParameter self = new UpdateSecretParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public UpdateSecretParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateSecretParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public UpdateSecretParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdateSecretParameterResponseBodyParameter setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public UpdateSecretParameterResponseBodyParameter setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public UpdateSecretParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSecretParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public UpdateSecretParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateSecretParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdateSecretParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateSecretParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public UpdateSecretParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSecretParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateSecretParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}
