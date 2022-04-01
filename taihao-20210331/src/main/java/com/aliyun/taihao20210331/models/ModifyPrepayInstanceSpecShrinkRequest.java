// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecShrinkRequest extends TeaModel {
    @NameInMap("modifyPrepayInstanceSpecParam")
    public String modifyPrepayInstanceSpecParamShrink;

    public static ModifyPrepayInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecShrinkRequest self = new ModifyPrepayInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecShrinkRequest setModifyPrepayInstanceSpecParamShrink(String modifyPrepayInstanceSpecParamShrink) {
        this.modifyPrepayInstanceSpecParamShrink = modifyPrepayInstanceSpecParamShrink;
        return this;
    }
    public String getModifyPrepayInstanceSpecParamShrink() {
        return this.modifyPrepayInstanceSpecParamShrink;
    }

}
