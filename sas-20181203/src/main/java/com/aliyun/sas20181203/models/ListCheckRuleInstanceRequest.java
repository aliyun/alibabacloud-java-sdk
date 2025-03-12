// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleInstanceRequest extends TeaModel {
    /**
     * <p>The page number of the current page when performing a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Instance list.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<ListCheckRuleInstanceRequestInstanceList> instanceList;

    /**
     * <p>The maximum number of items per page in a paginated query. The default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Rule ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">LisCheckRule</a> interface to get this parameter.</p>
     * </blockquote>
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
         * <p>Asset instance ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> interface to get this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz9fdluqx20mp2x7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region where the asset is located.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> interface to get this parameter.</p>
         * </blockquote>
         * 
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
