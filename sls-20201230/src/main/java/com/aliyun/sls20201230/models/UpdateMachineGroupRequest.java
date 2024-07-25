// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMachineGroupRequest extends TeaModel {
    /**
     * <p>The attribute of the machine group. This parameter is empty by default.</p>
     */
    @NameInMap("groupAttribute")
    public UpdateMachineGroupRequestGroupAttribute groupAttribute;

    /**
     * <p>The name of the machine group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-machine-group</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The type of the machine group. Set the value to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The identifier type of the machine group. Valid values:</p>
     * <ul>
     * <li>ip: The machine group uses IP addresses as identifiers.</li>
     * <li>userdefined: The machine group uses custom identifiers.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>userdefined</p>
     */
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    /**
     * <p>The identifiers of the machines in the machine group.</p>
     * <ul>
     * <li>If you set machineIdentifyType to ip, enter the IP addresses of the machines.</li>
     * <li>If you set machineIdentifyType to userdefined, enter a custom identifier.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[uu_id_1，uu_id_2]</p>
     */
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
        /**
         * <p>The identifier of the external management system on which the machine group depends. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup2</p>
         */
        @NameInMap("externalName")
        public String externalName;

        /**
         * <p>The topic of the machine group. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testtopic2</p>
         */
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
