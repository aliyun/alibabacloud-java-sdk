// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecModuleStatusRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqtm**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the compliance check feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportStatus")
    public Long reportStatus;

    /**
     * <p>The name of the protected object group to which the protected object belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>group1</p>
     */
    @NameInMap("ResourceGroups")
    public String resourceGroups;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the protected object.</p>
     * 
     * <strong>example:</strong>
     * <p>cwaf-***-waf</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The status of the tracing and auditing feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TraceStatus")
    public Integer traceStatus;

    public static ModifyApisecModuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecModuleStatusRequest self = new ModifyApisecModuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApisecModuleStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyApisecModuleStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApisecModuleStatusRequest setReportStatus(Long reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public Long getReportStatus() {
        return this.reportStatus;
    }

    public ModifyApisecModuleStatusRequest setResourceGroups(String resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public String getResourceGroups() {
        return this.resourceGroups;
    }

    public ModifyApisecModuleStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyApisecModuleStatusRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ModifyApisecModuleStatusRequest setTraceStatus(Integer traceStatus) {
        this.traceStatus = traceStatus;
        return this;
    }
    public Integer getTraceStatus() {
        return this.traceStatus;
    }

}
