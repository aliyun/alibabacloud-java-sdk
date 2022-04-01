// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("modifyPrepayInstanceSpecParam")
    public ModifyPrepayInstanceSpecParam modifyPrepayInstanceSpecParam;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setModifyPrepayInstanceSpecParam(ModifyPrepayInstanceSpecParam modifyPrepayInstanceSpecParam) {
        this.modifyPrepayInstanceSpecParam = modifyPrepayInstanceSpecParam;
        return this;
    }
    public ModifyPrepayInstanceSpecParam getModifyPrepayInstanceSpecParam() {
        return this.modifyPrepayInstanceSpecParam;
    }

}
