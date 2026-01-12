// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceAuthConfigRequest extends TeaModel {
    /**
     * <p>The ID of the RDS Supabase instance.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceAuthConfigRequestConfigList> configList;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceAuthConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAuthConfigRequest self = new ModifyInstanceAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAuthConfigRequest setConfigList(java.util.List<ModifyInstanceAuthConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<ModifyInstanceAuthConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public ModifyInstanceAuthConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAuthConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyInstanceAuthConfigRequestConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GOTRUE_SITE_URL</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="http://8.152">http://8.152</a>. XXX.XXX</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceAuthConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAuthConfigRequestConfigList self = new ModifyInstanceAuthConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAuthConfigRequestConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceAuthConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
