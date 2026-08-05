// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskLogRequest extends TeaModel {
    /**
     * <p>The network configuration for enabling or disabling network access.</p>
     */
    @NameInMap("network")
    public ModifyOfflineTaskLogRequestNetwork network;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ModifyOfflineTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskLogRequest self = new ModifyOfflineTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskLogRequest setNetwork(ModifyOfflineTaskLogRequestNetwork network) {
        this.network = network;
        return this;
    }
    public ModifyOfflineTaskLogRequestNetwork getNetwork() {
        return this.network;
    }

    public ModifyOfflineTaskLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup extends TeaModel {
        /**
         * <p>The name of the IP whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The IP whitelist.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        public static ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup self = new ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class ModifyOfflineTaskLogRequestNetworkPrivateEs extends TeaModel {
        /**
         * <p>Specifies whether to enable or disable private network access.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The IP whitelist groups.</p>
         */
        @NameInMap("whiteIpGroup")
        public java.util.List<ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup> whiteIpGroup;

        public static ModifyOfflineTaskLogRequestNetworkPrivateEs build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskLogRequestNetworkPrivateEs self = new ModifyOfflineTaskLogRequestNetworkPrivateEs();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskLogRequestNetworkPrivateEs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyOfflineTaskLogRequestNetworkPrivateEs setWhiteIpGroup(java.util.List<ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<ModifyOfflineTaskLogRequestNetworkPrivateEsWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup extends TeaModel {
        /**
         * <p><strong>The name of the IP whitelist group.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>kevintest</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p><strong>The IP whitelist.</strong></p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        public static ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup self = new ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class ModifyOfflineTaskLogRequestNetworkPublicEs extends TeaModel {
        /**
         * <p><strong>Specifies whether to enable or disable public network access.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p><strong>The IP whitelist group information.</strong></p>
         */
        @NameInMap("whiteIpGroup")
        public java.util.List<ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup> whiteIpGroup;

        public static ModifyOfflineTaskLogRequestNetworkPublicEs build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskLogRequestNetworkPublicEs self = new ModifyOfflineTaskLogRequestNetworkPublicEs();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskLogRequestNetworkPublicEs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyOfflineTaskLogRequestNetworkPublicEs setWhiteIpGroup(java.util.List<ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<ModifyOfflineTaskLogRequestNetworkPublicEsWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class ModifyOfflineTaskLogRequestNetwork extends TeaModel {
        /**
         * <p>The ES private network information.</p>
         */
        @NameInMap("privateEs")
        public ModifyOfflineTaskLogRequestNetworkPrivateEs privateEs;

        /**
         * <p><strong>The ES public network information.</strong></p>
         */
        @NameInMap("publicEs")
        public ModifyOfflineTaskLogRequestNetworkPublicEs publicEs;

        public static ModifyOfflineTaskLogRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskLogRequestNetwork self = new ModifyOfflineTaskLogRequestNetwork();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskLogRequestNetwork setPrivateEs(ModifyOfflineTaskLogRequestNetworkPrivateEs privateEs) {
            this.privateEs = privateEs;
            return this;
        }
        public ModifyOfflineTaskLogRequestNetworkPrivateEs getPrivateEs() {
            return this.privateEs;
        }

        public ModifyOfflineTaskLogRequestNetwork setPublicEs(ModifyOfflineTaskLogRequestNetworkPublicEs publicEs) {
            this.publicEs = publicEs;
            return this;
        }
        public ModifyOfflineTaskLogRequestNetworkPublicEs getPublicEs() {
            return this.publicEs;
        }

    }

}
