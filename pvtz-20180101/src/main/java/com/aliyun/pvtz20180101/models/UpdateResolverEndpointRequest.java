// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverEndpointRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("IpConfig")
    public java.util.List<UpdateResolverEndpointRequestIpConfig> ipConfig;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    public static UpdateResolverEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverEndpointRequest self = new UpdateResolverEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResolverEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateResolverEndpointRequest setIpConfig(java.util.List<UpdateResolverEndpointRequestIpConfig> ipConfig) {
        this.ipConfig = ipConfig;
        return this;
    }
    public java.util.List<UpdateResolverEndpointRequestIpConfig> getIpConfig() {
        return this.ipConfig;
    }

    public UpdateResolverEndpointRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateResolverEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateResolverEndpointRequestIpConfig extends TeaModel {
        @NameInMap("AzId")
        public String azId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static UpdateResolverEndpointRequestIpConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateResolverEndpointRequestIpConfig self = new UpdateResolverEndpointRequestIpConfig();
            return TeaModel.build(map, self);
        }

        public UpdateResolverEndpointRequestIpConfig setAzId(String azId) {
            this.azId = azId;
            return this;
        }
        public String getAzId() {
            return this.azId;
        }

        public UpdateResolverEndpointRequestIpConfig setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public UpdateResolverEndpointRequestIpConfig setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public UpdateResolverEndpointRequestIpConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
