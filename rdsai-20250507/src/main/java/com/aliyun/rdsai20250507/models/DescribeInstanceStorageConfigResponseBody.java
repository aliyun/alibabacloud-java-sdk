// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageConfigResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> configList;

    /**
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStorageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageConfigResponseBody self = new DescribeInstanceStorageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageConfigResponseBody setConfigList(java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeInstanceStorageConfigResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceStorageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStorageConfigResponseBodyConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceStorageConfigResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStorageConfigResponseBodyConfigList self = new DescribeInstanceStorageConfigResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStorageConfigResponseBodyConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceStorageConfigResponseBodyConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
