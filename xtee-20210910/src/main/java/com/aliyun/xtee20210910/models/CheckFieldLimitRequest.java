// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckFieldLimitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("source")
    public String source;

    public static CheckFieldLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFieldLimitRequest self = new CheckFieldLimitRequest();
        return TeaModel.build(map, self);
    }

    public CheckFieldLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckFieldLimitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CheckFieldLimitRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
