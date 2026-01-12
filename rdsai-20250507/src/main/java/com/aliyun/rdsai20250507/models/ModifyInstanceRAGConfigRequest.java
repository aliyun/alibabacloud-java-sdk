// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceRAGConfigRequest extends TeaModel {
    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the RAG agent. If you do not configure this parameter, the RAG agent state remains unchanged. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     */
    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceRAGConfigRequestConfigList> configList;

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
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceRAGConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
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
