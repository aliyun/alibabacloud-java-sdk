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
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The instance IDs of assets.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("InstanceList")
    public java.util.List<AddCheckInstanceResultWhiteListRequestInstanceList> instanceList;

    @NameInMap("Remark")
    public String remark;

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
        @NameInMap("InstanceId")
        public String instanceId;

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
