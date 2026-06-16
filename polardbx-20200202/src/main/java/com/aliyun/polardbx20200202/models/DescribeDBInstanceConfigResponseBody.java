// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigResponseBody self = new DescribeDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigResponseBody setData(DescribeDBInstanceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceConfigResponseBodyData extends TeaModel {
        /**
         * <p>The configuration key.</p>
         * 
         * <strong>example:</strong>
         * <p>htap</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>The configuration item. The following parameters are included:</p>
         * <ul>
         * <li>attendHtapList: the list of instances for which HTAP is enabled.</li>
         * <li>autoAttendHtap: specifies whether to automatically add newly created read-only instances to the HTAP list.</li>
         * <li>delayExecutionStrategy: when the read-only instance lag reaches the value specified by storageDelayThreshold, read-only traffic is routed back to the primary instance. Default value: 1. Valid values: 0 and 1.</li>
         * <li>enableConsistentReplicaRead: specifies whether to enable consistent reads.</li>
         * <li>storageDelayThreshold: the latency threshold for read-only instances. Default value: 3s. Valid values: 0 to 86400.</li>
         * <li>enableHtap: specifies whether to enable HTAP.</li>
         * <li>masterReadWeight: the read weight of the primary node. A value of 100 indicates that 100% of traffic is routed to the primary node. Valid values: 0 to 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;attendHtapList\&quot;:[\&quot;pxc-hzruyzes08****\&quot;],\&quot;autoAttendHtap\&quot;:\&quot;true\&quot;,\&quot;delayExecutionStrategy\&quot;:1,\&quot;enableConsistentReplicaRead\&quot;:true,\&quot;enableHtap\&quot;:\&quot;true\&quot;,\&quot;masterReadWeight\&quot;:100,\&quot;storageDelayThreshold\&quot;:3}</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7w****</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        public static DescribeDBInstanceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigResponseBodyData self = new DescribeDBInstanceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeDBInstanceConfigResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeDBInstanceConfigResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

    }

}
