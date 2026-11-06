// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeReplicationSlotsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of replication slots.</p>
     */
    @NameInMap("Slots")
    public java.util.List<DescribeReplicationSlotsResponseBodySlots> slots;

    public static DescribeReplicationSlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationSlotsResponseBody self = new DescribeReplicationSlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationSlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationSlotsResponseBody setSlots(java.util.List<DescribeReplicationSlotsResponseBodySlots> slots) {
        this.slots = slots;
        return this;
    }
    public java.util.List<DescribeReplicationSlotsResponseBodySlots> getSlots() {
        return this.slots;
    }

    public static class DescribeReplicationSlotsResponseBodySlots extends TeaModel {
        /**
         * <p>The ID of the PolarDB cluster to which the replication slot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the database associated with the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The name of the output plugin used by the logical replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>testPlugin</p>
         */
        @NameInMap("Plugin")
        public String plugin;

        /**
         * <p>The name of the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>testSlot</p>
         */
        @NameInMap("SlotName")
        public String slotName;

        /**
         * <p>The status of the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("SlotStatus")
        public String slotStatus;

        /**
         * <p>The type of the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>logical</p>
         */
        @NameInMap("SlotType")
        public String slotType;

        /**
         * <p>The child node name of the distributed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("SubGroupName")
        public String subGroupName;

        /**
         * <p>The replay lag value of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SubReplayLag")
        public String subReplayLag;

        /**
         * <p>Indicates whether the replication slot is temporary. The value is returned as a string: true or false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Temporary")
        public String temporary;

        /**
         * <p>The WAL latency value.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("WalDelay")
        public String walDelay;

        public static DescribeReplicationSlotsResponseBodySlots build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationSlotsResponseBodySlots self = new DescribeReplicationSlotsResponseBodySlots();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationSlotsResponseBodySlots setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeReplicationSlotsResponseBodySlots setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeReplicationSlotsResponseBodySlots setPlugin(String plugin) {
            this.plugin = plugin;
            return this;
        }
        public String getPlugin() {
            return this.plugin;
        }

        public DescribeReplicationSlotsResponseBodySlots setSlotName(String slotName) {
            this.slotName = slotName;
            return this;
        }
        public String getSlotName() {
            return this.slotName;
        }

        public DescribeReplicationSlotsResponseBodySlots setSlotStatus(String slotStatus) {
            this.slotStatus = slotStatus;
            return this;
        }
        public String getSlotStatus() {
            return this.slotStatus;
        }

        public DescribeReplicationSlotsResponseBodySlots setSlotType(String slotType) {
            this.slotType = slotType;
            return this;
        }
        public String getSlotType() {
            return this.slotType;
        }

        public DescribeReplicationSlotsResponseBodySlots setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public DescribeReplicationSlotsResponseBodySlots setSubReplayLag(String subReplayLag) {
            this.subReplayLag = subReplayLag;
            return this;
        }
        public String getSubReplayLag() {
            return this.subReplayLag;
        }

        public DescribeReplicationSlotsResponseBodySlots setTemporary(String temporary) {
            this.temporary = temporary;
            return this;
        }
        public String getTemporary() {
            return this.temporary;
        }

        public DescribeReplicationSlotsResponseBodySlots setWalDelay(String walDelay) {
            this.walDelay = walDelay;
            return this;
        }
        public String getWalDelay() {
            return this.walDelay;
        }

    }

}
