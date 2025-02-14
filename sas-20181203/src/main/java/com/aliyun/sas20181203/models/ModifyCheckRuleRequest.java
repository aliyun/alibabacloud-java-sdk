// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCheckRuleRequest extends TeaModel {
    @NameInMap("AddInstanceList")
    public java.util.List<ModifyCheckRuleRequestAddInstanceList> addInstanceList;

    @NameInMap("DeleteInstanceList")
    public java.util.List<ModifyCheckRuleRequestDeleteInstanceList> deleteInstanceList;

    /**
     * <strong>example:</strong>
     * <p>testRemark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9000**</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static ModifyCheckRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCheckRuleRequest self = new ModifyCheckRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCheckRuleRequest setAddInstanceList(java.util.List<ModifyCheckRuleRequestAddInstanceList> addInstanceList) {
        this.addInstanceList = addInstanceList;
        return this;
    }
    public java.util.List<ModifyCheckRuleRequestAddInstanceList> getAddInstanceList() {
        return this.addInstanceList;
    }

    public ModifyCheckRuleRequest setDeleteInstanceList(java.util.List<ModifyCheckRuleRequestDeleteInstanceList> deleteInstanceList) {
        this.deleteInstanceList = deleteInstanceList;
        return this;
    }
    public java.util.List<ModifyCheckRuleRequestDeleteInstanceList> getDeleteInstanceList() {
        return this.deleteInstanceList;
    }

    public ModifyCheckRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyCheckRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyCheckRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ModifyCheckRuleRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public static class ModifyCheckRuleRequestAddInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-wz9g8ljygfqs1ez3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyCheckRuleRequestAddInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCheckRuleRequestAddInstanceList self = new ModifyCheckRuleRequestAddInstanceList();
            return TeaModel.build(map, self);
        }

        public ModifyCheckRuleRequestAddInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyCheckRuleRequestAddInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ModifyCheckRuleRequestDeleteInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-8vb0e8qdaj0yyxjo****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyCheckRuleRequestDeleteInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ModifyCheckRuleRequestDeleteInstanceList self = new ModifyCheckRuleRequestDeleteInstanceList();
            return TeaModel.build(map, self);
        }

        public ModifyCheckRuleRequestDeleteInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyCheckRuleRequestDeleteInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
