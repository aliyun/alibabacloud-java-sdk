// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAgentInstanceConfigsResponseBody extends TeaModel {
    /**
     * <p>The process-level configurations.</p>
     */
    @NameInMap("configs")
    public java.util.List<ListAgentInstanceConfigsResponseBodyConfigs> configs;

    /**
     * <p>The number of data entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The total number of data entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        public java.util.Map<String, String> attributes;

        @NameInMap("configType")
        public String configType;

        public static ListAgentInstanceConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAgentInstanceConfigsResponseBodyConfigs self = new ListAgentInstanceConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListAgentInstanceConfigsResponseBodyConfigs setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
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
