// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetFGTableRequest extends TeaModel {
    @NameInMap("TrainingSetFgConfig")
    public ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig trainingSetFgConfig;

    public static ExportModelFeatureTrainingSetFGTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetFGTableRequest self = new ExportModelFeatureTrainingSetFGTableRequest();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetFGTableRequest setTrainingSetFgConfig(ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig trainingSetFgConfig) {
        this.trainingSetFgConfig = trainingSetFgConfig;
        return this;
    }
    public ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig getTrainingSetFgConfig() {
        return this.trainingSetFgConfig;
    }

    public static class ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig extends TeaModel {
        @NameInMap("FgJsonName")
        public String fgJsonName;

        @NameInMap("JarName")
        public String jarName;

        @NameInMap("Partitions")
        public java.util.Map<String, java.util.Map<String, ?>> partitions;

        public static ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig build(java.util.Map<String, ?> map) throws Exception {
            ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig self = new ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig();
            return TeaModel.build(map, self);
        }

        public ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig setFgJsonName(String fgJsonName) {
            this.fgJsonName = fgJsonName;
            return this;
        }
        public String getFgJsonName() {
            return this.fgJsonName;
        }

        public ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig setJarName(String jarName) {
            this.jarName = jarName;
            return this;
        }
        public String getJarName() {
            return this.jarName;
        }

        public ExportModelFeatureTrainingSetFGTableRequestTrainingSetFgConfig setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
            this.partitions = partitions;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
            return this.partitions;
        }

    }

}
