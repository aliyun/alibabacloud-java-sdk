// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotAuthRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeHoneyPotAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotAuthRequest self = new DescribeHoneyPotAuthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotAuthRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
