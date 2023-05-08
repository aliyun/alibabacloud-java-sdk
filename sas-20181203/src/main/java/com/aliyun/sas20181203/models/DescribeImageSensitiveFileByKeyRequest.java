// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyRequest extends TeaModel {
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
    public java.util.List<String> scanRange;

    /**
     * <p>The digest of the image layer.</p>
     */
    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    public static DescribeImageSensitiveFileByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileByKeyRequest self = new DescribeImageSensitiveFileByKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileByKeyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageSensitiveFileByKeyRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSensitiveFileByKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageSensitiveFileByKeyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSensitiveFileByKeyRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageSensitiveFileByKeyRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

}
