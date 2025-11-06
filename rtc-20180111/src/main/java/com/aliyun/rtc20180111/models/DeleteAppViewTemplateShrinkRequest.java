// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppViewTemplateShrinkRequest extends TeaModel {
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

    public static DeleteAppViewTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppViewTemplateShrinkRequest self = new DeleteAppViewTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppViewTemplateShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppViewTemplateShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

}
