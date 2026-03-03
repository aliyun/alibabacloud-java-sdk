// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMetricMeasurePointData extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>youngGcCount</p>
     */
    @NameInMap("measure")
    public String measure;

    /**
     * <strong>example:</strong>
     * <p>08-22 17:25</p>
     */
    @NameInMap("timeStamp")
    public String timeStamp;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>1M</p>
     */
    @NameInMap("valueWithUnit")
    public String valueWithUnit;

    public static MonitorMetricMeasurePointData build(java.util.Map<String, ?> map) throws Exception {
        MonitorMetricMeasurePointData self = new MonitorMetricMeasurePointData();
        return TeaModel.build(map, self);
    }

    public MonitorMetricMeasurePointData setMeasure(String measure) {
        this.measure = measure;
        return this;
    }
    public String getMeasure() {
        return this.measure;
    }

    public MonitorMetricMeasurePointData setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public MonitorMetricMeasurePointData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MonitorMetricMeasurePointData setValueWithUnit(String valueWithUnit) {
        this.valueWithUnit = valueWithUnit;
        return this;
    }
    public String getValueWithUnit() {
        return this.valueWithUnit;
    }

}
