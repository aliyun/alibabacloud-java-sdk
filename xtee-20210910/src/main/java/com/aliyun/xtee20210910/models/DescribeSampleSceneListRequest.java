// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleSceneListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeSampleSceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSceneListRequest self = new DescribeSampleSceneListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSceneListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleSceneListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
