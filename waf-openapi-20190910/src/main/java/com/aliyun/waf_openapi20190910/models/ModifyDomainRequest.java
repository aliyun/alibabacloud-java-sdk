// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyDomainRequest extends TeaModel {
    /**
     * <p>The method that WAF uses to obtain the actual IP address of a client. Valid values:</p>
     * <br>
     * <p>*   **0**: WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client. This is the default value.</p>
     * <p>*   **1**: WAF reads the value of a custom header field as the actual IP address of the client.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the **IsAccessProduct** parameter is set to **1**.</p>
     */
    @NameInMap("AccessHeaderMode")
    public Integer accessHeaderMode;

    /**
     * <p>The custom header fields that are used to obtain the actual IP address of a client. Specify the value in the `["header1","header2",...]` format.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the **AccessHeaderMode** parameter is set to **1**.</p>
     */
    @NameInMap("AccessHeaders")
    public String accessHeaders;

    /**
     * <p>The mode that is used to add the domain name. Valid values:</p>
     * <br>
     * <p>*   **waf-cloud-dns**: CNAME record mode. This is the default value.</p>
     * <p>*   **waf-cloud-native**: transparent proxy mode.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The list of server and port configurations for the transparent proxy mode. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>*   **ProtocolPortConfigs**: the list of protocol and port configurations. This field is required. Data type: array. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>    *   **Ports**: the list of ports. This field is required. Data type: array. The value is in the `[port1,port2,……]` format.</p>
     * <p>    *   **Protocol**: the protocol. This field is required. Data type: string. Valid values: **http** and **https**.</p>
     * <br>
     * <p>*   **CloudNativeProductName**: the type of the cloud service instance. This field is required. Data type: string. Valid values: **ECS**, **SLB**, and **ALB**.</p>
     * <br>
     * <p>*   **RedirectionTypeName**: the type of traffic redirection port. This field is required. Data type: string. Valid values: **ECS**, **SLB-L4**, **SLB-L7**, and **ALB**.</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the cloud service instance. This field is required. Data type: string.</p>
     * <br>
     * <p>*   **IPAddressList**: the list of public IP addresses of the cloud service instance. This field is required. Data type: array. The value is in the `["ip1","ip2",...]` format.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-native**.</p>
     */
    @NameInMap("CloudNativeInstances")
    public String cloudNativeInstances;

    /**
     * <p>The type of WAF protection cluster. Valid values:</p>
     * <br>
     * <p>*   **0**: shared cluster. This is the default value.</p>
     * <p>*   **1**: exclusive cluster.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The timeout period for connections of WAF exclusive clusters. Unit: seconds.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.</p>
     */
    @NameInMap("ConnectionTime")
    public Integer connectionTime;

    /**
     * <p>The domain name whose configurations you want to modify.</p>
     * <br>
     * <p>>  You can call the [DescribeDomainNames](https://help.aliyun.com/document_detail/86373.html) operation to query the domain names that are added to Web Application Firewall (WAF).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The HTTP/2 ports. Specify the value in the `["port1","port2",...]` format.</p>
     * <br>
     * <p>>  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.</p>
     */
    @NameInMap("Http2Port")
    public String http2Port;

    /**
     * <p>The HTTP ports. Specify the value in the `["port1","port2",...]` format.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**. If you specify this parameter, your website uses HTTP. You must specify at least one of the **HttpPort** and **HttpsPort** parameters.</p>
     */
    @NameInMap("HttpPort")
    public String httpPort;

    /**
     * <p>Specifies whether to enable the feature of redirecting HTTPS requests to HTTP requests. If you enable the feature, HTTPS requests are redirected to HTTP requests on port 80, which is used by default. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the feature. This is the default value.</p>
     * <p>*   **1**: enables the feature.</p>
     * <br>
     * <p>>  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.</p>
     */
    @NameInMap("HttpToUserIp")
    public Integer httpToUserIp;

    /**
     * <p>The HTTPS ports. Specify the value in the `["port1","port2",...]` format.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**. If you specify this parameter, your website uses HTTPS. You must specify at least one of the **HttpPort** and **HttpsPort** parameters.</p>
     */
    @NameInMap("HttpsPort")
    public String httpsPort;

    /**
     * <p>Specifies whether to enable the feature of redirecting HTTP requests to HTTPS requests. If you enable the feature, HTTP requests are redirected to HTTPS requests on port 443, which is used by default. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the feature. This is the default value.</p>
     * <p>*   **1**: enables the feature.</p>
     * <br>
     * <p>>  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.</p>
     */
    @NameInMap("HttpsRedirect")
    public Integer httpsRedirect;

    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceInfo](https://help.aliyun.com/document_detail/140857.html) operation to query the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable the feature of forwarding requests to the origin servers that use the IP address type specified in the requests. If you enable the feature, WAF forwards requests from IPv4 addresses to origin servers that use IPv4 addresses and requests from IPv6 addresses to origin servers that use IPv6 addresses. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the feature. This is the default value.</p>
     * <p>*   **1**: enables the feature.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.</p>
     */
    @NameInMap("IpFollowStatus")
    public Integer ipFollowStatus;

    /**
     * <p>Specifies whether to deploy a Layer 7 proxy, which is used to filter inbound traffic before the traffic reaches the WAF instance. The supported Layer 7 proxies include Anti-DDoS Pro, Anti-DDoS Premium, and Alibaba Cloud CDN. Valid values:</p>
     * <br>
     * <p>*   **0**: does not configure a Layer 7 proxy</p>
     * <p>*   **1**: configures a Layer 7 proxy</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IsAccessProduct")
    public Integer isAccessProduct;

    @NameInMap("Keepalive")
    public Boolean keepalive;

    @NameInMap("KeepaliveRequests")
    public Integer keepaliveRequests;

    @NameInMap("KeepaliveTimeout")
    public Integer keepaliveTimeout;

    /**
     * <p>The load balancing algorithm that is used when WAF forwards requests to the origin server. Valid values:</p>
     * <br>
     * <p>*   **0**: IP hash</p>
     * <p>*   **1**: round-robin</p>
     * <p>*   **2**: least time</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.</p>
     */
    @NameInMap("LoadBalancing")
    public Integer loadBalancing;

    /**
     * <p>The key-value pair that is used to mark the requests that pass through the WAF instance.</p>
     * <br>
     * <p>Specify the key-value pair in the `[{"k":"_key_","v":"_value_"}]` format. `_key_` specifies a header field in a custom request. `_value_` specifies the value of the field.</p>
     * <br>
     * <p>WAF automatically adds the key-value pair to the headers of requests. This way, the requests that pass through WAF are identified.</p>
     * <br>
     * <p>>  If requests contain the custom header field, WAF overwrites the original value of the field with the specified value.</p>
     */
    @NameInMap("LogHeaders")
    public String logHeaders;

    /**
     * <p>The timeout period for read connections of WAF exclusive clusters. Unit: seconds.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.</p>
     */
    @NameInMap("ReadTime")
    public Integer readTime;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Retry")
    public Boolean retry;

    /**
     * <p>The value of the custom SNI field. If this parameter is not specified, the value of the **Host** field in the request header is automatically used as the value of the SNI field.</p>
     * <br>
     * <p>If you want WAF to use an SNI field whose value is different from the value of the Host field, you can specify a custom value for the SNI field.</p>
     * <br>
     * <p>>  This parameter needs to be set only when the value of the **SniStatus** parameter is set to **1**.</p>
     */
    @NameInMap("SniHost")
    public String sniHost;

    /**
     * <p>Specifies whether to enable origin SNI. Origin Server Name Indication (SNI) specifies the domain name to which an HTTPS connection needs to be established at the start of the TLS handshaking process when WAF forwards requests to the origin server. If the origin server hosts multiple domain names, you must enable this feature. Valid values:</p>
     * <br>
     * <p>*   **0**: disables origin SNI.</p>
     * <p>*   **1**: enables origin SNI.</p>
     * <br>
     * <p>By default, origin SNI is disabled for WAF instances in the Chinese mainland and enabled for WAF instances outside the Chinese mainland.</p>
     * <br>
     * <p>>  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.</p>
     */
    @NameInMap("SniStatus")
    public Integer sniStatus;

    /**
     * <p>The address type of the origin server. The address can be an IP address or a domain name. You can specify only one type of address.</p>
     * <br>
     * <p>*   If you use the IP address type, specify the value in the `["ip1","ip2",...]` format. You can add up to 20 IP addresses.</p>
     * <p>*   If you use the domain name type, specify the value in the `["domain"]` format. You can enter only one domain name.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.</p>
     */
    @NameInMap("SourceIps")
    public String sourceIps;

    /**
     * <p>The timeout period for write connections of WAF exclusive clusters. Unit: seconds.</p>
     * <br>
     * <p>>  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.</p>
     */
    @NameInMap("WriteTime")
    public Integer writeTime;

    public static ModifyDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainRequest self = new ModifyDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainRequest setAccessHeaderMode(Integer accessHeaderMode) {
        this.accessHeaderMode = accessHeaderMode;
        return this;
    }
    public Integer getAccessHeaderMode() {
        return this.accessHeaderMode;
    }

    public ModifyDomainRequest setAccessHeaders(String accessHeaders) {
        this.accessHeaders = accessHeaders;
        return this;
    }
    public String getAccessHeaders() {
        return this.accessHeaders;
    }

    public ModifyDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ModifyDomainRequest setCloudNativeInstances(String cloudNativeInstances) {
        this.cloudNativeInstances = cloudNativeInstances;
        return this;
    }
    public String getCloudNativeInstances() {
        return this.cloudNativeInstances;
    }

    public ModifyDomainRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public ModifyDomainRequest setConnectionTime(Integer connectionTime) {
        this.connectionTime = connectionTime;
        return this;
    }
    public Integer getConnectionTime() {
        return this.connectionTime;
    }

    public ModifyDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainRequest setHttp2Port(String http2Port) {
        this.http2Port = http2Port;
        return this;
    }
    public String getHttp2Port() {
        return this.http2Port;
    }

    public ModifyDomainRequest setHttpPort(String httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public String getHttpPort() {
        return this.httpPort;
    }

    public ModifyDomainRequest setHttpToUserIp(Integer httpToUserIp) {
        this.httpToUserIp = httpToUserIp;
        return this;
    }
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    public ModifyDomainRequest setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public String getHttpsPort() {
        return this.httpsPort;
    }

    public ModifyDomainRequest setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public ModifyDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainRequest setIpFollowStatus(Integer ipFollowStatus) {
        this.ipFollowStatus = ipFollowStatus;
        return this;
    }
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

    public ModifyDomainRequest setIsAccessProduct(Integer isAccessProduct) {
        this.isAccessProduct = isAccessProduct;
        return this;
    }
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    public ModifyDomainRequest setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
        return this;
    }
    public Boolean getKeepalive() {
        return this.keepalive;
    }

    public ModifyDomainRequest setKeepaliveRequests(Integer keepaliveRequests) {
        this.keepaliveRequests = keepaliveRequests;
        return this;
    }
    public Integer getKeepaliveRequests() {
        return this.keepaliveRequests;
    }

    public ModifyDomainRequest setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }
    public Integer getKeepaliveTimeout() {
        return this.keepaliveTimeout;
    }

    public ModifyDomainRequest setLoadBalancing(Integer loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    public ModifyDomainRequest setLogHeaders(String logHeaders) {
        this.logHeaders = logHeaders;
        return this;
    }
    public String getLogHeaders() {
        return this.logHeaders;
    }

    public ModifyDomainRequest setReadTime(Integer readTime) {
        this.readTime = readTime;
        return this;
    }
    public Integer getReadTime() {
        return this.readTime;
    }

    public ModifyDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDomainRequest setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public ModifyDomainRequest setSniHost(String sniHost) {
        this.sniHost = sniHost;
        return this;
    }
    public String getSniHost() {
        return this.sniHost;
    }

    public ModifyDomainRequest setSniStatus(Integer sniStatus) {
        this.sniStatus = sniStatus;
        return this;
    }
    public Integer getSniStatus() {
        return this.sniStatus;
    }

    public ModifyDomainRequest setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }
    public String getSourceIps() {
        return this.sourceIps;
    }

    public ModifyDomainRequest setWriteTime(Integer writeTime) {
        this.writeTime = writeTime;
        return this;
    }
    public Integer getWriteTime() {
        return this.writeTime;
    }

}
