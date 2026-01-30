// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListObjectScanEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sha256</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <strong>example:</strong>
     * <p>testBucket******</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>e991e62f484bb6accd676e57a9******</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentEventId")
    public Long parentEventId;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1683862286000</p>
     */
    @NameInMap("TimeEnd")
    public Long timeEnd;

    /**
     * <strong>example:</strong>
     * <p>1683603086000</p>
     */
    @NameInMap("TimeStart")
    public Long timeStart;

    public static ListObjectScanEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectScanEventRequest self = new ListObjectScanEventRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectScanEventRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
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

    public ListObjectScanEventRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
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

    public ListObjectScanEventRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
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
