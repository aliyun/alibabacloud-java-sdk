// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktLinkeiterationsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    public static QueryLinkeLinktLinkeiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktLinkeiterationsRequest self = new QueryLinkeLinktLinkeiterationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktLinkeiterationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
