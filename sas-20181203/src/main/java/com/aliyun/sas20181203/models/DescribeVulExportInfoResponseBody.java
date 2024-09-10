// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of exported entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The status of the export task. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The task is being initialized.</li>
     * <li><strong>exporting</strong>: The task is in progress.</li>
     * <li><strong>success</strong>: The task is complete.</li>
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
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>14356</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The URL at which you can download the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The message that shows the results of the task. The value is fixed as <strong>success</strong>, which indicates that the task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The progress percentage of the task.</p>
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
     * <p>4C1AE3F3-18FA-4108-BXXX-AFA1A032756C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
