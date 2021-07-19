// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ApplicationGroups")
    public java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> applicationGroups;

    public static ListApplicationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsResponseBody self = new ListApplicationGroupsResponseBody();
        return TeaModel.build(map, self);
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

    public ListApplicationGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationGroupsResponseBody setApplicationGroups(java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> applicationGroups) {
        this.applicationGroups = applicationGroups;
        return this;
    }
    public java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> getApplicationGroups() {
        return this.applicationGroups;
    }

    public static class ListApplicationGroupsResponseBodyApplicationGroups extends TeaModel {
        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ImportClusterId")
        public String importClusterId;

        public static ListApplicationGroupsResponseBodyApplicationGroups build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationGroupsResponseBodyApplicationGroups self = new ListApplicationGroupsResponseBodyApplicationGroups();
            return TeaModel.build(map, self);
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

        public ListApplicationGroupsResponseBodyApplicationGroups setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public ListApplicationGroupsResponseBodyApplicationGroups setImportClusterId(String importClusterId) {
            this.importClusterId = importClusterId;
            return this;
        }
        public String getImportClusterId() {
            return this.importClusterId;
        }

    }

}
