// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExportInfoResponseBody extends TeaModel {
    /**
     * <p>The number of data entries that have been exported.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CurrentCount")
    public Integer currentCount;

    /**
     * <p>The status of the export task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: export initialization</li>
     * <li><strong>exporting</strong>: export in progress</li>
     * <li><strong>success</strong>: export successful.</li>
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
     * <p>health_check_export_20171123</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>131231</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The download URL of the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The message returned for the export result. Fixed value: <strong>success</strong>. This value indicates that the export is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The export progress percentage (%).</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data entries in the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
