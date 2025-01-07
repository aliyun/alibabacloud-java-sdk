// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>ltrbuck****</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The MD5 hash value of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0552c44e243abdea1729d4507bce****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The key of the file that is stored in an OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the alert that is generated for the package to which the subfile belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentEventId")
    public Long parentEventId;

    /**
     * <p>The risk level of the alert. Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The method that is used to detect the malicious file. Valid values:</p>
     * <ul>
     * <li><strong>API</strong>: uses API operations.</li>
     * <li><strong>OSS</strong>: uses Object Storage Service (OSS) file check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The end of the time range during which the exception is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>1683862286000</p>
     */
    @NameInMap("TimeEnd")
    public Long timeEnd;

    /**
     * <p>The beginning of the time range during which the exception is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>1683603086000</p>
     */
    @NameInMap("TimeStart")
    public Long timeStart;

    public static ListObjectScanEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectScanEventRequest self = new ListObjectScanEventRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectScanEventRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListObjectScanEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListObjectScanEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public ListObjectScanEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListObjectScanEventRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public ListObjectScanEventRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public ListObjectScanEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListObjectScanEventRequest setParentEventId(Long parentEventId) {
        this.parentEventId = parentEventId;
        return this;
    }
    public Long getParentEventId() {
        return this.parentEventId;
    }

    public ListObjectScanEventRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ListObjectScanEventRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListObjectScanEventRequest setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    public ListObjectScanEventRequest setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public Long getTimeStart() {
        return this.timeStart;
    }

}
