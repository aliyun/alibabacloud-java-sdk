// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyShrinkRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ImageUuid")
    public String imageUuid;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScanRange")
    public String scanRangeShrink;

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
