// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineItemListRequest extends TeaModel {
    /**
     * <p>The key of the baseline type.</p>
     * 
     * <strong>example:</strong>
     * <p>ak_leak</p>
     */
    @NameInMap("BaselineClassKey")
    public String baselineClassKey;

    /**
     * <p>The key of the baseline name.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessKey pair leak</p>
     */
    @NameInMap("BaselineNameKey")
    public String baselineNameKey;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The UUID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b5c7193300da2070220038718ad****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

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
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <ul>
     * <li><strong>0</strong>: unfixed</li>
     * <li><strong>1</strong>: fixed</li>
     * <li><strong>2</strong>: pending verification</li>
     * <li><strong>3</strong>: fixing failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
