// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapBody extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static CreateConfigMapBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigMapBody self = new CreateConfigMapBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigMapBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
