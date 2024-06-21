// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentRankRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("docs")
    public java.util.List<String> docs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    public static GetDocumentRankRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentRankRequest self = new GetDocumentRankRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentRankRequest setDocs(java.util.List<String> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<String> getDocs() {
        return this.docs;
    }

    public GetDocumentRankRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
