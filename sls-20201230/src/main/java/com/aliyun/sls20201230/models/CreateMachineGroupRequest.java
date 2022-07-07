// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMachineGroupRequest extends TeaModel {
    // 机器组属性。
    @NameInMap("groupAttribute")
    public CreateMachineGroupRequestGroupAttribute groupAttribute;

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

    public static CreateMachineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMachineGroupRequest self = new CreateMachineGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMachineGroupRequest setGroupAttribute(CreateMachineGroupRequestGroupAttribute groupAttribute) {
        this.groupAttribute = groupAttribute;
        return this;
    }
    public CreateMachineGroupRequestGroupAttribute getGroupAttribute() {
        return this.groupAttribute;
    }

    public CreateMachineGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMachineGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateMachineGroupRequest setMachineIdentifyType(String machineIdentifyType) {
        this.machineIdentifyType = machineIdentifyType;
        return this;
    }
    public String getMachineIdentifyType() {
        return this.machineIdentifyType;
    }

    public CreateMachineGroupRequest setMachineList(java.util.List<String> machineList) {
        this.machineList = machineList;
        return this;
    }
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static class CreateMachineGroupRequestGroupAttribute extends TeaModel {
        // 机器组所依赖的外部管理系统标识。
        @NameInMap("externalName")
        public String externalName;

        // 机器组的日志主题。
        @NameInMap("groupTopic")
        public String groupTopic;

        public static CreateMachineGroupRequestGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateMachineGroupRequestGroupAttribute self = new CreateMachineGroupRequestGroupAttribute();
            return TeaModel.build(map, self);
        }

        public CreateMachineGroupRequestGroupAttribute setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public CreateMachineGroupRequestGroupAttribute setGroupTopic(String groupTopic) {
            this.groupTopic = groupTopic;
            return this;
        }
        public String getGroupTopic() {
            return this.groupTopic;
        }

    }

}
