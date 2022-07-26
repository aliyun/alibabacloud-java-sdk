// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class EncryptContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    public static EncryptContentRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptContentRequest self = new EncryptContentRequest();
        return TeaModel.build(map, self);
    }

    public EncryptContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
