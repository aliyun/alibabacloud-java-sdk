// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowGetuserRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    public static QueryLinkelinkflowLinkflowGetuserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowGetuserRequest self = new QueryLinkelinkflowLinkflowGetuserRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowGetuserRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
