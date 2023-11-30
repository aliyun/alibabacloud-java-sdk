// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CustomSideLinkConfig extends TeaModel {
    @NameInMap("icon")
    public String icon;

    @NameInMap("link")
    public String link;

    @NameInMap("text")
    public String text;

    public static CustomSideLinkConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomSideLinkConfig self = new CustomSideLinkConfig();
        return TeaModel.build(map, self);
    }

    public CustomSideLinkConfig setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CustomSideLinkConfig setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public CustomSideLinkConfig setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
