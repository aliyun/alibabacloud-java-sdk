// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListLimitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("regId")
    public String regId;

    public static DescribeNameListLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListLimitRequest self = new DescribeNameListLimitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListLimitRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeNameListLimitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
