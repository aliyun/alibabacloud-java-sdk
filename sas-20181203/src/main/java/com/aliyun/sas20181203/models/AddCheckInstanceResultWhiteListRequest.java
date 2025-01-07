// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckInstanceResultWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the group to which the check item belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cQFq20UzZ49K6gRSJD1301****</p>
     */
    @NameInMap("CheckGroupId")
    public String checkGroupId;

    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The instance IDs of the assets.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The asset instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<AddCheckInstanceResultWhiteListRequestInstanceList> instanceList;

    /**
     * <p>The description. The value of this parameter can be up to 65,535 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The type of the rule. Default value: <strong>WHITE</strong>. Valid value:</p>
     * <ul>
     * <li>WHITE: adds check items to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static AddCheckInstanceResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCheckInstanceResultWhiteListRequest self = new AddCheckInstanceResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddCheckInstanceResultWhiteListRequest setCheckGroupId(String checkGroupId) {
        this.checkGroupId = checkGroupId;
        return this;
    }
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    public AddCheckInstanceResultWhiteListRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public AddCheckInstanceResultWhiteListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AddCheckInstanceResultWhiteListRequest setInstanceList(java.util.List<AddCheckInstanceResultWhiteListRequestInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<AddCheckInstanceResultWhiteListRequestInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public AddCheckInstanceResultWhiteListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddCheckInstanceResultWhiteListRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public static class AddCheckInstanceResultWhiteListRequestInstanceList extends TeaModel {
        /**
         * <p>The instance ID of the asset.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> operation to query the instance IDs of assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz9fdluqx20mp2x7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the asset.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> operation to query the region ID of the asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static AddCheckInstanceResultWhiteListRequestInstanceList build(java.util.Map<String, ?> map) throws Exception {
            AddCheckInstanceResultWhiteListRequestInstanceList self = new AddCheckInstanceResultWhiteListRequestInstanceList();
            return TeaModel.build(map, self);
        }

        public AddCheckInstanceResultWhiteListRequestInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddCheckInstanceResultWhiteListRequestInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
