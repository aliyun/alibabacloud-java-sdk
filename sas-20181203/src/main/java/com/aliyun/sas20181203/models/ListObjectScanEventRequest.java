// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The MD5 hash value of the file.</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The key of the file that is stored in an OSS bucket.</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the alert. Valid values:</p>
     * <br>
     * <p>*   **high**</p>
     * <p>*   **medium**</p>
     * <p>*   **low**</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The method that is used to detect the malicious file. Valid values:</p>
     * <br>
     * <p>*   **API**: uses API operations.</p>
     * <p>*   **OSS**: uses Object Storage Service (OSS) file check.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The end of the time range during which the exception is detected.</p>
     */
    @NameInMap("TimeEnd")
    public Long timeEnd;

    /**
     * <p>The beginning of the time range during which the exception is detected.</p>
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
