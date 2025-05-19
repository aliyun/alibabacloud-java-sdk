// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceDdosCountResponseBody extends TeaModel {
    /**
     * <p>The number of instances that are under DDoS attacks.</p>
     */
    @NameInMap("DdosCount")
    public DescribeRCInstanceDdosCountResponseBodyDdosCount ddosCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F77F3176-AAEA-5836-B2B4-A854E3ED****_Zv**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCInstanceDdosCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceDdosCountResponseBody self = new DescribeRCInstanceDdosCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceDdosCountResponseBody setDdosCount(DescribeRCInstanceDdosCountResponseBodyDdosCount ddosCount) {
        this.ddosCount = ddosCount;
        return this;
    }
    public DescribeRCInstanceDdosCountResponseBodyDdosCount getDdosCount() {
        return this.ddosCount;
    }

    public DescribeRCInstanceDdosCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCInstanceDdosCountResponseBodyDdosCount extends TeaModel {
        /**
         * <p>The number of instances for which blackhole filtering is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlackholeCount")
        public String blackholeCount;

        /**
         * <p>The number of instances for which traffic scrubbing is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefenseCount")
        public String defenseCount;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("InstacenCount")
        public String instacenCount;

        public static DescribeRCInstanceDdosCountResponseBodyDdosCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceDdosCountResponseBodyDdosCount self = new DescribeRCInstanceDdosCountResponseBodyDdosCount();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceDdosCountResponseBodyDdosCount setBlackholeCount(String blackholeCount) {
            this.blackholeCount = blackholeCount;
            return this;
        }
        public String getBlackholeCount() {
            return this.blackholeCount;
        }

        public DescribeRCInstanceDdosCountResponseBodyDdosCount setDefenseCount(String defenseCount) {
            this.defenseCount = defenseCount;
            return this;
        }
        public String getDefenseCount() {
            return this.defenseCount;
        }

        public DescribeRCInstanceDdosCountResponseBodyDdosCount setInstacenCount(String instacenCount) {
            this.instacenCount = instacenCount;
            return this;
        }
        public String getInstacenCount() {
            return this.instacenCount;
        }

    }

}
