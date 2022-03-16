// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class DownloadReportRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    public static DownloadReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadReportRequest self = new DownloadReportRequest();
        return TeaModel.build(map, self);
    }

    public DownloadReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadReportRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DownloadReportRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
