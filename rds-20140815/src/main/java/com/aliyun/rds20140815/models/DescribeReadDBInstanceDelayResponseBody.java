// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayResponseBody extends TeaModel {
    /**
     * <p>The primary instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The latency of data replication. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>The latency information.</p>
     */
    @NameInMap("Items")
    public DescribeReadDBInstanceDelayResponseBodyItems items;

    /**
     * <p>The read-only instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rr-bp*****</p>
     */
    @NameInMap("ReadDBInstanceId")
    public String readDBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1BDDEA8-452D-450B-AB10-CD5C5BAFC5DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeReadDBInstanceDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayResponseBody self = new DescribeReadDBInstanceDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReadDBInstanceDelayResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public DescribeReadDBInstanceDelayResponseBody setReadDBInstanceId(String readDBInstanceId) {
        this.readDBInstanceId = readDBInstanceId;
        return this;
    }
    public String getReadDBInstanceId() {
        return this.readDBInstanceId;
    }

    public DescribeReadDBInstanceDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        /**
         * <p>The duration that is allowed for the latency in the persistence of WAL data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlushLag")
        public String flushLag;

        /**
         * <p>The data size that is allowed for the latency in the persistence of WAL data. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlushLatency")
        public String flushLatency;

        /**
         * <p>The read-only instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rr-bp*****</p>
         */
        @NameInMap("ReadDBInstanceName")
        public String readDBInstanceName;

        /**
         * <p>The duration that is allowed for the latency in the playback of WAL data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReplayLag")
        public String replayLag;

        /**
         * <p>The data size that is allowed for the latency in the playback of WAL data. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReplayLatency")
        public String replayLatency;

        /**
         * <p>The data size that is allowed for the latency in the sending of WAL data. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SendLatency")
        public String sendLatency;

        /**
         * <p>The duration that is allowed for the latency in the write-back of WAL data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteLag")
        public String writeLag;

        /**
         * <p>The data size that is allowed for the latency in the write-back of WAL data. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteLatency")
        public String writeLatency;

        public static DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay self = new DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay();
            return TeaModel.build(map, self);
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

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReadDBInstanceName(String readDBInstanceName) {
            this.readDBInstanceName = readDBInstanceName;
            return this;
        }
        public String getReadDBInstanceName() {
            return this.readDBInstanceName;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLag(String replayLag) {
            this.replayLag = replayLag;
            return this;
        }
        public String getReplayLag() {
            return this.replayLag;
        }

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setReplayLatency(String replayLatency) {
            this.replayLatency = replayLatency;
            return this;
        }
        public String getReplayLatency() {
            return this.replayLatency;
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

        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadonlyInstanceDelayReadonlyInstanceDelay setWriteLatency(String writeLatency) {
            this.writeLatency = writeLatency;
            return this;
        }
        public String getWriteLatency() {
            return this.writeLatency;
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
        /**
         * <p>The primary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp*****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>An array that consists of information about the read-only instance.</p>
         */
        @NameInMap("ReadDBInstanceNames")
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDBInstanceNames readDBInstanceNames;

        /**
         * <p>The latency of data replication.</p>
         */
        @NameInMap("ReadDelayTimes")
        public DescribeReadDBInstanceDelayResponseBodyItemsItemsReadDelayTimes readDelayTimes;

        /**
         * <p>The information about the write-ahead log (WAL) latency.</p>
         * <blockquote>
         * <p> This parameter is returned only when the primary instance runs PostgreSQL.</p>
         * </blockquote>
         */
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
