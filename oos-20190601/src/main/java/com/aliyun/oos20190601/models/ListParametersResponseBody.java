// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Parameters")
    public java.util.List<ListParametersResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterVersion")
        public String parameterVersion;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShareType")
        public String shareType;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedBy")
        public String updatedBy;

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
