// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceResponseBody extends TeaModel {
    /**
     * <p>The available memory size.</p>
     */
    @NameInMap("Data")
    public DescribeAvailableMemResourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableMemResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMemResourceResponseBody self = new DescribeAvailableMemResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMemResourceResponseBody setData(DescribeAvailableMemResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAvailableMemResourceResponseBodyData getData() {
        return this.data;
    }

    public DescribeAvailableMemResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableMemResourceResponseBodyData extends TeaModel {
        /**
         * <p>The maximum memory size for each resource unit, in GB.</p>
         */
        @NameInMap("MaxMem")
        public Long maxMem;

        /**
         * <p>The minimum memory size required for each resource unit, in GB.</p>
         */
        @NameInMap("MinMem")
        public Long minMem;

        /**
         * <p>The maximum allowed memory usage, in GB.</p>
         */
        @NameInMap("SafeMem")
        public String safeMem;

        /**
         * <p>The number of resource units in the tenant.</p>
         */
        @NameInMap("UsedMem")
        public Long usedMem;

        public static DescribeAvailableMemResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableMemResourceResponseBodyData self = new DescribeAvailableMemResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableMemResourceResponseBodyData setMaxMem(Long maxMem) {
            this.maxMem = maxMem;
            return this;
        }
        public Long getMaxMem() {
            return this.maxMem;
        }

        public DescribeAvailableMemResourceResponseBodyData setMinMem(Long minMem) {
            this.minMem = minMem;
            return this;
        }
        public Long getMinMem() {
            return this.minMem;
        }

        public DescribeAvailableMemResourceResponseBodyData setSafeMem(String safeMem) {
            this.safeMem = safeMem;
            return this;
        }
        public String getSafeMem() {
            return this.safeMem;
        }

        public DescribeAvailableMemResourceResponseBodyData setUsedMem(Long usedMem) {
            this.usedMem = usedMem;
            return this;
        }
        public Long getUsedMem() {
            return this.usedMem;
        }

    }

}
