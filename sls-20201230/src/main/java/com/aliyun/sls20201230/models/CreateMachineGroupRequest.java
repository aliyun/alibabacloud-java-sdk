// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateMachineGroupRequest extends TeaModel {
    /**
     * <p>The attributes of the machine group.</p>
     */
    @NameInMap("groupAttribute")
    public CreateMachineGroupRequestGroupAttribute groupAttribute;

    /**
     * <p>The name of the machine group. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name of each machine group in a project must be unique.</p>
     * <p>*   It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * <p>*   It must start and end with a lowercase letter or a digit.</p>
     * <p>*   It must be 3 to 128 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The type of the machine group. The parameter can be left empty.</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The type of the machine group identifier. Valid values:</p>
     * <br>
     * <p>*   ip: The machine group uses IP addresses as identifiers.</p>
     * <p>*   userdefined: The machine group uses custom identifiers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    /**
     * <p>The identifiers of machine group.</p>
     * <br>
     * <p>*   If you set machineIdentifyType to ip, enter the IP address of the machine.</p>
     * <p>*   If you set machineIdentifyType to userdefined, enter a custom identifier.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The identifier of the external management system on which the machine group depends.</p>
         */
        @NameInMap("externalName")
        public String externalName;

        /**
         * <p>The log topic of the machine group.</p>
         */
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
