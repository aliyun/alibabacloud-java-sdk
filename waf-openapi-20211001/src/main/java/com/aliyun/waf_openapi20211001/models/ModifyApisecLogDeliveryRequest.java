// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecLogDeliveryRequest extends TeaModel {
    /**
     * <p>The type of the log subscription. Valid values:</p>
     * <ul>
     * <li><strong>risk</strong>: risk information.</li>
     * <li><strong>event</strong>: attack event information.</li>
     * <li><strong>asset</strong>: asset information.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("AssertKey")
    public String assertKey;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3_public_cn-uqm2z****0a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where logs are stored.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2712598.html">DescribeUserSlsLogRegions</a> operation to query available log storage regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionId")
    public String logRegionId;

    /**
     * <p>The name of the Logstore in Simple Log Service.</p>
     * <blockquote>
     * <p> API security logs can be delivered only to Logstores whose names start with apisec-.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apisec-logstore***</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The name of the project in Simple Log Service.</p>
     * <blockquote>
     * <p> API security logs can be delivered only to projects whose names start with apisec-.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apisec-project-14316572********</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyApisecLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecLogDeliveryRequest self = new ModifyApisecLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecLogDeliveryRequest setAssertKey(String assertKey) {
        this.assertKey = assertKey;
        return this;
    }
    public String getAssertKey() {
        return this.assertKey;
    }

    public ModifyApisecLogDeliveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecLogDeliveryRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public ModifyApisecLogDeliveryRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public ModifyApisecLogDeliveryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyApisecLogDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecLogDeliveryRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
