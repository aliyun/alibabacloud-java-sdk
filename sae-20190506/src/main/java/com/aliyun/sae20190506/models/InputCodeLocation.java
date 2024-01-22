// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InputCodeLocation extends TeaModel {
    @NameInMap("ossBucketName")
    public String ossBucketName;

    @NameInMap("ossObjectName")
    public String ossObjectName;

    @NameInMap("zipFile")
    public String zipFile;

    public static InputCodeLocation build(java.util.Map<String, ?> map) throws Exception {
        InputCodeLocation self = new InputCodeLocation();
        return TeaModel.build(map, self);
    }

    public InputCodeLocation setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public InputCodeLocation setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public InputCodeLocation setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
