// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListApplicationsResponseBodyApplications> applications;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(java.util.List<ListApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsResponseBodyApplications setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationsResponseBodyApplications setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListApplicationsResponseBodyApplications setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
