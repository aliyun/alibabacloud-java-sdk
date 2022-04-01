// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PreCheckParam extends TeaModel {
    // 校验类型
    @NameInMap("keys")
    public java.util.List<String> keys;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    public static PreCheckParam build(java.util.Map<String, ?> map) throws Exception {
        PreCheckParam self = new PreCheckParam();
        return TeaModel.build(map, self);
    }

    public PreCheckParam setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public PreCheckParam setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
