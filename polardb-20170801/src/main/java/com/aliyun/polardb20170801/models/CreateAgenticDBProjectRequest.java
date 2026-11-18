// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBProjectRequest extends TeaModel {
    /**
     * <p>The ID of the AgenticDB cluster. The ID must have the pagc- prefix. You can obtain the ID after calling CreateDBCluster and specifying AgenticDbType=dedicated and ServerlessType=AgileServerless. A regular cluster ID with the pc- prefix is not supported. If an invalid ID is provided, the InvalidDBClusterId.NotFound error may be returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the default branch. Default value: main.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("DefaultBranchName")
    public String defaultBranchName;

    /**
     * <p>The description of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>Production analytics database</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The retention period of historical data, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>604800</p>
     */
    @NameInMap("HistoryRetentionSeconds")
    public Long historyRetentionSeconds;

    /**
     * <p>The name of the project. The name must be unique within the same tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>analytics-prod</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the tenant. You can obtain the ID from the response after calling CreateAgenticDBTenant to create a tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the zone where the project storage resides. The zone must be the same as the zone where the cluster compute resides. If this parameter is not specified, the zone where the cluster compute resides is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-l</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateAgenticDBProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBProjectRequest self = new CreateAgenticDBProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBProjectRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgenticDBProjectRequest setDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
        return this;
    }
    public String getDefaultBranchName() {
        return this.defaultBranchName;
    }

    public CreateAgenticDBProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgenticDBProjectRequest setHistoryRetentionSeconds(Long historyRetentionSeconds) {
        this.historyRetentionSeconds = historyRetentionSeconds;
        return this;
    }
    public Long getHistoryRetentionSeconds() {
        return this.historyRetentionSeconds;
    }

    public CreateAgenticDBProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAgenticDBProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAgenticDBProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAgenticDBProjectRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
