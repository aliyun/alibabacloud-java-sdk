// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlotsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Database")
        public String database;

        @NameInMap("Plugin")
        public String plugin;

        @NameInMap("SlotName")
        public String slotName;

        @NameInMap("SlotStatus")
        public String slotStatus;

        @NameInMap("SlotType")
        public String slotType;

        @NameInMap("SubReplayLag")
        public String subReplayLag;

        @NameInMap("Temporary")
        public String temporary;

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
