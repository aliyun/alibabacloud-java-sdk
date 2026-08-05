// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetOfflineTaskLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1-2-3-4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetOfflineTaskLogResponseBodyResult result;

    public static GetOfflineTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfflineTaskLogResponseBody self = new GetOfflineTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfflineTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfflineTaskLogResponseBody setResult(GetOfflineTaskLogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOfflineTaskLogResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup extends TeaModel {
        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The list of IP addresses in the whitelist group.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        public static GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup self = new GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetOfflineTaskLogResponseBodyResultNetworkPrivateEs extends TeaModel {
        /**
         * <p>The domain name of the private ES.</p>
         * 
         * <strong>example:</strong>
         * <p>test.private.cn-hangzhou.log.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>Indicates whether private ES is enabled.</p>
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
        public java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup> whiteIpGroup;

        public static GetOfflineTaskLogResponseBodyResultNetworkPrivateEs build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResultNetworkPrivateEs self = new GetOfflineTaskLogResponseBodyResultNetworkPrivateEs();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEs setWhiteIpGroup(java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPrivateEsWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup extends TeaModel {
        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The list of IP addresses in the whitelist group.</p>
         */
        @NameInMap("ips")
        public java.util.List<String> ips;

        public static GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup self = new GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetOfflineTaskLogResponseBodyResultNetworkPublicEs extends TeaModel {
        /**
         * <p>The public domain name of ES.</p>
         * 
         * <strong>example:</strong>
         * <p>test.public.cn-hangzhou.log.elasticsearch.aliyuncs.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>Indicates whether public ES is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The IP whitelist groups.</p>
         */
        @NameInMap("whiteIpGroup")
        public java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup> whiteIpGroup;

        public static GetOfflineTaskLogResponseBodyResultNetworkPublicEs build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResultNetworkPublicEs self = new GetOfflineTaskLogResponseBodyResultNetworkPublicEs();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPublicEs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPublicEs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetOfflineTaskLogResponseBodyResultNetworkPublicEs setWhiteIpGroup(java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup> whiteIpGroup) {
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }
        public java.util.List<GetOfflineTaskLogResponseBodyResultNetworkPublicEsWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

    }

    public static class GetOfflineTaskLogResponseBodyResultNetwork extends TeaModel {
        /**
         * <p>The private ES information.</p>
         */
        @NameInMap("privateEs")
        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEs privateEs;

        /**
         * <p>The public ES information.</p>
         */
        @NameInMap("publicEs")
        public GetOfflineTaskLogResponseBodyResultNetworkPublicEs publicEs;

        public static GetOfflineTaskLogResponseBodyResultNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResultNetwork self = new GetOfflineTaskLogResponseBodyResultNetwork();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResultNetwork setPrivateEs(GetOfflineTaskLogResponseBodyResultNetworkPrivateEs privateEs) {
            this.privateEs = privateEs;
            return this;
        }
        public GetOfflineTaskLogResponseBodyResultNetworkPrivateEs getPrivateEs() {
            return this.privateEs;
        }

        public GetOfflineTaskLogResponseBodyResultNetwork setPublicEs(GetOfflineTaskLogResponseBodyResultNetworkPublicEs publicEs) {
            this.publicEs = publicEs;
            return this;
        }
        public GetOfflineTaskLogResponseBodyResultNetworkPublicEs getPublicEs() {
            return this.publicEs;
        }

    }

    public static class GetOfflineTaskLogResponseBodyResult extends TeaModel {
        /**
         * <p>The network information.</p>
         */
        @NameInMap("network")
        public GetOfflineTaskLogResponseBodyResultNetwork network;

        public static GetOfflineTaskLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskLogResponseBodyResult self = new GetOfflineTaskLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskLogResponseBodyResult setNetwork(GetOfflineTaskLogResponseBodyResultNetwork network) {
            this.network = network;
            return this;
        }
        public GetOfflineTaskLogResponseBodyResultNetwork getNetwork() {
            return this.network;
        }

    }

}
