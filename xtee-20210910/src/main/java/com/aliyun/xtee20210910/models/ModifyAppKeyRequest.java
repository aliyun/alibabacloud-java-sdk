// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyAppKeyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("appKey")
    public String appKey;

    @NameInMap("memo")
    public String memo;

    @NameInMap("regId")
    public String regId;

    public static ModifyAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppKeyRequest self = new ModifyAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAppKeyRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyAppKeyRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ModifyAppKeyRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
