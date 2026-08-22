// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchConnectionInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchConnectionInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchConnectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchConnectionInfoResponseBody self = new DescribeOpenSearchConnectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchConnectionInfoResponseBody setAccessDeniedDetail(DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchConnectionInfoResponseBody setData(DescribeOpenSearchConnectionInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchConnectionInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchConnectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The description is the same as above.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>NoPermissionType</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail self = new DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint extends TeaModel {
        /**
         * <p>Specifies whether static frame check is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The host address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.118.102.0/24</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg">https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint self = new DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint extends TeaModel {
        /**
         * <p>The service activation status. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Activated.</li>
         * <li><strong>off</strong>: Not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The hostname. Retrieves data under the specified host.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com">https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg">https://static.yipigai.cn/timuocr/tmp_c29e30497575a40193a24a7a83654e30e21b951cc6856cdb.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint self = new DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint extends TeaModel {
        /**
         * <p>Specifies whether to enable the echo feature. This parameter is required. Valid values: true/false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The OSS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>100.118.214.0/24</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint self = new DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint extends TeaModel {
        /**
         * <p>Specifies whether to enable dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The machine.</p>
         * 
         * <strong>example:</strong>
         * <p>100.98.83.0/24</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint self = new DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeOpenSearchConnectionInfoResponseBodyData extends TeaModel {
        /**
         * <p>The internal endpoint of the OpenSearch Dashboard.</p>
         */
        @NameInMap("DashboardEndpoint")
        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint dashboardEndpoint;

        /**
         * <p>The public network access endpoint of the OpenSearch Dashboard.</p>
         */
        @NameInMap("DashboardPublicEndpoint")
        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint dashboardPublicEndpoint;

        /**
         * <p>The default account name of OpenSearch.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("DefaultUsername")
        public String defaultUsername;

        /**
         * <p>The VPC endpoint of the instance.</p>
         */
        @NameInMap("PrivateEndpoint")
        public DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint privateEndpoint;

        /**
         * <p>The protocol of the monitoring task. Valid values:</p>
         * <ul>
         * <li><strong>ICMP</strong>.</li>
         * <li><strong>TCP</strong>.</li>
         * <li><strong>HTTP</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>Private network monitoring supports only the ICMP and TCP protocols.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The public endpoint of the instance.</p>
         */
        @NameInMap("PublicEndpoint")
        public DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint publicEndpoint;

        public static DescribeOpenSearchConnectionInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchConnectionInfoResponseBodyData self = new DescribeOpenSearchConnectionInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setDashboardEndpoint(DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint dashboardEndpoint) {
            this.dashboardEndpoint = dashboardEndpoint;
            return this;
        }
        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardEndpoint getDashboardEndpoint() {
            return this.dashboardEndpoint;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setDashboardPublicEndpoint(DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint dashboardPublicEndpoint) {
            this.dashboardPublicEndpoint = dashboardPublicEndpoint;
            return this;
        }
        public DescribeOpenSearchConnectionInfoResponseBodyDataDashboardPublicEndpoint getDashboardPublicEndpoint() {
            return this.dashboardPublicEndpoint;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setDefaultUsername(String defaultUsername) {
            this.defaultUsername = defaultUsername;
            return this;
        }
        public String getDefaultUsername() {
            return this.defaultUsername;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setPrivateEndpoint(DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public DescribeOpenSearchConnectionInfoResponseBodyDataPrivateEndpoint getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeOpenSearchConnectionInfoResponseBodyData setPublicEndpoint(DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public DescribeOpenSearchConnectionInfoResponseBodyDataPublicEndpoint getPublicEndpoint() {
            return this.publicEndpoint;
        }

    }

}
