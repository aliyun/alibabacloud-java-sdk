// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class MetricDefinition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>train dataset oob score</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>train:oob_score</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.<em>train:oob_score=([-+]?[0-9]</em>\.?[0-9]+(?:[eE][-+]?[0-9]+)?).*</p>
     */
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
