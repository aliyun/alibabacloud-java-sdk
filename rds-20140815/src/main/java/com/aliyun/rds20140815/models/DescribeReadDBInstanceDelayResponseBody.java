// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ReadDBInstanceId")
    public String readDBInstanceId;

    @NameInMap("DelayTime")
    public Integer delayTime;

    @NameInMap("Items")
    public DescribeReadDBInstanceDelayResponseBodyItems items;

    public static DescribeReadDBInstanceDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayResponseBody self = new DescribeReadDBInstanceDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReadDBInstanceDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReadDBInstanceDelayResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReadDBInstanceDelayResponseBody setReadDBInstanceId(String readDBInstanceId) {
        this.readDBInstanceId = readDBInstanceId;
        return this;
    }
    public String getReadDBInstanceId() {
        return this.readDBInstanceId;
    }

    public DescribeReadDBInstanceDelayResponseBody setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public DescribeReadDBInstanceDelayResponseBody setItems(DescribeReadDBInstanceDelayResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeReadDBInstanceDelayResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames extends TeaModel {
        @NameInMap("ReadDBInstanceName")
        public java.util.List<String> readDBInstanceName;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames self = new DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames setReadDBInstanceName(java.util.List<String> readDBInstanceName) {
            this.readDBInstanceName = readDBInstanceName;
            return this;
        }
        public java.util.List<String> getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes extends TeaModel {
        @NameInMap("ReadDelayTime")
        public java.util.List<String> readDelayTime;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes self = new DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes setReadDelayTime(java.util.List<String> readDelayTime) {
            this.readDelayTime = readDelayTime;
            return this;
        }
        public java.util.List<String> getReadDelayTime() {
            return this.readDelayTime;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay extends TeaModel {
        @NameInMap("ReplayLatency")
        public String replayLatency;

        @NameInMap("FlushLag")
        public String flushLag;

        @NameInMap("FlushLatency")
        public String flushLatency;

        @NameInMap("SendLatency")
        public String sendLatency;

        @NameInMap("WriteLag")
        public String writeLag;

        @NameInMap("ReplayLag")
        public String replayLag;

        @NameInMap("WriteLatency")
        public String writeLatency;

        @NameInMap("ReadDBInstanceName")
        public String readDBInstanceName;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay self = new DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLatency(String replayLatency) {
            this.replayLatency = replayLatency;
            return this;
        }
        public String getReplayLatency() {
            return this.replayLatency;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setFlushLag(String flushLag) {
            this.flushLag = flushLag;
            return this;
        }
        public String getFlushLag() {
            return this.flushLag;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setFlushLatency(String flushLatency) {
            this.flushLatency = flushLatency;
            return this;
        }
        public String getFlushLatency() {
            return this.flushLatency;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setSendLatency(String sendLatency) {
            this.sendLatency = sendLatency;
            return this;
        }
        public String getSendLatency() {
            return this.sendLatency;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setWriteLag(String writeLag) {
            this.writeLag = writeLag;
            return this;
        }
        public String getWriteLag() {
            return this.writeLag;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLag(String replayLag) {
            this.replayLag = replayLag;
            return this;
        }
        public String getReplayLag() {
            return this.replayLag;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setWriteLatency(String writeLatency) {
            this.writeLatency = writeLatency;
            return this;
        }
        public String getWriteLatency() {
            return this.writeLatency;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReadDBInstanceName(String readDBInstanceName) {
            this.readDBInstanceName = readDBInstanceName;
            return this;
        }
        public String getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay extends TeaModel {
        @NameInMap("ReadonlyInstanceDelay")
        public java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> readonlyInstanceDelay;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay self = new DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay setReadonlyInstanceDelay(java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> readonlyInstanceDelay) {
            this.readonlyInstanceDelay = readonlyInstanceDelay;
            return this;
        }
        public java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseBodyItemsItems extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("ReadDBInstanceNames")
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames readDBInstanceNames;

        @NameInMap("ReadDelayTimes")
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes readDelayTimes;

        @NameInMap("ReadonlyInstanceDelay")
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay readonlyInstanceDelay;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItems self = new DescribeReadDBInstanceDelayResponseBodyItemsItems();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItems setReadDBInstanceNames(DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames readDBInstanceNames) {
            this.readDBInstanceNames = readDBInstanceNames;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames getReadDBInstanceNames() {
            return this.readDBInstanceNames;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItems setReadDelayTimes(DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes readDelayTimes) {
            this.readDelayTimes = readDelayTimes;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes getReadDelayTimes() {
            return this.readDelayTimes;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItems setReadonlyInstanceDelay(DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay readonlyInstanceDelay) {
            this.readonlyInstanceDelay = readonlyInstanceDelay;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelay getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseBodyItems extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItems> items;

        public static DescribeReadDBInstanceDelayResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItems self = new DescribeReadDBInstanceDelayResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseBodyItems setItems(java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeReadDBInstanceDelayResponseBodyItemsItems> getItems() {
            return this.items;
        }

    }

}
