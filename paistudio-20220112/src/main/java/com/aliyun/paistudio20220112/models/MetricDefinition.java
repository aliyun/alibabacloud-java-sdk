// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class MetricDefinition extends TeaModel {
    // A brief description for the metric.
    @NameInMap("Description")
    public String description;

    // The name of the metric.
    @NameInMap("Name")
    public String name;

    // Regex use to match the metrics from job log.
    @NameInMap("Regex")
    public String regex;

    public static MetricDefinition build(java.util.Map<String, ?> map) throws Exception {
        MetricDefinition self = new MetricDefinition();
        return TeaModel.build(map, self);
    }

    public MetricDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetricDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetricDefinition setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

}
