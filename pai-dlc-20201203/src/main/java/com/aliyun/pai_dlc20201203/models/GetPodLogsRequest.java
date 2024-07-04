// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DownloadToFile")
    public Boolean downloadToFile;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T17:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxLines")
    public Integer maxLines;

    /**
     * <strong>example:</strong>
     * <p>fe846462-af2c-4521-bd6f-96787a57****</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetPodLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPodLogsRequest self = new GetPodLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetPodLogsRequest setDownloadToFile(Boolean downloadToFile) {
        this.downloadToFile = downloadToFile;
        return this;
    }
    public Boolean getDownloadToFile() {
        return this.downloadToFile;
    }

    public GetPodLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetPodLogsRequest setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        return this;
    }
    public Integer getMaxLines() {
        return this.maxLines;
    }

    public GetPodLogsRequest setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public GetPodLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
