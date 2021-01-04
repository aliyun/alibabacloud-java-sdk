// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersByPathResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Parameters")
    public java.util.List<GetParametersByPathResponseBodyParameters> parameters;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static GetParametersByPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParametersByPathResponseBody self = new GetParametersByPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParametersByPathResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetParametersByPathResponseBody setParameters(java.util.List<GetParametersByPathResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetParametersByPathResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetParametersByPathResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetParametersByPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParametersByPathResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class GetParametersByPathResponseBodyParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("Value")
        public String value;

        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("ShareType")
        public String shareType;

        public static GetParametersByPathResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetParametersByPathResponseBodyParameters self = new GetParametersByPathResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetParametersByPathResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParametersByPathResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetParametersByPathResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetParametersByPathResponseBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetParametersByPathResponseBodyParameters setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetParametersByPathResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParametersByPathResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetParametersByPathResponseBodyParameters setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetParametersByPathResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetParametersByPathResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParametersByPathResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetParametersByPathResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}
