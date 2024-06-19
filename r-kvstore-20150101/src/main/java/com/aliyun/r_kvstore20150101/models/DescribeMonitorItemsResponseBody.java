// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeMonitorItemsResponseBody extends TeaModel {
    /**
     * <p>The returned metrics.</p>
     * <blockquote>
     * <ul>
     * <li><strong>memoryUsage</strong>, <strong>GetQps</strong>, and <strong>PutQps</strong> are supported only by ApsaraDB for Redis instances that use Redis 4.0 or later. <strong>GetQps</strong> and <strong>PutQps</strong> require the latest minor version. You can upgrade the major version or minor version of the instance as needed. For more information, see <a href="https://help.aliyun.com/document_detail/101764.html">Upgrade the major version</a> and <a href="https://help.aliyun.com/document_detail/56450.html">Upgrade the minor version</a>.</li>
     * <li>When you use instances of Redis 2.8, if the <strong>hit_rate</strong> metric is not displayed, you must upgrade the minor version of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Upgrade the minor version</a>.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("MonitorItems")
    public DescribeMonitorItemsResponseBodyMonitorItems monitorItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BEB2618-9517-43F3-A233-E0B34512****</p>
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
         * <p>The metric.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("MonitorKey")
        public String monitorKey;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Counts/s</p>
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
