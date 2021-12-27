// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeAppLogShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("VariableMap")
    public String variableMapShrink;

    public static AnalyzeAppLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAppLogShrinkRequest self = new AnalyzeAppLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeAppLogShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AnalyzeAppLogShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AnalyzeAppLogShrinkRequest setVariableMapShrink(String variableMapShrink) {
        this.variableMapShrink = variableMapShrink;
        return this;
    }
    public String getVariableMapShrink() {
        return this.variableMapShrink;
    }

}
