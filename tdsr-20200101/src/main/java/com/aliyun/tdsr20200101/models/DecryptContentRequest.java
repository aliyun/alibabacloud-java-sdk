// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DecryptContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    public static DecryptContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DecryptContentRequest self = new DecryptContentRequest();
        return TeaModel.build(map, self);
    }

    public DecryptContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
