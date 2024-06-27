// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("regId")
    public String regId;

    @NameInMap("serviceCode")
    public String serviceCode;

    public static DescribeParamListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParamListRequest self = new DescribeParamListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParamListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeParamListRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public DescribeParamListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeParamListRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
