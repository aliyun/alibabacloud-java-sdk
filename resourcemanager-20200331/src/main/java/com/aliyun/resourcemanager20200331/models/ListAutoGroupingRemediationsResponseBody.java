// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRemediationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The remediation records.</p>
     */
    @NameInMap("Remediations")
    public java.util.List<ListAutoGroupingRemediationsResponseBodyRemediations> remediations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F959E33-7B6D-5F58-BB0B-ED616DC7C70B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAutoGroupingRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRemediationsResponseBody self = new ListAutoGroupingRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRemediationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoGroupingRemediationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoGroupingRemediationsResponseBody setRemediations(java.util.List<ListAutoGroupingRemediationsResponseBodyRemediations> remediations) {
        this.remediations = remediations;
        return this;
    }
    public java.util.List<ListAutoGroupingRemediationsResponseBodyRemediations> getRemediations() {
        return this.remediations;
    }

    public ListAutoGroupingRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo extends TeaModel {
        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectA</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmygrk****wfa</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo self = new ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo();
            return TeaModel.build(map, self);
        }

        public ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListAutoGroupingRemediationsResponseBodyRemediations extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remediation record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0028d4****cfe94956ef6708a373f396fbc840e306f</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>The remediation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01 00:00:00</p>
         */
        @NameInMap("RemediationTime")
        public String remediationTime;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf664f66v1****drkea4</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the Alibaba Cloud service.</p>
         * <p>You can obtain the ID from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The information about the new resource group.</p>
         */
        @NameInMap("TargetResourceGroupInfo")
        public ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo targetResourceGroupInfo;

        public static ListAutoGroupingRemediationsResponseBodyRemediations build(java.util.Map<String, ?> map) throws Exception {
            ListAutoGroupingRemediationsResponseBodyRemediations self = new ListAutoGroupingRemediationsResponseBodyRemediations();
            return TeaModel.build(map, self);
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setRemediationTime(String remediationTime) {
            this.remediationTime = remediationTime;
            return this;
        }
        public String getRemediationTime() {
            return this.remediationTime;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListAutoGroupingRemediationsResponseBodyRemediations setTargetResourceGroupInfo(ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo targetResourceGroupInfo) {
            this.targetResourceGroupInfo = targetResourceGroupInfo;
            return this;
        }
        public ListAutoGroupingRemediationsResponseBodyRemediationsTargetResourceGroupInfo getTargetResourceGroupInfo() {
            return this.targetResourceGroupInfo;
        }

    }

}
