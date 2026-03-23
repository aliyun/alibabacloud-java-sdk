// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListS3IngestionsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The starting position of the results to return. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of rows per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListS3IngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListS3IngestionsRequest self = new ListS3IngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListS3IngestionsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListS3IngestionsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListS3IngestionsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
