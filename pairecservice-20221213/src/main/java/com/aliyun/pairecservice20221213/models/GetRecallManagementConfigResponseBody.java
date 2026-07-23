// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementConfigResponseBody extends TeaModel {
    /**
     * <p>The network configuration information.</p>
     */
    @NameInMap("NetworkConfigs")
    public java.util.List<GetRecallManagementConfigResponseBodyNetworkConfigs> networkConfigs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>scene_test</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetRecallManagementConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementConfigResponseBody self = new GetRecallManagementConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementConfigResponseBody setNetworkConfigs(java.util.List<GetRecallManagementConfigResponseBodyNetworkConfigs> networkConfigs) {
        this.networkConfigs = networkConfigs;
        return this;
    }
    public java.util.List<GetRecallManagementConfigResponseBodyNetworkConfigs> getNetworkConfigs() {
        return this.networkConfigs;
    }

    public GetRecallManagementConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecallManagementConfigResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class GetRecallManagementConfigResponseBodyNetworkConfigs extends TeaModel {
        /**
         * <p>The private endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("PrivateLinkAddress")
        public String privateLinkAddress;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The network connectivity status. Valid values:</p>
         * <ul>
         * <li><p>Connecting: connecting.</p>
         * </li>
         * <li><p>Connected: connected.</p>
         * </li>
         * <li><p>ConnectionFailed: connection failed.</p>
         * </li>
         * <li><p>Updating: updating.</p>
         * </li>
         * <li><p>UpdateFailed: update failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connecting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The public network connection token.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zones.</p>
         */
        @NameInMap("VswitchIds")
        public java.util.Map<String, String> vswitchIds;

        public static GetRecallManagementConfigResponseBodyNetworkConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementConfigResponseBodyNetworkConfigs self = new GetRecallManagementConfigResponseBodyNetworkConfigs();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setPrivateLinkAddress(String privateLinkAddress) {
            this.privateLinkAddress = privateLinkAddress;
            return this;
        }
        public String getPrivateLinkAddress() {
            return this.privateLinkAddress;
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetRecallManagementConfigResponseBodyNetworkConfigs setVswitchIds(java.util.Map<String, String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.Map<String, String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
