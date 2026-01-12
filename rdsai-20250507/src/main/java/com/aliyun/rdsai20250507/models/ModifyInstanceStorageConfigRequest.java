// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageConfigRequest extends TeaModel {
    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceStorageConfigRequestConfigList> configList;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceStorageConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceStorageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageConfigRequest self = new ModifyInstanceStorageConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceStorageConfigRequest setConfigList(java.util.List<ModifyInstanceStorageConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<ModifyInstanceStorageConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public ModifyInstanceStorageConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceStorageConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyInstanceStorageConfigRequestConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TENANT_ID</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test-prefix</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceStorageConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceStorageConfigRequestConfigList self = new ModifyInstanceStorageConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceStorageConfigRequestConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceStorageConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
