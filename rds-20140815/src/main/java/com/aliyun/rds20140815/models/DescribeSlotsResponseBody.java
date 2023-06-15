// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlotsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of information about replication slots.</p>
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
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The extension that is used by the replication slot.</p>
         */
        @NameInMap("Plugin")
        public String plugin;

        /**
         * <p>The name of the replication slot.</p>
         */
        @NameInMap("SlotName")
        public String slotName;

        /**
         * <p>The status of the replication slot.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ACTIVE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   INACTIVE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("SlotStatus")
        public String slotStatus;

        /**
         * <p>The type of the replication slot.</p>
         */
        @NameInMap("SlotType")
        public String slotType;

        /**
         * <p>Indicates whether the replication slot is temporary.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Temporary")
        public String temporary;

        /**
         * <p>The number of logs that are accumulated for the replication slot.</p>
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
