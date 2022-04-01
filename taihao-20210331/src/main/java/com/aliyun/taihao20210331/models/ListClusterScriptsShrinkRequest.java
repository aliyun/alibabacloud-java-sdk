// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterScriptsShrinkRequest extends TeaModel {
    // listClusterScriptsParam
    @NameInMap("listClusterScriptsParam")
    public String listClusterScriptsParamShrink;

    public static ListClusterScriptsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterScriptsShrinkRequest self = new ListClusterScriptsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterScriptsShrinkRequest setListClusterScriptsParamShrink(String listClusterScriptsParamShrink) {
        this.listClusterScriptsParamShrink = listClusterScriptsParamShrink;
        return this;
    }
    public String getListClusterScriptsParamShrink() {
        return this.listClusterScriptsParamShrink;
    }

}
