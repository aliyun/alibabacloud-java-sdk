// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance to configure.</p>
     * <blockquote>
     * <p>To obtain the instance ID, call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of IP addresses to add to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>10.162.XX.XX</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    /**
     * <p>The policies for the public IP address whitelist.</p>
     */
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
        /**
         * <p>The description of this whitelist rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IP addresses to add to the whitelist. You can specify up to 50 IP addresses, separated by a comma.</p>
         * 
         * <strong>example:</strong>
         * <p>10.162.XX.XX,192.168.XX.XX</p>
         */
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
