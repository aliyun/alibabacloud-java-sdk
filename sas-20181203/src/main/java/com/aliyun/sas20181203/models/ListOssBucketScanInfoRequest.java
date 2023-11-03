// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FuzzBucketName")
    public String fuzzBucketName;

    @NameInMap("HasRisk")
    public Integer hasRisk;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    public static ListOssBucketScanInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketScanInfoRequest self = new ListOssBucketScanInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListOssBucketScanInfoRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListOssBucketScanInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOssBucketScanInfoRequest setFuzzBucketName(String fuzzBucketName) {
        this.fuzzBucketName = fuzzBucketName;
        return this;
    }
    public String getFuzzBucketName() {
        return this.fuzzBucketName;
    }

    public ListOssBucketScanInfoRequest setHasRisk(Integer hasRisk) {
        this.hasRisk = hasRisk;
        return this;
    }
    public Integer getHasRisk() {
        return this.hasRisk;
    }

    public ListOssBucketScanInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListOssBucketScanInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOssBucketScanInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
