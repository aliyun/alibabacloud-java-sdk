// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigRequest self = new GetCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
