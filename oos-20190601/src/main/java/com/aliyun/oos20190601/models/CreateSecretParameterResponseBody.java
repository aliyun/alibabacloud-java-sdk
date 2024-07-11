// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateSecretParameterResponseBody extends TeaModel {
    /**
     * <p>The information about the encryption parameter.</p>
     */
    @NameInMap("Parameter")
    public CreateSecretParameterResponseBodyParameter parameter;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B419FF3-ABC6-4DF0-95E5-636DC8CBB8AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSecretParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretParameterResponseBody self = new CreateSecretParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretParameterResponseBody setParameter(CreateSecretParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public CreateSecretParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public CreateSecretParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSecretParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The constraints of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;{ 	&quot;AllowedValues&quot;: [&quot;secretparameter&quot;], 	&quot;AllowedPattern&quot;: &quot;secretparameter&quot;, 	&quot;MinLength&quot;: 0, 	&quot;MaxLength&quot;: 20 }\&quot;</p>
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
         * <p>2020-09-01T09:30:36Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The instance ID of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-hzz****</p>
         */
        @NameInMap("DKMSInstanceId")
        public String DKMSInstanceId;

        /**
         * <p>The description of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0b0fff9919c946xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The key ID of KMS that is used to encrypt the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
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
         * <p>The type of the parameter.</p>
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
         * <p>2020-09-01T09:30:36Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static CreateSecretParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateSecretParameterResponseBodyParameter self = new CreateSecretParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public CreateSecretParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public CreateSecretParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public CreateSecretParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public CreateSecretParameterResponseBodyParameter setDKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
        }

        public CreateSecretParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSecretParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSecretParameterResponseBodyParameter setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public CreateSecretParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSecretParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public CreateSecretParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateSecretParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public CreateSecretParameterResponseBodyParameter setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public CreateSecretParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateSecretParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public CreateSecretParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
