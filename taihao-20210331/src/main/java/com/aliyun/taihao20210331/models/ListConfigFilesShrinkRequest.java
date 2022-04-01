// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigFilesShrinkRequest extends TeaModel {
    // listConfigFilesParam
    @NameInMap("listConfigFilesParam")
    public String listConfigFilesParamShrink;

    public static ListConfigFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigFilesShrinkRequest self = new ListConfigFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigFilesShrinkRequest setListConfigFilesParamShrink(String listConfigFilesParamShrink) {
        this.listConfigFilesParamShrink = listConfigFilesParamShrink;
        return this;
    }
    public String getListConfigFilesParamShrink() {
        return this.listConfigFilesParamShrink;
    }

}
