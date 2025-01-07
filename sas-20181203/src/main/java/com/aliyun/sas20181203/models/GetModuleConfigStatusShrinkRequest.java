// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigStatusShrinkRequest extends TeaModel {
    /**
     * <p>The service modules that you want to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModuleNames")
    public String moduleNamesShrink;

    public static GetModuleConfigStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigStatusShrinkRequest self = new GetModuleConfigStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigStatusShrinkRequest setModuleNamesShrink(String moduleNamesShrink) {
        this.moduleNamesShrink = moduleNamesShrink;
        return this;
    }
    public String getModuleNamesShrink() {
        return this.moduleNamesShrink;
    }

}
