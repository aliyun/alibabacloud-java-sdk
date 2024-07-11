// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the application group.</p>
     */
    @NameInMap("ApplicationGroup")
    public GetApplicationGroupResponseBodyApplicationGroup applicationGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>92EA60ED-544D-55E9-93D9-237BE9976C0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupResponseBody self = new GetApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupResponseBody setApplicationGroup(GetApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public GetApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public GetApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationGroupResponseBodyApplicationGroup extends TeaModel {
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
         * <p>The output of the deployment result.</p>
         * 
         * <strong>example:</strong>
         * <p>{       &quot;Outputs&quot;: [         {           &quot;Description&quot;: &quot;No description given&quot;,           &quot;OutputKey&quot;: &quot;InstanceIds&quot;         }       ],       &quot;StackId&quot;: &quot;6ef4b860-f6e7-4145-8d22-f4a2a32363e1&quot;     }   }</p>
         */
        @NameInMap("DeployOutputs")
        public String deployOutputs;

        /**
         * <p>The configuration information of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>{       &quot;TemplateURL&quot;: &quot;<a href="https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json">https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json</a>&quot;,       &quot;Parameters&quot;: {         &quot;ZoneId&quot;: &quot;cn-hangzhou-k&quot;,         &quot;ProjectName&quot;: &quot;test&quot;,         &quot;SystemDiskSize&quot;: 40,         &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,         &quot;SecurityGroupId&quot;: &quot;sg-bp1a4374akk63jl8tddy&quot;,         &quot;VSwitchId&quot;: &quot;vsw-bp1fcvc3zn0jrag86rrlm&quot;,         &quot;SystemDiskCategory&quot;: &quot;cloud_essd&quot;,         &quot;InstancePassword&quot;: &quot;******&quot;,         &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,         &quot;InstanceCount&quot;: 1,         &quot;InternetMaxBandwidthOut&quot;: 0,         &quot;VpcId&quot;: &quot;vpc-bp1i99boyas8i8m9t3skp&quot;,         &quot;EcsImageId&quot;: &quot;centos_8_5_x64_20G_alibase_20211228.vhd&quot;,         &quot;DataDiskSize&quot;: 100,         &quot;EcsInstanceType&quot;: &quot;ecs.s6-c1m4.small&quot;,         &quot;DataDiskCategory&quot;: &quot;cloud_efficiency&quot;,         &quot;EnvironmentCommandId&quot;: &quot;c-hz028fc3g031gcg&quot;       }</p>
         */
        @NameInMap("DeployParameters")
        public String deployParameters;

        /**
         * <p>The ID of the region in which you deploy the application group.</p>
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
         * <p>MyApplicationGroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The creation progress of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

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
         * <p>Stack CREATE completed successfully</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The time when the application group was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T10:28:25Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationGroupResponseBodyApplicationGroup self = new GetApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public GetApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCmsGroupId(String cmsGroupId) {
            this.cmsGroupId = cmsGroupId;
            return this;
        }
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployOutputs(String deployOutputs) {
            this.deployOutputs = deployOutputs;
            return this;
        }
        public String getDeployOutputs() {
            return this.deployOutputs;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployParameters(String deployParameters) {
            this.deployParameters = deployParameters;
            return this;
        }
        public String getDeployParameters() {
            return this.deployParameters;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployRegionId(String deployRegionId) {
            this.deployRegionId = deployRegionId;
            return this;
        }
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setImportTagKey(String importTagKey) {
            this.importTagKey = importTagKey;
            return this;
        }
        public String getImportTagKey() {
            return this.importTagKey;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setImportTagValue(String importTagValue) {
            this.importTagValue = importTagValue;
            return this;
        }
        public String getImportTagValue() {
            return this.importTagValue;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
