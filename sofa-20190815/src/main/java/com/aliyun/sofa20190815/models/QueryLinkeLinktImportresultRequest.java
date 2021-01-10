// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktImportresultRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static QueryLinkeLinktImportresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktImportresultRequest self = new QueryLinkeLinktImportresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktImportresultRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
