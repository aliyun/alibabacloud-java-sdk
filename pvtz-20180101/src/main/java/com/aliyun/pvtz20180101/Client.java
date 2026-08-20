// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101;

import com.aliyun.tea.*;
import com.aliyun.pvtz20180101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "pvtz.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pvtz.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pvtz.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pvtz.aliyuncs.com"),
            new TeaPair("eu-west-1", "pvtz.aliyuncs.com"),
            new TeaPair("us-east-1", "pvtz.aliyuncs.com"),
            new TeaPair("us-west-1", "pvtz.aliyuncs.com"),
            new TeaPair("ap-south-1", "pvtz.aliyuncs.com"),
            new TeaPair("me-east-1", "pvtz.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "pvtz.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "pvtz.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "pvtz.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pvtz.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "pvtz.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pvtz", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom line.</p>
     * 
     * @param request AddCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomLineResponse
     */
    public AddCustomLineResponse addCustomLineWithOptions(AddCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsCategory)) {
            query.put("DnsCategory", request.dnsCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4s)) {
            query.put("Ipv4s", request.ipv4s);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareScope)) {
            query.put("ShareScope", request.shareScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomLine"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom line.</p>
     * 
     * @param request AddCustomLineRequest
     * @return AddCustomLineResponse
     */
    public AddCustomLineResponse addCustomLine(AddCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to add an endpoint.</p>
     * 
     * @param request AddResolverEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddResolverEndpointResponse
     */
    public AddResolverEndpointResponse addResolverEndpointWithOptions(AddResolverEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipConfig)) {
            query.put("IpConfig", request.ipConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegionId)) {
            query.put("VpcRegionId", request.vpcRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddResolverEndpoint"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddResolverEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to add an endpoint.</p>
     * 
     * @param request AddResolverEndpointRequest
     * @return AddResolverEndpointResponse
     */
    public AddResolverEndpointResponse addResolverEndpoint(AddResolverEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addResolverEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the outbound VPC and the inbound VPC are the same, the IP address of the external DNS system in the forwarding rule for the outbound endpoint cannot be the same as the IP address of the inbound endpoint service. This is because if the IP addresses are the same, a request loopback occurs and DNS resolution fails.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a forwarding rule.</p>
     * 
     * @param request AddResolverRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddResolverRuleResponse
     */
    public AddResolverRuleResponse addResolverRuleWithOptions(AddResolverRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edgeDnsClusters)) {
            query.put("EdgeDnsClusters", request.edgeDnsClusters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardIp)) {
            query.put("ForwardIp", request.forwardIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcs)) {
            query.put("Vpcs", request.vpcs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddResolverRule"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddResolverRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the outbound VPC and the inbound VPC are the same, the IP address of the external DNS system in the forwarding rule for the outbound endpoint cannot be the same as the IP address of the inbound endpoint service. This is because if the IP addresses are the same, a request loopback occurs and DNS resolution fails.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a forwarding rule.</p>
     * 
     * @param request AddResolverRuleRequest
     * @return AddResolverRuleResponse
     */
    public AddResolverRuleResponse addResolverRule(AddResolverRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addResolverRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <ul>
     * <li>Cross-account settings for the effective scope only support Alibaba Cloud accounts (primary accounts) and do not support RAM users. Only accounts within the same site can be associated, such as between Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>) accounts or between Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>) accounts. Cross-site association is not supported, such as between a China Website account and an International Website account.</li>
     * <li>For scenarios that use authentication code authorization, no API is currently available for sending authentication codes.</li>
     * </ul>
     * <h4><strong>Precautions</strong></h4>
     * <p>When you configure cross-account settings for the effective scope, billing is settled under the account that manages the built-in authoritative domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds cross-account VPC authorization.</p>
     * 
     * @param request AddUserVpcAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserVpcAuthorizationResponse
     */
    public AddUserVpcAuthorizationResponse addUserVpcAuthorizationWithOptions(AddUserVpcAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authChannel)) {
            query.put("AuthChannel", request.authChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserId)) {
            query.put("AuthorizedUserId", request.authorizedUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserVpcAuthorization"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserVpcAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <ul>
     * <li>Cross-account settings for the effective scope only support Alibaba Cloud accounts (primary accounts) and do not support RAM users. Only accounts within the same site can be associated, such as between Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>) accounts or between Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>) accounts. Cross-site association is not supported, such as between a China Website account and an International Website account.</li>
     * <li>For scenarios that use authentication code authorization, no API is currently available for sending authentication codes.</li>
     * </ul>
     * <h4><strong>Precautions</strong></h4>
     * <p>When you configure cross-account settings for the effective scope, billing is settled under the account that manages the built-in authoritative domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds cross-account VPC authorization.</p>
     * 
     * @param request AddUserVpcAuthorizationRequest
     * @return AddUserVpcAuthorizationResponse
     */
    public AddUserVpcAuthorizationResponse addUserVpcAuthorization(AddUserVpcAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserVpcAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Starting from April 30, 2025 (UTC+8), zones added by new users of Alibaba Cloud DNS PrivateZone are set as accelerated zones by default. Starting from &lt;props=&quot;china&quot;&gt;October 30, 2025 (UTC+8)&lt;props=&quot;intl&quot;&gt;April 30, 2026 (UTC+8), all built-in authoritative standard zones will be automatically switched to accelerated zones. After the switch, the number of DNS queries may increase, which can increase your costs. To reduce the increase in DNS queries caused by the absence of a local cache, <a href="https://help.aliyun.com/document_detail/2592999.html">enable NSCD for your ECS instances</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the AddZone operation to create a built-in authoritative zone. The built-in authoritative zone can be a standard zone or an accelerated zone.</p>
     * 
     * @param request AddZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddZoneResponse
     */
    public AddZoneResponse addZoneWithOptions(AddZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsGroup)) {
            query.put("DnsGroup", request.dnsGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPattern)) {
            query.put("ProxyPattern", request.proxyPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneTag)) {
            query.put("ZoneTag", request.zoneTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneType)) {
            query.put("ZoneType", request.zoneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddZone"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddZoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Starting from April 30, 2025 (UTC+8), zones added by new users of Alibaba Cloud DNS PrivateZone are set as accelerated zones by default. Starting from &lt;props=&quot;china&quot;&gt;October 30, 2025 (UTC+8)&lt;props=&quot;intl&quot;&gt;April 30, 2026 (UTC+8), all built-in authoritative standard zones will be automatically switched to accelerated zones. After the switch, the number of DNS queries may increase, which can increase your costs. To reduce the increase in DNS queries caused by the absence of a local cache, <a href="https://help.aliyun.com/document_detail/2592999.html">enable NSCD for your ECS instances</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the AddZone operation to create a built-in authoritative zone. The built-in authoritative zone can be a standard zone or an accelerated zone.</p>
     * 
     * @param request AddZoneRequest
     * @return AddZoneResponse
     */
    public AddZoneResponse addZone(AddZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the AddZoneRecord operation to add a DNS record to an authoritative zone. Within the effective scope of the zone, the internal DNS record for a domain name overwrites its public DNS record.</p>
     * 
     * @param request AddZoneRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddZoneRecordResponse
     */
    public AddZoneRecordResponse addZoneRecordWithOptions(AddZoneRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddZoneRecord"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddZoneRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the AddZoneRecord operation to add a DNS record to an authoritative zone. Within the effective scope of the zone, the internal DNS record for a domain name overwrites its public DNS record.</p>
     * 
     * @param request AddZoneRecordRequest
     * @return AddZoneRecordResponse
     */
    public AddZoneRecordResponse addZoneRecord(AddZoneRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addZoneRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation performs a full replacement. Any existing VPC associations not included in your request will be removed. To add a new VPC, you must include the IDs of all VPCs that should remain associated.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The BindResolverRuleVpc operation associates a forwarding rule with a virtual private cloud (VPC).</p>
     * 
     * @param request BindResolverRuleVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindResolverRuleVpcResponse
     */
    public BindResolverRuleVpcResponse bindResolverRuleVpcWithOptions(BindResolverRuleVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpc)) {
            query.put("Vpc", request.vpc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindResolverRuleVpc"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindResolverRuleVpcResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation performs a full replacement. Any existing VPC associations not included in your request will be removed. To add a new VPC, you must include the IDs of all VPCs that should remain associated.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The BindResolverRuleVpc operation associates a forwarding rule with a virtual private cloud (VPC).</p>
     * 
     * @param request BindResolverRuleVpcRequest
     * @return BindResolverRuleVpcResponse
     */
    public BindResolverRuleVpcResponse bindResolverRuleVpc(BindResolverRuleVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindResolverRuleVpcWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h5>Notes</h5>
     * <p>We recommend binding VPCs to a Zone only after you configure all its DNS records. Otherwise, DNS queries for the domain name in the specified VPCs may fail. This issue does not occur if the subdomain recursive resolution proxy feature is enabled.</p>
     * <blockquote>
     * <p>Notice: This API operation performs a full overwrite. The list of VPCs provided in a request replaces all existing associated VPCs. To add a VPC, you must include the IDs of the new VPC and all existing VPCs that you want to retain.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Binds a Zone to, or unbinds it from, one or more VPCs to define its effective scope.</p>
     * 
     * @param request BindZoneVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindZoneVpcResponse
     */
    public BindZoneVpcResponse bindZoneVpcWithOptions(BindZoneVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcs)) {
            query.put("Vpcs", request.vpcs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindZoneVpc"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindZoneVpcResponse());
    }

    /**
     * <b>description</b> :
     * <h5>Notes</h5>
     * <p>We recommend binding VPCs to a Zone only after you configure all its DNS records. Otherwise, DNS queries for the domain name in the specified VPCs may fail. This issue does not occur if the subdomain recursive resolution proxy feature is enabled.</p>
     * <blockquote>
     * <p>Notice: This API operation performs a full overwrite. The list of VPCs provided in a request replaces all existing associated VPCs. To add a VPC, you must include the IDs of the new VPC and all existing VPCs that you want to retain.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Binds a Zone to, or unbinds it from, one or more VPCs to define its effective scope.</p>
     * 
     * @param request BindZoneVpcRequest
     * @return BindZoneVpcResponse
     */
    public BindZoneVpcResponse bindZoneVpc(BindZoneVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindZoneVpcWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Starting April 30, 2025 (UTC+8), zones added by new Alibaba Cloud DNS PrivateZone users will be set to acceleration zones by default. &lt;props=&quot;china&quot;&gt;Starting October 30, 2025 (UTC+8)&lt;props=&quot;intl&quot;&gt;Starting April 30, 2026 (UTC+8), built-in authoritative zones in the standard zone group for all users will be automatically switched to the acceleration zone group. After the switch, the number of DNS requests may increase, which can result in higher usage costs. You can enable <a href="https://help.aliyun.com/document_detail/2592999.html">NSCD for ECS</a> to reduce the increase in DNS requests caused by the lack of a local cache.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the location of a ZONE.</p>
     * 
     * @param request ChangeZoneDnsGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeZoneDnsGroupResponse
     */
    public ChangeZoneDnsGroupResponse changeZoneDnsGroupWithOptions(ChangeZoneDnsGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsGroup)) {
            query.put("DnsGroup", request.dnsGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeZoneDnsGroup"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeZoneDnsGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Starting April 30, 2025 (UTC+8), zones added by new Alibaba Cloud DNS PrivateZone users will be set to acceleration zones by default. &lt;props=&quot;china&quot;&gt;Starting October 30, 2025 (UTC+8)&lt;props=&quot;intl&quot;&gt;Starting April 30, 2026 (UTC+8), built-in authoritative zones in the standard zone group for all users will be automatically switched to the acceleration zone group. After the switch, the number of DNS requests may increase, which can result in higher usage costs. You can enable <a href="https://help.aliyun.com/document_detail/2592999.html">NSCD for ECS</a> to reduce the increase in DNS requests caused by the lack of a local cache.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the location of a ZONE.</p>
     * 
     * @param request ChangeZoneDnsGroupRequest
     * @return ChangeZoneDnsGroupResponse
     */
    public ChangeZoneDnsGroupResponse changeZoneDnsGroup(ChangeZoneDnsGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeZoneDnsGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the CheckZoneName operation to check whether a zone name is available.</p>
     * 
     * @param request CheckZoneNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckZoneNameResponse
     */
    public CheckZoneNameResponse checkZoneNameWithOptions(CheckZoneNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckZoneName"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckZoneNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the CheckZoneName operation to check whether a zone name is available.</p>
     * 
     * @param request CheckZoneNameRequest
     * @return CheckZoneNameResponse
     */
    public CheckZoneNameResponse checkZoneName(CheckZoneNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkZoneNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom line.</p>
     * 
     * @param request DeleteCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomLineResponse
     */
    public DeleteCustomLineResponse deleteCustomLineWithOptions(DeleteCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            query.put("LineId", request.lineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomLine"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom line.</p>
     * 
     * @param request DeleteCustomLineRequest
     * @return DeleteCustomLineResponse
     */
    public DeleteCustomLineResponse deleteCustomLine(DeleteCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DeleteResolverEndpoint operation to delete an endpoint by its ID.</p>
     * 
     * @param request DeleteResolverEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResolverEndpointResponse
     */
    public DeleteResolverEndpointResponse deleteResolverEndpointWithOptions(DeleteResolverEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResolverEndpoint"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResolverEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DeleteResolverEndpoint operation to delete an endpoint by its ID.</p>
     * 
     * @param request DeleteResolverEndpointRequest
     * @return DeleteResolverEndpointResponse
     */
    public DeleteResolverEndpointResponse deleteResolverEndpoint(DeleteResolverEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResolverEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a forwarding rule by its ID.</p>
     * 
     * @param request DeleteResolverRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResolverRuleResponse
     */
    public DeleteResolverRuleResponse deleteResolverRuleWithOptions(DeleteResolverRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResolverRule"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResolverRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a forwarding rule by its ID.</p>
     * 
     * @param request DeleteResolverRuleRequest
     * @return DeleteResolverRuleResponse
     */
    public DeleteResolverRuleResponse deleteResolverRule(DeleteResolverRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResolverRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cross-account authorization based on a specified account ID and authorization type.</p>
     * 
     * @param request DeleteUserVpcAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserVpcAuthorizationResponse
     */
    public DeleteUserVpcAuthorizationResponse deleteUserVpcAuthorizationWithOptions(DeleteUserVpcAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserId)) {
            query.put("AuthorizedUserId", request.authorizedUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserVpcAuthorization"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserVpcAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cross-account authorization based on a specified account ID and authorization type.</p>
     * 
     * @param request DeleteUserVpcAuthorizationRequest
     * @return DeleteUserVpcAuthorizationResponse
     */
    public DeleteUserVpcAuthorizationResponse deleteUserVpcAuthorization(DeleteUserVpcAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserVpcAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4>Notes</h4>
     * <p>You must dissociate a zone from its scope before you delete it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an idle zone (built-in authoritative domain name).</p>
     * 
     * @param request DeleteZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteZoneResponse
     */
    public DeleteZoneResponse deleteZoneWithOptions(DeleteZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteZone"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteZoneResponse());
    }

    /**
     * <b>description</b> :
     * <h4>Notes</h4>
     * <p>You must dissociate a zone from its scope before you delete it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an idle zone (built-in authoritative domain name).</p>
     * 
     * @param request DeleteZoneRequest
     * @return DeleteZoneResponse
     */
    public DeleteZoneResponse deleteZone(DeleteZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteZoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Notes</strong></h4>
     * <p>This operation is irreversible. Deleted records cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>The DeleteZoneRecord operation deletes a DNS record by its ID.</p>
     * 
     * @param request DeleteZoneRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteZoneRecordResponse
     */
    public DeleteZoneRecordResponse deleteZoneRecordWithOptions(DeleteZoneRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteZoneRecord"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteZoneRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Notes</strong></h4>
     * <p>This operation is irreversible. Deleted records cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>The DeleteZoneRecord operation deletes a DNS record by its ID.</p>
     * 
     * @param request DeleteZoneRecordRequest
     * @return DeleteZoneRecordResponse
     */
    public DeleteZoneRecordResponse deleteZoneRecord(DeleteZoneRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteZoneRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can query operation logs for a private zone generated within the last six months.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeChangeLogs operation to retrieve the operation logs for a private zone. The logs record operations related to built-in authoritative zones, cache management, forwarding management, endpoints, and DNS record queries. You can perform a fuzzy search by keywords such as behavior and content.</p>
     * 
     * @param request DescribeChangeLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChangeLogsResponse
     */
    public DescribeChangeLogsResponse describeChangeLogsWithOptions(DescribeChangeLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChangeLogs"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChangeLogsResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can query operation logs for a private zone generated within the last six months.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeChangeLogs operation to retrieve the operation logs for a private zone. The logs record operations related to built-in authoritative zones, cache management, forwarding management, endpoints, and DNS record queries. You can perform a fuzzy search by keywords such as behavior and content.</p>
     * 
     * @param request DescribeChangeLogsRequest
     * @return DescribeChangeLogsResponse
     */
    public DescribeChangeLogsResponse describeChangeLogs(DescribeChangeLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChangeLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a custom line.</p>
     * 
     * @param request DescribeCustomLineInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomLineInfoResponse
     */
    public DescribeCustomLineInfoResponse describeCustomLineInfoWithOptions(DescribeCustomLineInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            query.put("LineId", request.lineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomLineInfo"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLineInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a custom line.</p>
     * 
     * @param request DescribeCustomLineInfoRequest
     * @return DescribeCustomLineInfoResponse
     */
    public DescribeCustomLineInfoResponse describeCustomLineInfo(DescribeCustomLineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomLineInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom lines.</p>
     * 
     * @param request DescribeCustomLinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomLinesResponse
     */
    public DescribeCustomLinesResponse describeCustomLinesWithOptions(DescribeCustomLinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomLines"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom lines.</p>
     * 
     * @param request DescribeCustomLinesRequest
     * @return DescribeCustomLinesResponse
     */
    public DescribeCustomLinesResponse describeCustomLines(DescribeCustomLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomLinesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not recommended due to its low performance. To retrieve a list of zones, call the <code>DescribeZones</code> operation. To get details about a VPC in a specific zone, call <code>DescribeZoneInfo</code> and specify the <code>zoneId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of VPCs that a user can analyze.</p>
     * 
     * @param request DescribeIntranetUserCanAnalysisVpcsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIntranetUserCanAnalysisVpcsResponse
     */
    public DescribeIntranetUserCanAnalysisVpcsResponse describeIntranetUserCanAnalysisVpcsWithOptions(DescribeIntranetUserCanAnalysisVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTreeLevel)) {
            query.put("QueryTreeLevel", request.queryTreeLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcOwner)) {
            query.put("VpcOwner", request.vpcOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcType)) {
            query.put("VpcType", request.vpcType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIntranetUserCanAnalysisVpcs"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIntranetUserCanAnalysisVpcsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not recommended due to its low performance. To retrieve a list of zones, call the <code>DescribeZones</code> operation. To get details about a VPC in a specific zone, call <code>DescribeZoneInfo</code> and specify the <code>zoneId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of VPCs that a user can analyze.</p>
     * 
     * @param request DescribeIntranetUserCanAnalysisVpcsRequest
     * @return DescribeIntranetUserCanAnalysisVpcsResponse
     */
    public DescribeIntranetUserCanAnalysisVpcsResponse describeIntranetUserCanAnalysisVpcs(DescribeIntranetUserCanAnalysisVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntranetUserCanAnalysisVpcsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Usage notes</strong></h4>
     * <p>This operation queries tag information only for zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves global DNS resolution statistics for PrivateZone.</p>
     * 
     * @param request DescribePvtzStatisticsGlobalOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePvtzStatisticsGlobalOverviewResponse
     */
    public DescribePvtzStatisticsGlobalOverviewResponse describePvtzStatisticsGlobalOverviewWithOptions(DescribePvtzStatisticsGlobalOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkParams)) {
            query.put("NetworkParams", request.networkParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overviewPeriod)) {
            query.put("OverviewPeriod", request.overviewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePvtzStatisticsGlobalOverview"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePvtzStatisticsGlobalOverviewResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Usage notes</strong></h4>
     * <p>This operation queries tag information only for zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves global DNS resolution statistics for PrivateZone.</p>
     * 
     * @param request DescribePvtzStatisticsGlobalOverviewRequest
     * @return DescribePvtzStatisticsGlobalOverviewResponse
     */
    public DescribePvtzStatisticsGlobalOverviewResponse describePvtzStatisticsGlobalOverview(DescribePvtzStatisticsGlobalOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePvtzStatisticsGlobalOverviewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>Currently, you can only query tags for availability zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>PrivateZone Resolution Trends</p>
     * 
     * @param request DescribePvtzStatisticsHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePvtzStatisticsHistoryResponse
     */
    public DescribePvtzStatisticsHistoryResponse describePvtzStatisticsHistoryWithOptions(DescribePvtzStatisticsHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkParams)) {
            query.put("NetworkParams", request.networkParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rcode)) {
            query.put("Rcode", request.rcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticalType)) {
            query.put("StatisticalType", request.statisticalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePvtzStatisticsHistory"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePvtzStatisticsHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>Currently, you can only query tags for availability zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>PrivateZone Resolution Trends</p>
     * 
     * @param request DescribePvtzStatisticsHistoryRequest
     * @return DescribePvtzStatisticsHistoryResponse
     */
    public DescribePvtzStatisticsHistoryResponse describePvtzStatisticsHistory(DescribePvtzStatisticsHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePvtzStatisticsHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can only query tags for zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>PrivateZone Resolution Statistics Summary</p>
     * 
     * @param request DescribePvtzStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePvtzStatisticsSummaryResponse
     */
    public DescribePvtzStatisticsSummaryResponse describePvtzStatisticsSummaryWithOptions(DescribePvtzStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.growType)) {
            query.put("GrowType", request.growType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkParams)) {
            query.put("NetworkParams", request.networkParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rcode)) {
            query.put("Rcode", request.rcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticalType)) {
            query.put("StatisticalType", request.statisticalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePvtzStatisticsSummary"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePvtzStatisticsSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can only query tags for zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>PrivateZone Resolution Statistics Summary</p>
     * 
     * @param request DescribePvtzStatisticsSummaryRequest
     * @return DescribePvtzStatisticsSummaryResponse
     */
    public DescribePvtzStatisticsSummaryResponse describePvtzStatisticsSummary(DescribePvtzStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePvtzStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is a low-performance operation and is not recommended. To retrieve a list of zones, use the DescribeZones operation. To get details of the VPCs bound to a zone, call the DescribeZoneInfo operation and specify the zone ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides an overview of resolution statistics for zones in PrivateZone.</p>
     * 
     * @param request DescribePvtzStatisticsZoneOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePvtzStatisticsZoneOverviewResponse
     */
    public DescribePvtzStatisticsZoneOverviewResponse describePvtzStatisticsZoneOverviewWithOptions(DescribePvtzStatisticsZoneOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkParams)) {
            query.put("NetworkParams", request.networkParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overviewPeriod)) {
            query.put("OverviewPeriod", request.overviewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePvtzStatisticsZoneOverview"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePvtzStatisticsZoneOverviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is a low-performance operation and is not recommended. To retrieve a list of zones, use the DescribeZones operation. To get details of the VPCs bound to a zone, call the DescribeZoneInfo operation and specify the zone ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides an overview of resolution statistics for zones in PrivateZone.</p>
     * 
     * @param request DescribePvtzStatisticsZoneOverviewRequest
     * @return DescribePvtzStatisticsZoneOverviewResponse
     */
    public DescribePvtzStatisticsZoneOverviewResponse describePvtzStatisticsZoneOverview(DescribePvtzStatisticsZoneOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePvtzStatisticsZoneOverviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeRegions operation to query a list of available regions. You can filter the list by criteria such as the scenario and VPC type.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserId)) {
            query.put("AuthorizedUserId", request.authorizedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcType)) {
            query.put("VpcType", request.vpcType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeRegions operation to query a list of available regions. You can filter the list by criteria such as the scenario and VPC type.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about the number of requests based on conditions such as a time range.</p>
     * 
     * @param request DescribeRequestGraphRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRequestGraphResponse
     */
    public DescribeRequestGraphResponse describeRequestGraphWithOptions(DescribeRequestGraphRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRequestGraph"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRequestGraphResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about the number of requests based on conditions such as a time range.</p>
     * 
     * @param request DescribeRequestGraphRequest
     * @return DescribeRequestGraphResponse
     */
    public DescribeRequestGraphResponse describeRequestGraph(DescribeRequestGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRequestGraphWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call DescribeResolverAvailableZones to retrieve a list of available zones.</p>
     * 
     * @param request DescribeResolverAvailableZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResolverAvailableZonesResponse
     */
    public DescribeResolverAvailableZonesResponse describeResolverAvailableZonesWithOptions(DescribeResolverAvailableZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.azId)) {
            query.put("AzId", request.azId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolverRegionId)) {
            query.put("ResolverRegionId", request.resolverRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResolverAvailableZones"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResolverAvailableZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call DescribeResolverAvailableZones to retrieve a list of available zones.</p>
     * 
     * @param request DescribeResolverAvailableZonesRequest
     * @return DescribeResolverAvailableZonesResponse
     */
    public DescribeResolverAvailableZonesResponse describeResolverAvailableZones(DescribeResolverAvailableZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResolverAvailableZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeResolverEndpoint to retrieve the details of an endpoint by its ID.</p>
     * 
     * @param request DescribeResolverEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResolverEndpointResponse
     */
    public DescribeResolverEndpointResponse describeResolverEndpointWithOptions(DescribeResolverEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResolverEndpoint"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResolverEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeResolverEndpoint to retrieve the details of an endpoint by its ID.</p>
     * 
     * @param request DescribeResolverEndpointRequest
     * @return DescribeResolverEndpointResponse
     */
    public DescribeResolverEndpointResponse describeResolverEndpoint(DescribeResolverEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResolverEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeResolverEndpoints to retrieve a list of endpoints.</p>
     * 
     * @param request DescribeResolverEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResolverEndpointsResponse
     */
    public DescribeResolverEndpointsResponse describeResolverEndpointsWithOptions(DescribeResolverEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegionId)) {
            query.put("VpcRegionId", request.vpcRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResolverEndpoints"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResolverEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeResolverEndpoints to retrieve a list of endpoints.</p>
     * 
     * @param request DescribeResolverEndpointsRequest
     * @return DescribeResolverEndpointsResponse
     */
    public DescribeResolverEndpointsResponse describeResolverEndpoints(DescribeResolverEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResolverEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeResolverRule operation to retrieve the details of a forwarding rule.</p>
     * 
     * @param request DescribeResolverRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResolverRuleResponse
     */
    public DescribeResolverRuleResponse describeResolverRuleWithOptions(DescribeResolverRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResolverRule"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResolverRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeResolverRule operation to retrieve the details of a forwarding rule.</p>
     * 
     * @param request DescribeResolverRuleRequest
     * @return DescribeResolverRuleResponse
     */
    public DescribeResolverRuleResponse describeResolverRule(DescribeResolverRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResolverRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes one or more forwarding rules.</p>
     * 
     * @param request DescribeResolverRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResolverRulesResponse
     */
    public DescribeResolverRulesResponse describeResolverRulesWithOptions(DescribeResolverRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needDetailAttributes)) {
            query.put("NeedDetailAttributes", request.needDetailAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResolverRules"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResolverRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes one or more forwarding rules.</p>
     * 
     * @param request DescribeResolverRulesRequest
     * @return DescribeResolverRulesResponse
     */
    public DescribeResolverRulesResponse describeResolverRules(DescribeResolverRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResolverRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeStatisticSummary operation to retrieve a summary of yesterday\&quot;s request volume. This summary includes the top three zones and top three VPCs ranked by request volume.</p>
     * 
     * @param request DescribeStatisticSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStatisticSummaryResponse
     */
    public DescribeStatisticSummaryResponse describeStatisticSummaryWithOptions(DescribeStatisticSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStatisticSummary"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStatisticSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeStatisticSummary operation to retrieve a summary of yesterday\&quot;s request volume. This summary includes the top three zones and top three VPCs ranked by request volume.</p>
     * 
     * @param request DescribeStatisticSummaryRequest
     * @return DescribeStatisticSummaryResponse
     */
    public DescribeStatisticSummaryResponse describeStatisticSummary(DescribeStatisticSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStatisticSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call DescribeSyncEcsHostTask to retrieve the details of a hostname sync task based on a zone ID.</p>
     * 
     * @param request DescribeSyncEcsHostTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyncEcsHostTaskResponse
     */
    public DescribeSyncEcsHostTaskResponse describeSyncEcsHostTaskWithOptions(DescribeSyncEcsHostTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyncEcsHostTask"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyncEcsHostTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call DescribeSyncEcsHostTask to retrieve the details of a hostname sync task based on a zone ID.</p>
     * 
     * @param request DescribeSyncEcsHostTaskRequest
     * @return DescribeSyncEcsHostTaskResponse
     */
    public DescribeSyncEcsHostTaskResponse describeSyncEcsHostTask(DescribeSyncEcsHostTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSyncEcsHostTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can query tags for zone resources only.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in PrivateZone.</p>
     * 
     * @param request DescribeTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can query tags for zone resources only.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in PrivateZone.</p>
     * 
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service status of the current user, which indicates whether the service is activated or has overdue payments.</p>
     * 
     * @param request DescribeUserServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserServiceStatusResponse
     */
    public DescribeUserServiceStatusResponse describeUserServiceStatusWithOptions(DescribeUserServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserServiceStatus"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service status of the current user, which indicates whether the service is activated or has overdue payments.</p>
     * 
     * @param request DescribeUserServiceStatusRequest
     * @return DescribeUserServiceStatusResponse
     */
    public DescribeUserServiceStatusResponse describeUserServiceStatus(DescribeUserServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeUserVpcAuthorizations operation to retrieve a list of cross-account authorizations.</p>
     * 
     * @param request DescribeUserVpcAuthorizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserVpcAuthorizationsResponse
     */
    public DescribeUserVpcAuthorizationsResponse describeUserVpcAuthorizationsWithOptions(DescribeUserVpcAuthorizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedUserId)) {
            query.put("AuthorizedUserId", request.authorizedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserVpcAuthorizations"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserVpcAuthorizationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeUserVpcAuthorizations operation to retrieve a list of cross-account authorizations.</p>
     * 
     * @param request DescribeUserVpcAuthorizationsRequest
     * @return DescribeUserVpcAuthorizationsResponse
     */
    public DescribeUserVpcAuthorizationsResponse describeUserVpcAuthorizations(DescribeUserVpcAuthorizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserVpcAuthorizationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeZoneInfo operation to retrieve the details of a specified built-in authoritative zone. The details include the list of VPCs that are bound to the zone.</p>
     * 
     * @param request DescribeZoneInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZoneInfoResponse
     */
    public DescribeZoneInfoResponse describeZoneInfoWithOptions(DescribeZoneInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZoneInfo"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZoneInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the DescribeZoneInfo operation to retrieve the details of a specified built-in authoritative zone. The details include the list of VPCs that are bound to the zone.</p>
     * 
     * @param request DescribeZoneInfoRequest
     * @return DescribeZoneInfoResponse
     */
    public DescribeZoneInfoResponse describeZoneInfo(DescribeZoneInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZoneInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a DNS record.</p>
     * 
     * @param request DescribeZoneRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZoneRecordResponse
     */
    public DescribeZoneRecordResponse describeZoneRecordWithOptions(DescribeZoneRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZoneRecord"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZoneRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a DNS record.</p>
     * 
     * @param request DescribeZoneRecordRequest
     * @return DescribeZoneRecordResponse
     */
    public DescribeZoneRecordResponse describeZoneRecord(DescribeZoneRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZoneRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeZoneRecords to query DNS records for a zone.</p>
     * 
     * @param request DescribeZoneRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZoneRecordsResponse
     */
    public DescribeZoneRecordsResponse describeZoneRecordsWithOptions(DescribeZoneRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZoneRecords"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZoneRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call DescribeZoneRecords to query DNS records for a zone.</p>
     * 
     * @param request DescribeZoneRecordsRequest
     * @return DescribeZoneRecordsResponse
     */
    public DescribeZoneRecordsResponse describeZoneRecords(DescribeZoneRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZoneRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not recommended due to low performance. To retrieve a list of zones, call DescribeZones. To retrieve the details of attached VPCs, call DescribeZoneInfo with the zone ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeZoneVpcTree operation to query the zones and the Virtual Private Clouds (VPCs) attached to them in your account.</p>
     * 
     * @param request DescribeZoneVpcTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZoneVpcTreeResponse
     */
    public DescribeZoneVpcTreeResponse describeZoneVpcTreeWithOptions(DescribeZoneVpcTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZoneVpcTree"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZoneVpcTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not recommended due to low performance. To retrieve a list of zones, call DescribeZones. To retrieve the details of attached VPCs, call DescribeZoneInfo with the zone ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeZoneVpcTree operation to query the zones and the Virtual Private Clouds (VPCs) attached to them in your account.</p>
     * 
     * @param request DescribeZoneVpcTreeRequest
     * @return DescribeZoneVpcTreeResponse
     */
    public DescribeZoneVpcTreeResponse describeZoneVpcTree(DescribeZoneVpcTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZoneVpcTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeZones operation to query a list of zones available to your account.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRegionId)) {
            query.put("QueryRegionId", request.queryRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryVpcId)) {
            query.put("QueryVpcId", request.queryVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTag)) {
            query.put("ResourceTag", request.resourceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneTag)) {
            query.put("ZoneTag", request.zoneTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneType)) {
            query.put("ZoneType", request.zoneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeZones operation to query a list of zones available to your account.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>This operation queries tags for zone resources only.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in Private Zone.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>This operation queries tags for zone resources only.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resources in Private Zone.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4>Conditions</h4>
     * <p>This operation can be used to change the resource group of only zone-specific resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the MoveResourceGroup operation to move a resource to a different resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h4>Conditions</h4>
     * <p>This operation can be used to change the resource group of only zone-specific resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the MoveResourceGroup operation to move a resource to a different resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for custom access control lists (ACLs).</p>
     * 
     * @param request SearchCustomLinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCustomLinesResponse
     */
    public SearchCustomLinesResponse searchCustomLinesWithOptions(SearchCustomLinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimestampEnd)) {
            query.put("CreateTimestampEnd", request.createTimestampEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimestampStart)) {
            query.put("CreateTimestampStart", request.createTimestampStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4)) {
            query.put("Ipv4", request.ipv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimestampEnd)) {
            query.put("UpdateTimestampEnd", request.updateTimestampEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimestampStart)) {
            query.put("UpdateTimestampStart", request.updateTimestampStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCustomLines"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCustomLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for custom access control lists (ACLs).</p>
     * 
     * @param request SearchCustomLinesRequest
     * @return SearchCustomLinesResponse
     */
    public SearchCustomLinesResponse searchCustomLines(SearchCustomLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCustomLinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the recursive resolution proxy for subdomains.</p>
     * 
     * @param request SetProxyPatternRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetProxyPatternResponse
     */
    public SetProxyPatternResponse setProxyPatternWithOptions(SetProxyPatternRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPattern)) {
            query.put("ProxyPattern", request.proxyPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetProxyPattern"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetProxyPatternResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the recursive resolution proxy for subdomains.</p>
     * 
     * @param request SetProxyPatternRequest
     * @return SetProxyPatternResponse
     */
    public SetProxyPatternResponse setProxyPattern(SetProxyPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setProxyPatternWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4>Precautions</h4>
     * <p>Built-in authoritative domain names that have configured domain name effective scopes must first be dissociated from the domain name effective scope before they can be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the weight enabling status.</p>
     * 
     * @param request SetZoneLbaStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetZoneLbaStatusResponse
     */
    public SetZoneLbaStatusResponse setZoneLbaStatusWithOptions(SetZoneLbaStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.open)) {
            query.put("Open", request.open);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetZoneLbaStatus"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetZoneLbaStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h4>Precautions</h4>
     * <p>Built-in authoritative domain names that have configured domain name effective scopes must first be dissociated from the domain name effective scope before they can be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the weight enabling status.</p>
     * 
     * @param request SetZoneLbaStatusRequest
     * @return SetZoneLbaStatusResponse
     */
    public SetZoneLbaStatusResponse setZoneLbaStatus(SetZoneLbaStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setZoneLbaStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call SetZoneRecordStatus to set the status of a DNS record for a zone. This enables or pauses DNS resolution.</p>
     * 
     * @param request SetZoneRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetZoneRecordStatusResponse
     */
    public SetZoneRecordStatusResponse setZoneRecordStatusWithOptions(SetZoneRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetZoneRecordStatus"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetZoneRecordStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call SetZoneRecordStatus to set the status of a DNS record for a zone. This enables or pauses DNS resolution.</p>
     * 
     * @param request SetZoneRecordStatusRequest
     * @return SetZoneRecordStatusResponse
     */
    public SetZoneRecordStatusResponse setZoneRecordStatus(SetZoneRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setZoneRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h5>Limits</h5>
     * <p>You can add tags only to zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the TagResources operation to add or modify tags for one or more zones in a batch.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overWrite)) {
            query.put("OverWrite", request.overWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h5>Limits</h5>
     * <p>You can add tags only to zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the TagResources operation to add or modify tags for one or more zones in a batch.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can remove tags only from zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UntagResources operation to remove tags from one or more zones in PrivateZone.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Limits</strong></h4>
     * <p>You can remove tags only from zone resources.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UntagResources operation to remove tags from one or more zones in PrivateZone.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom line.</p>
     * 
     * @param request UpdateCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLineWithOptions(UpdateCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsCategory)) {
            query.put("DnsCategory", request.dnsCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4s)) {
            query.put("Ipv4s", request.ipv4s);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            query.put("LineId", request.lineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomLine"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom line.</p>
     * 
     * @param request UpdateCustomLineRequest
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateRecordRemark operation to modify the remarks of a DNS record based on its ID.</p>
     * 
     * @param request UpdateRecordRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordRemarkResponse
     */
    public UpdateRecordRemarkResponse updateRecordRemarkWithOptions(UpdateRecordRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordRemark"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateRecordRemark operation to modify the remarks of a DNS record based on its ID.</p>
     * 
     * @param request UpdateRecordRemarkRequest
     * @return UpdateRecordRemarkResponse
     */
    public UpdateRecordRemarkResponse updateRecordRemark(UpdateRecordRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an endpoint.</p>
     * 
     * @param request UpdateResolverEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResolverEndpointResponse
     */
    public UpdateResolverEndpointResponse updateResolverEndpointWithOptions(UpdateResolverEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipConfig)) {
            query.put("IpConfig", request.ipConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResolverEndpoint"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResolverEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an endpoint.</p>
     * 
     * @param request UpdateResolverEndpointRequest
     * @return UpdateResolverEndpointResponse
     */
    public UpdateResolverEndpointResponse updateResolverEndpoint(UpdateResolverEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResolverEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a forwarding rule.</p>
     * 
     * @param request UpdateResolverRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResolverRuleResponse
     */
    public UpdateResolverRuleResponse updateResolverRuleWithOptions(UpdateResolverRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardIp)) {
            query.put("ForwardIp", request.forwardIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priorityForwardConfigs)) {
            query.put("PriorityForwardConfigs", request.priorityForwardConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResolverRule"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResolverRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a forwarding rule.</p>
     * 
     * @param request UpdateResolverRuleRequest
     * @return UpdateResolverRuleResponse
     */
    public UpdateResolverRuleResponse updateResolverRule(UpdateResolverRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResolverRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the UpdateSyncEcsHostTask operation to add or update a hostname sync task.</p>
     * 
     * @param request UpdateSyncEcsHostTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSyncEcsHostTaskResponse
     */
    public UpdateSyncEcsHostTaskResponse updateSyncEcsHostTaskWithOptions(UpdateSyncEcsHostTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSyncEcsHostTask"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSyncEcsHostTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call the UpdateSyncEcsHostTask operation to add or update a hostname sync task.</p>
     * 
     * @param request UpdateSyncEcsHostTaskRequest
     * @return UpdateSyncEcsHostTaskResponse
     */
    public UpdateSyncEcsHostTaskResponse updateSyncEcsHostTask(UpdateSyncEcsHostTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSyncEcsHostTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4><strong>Notes</strong></h4>
     * <p>Modifications to DNS records in standard zones take effect after the Time to Live (TTL) expires. Modifications to DNS records in acceleration regions take effect immediately and are not affected by the TTL.</p>
     * 
     * <b>summary</b> : 
     * <p>The UpdateZoneRecord operation modifies a DNS record for a zone. You can change properties such as the host record, record type, and weight.</p>
     * 
     * @param request UpdateZoneRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateZoneRecordResponse
     */
    public UpdateZoneRecordResponse updateZoneRecordWithOptions(UpdateZoneRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateZoneRecord"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateZoneRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h4><strong>Notes</strong></h4>
     * <p>Modifications to DNS records in standard zones take effect after the Time to Live (TTL) expires. Modifications to DNS records in acceleration regions take effect immediately and are not affected by the TTL.</p>
     * 
     * <b>summary</b> : 
     * <p>The UpdateZoneRecord operation modifies a DNS record for a zone. You can change properties such as the host record, record type, and weight.</p>
     * 
     * @param request UpdateZoneRecordRequest
     * @return UpdateZoneRecordResponse
     */
    public UpdateZoneRecordResponse updateZoneRecord(UpdateZoneRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateZoneRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the weight value of an authoritative DNS record in Alibaba Cloud DNS PrivateZone.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the weight value of an authoritative DNS record in Alibaba Cloud DNS PrivateZone.</p>
     * 
     * @param request UpdateZoneRecordWeightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateZoneRecordWeightResponse
     */
    public UpdateZoneRecordWeightResponse updateZoneRecordWeightWithOptions(UpdateZoneRecordWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateZoneRecordWeight"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateZoneRecordWeightResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the weight value of an authoritative DNS record in Alibaba Cloud DNS PrivateZone.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the weight value of an authoritative DNS record in Alibaba Cloud DNS PrivateZone.</p>
     * 
     * @param request UpdateZoneRecordWeightRequest
     * @return UpdateZoneRecordWeightResponse
     */
    public UpdateZoneRecordWeightResponse updateZoneRecordWeight(UpdateZoneRecordWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateZoneRecordWeightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remark for a built-in authoritative domain name (zone).</p>
     * 
     * @param request UpdateZoneRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateZoneRemarkResponse
     */
    public UpdateZoneRemarkResponse updateZoneRemarkWithOptions(UpdateZoneRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateZoneRemark"),
            new TeaPair("version", "2018-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateZoneRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remark for a built-in authoritative domain name (zone).</p>
     * 
     * @param request UpdateZoneRemarkRequest
     * @return UpdateZoneRemarkResponse
     */
    public UpdateZoneRemarkResponse updateZoneRemark(UpdateZoneRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateZoneRemarkWithOptions(request, runtime);
    }
}
