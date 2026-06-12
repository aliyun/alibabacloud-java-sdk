// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    /**
     * <p>The properties of the machine group.</p>
     */
    @NameInMap("groupAttribute")
    public MachineGroupGroupAttribute groupAttribute;

    /**
     * <p>The name of the machine group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>machineGroup-test</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The type of the machine group. This parameter is currently an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The machine identity type.</p>
     * <ul>
     * <li><p>ip: The machine group is identified by IP addresses.</p>
     * </li>
     * <li><p>userdefined: The machine group is identified by custom identifiers.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    /**
     * <p>The list of machines.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The identifier of the external management system that the machine group depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("externalName")
        public String externalName;

        /**
         * <p>The topic of the machine group.</p>
         * 
         * <strong>example:</strong>
         * <p>testtopic</p>
         */
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
