// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListFirewallRulesRequest extends TeaModel {
    /**
     * <p>The ID of the firewall rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1a16263ab0f541288312a15fa64280de</p>
     */
    @NameInMap("FirewallRuleId")
    public String firewallRuleId;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags of the firewall rule.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListFirewallRulesRequestTag> tag;

    public static ListFirewallRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFirewallRulesRequest self = new ListFirewallRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListFirewallRulesRequest setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }
    public String getFirewallRuleId() {
        return this.firewallRuleId;
    }

    public ListFirewallRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFirewallRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFirewallRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFirewallRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFirewallRulesRequest setTag(java.util.List<ListFirewallRulesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListFirewallRulesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListFirewallRulesRequestTag extends TeaModel {
        /**
         * <p>The tag key. A tag key must be 1 to 64 characters in length. You can add up to 20 tags.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. A tag value must be 1 to 64 characters in length. You can add up to 20 tags.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFirewallRulesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListFirewallRulesRequestTag self = new ListFirewallRulesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListFirewallRulesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFirewallRulesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
