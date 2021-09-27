// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardRequest extends TeaModel {
    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 任务Id
    @NameInMap("JobId")
    public String jobId;

    // DataSource Id
    @NameInMap("DataSourceId")
    public String dataSourceId;

    // Tensorboard名称
    @NameInMap("DisplayName")
    public String displayName;

    // Summary 目录
    @NameInMap("SummaryPath")
    public String summaryPath;

    @NameInMap("DataSources")
    public java.util.List<DataSourceItem> dataSources;

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

    public CreateTensorboardRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateTensorboardRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateTensorboardRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTensorboardRequest setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
        return this;
    }
    public String getSummaryPath() {
        return this.summaryPath;
    }

    public CreateTensorboardRequest setDataSources(java.util.List<DataSourceItem> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DataSourceItem> getDataSources() {
        return this.dataSources;
    }

}
