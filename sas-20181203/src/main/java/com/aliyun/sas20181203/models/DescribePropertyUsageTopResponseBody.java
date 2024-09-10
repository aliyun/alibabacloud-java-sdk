// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageTopResponseBody extends TeaModel {
    /**
     * <p>The number of fingerprints.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ItemCount")
    public Integer itemCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16AA5B62-A3C1-520B-B289-4BD971CC17AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistical results.</p>
     */
    @NameInMap("TopStatisticItems")
    public java.util.List<DescribePropertyUsageTopResponseBodyTopStatisticItems> topStatisticItems;

    /**
     * <p>The type of the asset fingerprint. Valid value:</p>
     * <ul>
     * <li><strong>port</strong>: port</li>
     * <li><strong>process</strong>: process</li>
     * <li><strong>software</strong>: software</li>
     * <li><strong>user</strong>: account</li>
     * <li><strong>sca</strong>: middleware</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePropertyUsageTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageTopResponseBody self = new DescribePropertyUsageTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageTopResponseBody setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }
    public Integer getItemCount() {
        return this.itemCount;
    }

    public DescribePropertyUsageTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePropertyUsageTopResponseBody setTopStatisticItems(java.util.List<DescribePropertyUsageTopResponseBodyTopStatisticItems> topStatisticItems) {
        this.topStatisticItems = topStatisticItems;
        return this;
    }
    public java.util.List<DescribePropertyUsageTopResponseBodyTopStatisticItems> getTopStatisticItems() {
        return this.topStatisticItems;
    }

    public DescribePropertyUsageTopResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribePropertyUsageTopResponseBodyTopStatisticItems extends TeaModel {
        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The statistical item.</p>
         * 
         * <strong>example:</strong>
         * <p>openssl</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePropertyUsageTopResponseBodyTopStatisticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyUsageTopResponseBodyTopStatisticItems self = new DescribePropertyUsageTopResponseBodyTopStatisticItems();
            return TeaModel.build(map, self);
        }

        public DescribePropertyUsageTopResponseBodyTopStatisticItems setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyUsageTopResponseBodyTopStatisticItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
