// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The ID of the honeypot template.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotPreset~~">ListHoneypotPreset</a> operation to query the IDs of honeypot templates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>84104b7b-a2bc-41df-a190-12298f99xxxx</p>
     */
    @NameInMap("HoneypotPresetId")
    public String honeypotPresetId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
