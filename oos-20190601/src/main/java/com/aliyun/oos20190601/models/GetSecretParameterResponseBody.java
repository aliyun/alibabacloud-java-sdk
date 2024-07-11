// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParameterResponseBody extends TeaModel {
    /**
     * <p>The information about the encryption parameter.</p>
     */
    @NameInMap("Parameter")
    public GetSecretParameterResponseBodyParameter parameter;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7F14FB7C-C9BE-44AE-92ED-21ACC02FBFD2</p>
     */
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
        /**
         * <p>The constraints of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;{\&quot;\&quot;AllowedValues&quot;:[&quot;secretparameter&quot;],&quot;AllowedPattern&quot;:&quot;.*&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}\&quot;</p>
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
         * <p>2020-09-01T09:28:47Z</p>
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
         * <p>p-14ed150fdcd048xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the key of Key Management Service (KMS) that is used for encryption.</p>
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
         * <p>The tags of the parameter.</p>
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
         * <p>2020-09-01T09:35:17Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The value of the encryption parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
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

        public GetSecretParameterResponseBodyParameter setDKMSInstanceId(String DKMSInstanceId) {
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }
        public String getDKMSInstanceId() {
            return this.DKMSInstanceId;
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
