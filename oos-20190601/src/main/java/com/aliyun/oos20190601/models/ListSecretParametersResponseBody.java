// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParametersResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>sPH90GZOVGC6KPDUL0FIIbEtMQHq_19S6_4O_XqA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<ListSecretParametersResponseBodyParameters> parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CA9C6248-AF2A-4AE9-A166-88FD901BBB90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSecretParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParametersResponseBody self = new ListSecretParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretParametersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecretParametersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecretParametersResponseBody setParameters(java.util.List<ListSecretParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ListSecretParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public ListSecretParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecretParametersResponseBodyParameters extends TeaModel {
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
         * <p>2020-09-01T09:28:47Z</p>
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
         * <p>p-14ed150fdcd048xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the KMS customer master key (CMK) that is used for encryption.</p>
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
         * <p>MySecretParameter</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterVersion")
        public String parameterVersion;

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
         * <p>2020-09-01T09:35:17Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListSecretParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            ListSecretParametersResponseBodyParameters self = new ListSecretParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public ListSecretParametersResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListSecretParametersResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListSecretParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecretParametersResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSecretParametersResponseBodyParameters setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListSecretParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretParametersResponseBodyParameters setParameterVersion(String parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public String getParameterVersion() {
            return this.parameterVersion;
        }

        public ListSecretParametersResponseBodyParameters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSecretParametersResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListSecretParametersResponseBodyParameters setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListSecretParametersResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSecretParametersResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListSecretParametersResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
