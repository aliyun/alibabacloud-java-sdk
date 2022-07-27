// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersResponseBody extends TeaModel {
    @NameInMap("InvalidParameters")
    public java.util.List<String> invalidParameters;

    @NameInMap("Parameters")
    public java.util.List<GetSecretParametersResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSecretParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersResponseBody self = new GetSecretParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersResponseBody setInvalidParameters(java.util.List<String> invalidParameters) {
        this.invalidParameters = invalidParameters;
        return this;
    }
    public java.util.List<String> getInvalidParameters() {
        return this.invalidParameters;
    }

    public GetSecretParametersResponseBody setParameters(java.util.List<GetSecretParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetSecretParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetSecretParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretParametersResponseBodyParameters extends TeaModel {
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

        public static GetSecretParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetSecretParametersResponseBodyParameters self = new GetSecretParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetSecretParametersResponseBodyParameters setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetSecretParametersResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetSecretParametersResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetSecretParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecretParametersResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSecretParametersResponseBodyParameters setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetSecretParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecretParametersResponseBodyParameters setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetSecretParametersResponseBodyParameters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSecretParametersResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetSecretParametersResponseBodyParameters setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetSecretParametersResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSecretParametersResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetSecretParametersResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetSecretParametersResponseBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
