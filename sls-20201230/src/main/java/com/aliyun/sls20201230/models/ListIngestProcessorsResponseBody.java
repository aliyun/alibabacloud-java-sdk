// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListIngestProcessorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("count")
    public Integer count;

    @NameInMap("processors")
    public java.util.List<IngestProcessor> processors;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListIngestProcessorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIngestProcessorsResponseBody self = new ListIngestProcessorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIngestProcessorsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIngestProcessorsResponseBody setProcessors(java.util.List<IngestProcessor> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<IngestProcessor> getProcessors() {
        return this.processors;
    }

    public ListIngestProcessorsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
