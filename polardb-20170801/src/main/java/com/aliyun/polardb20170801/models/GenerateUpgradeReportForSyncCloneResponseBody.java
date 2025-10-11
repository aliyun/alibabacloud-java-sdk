// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GenerateUpgradeReportForSyncCloneResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>pc-k2j96w169uhu868l8</p>
     */
    @NameInMap("SourceDBClusterId")
    public String sourceDBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2312111</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static GenerateUpgradeReportForSyncCloneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeReportForSyncCloneResponseBody self = new GenerateUpgradeReportForSyncCloneResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeReportForSyncCloneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUpgradeReportForSyncCloneResponseBody setSourceDBClusterId(String sourceDBClusterId) {
        this.sourceDBClusterId = sourceDBClusterId;
        return this;
    }
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    public GenerateUpgradeReportForSyncCloneResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
