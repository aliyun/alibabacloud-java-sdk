// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC6KPDUL0FIIb</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the common parameter.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<ListParametersResponseBodyParameters> parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A81E4B2E-6B33-4BAE-9856-55DB7C893E01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParametersResponseBody self = new ListParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParametersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListParametersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParametersResponseBody setParameters(java.util.List<ListParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ListParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public ListParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParametersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListParametersResponseBodyParameters extends TeaModel {
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
         * <p>2020-09-01T08:01:43Z</p>
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
         * <p>The common parameter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-4c4b401cab6747xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
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
        public String parameterVersion;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags added to the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The data type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
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
         * <p>The time when the common parameter was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T08:01:43Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            ListParametersResponseBodyParameters self = new ListParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public ListParametersResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListParametersResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParametersResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParametersResponseBodyParameters setParameterVersion(String parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public String getParameterVersion() {
            return this.parameterVersion;
        }

        public ListParametersResponseBodyParameters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListParametersResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListParametersResponseBodyParameters setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListParametersResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParametersResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListParametersResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
