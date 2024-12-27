// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class HarmonyPayload extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayType")
    public String displayType;

    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    @NameInMap("harmonyBody")
    public HarmonyBody harmonyBody;

    public static HarmonyPayload build(java.util.Map<String, ?> map) throws Exception {
        HarmonyPayload self = new HarmonyPayload();
        return TeaModel.build(map, self);
    }

    public HarmonyPayload setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }
    public String getDisplayType() {
        return this.displayType;
    }

    public HarmonyPayload setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public HarmonyPayload setHarmonyBody(HarmonyBody harmonyBody) {
        this.harmonyBody = harmonyBody;
        return this;
    }
    public HarmonyBody getHarmonyBody() {
        return this.harmonyBody;
    }

}
