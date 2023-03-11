// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHcExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of exported entries.</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The name of the exported file.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The time when the export task was created.</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <p>The ID of the export task.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The download URL for the exported file.</p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The progress percentage of the export task.</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the export task. Valid values:</p>
     * <br>
     * <p>*   **exporting**: The task is in progress.</p>
     * <p>*   **success**: The task is complete.</p>
     */
    @NameInMap("ResultStatus")
    public String resultStatus;

    /**
     * <p>The total number of exported entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHcExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHcExportInfoResponseBody self = new DescribeHcExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHcExportInfoResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public DescribeHcExportInfoResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeHcExportInfoResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeHcExportInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeHcExportInfoResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public DescribeHcExportInfoResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeHcExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHcExportInfoResponseBody setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public String getResultStatus() {
        return this.resultStatus;
    }

    public DescribeHcExportInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
