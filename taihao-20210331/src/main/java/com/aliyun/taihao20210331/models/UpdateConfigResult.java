// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateConfigResult extends TeaModel {
    // configVersion
    @NameInMap("configVersion")
    public String configVersion;

    // reactivelyChangedConfigs
    @NameInMap("reactivelyChangedConfigs")
    public java.util.List<ReactivelyChangedConfigs> reactivelyChangedConfigs;

    public static UpdateConfigResult build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigResult self = new UpdateConfigResult();
        return TeaModel.build(map, self);
    }

    public UpdateConfigResult setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public String getConfigVersion() {
        return this.configVersion;
    }

    public UpdateConfigResult setReactivelyChangedConfigs(java.util.List<ReactivelyChangedConfigs> reactivelyChangedConfigs) {
        this.reactivelyChangedConfigs = reactivelyChangedConfigs;
        return this;
    }
    public java.util.List<ReactivelyChangedConfigs> getReactivelyChangedConfigs() {
        return this.reactivelyChangedConfigs;
    }

    public static class ReactivelyChangedConfigs extends TeaModel {
        // applicationName
        @NameInMap("applicationName")
        public String applicationName;

        // configAction
        @NameInMap("configAction")
        public String configAction;

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

        public static ReactivelyChangedConfigs build(java.util.Map<String, ?> map) throws Exception {
            ReactivelyChangedConfigs self = new ReactivelyChangedConfigs();
            return TeaModel.build(map, self);
        }

        public ReactivelyChangedConfigs setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ReactivelyChangedConfigs setConfigAction(String configAction) {
            this.configAction = configAction;
            return this;
        }
        public String getConfigAction() {
            return this.configAction;
        }

        public ReactivelyChangedConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ReactivelyChangedConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ReactivelyChangedConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public ReactivelyChangedConfigs setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ReactivelyChangedConfigs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
