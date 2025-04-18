// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateInstanceLabelsRequest extends TeaModel {
    /**
     * <p>The tags that you want to update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Labels")
    public java.util.List<UpdateInstanceLabelsRequestLabels> labels;

    public static UpdateInstanceLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceLabelsRequest self = new UpdateInstanceLabelsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceLabelsRequest setLabels(java.util.List<UpdateInstanceLabelsRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateInstanceLabelsRequestLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateInstanceLabelsRequestLabels extends TeaModel {
        /**
         * <p>The key of the custom tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customLabelKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>labelValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateInstanceLabelsRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceLabelsRequestLabels self = new UpdateInstanceLabelsRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceLabelsRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateInstanceLabelsRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
