// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAzureBlobIngestionRequest extends TeaModel {
    /**
     * <p>The name of the logstore. If specified, the operation returns only tasks from this logstore.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The number of tasks to skip before returning results. Default: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of tasks to return per page. Range: 0 to 500. Default: 100.</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListAzureBlobIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAzureBlobIngestionRequest self = new ListAzureBlobIngestionRequest();
        return TeaModel.build(map, self);
    }

    public ListAzureBlobIngestionRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListAzureBlobIngestionRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListAzureBlobIngestionRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
