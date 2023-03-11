// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of exported entries.</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The status of the export task.</p>
     * <br>
     * <p>Valid values:</p>
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
     * <p>The ID of the export task.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The URL at which you can download the exported Excel file.</p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The message that shows the task result. The value is fixed as **success**, which indicates that the task is complete.</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>The total number of entries in the exported Excel file.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportInfoResponseBody self = new DescribeExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExportInfoResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public DescribeExportInfoResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public DescribeExportInfoResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeExportInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeExportInfoResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public DescribeExportInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExportInfoResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExportInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
