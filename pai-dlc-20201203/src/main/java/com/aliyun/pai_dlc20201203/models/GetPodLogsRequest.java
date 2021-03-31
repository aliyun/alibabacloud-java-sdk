// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsRequest extends TeaModel {
    // 返回的日志的最大行数，默认值：2000。
    @NameInMap("MaxLines")
    public Integer maxLines;

    // 查询的起始时间，默认值：7天前。
    @NameInMap("StartTime")
    public String startTime;

    // 查询的截止时间，默认值：当前。
    @NameInMap("EndTime")
    public String endTime;

    // 是否下载日志文件，默认：false。
    @NameInMap("DownloadToFile")
    public Boolean downloadToFile;

    public static GetPodLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPodLogsRequest self = new GetPodLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetPodLogsRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public GetPodLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetPodLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetPodLogsRequest setDownloadToFile(Boolean downloadToFile) {
        this.downloadToFile = downloadToFile;
        return this;
    }
    public Boolean getDownloadToFile() {
        return this.downloadToFile;
    }

}
