// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // DataSource Id
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSources")
    public java.util.List<DataSourceItem> dataSources;

    // Tensorboard名称
    @NameInMap("DisplayName")
    public String displayName;

    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    // 最长运行时长
    @NameInMap("MaxRunningTimeMinutes")
    public Long maxRunningTimeMinutes;

    // Summary 目录
    @NameInMap("SummaryPath")
    public String summaryPath;

    public static CreateTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTensorboardRequest self = new CreateTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public CreateTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateTensorboardRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateTensorboardRequest setDataSources(java.util.List<DataSourceItem> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSourceItem> getDataSources() {
        return this.dataSources;
    }

    public CreateTensorboardRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTensorboardRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTensorboardRequest setMaxRunningTimeMinutes(Long maxRunningTimeMinutes) {
        this.maxRunningTimeMinutes = maxRunningTimeMinutes;
        return this;
    }
    public Long getMaxRunningTimeMinutes() {
        return this.maxRunningTimeMinutes;
    }

    public CreateTensorboardRequest setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

}
