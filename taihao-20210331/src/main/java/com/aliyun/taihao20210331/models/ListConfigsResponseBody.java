// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConfigsResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        @NameInMap("applicationName")
        public String applicationName;

        @NameInMap("configFileName")
        public String configFileName;

        @NameInMap("configItemEffectiveActions")
        public String configItemEffectiveActions;

        @NameInMap("configItemEffectiveType")
        public String configItemEffectiveType;

        @NameInMap("configItemKey")
        public String configItemKey;

        @NameInMap("configItemValue")
        public String configItemValue;

        @NameInMap("configItemValueIncrementStep")
        public String configItemValueIncrementStep;

        @NameInMap("configItemValueMaximum")
        public String configItemValueMaximum;

        @NameInMap("configItemValueMinimum")
        public String configItemValueMinimum;

        @NameInMap("configItemValueReadOnly")
        public Boolean configItemValueReadOnly;

        @NameInMap("configItemValueType")
        public String configItemValueType;

        @NameInMap("configItemValueUnit")
        public String configItemValueUnit;

        @NameInMap("configType")
        public String configType;

        @NameInMap("configVersion")
        public String configVersion;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("initValue")
        public String initValue;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("modifyTime")
        public Long modifyTime;

        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        @NameInMap("nodeId")
        public String nodeId;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Items setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public Items setConfigItemEffectiveActions(String configItemEffectiveActions) {
            this.configItemEffectiveActions = configItemEffectiveActions;
            return this;
        }
        public String getConfigItemEffectiveActions() {
            return this.configItemEffectiveActions;
        }

        public Items setConfigItemEffectiveType(String configItemEffectiveType) {
            this.configItemEffectiveType = configItemEffectiveType;
            return this;
        }
        public String getConfigItemEffectiveType() {
            return this.configItemEffectiveType;
        }

        public Items setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public Items setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public Items setConfigItemValueIncrementStep(String configItemValueIncrementStep) {
            this.configItemValueIncrementStep = configItemValueIncrementStep;
            return this;
        }
        public String getConfigItemValueIncrementStep() {
            return this.configItemValueIncrementStep;
        }

        public Items setConfigItemValueMaximum(String configItemValueMaximum) {
            this.configItemValueMaximum = configItemValueMaximum;
            return this;
        }
        public String getConfigItemValueMaximum() {
            return this.configItemValueMaximum;
        }

        public Items setConfigItemValueMinimum(String configItemValueMinimum) {
            this.configItemValueMinimum = configItemValueMinimum;
            return this;
        }
        public String getConfigItemValueMinimum() {
            return this.configItemValueMinimum;
        }

        public Items setConfigItemValueReadOnly(Boolean configItemValueReadOnly) {
            this.configItemValueReadOnly = configItemValueReadOnly;
            return this;
        }
        public Boolean getConfigItemValueReadOnly() {
            return this.configItemValueReadOnly;
        }

        public Items setConfigItemValueType(String configItemValueType) {
            this.configItemValueType = configItemValueType;
            return this;
        }
        public String getConfigItemValueType() {
            return this.configItemValueType;
        }

        public Items setConfigItemValueUnit(String configItemValueUnit) {
            this.configItemValueUnit = configItemValueUnit;
            return this;
        }
        public String getConfigItemValueUnit() {
            return this.configItemValueUnit;
        }

        public Items setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public Items setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public Items setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public Items setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Items setInitValue(String initValue) {
            this.initValue = initValue;
            return this;
        }
        public String getInitValue() {
            return this.initValue;
        }

        public Items setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public Items setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public Items setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Items setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
