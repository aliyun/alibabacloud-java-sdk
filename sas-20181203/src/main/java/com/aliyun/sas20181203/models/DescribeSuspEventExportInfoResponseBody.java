// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventExportInfoResponseBody extends TeaModel {
    /**
     * <p>The handling status for the exception. Valid values:</p>
     * <ul>
     * <li><strong>exporting</strong>: in progress</li>
     * <li><strong>success</strong>: successful</li>
     * <li><strong>failed</strong>: failed</li>
     * <li><strong>pending</strong>: pending</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <p>The name of the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p>suspicious_event_20221221_1671590521234.zip</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The time when the export task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-20T15:18Z</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <p>The time when the export task was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-20T15:18Z</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

    /**
     * <p>The ID of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The URL at which you can download the exported Excel file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://suspicious-xxxxxxx.oss-cn-shanghai.aliyuncs.com/xxxxxxxxxxx/suspicious_event_20221221_1671590525269.zip?Expires=1671594125&OSSAccessKeyId=yourAccessKeyID&Signature=xxxxxxxxxxxxxxxxxx">http://suspicious-xxxxxxx.oss-cn-shanghai.aliyuncs.com/xxxxxxxxxxx/suspicious_event_20221221_1671590525269.zip?Expires=1671594125&amp;OSSAccessKeyId=yourAccessKeyID&amp;Signature=xxxxxxxxxxxxxxxxxx</a></p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <p>The progress percentage of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The exported parameters of exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>id,eventSubType,eventDetail,level,status,ip,instanceName,desc,lastTime,operateTime,note</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578AXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of exceptions exported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The type of the export task. The value is fixed as suspiciousEvent.</p>
     * 
     * <strong>example:</strong>
     * <p>suspiciousEvent</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSuspEventExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventExportInfoResponseBody self = new DescribeSuspEventExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventExportInfoResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public DescribeSuspEventExportInfoResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeSuspEventExportInfoResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeSuspEventExportInfoResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeSuspEventExportInfoResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeSuspEventExportInfoResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public DescribeSuspEventExportInfoResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeSuspEventExportInfoResponseBody setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public DescribeSuspEventExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventExportInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSuspEventExportInfoResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
