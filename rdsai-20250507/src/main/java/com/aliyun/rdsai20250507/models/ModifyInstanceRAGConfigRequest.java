// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceRAGConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceRAGConfigRequestConfigList> configList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyInstanceRAGConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRAGConfigRequest self = new ModifyInstanceRAGConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRAGConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceRAGConfigRequest setConfigList(java.util.List<ModifyInstanceRAGConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<ModifyInstanceRAGConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public ModifyInstanceRAGConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceRAGConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceRAGConfigRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public static class ModifyInstanceRAGConfigRequestConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LLM_MODEL</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceRAGConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceRAGConfigRequestConfigList self = new ModifyInstanceRAGConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceRAGConfigRequestConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceRAGConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
