// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationConfigParam extends TeaModel {
    // applicationName
    @NameInMap("applicationName")
    public String applicationName;

    // configFileName
    @NameInMap("configFileName")
    public String configFileName;

    // configItemKey
    @NameInMap("configItemKey")
    public String configItemKey;

    // configItemValue
    @NameInMap("configItemValue")
    public String configItemValue;

    // nodeGroupId
    @NameInMap("nodeGroupId")
    public String nodeGroupId;

    // nodeId
    @NameInMap("nodeId")
    public String nodeId;

    public static ApplicationConfigParam build(java.util.Map<String, ?> map) throws Exception {
        ApplicationConfigParam self = new ApplicationConfigParam();
        return TeaModel.build(map, self);
    }

    public ApplicationConfigParam setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationConfigParam setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public ApplicationConfigParam setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public ApplicationConfigParam setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public ApplicationConfigParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ApplicationConfigParam setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
