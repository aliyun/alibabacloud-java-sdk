// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListGCSIngestionsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The position from which to start returning results. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of results to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListGCSIngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGCSIngestionsRequest self = new ListGCSIngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListGCSIngestionsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListGCSIngestionsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListGCSIngestionsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
