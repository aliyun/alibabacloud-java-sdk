// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot template.</p>
     * <br>
     * <p>> You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the IDs of honeypot templates.</p>
     */
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    /**
     * <p>设置请求和接收消息的语言类型，默认为**zh**。取值：</p>
     * <p>- **zh**：中文</p>
     * <p>- **en**：英文</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotPresetRequest self = new DeleteHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotPresetRequest setHoneypotPresetId(String honeypotPresetId) {
        this.honeypotPresetId = honeypotPresetId;
        return this;
    }
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    public DeleteHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
