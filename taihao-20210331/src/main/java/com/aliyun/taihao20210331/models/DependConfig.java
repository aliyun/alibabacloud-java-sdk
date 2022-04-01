// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DependConfig extends TeaModel {
    // conditionTargets
    @NameInMap("conditionTargets")
    public java.util.List<String> conditionTargets;

    // conditionType
    @NameInMap("conditionType")
    public String conditionType;

    // configFileName
    @NameInMap("configFileName")
    public String configFileName;

    // configItems
    @NameInMap("configItems")
    public java.util.List<ConfigItem> configItems;

    public static DependConfig build(java.util.Map<String, ?> map) throws Exception {
        DependConfig self = new DependConfig();
        return TeaModel.build(map, self);
    }

    public DependConfig setConditionTargets(java.util.List<String> conditionTargets) {
        this.conditionTargets = conditionTargets;
        return this;
    }
    public java.util.List<String> getConditionTargets() {
        return this.conditionTargets;
    }

    public DependConfig setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }
    public String getConditionType() {
        return this.conditionType;
    }

    public DependConfig setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public DependConfig setConfigItems(java.util.List<ConfigItem> configItems) {
        this.configItems = configItems;
        return this;
    }
    public java.util.List<ConfigItem> getConfigItems() {
        return this.configItems;
    }

}
