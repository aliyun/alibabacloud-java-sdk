// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTaskLogsRequest extends TeaModel {
    @NameInMap("MaxLines")
    public Integer maxLines;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DownloadNeed")
    public Boolean downloadNeed;

    public static GetTaskLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskLogsRequest self = new GetTaskLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskLogsRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public GetTaskLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTaskLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTaskLogsRequest setDownloadNeed(Boolean downloadNeed) {
        this.downloadNeed = downloadNeed;
        return this;
    }
    public Boolean getDownloadNeed() {
        return this.downloadNeed;
    }

}
