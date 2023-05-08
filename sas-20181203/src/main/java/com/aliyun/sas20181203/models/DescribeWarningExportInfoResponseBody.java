// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoResponseBody extends TeaModel {
    @NameInMap("CurrentCount")
    public Integer currentCount;

    @NameInMap("ExportStatus")
    public String exportStatus;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Id")
    public Long id;

    /**
     * <p>Queries the progress of a export task for a baseline check result.</p>
     */
    @NameInMap("Link")
    public String link;

    @NameInMap("Message")
    public String message;

    /**
     * <p>DescribeWarningExportInfo</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("RequestId")
    public String requestId;

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
