// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventRequest extends TeaModel {
    /**
     * <p>The batch operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>sha256</strong>: same file content</p>
     * </li>
     * <li><p><strong>eventName</strong>: same alerting type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sha256</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>ltrbuck****</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The page number of the current page when you perform a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8925****</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The alert name.</p>
     * 
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The MD5 hash of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0552c44e243abdea1729d4507bce****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The storage key of the file in the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The maximum number of entries to return on each page when you perform a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>If the file is a sub-file within a compressed archive, <strong>ParentEventId</strong> specifies the event ID of the alert for the compressed archive itself.</p>
     * <p>To retrieve and query alert events for sub-files within a compressed archive:</p>
     * <ol>
     * <li>Call this operation and check the <strong>HasSubEvent</strong> response parameter. If the value is <strong>true</strong>, the corresponding <strong>EventId</strong> is the event ID of the alert for the compressed archive itself.</li>
     * <li>Call this operation again and pass the <strong>EventId</strong> value to <strong>ParentEventId</strong> to view the alert events for the sub-files within the compressed archive.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentEventId")
    public Long parentEventId;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: high risk</p>
     * </li>
     * <li><p><strong>medium</strong>: medium risk</p>
     * </li>
     * <li><p><strong>low</strong>: low risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li><strong>API</strong>: API detection</li>
     * <li><strong>OSS</strong>: OSS detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li>0: unhandled </li>
     * <li>1: manually handled</li>
     * <li>2: whitelisted</li>
     * <li>3: ignored</li>
     * <li>4: access denied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The end time of the time range during which the exception event occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>1683862286000</p>
     */
    @NameInMap("TimeEnd")
    public Long timeEnd;

    /**
     * <p>The start time of the time range during which the exception event occurred.</p>
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
