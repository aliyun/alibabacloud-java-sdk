// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ReadDBInstanceId")
    @Validation(required = true)
    public String readDBInstanceId;

    @NameInMap("DelayTime")
    @Validation(required = true)
    public Integer delayTime;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeReadDBInstanceDelayResponseItems items;

    public static DescribeReadDBInstanceDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayResponse self = new DescribeReadDBInstanceDelayResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay extends TeaModel {
        @NameInMap("ReplayLatency")
        @Validation(required = true)
        public String replayLatency;

        @NameInMap("FlushLag")
        @Validation(required = true)
        public String flushLag;

        @NameInMap("FlushLatency")
        @Validation(required = true)
        public String flushLatency;

        @NameInMap("SendLatency")
        @Validation(required = true)
        public String sendLatency;

        @NameInMap("WriteLag")
        @Validation(required = true)
        public String writeLag;

        @NameInMap("ReplayLag")
        @Validation(required = true)
        public String replayLag;

        @NameInMap("WriteLatency")
        @Validation(required = true)
        public String writeLatency;

        @NameInMap("ReadDBInstanceName")
        @Validation(required = true)
        public String readDBInstanceName;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay self = new DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay extends TeaModel {
        @NameInMap("ReadonlyInstanceDelay")
        @Validation(required = true)
        public java.util.List<DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> readonlyInstanceDelay;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay self = new DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames extends TeaModel {
        @NameInMap("ReadDBInstanceName")
        @Validation(required = true)
        public java.util.List<String> readDBInstanceName;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames self = new DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes extends TeaModel {
        @NameInMap("ReadDelayTime")
        @Validation(required = true)
        public java.util.List<String> readDelayTime;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes self = new DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItems extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("ReadonlyInstanceDelay")
        @Validation(required = true)
        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay readonlyInstanceDelay;

        @NameInMap("ReadDBInstanceNames")
        @Validation(required = true)
        public DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames readDBInstanceNames;

        @NameInMap("ReadDelayTimes")
        @Validation(required = true)
        public DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes readDelayTimes;

        public static DescribeReadDBInstanceDelayResponseItemsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItems self = new DescribeReadDBInstanceDelayResponseItemsItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItems extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<DescribeReadDBInstanceDelayResponseItemsItems> items;

        public static DescribeReadDBInstanceDelayResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItems self = new DescribeReadDBInstanceDelayResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
