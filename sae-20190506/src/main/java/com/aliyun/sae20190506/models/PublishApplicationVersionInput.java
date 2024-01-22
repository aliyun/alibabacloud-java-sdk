// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PublishApplicationVersionInput extends TeaModel {
    @NameInMap("description")
    public String description;

    public static PublishApplicationVersionInput build(java.util.Map<String, ?> map) throws Exception {
        PublishApplicationVersionInput self = new PublishApplicationVersionInput();
        return TeaModel.build(map, self);
    }

    public PublishApplicationVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
