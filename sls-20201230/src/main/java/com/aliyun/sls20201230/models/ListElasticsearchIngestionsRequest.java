// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListElasticsearchIngestionsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListElasticsearchIngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListElasticsearchIngestionsRequest self = new ListElasticsearchIngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListElasticsearchIngestionsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListElasticsearchIngestionsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListElasticsearchIngestionsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
