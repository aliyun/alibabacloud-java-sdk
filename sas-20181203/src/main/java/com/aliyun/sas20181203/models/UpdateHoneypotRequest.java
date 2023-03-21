// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotRequest extends TeaModel {
    @NameInMap("HoneypotId")
    public String honeypotId;

    @NameInMap("HoneypotName")
    public String honeypotName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Meta")
    public String meta;

    public static UpdateHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotRequest self = new UpdateHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public UpdateHoneypotRequest setHoneypotName(String honeypotName) {
        this.honeypotName = honeypotName;
        return this;
    }
    public String getHoneypotName() {
        return this.honeypotName;
    }

    public UpdateHoneypotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateHoneypotRequest setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

}
