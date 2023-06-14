// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeMonitorItemsResponseBody extends TeaModel {
    /**
     * <p>The unit of the metric.</p>
     */
    @NameInMap("MonitorItems")
    public DescribeMonitorItemsResponseBodyMonitorItems monitorItems;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeMonitorItems**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMonitorItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorItemsResponseBody self = new DescribeMonitorItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorItemsResponseBody setMonitorItems(DescribeMonitorItemsResponseBodyMonitorItems monitorItems) {
        this.monitorItems = monitorItems;
        return this;
    }
    public DescribeMonitorItemsResponseBodyMonitorItems getMonitorItems() {
        return this.monitorItems;
    }

    public DescribeMonitorItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem extends TeaModel {
        /**
         * <p>DescribeMonitorItems</p>
         */
        @NameInMap("MonitorKey")
        public String monitorKey;

        /**
         * <p>Queries the metrics of an ApsaraDB for Redis instance.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem self = new DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem setMonitorKey(String monitorKey) {
            this.monitorKey = monitorKey;
            return this;
        }
        public String getMonitorKey() {
            return this.monitorKey;
        }

        public DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeMonitorItemsResponseBodyMonitorItems extends TeaModel {
        @NameInMap("KVStoreMonitorItem")
        public java.util.List<DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem> KVStoreMonitorItem;

        public static DescribeMonitorItemsResponseBodyMonitorItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorItemsResponseBodyMonitorItems self = new DescribeMonitorItemsResponseBodyMonitorItems();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorItemsResponseBodyMonitorItems setKVStoreMonitorItem(java.util.List<DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem> KVStoreMonitorItem) {
            this.KVStoreMonitorItem = KVStoreMonitorItem;
            return this;
        }
        public java.util.List<DescribeMonitorItemsResponseBodyMonitorItemsKVStoreMonitorItem> getKVStoreMonitorItem() {
            return this.KVStoreMonitorItem;
        }

    }

}
