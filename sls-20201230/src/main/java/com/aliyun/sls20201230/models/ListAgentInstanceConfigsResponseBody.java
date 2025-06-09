// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    public java.util.List<ListAgentInstanceConfigsResponseBodyConfigs> configs;

    @NameInMap("size")
    public Long size;

    @NameInMap("total")
    public Long total;

    public static ListAgentInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceConfigsResponseBody self = new ListAgentInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceConfigsResponseBody setConfigs(java.util.List<ListAgentInstanceConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListAgentInstanceConfigsResponseBodyConfigs> getConfigs() {
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

    public static class ListAgentInstanceConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("attributes")
        public String attributes;

        @NameInMap("configType")
        public String configType;

        public static ListAgentInstanceConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstanceConfigsResponseBodyConfigs self = new ListAgentInstanceConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListAgentInstanceConfigsResponseBodyConfigs setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public ListAgentInstanceConfigsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

    }

}
