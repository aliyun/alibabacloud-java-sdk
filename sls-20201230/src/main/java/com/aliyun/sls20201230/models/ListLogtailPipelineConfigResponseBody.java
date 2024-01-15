// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogtailPipelineConfigResponseBody extends TeaModel {
    /**
     * <p>The Logtail pipeline configurations that are returned on the current page.</p>
     */
    @NameInMap("configs")
    public java.util.List<String> configs;

    /**
     * <p>The number of Logtail pipeline configurations that are returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The total number of Logtail pipeline configurations in the current project.</p>
     */
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
