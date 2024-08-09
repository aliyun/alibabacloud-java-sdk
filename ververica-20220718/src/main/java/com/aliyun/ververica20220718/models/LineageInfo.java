// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class LineageInfo extends TeaModel {
    @NameInMap("edges")
    public Edge edges;

    @NameInMap("jobInfos")
    public java.util.List<JobInfo> jobInfos;

    @NameInMap("nodes")
    public java.util.List<Node> nodes;

    public static LineageInfo build(java.util.Map<String, ?> map) throws Exception {
        LineageInfo self = new LineageInfo();
        return TeaModel.build(map, self);
    }

    public LineageInfo setEdges(Edge edges) {
        this.edges = edges;
        return this;
    }
    public Edge getEdges() {
        return this.edges;
    }

    public LineageInfo setJobInfos(java.util.List<JobInfo> jobInfos) {
        this.jobInfos = jobInfos;
        return this;
    }
    public java.util.List<JobInfo> getJobInfos() {
        return this.jobInfos;
    }

    public LineageInfo setNodes(java.util.List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<Node> getNodes() {
        return this.nodes;
    }

}
