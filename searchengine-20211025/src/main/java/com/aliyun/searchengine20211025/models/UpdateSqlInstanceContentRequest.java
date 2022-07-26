// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceContentRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    public static UpdateSqlInstanceContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceContentRequest self = new UpdateSqlInstanceContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
