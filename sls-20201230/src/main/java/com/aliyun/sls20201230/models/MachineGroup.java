// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    // 机器组属性。
    @NameInMap("groupAttribute")
    public MachineGroupGroupAttribute groupAttribute;

    // 机器组名称。
    @NameInMap("groupName")
    public String groupName;

    // 机器组种类。目前固定为空字符串。
    @NameInMap("groupType")
    public String groupType;

    // 机器组标识种类，支持 IP 标识或者用户自定义标识，即 ip 、userdefined。
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    // 机器组标识列表。
    @NameInMap("machineList")
    public java.util.List<String> machineList;

    public static MachineGroup build(java.util.Map<String, ?> map) throws Exception {
        MachineGroup self = new MachineGroup();
        return TeaModel.build(map, self);
    }

    public MachineGroup setGroupAttribute(MachineGroupGroupAttribute groupAttribute) {
        this.groupAttribute = groupAttribute;
        return this;
    }
    public MachineGroupGroupAttribute getGroupAttribute() {
        return this.groupAttribute;
    }

    public MachineGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public MachineGroup setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public MachineGroup setMachineIdentifyType(String machineIdentifyType) {
        this.machineIdentifyType = machineIdentifyType;
        return this;
    }
    public String getMachineIdentifyType() {
        return this.machineIdentifyType;
    }

    public MachineGroup setMachineList(java.util.List<String> machineList) {
        this.machineList = machineList;
        return this;
    }
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static class MachineGroupGroupAttribute extends TeaModel {
        // 机器组所依赖的外部管理系统标识。
        @NameInMap("externalName")
        public String externalName;

        // 机器组的日志主题。
        @NameInMap("groupTopic")
        public String groupTopic;

        public static MachineGroupGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            MachineGroupGroupAttribute self = new MachineGroupGroupAttribute();
            return TeaModel.build(map, self);
        }

        public MachineGroupGroupAttribute setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public MachineGroupGroupAttribute setGroupTopic(String groupTopic) {
            this.groupTopic = groupTopic;
            return this;
        }
        public String getGroupTopic() {
            return this.groupTopic;
        }

    }

}
