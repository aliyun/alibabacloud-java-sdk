// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeployApplicationGroupRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The deployment information about the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{       &quot;TemplateURL&quot;: &quot;<a href="https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json">https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json</a>&quot;,       &quot;Parameters&quot;: {         &quot;ZoneId&quot;: &quot;cn-hangzhou-k&quot;,         &quot;ProjectName&quot;: &quot;test&quot;,         &quot;SystemDiskSize&quot;: 40,         &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,         &quot;SecurityGroupId&quot;: &quot;sg-bp1a4374akk63jl8tddy&quot;,         &quot;VSwitchId&quot;: &quot;vsw-bp1fcvc3zn0jrag86rrlm&quot;,         &quot;SystemDiskCategory&quot;: &quot;cloud_essd&quot;,         &quot;InstancePassword&quot;: &quot;******&quot;,         &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,         &quot;InstanceCount&quot;: 1,         &quot;InternetMaxBandwidthOut&quot;: 0,         &quot;VpcId&quot;: &quot;vpc-bp1i99boyas8i8m9t3skp&quot;,         &quot;EcsImageId&quot;: &quot;centos_8_5_x64_20G_alibase_20211228.vhd&quot;,         &quot;DataDiskSize&quot;: 100,         &quot;EcsInstanceType&quot;: &quot;ecs.s6-c1m4.small&quot;,         &quot;DataDiskCategory&quot;: &quot;cloud_efficiency&quot;,         &quot;EnvironmentCommandId&quot;: &quot;c-hz028fc3g031gcg&quot;       }</p>
     */
    @NameInMap("DeployParameters")
    public String deployParameters;

    /**
     * <p>The name of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplicationGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region in which you want to deploy the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeployApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationGroupRequest self = new DeployApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DeployApplicationGroupRequest setDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
        return this;
    }
    public String getDeployParameters() {
        return this.deployParameters;
    }

    public DeployApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
