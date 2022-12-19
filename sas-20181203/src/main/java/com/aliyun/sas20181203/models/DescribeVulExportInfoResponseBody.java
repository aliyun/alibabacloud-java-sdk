// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoResponseBody extends TeaModel {
    // The number of exported entries.
    @NameInMap("CurrentCount")
    public Integer currentCount;

    // The status of the export task. Valid values:
    // 
    // - **init**: The task is being initialized.
    // - **exporting**: The task is in progress.
    // - **success**: The task is complete.
    @NameInMap("ExportStatus")
    public String exportStatus;

    // The name of the exported Excel file.
    @NameInMap("FileName")
    public String fileName;

    // The ID of the vulnerability export task.
    @NameInMap("Id")
    public Long id;

    // The URL at which you can download the exported Excel file.
    @NameInMap("Link")
    public String link;

    // The message that shows the task result. The value is fixed as **success*, which indicates that the export task is completed.
    @NameInMap("Message")
    public String message;

    // The progress percentage of the asset export task.
    @NameInMap("Progress")
    public Integer progress;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries in the Excel file.
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
