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

    public DescribeReadDBInstanceDelayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReadDBInstanceDelayResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReadDBInstanceDelayResponse setReadDBInstanceId(String readDBInstanceId) {
        this.readDBInstanceId = readDBInstanceId;
        return this;
    }
    public String getReadDBInstanceId() {
        return this.readDBInstanceId;
    }

    public DescribeReadDBInstanceDelayResponse setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public DescribeReadDBInstanceDelayResponse setItems(DescribeReadDBInstanceDelayResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeReadDBInstanceDelayResponseItems getItems() {
        return this.items;
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

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLatency(String replayLatency) {
            this.replayLatency = replayLatency;
            return this;
        }
        public String getReplayLatency() {
            return this.replayLatency;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setFlushLag(String flushLag) {
            this.flushLag = flushLag;
            return this;
        }
        public String getFlushLag() {
            return this.flushLag;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setFlushLatency(String flushLatency) {
            this.flushLatency = flushLatency;
            return this;
        }
        public String getFlushLatency() {
            return this.flushLatency;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setSendLatency(String sendLatency) {
            this.sendLatency = sendLatency;
            return this;
        }
        public String getSendLatency() {
            return this.sendLatency;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setWriteLag(String writeLag) {
            this.writeLag = writeLag;
            return this;
        }
        public String getWriteLag() {
            return this.writeLag;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLag(String replayLag) {
            this.replayLag = replayLag;
            return this;
        }
        public String getReplayLag() {
            return this.replayLag;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setWriteLatency(String writeLatency) {
            this.writeLatency = writeLatency;
            return this;
        }
        public String getWriteLatency() {
            return this.writeLatency;
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReadDBInstanceName(String readDBInstanceName) {
            this.readDBInstanceName = readDBInstanceName;
            return this;
        }
        public String getReadDBInstanceName() {
            return this.readDBInstanceName;
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

        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay setReadonlyInstanceDelay(java.util.List<DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> readonlyInstanceDelay) {
            this.readonlyInstanceDelay = readonlyInstanceDelay;
            return this;
        }
        public java.util.List<DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay> getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames extends TeaModel {
        // ReadDBInstanceName
        @NameInMap("ReadDBInstanceName")
        @Validation(required = true)
        public java.util.List<String> readDBInstanceName;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames self = new DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames setReadDBInstanceName(java.util.List<String> readDBInstanceName) {
            this.readDBInstanceName = readDBInstanceName;
            return this;
        }
        public java.util.List<String> getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

    }

    public static class DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes extends TeaModel {
        // ReadDelayTime
        @NameInMap("ReadDelayTime")
        @Validation(required = true)
        public java.util.List<String> readDelayTime;

        public static DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes self = new DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes();
            return TeaModel.build(map, self);
        }

        public DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes setReadDelayTime(java.util.List<String> readDelayTime) {
            this.readDelayTime = readDelayTime;
            return this;
        }
        public java.util.List<String> getReadDelayTime() {
            return this.readDelayTime;
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

        public DescribeReadDBInstanceDelayResponseItemsItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeReadDBInstanceDelayResponseItemsItems setReadonlyInstanceDelay(DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay readonlyInstanceDelay) {
            this.readonlyInstanceDelay = readonlyInstanceDelay;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseItemsItemsReadonlyInstanceDelay getReadonlyInstanceDelay() {
            return this.readonlyInstanceDelay;
        }

        public DescribeReadDBInstanceDelayResponseItemsItems setReadDBInstanceNames(DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames readDBInstanceNames) {
            this.readDBInstanceNames = readDBInstanceNames;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseItemsItemsReadDBInstanceNames getReadDBInstanceNames() {
            return this.readDBInstanceNames;
        }

        public DescribeReadDBInstanceDelayResponseItemsItems setReadDelayTimes(DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes readDelayTimes) {
            this.readDelayTimes = readDelayTimes;
            return this;
        }
        public DescribeReadDBInstanceDelayResponseItemsItemsReadDelayTimes getReadDelayTimes() {
            return this.readDelayTimes;
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

        public DescribeReadDBInstanceDelayResponseItems setItems(java.util.List<DescribeReadDBInstanceDelayResponseItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeReadDBInstanceDelayResponseItemsItems> getItems() {
            return this.items;
        }

    }

}
