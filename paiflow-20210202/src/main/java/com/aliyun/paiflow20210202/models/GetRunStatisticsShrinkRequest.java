// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunStatisticsShrinkRequest extends TeaModel {
    // pipeline的id
    @NameInMap("PipelineId")
    public String pipelineId;

    // run的状态
    @NameInMap("Status")
    public String statusShrink;

    // run的名字
    @NameInMap("Name")
    public String name;

    // run的来源
    @NameInMap("Source")
    public String source;

    // run的范围
    @NameInMap("Scope")
    public String scope;

    // 实验的id
    @NameInMap("ExperimentId")
    public String experimentId;

    // 工作空间id 该字段仅对Scope为User有效，统计该用户在该工作空间下的数据
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 是否统计主账户下所有子账户的数据
    @NameInMap("IsShowAll")
    public Boolean isShowAll;

    public static GetRunStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunStatisticsShrinkRequest self = new GetRunStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRunStatisticsShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public GetRunStatisticsShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

    public GetRunStatisticsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRunStatisticsShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRunStatisticsShrinkRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetRunStatisticsShrinkRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetRunStatisticsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetRunStatisticsShrinkRequest setIsShowAll(Boolean isShowAll) {
        this.isShowAll = isShowAll;
        return this;
    }
    public Boolean getIsShowAll() {
        return this.isShowAll;
    }

}
