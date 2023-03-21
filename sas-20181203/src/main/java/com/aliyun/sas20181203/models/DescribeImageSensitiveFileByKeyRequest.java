// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileByKeyRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ImageUuid")
    public String imageUuid;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

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
