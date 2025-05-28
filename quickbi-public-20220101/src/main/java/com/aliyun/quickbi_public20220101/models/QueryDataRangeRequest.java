// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRangeRequest extends TeaModel {
    /**
     * <p>Name, for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Data range type:</p>
     * <ul>
     * <li>llmCube: LlmCube resource.</li>
     * <li>llmCubeTheme: Analysis theme.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llmCube</p>
     */
    @NameInMap("Type")
    public String type;

    public static QueryDataRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataRangeRequest self = new QueryDataRangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataRangeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryDataRangeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
