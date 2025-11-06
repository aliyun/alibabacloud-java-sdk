// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewTemplateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wv7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    public static ModifyAppViewTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewTemplateShrinkRequest self = new ModifyAppViewTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppViewTemplateShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

}
