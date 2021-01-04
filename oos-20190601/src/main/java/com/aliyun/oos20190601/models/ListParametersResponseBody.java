// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParametersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Parameters")
    public java.util.List<ListParametersResponseBodyParameters> parameters;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParametersResponseBody self = new ListParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParametersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListParametersResponseBody setParameters(java.util.List<ListParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ListParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public ListParametersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParametersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListParametersResponseBodyParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("ParameterVersion")
        public String parameterVersion;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("ShareType")
        public String shareType;

        public static ListParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            ListParametersResponseBodyParameters self = new ListParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public ListParametersResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParametersResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListParametersResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public ListParametersResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListParametersResponseBodyParameters setParameterVersion(String parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public String getParameterVersion() {
            return this.parameterVersion;
        }

        public ListParametersResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParametersResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListParametersResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}
