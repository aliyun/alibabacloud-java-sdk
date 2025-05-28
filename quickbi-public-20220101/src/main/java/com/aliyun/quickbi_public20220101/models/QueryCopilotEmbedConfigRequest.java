// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCopilotEmbedConfigRequest extends TeaModel {
    /**
     * <p>Name of the embedded configuration module, supports fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>06-ELive</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    public static QueryCopilotEmbedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCopilotEmbedConfigRequest self = new QueryCopilotEmbedConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryCopilotEmbedConfigRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
