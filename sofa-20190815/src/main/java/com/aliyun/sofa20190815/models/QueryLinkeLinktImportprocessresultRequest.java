// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktImportprocessresultRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static QueryLinkeLinktImportprocessresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktImportprocessresultRequest self = new QueryLinkeLinktImportprocessresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktImportprocessresultRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
