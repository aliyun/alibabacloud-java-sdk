// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    /**
     * <p>机器组属性。</p>
     */
    @NameInMap("groupAttribute")
    public MachineGroupGroupAttribute groupAttribute;

    /**
     * <p>机器组名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>machineGroup-1</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>机器组类型，目前固定为空字符串。</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>机器标识类型。</p>
     * <ul>
     * <li>ip：IP地址机器组。</li>
     * <li>userdefined：用户自定义标识机器组。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("machineIdentifyType")
    public String machineIdentifyType;

    /**
     * <p>机器列表。</p>
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
         * <p>机器组所依赖的外部管理系统标识。</p>
         * 
         * <strong>example:</strong>
         * <p>testgroup</p>
         */
        @NameInMap("externalName")
        public String externalName;

        /**
         * <p>机器组的日志主题。</p>
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
