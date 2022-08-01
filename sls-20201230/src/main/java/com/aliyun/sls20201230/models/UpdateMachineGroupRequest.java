// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMachineGroupRequest extends TeaModel {
    @NameInMap("groupAttribute")
    public UpdateMachineGroupRequestGroupAttribute groupAttribute;

    @NameInMap("groupName")
    public String groupName;

    @NameInMap("groupType")
    public String groupType;

    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

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
        @NameInMap("externalName")
        public String externalName;

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
