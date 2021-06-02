// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class IsEnableOssRequest extends TeaModel {
    // 是否启用
    @NameInMap("IsEnable")
    public Boolean isEnable;

    public static IsEnableOssRequest build(java.util.Map<String, ?> map) throws Exception {
        IsEnableOssRequest self = new IsEnableOssRequest();
        return TeaModel.build(map, self);
    }

    public IsEnableOssRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

}
