// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditAppInfoShrinkRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1-普通应用，2-内嵌SDK.</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Platforms")
    public String platformsShrink;

    public static EditAppInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditAppInfoShrinkRequest self = new EditAppInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditAppInfoShrinkRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public EditAppInfoShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EditAppInfoShrinkRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public EditAppInfoShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

}
