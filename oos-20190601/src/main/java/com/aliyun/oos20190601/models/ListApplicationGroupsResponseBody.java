// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("ApplicationGroups")
    public java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> applicationGroups;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsResponseBody self = new ListApplicationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationGroupsResponseBody setApplicationGroups(java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> applicationGroups) {
        this.applicationGroups = applicationGroups;
        return this;
    }
    public java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> getApplicationGroups() {
        return this.applicationGroups;
    }

    public ListApplicationGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationGroupsResponseBodyApplicationGroups extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("CmsGroupId")
        public String cmsGroupId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeployParameters")
        public String deployParameters;

        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImportTagKey")
        public String importTagKey;

        @NameInMap("ImportTagValue")
        public String importTagValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListApplicationGroupsResponseBodyApplicationGroups build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationGroupsResponseBodyApplicationGroups self = new ListApplicationGroupsResponseBodyApplicationGroups();
            return TeaModel.build(map, self);
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setCmsGroupId(String cmsGroupId) {
            this.cmsGroupId = cmsGroupId;
            return this;
        }
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setDeployParameters(String deployParameters) {
            this.deployParameters = deployParameters;
            return this;
        }
        public String getDeployParameters() {
            return this.deployParameters;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setDeployRegionId(String deployRegionId) {
            this.deployRegionId = deployRegionId;
            return this;
        }
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setImportTagKey(String importTagKey) {
            this.importTagKey = importTagKey;
            return this;
        }
        public String getImportTagKey() {
            return this.importTagKey;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setImportTagValue(String importTagValue) {
            this.importTagValue = importTagValue;
            return this;
        }
        public String getImportTagValue() {
            return this.importTagValue;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
