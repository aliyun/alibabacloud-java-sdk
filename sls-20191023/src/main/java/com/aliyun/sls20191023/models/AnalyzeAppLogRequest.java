// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeAppLogRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("VariableMap")
    public java.util.Map<String, ?> variableMap;

    public static AnalyzeAppLogRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAppLogRequest self = new AnalyzeAppLogRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeAppLogRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AnalyzeAppLogRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AnalyzeAppLogRequest setVariableMap(java.util.Map<String, ?> variableMap) {
        this.variableMap = variableMap;
        return this;
    }
    public java.util.Map<String, ?> getVariableMap() {
        return this.variableMap;
    }

}
