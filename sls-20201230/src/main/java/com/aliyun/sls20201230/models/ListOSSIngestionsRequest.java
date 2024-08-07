// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSIngestionsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListOSSIngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOSSIngestionsRequest self = new ListOSSIngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListOSSIngestionsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListOSSIngestionsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListOSSIngestionsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
