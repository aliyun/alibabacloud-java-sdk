// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceSettingsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    @NameInMap("Settings")
    public String settingsShrink;

    public static UpdateRenderingInstanceSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceSettingsShrinkRequest self = new UpdateRenderingInstanceSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceSettingsShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public UpdateRenderingInstanceSettingsShrinkRequest setSettingsShrink(String settingsShrink) {
        this.settingsShrink = settingsShrink;
        return this;
    }
    public String getSettingsShrink() {
        return this.settingsShrink;
    }

}
