// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlotsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76AF0609-4195-5DFC-BC78-3AD76FF872BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of replication slots of the instance.</p>
     */
    @NameInMap("Slots")
    public java.util.List<DescribeSlotsResponseBodySlots> slots;

    public static DescribeSlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlotsResponseBody self = new DescribeSlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlotsResponseBody setSlots(java.util.List<DescribeSlotsResponseBodySlots> slots) {
        this.slots = slots;
        return this;
    }
    public java.util.List<DescribeSlotsResponseBodySlots> getSlots() {
        return this.slots;
    }

    public static class DescribeSlotsResponseBodySlots extends TeaModel {
        /**
         * <p>The name of the database in which the replication slot resides.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test01</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The plugin used by the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>test_decoding</p>
         */
        @NameInMap("Plugin")
        public String plugin;

        /**
         * <p>The name of the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>slot_test01</p>
         */
        @NameInMap("SlotName")
        public String slotName;

        /**
         * <p>The status of the replication slot. Valid values:</p>
         * <ul>
         * <li>ACTIVE: Active.</li>
         * <li>INACTIVE: Inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INACTIVE</p>
         */
        @NameInMap("SlotStatus")
        public String slotStatus;

        /**
         * <p>The type of the replication slot. Valid values:</p>
         * <ul>
         * <li>physical: Physical.</li>
         * <li>logical: Logical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logical</p>
         */
        @NameInMap("SlotType")
        public String slotType;

        /**
         * <p>The specific latency of the logical subscription on the subscriber corresponding to the current replication slot. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubReplayLag")
        public String subReplayLag;

        /**
         * <p>Indicates whether the replication slot is temporary. Valid values:</p>
         * <ul>
         * <li>true: The replication slot is temporary.</li>
         * <li>false: The replication slot is not temporary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Temporary")
        public String temporary;

        /**
         * <p>The amount of logs accumulated by the replication slot.</p>
         * 
         * <strong>example:</strong>
         * <p>16 MB</p>
         */
        @NameInMap("WalDelay")
        public String walDelay;

        public static DescribeSlotsResponseBodySlots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlotsResponseBodySlots self = new DescribeSlotsResponseBodySlots();
            return TeaModel.build(map, self);
        }

        public DescribeSlotsResponseBodySlots setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSlotsResponseBodySlots setPlugin(String plugin) {
            this.plugin = plugin;
            return this;
        }
        public String getPlugin() {
            return this.plugin;
        }

        public DescribeSlotsResponseBodySlots setSlotName(String slotName) {
            this.slotName = slotName;
            return this;
        }
        public String getSlotName() {
            return this.slotName;
        }

        public DescribeSlotsResponseBodySlots setSlotStatus(String slotStatus) {
            this.slotStatus = slotStatus;
            return this;
        }
        public String getSlotStatus() {
            return this.slotStatus;
        }

        public DescribeSlotsResponseBodySlots setSlotType(String slotType) {
            this.slotType = slotType;
            return this;
        }
        public String getSlotType() {
            return this.slotType;
        }

        public DescribeSlotsResponseBodySlots setSubReplayLag(String subReplayLag) {
            this.subReplayLag = subReplayLag;
            return this;
        }
        public String getSubReplayLag() {
            return this.subReplayLag;
        }

        public DescribeSlotsResponseBodySlots setTemporary(String temporary) {
            this.temporary = temporary;
            return this;
        }
        public String getTemporary() {
            return this.temporary;
        }

        public DescribeSlotsResponseBodySlots setWalDelay(String walDelay) {
            this.walDelay = walDelay;
            return this;
        }
        public String getWalDelay() {
            return this.walDelay;
        }

    }

}
