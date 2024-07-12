// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetTableRequest extends TeaModel {
    @NameInMap("FeatureViewConfig")
    public java.util.Map<String, FeatureViewConfigValue> featureViewConfig;

    @NameInMap("LabelInputConfig")
    public ExportModelFeatureTrainingSetTableRequestLabelInputConfig labelInputConfig;

    @NameInMap("RealTimeIterateInterval")
    public Long realTimeIterateInterval;

    @NameInMap("TrainingSetConfig")
    public ExportModelFeatureTrainingSetTableRequestTrainingSetConfig trainingSetConfig;

    public static ExportModelFeatureTrainingSetTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetTableRequest self = new ExportModelFeatureTrainingSetTableRequest();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetTableRequest setFeatureViewConfig(java.util.Map<String, FeatureViewConfigValue> featureViewConfig) {
        this.featureViewConfig = featureViewConfig;
        return this;
    }
    public java.util.Map<String, FeatureViewConfigValue> getFeatureViewConfig() {
        return this.featureViewConfig;
    }

    public ExportModelFeatureTrainingSetTableRequest setLabelInputConfig(ExportModelFeatureTrainingSetTableRequestLabelInputConfig labelInputConfig) {
        this.labelInputConfig = labelInputConfig;
        return this;
    }
    public ExportModelFeatureTrainingSetTableRequestLabelInputConfig getLabelInputConfig() {
        return this.labelInputConfig;
    }

    public ExportModelFeatureTrainingSetTableRequest setRealTimeIterateInterval(Long realTimeIterateInterval) {
        this.realTimeIterateInterval = realTimeIterateInterval;
        return this;
    }
    public Long getRealTimeIterateInterval() {
        return this.realTimeIterateInterval;
    }

    public ExportModelFeatureTrainingSetTableRequest setTrainingSetConfig(ExportModelFeatureTrainingSetTableRequestTrainingSetConfig trainingSetConfig) {
        this.trainingSetConfig = trainingSetConfig;
        return this;
    }
    public ExportModelFeatureTrainingSetTableRequestTrainingSetConfig getTrainingSetConfig() {
        return this.trainingSetConfig;
    }

    public static class ExportModelFeatureTrainingSetTableRequestLabelInputConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-02 00:00:00</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("Partitions")
        public java.util.Map<String, java.util.Map<String, ?>> partitions;

        public static ExportModelFeatureTrainingSetTableRequestLabelInputConfig build(java.util.Map<String, ?> map) throws Exception {
            ExportModelFeatureTrainingSetTableRequestLabelInputConfig self = new ExportModelFeatureTrainingSetTableRequestLabelInputConfig();
            return TeaModel.build(map, self);
        }

        public ExportModelFeatureTrainingSetTableRequestLabelInputConfig setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ExportModelFeatureTrainingSetTableRequestLabelInputConfig setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

    }

    public static class ExportModelFeatureTrainingSetTableRequestTrainingSetConfig extends TeaModel {
        @NameInMap("Partitions")
        public java.util.Map<String, java.util.Map<String, ?>> partitions;

        public static ExportModelFeatureTrainingSetTableRequestTrainingSetConfig build(java.util.Map<String, ?> map) throws Exception {
            ExportModelFeatureTrainingSetTableRequestTrainingSetConfig self = new ExportModelFeatureTrainingSetTableRequestTrainingSetConfig();
            return TeaModel.build(map, self);
        }

        public ExportModelFeatureTrainingSetTableRequestTrainingSetConfig setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

    }

}
