// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceList")
    public java.util.List<ListCheckRuleInstanceRequestInstanceList> instanceList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static ListCheckRuleInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleInstanceRequest self = new ListCheckRuleInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckRuleInstanceRequest setInstanceList(java.util.List<ListCheckRuleInstanceRequestInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListCheckRuleInstanceRequestInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public ListCheckRuleInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckRuleInstanceRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public static class ListCheckRuleInstanceRequestInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-wz9fdluqx20mp2x7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListCheckRuleInstanceRequestInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRuleInstanceRequestInstanceList self = new ListCheckRuleInstanceRequestInstanceList();
            return TeaModel.build(map, self);
        }

        public ListCheckRuleInstanceRequestInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCheckRuleInstanceRequestInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
