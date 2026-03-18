// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyHostAliasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("hostAliases")
    public java.util.List<ModifyHostAliasRequestHostAliases> hostAliases;

    public static ModifyHostAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAliasRequest self = new ModifyHostAliasRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostAliasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostAliasRequest setHostAliases(java.util.List<ModifyHostAliasRequestHostAliases> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public java.util.List<ModifyHostAliasRequestHostAliases> getHostAliases() {
        return this.hostAliases;
    }

    public static class ModifyHostAliasRequestHostAliases extends TeaModel {
        @NameInMap("hostnames")
        public java.util.List<String> hostnames;

        /**
         * <strong>example:</strong>
         * <p>26.15.54.221</p>
         */
        @NameInMap("ip")
        public String ip;

        public static ModifyHostAliasRequestHostAliases build(java.util.Map<String, ?> map) throws Exception {
            ModifyHostAliasRequestHostAliases self = new ModifyHostAliasRequestHostAliases();
            return TeaModel.build(map, self);
        }

        public ModifyHostAliasRequestHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public ModifyHostAliasRequestHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
