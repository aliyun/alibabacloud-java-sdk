// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class FeatureViewConfigValue extends TeaModel {
    @NameInMap("Partitions")
    public java.util.Map<String, FeatureViewConfigValuePartitionsValue> partitions;

    /**
     * <strong>example:</strong>
     * <p>1721186536</p>
     */
    @NameInMap("EventTime")
    public String eventTime;

    @NameInMap("Equal")
    public Boolean equal;

    @NameInMap("UseMock")
    public Boolean useMock;

    @NameInMap("Snapshot")
    public FeatureViewConfigValueSnapshot snapshot;

    public static FeatureViewConfigValue build(java.util.Map<String, ?> map) throws Exception {
        FeatureViewConfigValue self = new FeatureViewConfigValue();
        return TeaModel.build(map, self);
    }

    public FeatureViewConfigValue setPartitions(java.util.Map<String, FeatureViewConfigValuePartitionsValue> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, FeatureViewConfigValuePartitionsValue> getPartitions() {
        return this.partitions;
    }

    public FeatureViewConfigValue setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public FeatureViewConfigValue setEqual(Boolean equal) {
        this.equal = equal;
        return this;
    }
    public Boolean getEqual() {
        return this.equal;
    }

    public FeatureViewConfigValue setUseMock(Boolean useMock) {
        this.useMock = useMock;
        return this;
    }
    public Boolean getUseMock() {
        return this.useMock;
    }

    public FeatureViewConfigValue setSnapshot(FeatureViewConfigValueSnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public FeatureViewConfigValueSnapshot getSnapshot() {
        return this.snapshot;
    }

    public static class FeatureViewConfigValueSnapshot extends TeaModel {
        @NameInMap("Partitions")
        public java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> partitions;

        /**
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Table")
        public String table;

        public static FeatureViewConfigValueSnapshot build(java.util.Map<String, ?> map) throws Exception {
            FeatureViewConfigValueSnapshot self = new FeatureViewConfigValueSnapshot();
            return TeaModel.build(map, self);
        }

        public FeatureViewConfigValueSnapshot setPartitions(java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> getPartitions() {
            return this.partitions;
        }

        public FeatureViewConfigValueSnapshot setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

}
