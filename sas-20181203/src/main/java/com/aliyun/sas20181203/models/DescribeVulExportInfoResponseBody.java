// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of exported entries.</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The status of the export task. Valid values:</p>
     * <br>
     * <p>*   **init**: The task is being initialized.</p>
     * <p>*   **exporting**: The task is in progress.</p>
     * <p>*   **success**: The task is complete.</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <p>The name of the exported Excel file.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The URL at which you can download the exported Excel file.</p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The message that shows the results of the task. The value is fixed as **success**, which indicates that the task is complete.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The progress percentage of the task.</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the exported Excel file.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulExportInfoResponseBody self = new DescribeVulExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulExportInfoResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public DescribeVulExportInfoResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public DescribeVulExportInfoResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeVulExportInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeVulExportInfoResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public DescribeVulExportInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVulExportInfoResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeVulExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulExportInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
