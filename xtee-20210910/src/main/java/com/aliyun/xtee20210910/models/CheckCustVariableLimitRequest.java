// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckCustVariableLimitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("regId")
    public String regId;

    public static CheckCustVariableLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCustVariableLimitRequest self = new CheckCustVariableLimitRequest();
        return TeaModel.build(map, self);
    }

    public CheckCustVariableLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckCustVariableLimitRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CheckCustVariableLimitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
