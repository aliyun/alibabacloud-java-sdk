// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class FeatureViewConfigValueSnapshotPartitionsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20260101</p>
     */
    @NameInMap("Value")
    public String value;

    @NameInMap("Values")
    public java.util.List<String> values;

    @NameInMap("StartValue")
    public String startValue;

    @NameInMap("EndValue")
    public String endValue;

    public static FeatureViewConfigValueSnapshotPartitionsValue build(java.util.Map<String, ?> map) throws Exception {
        FeatureViewConfigValueSnapshotPartitionsValue self = new FeatureViewConfigValueSnapshotPartitionsValue();
        return TeaModel.build(map, self);
    }

    public FeatureViewConfigValueSnapshotPartitionsValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public FeatureViewConfigValueSnapshotPartitionsValue setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

    public FeatureViewConfigValueSnapshotPartitionsValue setStartValue(String startValue) {
        this.startValue = startValue;
        return this;
    }
    public String getStartValue() {
        return this.startValue;
    }

    public FeatureViewConfigValueSnapshotPartitionsValue setEndValue(String endValue) {
        this.endValue = endValue;
        return this;
    }
    public String getEndValue() {
        return this.endValue;
    }

}
