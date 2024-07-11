// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersByPathResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the common parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetParametersByPathResponseBodyParameters> parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25156E99-7437-4590-AA58-2ACA17DE405C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetParametersByPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParametersByPathResponseBody self = new GetParametersByPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParametersByPathResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetParametersByPathResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetParametersByPathResponseBody setParameters(java.util.List<GetParametersByPathResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetParametersByPathResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetParametersByPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParametersByPathResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetParametersByPathResponseBodyParameters extends TeaModel {
        /**
         * <p>The constraints of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;MaxLength\&quot;: 2}</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the common parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-21T04:03:12Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-7cdc0000000000000000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>myParameter</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>The share type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags added to the common parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>StringList</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who updated the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the common parameter was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-21T04:03:12Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The value of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;parameter1,parameter2&quot;</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetParametersByPathResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetParametersByPathResponseBodyParameters self = new GetParametersByPathResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetParametersByPathResponseBodyParameters setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetParametersByPathResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetParametersByPathResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetParametersByPathResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParametersByPathResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetParametersByPathResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParametersByPathResponseBodyParameters setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetParametersByPathResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetParametersByPathResponseBodyParameters setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetParametersByPathResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParametersByPathResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetParametersByPathResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetParametersByPathResponseBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
