// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CheckSensitiveRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    public static CheckSensitiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSensitiveRequest self = new CheckSensitiveRequest();
        return TeaModel.build(map, self);
    }

    public CheckSensitiveRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
