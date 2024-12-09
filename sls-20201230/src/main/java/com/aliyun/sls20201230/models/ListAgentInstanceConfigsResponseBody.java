// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    public java.util.List<String> configs;

    @NameInMap("size")
    public Long size;

    @NameInMap("total")
    public Long total;

    public static ListAgentInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceConfigsResponseBody self = new ListAgentInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceConfigsResponseBody setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    public ListAgentInstanceConfigsResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListAgentInstanceConfigsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
