// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListParameterVersionsResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("CreatedDate")
    public String createdDate;

    @NameInMap("Name")
    public String name;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Id")
    public String id;

    @NameInMap("ParameterVersions")
    public java.util.List<ListParameterVersionsResponseBodyParameterVersions> parameterVersions;

    public static ListParameterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsResponseBody self = new ListParameterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListParameterVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListParameterVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParameterVersionsResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListParameterVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListParameterVersionsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListParameterVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListParameterVersionsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListParameterVersionsResponseBody setParameterVersions(java.util.List<ListParameterVersionsResponseBodyParameterVersions> parameterVersions) {
        this.parameterVersions = parameterVersions;
        return this;
    }
    public java.util.List<ListParameterVersionsResponseBodyParameterVersions> getParameterVersions() {
        return this.parameterVersions;
    }

    public static class ListParameterVersionsResponseBodyParameterVersions extends TeaModel {
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        @NameInMap("Value")
        public String value;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

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

        public ListParameterVersionsResponseBodyParameterVersions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListParameterVersionsResponseBodyParameterVersions setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListParameterVersionsResponseBodyParameterVersions setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

    }

}
