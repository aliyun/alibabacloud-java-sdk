// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersByPathResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the encryption parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetSecretParametersByPathResponseBodyParameters> parameters;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetSecretParametersByPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersByPathResponseBody self = new GetSecretParametersByPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersByPathResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetSecretParametersByPathResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetSecretParametersByPathResponseBody setParameters(java.util.List<GetSecretParametersByPathResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetSecretParametersByPathResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetSecretParametersByPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecretParametersByPathResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetSecretParametersByPathResponseBodyParameters extends TeaModel {
        /**
         * <p>The constraints of the encryption parameter.</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the encryption parameter.</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the encryption parameter was updated.</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the encryption parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the encryption parameter.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the key.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The name of the encryption parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the encryption parameter.</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>The share type of the encryption parameter.</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The data type of the encryption parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who updated the encryption parameter.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the encryption parameter was updated.</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The value of the encryption parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetSecretParametersByPathResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetSecretParametersByPathResponseBodyParameters self = new GetSecretParametersByPathResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetSecretParametersByPathResponseBodyParameters setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetSecretParametersByPathResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetSecretParametersByPathResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetSecretParametersByPathResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecretParametersByPathResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSecretParametersByPathResponseBodyParameters setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetSecretParametersByPathResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSecretParametersByPathResponseBodyParameters setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetSecretParametersByPathResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetSecretParametersByPathResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSecretParametersByPathResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetSecretParametersByPathResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetSecretParametersByPathResponseBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
