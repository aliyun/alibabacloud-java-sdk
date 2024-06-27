// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthUserNameRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("bindId")
    public Long bindId;

    @NameInMap("regId")
    public String regId;

    public static QueryAuthUserNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthUserNameRequest self = new QueryAuthUserNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthUserNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAuthUserNameRequest setBindId(Long bindId) {
        this.bindId = bindId;
        return this;
    }
    public Long getBindId() {
        return this.bindId;
    }

    public QueryAuthUserNameRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
