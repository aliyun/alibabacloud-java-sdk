// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMachineGroupRequest extends TeaModel {
    // 机器组属性。
    @NameInMap("groupAttribute")
    public UpdateMachineGroupRequestGroupAttribute groupAttribute;

    // 机器组名称。
    @NameInMap("groupName")
    public String groupName;

    // 机器组类型，可选值，默认为空。
    @NameInMap("groupType")
    public String groupType;

    // 机器组标识种类，支持 ip 、userdefined 两种。
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    // 机器列表。
    @NameInMap("machineList")
    public java.util.List<String> machineList;

    public static UpdateMachineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMachineGroupRequest self = new UpdateMachineGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMachineGroupRequest setGroupAttribute(UpdateMachineGroupRequestGroupAttribute groupAttribute) {
        this.groupAttribute = groupAttribute;
        return this;
    }
    public UpdateMachineGroupRequestGroupAttribute getGroupAttribute() {
        return this.groupAttribute;
    }

    public UpdateMachineGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateMachineGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public UpdateMachineGroupRequest setMachineIdentifyType(String machineIdentifyType) {
        this.machineIdentifyType = machineIdentifyType;
        return this;
    }
    public String getMachineIdentifyType() {
        return this.machineIdentifyType;
    }

    public UpdateMachineGroupRequest setMachineList(java.util.List<String> machineList) {
        this.machineList = machineList;
        return this;
    }
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static class UpdateMachineGroupRequestGroupAttribute extends TeaModel {
        // 机器组所依赖的外部管理系统标识。
        @NameInMap("externalName")
        public String externalName;

        // 机器组的日志主题。
        @NameInMap("groupTopic")
        public String groupTopic;

        public static UpdateMachineGroupRequestGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            UpdateMachineGroupRequestGroupAttribute self = new UpdateMachineGroupRequestGroupAttribute();
            return TeaModel.build(map, self);
        }

        public UpdateMachineGroupRequestGroupAttribute setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public UpdateMachineGroupRequestGroupAttribute setGroupTopic(String groupTopic) {
            this.groupTopic = groupTopic;
            return this;
        }
        public String getGroupTopic() {
            return this.groupTopic;
        }

    }

}
