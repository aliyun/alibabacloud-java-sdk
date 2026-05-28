// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumeProcessorsResponseBody extends TeaModel {
    /**
     * <p>The number of consumption processors for offset.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The list of consumption processor information.</p>
     */
    @NameInMap("processors")
    public java.util.List<ConsumeProcessor> processors;

    /**
     * <p>The total number of consumption processors that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListConsumeProcessorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumeProcessorsResponseBody self = new ListConsumeProcessorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumeProcessorsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListConsumeProcessorsResponseBody setProcessors(java.util.List<ConsumeProcessor> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<ConsumeProcessor> getProcessors() {
        return this.processors;
    }

    public ListConsumeProcessorsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
