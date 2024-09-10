// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportCustomizeReportResponseBody extends TeaModel {
    /**
     * <p>The download URL of the security report.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The time when the security report was exported.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-10</p>
     */
    @NameInMap("ExportDate")
    public String exportDate;

    /**
     * <p>The ID of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    /**
     * <p>The status of the export task. Valid values:</p>
     * <ul>
     * <li><strong>fail</strong>: The export task fails.</li>
     * <li><strong>exporting</strong>: The export task is being executed.</li>
     * <li><strong>success</strong>: The export task is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exporting</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <p>The name of the report file that is exported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_xxxx.html</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the security report.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FFDFCEB3-A5EE-590A-8E70-283EBC5D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the download URL expires. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1673335497000</p>
     */
    @NameInMap("UrlExpiredTime")
    public Long urlExpiredTime;

    public static ExportCustomizeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomizeReportResponseBody self = new ExportCustomizeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportCustomizeReportResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public ExportCustomizeReportResponseBody setExportDate(String exportDate) {
        this.exportDate = exportDate;
        return this;
    }
    public String getExportDate() {
        return this.exportDate;
    }

    public ExportCustomizeReportResponseBody setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

    public ExportCustomizeReportResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public ExportCustomizeReportResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ExportCustomizeReportResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public ExportCustomizeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportCustomizeReportResponseBody setUrlExpiredTime(Long urlExpiredTime) {
        this.urlExpiredTime = urlExpiredTime;
        return this;
    }
    public Long getUrlExpiredTime() {
        return this.urlExpiredTime;
    }

}
