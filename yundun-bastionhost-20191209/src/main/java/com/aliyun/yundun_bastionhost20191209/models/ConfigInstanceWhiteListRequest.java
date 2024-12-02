// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host for which you want to configure a whitelist of public IP addresses.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address whitelist that you want to configure.</p>
     * 
     * <strong>example:</strong>
     * <p>10.162.XX.XX</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    @NameInMap("WhiteListPolicies")
    public java.util.List<ConfigInstanceWhiteListRequestWhiteListPolicies> whiteListPolicies;

    public static ConfigInstanceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhiteListRequest self = new ConfigInstanceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceWhiteListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigInstanceWhiteListRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public ConfigInstanceWhiteListRequest setWhiteListPolicies(java.util.List<ConfigInstanceWhiteListRequestWhiteListPolicies> whiteListPolicies) {
        this.whiteListPolicies = whiteListPolicies;
        return this;
    }
    public java.util.List<ConfigInstanceWhiteListRequestWhiteListPolicies> getWhiteListPolicies() {
        return this.whiteListPolicies;
    }

    public static class ConfigInstanceWhiteListRequestWhiteListPolicies extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Entry")
        public String entry;

        public static ConfigInstanceWhiteListRequestWhiteListPolicies build(java.util.Map<String, ?> map) throws Exception {
            ConfigInstanceWhiteListRequestWhiteListPolicies self = new ConfigInstanceWhiteListRequestWhiteListPolicies();
            return TeaModel.build(map, self);
        }

        public ConfigInstanceWhiteListRequestWhiteListPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConfigInstanceWhiteListRequestWhiteListPolicies setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

    }

}
