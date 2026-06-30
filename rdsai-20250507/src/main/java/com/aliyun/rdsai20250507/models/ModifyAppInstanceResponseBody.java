// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceResponseBody extends TeaModel {
    @NameInMap("Components")
    public java.util.List<ModifyAppInstanceResponseBodyComponents> components;

    /**
     * <strong>example:</strong>
     * <p>ra-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceResponseBody self = new ModifyAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceResponseBody setComponents(java.util.List<ModifyAppInstanceResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<ModifyAppInstanceResponseBodyComponents> getComponents() {
        return this.components;
    }

    public ModifyAppInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyAppInstanceResponseBodyComponents extends TeaModel {
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

        public static ModifyAppInstanceResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceResponseBodyComponents self = new ModifyAppInstanceResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceResponseBodyComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppInstanceResponseBodyComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
