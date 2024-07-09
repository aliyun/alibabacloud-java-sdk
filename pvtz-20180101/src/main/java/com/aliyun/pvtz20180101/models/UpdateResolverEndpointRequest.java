// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverEndpointRequest extends TeaModel {
    /**
     * <p>The endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The source IP addresses of outbound traffic. You must add two to six source IP addresses to ensure high availability.</p>
     */
    @NameInMap("IpConfig")
    public java.util.List<UpdateResolverEndpointRequestIpConfig> ipConfig;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The endpoint name.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-test-name</p>
     */
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
        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("AzId")
        public String azId;

        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sjqkql</p>
         */
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
