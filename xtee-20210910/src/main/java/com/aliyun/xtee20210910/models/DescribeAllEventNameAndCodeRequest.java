// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllEventNameAndCodeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("regId")
    public String regId;

    public static DescribeAllEventNameAndCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEventNameAndCodeRequest self = new DescribeAllEventNameAndCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllEventNameAndCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAllEventNameAndCodeRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeAllEventNameAndCodeRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
