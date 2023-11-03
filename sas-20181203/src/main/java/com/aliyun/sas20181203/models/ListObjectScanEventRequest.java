// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskLevel")
    public String riskLevel;

    @NameInMap("Source")
    public String source;

    @NameInMap("TimeEnd")
    public Long timeEnd;

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
