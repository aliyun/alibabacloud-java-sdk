// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PreviewModelRequest extends TeaModel {
    /**
     * <p>query</p>
     */
    @NameInMap("query")
    public String query;

    public static PreviewModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewModelRequest self = new PreviewModelRequest();
        return TeaModel.build(map, self);
    }

    public PreviewModelRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
