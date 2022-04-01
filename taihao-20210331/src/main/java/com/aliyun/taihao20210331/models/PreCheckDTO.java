// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PreCheckDTO extends TeaModel {
    // 校验类型
    @NameInMap("key")
    public String key;

    // 校验结果
    @NameInMap("result")
    public Boolean result;

    public static PreCheckDTO build(java.util.Map<String, ?> map) throws Exception {
        PreCheckDTO self = new PreCheckDTO();
        return TeaModel.build(map, self);
    }

    public PreCheckDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PreCheckDTO setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
