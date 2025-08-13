// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyAppKeyRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>appkey information.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("appKey")
    public String appKey;

    /**
     * <p>Application memo information.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("memo")
    public String memo;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
