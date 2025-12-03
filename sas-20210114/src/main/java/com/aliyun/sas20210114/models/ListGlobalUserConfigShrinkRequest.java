// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class ListGlobalUserConfigShrinkRequest extends TeaModel {
    @NameInMap("ModuleList")
    public String moduleListShrink;

    public static ListGlobalUserConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalUserConfigShrinkRequest self = new ListGlobalUserConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGlobalUserConfigShrinkRequest setModuleListShrink(String moduleListShrink) {
        this.moduleListShrink = moduleListShrink;
        return this;
    }
    public String getModuleListShrink() {
        return this.moduleListShrink;
    }

}
