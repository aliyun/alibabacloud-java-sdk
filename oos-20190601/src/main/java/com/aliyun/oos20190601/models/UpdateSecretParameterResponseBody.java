// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateSecretParameterResponseBody extends TeaModel {
    /**
     * <p>The information about the parameter.</p>
     */
    @NameInMap("Parameter")
    public UpdateSecretParameterResponseBodyParameter parameter;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B419FF3-ABC6-4DF0-95E5-636DC8CBB8AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSecretParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretParameterResponseBody self = new UpdateSecretParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretParameterResponseBody setParameter(UpdateSecretParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateSecretParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public UpdateSecretParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSecretParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The constraints of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;{\&quot;\&quot;AllowedValues&quot;:[&quot;secretparameter&quot;],&quot;AllowedPattern&quot;:&quot;.*&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}\&quot;</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T09:30:36Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0b0fff9919c946xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of customer master key (CMK) of Key Management Service (KMS) that is used for encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The share type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Secret</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who updated the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the parameter was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T09:33:11Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateSecretParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretParameterResponseBodyParameter self = new UpdateSecretParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public UpdateSecretParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
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

        public UpdateSecretParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSecretParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateSecretParameterResponseBodyParameter setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public UpdateSecretParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSecretParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public UpdateSecretParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateSecretParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public UpdateSecretParameterResponseBodyParameter setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public UpdateSecretParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateSecretParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdateSecretParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
