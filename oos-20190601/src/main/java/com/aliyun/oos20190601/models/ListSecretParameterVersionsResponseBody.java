// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParameterVersionsResponseBody extends TeaModel {
    /**
     * <p>The user who created the encryption parameter.</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>The time when the encryption parameter was created.</p>
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
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the encryption parameter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the version of the encryption parameter.</p>
     */
    @NameInMap("ParameterVersions")
    public java.util.List<ListSecretParameterVersionsResponseBodyParameterVersions> parameterVersions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The type of the encryption parameter.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListSecretParameterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParameterVersionsResponseBody self = new ListSecretParameterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretParameterVersionsResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListSecretParameterVersionsResponseBody setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    public String getCreatedDate() {
        return this.createdDate;
    }

    public ListSecretParameterVersionsResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListSecretParameterVersionsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListSecretParameterVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecretParameterVersionsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSecretParameterVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecretParameterVersionsResponseBody setParameterVersions(java.util.List<ListSecretParameterVersionsResponseBodyParameterVersions> parameterVersions) {
        this.parameterVersions = parameterVersions;
        return this;
    }
    public java.util.List<ListSecretParameterVersionsResponseBodyParameterVersions> getParameterVersions() {
        return this.parameterVersions;
    }

    public ListSecretParameterVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretParameterVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSecretParameterVersionsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListSecretParameterVersionsResponseBodyParameterVersions extends TeaModel {
        /**
         * <p>The version number of the encryption parameter.</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

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

        public static ListSecretParameterVersionsResponseBodyParameterVersions build(java.util.Map<String, ?> map) throws Exception {
            ListSecretParameterVersionsResponseBodyParameterVersions self = new ListSecretParameterVersionsResponseBodyParameterVersions();
            return TeaModel.build(map, self);
        }

        public ListSecretParameterVersionsResponseBodyParameterVersions setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public ListSecretParameterVersionsResponseBodyParameterVersions setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListSecretParameterVersionsResponseBodyParameterVersions setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListSecretParameterVersionsResponseBodyParameterVersions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
