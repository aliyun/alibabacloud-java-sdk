// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of the application group.</p>
     */
    @NameInMap("ApplicationGroups")
    public java.util.List<ListApplicationGroupsResponseBodyApplicationGroups> applicationGroups;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69D97BF2-5DF2-544C-A650-36A474E17BC3</p>
     */
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
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApplication</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The ID of the application group in CloudMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("CmsGroupId")
        public String cmsGroupId;

        /**
         * <p>The time when the application group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T10:28:25Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The configuration information of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;TemplateURL&quot;: &quot;<a href="https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json">https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json</a>&quot;,   &quot;Parameters&quot;: {     &quot;ZoneId&quot;: &quot;cn-hangzhou-k&quot;,     &quot;ProjectName&quot;: &quot;test&quot;,     &quot;SystemDiskSize&quot;: 40,     &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,     &quot;SecurityGroupId&quot;: &quot;sg-bp1a4374akk63jl8tddy&quot;,     &quot;VSwitchId&quot;: &quot;vsw-bp1fcvc3zn0jrag86rrlm&quot;,     &quot;SystemDiskCategory&quot;: &quot;cloud_essd&quot;,     &quot;InstancePassword&quot;: &quot;******&quot;,     &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,     &quot;InstanceCount&quot;: 1,     &quot;InternetMaxBandwidthOut&quot;: 0,     &quot;VpcId&quot;: &quot;vpc-bp1i99boyas8i8m9t3skp&quot;,     &quot;EcsImageId&quot;: &quot;centos_8_5_x64_20G_alibase_20211228.vhd&quot;,     &quot;DataDiskSize&quot;: 100,     &quot;EcsInstanceType&quot;: &quot;ecs.s6-c1m4.small&quot;,     &quot;DataDiskCategory&quot;: &quot;cloud_efficiency&quot;,     &quot;EnvironmentCommandId&quot;: &quot;c-hz028fc3g031gcg&quot;   },   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,   &quot;StackName&quot;: &quot;stack-1645688523068-3no_AKhOJ&quot;,   &quot;DisableRollback&quot;: true }</p>
         */
        @NameInMap("DeployParameters")
        public String deployParameters;

        /**
         * <p>The ID of the region in which the related resources reside.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DeployRegionId")
        public String deployRegionId;

        /**
         * <p>The description of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplicationGroup</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("ImportTagKey")
        public String importTagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("ImportTagValue")
        public String importTagValue;

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateMyApplicationGroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The state of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The state information of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplicationGroup is Created.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The time when the application group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08T03:01:53Z</p>
         */
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
