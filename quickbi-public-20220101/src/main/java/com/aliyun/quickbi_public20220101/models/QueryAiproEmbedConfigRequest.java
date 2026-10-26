// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAiproEmbedConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    public static QueryAiproEmbedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiproEmbedConfigRequest self = new QueryAiproEmbedConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiproEmbedConfigRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
