// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogtailPipelineConfigResponseBody extends TeaModel {
    @NameInMap("configs")
    public java.util.List<String> configs;

    @NameInMap("count")
    public Integer count;

    @NameInMap("total")
    public Integer total;

    public static ListLogtailPipelineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogtailPipelineConfigResponseBody self = new ListLogtailPipelineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogtailPipelineConfigResponseBody setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    public ListLogtailPipelineConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListLogtailPipelineConfigResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
