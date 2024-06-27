// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteNameListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ids")
    public String ids;

    @NameInMap("regId")
    public String regId;

    public static DeleteNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNameListRequest self = new DeleteNameListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNameListRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteNameListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
