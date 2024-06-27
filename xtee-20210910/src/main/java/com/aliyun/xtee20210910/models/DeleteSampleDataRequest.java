// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleDataRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("id")
    public String id;

    @NameInMap("regId")
    public String regId;

    public static DeleteSampleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleDataRequest self = new DeleteSampleDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSampleDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSampleDataRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteSampleDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
