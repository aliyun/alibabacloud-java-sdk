// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocOssTokenRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribePocOssTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePocOssTokenRequest self = new DescribePocOssTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribePocOssTokenRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePocOssTokenRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
