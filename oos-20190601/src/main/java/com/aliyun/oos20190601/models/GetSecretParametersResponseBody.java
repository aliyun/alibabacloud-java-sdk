// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersResponseBody extends TeaModel {
    /**
     * <p>Invalid encryption parameter.</p>
     */
    @NameInMap("InvalidParameters")
    public java.util.List<String> invalidParameters;

    /**
     * <p>The information about the encryption parameter.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetSecretParametersResponseBodyParameters> parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5320F1D-92D9-44BB-A416-5FC525ED6D57</p>
     */
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
        /**
         * <p>The constraints of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AllowedValues\&quot;: [\&quot;test\&quot;]}</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the encryption parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T03:11:13Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>secretParameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-7cdc0000000000000000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-bp67acfmxazb4p****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MySecretParameter</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The data type of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Secret</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who updated the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the encryption parameter was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T03:11:13Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The value of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>secretParameter,secretParameter1</p>
         */
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
