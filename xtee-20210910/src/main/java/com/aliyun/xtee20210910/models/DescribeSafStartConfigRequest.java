// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeSafStartConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartConfigRequest self = new DescribeSafStartConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSafStartConfigRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
