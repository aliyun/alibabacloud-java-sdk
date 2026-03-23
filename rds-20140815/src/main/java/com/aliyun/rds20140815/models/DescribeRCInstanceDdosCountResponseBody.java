// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceDdosCountResponseBody extends TeaModel {
    @NameInMap("DdosCount")
    public DescribeRCInstanceDdosCountResponseBodyDdosCount ddosCount;

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
        @NameInMap("BlackholeCount")
        public String blackholeCount;

        @NameInMap("DefenseCount")
        public String defenseCount;

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
