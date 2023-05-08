// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyShrinkRequest extends TeaModel {
    /**
     * <p>The key of the last data entry.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("ScanRange")
    public String scanRangeShrink;

    /**
     * <p>The digest of the image layer.</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    public static DescribeImageSensitiveFileByKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyShrinkRequest self = new DescribeImageSensitiveFileByKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setScanRangeShrink(String scanRangeShrink) {
        this.scanRangeShrink = scanRangeShrink;
        return this;
    }
    public String getScanRangeShrink() {
        return this.scanRangeShrink;
    }

    public DescribeImageSensitiveFileByKeyShrinkRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

}
