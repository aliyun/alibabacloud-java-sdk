// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReportData extends TeaModel {
    // data
    @NameInMap("data")
    public String data;

    // score
    @NameInMap("score")
    public Integer score;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    public static ReportData build(java.util.Map<String, ?> map) throws Exception {
        ReportData self = new ReportData();
        return TeaModel.build(map, self);
    }

    public ReportData setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ReportData setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public ReportData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReportData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
