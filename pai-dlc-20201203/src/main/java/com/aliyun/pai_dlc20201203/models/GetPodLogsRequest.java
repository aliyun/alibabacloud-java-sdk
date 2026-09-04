// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsRequest extends TeaModel {
    /**
     * <p>Specifies whether to download the log file. Valid values:</p>
     * <ul>
     * <li>false (default): Does not download the log file.</li>
     * <li>true: Downloads the log file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DownloadToFile")
    public Boolean downloadToFile;

    /**
     * <p>The end time of the query. Default value: current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T17:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of log lines returned. Default value: 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxLines")
    public Integer maxLines;

    /**
     * <p>The node UID. To obtain the node UID, see <a href="https://help.aliyun.com/document_detail/459677.html">GetJob</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>fe846462-af2c-4521-bd6f-96787a57****</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <p>The start time of the query. Default value: 7 days ago.</p>
     * 
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
