// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterResponseBody extends TeaModel {
    @NameInMap("Parameter")
    public GetSecretParameterResponseBodyParameter parameter;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSecretParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParameterResponseBody self = new GetSecretParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretParameterResponseBody setParameter(GetSecretParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public GetSecretParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public GetSecretParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretParameterResponseBodyParameter extends TeaModel {
        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("Value")
        public String value;

        public static GetSecretParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            GetSecretParameterResponseBodyParameter self = new GetSecretParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public GetSecretParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetSecretParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetSecretParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetSecretParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecretParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSecretParameterResponseBodyParameter setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetSecretParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecretParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetSecretParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSecretParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetSecretParameterResponseBodyParameter setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetSecretParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSecretParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetSecretParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetSecretParameterResponseBodyParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
