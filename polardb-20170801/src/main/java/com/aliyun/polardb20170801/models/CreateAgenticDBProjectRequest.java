// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBProjectRequest extends TeaModel {
    /**
     * <p>The ID of the AgenticDB cluster.</p>
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
     * <p>The retention period for historical data to support creating branches at specific points in time. Default value: 604800 seconds (7 days). Valid values: 3600 to 2592000 seconds (1 hour to 30 days), inclusive. The actual range is subject to the service configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>604800</p>
     */
    @NameInMap("HistoryRetentionSeconds")
    public Long historyRetentionSeconds;

    /**
     * <p>The name of the project. The name must be unique within the tenant.</p>
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
     * <p>The ID of the tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

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

}
