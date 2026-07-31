// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogStatusRequest extends TeaModel {
    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
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
    public ModifyResourceLogStatusRequestTraceConfig traceConfig;

    /**
     * <p>The Tracing Analysis status. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To enable Tracing Analysis, you must first enable the log status <strong>Status</strong> for the protected object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TraceStatus")
    public Boolean traceStatus;

    public static ModifyResourceLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogStatusRequest self = new ModifyResourceLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyResourceLogStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceLogStatusRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyResourceLogStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyResourceLogStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ModifyResourceLogStatusRequest setTraceConfig(ModifyResourceLogStatusRequestTraceConfig traceConfig) {
        this.traceConfig = traceConfig;
        return this;
    }
    public ModifyResourceLogStatusRequestTraceConfig getTraceConfig() {
        return this.traceConfig;
    }

    public ModifyResourceLogStatusRequest setTraceStatus(Boolean traceStatus) {
        this.traceStatus = traceStatus;
        return this;
    }
    public Boolean getTraceStatus() {
        return this.traceStatus;
    }

    public static class ModifyResourceLogStatusRequestTraceConfig extends TeaModel {
        /**
         * <p>The per-mille sampling rate for Tracing Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("RatePerMille")
        public Integer ratePerMille;

        /**
         * <p>The Hybrid Cloud Monitoring 2.0 workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cms-test</p>
         */
        @NameInMap("Workspace")
        public String workspace;

        public static ModifyResourceLogStatusRequestTraceConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyResourceLogStatusRequestTraceConfig self = new ModifyResourceLogStatusRequestTraceConfig();
            return TeaModel.build(map, self);
        }

        public ModifyResourceLogStatusRequestTraceConfig setRatePerMille(Integer ratePerMille) {
            this.ratePerMille = ratePerMille;
            return this;
        }
        public Integer getRatePerMille() {
            return this.ratePerMille;
        }

        public ModifyResourceLogStatusRequestTraceConfig setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
