// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWarningExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of baseline entries that are exported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The status of the export task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The task is being initialized.</li>
     * <li><strong>exporting</strong>: The task is in progress.</li>
     * <li><strong>success</strong>: The task is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <p>The name of the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p>app_20210917</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the export task for the baseline check result.</p>
     * 
     * <strong>example:</strong>
     * <p>131231</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The URL at which you can download the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://eds.aliyun.com/notification/entitle/64b5c3e2-e52b-4d29-9617-e7e6d74XXXX">https://eds.aliyun.com/notification/entitle/64b5c3e2-e52b-4d29-9617-e7e6d74XXXX</a></p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The message that shows the task result. The value is fixed as <strong>successful</strong>, which indicates that the export task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The progress percentage of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of baseline entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
