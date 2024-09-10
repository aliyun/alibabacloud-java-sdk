// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportExportResponseBody extends TeaModel {
    /**
     * <p>The download URL of the report.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The time when the report was exported.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-15</p>
     */
    @NameInMap("ExportDate")
    public String exportDate;

    /**
     * <p>The ID of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExportId")
    public Long exportId;

    /**
     * <p>The status of the export task. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: The export task fails.</li>
     * <li><strong>0</strong>: The export task is being initialized.</li>
     * <li><strong>1</strong>: The export task is being executed.</li>
     * <li><strong>2</strong>: The export task is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <p>The ID of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>377665</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the download URL expires. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1660113647000</p>
     */
    @NameInMap("UrlExpiredTime")
    public Long urlExpiredTime;

    public static DescribeReportExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportExportResponseBody self = new DescribeReportExportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReportExportResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DescribeReportExportResponseBody setExportDate(String exportDate) {
        this.exportDate = exportDate;
        return this;
    }
    public String getExportDate() {
        return this.exportDate;
    }

    public DescribeReportExportResponseBody setExportId(Long exportId) {
        this.exportId = exportId;
        return this;
    }
    public Long getExportId() {
        return this.exportId;
    }

    public DescribeReportExportResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public DescribeReportExportResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeReportExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReportExportResponseBody setUrlExpiredTime(Long urlExpiredTime) {
        this.urlExpiredTime = urlExpiredTime;
        return this;
    }
    public Long getUrlExpiredTime() {
        return this.urlExpiredTime;
    }

}
