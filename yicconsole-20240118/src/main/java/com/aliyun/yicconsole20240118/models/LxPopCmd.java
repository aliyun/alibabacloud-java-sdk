// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class LxPopCmd extends TeaModel {
    @NameInMap("data")
    public String data;

    public static LxPopCmd build(java.util.Map<String, ?> map) throws Exception {
        LxPopCmd self = new LxPopCmd();
        return TeaModel.build(map, self);
    }

    public LxPopCmd setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
