// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogStatusShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the dry run mode. If you do not specify this parameter, a normal request is sent. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A dry run request is sent. The system checks whether the request meets the execution conditions without performing the specified operation. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Log.Control.DryRunOperation is returned.</li>
     * <li><strong>false</strong>: A normal request is sent. The specified operation is performed after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zz11zcl****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-wewbb23dfsetetcic1242-0****</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The log enabling status of the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Not enabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>The Tracing Analysis configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Workspace&quot;:&quot;cms-test&quot;,&quot;RatePerMille&quot;:90}</p>
     */
    @NameInMap("TraceConfig")
    public String traceConfigShrink;

    /**
     * <p>The Tracing Analysis status. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Shutdown.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To enable Tracing Analysis, you must first enable the log status <strong>Status</strong> of the protected object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TraceStatus")
    public Boolean traceStatus;

    public static ModifyResourceLogStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogStatusShrinkRequest self = new ModifyResourceLogStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogStatusShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyResourceLogStatusShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyResourceLogStatusShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceLogStatusShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyResourceLogStatusShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyResourceLogStatusShrinkRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ModifyResourceLogStatusShrinkRequest setTraceConfigShrink(String traceConfigShrink) {
        this.traceConfigShrink = traceConfigShrink;
        return this;
    }
    public String getTraceConfigShrink() {
        return this.traceConfigShrink;
    }

    public ModifyResourceLogStatusShrinkRequest setTraceStatus(Boolean traceStatus) {
        this.traceStatus = traceStatus;
        return this;
    }
    public Boolean getTraceStatus() {
        return this.traceStatus;
    }

}
