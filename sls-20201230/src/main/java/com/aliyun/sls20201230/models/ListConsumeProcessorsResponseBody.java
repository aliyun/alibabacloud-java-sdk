// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumeProcessorsResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("processors")
    public java.util.List<ConsumeProcessor> processors;

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
