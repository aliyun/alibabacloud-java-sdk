// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the bucket that is used for fuzzy match.</p>
     */
    @NameInMap("FuzzBucketName")
    public String fuzzBucketName;

    /**
     * <p>Specifies whether at-risk objects are detected. Valid values:</p>
     * <br>
     * <p>*   **0**: No at-risk objects are detected.</p>
     * <p>*   **1**: At-risk objects are detected.</p>
     */
    @NameInMap("HasRisk")
    public Integer hasRisk;

    /**
     * <p>The language of the content in the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The check status of the bucket. Valid values:</p>
     * <br>
     * <p>*   **1**: The bucket is not checked.</p>
     * <p>*   **2**: All objects in the bucket are being checked.</p>
     * <p>*   **3**: Only new objects in the bucket are being checked.</p>
     * <p>*   **4**: The bucket is checked.</p>
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
