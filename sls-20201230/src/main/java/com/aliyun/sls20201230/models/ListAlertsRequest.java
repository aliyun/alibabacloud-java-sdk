// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    /**
     * <p>The Logstore from which to obtain alert rules. The default value is empty.</p>
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
    public Integer offset;

    /**
     * <p>The number of rows to return on each page for a paged query. The maximum value is 200. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsRequest self = new ListAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListAlertsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListAlertsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
