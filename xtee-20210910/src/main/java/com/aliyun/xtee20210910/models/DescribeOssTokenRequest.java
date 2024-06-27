// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssTokenRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("regId")
    public String regId;

    @NameInMap("uploadType")
    public String uploadType;

    public static DescribeOssTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssTokenRequest self = new DescribeOssTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssTokenRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssTokenRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeOssTokenRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeOssTokenRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
