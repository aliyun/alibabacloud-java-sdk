// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Lang")
    public String lang;

    public static ListOssBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketRequest self = new ListOssBucketRequest();
        return TeaModel.build(map, self);
    }

    public ListOssBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListOssBucketRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
