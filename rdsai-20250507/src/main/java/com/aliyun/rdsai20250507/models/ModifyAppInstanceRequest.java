// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Components")
    public java.util.List<ModifyAppInstanceRequestComponents> components;

    /**
     * <strong>example:</strong>
     * <p>ra-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceRequest self = new ModifyAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppInstanceRequest setComponents(java.util.List<ModifyAppInstanceRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<ModifyAppInstanceRequestComponents> getComponents() {
        return this.components;
    }

    public ModifyAppInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyAppInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyAppInstanceRequestComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyAppInstanceRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceRequestComponents self = new ModifyAppInstanceRequestComponents();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceRequestComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppInstanceRequestComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
