// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setDomains(java.util.List<ListDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<ListDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("BucketType")
        public String bucketType;

        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("CrowdIds")
        public String crowdIds;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("Flow")
        public Long flow;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("IsDefaultDomain")
        public Boolean isDefaultDomain;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("LayerName")
        public String layerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomains self = new ListDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomains setBucketType(String bucketType) {
            this.bucketType = bucketType;
            return this;
        }
        public String getBucketType() {
            return this.bucketType;
        }

        public ListDomainsResponseBodyDomains setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public ListDomainsResponseBodyDomains setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListDomainsResponseBodyDomains setCrowdIds(String crowdIds) {
            this.crowdIds = crowdIds;
            return this;
        }
        public String getCrowdIds() {
            return this.crowdIds;
        }

        public ListDomainsResponseBodyDomains setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListDomainsResponseBodyDomains setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListDomainsResponseBodyDomains setFlow(Long flow) {
            this.flow = flow;
            return this;
        }
        public Long getFlow() {
            return this.flow;
        }

        public ListDomainsResponseBodyDomains setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListDomainsResponseBodyDomains setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListDomainsResponseBodyDomains setIsDefaultDomain(Boolean isDefaultDomain) {
            this.isDefaultDomain = isDefaultDomain;
            return this;
        }
        public Boolean getIsDefaultDomain() {
            return this.isDefaultDomain;
        }

        public ListDomainsResponseBodyDomains setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListDomainsResponseBodyDomains setLayerName(String layerName) {
            this.layerName = layerName;
            return this;
        }
        public String getLayerName() {
            return this.layerName;
        }

        public ListDomainsResponseBodyDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDomainsResponseBodyDomains setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDomainsResponseBodyDomains setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDomainsResponseBodyDomains setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
