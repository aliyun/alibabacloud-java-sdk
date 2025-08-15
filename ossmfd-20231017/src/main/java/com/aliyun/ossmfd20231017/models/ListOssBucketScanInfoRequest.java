// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoRequest extends TeaModel {
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
     * <p>test******</p>
     */
    @NameInMap("FuzzBucketName")
    public String fuzzBucketName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HasRisk")
    public Integer hasRisk;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

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
