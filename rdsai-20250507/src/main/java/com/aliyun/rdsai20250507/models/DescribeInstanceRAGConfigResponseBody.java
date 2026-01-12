// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceRAGConfigResponseBody extends TeaModel {
    /**
     * <p>The RAG agent configurations.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceRAGConfigResponseBodyConfigList> configList;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the RAG agent.</p>
     * <ul>
     * <li><strong>true</strong>: RAG agent is enabled.</li>
     * <li><strong>false</strong>: RAG agent is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static DescribeInstanceRAGConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRAGConfigResponseBody self = new DescribeInstanceRAGConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRAGConfigResponseBody setConfigList(java.util.List<DescribeInstanceRAGConfigResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeInstanceRAGConfigResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeInstanceRAGConfigResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceRAGConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRAGConfigResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public static class DescribeInstanceRAGConfigResponseBodyConfigList extends TeaModel {
        /**
         * <p>The name of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM_MODEL</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceRAGConfigResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRAGConfigResponseBodyConfigList self = new DescribeInstanceRAGConfigResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRAGConfigResponseBodyConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceRAGConfigResponseBodyConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
