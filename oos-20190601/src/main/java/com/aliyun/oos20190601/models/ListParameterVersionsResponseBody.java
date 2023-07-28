// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParameterVersionsResponseBody extends TeaModel {
    /**
     * <p>The name of the common parameter.</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("CreatedDate")
    public String createdDate;

    /**
     * <p>The user who created the common parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The version number of the common parameter.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The time when the common parameter was created.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the common parameter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description of the common parameter.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The value of the common parameter.</p>
     */
    @NameInMap("ParameterVersions")
    public java.util.List<ListParameterVersionsResponseBodyParameterVersions> parameterVersions;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version information of the common parameter.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListParameterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsResponseBody self = new ListParameterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListParameterVersionsResponseBody setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    public String getCreatedDate() {
        return this.createdDate;
    }

    public ListParameterVersionsResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListParameterVersionsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListParameterVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListParameterVersionsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListParameterVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParameterVersionsResponseBody setParameterVersions(java.util.List<ListParameterVersionsResponseBodyParameterVersions> parameterVersions) {
        this.parameterVersions = parameterVersions;
        return this;
    }
    public java.util.List<ListParameterVersionsResponseBodyParameterVersions> getParameterVersions() {
        return this.parameterVersions;
    }

    public ListParameterVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParameterVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListParameterVersionsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListParameterVersionsResponseBodyParameterVersions extends TeaModel {
        /**
         * <p>The time when the common parameter was updated.</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>Queries versions of a common parameter.</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>## Debugging</p>
         * <br>
         * <p>[OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=oos\&api=ListParameterVersions\&type=RPC\&version=2019-06-01)</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The user who updated the common parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListParameterVersionsResponseBodyParameterVersions build(java.util.Map<String, ?> map) throws Exception {
            ListParameterVersionsResponseBodyParameterVersions self = new ListParameterVersionsResponseBodyParameterVersions();
            return TeaModel.build(map, self);
        }

        public ListParameterVersionsResponseBodyParameterVersions setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public ListParameterVersionsResponseBodyParameterVersions setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListParameterVersionsResponseBodyParameterVersions setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListParameterVersionsResponseBodyParameterVersions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
