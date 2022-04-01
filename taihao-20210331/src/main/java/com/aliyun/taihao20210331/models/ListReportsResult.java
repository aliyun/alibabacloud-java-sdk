// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListReportsResult extends TeaModel {
    // reportId
    @NameInMap("reportId")
    public String reportId;

    // reportTime
    @NameInMap("reportTime")
    public Long reportTime;

    // score
    @NameInMap("score")
    public Integer score;

    public static ListReportsResult build(java.util.Map<String, ?> map) throws Exception {
        ListReportsResult self = new ListReportsResult();
        return TeaModel.build(map, self);
    }

    public ListReportsResult setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ListReportsResult setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public ListReportsResult setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

}
