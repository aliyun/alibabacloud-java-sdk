// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineItemListRequest extends TeaModel {
    /**
     * <p>The key of the baseline type.</p>
     */
    @NameInMap("BaselineClassKey")
    public String baselineClassKey;

    /**
     * <p>The key of the baseline name.</p>
     */
    @NameInMap("BaselineNameKey")
    public String baselineNameKey;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the image.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The types of the assets that are scanned.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the baseline risk item. Valid values:</p>
     * <br>
     * <p>*   **0**: unfixed</p>
     * <p>*   **1**: fixed</p>
     * <p>*   **2**: pending verification</p>
     * <p>*   **3**: fixing failed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUIDs of images.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static DescribeImageBaselineItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineItemListRequest self = new DescribeImageBaselineItemListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineItemListRequest setBaselineClassKey(String baselineClassKey) {
        this.baselineClassKey = baselineClassKey;
        return this;
    }
    public String getBaselineClassKey() {
        return this.baselineClassKey;
    }

    public DescribeImageBaselineItemListRequest setBaselineNameKey(String baselineNameKey) {
        this.baselineNameKey = baselineNameKey;
        return this;
    }
    public String getBaselineNameKey() {
        return this.baselineNameKey;
    }

    public DescribeImageBaselineItemListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageBaselineItemListRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageBaselineItemListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageBaselineItemListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageBaselineItemListRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageBaselineItemListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImageBaselineItemListRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
