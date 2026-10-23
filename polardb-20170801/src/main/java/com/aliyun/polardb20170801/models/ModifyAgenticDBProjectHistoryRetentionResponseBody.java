// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAgenticDBProjectHistoryRetentionResponseBody extends TeaModel {
    /**
     * <p>DBClusterId</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The current effective history retention period of the project. To check the actual recoverable range, query the branch recovery window.</p>
     * 
     * <strong>example:</strong>
     * <p>604800</p>
     */
    @NameInMap("HistoryRetentionSeconds")
    public Long historyRetentionSeconds;

    /**
     * <p>ProjectId</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>TenantId</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyAgenticDBProjectHistoryRetentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgenticDBProjectHistoryRetentionResponseBody self = new ModifyAgenticDBProjectHistoryRetentionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAgenticDBProjectHistoryRetentionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAgenticDBProjectHistoryRetentionResponseBody setHistoryRetentionSeconds(Long historyRetentionSeconds) {
        this.historyRetentionSeconds = historyRetentionSeconds;
        return this;
    }
    public Long getHistoryRetentionSeconds() {
        return this.historyRetentionSeconds;
    }

    public ModifyAgenticDBProjectHistoryRetentionResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyAgenticDBProjectHistoryRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAgenticDBProjectHistoryRetentionResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
