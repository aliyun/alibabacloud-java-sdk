// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Applications")
    public java.util.List<ListApplicationsResponseBodyApplications> applications;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
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

    public ListApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsResponseBody setApplications(java.util.List<ListApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public static class ListApplicationsResponseBodyApplicationsCloudMonitorRule extends TeaModel {
        @NameInMap("EnableSubscribeEvent")
        public Boolean enableSubscribeEvent;

        @NameInMap("EnableInstallAgent")
        public Boolean enableInstallAgent;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ContactGroupList")
        public java.util.List<String> contactGroupList;

        @NameInMap("TemplateIdList")
        public java.util.List<Integer> templateIdList;

        public static ListApplicationsResponseBodyApplicationsCloudMonitorRule build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplicationsCloudMonitorRule self = new ListApplicationsResponseBodyApplicationsCloudMonitorRule();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplicationsCloudMonitorRule setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }
        public Boolean getEnableSubscribeEvent() {
            return this.enableSubscribeEvent;
        }

        public ListApplicationsResponseBodyApplicationsCloudMonitorRule setEnableInstallAgent(Boolean enableInstallAgent) {
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }
        public Boolean getEnableInstallAgent() {
            return this.enableInstallAgent;
        }

        public ListApplicationsResponseBodyApplicationsCloudMonitorRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListApplicationsResponseBodyApplicationsCloudMonitorRule setContactGroupList(java.util.List<String> contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }
        public java.util.List<String> getContactGroupList() {
            return this.contactGroupList;
        }

        public ListApplicationsResponseBodyApplicationsCloudMonitorRule setTemplateIdList(java.util.List<Integer> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<Integer> getTemplateIdList() {
            return this.templateIdList;
        }

    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("IsSystem")
        public Boolean isSystem;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("CloudMonitorRule")
        public ListApplicationsResponseBodyApplicationsCloudMonitorRule cloudMonitorRule;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListApplicationsResponseBodyApplications setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public ListApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplications setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListApplicationsResponseBodyApplications setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationsResponseBodyApplications setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsResponseBodyApplications setCloudMonitorRule(ListApplicationsResponseBodyApplicationsCloudMonitorRule cloudMonitorRule) {
            this.cloudMonitorRule = cloudMonitorRule;
            return this;
        }
        public ListApplicationsResponseBodyApplicationsCloudMonitorRule getCloudMonitorRule() {
            return this.cloudMonitorRule;
        }

    }

}
