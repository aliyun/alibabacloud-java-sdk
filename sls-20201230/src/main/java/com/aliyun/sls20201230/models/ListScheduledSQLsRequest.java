// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListScheduledSQLsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The line from which to start the query. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <p>The number of entries to return. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListScheduledSQLsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledSQLsRequest self = new ListScheduledSQLsRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledSQLsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListScheduledSQLsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListScheduledSQLsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
