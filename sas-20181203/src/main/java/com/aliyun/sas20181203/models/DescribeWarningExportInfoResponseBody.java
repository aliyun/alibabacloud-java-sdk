// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoResponseBody extends TeaModel {
    // The number of baseline entries that are exported.
    @NameInMap("CurrentCount")
    public Integer currentCount;

    // The status of the export task.
    // 
    // Valid values:
    // 
    // *   **init**: The task is being initialized.
    // *   **exporting**: The task is in progress.
    // *   **success**: The task is successful.
    @NameInMap("ExportStatus")
    public String exportStatus;

    // The name of the exported Excel file.
    @NameInMap("FileName")
    public String fileName;

    // The ID of the export task for the baseline check result.
    @NameInMap("Id")
    public Long id;

    // The URL at which you can download the exported Excel file.
    @NameInMap("Link")
    public String link;

    // The message that shows the export task result. The value is fixed as **successful**, which indicates that the export task is successful.
    @NameInMap("Message")
    public String message;

    // The progress percentage of the export task.
    @NameInMap("Progress")
    public Integer progress;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of baseline entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWarningExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarningExportInfoResponseBody self = new DescribeWarningExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWarningExportInfoResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public DescribeWarningExportInfoResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public DescribeWarningExportInfoResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeWarningExportInfoResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeWarningExportInfoResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public DescribeWarningExportInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWarningExportInfoResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeWarningExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWarningExportInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
