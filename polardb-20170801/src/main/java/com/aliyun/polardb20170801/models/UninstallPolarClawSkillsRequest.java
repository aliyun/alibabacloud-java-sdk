// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UninstallPolarClawSkillsRequest extends TeaModel {
    /**
     * <p>The task-level target agent (workspace). If not specified, the default agent is used.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to view region details.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task-level scope: workspace (default) or global. This parameter is mutually exclusive with AgentId.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The names of the skills to uninstall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;polarclawhub&quot;,&quot;github&quot;]</p>
     */
    @NameInMap("UninstallSkillNames")
    public String uninstallSkillNames;

    public static UninstallPolarClawSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPolarClawSkillsRequest self = new UninstallPolarClawSkillsRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPolarClawSkillsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UninstallPolarClawSkillsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UninstallPolarClawSkillsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UninstallPolarClawSkillsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UninstallPolarClawSkillsRequest setUninstallSkillNames(String uninstallSkillNames) {
        this.uninstallSkillNames = uninstallSkillNames;
        return this;
    }
    public String getUninstallSkillNames() {
        return this.uninstallSkillNames;
    }

}
