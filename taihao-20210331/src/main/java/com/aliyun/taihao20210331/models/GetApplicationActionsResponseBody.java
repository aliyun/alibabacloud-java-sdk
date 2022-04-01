// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetApplicationActionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<Data> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetApplicationActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationActionsResponseBody self = new GetApplicationActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationActionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationActionsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public GetApplicationActionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationActionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ActionConfigs extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        @NameInMap("valueAttribute")
        public String valueAttribute;

        @NameInMap("valueType")
        public String valueType;

        public static ActionConfigs build(java.util.Map<String, ?> map) throws Exception {
            ActionConfigs self = new ActionConfigs();
            return TeaModel.build(map, self);
        }

        public ActionConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ActionConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ActionConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ActionConfigs setValueAttribute(String valueAttribute) {
            this.valueAttribute = valueAttribute;
            return this;
        }
        public String getValueAttribute() {
            return this.valueAttribute;
        }

        public ActionConfigs setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("actionConfigs")
        public java.util.List<ActionConfigs> actionConfigs;

        @NameInMap("actionName")
        public String actionName;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("description")
        public String description;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setActionConfigs(java.util.List<ActionConfigs> actionConfigs) {
            this.actionConfigs = actionConfigs;
            return this;
        }
        public java.util.List<ActionConfigs> getActionConfigs() {
            return this.actionConfigs;
        }

        public Data setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public Data setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Data setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
