// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class Report extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // reportId
    @NameInMap("reportId")
    public String reportId;

    // reportTime
    @NameInMap("reportTime")
    public Long reportTime;

    // score
    @NameInMap("score")
    public Integer score;

    public static Report build(java.util.Map<String, ?> map) throws Exception {
        Report self = new Report();
        return TeaModel.build(map, self);
    }

    public Report setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Report setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public Report setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public Report setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

}
