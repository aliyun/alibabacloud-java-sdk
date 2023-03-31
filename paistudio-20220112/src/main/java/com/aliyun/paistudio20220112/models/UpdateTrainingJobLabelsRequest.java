// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateTrainingJobLabelsRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<UpdateTrainingJobLabelsRequestLabels> labels;

    public static UpdateTrainingJobLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainingJobLabelsRequest self = new UpdateTrainingJobLabelsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrainingJobLabelsRequest setLabels(java.util.List<UpdateTrainingJobLabelsRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateTrainingJobLabelsRequestLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateTrainingJobLabelsRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateTrainingJobLabelsRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrainingJobLabelsRequestLabels self = new UpdateTrainingJobLabelsRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateTrainingJobLabelsRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTrainingJobLabelsRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
