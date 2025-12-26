// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001;

import com.aliyun.tea.*;
import com.aliyun.waf_openapi20211001.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-heyuan", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "wafopenapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "wafopenapi.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "wafopenapi.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("waf-openapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>地址簿添加地址</p>
     * 
     * @param request AddAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAddressResponse
     */
    public AddAddressResponse addAddressWithOptions(AddAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressList)) {
            query.put("AddressList", request.addressList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddress"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>地址簿添加地址</p>
     * 
     * @param request AddAddressRequest
     * @return AddAddressResponse
     */
    public AddAddressResponse addAddress(AddAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a protected object belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a protected object belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>地址簿清空所有地址</p>
     * 
     * @param request ClearAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearAddressResponse
     */
    public ClearAddressResponse clearAddressWithOptions(ClearAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearAddress"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>地址簿清空所有地址</p>
     * 
     * @param request ClearAddressRequest
     * @return ClearAddressResponse
     */
    public ClearAddressResponse clearAddress(ClearAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clears an IP address blacklist for major event protection.</p>
     * 
     * @param request ClearMajorProtectionBlackIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearMajorProtectionBlackIpResponse
     */
    public ClearMajorProtectionBlackIpResponse clearMajorProtectionBlackIpWithOptions(ClearMajorProtectionBlackIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearMajorProtectionBlackIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearMajorProtectionBlackIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clears an IP address blacklist for major event protection.</p>
     * 
     * @param request ClearMajorProtectionBlackIpRequest
     * @return ClearMajorProtectionBlackIpResponse
     */
    public ClearMajorProtectionBlackIpResponse clearMajorProtectionBlackIp(ClearMajorProtectionBlackIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearMajorProtectionBlackIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new protection template from the copy.</p>
     * 
     * @param request CopyDefenseTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyDefenseTemplateResponse
     */
    public CopyDefenseTemplateResponse copyDefenseTemplateWithOptions(CopyDefenseTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyDefenseTemplate"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyDefenseTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new protection template from the copy.</p>
     * 
     * @param request CopyDefenseTemplateRequest
     * @return CopyDefenseTemplateResponse
     */
    public CopyDefenseTemplateResponse copyDefenseTemplate(CopyDefenseTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyDefenseTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data export task in the API security module.</p>
     * 
     * @param request CreateApiExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiExportResponse
     */
    public CreateApiExportResponse createApiExportWithOptions(CreateApiExportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiExport"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data export task in the API security module.</p>
     * 
     * @param request CreateApiExportRequest
     * @return CreateApiExportResponse
     */
    public CreateApiExportResponse createApiExport(CreateApiExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiExportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a certificate that uses an internationally accepted algorithm for a domain name added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param request CreateCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCertsResponse
     */
    public CreateCertsResponse createCertsWithOptions(CreateCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certContent)) {
            query.put("CertContent", request.certContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certKey)) {
            query.put("CertKey", request.certKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCerts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a certificate that uses an internationally accepted algorithm for a domain name added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param request CreateCertsRequest
     * @return CreateCertsResponse
     */
    public CreateCertsResponse createCerts(CreateCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a service to Web Application Firewall (WAF). This operation is supported for only the Elastic Compute Service (ECS) and Classic Load Balancer (CLB) services.</p>
     * 
     * @param tmpReq CreateCloudResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudResourceResponse
     */
    public CreateCloudResourceResponse createCloudResourceWithOptions(CreateCloudResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCloudResourceShrinkRequest request = new CreateCloudResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listen)) {
            request.listenShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listen, "Listen", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirect)) {
            request.redirectShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirect, "Redirect", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenShrink)) {
            query.put("Listen", request.listenShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectShrink)) {
            query.put("Redirect", request.redirectShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a service to Web Application Firewall (WAF). This operation is supported for only the Elastic Compute Service (ECS) and Classic Load Balancer (CLB) services.</p>
     * 
     * @param request CreateCloudResourceRequest
     * @return CreateCloudResourceResponse
     */
    public CreateCloudResourceResponse createCloudResource(CreateCloudResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建防护对象</p>
     * 
     * @param tmpReq CreateDefenseResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDefenseResourceResponse
     */
    public CreateDefenseResourceResponse createDefenseResourceWithOptions(CreateDefenseResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDefenseResourceShrinkRequest request = new CreateDefenseResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customHeaders)) {
            request.customHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customHeaders, "CustomHeaders", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customHeadersShrink)) {
            query.put("CustomHeaders", request.customHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pattern)) {
            query.put("Pattern", request.pattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOrigin)) {
            query.put("ResourceOrigin", request.resourceOrigin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xffStatus)) {
            query.put("XffStatus", request.xffStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDefenseResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDefenseResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建防护对象</p>
     * 
     * @param request CreateDefenseResourceRequest
     * @return CreateDefenseResourceResponse
     */
    public CreateDefenseResourceResponse createDefenseResource(CreateDefenseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDefenseResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protected object group.</p>
     * 
     * @param request CreateDefenseResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDefenseResourceGroupResponse
     */
    public CreateDefenseResourceGroupResponse createDefenseResourceGroupWithOptions(CreateDefenseResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addList)) {
            query.put("AddList", request.addList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDefenseResourceGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDefenseResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protected object group.</p>
     * 
     * @param request CreateDefenseResourceGroupRequest
     * @return CreateDefenseResourceGroupResponse
     */
    public CreateDefenseResourceGroupResponse createDefenseResourceGroup(CreateDefenseResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDefenseResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection rule.</p>
     * 
     * @param request CreateDefenseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDefenseRuleResponse
     */
    public CreateDefenseRuleResponse createDefenseRuleWithOptions(CreateDefenseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDefenseRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDefenseRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection rule.</p>
     * 
     * @param request CreateDefenseRuleRequest
     * @return CreateDefenseRuleResponse
     */
    public CreateDefenseRuleResponse createDefenseRule(CreateDefenseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDefenseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection rule template.</p>
     * 
     * @param request CreateDefenseTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDefenseTemplateResponse
     */
    public CreateDefenseTemplateResponse createDefenseTemplateWithOptions(CreateDefenseTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateOrigin)) {
            query.put("TemplateOrigin", request.templateOrigin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateStatus)) {
            query.put("TemplateStatus", request.templateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindResourceGroups)) {
            query.put("UnbindResourceGroups", request.unbindResourceGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindResources)) {
            query.put("UnbindResources", request.unbindResources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDefenseTemplate"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDefenseTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a protection rule template.</p>
     * 
     * @param request CreateDefenseTemplateRequest
     * @return CreateDefenseTemplateResponse
     */
    public CreateDefenseTemplateResponse createDefenseTemplate(CreateDefenseTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDefenseTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a domain name to Web Application Firewall (WAF).</p>
     * 
     * @param tmpReq CreateDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDomainShrinkRequest request = new CreateDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listen)) {
            request.listenShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listen, "Listen", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirect)) {
            request.redirectShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirect, "Redirect", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenShrink)) {
            query.put("Listen", request.listenShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectShrink)) {
            query.put("Redirect", request.redirectShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a domain name to Web Application Firewall (WAF).</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridCloudClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridCloudClusterResponse
     */
    public CreateHybridCloudClusterResponse createHybridCloudClusterWithOptions(CreateHybridCloudClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRegion)) {
            query.put("AccessRegion", request.accessRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpPorts)) {
            query.put("HttpPorts", request.httpPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPorts)) {
            query.put("HttpsPorts", request.httpsPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logFieldsNotReturned)) {
            query.put("LogFieldsNotReturned", request.logFieldsNotReturned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionServerCount)) {
            query.put("ProtectionServerCount", request.protectionServerCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyStatus)) {
            query.put("ProxyStatus", request.proxyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyType)) {
            query.put("ProxyType", request.proxyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            query.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridCloudCluster"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridCloudClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridCloudClusterRequest
     * @return CreateHybridCloudClusterResponse
     */
    public CreateHybridCloudClusterResponse createHybridCloudCluster(CreateHybridCloudClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridCloudClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增集群规则信息</p>
     * 
     * @param request CreateHybridCloudClusterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridCloudClusterRuleResponse
     */
    public CreateHybridCloudClusterRuleResponse createHybridCloudClusterRuleWithOptions(CreateHybridCloudClusterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            query.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridCloudClusterRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridCloudClusterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增集群规则信息</p>
     * 
     * @param request CreateHybridCloudClusterRuleRequest
     * @return CreateHybridCloudClusterRuleResponse
     */
    public CreateHybridCloudClusterRuleResponse createHybridCloudClusterRule(CreateHybridCloudClusterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridCloudClusterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node group for a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridCloudGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridCloudGroupResponse
     */
    public CreateHybridCloudGroupResponse createHybridCloudGroupWithOptions(CreateHybridCloudGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backSourceMark)) {
            query.put("BackSourceMark", request.backSourceMark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalanceIp)) {
            query.put("LoadBalanceIp", request.loadBalanceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationCode)) {
            query.put("LocationCode", request.locationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridCloudGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridCloudGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node group for a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridCloudGroupRequest
     * @return CreateHybridCloudGroupResponse
     */
    public CreateHybridCloudGroupResponse createHybridCloudGroup(CreateHybridCloudGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridCloudGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hybrid cloud log delivery configuration.</p>
     * 
     * @param request CreateLogDeliveryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogDeliveryConfigResponse
     */
    public CreateLogDeliveryConfigResponse createLogDeliveryConfigWithOptions(CreateLogDeliveryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryDetail)) {
            query.put("DeliveryDetail", request.deliveryDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryName)) {
            query.put("DeliveryName", request.deliveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogDeliveryConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogDeliveryConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hybrid cloud log delivery configuration.</p>
     * 
     * @param request CreateLogDeliveryConfigRequest
     * @return CreateLogDeliveryConfigResponse
     */
    public CreateLogDeliveryConfigResponse createLogDeliveryConfig(CreateLogDeliveryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogDeliveryConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP address blacklist for major event protection.</p>
     * 
     * @param request CreateMajorProtectionBlackIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMajorProtectionBlackIpResponse
     */
    public CreateMajorProtectionBlackIpResponse createMajorProtectionBlackIpWithOptions(CreateMajorProtectionBlackIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMajorProtectionBlackIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMajorProtectionBlackIpResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only on the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an IP address blacklist for major event protection.</p>
     * 
     * @param request CreateMajorProtectionBlackIpRequest
     * @return CreateMajorProtectionBlackIpResponse
     */
    public CreateMajorProtectionBlackIpResponse createMajorProtectionBlackIp(CreateMajorProtectionBlackIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMajorProtectionBlackIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds members to use the multi-account management feature of Web Application Firewall (WAF).</p>
     * 
     * @param request CreateMemberAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemberAccountsResponse
     */
    public CreateMemberAccountsResponse createMemberAccountsWithOptions(CreateMemberAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountIds)) {
            query.put("MemberAccountIds", request.memberAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemberAccounts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemberAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds members to use the multi-account management feature of Web Application Firewall (WAF).</p>
     * 
     * @param request CreateMemberAccountsRequest
     * @return CreateMemberAccountsResponse
     */
    public CreateMemberAccountsResponse createMemberAccounts(CreateMemberAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMemberAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启防护功能POC</p>
     * 
     * @param request CreatePocFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePocFunctionResponse
     */
    public CreatePocFunctionResponse createPocFunctionWithOptions(CreatePocFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePocFunction"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePocFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启防护功能POC</p>
     * 
     * @param request CreatePocFunctionRequest
     * @return CreatePocFunctionResponse
     */
    public CreatePocFunctionResponse createPocFunction(CreatePocFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPocFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go Web Application Firewall (WAF) 3.0 instance.</p>
     * 
     * @param request CreatePostpaidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePostpaidInstanceResponse
     */
    public CreatePostpaidInstanceResponse createPostpaidInstanceWithOptions(CreatePostpaidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePostpaidInstance"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePostpaidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go Web Application Firewall (WAF) 3.0 instance.</p>
     * 
     * @param request CreatePostpaidInstanceRequest
     * @return CreatePostpaidInstanceResponse
     */
    public CreatePostpaidInstanceResponse createPostpaidInstance(CreatePostpaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPostpaidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a ShangMi (SM) certificate for a domain name that is added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param request CreateSM2CertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSM2CertResponse
     */
    public CreateSM2CertResponse createSM2CertWithOptions(CreateSM2CertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptCertificate)) {
            query.put("EncryptCertificate", request.encryptCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptPrivateKey)) {
            query.put("EncryptPrivateKey", request.encryptPrivateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signCertificate)) {
            query.put("SignCertificate", request.signCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signPrivateKey)) {
            query.put("SignPrivateKey", request.signPrivateKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSM2Cert"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSM2CertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a ShangMi (SM) certificate for a domain name that is added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param request CreateSM2CertRequest
     * @return CreateSM2CertResponse
     */
    public CreateSM2CertResponse createSM2Cert(CreateSM2CertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSM2CertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>地址簿添加地址</p>
     * 
     * @param request DeleteAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAddressResponse
     */
    public DeleteAddressResponse deleteAddressWithOptions(DeleteAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressList)) {
            query.put("AddressList", request.addressList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddress"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>地址簿添加地址</p>
     * 
     * @param request DeleteAddressRequest
     * @return DeleteAddressResponse
     */
    public DeleteAddressResponse deleteAddress(DeleteAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple risks detected by the API security module at a time.</p>
     * 
     * @param request DeleteApisecAbnormalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApisecAbnormalsResponse
     */
    public DeleteApisecAbnormalsResponse deleteApisecAbnormalsWithOptions(DeleteApisecAbnormalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abnormalIds)) {
            query.put("AbnormalIds", request.abnormalIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApisecAbnormals"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApisecAbnormalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple risks detected by the API security module at a time.</p>
     * 
     * @param request DeleteApisecAbnormalsRequest
     * @return DeleteApisecAbnormalsResponse
     */
    public DeleteApisecAbnormalsResponse deleteApisecAbnormals(DeleteApisecAbnormalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApisecAbnormalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple security events detected by the API security module at a time.</p>
     * 
     * @param request DeleteApisecEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApisecEventsResponse
     */
    public DeleteApisecEventsResponse deleteApisecEventsWithOptions(DeleteApisecEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIds)) {
            query.put("EventIds", request.eventIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApisecEvents"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApisecEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple security events detected by the API security module at a time.</p>
     * 
     * @param request DeleteApisecEventsRequest
     * @return DeleteApisecEventsResponse
     */
    public DeleteApisecEventsResponse deleteApisecEvents(DeleteApisecEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApisecEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a service from Web Application Firewall (WAF). This operation is supported for only the Elastic Compute Service (ECS) and Classic Load Balancer (CLB) services.</p>
     * 
     * @param request DeleteCloudResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudResourceResponse
     */
    public DeleteCloudResourceResponse deleteCloudResourceWithOptions(DeleteCloudResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudResourceId)) {
            query.put("CloudResourceId", request.cloudResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a service from Web Application Firewall (WAF). This operation is supported for only the Elastic Compute Service (ECS) and Classic Load Balancer (CLB) services.</p>
     * 
     * @param request DeleteCloudResourceRequest
     * @return DeleteCloudResourceResponse
     */
    public DeleteCloudResourceResponse deleteCloudResource(DeleteCloudResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除单个防护对象</p>
     * 
     * @param request DeleteDefenseResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDefenseResourceResponse
     */
    public DeleteDefenseResourceResponse deleteDefenseResourceWithOptions(DeleteDefenseResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDefenseResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDefenseResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除单个防护对象</p>
     * 
     * @param request DeleteDefenseResourceRequest
     * @return DeleteDefenseResourceResponse
     */
    public DeleteDefenseResourceResponse deleteDefenseResource(DeleteDefenseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDefenseResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protected object group.</p>
     * 
     * @param request DeleteDefenseResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDefenseResourceGroupResponse
     */
    public DeleteDefenseResourceGroupResponse deleteDefenseResourceGroupWithOptions(DeleteDefenseResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDefenseResourceGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDefenseResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protected object group.</p>
     * 
     * @param request DeleteDefenseResourceGroupRequest
     * @return DeleteDefenseResourceGroupResponse
     */
    public DeleteDefenseResourceGroupResponse deleteDefenseResourceGroup(DeleteDefenseResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDefenseResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection rule.</p>
     * 
     * @param request DeleteDefenseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDefenseRuleResponse
     */
    public DeleteDefenseRuleResponse deleteDefenseRuleWithOptions(DeleteDefenseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDefenseRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDefenseRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection rule.</p>
     * 
     * @param request DeleteDefenseRuleRequest
     * @return DeleteDefenseRuleResponse
     */
    public DeleteDefenseRuleResponse deleteDefenseRule(DeleteDefenseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDefenseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新防护规则封禁Ip</p>
     * 
     * @param request DeleteDefenseRuleBlockIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDefenseRuleBlockIpResponse
     */
    public DeleteDefenseRuleBlockIpResponse deleteDefenseRuleBlockIpWithOptions(DeleteDefenseRuleBlockIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDefenseRuleBlockIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDefenseRuleBlockIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新防护规则封禁Ip</p>
     * 
     * @param request DeleteDefenseRuleBlockIpRequest
     * @return DeleteDefenseRuleBlockIpResponse
     */
    public DeleteDefenseRuleBlockIpResponse deleteDefenseRuleBlockIp(DeleteDefenseRuleBlockIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDefenseRuleBlockIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection rule template.</p>
     * 
     * @param request DeleteDefenseTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDefenseTemplateResponse
     */
    public DeleteDefenseTemplateResponse deleteDefenseTemplateWithOptions(DeleteDefenseTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDefenseTemplate"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDefenseTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a protection rule template.</p>
     * 
     * @param request DeleteDefenseTemplateRequest
     * @return DeleteDefenseTemplateResponse
     */
    public DeleteDefenseTemplateResponse deleteDefenseTemplate(DeleteDefenseTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDefenseTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain name that is added to Web Application Firewall (WAF).</p>
     * 
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain name that is added to Web Application Firewall (WAF).</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除集群规则信息</p>
     * 
     * @param request DeleteHybridCloudClusterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHybridCloudClusterRuleResponse
     */
    public DeleteHybridCloudClusterRuleResponse deleteHybridCloudClusterRuleWithOptions(DeleteHybridCloudClusterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterRuleResourceId)) {
            query.put("ClusterRuleResourceId", request.clusterRuleResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHybridCloudClusterRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHybridCloudClusterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除集群规则信息</p>
     * 
     * @param request DeleteHybridCloudClusterRuleRequest
     * @return DeleteHybridCloudClusterRuleResponse
     */
    public DeleteHybridCloudClusterRuleResponse deleteHybridCloudClusterRule(DeleteHybridCloudClusterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHybridCloudClusterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除组信息</p>
     * 
     * @param request DeleteHybridCloudGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHybridCloudGroupResponse
     */
    public DeleteHybridCloudGroupResponse deleteHybridCloudGroupWithOptions(DeleteHybridCloudGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHybridCloudGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHybridCloudGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除组信息</p>
     * 
     * @param request DeleteHybridCloudGroupRequest
     * @return DeleteHybridCloudGroupResponse
     */
    public DeleteHybridCloudGroupResponse deleteHybridCloudGroup(DeleteHybridCloudGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHybridCloudGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除日志外发配置</p>
     * 
     * @param request DeleteLogDeliveryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogDeliveryConfigResponse
     */
    public DeleteLogDeliveryConfigResponse deleteLogDeliveryConfigWithOptions(DeleteLogDeliveryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryName)) {
            query.put("DeliveryName", request.deliveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogDeliveryConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogDeliveryConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除日志外发配置</p>
     * 
     * @param request DeleteLogDeliveryConfigRequest
     * @return DeleteLogDeliveryConfigResponse
     */
    public DeleteLogDeliveryConfigResponse deleteLogDeliveryConfig(DeleteLogDeliveryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogDeliveryConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an IP address blacklist for major event protection.</p>
     * 
     * @param request DeleteMajorProtectionBlackIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMajorProtectionBlackIpResponse
     */
    public DeleteMajorProtectionBlackIpResponse deleteMajorProtectionBlackIpWithOptions(DeleteMajorProtectionBlackIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMajorProtectionBlackIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMajorProtectionBlackIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an IP address blacklist for major event protection.</p>
     * 
     * @param request DeleteMajorProtectionBlackIpRequest
     * @return DeleteMajorProtectionBlackIpResponse
     */
    public DeleteMajorProtectionBlackIpResponse deleteMajorProtectionBlackIp(DeleteMajorProtectionBlackIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMajorProtectionBlackIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the members that are added for multi-account management in Web Application Firewall (WAF).</p>
     * 
     * @param request DeleteMemberAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemberAccountResponse
     */
    public DeleteMemberAccountResponse deleteMemberAccountWithOptions(DeleteMemberAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemberAccount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemberAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the members that are added for multi-account management in Web Application Firewall (WAF).</p>
     * 
     * @param request DeleteMemberAccountRequest
     * @return DeleteMemberAccountResponse
     */
    public DeleteMemberAccountResponse deleteMemberAccount(DeleteMemberAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMemberAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询异常的云产品接入资源</p>
     * 
     * @param request DescribeAbnormalCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAbnormalCloudResourcesResponse
     */
    public DescribeAbnormalCloudResourcesResponse describeAbnormalCloudResourcesWithOptions(DescribeAbnormalCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAbnormalCloudResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAbnormalCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询异常的云产品接入资源</p>
     * 
     * @param request DescribeAbnormalCloudResourcesRequest
     * @return DescribeAbnormalCloudResourcesResponse
     */
    public DescribeAbnormalCloudResourcesResponse describeAbnormalCloudResources(DescribeAbnormalCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAbnormalCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether an Alibaba Cloud account is the delegated administrator account of a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeAccountDelegatedStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountDelegatedStatusResponse
     */
    public DescribeAccountDelegatedStatusResponse describeAccountDelegatedStatusWithOptions(DescribeAccountDelegatedStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountDelegatedStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountDelegatedStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether an Alibaba Cloud account is the delegated administrator account of a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeAccountDelegatedStatusRequest
     * @return DescribeAccountDelegatedStatusResponse
     */
    public DescribeAccountDelegatedStatusResponse describeAccountDelegatedStatus(DescribeAccountDelegatedStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountDelegatedStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询地址簿IP</p>
     * 
     * @param request DescribeAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddressesResponse
     */
    public DescribeAddressesResponse describeAddressesWithOptions(DescribeAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressLike)) {
            query.put("AddressLike", request.addressLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddresses"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询地址簿IP</p>
     * 
     * @param request DescribeAddressesRequest
     * @return DescribeAddressesResponse
     */
    public DescribeAddressesResponse describeAddresses(DescribeAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeAlarmBannerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlarmBannerResponse
     */
    public DescribeAlarmBannerResponse describeAlarmBannerWithOptions(DescribeAlarmBannerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarmBanner"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmBannerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeAlarmBannerRequest
     * @return DescribeAlarmBannerResponse
     */
    public DescribeAlarmBannerResponse describeAlarmBanner(DescribeAlarmBannerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmBannerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeAlarmListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlarmListResponse
     */
    public DescribeAlarmListResponse describeAlarmListWithOptions(DescribeAlarmListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarmList"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例信息</p>
     * 
     * @param request DescribeAlarmListRequest
     * @return DescribeAlarmListResponse
     */
    public DescribeAlarmListResponse describeAlarmList(DescribeAlarmListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of data export tasks in the API security module.</p>
     * 
     * @param request DescribeApiExportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiExportsResponse
     */
    public DescribeApiExportsResponse describeApiExportsWithOptions(DescribeApiExportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiExports"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiExportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of data export tasks in the API security module.</p>
     * 
     * @param request DescribeApiExportsRequest
     * @return DescribeApiExportsResponse
     */
    public DescribeApiExportsResponse describeApiExports(DescribeApiExportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiExportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which risks are detected by the API security module.</p>
     * 
     * @param request DescribeApisecAbnormalDomainStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecAbnormalDomainStatisticResponse
     */
    public DescribeApisecAbnormalDomainStatisticResponse describeApisecAbnormalDomainStatisticWithOptions(DescribeApisecAbnormalDomainStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecAbnormalDomainStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecAbnormalDomainStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which risks are detected by the API security module.</p>
     * 
     * @param request DescribeApisecAbnormalDomainStatisticRequest
     * @return DescribeApisecAbnormalDomainStatisticResponse
     */
    public DescribeApisecAbnormalDomainStatisticResponse describeApisecAbnormalDomainStatistic(DescribeApisecAbnormalDomainStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecAbnormalDomainStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of API security risks.</p>
     * 
     * @param request DescribeApisecAbnormalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecAbnormalsResponse
     */
    public DescribeApisecAbnormalsResponse describeApisecAbnormalsWithOptions(DescribeApisecAbnormalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abnormalId)) {
            query.put("AbnormalId", request.abnormalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.abnormalLevel)) {
            query.put("AbnormalLevel", request.abnormalLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.abnormalTag)) {
            query.put("AbnormalTag", request.abnormalTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiFormat)) {
            query.put("ApiFormat", request.apiFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiTag)) {
            query.put("ApiTag", request.apiTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecAbnormals"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecAbnormalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of API security risks.</p>
     * 
     * @param request DescribeApisecAbnormalsRequest
     * @return DescribeApisecAbnormalsResponse
     */
    public DescribeApisecAbnormalsResponse describeApisecAbnormals(DescribeApisecAbnormalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecAbnormalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API assets in the API security module.</p>
     * 
     * @param request DescribeApisecApiResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecApiResourcesResponse
     */
    public DescribeApisecApiResourcesResponse describeApisecApiResourcesWithOptions(DescribeApisecApiResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiFormat)) {
            query.put("ApiFormat", request.apiFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiMethod)) {
            query.put("ApiMethod", request.apiMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiStatus)) {
            query.put("ApiStatus", request.apiStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiTag)) {
            query.put("ApiTag", request.apiTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFlag)) {
            query.put("AuthFlag", request.authFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow)) {
            query.put("Follow", request.follow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSensitiveType)) {
            query.put("RequestSensitiveType", request.requestSensitiveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveLevel)) {
            query.put("SensitiveLevel", request.sensitiveLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveType)) {
            query.put("SensitiveType", request.sensitiveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecApiResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecApiResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API assets in the API security module.</p>
     * 
     * @param request DescribeApisecApiResourcesRequest
     * @return DescribeApisecApiResourcesResponse
     */
    public DescribeApisecApiResourcesResponse describeApisecApiResources(DescribeApisecApiResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecApiResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the asset trends in the API security module.</p>
     * 
     * @param request DescribeApisecAssetTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecAssetTrendResponse
     */
    public DescribeApisecAssetTrendResponse describeApisecAssetTrendWithOptions(DescribeApisecAssetTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecAssetTrend"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecAssetTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the asset trends in the API security module.</p>
     * 
     * @param request DescribeApisecAssetTrendRequest
     * @return DescribeApisecAssetTrendResponse
     */
    public DescribeApisecAssetTrendResponse describeApisecAssetTrend(DescribeApisecAssetTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecAssetTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全事件详情</p>
     * 
     * @param request DescribeApisecEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecEventDetailResponse
     */
    public DescribeApisecEventDetailResponse describeApisecEventDetailWithOptions(DescribeApisecEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailType)) {
            query.put("DetailType", request.detailType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecEventDetail"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全事件详情</p>
     * 
     * @param request DescribeApisecEventDetailRequest
     * @return DescribeApisecEventDetailResponse
     */
    public DescribeApisecEventDetailResponse describeApisecEventDetail(DescribeApisecEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which security events are detected by the API security module.</p>
     * 
     * @param request DescribeApisecEventDomainStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecEventDomainStatisticResponse
     */
    public DescribeApisecEventDomainStatisticResponse describeApisecEventDomainStatisticWithOptions(DescribeApisecEventDomainStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecEventDomainStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecEventDomainStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which security events are detected by the API security module.</p>
     * 
     * @param request DescribeApisecEventDomainStatisticRequest
     * @return DescribeApisecEventDomainStatisticResponse
     */
    public DescribeApisecEventDomainStatisticResponse describeApisecEventDomainStatistic(DescribeApisecEventDomainStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecEventDomainStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API security events.</p>
     * 
     * @param request DescribeApisecEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecEventsResponse
     */
    public DescribeApisecEventsResponse describeApisecEventsWithOptions(DescribeApisecEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiFormat)) {
            query.put("ApiFormat", request.apiFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiTag)) {
            query.put("ApiTag", request.apiTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackIp)) {
            query.put("AttackIp", request.attackIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventLevel)) {
            query.put("EventLevel", request.eventLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTag)) {
            query.put("EventTag", request.eventTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecEvents"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API security events.</p>
     * 
     * @param request DescribeApisecEventsRequest
     * @return DescribeApisecEventsResponse
     */
    public DescribeApisecEventsResponse describeApisecEvents(DescribeApisecEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询API安全样例信息</p>
     * 
     * @param request DescribeApisecExamplesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecExamplesResponse
     */
    public DescribeApisecExamplesResponse describeApisecExamplesWithOptions(DescribeApisecExamplesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abnormalTag)) {
            query.put("AbnormalTag", request.abnormalTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleType)) {
            query.put("ExampleType", request.exampleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSensitiveTypeList)) {
            query.put("RequestSensitiveTypeList", request.requestSensitiveTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseSensitiveTypeList)) {
            query.put("ResponseSensitiveTypeList", request.responseSensitiveTypeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecExamples"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecExamplesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询API安全样例信息</p>
     * 
     * @param request DescribeApisecExamplesRequest
     * @return DescribeApisecExamplesResponse
     */
    public DescribeApisecExamplesResponse describeApisecExamples(DescribeApisecExamplesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecExamplesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of API security log subscription.</p>
     * 
     * @param request DescribeApisecLogDeliveriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecLogDeliveriesResponse
     */
    public DescribeApisecLogDeliveriesResponse describeApisecLogDeliveriesWithOptions(DescribeApisecLogDeliveriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecLogDeliveries"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecLogDeliveriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of API security log subscription.</p>
     * 
     * @param request DescribeApisecLogDeliveriesRequest
     * @return DescribeApisecLogDeliveriesResponse
     */
    public DescribeApisecLogDeliveriesResponse describeApisecLogDeliveries(DescribeApisecLogDeliveriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecLogDeliveriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names detected in the API security module.</p>
     * 
     * @param request DescribeApisecMatchedHostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecMatchedHostsResponse
     */
    public DescribeApisecMatchedHostsResponse describeApisecMatchedHostsWithOptions(DescribeApisecMatchedHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecMatchedHosts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecMatchedHostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names detected in the API security module.</p>
     * 
     * @param request DescribeApisecMatchedHostsRequest
     * @return DescribeApisecMatchedHostsResponse
     */
    public DescribeApisecMatchedHostsResponse describeApisecMatchedHosts(DescribeApisecMatchedHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecMatchedHostsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of protected object groups to which API security policies are applied.</p>
     * 
     * @param request DescribeApisecProtectionGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecProtectionGroupsResponse
     */
    public DescribeApisecProtectionGroupsResponse describeApisecProtectionGroupsWithOptions(DescribeApisecProtectionGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apisecStatus)) {
            query.put("ApisecStatus", request.apisecStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecProtectionGroups"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecProtectionGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of protected object groups to which API security policies are applied.</p>
     * 
     * @param request DescribeApisecProtectionGroupsRequest
     * @return DescribeApisecProtectionGroupsResponse
     */
    public DescribeApisecProtectionGroupsResponse describeApisecProtectionGroups(DescribeApisecProtectionGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecProtectionGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of protected objects to which API security policies are applied.</p>
     * 
     * @param request DescribeApisecProtectionResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecProtectionResourcesResponse
     */
    public DescribeApisecProtectionResourcesResponse describeApisecProtectionResourcesWithOptions(DescribeApisecProtectionResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apisecStatus)) {
            query.put("ApisecStatus", request.apisecStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecProtectionResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecProtectionResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of protected objects to which API security policies are applied.</p>
     * 
     * @param request DescribeApisecProtectionResourcesRequest
     * @return DescribeApisecProtectionResourcesResponse
     */
    public DescribeApisecProtectionResourcesResponse describeApisecProtectionResources(DescribeApisecProtectionResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecProtectionResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policies configured in the API security module.</p>
     * 
     * @param request DescribeApisecRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecRulesResponse
     */
    public DescribeApisecRulesResponse describeApisecRulesWithOptions(DescribeApisecRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecRules"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policies configured in the API security module.</p>
     * 
     * @param request DescribeApisecRulesRequest
     * @return DescribeApisecRulesResponse
     */
    public DescribeApisecRulesResponse describeApisecRules(DescribeApisecRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which sensitive data is detected by the API security module.</p>
     * 
     * @param request DescribeApisecSensitiveDomainStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecSensitiveDomainStatisticResponse
     */
    public DescribeApisecSensitiveDomainStatisticResponse describeApisecSensitiveDomainStatisticWithOptions(DescribeApisecSensitiveDomainStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecSensitiveDomainStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecSensitiveDomainStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on domain names on which sensitive data is detected by the API security module.</p>
     * 
     * @param request DescribeApisecSensitiveDomainStatisticRequest
     * @return DescribeApisecSensitiveDomainStatisticResponse
     */
    public DescribeApisecSensitiveDomainStatisticResponse describeApisecSensitiveDomainStatistic(DescribeApisecSensitiveDomainStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecSensitiveDomainStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Logstores whose names start with apisec- in Simple Log Service.</p>
     * 
     * @param request DescribeApisecSlsLogStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecSlsLogStoresResponse
     */
    public DescribeApisecSlsLogStoresResponse describeApisecSlsLogStoresWithOptions(DescribeApisecSlsLogStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            query.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecSlsLogStores"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecSlsLogStoresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Logstores whose names start with apisec- in Simple Log Service.</p>
     * 
     * @param request DescribeApisecSlsLogStoresRequest
     * @return DescribeApisecSlsLogStoresResponse
     */
    public DescribeApisecSlsLogStoresResponse describeApisecSlsLogStores(DescribeApisecSlsLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecSlsLogStoresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the projects whose names start with apisec- in Simple Log Service.</p>
     * 
     * @param request DescribeApisecSlsProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecSlsProjectsResponse
     */
    public DescribeApisecSlsProjectsResponse describeApisecSlsProjectsWithOptions(DescribeApisecSlsProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            query.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecSlsProjects"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecSlsProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the projects whose names start with apisec- in Simple Log Service.</p>
     * 
     * @param request DescribeApisecSlsProjectsRequest
     * @return DescribeApisecSlsProjectsResponse
     */
    public DescribeApisecSlsProjectsResponse describeApisecSlsProjects(DescribeApisecSlsProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecSlsProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of API security-related risks and events.</p>
     * 
     * @param request DescribeApisecStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecStatisticsResponse
     */
    public DescribeApisecStatisticsResponse describeApisecStatisticsWithOptions(DescribeApisecStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatusList)) {
            query.put("UserStatusList", request.userStatusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecStatistics"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of API security-related risks and events.</p>
     * 
     * @param request DescribeApisecStatisticsRequest
     * @return DescribeApisecStatisticsResponse
     */
    public DescribeApisecStatisticsResponse describeApisecStatistics(DescribeApisecStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection suggestions for APIs.</p>
     * 
     * @param request DescribeApisecSuggestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecSuggestionsResponse
     */
    public DescribeApisecSuggestionsResponse describeApisecSuggestionsWithOptions(DescribeApisecSuggestionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecSuggestions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecSuggestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection suggestions for APIs.</p>
     * 
     * @param request DescribeApisecSuggestionsRequest
     * @return DescribeApisecSuggestionsResponse
     */
    public DescribeApisecSuggestionsResponse describeApisecSuggestions(DescribeApisecSuggestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecSuggestionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user operation records in the API security module.</p>
     * 
     * @param request DescribeApisecUserOperationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisecUserOperationsResponse
     */
    public DescribeApisecUserOperationsResponse describeApisecUserOperationsWithOptions(DescribeApisecUserOperationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApisecUserOperations"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisecUserOperationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user operation records in the API security module.</p>
     * 
     * @param request DescribeApisecUserOperationsRequest
     * @return DescribeApisecUserOperationsResponse
     */
    public DescribeApisecUserOperationsResponse describeApisecUserOperations(DescribeApisecUserOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisecUserOperationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询基础防护系统规则集</p>
     * 
     * @param request DescribeBaseSystemRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBaseSystemRulesResponse
     */
    public DescribeBaseSystemRulesResponse describeBaseSystemRulesWithOptions(DescribeBaseSystemRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectType)) {
            query.put("DetectType", request.detectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAction)) {
            query.put("RuleAction", request.ruleAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBaseSystemRules"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBaseSystemRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询基础防护系统规则集</p>
     * 
     * @param request DescribeBaseSystemRulesRequest
     * @return DescribeBaseSystemRulesResponse
     */
    public DescribeBaseSystemRulesResponse describeBaseSystemRules(DescribeBaseSystemRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBaseSystemRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询防护模板</p>
     * 
     * @param request DescribeBotAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBotAppKeyResponse
     */
    public DescribeBotAppKeyResponse describeBotAppKeyWithOptions(DescribeBotAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyVersion)) {
            query.put("KeyVersion", request.keyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBotAppKey"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBotAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询防护模板</p>
     * 
     * @param request DescribeBotAppKeyRequest
     * @return DescribeBotAppKeyResponse
     */
    public DescribeBotAppKeyResponse describeBotAppKey(DescribeBotAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBotAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取Bot管理规则标签信息</p>
     * 
     * @param request DescribeBotRuleLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBotRuleLabelsResponse
     */
    public DescribeBotRuleLabelsResponse describeBotRuleLabelsWithOptions(DescribeBotRuleLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelType)) {
            query.put("LabelType", request.labelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subScene)) {
            query.put("SubScene", request.subScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBotRuleLabels"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBotRuleLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取Bot管理规则标签信息</p>
     * 
     * @param request DescribeBotRuleLabelsRequest
     * @return DescribeBotRuleLabelsResponse
     */
    public DescribeBotRuleLabelsResponse describeBotRuleLabels(DescribeBotRuleLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBotRuleLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a certificate, such as the certificate name, expiration time, issuance time, and associated domain name.</p>
     * 
     * @param request DescribeCertDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertDetailResponse
     */
    public DescribeCertDetailResponse describeCertDetailWithOptions(DescribeCertDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCertDetail"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a certificate, such as the certificate name, expiration time, issuance time, and associated domain name.</p>
     * 
     * @param request DescribeCertDetailRequest
     * @return DescribeCertDetailResponse
     */
    public DescribeCertDetailResponse describeCertDetail(DescribeCertDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates issued for your domain names that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCertsResponse
     */
    public DescribeCertsResponse describeCertsWithOptions(DescribeCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCerts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates issued for your domain names that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCertsRequest
     * @return DescribeCertsResponse
     */
    public DescribeCertsResponse describeCerts(DescribeCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询WAF计价模块信息</p>
     * 
     * @param request DescribeChargeModuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChargeModuleResponse
     */
    public DescribeChargeModuleResponse describeChargeModuleWithOptions(DescribeChargeModuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChargeModule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChargeModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询WAF计价模块信息</p>
     * 
     * @param request DescribeChargeModuleRequest
     * @return DescribeChargeModuleResponse
     */
    public DescribeChargeModuleResponse describeChargeModule(DescribeChargeModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChargeModuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询WAF计价模块的计价结果</p>
     * 
     * @param request DescribeChargeResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChargeResultResponse
     */
    public DescribeChargeResultResponse describeChargeResultWithOptions(DescribeChargeResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeCycle)) {
            query.put("ChargeCycle", request.chargeCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeModules)) {
            query.put("ChargeModules", request.chargeModules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChargeResult"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChargeResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询WAF计价模块的计价结果</p>
     * 
     * @param request DescribeChargeResultRequest
     * @return DescribeChargeResultResponse
     */
    public DescribeChargeResultResponse describeChargeResult(DescribeChargeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChargeResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a port of the cloud service that is added to Web Application Firewall (WAF). This operation is supported for only Elastic Compute Service (ECS) and Classic Load Balancer (CLB).</p>
     * 
     * @param request DescribeCloudResourceAccessPortDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudResourceAccessPortDetailsResponse
     */
    public DescribeCloudResourceAccessPortDetailsResponse describeCloudResourceAccessPortDetailsWithOptions(DescribeCloudResourceAccessPortDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudResourceAccessPortDetails"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudResourceAccessPortDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a port of the cloud service that is added to Web Application Firewall (WAF). This operation is supported for only Elastic Compute Service (ECS) and Classic Load Balancer (CLB).</p>
     * 
     * @param request DescribeCloudResourceAccessPortDetailsRequest
     * @return DescribeCloudResourceAccessPortDetailsResponse
     */
    public DescribeCloudResourceAccessPortDetailsResponse describeCloudResourceAccessPortDetails(DescribeCloudResourceAccessPortDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudResourceAccessPortDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports of the cloud service that is added to Web Application Firewall (WAF). This operation is supported for only Elastic Compute Service (ECS) and Classic Load Balancer (CLB).</p>
     * 
     * @param request DescribeCloudResourceAccessedPortsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudResourceAccessedPortsResponse
     */
    public DescribeCloudResourceAccessedPortsResponse describeCloudResourceAccessedPortsWithOptions(DescribeCloudResourceAccessedPortsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudResourceAccessedPorts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudResourceAccessedPortsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports of the cloud service that is added to Web Application Firewall (WAF). This operation is supported for only Elastic Compute Service (ECS) and Classic Load Balancer (CLB).</p>
     * 
     * @param request DescribeCloudResourceAccessedPortsRequest
     * @return DescribeCloudResourceAccessedPortsResponse
     */
    public DescribeCloudResourceAccessedPortsResponse describeCloudResourceAccessedPorts(DescribeCloudResourceAccessedPortsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudResourceAccessedPortsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cloud service resources that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudResourcesResponse
     */
    public DescribeCloudResourcesResponse describeCloudResourcesWithOptions(DescribeCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDomain)) {
            query.put("ResourceDomain", request.resourceDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFunction)) {
            query.put("ResourceFunction", request.resourceFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceName)) {
            query.put("ResourceInstanceName", request.resourceInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRouteName)) {
            query.put("ResourceRouteName", request.resourceRouteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cloud service resources that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeCloudResourcesRequest
     * @return DescribeCloudResourcesResponse
     */
    public DescribeCloudResourcesResponse describeCloudResources(DescribeCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total number of domain names that are added to Web Application Firewall (WAF) in CNAME record mode and hybrid cloud reverse proxy mode.</p>
     * 
     * @param request DescribeCnameCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCnameCountResponse
     */
    public DescribeCnameCountResponse describeCnameCountWithOptions(DescribeCnameCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCnameCount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCnameCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total number of domain names that are added to Web Application Firewall (WAF) in CNAME record mode and hybrid cloud reverse proxy mode.</p>
     * 
     * @param request DescribeCnameCountRequest
     * @return DescribeCnameCountResponse
     */
    public DescribeCnameCountResponse describeCnameCount(DescribeCnameCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCnameCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志服务支持的所有字段</p>
     * 
     * @param tmpReq DescribeCommonLogFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommonLogFieldsResponse
     */
    public DescribeCommonLogFieldsResponse describeCommonLogFieldsWithOptions(DescribeCommonLogFieldsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCommonLogFieldsShrinkRequest request = new DescribeCommonLogFieldsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.logKeyList)) {
            request.logKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.logKeyList, "LogKeyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRequired)) {
            query.put("IsRequired", request.isRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logKeyListShrink)) {
            query.put("LogKeyList", request.logKeyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommonLogFields"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommonLogFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志服务支持的所有字段</p>
     * 
     * @param request DescribeCommonLogFieldsRequest
     * @return DescribeCommonLogFieldsResponse
     */
    public DescribeCommonLogFieldsResponse describeCommonLogFields(DescribeCommonLogFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommonLogFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义正则规则编译结果</p>
     * 
     * @param request DescribeCustomBaseRuleCompileResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomBaseRuleCompileResultResponse
     */
    public DescribeCustomBaseRuleCompileResultResponse describeCustomBaseRuleCompileResultWithOptions(DescribeCustomBaseRuleCompileResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomBaseRuleCompileResult"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomBaseRuleCompileResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义正则规则编译结果</p>
     * 
     * @param request DescribeCustomBaseRuleCompileResultRequest
     * @return DescribeCustomBaseRuleCompileResultResponse
     */
    public DescribeCustomBaseRuleCompileResultResponse describeCustomBaseRuleCompileResult(DescribeCustomBaseRuleCompileResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomBaseRuleCompileResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether DDoS attacks occur on specific domain names protected by a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeDDoSStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSStatusResponse
     */
    public DescribeDDoSStatusResponse describeDDoSStatusWithOptions(DescribeDDoSStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether DDoS attacks occur on specific domain names protected by a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeDDoSStatusRequest
     * @return DescribeDDoSStatusResponse
     */
    public DescribeDDoSStatusResponse describeDDoSStatus(DescribeDDoSStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default SSL and Transport Layer Security (TLS) settings.</p>
     * 
     * @param request DescribeDefaultHttpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefaultHttpsResponse
     */
    public DescribeDefaultHttpsResponse describeDefaultHttpsWithOptions(DescribeDefaultHttpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefaultHttps"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefaultHttpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default SSL and Transport Layer Security (TLS) settings.</p>
     * 
     * @param request DescribeDefaultHttpsRequest
     * @return DescribeDefaultHttpsResponse
     */
    public DescribeDefaultHttpsResponse describeDefaultHttps(DescribeDefaultHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefaultHttpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询可以被防护组绑定的防护对象列表</p>
     * 
     * @param request DescribeDefenseGroupValidResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseGroupValidResourcesResponse
     */
    public DescribeDefenseGroupValidResourcesResponse describeDefenseGroupValidResourcesWithOptions(DescribeDefenseGroupValidResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseGroupValidResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseGroupValidResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询可以被防护组绑定的防护对象列表</p>
     * 
     * @param request DescribeDefenseGroupValidResourcesRequest
     * @return DescribeDefenseGroupValidResourcesResponse
     */
    public DescribeDefenseGroupValidResourcesResponse describeDefenseGroupValidResources(DescribeDefenseGroupValidResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseGroupValidResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a protected object.</p>
     * 
     * @param request DescribeDefenseResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceResponse
     */
    public DescribeDefenseResourceResponse describeDefenseResourceWithOptions(DescribeDefenseResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a protected object.</p>
     * 
     * @param request DescribeDefenseResourceRequest
     * @return DescribeDefenseResourceResponse
     */
    public DescribeDefenseResourceResponse describeDefenseResource(DescribeDefenseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a protected object group.</p>
     * 
     * @param request DescribeDefenseResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceGroupResponse
     */
    public DescribeDefenseResourceGroupResponse describeDefenseResourceGroupWithOptions(DescribeDefenseResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a protected object group.</p>
     * 
     * @param request DescribeDefenseResourceGroupRequest
     * @return DescribeDefenseResourceGroupResponse
     */
    public DescribeDefenseResourceGroupResponse describeDefenseResourceGroup(DescribeDefenseResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of protected object groups.</p>
     * 
     * @param request DescribeDefenseResourceGroupNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceGroupNamesResponse
     */
    public DescribeDefenseResourceGroupNamesResponse describeDefenseResourceGroupNamesWithOptions(DescribeDefenseResourceGroupNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupNameLike)) {
            query.put("GroupNameLike", request.groupNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceGroupNames"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceGroupNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of protected object groups.</p>
     * 
     * @param request DescribeDefenseResourceGroupNamesRequest
     * @return DescribeDefenseResourceGroupNamesResponse
     */
    public DescribeDefenseResourceGroupNamesResponse describeDefenseResourceGroupNames(DescribeDefenseResourceGroupNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceGroupNamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pagination query to retrieve the information about protected object groups.</p>
     * 
     * @param request DescribeDefenseResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceGroupsResponse
     */
    public DescribeDefenseResourceGroupsResponse describeDefenseResourceGroupsWithOptions(DescribeDefenseResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupNameLike)) {
            query.put("GroupNameLike", request.groupNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupNames)) {
            query.put("GroupNames", request.groupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceGroups"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pagination query to retrieve the information about protected object groups.</p>
     * 
     * @param request DescribeDefenseResourceGroupsRequest
     * @return DescribeDefenseResourceGroupsResponse
     */
    public DescribeDefenseResourceGroupsResponse describeDefenseResourceGroups(DescribeDefenseResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pagination query to retrieve the names of protected objects.</p>
     * 
     * @param request DescribeDefenseResourceNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceNamesResponse
     */
    public DescribeDefenseResourceNamesResponse describeDefenseResourceNamesWithOptions(DescribeDefenseResourceNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceNames"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pagination query to retrieve the names of protected objects.</p>
     * 
     * @param request DescribeDefenseResourceNamesRequest
     * @return DescribeDefenseResourceNamesResponse
     */
    public DescribeDefenseResourceNamesResponse describeDefenseResourceNames(DescribeDefenseResourceNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceNamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象和所属资源的关系</p>
     * 
     * @param request DescribeDefenseResourceOwnerUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceOwnerUidResponse
     */
    public DescribeDefenseResourceOwnerUidResponse describeDefenseResourceOwnerUidWithOptions(DescribeDefenseResourceOwnerUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceNames)) {
            query.put("ResourceNames", request.resourceNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceOwnerUid"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceOwnerUidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象和所属资源的关系</p>
     * 
     * @param request DescribeDefenseResourceOwnerUidRequest
     * @return DescribeDefenseResourceOwnerUidResponse
     */
    public DescribeDefenseResourceOwnerUidResponse describeDefenseResourceOwnerUid(DescribeDefenseResourceOwnerUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceOwnerUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection templates that are associated with a protected object or protected object group.</p>
     * 
     * @param request DescribeDefenseResourceTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourceTemplatesResponse
     */
    public DescribeDefenseResourceTemplatesResponse describeDefenseResourceTemplatesWithOptions(DescribeDefenseResourceTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResourceTemplates"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourceTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection templates that are associated with a protected object or protected object group.</p>
     * 
     * @param request DescribeDefenseResourceTemplatesRequest
     * @return DescribeDefenseResourceTemplatesResponse
     */
    public DescribeDefenseResourceTemplatesResponse describeDefenseResourceTemplates(DescribeDefenseResourceTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourceTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries protected objects by page.</p>
     * 
     * @param request DescribeDefenseResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseResourcesResponse
     */
    public DescribeDefenseResourcesResponse describeDefenseResourcesWithOptions(DescribeDefenseResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries protected objects by page.</p>
     * 
     * @param request DescribeDefenseResourcesRequest
     * @return DescribeDefenseResourcesResponse
     */
    public DescribeDefenseResourcesResponse describeDefenseResources(DescribeDefenseResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a protection rule.</p>
     * 
     * @param request DescribeDefenseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseRuleResponse
     */
    public DescribeDefenseRuleResponse describeDefenseRuleWithOptions(DescribeDefenseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a protection rule.</p>
     * 
     * @param request DescribeDefenseRuleRequest
     * @return DescribeDefenseRuleResponse
     */
    public DescribeDefenseRuleResponse describeDefenseRule(DescribeDefenseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护规则的统计信息</p>
     * 
     * @param request DescribeDefenseRuleStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseRuleStatisticsResponse
     */
    public DescribeDefenseRuleStatisticsResponse describeDefenseRuleStatisticsWithOptions(DescribeDefenseRuleStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fourthKey)) {
            query.put("FourthKey", request.fourthKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            query.put("PrimaryKey", request.primaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryKey)) {
            query.put("SecondaryKey", request.secondaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdKey)) {
            query.put("ThirdKey", request.thirdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseRuleStatistics"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseRuleStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护规则的统计信息</p>
     * 
     * @param request DescribeDefenseRuleStatisticsRequest
     * @return DescribeDefenseRuleStatisticsResponse
     */
    public DescribeDefenseRuleStatisticsResponse describeDefenseRuleStatistics(DescribeDefenseRuleStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseRuleStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries protection rules by page.</p>
     * 
     * @param request DescribeDefenseRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseRulesResponse
     */
    public DescribeDefenseRulesResponse describeDefenseRulesWithOptions(DescribeDefenseRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseRules"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries protection rules by page.</p>
     * 
     * @param request DescribeDefenseRulesRequest
     * @return DescribeDefenseRulesResponse
     */
    public DescribeDefenseRulesResponse describeDefenseRules(DescribeDefenseRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户防护场景的配置</p>
     * 
     * @param request DescribeDefenseSceneConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseSceneConfigResponse
     */
    public DescribeDefenseSceneConfigResponse describeDefenseSceneConfigWithOptions(DescribeDefenseSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configKey)) {
            query.put("ConfigKey", request.configKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseSceneConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseSceneConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户防护场景的配置</p>
     * 
     * @param request DescribeDefenseSceneConfigRequest
     * @return DescribeDefenseSceneConfigResponse
     */
    public DescribeDefenseSceneConfigResponse describeDefenseSceneConfig(DescribeDefenseSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseSceneConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a protection rule template.</p>
     * 
     * @param request DescribeDefenseTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseTemplateResponse
     */
    public DescribeDefenseTemplateResponse describeDefenseTemplateWithOptions(DescribeDefenseTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseTemplate"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a protection rule template.</p>
     * 
     * @param request DescribeDefenseTemplateRequest
     * @return DescribeDefenseTemplateResponse
     */
    public DescribeDefenseTemplateResponse describeDefenseTemplate(DescribeDefenseTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of protected object groups for which a protection template can take effect.</p>
     * 
     * @param request DescribeDefenseTemplateValidGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseTemplateValidGroupsResponse
     */
    public DescribeDefenseTemplateValidGroupsResponse describeDefenseTemplateValidGroupsWithOptions(DescribeDefenseTemplateValidGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseTemplateValidGroups"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseTemplateValidGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of protected object groups for which a protection template can take effect.</p>
     * 
     * @param request DescribeDefenseTemplateValidGroupsRequest
     * @return DescribeDefenseTemplateValidGroupsResponse
     */
    public DescribeDefenseTemplateValidGroupsResponse describeDefenseTemplateValidGroups(DescribeDefenseTemplateValidGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseTemplateValidGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询可以被自定义模板绑定的防护对象列表</p>
     * 
     * @param request DescribeDefenseTemplateValidResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseTemplateValidResourcesResponse
     */
    public DescribeDefenseTemplateValidResourcesResponse describeDefenseTemplateValidResourcesWithOptions(DescribeDefenseTemplateValidResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseTemplateValidResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseTemplateValidResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询可以被自定义模板绑定的防护对象列表</p>
     * 
     * @param request DescribeDefenseTemplateValidResourcesRequest
     * @return DescribeDefenseTemplateValidResourcesResponse
     */
    public DescribeDefenseTemplateValidResourcesResponse describeDefenseTemplateValidResources(DescribeDefenseTemplateValidResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseTemplateValidResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve protection templates.</p>
     * 
     * @param request DescribeDefenseTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefenseTemplatesResponse
     */
    public DescribeDefenseTemplatesResponse describeDefenseTemplatesWithOptions(DescribeDefenseTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseSubScene)) {
            query.put("DefenseSubScene", request.defenseSubScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefenseTemplates"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefenseTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve protection templates.</p>
     * 
     * @param request DescribeDefenseTemplatesRequest
     * @return DescribeDefenseTemplatesResponse
     */
    public DescribeDefenseTemplatesResponse describeDefenseTemplates(DescribeDefenseTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefenseTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the Domain Name System (DNS) settings of a domain name are properly configured.</p>
     * 
     * @param request DescribeDomainDNSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainDNSRecordResponse
     */
    public DescribeDomainDNSRecordResponse describeDomainDNSRecordWithOptions(DescribeDomainDNSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainDNSRecord"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainDNSRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the Domain Name System (DNS) settings of a domain name are properly configured.</p>
     * 
     * @param request DescribeDomainDNSRecordRequest
     * @return DescribeDomainDNSRecordResponse
     */
    public DescribeDomainDNSRecordResponse describeDomainDNSRecord(DescribeDomainDNSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainDNSRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a domain name that is added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeDomainDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainDetailResponse
     */
    public DescribeDomainDetailResponse describeDomainDetailWithOptions(DescribeDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainDetail"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a domain name that is added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeDomainDetailRequest
     * @return DescribeDomainDetailResponse
     */
    public DescribeDomainDetailResponse describeDomainDetail(DescribeDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名已使用的端口</p>
     * 
     * @param request DescribeDomainUsedPortsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainUsedPortsResponse
     */
    public DescribeDomainUsedPortsResponse describeDomainUsedPortsWithOptions(DescribeDomainUsedPortsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainUsedPorts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainUsedPortsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名已使用的端口</p>
     * 
     * @param request DescribeDomainUsedPortsRequest
     * @return DescribeDomainUsedPortsResponse
     */
    public DescribeDomainUsedPortsResponse describeDomainUsedPorts(DescribeDomainUsedPortsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainUsedPortsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backend)) {
            query.put("Backend", request.backend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomains"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic statistics of requests that are forwarded to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeFlowChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowChartResponse
     */
    public DescribeFlowChartResponse describeFlowChartWithOptions(DescribeFlowChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowChart"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic statistics of requests that are forwarded to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeFlowChartRequest
     * @return DescribeFlowChartResponse
     */
    public DescribeFlowChartResponse describeFlowChart(DescribeFlowChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protected objects that receive requests.</p>
     * 
     * @param request DescribeFlowTopResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowTopResourceResponse
     */
    public DescribeFlowTopResourceResponse describeFlowTopResourceWithOptions(DescribeFlowTopResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowTopResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowTopResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protected objects that receive requests.</p>
     * 
     * @param request DescribeFlowTopResourceRequest
     * @return DescribeFlowTopResourceResponse
     */
    public DescribeFlowTopResourceResponse describeFlowTopResource(DescribeFlowTopResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowTopResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 URLs that are used to initiate requests.</p>
     * 
     * @param request DescribeFlowTopUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowTopUrlResponse
     */
    public DescribeFlowTopUrlResponse describeFlowTopUrlWithOptions(DescribeFlowTopUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowTopUrl"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowTopUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 URLs that are used to initiate requests.</p>
     * 
     * @param request DescribeFlowTopUrlRequest
     * @return DescribeFlowTopUrlResponse
     */
    public DescribeFlowTopUrlResponse describeFlowTopUrl(DescribeFlowTopUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowTopUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the asset statistics provided by basic detection in the API security module.</p>
     * 
     * @param request DescribeFreeUserAssetCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFreeUserAssetCountResponse
     */
    public DescribeFreeUserAssetCountResponse describeFreeUserAssetCountWithOptions(DescribeFreeUserAssetCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFreeUserAssetCount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFreeUserAssetCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the asset statistics provided by basic detection in the API security module.</p>
     * 
     * @param request DescribeFreeUserAssetCountRequest
     * @return DescribeFreeUserAssetCountResponse
     */
    public DescribeFreeUserAssetCountResponse describeFreeUserAssetCount(DescribeFreeUserAssetCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFreeUserAssetCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of security events that are detected by using the basic detection feature of the API security module.</p>
     * 
     * @param request DescribeFreeUserEventCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFreeUserEventCountResponse
     */
    public DescribeFreeUserEventCountResponse describeFreeUserEventCountWithOptions(DescribeFreeUserEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFreeUserEventCount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFreeUserEventCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of security events that are detected by using the basic detection feature of the API security module.</p>
     * 
     * @param request DescribeFreeUserEventCountRequest
     * @return DescribeFreeUserEventCountResponse
     */
    public DescribeFreeUserEventCountResponse describeFreeUserEventCount(DescribeFreeUserEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFreeUserEventCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of security events on which basic detection is performed in the API security module.</p>
     * 
     * @param request DescribeFreeUserEventTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFreeUserEventTypesResponse
     */
    public DescribeFreeUserEventTypesResponse describeFreeUserEventTypesWithOptions(DescribeFreeUserEventTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFreeUserEventTypes"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFreeUserEventTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of security events on which basic detection is performed in the API security module.</p>
     * 
     * @param request DescribeFreeUserEventTypesRequest
     * @return DescribeFreeUserEventTypesResponse
     */
    public DescribeFreeUserEventTypesResponse describeFreeUserEventTypes(DescribeFreeUserEventTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFreeUserEventTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of security events on which basic detection is performed in the API security module.</p>
     * 
     * @param request DescribeFreeUserEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFreeUserEventsResponse
     */
    public DescribeFreeUserEventsResponse describeFreeUserEventsWithOptions(DescribeFreeUserEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFreeUserEvents"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFreeUserEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of security events on which basic detection is performed in the API security module.</p>
     * 
     * @param request DescribeFreeUserEventsRequest
     * @return DescribeFreeUserEventsResponse
     */
    public DescribeFreeUserEventsResponse describeFreeUserEvents(DescribeFreeUserEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFreeUserEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the system status of a node in a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudBasicMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudBasicMonitorResponse
     */
    public DescribeHybridCloudBasicMonitorResponse describeHybridCloudBasicMonitorWithOptions(DescribeHybridCloudBasicMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mid)) {
            query.put("Mid", request.mid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudBasicMonitor"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudBasicMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the system status of a node in a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudBasicMonitorRequest
     * @return DescribeHybridCloudBasicMonitorResponse
     */
    public DescribeHybridCloudBasicMonitorResponse describeHybridCloudBasicMonitor(DescribeHybridCloudBasicMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudBasicMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the rule information about a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudClusterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudClusterRuleResponse
     */
    public DescribeHybridCloudClusterRuleResponse describeHybridCloudClusterRuleWithOptions(DescribeHybridCloudClusterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudClusterRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudClusterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the rule information about a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudClusterRuleRequest
     * @return DescribeHybridCloudClusterRuleResponse
     */
    public DescribeHybridCloudClusterRuleResponse describeHybridCloudClusterRule(DescribeHybridCloudClusterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudClusterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>集群规则列表</p>
     * 
     * @param request DescribeHybridCloudClusterRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudClusterRulesResponse
     */
    public DescribeHybridCloudClusterRulesResponse describeHybridCloudClusterRulesWithOptions(DescribeHybridCloudClusterRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleContent)) {
            query.put("RuleContent", request.ruleContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleMatchType)) {
            query.put("RuleMatchType", request.ruleMatchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudClusterRules"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudClusterRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>集群规则列表</p>
     * 
     * @param request DescribeHybridCloudClusterRulesRequest
     * @return DescribeHybridCloudClusterRulesResponse
     */
    public DescribeHybridCloudClusterRulesResponse describeHybridCloudClusterRules(DescribeHybridCloudClusterRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudClusterRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>集群机器列表</p>
     * 
     * @param request DescribeHybridCloudClusterServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudClusterServersResponse
     */
    public DescribeHybridCloudClusterServersResponse describeHybridCloudClusterServersWithOptions(DescribeHybridCloudClusterServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudClusterServers"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudClusterServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>集群机器列表</p>
     * 
     * @param request DescribeHybridCloudClusterServersRequest
     * @return DescribeHybridCloudClusterServersResponse
     */
    public DescribeHybridCloudClusterServersResponse describeHybridCloudClusterServers(DescribeHybridCloudClusterServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudClusterServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of hybrid cloud clusters.</p>
     * 
     * @param request DescribeHybridCloudClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudClustersResponse
     */
    public DescribeHybridCloudClustersResponse describeHybridCloudClustersWithOptions(DescribeHybridCloudClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudClusters"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of hybrid cloud clusters.</p>
     * 
     * @param request DescribeHybridCloudClustersRequest
     * @return DescribeHybridCloudClustersResponse
     */
    public DescribeHybridCloudClustersResponse describeHybridCloudClusters(DescribeHybridCloudClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hybrid cloud node groups that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeHybridCloudGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudGroupsResponse
     */
    public DescribeHybridCloudGroupsResponse describeHybridCloudGroupsWithOptions(DescribeHybridCloudGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterProxyType)) {
            query.put("ClusterProxyType", request.clusterProxyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudGroups"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hybrid cloud node groups that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeHybridCloudGroupsRequest
     * @return DescribeHybridCloudGroupsResponse
     */
    public DescribeHybridCloudGroupsResponse describeHybridCloudGroups(DescribeHybridCloudGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of applications running on a hybrid cloud cluster node.</p>
     * 
     * @param request DescribeHybridCloudProcessMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudProcessMonitorResponse
     */
    public DescribeHybridCloudProcessMonitorResponse describeHybridCloudProcessMonitorWithOptions(DescribeHybridCloudProcessMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mid)) {
            query.put("Mid", request.mid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudProcessMonitor"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudProcessMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of applications running on a hybrid cloud cluster node.</p>
     * 
     * @param request DescribeHybridCloudProcessMonitorRequest
     * @return DescribeHybridCloudProcessMonitorResponse
     */
    public DescribeHybridCloudProcessMonitorResponse describeHybridCloudProcessMonitor(DescribeHybridCloudProcessMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudProcessMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of protection nodes that can be added to a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudProtectableCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudProtectableCountResponse
     */
    public DescribeHybridCloudProtectableCountResponse describeHybridCloudProtectableCountWithOptions(DescribeHybridCloudProtectableCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudProtectableCount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudProtectableCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of protection nodes that can be added to a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudProtectableCountRequest
     * @return DescribeHybridCloudProtectableCountResponse
     */
    public DescribeHybridCloudProtectableCountResponse describeHybridCloudProtectableCount(DescribeHybridCloudProtectableCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudProtectableCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询混合云域名详情</p>
     * 
     * @param request DescribeHybridCloudResourceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudResourceDetailResponse
     */
    public DescribeHybridCloudResourceDetailResponse describeHybridCloudResourceDetailWithOptions(DescribeHybridCloudResourceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backend)) {
            query.put("Backend", request.backend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameEnabled)) {
            query.put("CnameEnabled", request.cnameEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudResourceDetail"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudResourceDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询混合云域名详情</p>
     * 
     * @param request DescribeHybridCloudResourceDetailRequest
     * @return DescribeHybridCloudResourceDetailResponse
     */
    public DescribeHybridCloudResourceDetailResponse describeHybridCloudResourceDetail(DescribeHybridCloudResourceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudResourceDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names that are added to a Web Application Firewall (WAF) instance in hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudResourcesResponse
     */
    public DescribeHybridCloudResourcesResponse describeHybridCloudResourcesWithOptions(DescribeHybridCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backend)) {
            query.put("Backend", request.backend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameEnabled)) {
            query.put("CnameEnabled", request.cnameEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names that are added to a Web Application Firewall (WAF) instance in hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudResourcesRequest
     * @return DescribeHybridCloudResourcesResponse
     */
    public DescribeHybridCloudResourcesResponse describeHybridCloudResources(DescribeHybridCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取SDK信息</p>
     * 
     * @param request DescribeHybridCloudSdkServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudSdkServersResponse
     */
    public DescribeHybridCloudSdkServersResponse describeHybridCloudSdkServersWithOptions(DescribeHybridCloudSdkServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudSdkServers"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudSdkServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取SDK信息</p>
     * 
     * @param request DescribeHybridCloudSdkServersRequest
     * @return DescribeHybridCloudSdkServersResponse
     */
    public DescribeHybridCloudSdkServersResponse describeHybridCloudSdkServers(DescribeHybridCloudSdkServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudSdkServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the regions that the hybrid cloud mode supports, such as the Internet service providers (ISPs), continents, and cities.</p>
     * 
     * @param request DescribeHybridCloudServerRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudServerRegionsResponse
     */
    public DescribeHybridCloudServerRegionsResponse describeHybridCloudServerRegionsWithOptions(DescribeHybridCloudServerRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionType)) {
            query.put("RegionType", request.regionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudServerRegions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudServerRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the regions that the hybrid cloud mode supports, such as the Internet service providers (ISPs), continents, and cities.</p>
     * 
     * @param request DescribeHybridCloudServerRegionsRequest
     * @return DescribeHybridCloudServerRegionsResponse
     */
    public DescribeHybridCloudServerRegionsResponse describeHybridCloudServerRegions(DescribeHybridCloudServerRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudServerRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入区域</p>
     * 
     * @param request DescribeHybridCloudSupportRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudSupportRegionsResponse
     */
    public DescribeHybridCloudSupportRegionsResponse describeHybridCloudSupportRegionsWithOptions(DescribeHybridCloudSupportRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudSupportRegions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudSupportRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入区域</p>
     * 
     * @param request DescribeHybridCloudSupportRegionsRequest
     * @return DescribeHybridCloudSupportRegionsResponse
     */
    public DescribeHybridCloudSupportRegionsResponse describeHybridCloudSupportRegions(DescribeHybridCloudSupportRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudSupportRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries servers that are not assigned to a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudUnassignedMachinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudUnassignedMachinesResponse
     */
    public DescribeHybridCloudUnassignedMachinesResponse describeHybridCloudUnassignedMachinesWithOptions(DescribeHybridCloudUnassignedMachinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudUnassignedMachines"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudUnassignedMachinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries servers that are not assigned to a hybrid cloud cluster.</p>
     * 
     * @param request DescribeHybridCloudUnassignedMachinesRequest
     * @return DescribeHybridCloudUnassignedMachinesResponse
     */
    public DescribeHybridCloudUnassignedMachinesResponse describeHybridCloudUnassignedMachines(DescribeHybridCloudUnassignedMachinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudUnassignedMachinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports that are not supported by the hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudUnsupportPortsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudUnsupportPortsResponse
     */
    public DescribeHybridCloudUnsupportPortsResponse describeHybridCloudUnsupportPortsWithOptions(DescribeHybridCloudUnsupportPortsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudUnsupportPorts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudUnsupportPortsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports that are not supported by the hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudUnsupportPortsRequest
     * @return DescribeHybridCloudUnsupportPortsResponse
     */
    public DescribeHybridCloudUnsupportPortsResponse describeHybridCloudUnsupportPorts(DescribeHybridCloudUnsupportPortsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudUnsupportPortsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the HTTP and HTTPS ports that you can use when you add a domain name to Web Application Firewall (WAF) in hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridCloudUserResponse
     */
    public DescribeHybridCloudUserResponse describeHybridCloudUserWithOptions(DescribeHybridCloudUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridCloudUser"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridCloudUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the HTTP and HTTPS ports that you can use when you add a domain name to Web Application Firewall (WAF) in hybrid cloud mode.</p>
     * 
     * @param request DescribeHybridCloudUserRequest
     * @return DescribeHybridCloudUserResponse
     */
    public DescribeHybridCloudUserResponse describeHybridCloudUser(DescribeHybridCloudUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridCloudUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Web Application Firewall (WAF) instance within the current Alibaba Cloud account.</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Web Application Firewall (WAF) instance within the current Alibaba Cloud account.</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持的海外IP区域封禁支持的国际及地域。</p>
     * 
     * @param request DescribeIpAbroadCountryInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpAbroadCountryInfosResponse
     */
    public DescribeIpAbroadCountryInfosResponse describeIpAbroadCountryInfosWithOptions(DescribeIpAbroadCountryInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abroadRegion)) {
            query.put("AbroadRegion", request.abroadRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpAbroadCountryInfos"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpAbroadCountryInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持的海外IP区域封禁支持的国际及地域。</p>
     * 
     * @param request DescribeIpAbroadCountryInfosRequest
     * @return DescribeIpAbroadCountryInfosResponse
     */
    public DescribeIpAbroadCountryInfosResponse describeIpAbroadCountryInfos(DescribeIpAbroadCountryInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpAbroadCountryInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a hybrid cloud log delivery configuration.</p>
     * 
     * @param request DescribeLogDeliveryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogDeliveryConfigResponse
     */
    public DescribeLogDeliveryConfigResponse describeLogDeliveryConfigWithOptions(DescribeLogDeliveryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryName)) {
            query.put("DeliveryName", request.deliveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogDeliveryConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogDeliveryConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a hybrid cloud log delivery configuration.</p>
     * 
     * @param request DescribeLogDeliveryConfigRequest
     * @return DescribeLogDeliveryConfigResponse
     */
    public DescribeLogDeliveryConfigResponse describeLogDeliveryConfig(DescribeLogDeliveryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogDeliveryConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all hybrid cloud log delivery configurations.</p>
     * 
     * @param request DescribeLogDeliveryConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogDeliveryConfigsResponse
     */
    public DescribeLogDeliveryConfigsResponse describeLogDeliveryConfigsWithOptions(DescribeLogDeliveryConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryNameLike)) {
            query.put("DeliveryNameLike", request.deliveryNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogDeliveryConfigs"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogDeliveryConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all hybrid cloud log delivery configurations.</p>
     * 
     * @param request DescribeLogDeliveryConfigsRequest
     * @return DescribeLogDeliveryConfigsResponse
     */
    public DescribeLogDeliveryConfigsResponse describeLogDeliveryConfigs(DescribeLogDeliveryConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogDeliveryConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP addresses in an IP address blacklist for major event protection by page.</p>
     * 
     * @param request DescribeMajorProtectionBlackIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMajorProtectionBlackIpsResponse
     */
    public DescribeMajorProtectionBlackIpsResponse describeMajorProtectionBlackIpsWithOptions(DescribeMajorProtectionBlackIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipLike)) {
            query.put("IpLike", request.ipLike);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMajorProtectionBlackIps"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMajorProtectionBlackIpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries IP addresses in an IP address blacklist for major event protection by page.</p>
     * 
     * @param request DescribeMajorProtectionBlackIpsRequest
     * @return DescribeMajorProtectionBlackIpsResponse
     */
    public DescribeMajorProtectionBlackIpsResponse describeMajorProtectionBlackIps(DescribeMajorProtectionBlackIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMajorProtectionBlackIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about members.</p>
     * 
     * @param request DescribeMemberAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberAccountsResponse
     */
    public DescribeMemberAccountsResponse describeMemberAccountsWithOptions(DescribeMemberAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountStatus)) {
            query.put("AccountStatus", request.accountStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberAccounts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about members.</p>
     * 
     * @param request DescribeMemberAccountsRequest
     * @return DescribeMemberAccountsResponse
     */
    public DescribeMemberAccountsResponse describeMemberAccounts(DescribeMemberAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves time-series data for all network traffic, including both malicious and legitimate requests.</p>
     * 
     * @param tmpReq DescribeNetworkFlowTimeSeriesMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkFlowTimeSeriesMetricResponse
     */
    public DescribeNetworkFlowTimeSeriesMetricResponse describeNetworkFlowTimeSeriesMetricWithOptions(DescribeNetworkFlowTimeSeriesMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeNetworkFlowTimeSeriesMetricShrinkRequest request = new DescribeNetworkFlowTimeSeriesMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkFlowTimeSeriesMetric"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkFlowTimeSeriesMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves time-series data for all network traffic, including both malicious and legitimate requests.</p>
     * 
     * @param request DescribeNetworkFlowTimeSeriesMetricRequest
     * @return DescribeNetworkFlowTimeSeriesMetricResponse
     */
    public DescribeNetworkFlowTimeSeriesMetricResponse describeNetworkFlowTimeSeriesMetric(DescribeNetworkFlowTimeSeriesMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkFlowTimeSeriesMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves top aggregated traffic statistics, sorted by various dimensions, including malicious and legitimate requests.</p>
     * 
     * @param tmpReq DescribeNetworkFlowTopNMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkFlowTopNMetricResponse
     */
    public DescribeNetworkFlowTopNMetricResponse describeNetworkFlowTopNMetricWithOptions(DescribeNetworkFlowTopNMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeNetworkFlowTopNMetricShrinkRequest request = new DescribeNetworkFlowTopNMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkFlowTopNMetric"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkFlowTopNMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves top aggregated traffic statistics, sorted by various dimensions, including malicious and legitimate requests.</p>
     * 
     * @param request DescribeNetworkFlowTopNMetricRequest
     * @return DescribeNetworkFlowTopNMetricResponse
     */
    public DescribeNetworkFlowTopNMetricResponse describeNetworkFlowTopNMetric(DescribeNetworkFlowTopNMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkFlowTopNMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection status of Web Application Firewall (WAF).</p>
     * 
     * @param request DescribePauseProtectionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePauseProtectionStatusResponse
     */
    public DescribePauseProtectionStatusResponse describePauseProtectionStatusWithOptions(DescribePauseProtectionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePauseProtectionStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePauseProtectionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the protection status of Web Application Firewall (WAF).</p>
     * 
     * @param request DescribePauseProtectionStatusRequest
     * @return DescribePauseProtectionStatusResponse
     */
    public DescribePauseProtectionStatusResponse describePauseProtectionStatus(DescribePauseProtectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePauseProtectionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the queries per second (QPS) statistics of a WAF instance.</p>
     * 
     * @param request DescribePeakTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePeakTrendResponse
     */
    public DescribePeakTrendResponse describePeakTrendWithOptions(DescribePeakTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePeakTrend"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePeakTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the queries per second (QPS) statistics of a WAF instance.</p>
     * 
     * @param request DescribePeakTrendRequest
     * @return DescribePeakTrendResponse
     */
    public DescribePeakTrendResponse describePeakTrend(DescribePeakTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePeakTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开启POC的功能信息</p>
     * 
     * @param request DescribePocFunctionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePocFunctionsResponse
     */
    public DescribePocFunctionsResponse describePocFunctionsWithOptions(DescribePocFunctionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePocFunctions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePocFunctionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开启POC的功能信息</p>
     * 
     * @param request DescribePocFunctionsRequest
     * @return DescribePocFunctionsResponse
     */
    public DescribePocFunctionsResponse describePocFunctions(DescribePocFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePocFunctionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud service instances to be added to Web Application Firewall (WAF) in transparent proxy mode.</p>
     * 
     * @param request DescribeProductInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductInstancesResponse
     */
    public DescribeProductInstancesResponse describeProductInstancesWithOptions(DescribeProductInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceAccessStatus)) {
            query.put("ResourceInstanceAccessStatus", request.resourceInstanceAccessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceIp)) {
            query.put("ResourceInstanceIp", request.resourceInstanceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceName)) {
            query.put("ResourceInstanceName", request.resourceInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIp)) {
            query.put("ResourceIp", request.resourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductInstances"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud service instances to be added to Web Application Firewall (WAF) in transparent proxy mode.</p>
     * 
     * @param request DescribeProductInstancesRequest
     * @return DescribeProductInstancesResponse
     */
    public DescribeProductInstancesResponse describeProductInstances(DescribeProductInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names that are added to Web Application Firewall (WAF) and penalized for failing to obtain an Internet Content Provider (ICP) filing.</p>
     * 
     * @param request DescribePunishedDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePunishedDomainsResponse
     */
    public DescribePunishedDomainsResponse describePunishedDomainsWithOptions(DescribePunishedDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishType)) {
            query.put("PunishType", request.punishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePunishedDomains"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePunishedDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names that are added to Web Application Firewall (WAF) and penalized for failing to obtain an Internet Content Provider (ICP) filing.</p>
     * 
     * @param request DescribePunishedDomainsRequest
     * @return DescribePunishedDomainsResponse
     */
    public DescribePunishedDomainsResponse describePunishedDomains(DescribePunishedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePunishedDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询关联规则</p>
     * 
     * @param request DescribeRelatedDefenseRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRelatedDefenseRulesResponse
     */
    public DescribeRelatedDefenseRulesResponse describeRelatedDefenseRulesWithOptions(DescribeRelatedDefenseRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRelatedDefenseRules"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRelatedDefenseRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询关联规则</p>
     * 
     * @param request DescribeRelatedDefenseRulesRequest
     * @return DescribeRelatedDefenseRulesResponse
     */
    public DescribeRelatedDefenseRulesResponse describeRelatedDefenseRules(DescribeRelatedDefenseRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRelatedDefenseRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates that are used in cloud service instances. The certificates returned include the certificates within the delegated administrator account and the certificates within members to which specific instances belong. For example, the delegated administrator account has certificate 1, instance lb-xx-1 belongs to member B, and member B has certificate 2. If you specify instance lb-xx-1 in the request, certificate 1 and certificate 2 are returned.</p>
     * 
     * @param request DescribeResourceInstanceCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceInstanceCertsResponse
     */
    public DescribeResourceInstanceCertsResponse describeResourceInstanceCertsWithOptions(DescribeResourceInstanceCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceInstanceCerts"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceInstanceCertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the certificates that are used in cloud service instances. The certificates returned include the certificates within the delegated administrator account and the certificates within members to which specific instances belong. For example, the delegated administrator account has certificate 1, instance lb-xx-1 belongs to member B, and member B has certificate 2. If you specify instance lb-xx-1 in the request, certificate 1 and certificate 2 are returned.</p>
     * 
     * @param request DescribeResourceInstanceCertsRequest
     * @return DescribeResourceInstanceCertsResponse
     */
    public DescribeResourceInstanceCertsResponse describeResourceInstanceCerts(DescribeResourceInstanceCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceInstanceCertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象日志外发状态</p>
     * 
     * @param request DescribeResourceLogDeliveryStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceLogDeliveryStatusResponse
     */
    public DescribeResourceLogDeliveryStatusResponse describeResourceLogDeliveryStatusWithOptions(DescribeResourceLogDeliveryStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLogDeliveryStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLogDeliveryStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象日志外发状态</p>
     * 
     * @param request DescribeResourceLogDeliveryStatusRequest
     * @return DescribeResourceLogDeliveryStatusResponse
     */
    public DescribeResourceLogDeliveryStatusResponse describeResourceLogDeliveryStatus(DescribeResourceLogDeliveryStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceLogDeliveryStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象日志字段配置</p>
     * 
     * @param request DescribeResourceLogFieldConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceLogFieldConfigResponse
     */
    public DescribeResourceLogFieldConfigResponse describeResourceLogFieldConfigWithOptions(DescribeResourceLogFieldConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLogFieldConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLogFieldConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询防护对象日志字段配置</p>
     * 
     * @param request DescribeResourceLogFieldConfigRequest
     * @return DescribeResourceLogFieldConfigResponse
     */
    public DescribeResourceLogFieldConfigResponse describeResourceLogFieldConfig(DescribeResourceLogFieldConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceLogFieldConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the log collection feature is enabled for a protected object.</p>
     * 
     * @param request DescribeResourceLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceLogStatusResponse
     */
    public DescribeResourceLogStatusResponse describeResourceLogStatusWithOptions(DescribeResourceLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceLogStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceLogStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the log collection feature is enabled for a protected object.</p>
     * 
     * @param request DescribeResourceLogStatusRequest
     * @return DescribeResourceLogStatusResponse
     */
    public DescribeResourceLogStatusResponse describeResourceLogStatus(DescribeResourceLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceLogStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports of a cloud service instance that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeResourcePortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourcePortResponse
     */
    public DescribeResourcePortResponse describeResourcePortWithOptions(DescribeResourcePortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourcePort"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcePortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports of a cloud service instance that are added to Web Application Firewall (WAF).</p>
     * 
     * @param request DescribeResourcePortRequest
     * @return DescribeResourcePortResponse
     */
    public DescribeResourcePortResponse describeResourcePort(DescribeResourcePortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcePortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region IDs of the resources that are added to Web Application Firewall (WAF) by using the SDK integration mode. The resources refer to Application Load Balancer (ALB) and Microservices Engine (MSE) instances.</p>
     * 
     * @param request DescribeResourceRegionIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceRegionIdResponse
     */
    public DescribeResourceRegionIdResponse describeResourceRegionIdWithOptions(DescribeResourceRegionIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceRegionId"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceRegionIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region IDs of the resources that are added to Web Application Firewall (WAF) by using the SDK integration mode. The resources refer to Application Load Balancer (ALB) and Microservices Engine (MSE) instances.</p>
     * 
     * @param request DescribeResourceRegionIdRequest
     * @return DescribeResourceRegionIdResponse
     */
    public DescribeResourceRegionIdResponse describeResourceRegionId(DescribeResourceRegionIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceRegionIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region IDs of the Classic Load Balancer (CLB) and Elastic Compute Service (ECS) instances that are added to Web Application Firewall (WAF) in cloud native mode.</p>
     * 
     * @param request DescribeResourceSupportRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceSupportRegionsResponse
     */
    public DescribeResourceSupportRegionsResponse describeResourceSupportRegionsWithOptions(DescribeResourceSupportRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceSupportRegions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceSupportRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region IDs of the Classic Load Balancer (CLB) and Elastic Compute Service (ECS) instances that are added to Web Application Firewall (WAF) in cloud native mode.</p>
     * 
     * @param request DescribeResourceSupportRegionsRequest
     * @return DescribeResourceSupportRegionsResponse
     */
    public DescribeResourceSupportRegionsResponse describeResourceSupportRegions(DescribeResourceSupportRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceSupportRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trend of the number of error codes that are returned to clients or Web Application Firewall (WAF). The error codes include 302, 405, 444, 499, and 5XX.</p>
     * 
     * @param request DescribeResponseCodeTrendGraphRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResponseCodeTrendGraphResponse
     */
    public DescribeResponseCodeTrendGraphResponse describeResponseCodeTrendGraphWithOptions(DescribeResponseCodeTrendGraphRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResponseCodeTrendGraph"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResponseCodeTrendGraphResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trend of the number of error codes that are returned to clients or Web Application Firewall (WAF). The error codes include 302, 405, 444, 499, and 5XX.</p>
     * 
     * @param request DescribeResponseCodeTrendGraphRequest
     * @return DescribeResponseCodeTrendGraphResponse
     */
    public DescribeResponseCodeTrendGraphResponse describeResponseCodeTrendGraph(DescribeResponseCodeTrendGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResponseCodeTrendGraphWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询授权状态</p>
     * 
     * @param request DescribeRoleAuthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRoleAuthStatusResponse
     */
    public DescribeRoleAuthStatusResponse describeRoleAuthStatusWithOptions(DescribeRoleAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoleAuthStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoleAuthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询授权状态</p>
     * 
     * @param request DescribeRoleAuthStatusRequest
     * @return DescribeRoleAuthStatusResponse
     */
    public DescribeRoleAuthStatusResponse describeRoleAuthStatus(DescribeRoleAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoleAuthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regular expression rule groups by page.</p>
     * 
     * @param request DescribeRuleGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleGroupsResponse
     */
    public DescribeRuleGroupsResponse describeRuleGroupsWithOptions(DescribeRuleGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("SearchValue", request.searchValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleGroups"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regular expression rule groups by page.</p>
     * 
     * @param request DescribeRuleGroupsRequest
     * @return DescribeRuleGroupsResponse
     */
    public DescribeRuleGroupsResponse describeRuleGroups(DescribeRuleGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 IP addresses from which attacks are initiated.</p>
     * 
     * @param request DescribeRuleHitsTopClientIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopClientIpResponse
     */
    public DescribeRuleHitsTopClientIpResponse describeRuleHitsTopClientIpWithOptions(DescribeRuleHitsTopClientIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopClientIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopClientIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 IP addresses from which attacks are initiated.</p>
     * 
     * @param request DescribeRuleHitsTopClientIpRequest
     * @return DescribeRuleHitsTopClientIpResponse
     */
    public DescribeRuleHitsTopClientIpResponse describeRuleHitsTopClientIp(DescribeRuleHitsTopClientIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopClientIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protected objects that trigger protection rules.</p>
     * 
     * @param request DescribeRuleHitsTopResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopResourceResponse
     */
    public DescribeRuleHitsTopResourceResponse describeRuleHitsTopResourceWithOptions(DescribeRuleHitsTopResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protected objects that trigger protection rules.</p>
     * 
     * @param request DescribeRuleHitsTopResourceRequest
     * @return DescribeRuleHitsTopResourceResponse
     */
    public DescribeRuleHitsTopResourceResponse describeRuleHitsTopResource(DescribeRuleHitsTopResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of the top 10 protection rules that are matched by requests.</p>
     * 
     * @param request DescribeRuleHitsTopRuleIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopRuleIdResponse
     */
    public DescribeRuleHitsTopRuleIdResponse describeRuleHitsTopRuleIdWithOptions(DescribeRuleHitsTopRuleIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGroupResource)) {
            query.put("IsGroupResource", request.isGroupResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopRuleId"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopRuleIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IDs of the top 10 protection rules that are matched by requests.</p>
     * 
     * @param request DescribeRuleHitsTopRuleIdRequest
     * @return DescribeRuleHitsTopRuleIdResponse
     */
    public DescribeRuleHitsTopRuleIdResponse describeRuleHitsTopRuleId(DescribeRuleHitsTopRuleIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopRuleIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protection modules that are matched.</p>
     * 
     * @param request DescribeRuleHitsTopTuleTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopTuleTypeResponse
     */
    public DescribeRuleHitsTopTuleTypeResponse describeRuleHitsTopTuleTypeWithOptions(DescribeRuleHitsTopTuleTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopTuleType"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopTuleTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 protection modules that are matched.</p>
     * 
     * @param request DescribeRuleHitsTopTuleTypeRequest
     * @return DescribeRuleHitsTopTuleTypeResponse
     */
    public DescribeRuleHitsTopTuleTypeResponse describeRuleHitsTopTuleType(DescribeRuleHitsTopTuleTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopTuleTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 user agents that are used to initiate attacks.</p>
     * 
     * @param request DescribeRuleHitsTopUaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopUaResponse
     */
    public DescribeRuleHitsTopUaResponse describeRuleHitsTopUaWithOptions(DescribeRuleHitsTopUaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopUa"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopUaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 user agents that are used to initiate attacks.</p>
     * 
     * @param request DescribeRuleHitsTopUaRequest
     * @return DescribeRuleHitsTopUaResponse
     */
    public DescribeRuleHitsTopUaResponse describeRuleHitsTopUa(DescribeRuleHitsTopUaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopUaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 URLs that trigger protection rules.</p>
     * 
     * @param request DescribeRuleHitsTopUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitsTopUrlResponse
     */
    public DescribeRuleHitsTopUrlResponse describeRuleHitsTopUrlWithOptions(DescribeRuleHitsTopUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHitsTopUrl"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitsTopUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 URLs that trigger protection rules.</p>
     * 
     * @param request DescribeRuleHitsTopUrlRequest
     * @return DescribeRuleHitsTopUrlResponse
     */
    public DescribeRuleHitsTopUrlResponse describeRuleHitsTopUrl(DescribeRuleHitsTopUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitsTopUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of attack traffic. Each log records the details of a request that matches protection rules.</p>
     * 
     * @param tmpReq DescribeSecurityEventLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventLogsResponse
     */
    public DescribeSecurityEventLogsResponse describeSecurityEventLogsWithOptions(DescribeSecurityEventLogsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSecurityEventLogsShrinkRequest request = new DescribeSecurityEventLogsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventLogs"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of attack traffic. Each log records the details of a request that matches protection rules.</p>
     * 
     * @param request DescribeSecurityEventLogsRequest
     * @return DescribeSecurityEventLogsResponse
     */
    public DescribeSecurityEventLogsResponse describeSecurityEventLogs(DescribeSecurityEventLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the time series data of attack traffic. Attack requests refer to requests that match protection rules and are identified as risky.</p>
     * 
     * @param tmpReq DescribeSecurityEventTimeSeriesMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventTimeSeriesMetricResponse
     */
    public DescribeSecurityEventTimeSeriesMetricResponse describeSecurityEventTimeSeriesMetricWithOptions(DescribeSecurityEventTimeSeriesMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSecurityEventTimeSeriesMetricShrinkRequest request = new DescribeSecurityEventTimeSeriesMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventTimeSeriesMetric"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventTimeSeriesMetricResponse());
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the time series data of attack traffic. Attack requests refer to requests that match protection rules and are identified as risky.</p>
     * 
     * @param request DescribeSecurityEventTimeSeriesMetricRequest
     * @return DescribeSecurityEventTimeSeriesMetricResponse
     */
    public DescribeSecurityEventTimeSeriesMetricResponse describeSecurityEventTimeSeriesMetric(DescribeSecurityEventTimeSeriesMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventTimeSeriesMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries top N data entries of attack traffic. The system performs statistical aggregation on attack traffic from specific dimensions and returns top N data entries.</p>
     * 
     * @param tmpReq DescribeSecurityEventTopNMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventTopNMetricResponse
     */
    public DescribeSecurityEventTopNMetricResponse describeSecurityEventTopNMetricWithOptions(DescribeSecurityEventTopNMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSecurityEventTopNMetricShrinkRequest request = new DescribeSecurityEventTopNMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventTopNMetric"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventTopNMetricResponse());
    }

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries top N data entries of attack traffic. The system performs statistical aggregation on attack traffic from specific dimensions and returns top N data entries.</p>
     * 
     * @param request DescribeSecurityEventTopNMetricRequest
     * @return DescribeSecurityEventTopNMetricResponse
     */
    public DescribeSecurityEventTopNMetricResponse describeSecurityEventTopNMetric(DescribeSecurityEventTopNMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventTopNMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the personal information-related APIs and domain names.</p>
     * 
     * @param request DescribeSensitiveApiStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveApiStatisticResponse
     */
    public DescribeSensitiveApiStatisticResponse describeSensitiveApiStatisticWithOptions(DescribeSensitiveApiStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveApiStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveApiStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the personal information-related APIs and domain names.</p>
     * 
     * @param request DescribeSensitiveApiStatisticRequest
     * @return DescribeSensitiveApiStatisticResponse
     */
    public DescribeSensitiveApiStatisticResponse describeSensitiveApiStatistic(DescribeSensitiveApiStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveApiStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the compliance check results of API security.</p>
     * 
     * @param request DescribeSensitiveDetectionResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveDetectionResultResponse
     */
    public DescribeSensitiveDetectionResultResponse describeSensitiveDetectionResultWithOptions(DescribeSensitiveDetectionResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveDetectionResult"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveDetectionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the compliance check results of API security.</p>
     * 
     * @param request DescribeSensitiveDetectionResultRequest
     * @return DescribeSensitiveDetectionResultResponse
     */
    public DescribeSensitiveDetectionResultResponse describeSensitiveDetectionResult(DescribeSensitiveDetectionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveDetectionResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic distribution of personal information records involved in cross-border data transfer.</p>
     * 
     * @param request DescribeSensitiveOutboundDistributionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveOutboundDistributionResponse
     */
    public DescribeSensitiveOutboundDistributionResponse describeSensitiveOutboundDistributionWithOptions(DescribeSensitiveOutboundDistributionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveOutboundDistribution"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveOutboundDistributionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic distribution of personal information records involved in cross-border data transfer.</p>
     * 
     * @param request DescribeSensitiveOutboundDistributionRequest
     * @return DescribeSensitiveOutboundDistributionResponse
     */
    public DescribeSensitiveOutboundDistributionResponse describeSensitiveOutboundDistribution(DescribeSensitiveOutboundDistributionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveOutboundDistributionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data types of personal information involved in cross-border data transfer.</p>
     * 
     * @param request DescribeSensitiveOutboundStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveOutboundStatisticResponse
     */
    public DescribeSensitiveOutboundStatisticResponse describeSensitiveOutboundStatisticWithOptions(DescribeSensitiveOutboundStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionResult)) {
            query.put("DetectionResult", request.detectionResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderWay)) {
            query.put("OrderWay", request.orderWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveCode)) {
            query.put("SensitiveCode", request.sensitiveCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveLevel)) {
            query.put("SensitiveLevel", request.sensitiveLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveType)) {
            query.put("SensitiveType", request.sensitiveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveOutboundStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveOutboundStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data types of personal information involved in cross-border data transfer.</p>
     * 
     * @param request DescribeSensitiveOutboundStatisticRequest
     * @return DescribeSensitiveOutboundStatisticResponse
     */
    public DescribeSensitiveOutboundStatisticResponse describeSensitiveOutboundStatistic(DescribeSensitiveOutboundStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveOutboundStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of cross-border data transfer of personal information.</p>
     * 
     * @param request DescribeSensitiveOutboundTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveOutboundTrendResponse
     */
    public DescribeSensitiveOutboundTrendResponse describeSensitiveOutboundTrendWithOptions(DescribeSensitiveOutboundTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveOutboundTrend"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveOutboundTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of cross-border data transfer of personal information.</p>
     * 
     * @param request DescribeSensitiveOutboundTrendRequest
     * @return DescribeSensitiveOutboundTrendResponse
     */
    public DescribeSensitiveOutboundTrendResponse describeSensitiveOutboundTrend(DescribeSensitiveOutboundTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveOutboundTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access logs of sensitive data.</p>
     * 
     * @param request DescribeSensitiveRequestLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveRequestLogResponse
     */
    public DescribeSensitiveRequestLogResponse describeSensitiveRequestLogWithOptions(DescribeSensitiveRequestLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiFormat)) {
            query.put("ApiFormat", request.apiFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchedHost)) {
            query.put("MatchedHost", request.matchedHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveCode)) {
            query.put("SensitiveCode", request.sensitiveCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveData)) {
            query.put("SensitiveData", request.sensitiveData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveRequestLog"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveRequestLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access logs of sensitive data.</p>
     * 
     * @param request DescribeSensitiveRequestLogRequest
     * @return DescribeSensitiveRequestLogResponse
     */
    public DescribeSensitiveRequestLogResponse describeSensitiveRequestLog(DescribeSensitiveRequestLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveRequestLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tracing results of sensitive data.</p>
     * 
     * @param request DescribeSensitiveRequestsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveRequestsResponse
     */
    public DescribeSensitiveRequestsResponse describeSensitiveRequestsWithOptions(DescribeSensitiveRequestsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveCode)) {
            query.put("SensitiveCode", request.sensitiveCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveData)) {
            query.put("SensitiveData", request.sensitiveData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveRequests"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveRequestsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tracing results of sensitive data.</p>
     * 
     * @param request DescribeSensitiveRequestsRequest
     * @return DescribeSensitiveRequestsResponse
     */
    public DescribeSensitiveRequestsResponse describeSensitiveRequests(DescribeSensitiveRequestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveRequestsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sensitive data statistics of the tracing and auditing feature.</p>
     * 
     * @param request DescribeSensitiveStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveStatisticResponse
     */
    public DescribeSensitiveStatisticResponse describeSensitiveStatisticWithOptions(DescribeSensitiveStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticType)) {
            query.put("StatisticType", request.statisticType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveStatistic"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sensitive data statistics of the tracing and auditing feature.</p>
     * 
     * @param request DescribeSensitiveStatisticRequest
     * @return DescribeSensitiveStatisticResponse
     */
    public DescribeSensitiveStatisticResponse describeSensitiveStatistic(DescribeSensitiveStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether Web Application Firewall (WAF) is authorized to access Logstores.</p>
     * 
     * @param request DescribeSlsAuthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsAuthStatusResponse
     */
    public DescribeSlsAuthStatusResponse describeSlsAuthStatusWithOptions(DescribeSlsAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsAuthStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsAuthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether Web Application Firewall (WAF) is authorized to access Logstores.</p>
     * 
     * @param request DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    public DescribeSlsAuthStatusResponse describeSlsAuthStatus(DescribeSlsAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsAuthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Logstore, such as the total capacity, storage duration, and used capacity.</p>
     * 
     * @param request DescribeSlsLogStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsLogStoreResponse
     */
    public DescribeSlsLogStoreResponse describeSlsLogStoreWithOptions(DescribeSlsLogStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsLogStore"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsLogStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Logstore, such as the total capacity, storage duration, and used capacity.</p>
     * 
     * @param request DescribeSlsLogStoreRequest
     * @return DescribeSlsLogStoreResponse
     */
    public DescribeSlsLogStoreResponse describeSlsLogStore(DescribeSlsLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsLogStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Simple Log Service Logstore.</p>
     * 
     * @param request DescribeSlsLogStoreStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsLogStoreStatusResponse
     */
    public DescribeSlsLogStoreStatusResponse describeSlsLogStoreStatusWithOptions(DescribeSlsLogStoreStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsLogStoreStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsLogStoreStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Simple Log Service Logstore.</p>
     * 
     * @param request DescribeSlsLogStoreStatusRequest
     * @return DescribeSlsLogStoreStatusResponse
     */
    public DescribeSlsLogStoreStatusResponse describeSlsLogStoreStatus(DescribeSlsLogStoreStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsLogStoreStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of protected resources for which a protection template takes effect.</p>
     * 
     * @param request DescribeTemplateResourceCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateResourceCountResponse
     */
    public DescribeTemplateResourceCountResponse describeTemplateResourceCountWithOptions(DescribeTemplateResourceCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateResourceCount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateResourceCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of protected resources for which a protection template takes effect.</p>
     * 
     * @param request DescribeTemplateResourceCountRequest
     * @return DescribeTemplateResourceCountResponse
     */
    public DescribeTemplateResourceCountResponse describeTemplateResourceCount(DescribeTemplateResourceCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateResourceCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated to a protection rule template.</p>
     * 
     * @param request DescribeTemplateResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateResourcesResponse
     */
    public DescribeTemplateResourcesResponse describeTemplateResourcesWithOptions(DescribeTemplateResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetApi)) {
            query.put("AssetApi", request.assetApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated to a protection rule template.</p>
     * 
     * @param request DescribeTemplateResourcesRequest
     * @return DescribeTemplateResourcesResponse
     */
    public DescribeTemplateResourcesResponse describeTemplateResources(DescribeTemplateResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看攻击事件列表</p>
     * 
     * @param request DescribeThreatEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeThreatEventResponse
     */
    public DescribeThreatEventResponse describeThreatEventWithOptions(DescribeThreatEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeThreatEvent"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeThreatEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看攻击事件列表</p>
     * 
     * @param request DescribeThreatEventRequest
     * @return DescribeThreatEventResponse
     */
    public DescribeThreatEventResponse describeThreatEvent(DescribeThreatEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeThreatEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看威胁事件详情</p>
     * 
     * @param request DescribeThreatEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeThreatEventDetailResponse
     */
    public DescribeThreatEventDetailResponse describeThreatEventDetailWithOptions(DescribeThreatEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeThreatEventDetail"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeThreatEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看威胁事件详情</p>
     * 
     * @param request DescribeThreatEventDetailRequest
     * @return DescribeThreatEventDetailResponse
     */
    public DescribeThreatEventDetailResponse describeThreatEventDetail(DescribeThreatEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeThreatEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of API security risks.</p>
     * 
     * @param request DescribeUserAbnormalTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAbnormalTrendResponse
     */
    public DescribeUserAbnormalTrendResponse describeUserAbnormalTrendWithOptions(DescribeUserAbnormalTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAbnormalTrend"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAbnormalTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of API security risks.</p>
     * 
     * @param request DescribeUserAbnormalTrendRequest
     * @return DescribeUserAbnormalTrendResponse
     */
    public DescribeUserAbnormalTrendResponse describeUserAbnormalTrend(DescribeUserAbnormalTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAbnormalTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types and statistics of risks in the API security module.</p>
     * 
     * @param request DescribeUserAbnormalTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAbnormalTypeResponse
     */
    public DescribeUserAbnormalTypeResponse describeUserAbnormalTypeWithOptions(DescribeUserAbnormalTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatusList)) {
            query.put("UserStatusList", request.userStatusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAbnormalType"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAbnormalTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types and statistics of risks in the API security module.</p>
     * 
     * @param request DescribeUserAbnormalTypeRequest
     * @return DescribeUserAbnormalTypeResponse
     */
    public DescribeUserAbnormalTypeResponse describeUserAbnormalType(DescribeUserAbnormalTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAbnormalTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic statistics of an API.</p>
     * 
     * @param request DescribeUserApiRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserApiRequestResponse
     */
    public DescribeUserApiRequestResponse describeUserApiRequestWithOptions(DescribeUserApiRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiFormat)) {
            query.put("ApiFormat", request.apiFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserApiRequest"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserApiRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic statistics of an API.</p>
     * 
     * @param request DescribeUserApiRequestRequest
     * @return DescribeUserApiRequestResponse
     */
    public DescribeUserApiRequestResponse describeUserApiRequest(DescribeUserApiRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserApiRequestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user asset statistics in the API security module.</p>
     * 
     * @param request DescribeUserAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAssetResponse
     */
    public DescribeUserAssetResponse describeUserAssetWithOptions(DescribeUserAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            query.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAsset"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user asset statistics in the API security module.</p>
     * 
     * @param request DescribeUserAssetRequest
     * @return DescribeUserAssetResponse
     */
    public DescribeUserAssetResponse describeUserAsset(DescribeUserAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of attacks detected by the API security module.</p>
     * 
     * @param request DescribeUserEventTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEventTrendResponse
     */
    public DescribeUserEventTrendResponse describeUserEventTrendWithOptions(DescribeUserEventTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEventTrend"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEventTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of attacks detected by the API security module.</p>
     * 
     * @param request DescribeUserEventTrendRequest
     * @return DescribeUserEventTrendResponse
     */
    public DescribeUserEventTrendResponse describeUserEventTrend(DescribeUserEventTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEventTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types and statistics of security events in the API security module.</p>
     * 
     * @param request DescribeUserEventTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEventTypeResponse
     */
    public DescribeUserEventTypeResponse describeUserEventTypeWithOptions(DescribeUserEventTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatusList)) {
            query.put("UserStatusList", request.userStatusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEventType"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEventTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types and statistics of security events in the API security module.</p>
     * 
     * @param request DescribeUserEventTypeRequest
     * @return DescribeUserEventTypeResponse
     */
    public DescribeUserEventTypeResponse describeUserEventType(DescribeUserEventTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEventTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户日志配置</p>
     * 
     * @param request DescribeUserLogFieldConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserLogFieldConfigResponse
     */
    public DescribeUserLogFieldConfigResponse describeUserLogFieldConfigWithOptions(DescribeUserLogFieldConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserLogFieldConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserLogFieldConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户日志配置</p>
     * 
     * @param request DescribeUserLogFieldConfigRequest
     * @return DescribeUserLogFieldConfigResponse
     */
    public DescribeUserLogFieldConfigResponse describeUserLogFieldConfig(DescribeUserLogFieldConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserLogFieldConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions for log storage.</p>
     * 
     * @param request DescribeUserSlsLogRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserSlsLogRegionsResponse
     */
    public DescribeUserSlsLogRegionsResponse describeUserSlsLogRegionsWithOptions(DescribeUserSlsLogRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserSlsLogRegions"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserSlsLogRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions for log storage.</p>
     * 
     * @param request DescribeUserSlsLogRegionsRequest
     * @return DescribeUserSlsLogRegionsResponse
     */
    public DescribeUserSlsLogRegionsResponse describeUserSlsLogRegions(DescribeUserSlsLogRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserSlsLogRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status, region ID, and status modification time of Web Application Firewall (WAF) logs.</p>
     * 
     * @param request DescribeUserWafLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserWafLogStatusResponse
     */
    public DescribeUserWafLogStatusResponse describeUserWafLogStatusWithOptions(DescribeUserWafLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserWafLogStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserWafLogStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status, region ID, and status modification time of Web Application Firewall (WAF) logs.</p>
     * 
     * @param request DescribeUserWafLogStatusRequest
     * @return DescribeUserWafLogStatusResponse
     */
    public DescribeUserWafLogStatusResponse describeUserWafLogStatus(DescribeUserWafLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserWafLogStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询归属校验内容</p>
     * 
     * @param request DescribeVerifyContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyContentResponse
     */
    public DescribeVerifyContentResponse describeVerifyContentWithOptions(DescribeVerifyContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessOrigin)) {
            query.put("AccessOrigin", request.accessOrigin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyContent"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询归属校验内容</p>
     * 
     * @param request DescribeVerifyContentRequest
     * @return DescribeVerifyContentResponse
     */
    public DescribeVerifyContentResponse describeVerifyContent(DescribeVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 IP addresses from which requests are sent.</p>
     * 
     * @param request DescribeVisitTopIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVisitTopIpResponse
     */
    public DescribeVisitTopIpResponse describeVisitTopIpWithOptions(DescribeVisitTopIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVisitTopIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVisitTopIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 IP addresses from which requests are sent.</p>
     * 
     * @param request DescribeVisitTopIpRequest
     * @return DescribeVisitTopIpResponse
     */
    public DescribeVisitTopIpResponse describeVisitTopIp(DescribeVisitTopIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVisitTopIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 user agents that are used to initiate requests.</p>
     * 
     * @param request DescribeVisitUasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVisitUasResponse
     */
    public DescribeVisitUasResponse describeVisitUasWithOptions(DescribeVisitUasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVisitUas"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVisitUasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the top 10 user agents that are used to initiate requests.</p>
     * 
     * @param request DescribeVisitUasRequest
     * @return DescribeVisitUasResponse
     */
    public DescribeVisitUasResponse describeVisitUas(DescribeVisitUasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVisitUasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the back-to-origin CIDR blocks of a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeWafSourceIpSegmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWafSourceIpSegmentResponse
     */
    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegmentWithOptions(DescribeWafSourceIpSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWafSourceIpSegment"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWafSourceIpSegmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the back-to-origin CIDR blocks of a Web Application Firewall (WAF) instance.</p>
     * 
     * @param request DescribeWafSourceIpSegmentRequest
     * @return DescribeWafSourceIpSegmentResponse
     */
    public DescribeWafSourceIpSegmentResponse describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWafSourceIpSegmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WAF服务关联角色</p>
     * 
     * @param request InitializeWafOperationRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeWafOperationRoleResponse
     */
    public InitializeWafOperationRoleResponse initializeWafOperationRoleWithOptions(InitializeWafOperationRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeWafOperationRole"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeWafOperationRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WAF服务关联角色</p>
     * 
     * @param request InitializeWafOperationRoleRequest
     * @return InitializeWafOperationRoleResponse
     */
    public InitializeWafOperationRoleResponse initializeWafOperationRole(InitializeWafOperationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeWafOperationRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tag keys.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tag keys.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to a resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-10-01"),
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
     * <b>summary</b> : 
     * <p>Queries the tags that are added to a resource.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of a tag key.</p>
     * 
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of a tag key.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of multiple risks detected by the API security module at a time.</p>
     * 
     * @param request ModifyApisecAbnormalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecAbnormalsResponse
     */
    public ModifyApisecAbnormalsResponse modifyApisecAbnormalsWithOptions(ModifyApisecAbnormalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abnormalIds)) {
            query.put("AbnormalIds", request.abnormalIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecAbnormals"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecAbnormalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of multiple risks detected by the API security module at a time.</p>
     * 
     * @param request ModifyApisecAbnormalsRequest
     * @return ModifyApisecAbnormalsResponse
     */
    public ModifyApisecAbnormalsResponse modifyApisecAbnormals(ModifyApisecAbnormalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecAbnormalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the annotations of APIs in the API security module.</p>
     * 
     * @param request ModifyApisecApiResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecApiResourceResponse
     */
    public ModifyApisecApiResourceResponse modifyApisecApiResourceWithOptions(ModifyApisecApiResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow)) {
            query.put("Follow", request.follow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecApiResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecApiResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the annotations of APIs in the API security module.</p>
     * 
     * @param request ModifyApisecApiResourceRequest
     * @return ModifyApisecApiResourceResponse
     */
    public ModifyApisecApiResourceResponse modifyApisecApiResource(ModifyApisecApiResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecApiResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of multiple security events detected by the API security module at a time.</p>
     * 
     * @param request ModifyApisecEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecEventsResponse
     */
    public ModifyApisecEventsResponse modifyApisecEventsWithOptions(ModifyApisecEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIds)) {
            query.put("EventIds", request.eventIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventScope)) {
            query.put("EventScope", request.eventScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecEvents"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of multiple security events detected by the API security module at a time.</p>
     * 
     * @param request ModifyApisecEventsRequest
     * @return ModifyApisecEventsResponse
     */
    public ModifyApisecEventsResponse modifyApisecEvents(ModifyApisecEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of API security log subscription.</p>
     * 
     * @param request ModifyApisecLogDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecLogDeliveryResponse
     */
    public ModifyApisecLogDeliveryResponse modifyApisecLogDeliveryWithOptions(ModifyApisecLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assertKey)) {
            query.put("AssertKey", request.assertKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            query.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecLogDelivery"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecLogDeliveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of API security log subscription.</p>
     * 
     * @param request ModifyApisecLogDeliveryRequest
     * @return ModifyApisecLogDeliveryResponse
     */
    public ModifyApisecLogDeliveryResponse modifyApisecLogDelivery(ModifyApisecLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecLogDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of API security log subscription.</p>
     * 
     * @param request ModifyApisecLogDeliveryStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecLogDeliveryStatusResponse
     */
    public ModifyApisecLogDeliveryStatusResponse modifyApisecLogDeliveryStatusWithOptions(ModifyApisecLogDeliveryStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assertKey)) {
            query.put("AssertKey", request.assertKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecLogDeliveryStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecLogDeliveryStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of API security log subscription.</p>
     * 
     * @param request ModifyApisecLogDeliveryStatusRequest
     * @return ModifyApisecLogDeliveryStatusResponse
     */
    public ModifyApisecLogDeliveryStatusResponse modifyApisecLogDeliveryStatus(ModifyApisecLogDeliveryStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecLogDeliveryStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of features in the API security module for protected objects or protected object groups.</p>
     * 
     * @param request ModifyApisecModuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecModuleStatusResponse
     */
    public ModifyApisecModuleStatusResponse modifyApisecModuleStatusWithOptions(ModifyApisecModuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportStatus)) {
            query.put("ReportStatus", request.reportStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroups)) {
            query.put("ResourceGroups", request.resourceGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceStatus)) {
            query.put("TraceStatus", request.traceStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecModuleStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecModuleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of features in the API security module for protected objects or protected object groups.</p>
     * 
     * @param request ModifyApisecModuleStatusRequest
     * @return ModifyApisecModuleStatusResponse
     */
    public ModifyApisecModuleStatusResponse modifyApisecModuleStatus(ModifyApisecModuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecModuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of the API security module for protected objects or protected object groups.</p>
     * 
     * @param request ModifyApisecStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApisecStatusResponse
     */
    public ModifyApisecStatusResponse modifyApisecStatusWithOptions(ModifyApisecStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apisecStatus)) {
            query.put("ApisecStatus", request.apisecStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroups)) {
            query.put("ResourceGroups", request.resourceGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApisecStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApisecStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of the API security module for protected objects or protected object groups.</p>
     * 
     * @param request ModifyApisecStatusRequest
     * @return ModifyApisecStatusResponse
     */
    public ModifyApisecStatusResponse modifyApisecStatus(ModifyApisecStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApisecStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a service that is added to Web Application Firewall (WAF).</p>
     * 
     * @param tmpReq ModifyCloudResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudResourceResponse
     */
    public ModifyCloudResourceResponse modifyCloudResourceWithOptions(ModifyCloudResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCloudResourceShrinkRequest request = new ModifyCloudResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listen)) {
            request.listenShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listen, "Listen", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirect)) {
            request.redirectShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirect, "Redirect", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudResourceId)) {
            query.put("CloudResourceId", request.cloudResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenShrink)) {
            query.put("Listen", request.listenShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectShrink)) {
            query.put("Redirect", request.redirectShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a service that is added to Web Application Firewall (WAF).</p>
     * 
     * @param request ModifyCloudResourceRequest
     * @return ModifyCloudResourceResponse
     */
    public ModifyCloudResourceResponse modifyCloudResource(ModifyCloudResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改云产品接入的证书</p>
     * 
     * @param request ModifyCloudResourceCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudResourceCertResponse
     */
    public ModifyCloudResourceCertResponse modifyCloudResourceCertWithOptions(ModifyCloudResourceCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            query.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudResourceId)) {
            query.put("CloudResourceId", request.cloudResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudResourceCert"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudResourceCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改云产品接入的证书</p>
     * 
     * @param request ModifyCloudResourceCertRequest
     * @return ModifyCloudResourceCertResponse
     */
    public ModifyCloudResourceCertResponse modifyCloudResourceCert(ModifyCloudResourceCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudResourceCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the default Secure Sockets Layer (SSL) and Transport Layer Security (TLS) settings.</p>
     * 
     * @param request ModifyDefaultHttpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefaultHttpsResponse
     */
    public ModifyDefaultHttpsResponse modifyDefaultHttpsWithOptions(ModifyDefaultHttpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherSuite)) {
            query.put("CipherSuite", request.cipherSuite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customCiphers)) {
            query.put("CustomCiphers", request.customCiphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTLSv3)) {
            query.put("EnableTLSv3", request.enableTLSv3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersion)) {
            query.put("TLSVersion", request.TLSVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefaultHttps"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefaultHttpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the default Secure Sockets Layer (SSL) and Transport Layer Security (TLS) settings.</p>
     * 
     * @param request ModifyDefaultHttpsRequest
     * @return ModifyDefaultHttpsResponse
     */
    public ModifyDefaultHttpsResponse modifyDefaultHttps(ModifyDefaultHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefaultHttpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protected object group.</p>
     * 
     * @param request ModifyDefenseResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseResourceGroupResponse
     */
    public ModifyDefenseResourceGroupResponse modifyDefenseResourceGroupWithOptions(ModifyDefenseResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addList)) {
            query.put("AddList", request.addList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteList)) {
            query.put("DeleteList", request.deleteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseResourceGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protected object group.</p>
     * 
     * @param request ModifyDefenseResourceGroupRequest
     * @return ModifyDefenseResourceGroupResponse
     */
    public ModifyDefenseResourceGroupResponse modifyDefenseResourceGroup(ModifyDefenseResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cookie settings of a protected object and the method to identify the originating IP addresses of clients.</p>
     * 
     * @param request ModifyDefenseResourceXffRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseResourceXffResponse
     */
    public ModifyDefenseResourceXffResponse modifyDefenseResourceXffWithOptions(ModifyDefenseResourceXffRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acwCookieStatus)) {
            query.put("AcwCookieStatus", request.acwCookieStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acwSecureStatus)) {
            query.put("AcwSecureStatus", request.acwSecureStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acwV3SecureStatus)) {
            query.put("AcwV3SecureStatus", request.acwV3SecureStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHeaders)) {
            query.put("CustomHeaders", request.customHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeaders)) {
            query.put("ResponseHeaders", request.responseHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xffStatus)) {
            query.put("XffStatus", request.xffStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseResourceXff"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseResourceXffResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cookie settings of a protected object and the method to identify the originating IP addresses of clients.</p>
     * 
     * @param request ModifyDefenseResourceXffRequest
     * @return ModifyDefenseResourceXffResponse
     */
    public ModifyDefenseResourceXffResponse modifyDefenseResourceXff(ModifyDefenseResourceXffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseResourceXffWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protection rule.</p>
     * 
     * @param request ModifyDefenseRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseRuleResponse
     */
    public ModifyDefenseRuleResponse modifyDefenseRuleWithOptions(ModifyDefenseRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protection rule.</p>
     * 
     * @param request ModifyDefenseRuleRequest
     * @return ModifyDefenseRuleResponse
     */
    public ModifyDefenseRuleResponse modifyDefenseRule(ModifyDefenseRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the cached page of a website that is protected based on a website tamper-proofing rule.</p>
     * 
     * @param request ModifyDefenseRuleCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseRuleCacheResponse
     */
    public ModifyDefenseRuleCacheResponse modifyDefenseRuleCacheWithOptions(ModifyDefenseRuleCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseRuleCache"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseRuleCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the cached page of a website that is protected based on a website tamper-proofing rule.</p>
     * 
     * @param request ModifyDefenseRuleCacheRequest
     * @return ModifyDefenseRuleCacheResponse
     */
    public ModifyDefenseRuleCacheResponse modifyDefenseRuleCache(ModifyDefenseRuleCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseRuleCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a protection rule.</p>
     * 
     * @param request ModifyDefenseRuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseRuleStatusResponse
     */
    public ModifyDefenseRuleStatusResponse modifyDefenseRuleStatusWithOptions(ModifyDefenseRuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defenseType)) {
            query.put("DefenseType", request.defenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseRuleStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseRuleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a protection rule.</p>
     * 
     * @param request ModifyDefenseRuleStatusRequest
     * @return ModifyDefenseRuleStatusResponse
     */
    public ModifyDefenseRuleStatusResponse modifyDefenseRuleStatus(ModifyDefenseRuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseRuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户防护场景的配置</p>
     * 
     * @param request ModifyDefenseSceneConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseSceneConfigResponse
     */
    public ModifyDefenseSceneConfigResponse modifyDefenseSceneConfigWithOptions(ModifyDefenseSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configKey)) {
            query.put("ConfigKey", request.configKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            query.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defenseScene)) {
            query.put("DefenseScene", request.defenseScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseSceneConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseSceneConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户防护场景的配置</p>
     * 
     * @param request ModifyDefenseSceneConfigRequest
     * @return ModifyDefenseSceneConfigResponse
     */
    public ModifyDefenseSceneConfigResponse modifyDefenseSceneConfig(ModifyDefenseSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseSceneConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protection rule template.</p>
     * 
     * @param request ModifyDefenseTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseTemplateResponse
     */
    public ModifyDefenseTemplateResponse modifyDefenseTemplateWithOptions(ModifyDefenseTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseTemplate"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a protection rule template.</p>
     * 
     * @param request ModifyDefenseTemplateRequest
     * @return ModifyDefenseTemplateResponse
     */
    public ModifyDefenseTemplateResponse modifyDefenseTemplate(ModifyDefenseTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a protection rule template.</p>
     * 
     * @param request ModifyDefenseTemplateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseTemplateStatusResponse
     */
    public ModifyDefenseTemplateStatusResponse modifyDefenseTemplateStatusWithOptions(ModifyDefenseTemplateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateStatus)) {
            query.put("TemplateStatus", request.templateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseTemplateStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseTemplateStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a protection rule template.</p>
     * 
     * @param request ModifyDefenseTemplateStatusRequest
     * @return ModifyDefenseTemplateStatusResponse
     */
    public ModifyDefenseTemplateStatusResponse modifyDefenseTemplateStatus(ModifyDefenseTemplateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseTemplateStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a domain name that is added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param tmpReq ModifyDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDomainResponse
     */
    public ModifyDomainResponse modifyDomainWithOptions(ModifyDomainRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDomainShrinkRequest request = new ModifyDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listen)) {
            request.listenShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listen, "Listen", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirect)) {
            request.redirectShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirect, "Redirect", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenShrink)) {
            query.put("Listen", request.listenShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectShrink)) {
            query.put("Redirect", request.redirectShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomain"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a domain name that is added to Web Application Firewall (WAF) in CNAME record mode.</p>
     * 
     * @param request ModifyDomainRequest
     * @return ModifyDomainResponse
     */
    public ModifyDomainResponse modifyDomain(ModifyDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名的证书</p>
     * 
     * @param request ModifyDomainCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDomainCertResponse
     */
    public ModifyDomainCertResponse modifyDomainCertWithOptions(ModifyDomainCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherSuite)) {
            query.put("CipherSuite", request.cipherSuite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customCiphers)) {
            query.put("CustomCiphers", request.customCiphers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTLSv3)) {
            query.put("EnableTLSv3", request.enableTLSv3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSVersion)) {
            query.put("TLSVersion", request.TLSVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomainCert"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名的证书</p>
     * 
     * @param request ModifyDomainCertRequest
     * @return ModifyDomainCertResponse
     */
    public ModifyDomainCertResponse modifyDomainCert(ModifyDomainCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDomainCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Re-adds a domain name that is penalized for failing to obtain an Internet Content Provider (ICP) filing to Web Application Firewall (WAF).</p>
     * 
     * @param request ModifyDomainPunishStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDomainPunishStatusResponse
     */
    public ModifyDomainPunishStatusResponse modifyDomainPunishStatusWithOptions(ModifyDomainPunishStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDomainPunishStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDomainPunishStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Re-adds a domain name that is penalized for failing to obtain an Internet Content Provider (ICP) filing to Web Application Firewall (WAF).</p>
     * 
     * @param request ModifyDomainPunishStatusRequest
     * @return ModifyDomainPunishStatusResponse
     */
    public ModifyDomainPunishStatusResponse modifyDomainPunishStatus(ModifyDomainPunishStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDomainPunishStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudClusterResponse
     */
    public ModifyHybridCloudClusterResponse modifyHybridCloudClusterWithOptions(ModifyHybridCloudClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRegion)) {
            query.put("AccessRegion", request.accessRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpPorts)) {
            query.put("HttpPorts", request.httpPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPorts)) {
            query.put("HttpsPorts", request.httpsPorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logFieldsNotReturned)) {
            query.put("LogFieldsNotReturned", request.logFieldsNotReturned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionServerCount)) {
            query.put("ProtectionServerCount", request.protectionServerCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyStatus)) {
            query.put("ProxyStatus", request.proxyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyType)) {
            query.put("ProxyType", request.proxyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            query.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudCluster"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudClusterRequest
     * @return ModifyHybridCloudClusterResponse
     */
    public ModifyHybridCloudClusterResponse modifyHybridCloudCluster(ModifyHybridCloudClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables manual bypass for a hybrid cloud cluster whose type is set to SDK Integration Mode.</p>
     * 
     * @param request ModifyHybridCloudClusterBypassStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudClusterBypassStatusResponse
     */
    public ModifyHybridCloudClusterBypassStatusResponse modifyHybridCloudClusterBypassStatusWithOptions(ModifyHybridCloudClusterBypassStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterResourceId)) {
            query.put("ClusterResourceId", request.clusterResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudClusterBypassStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudClusterBypassStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables manual bypass for a hybrid cloud cluster whose type is set to SDK Integration Mode.</p>
     * 
     * @param request ModifyHybridCloudClusterBypassStatusRequest
     * @return ModifyHybridCloudClusterBypassStatusResponse
     */
    public ModifyHybridCloudClusterBypassStatusResponse modifyHybridCloudClusterBypassStatus(ModifyHybridCloudClusterBypassStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudClusterBypassStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the rule of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudClusterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudClusterRuleResponse
     */
    public ModifyHybridCloudClusterRuleResponse modifyHybridCloudClusterRuleWithOptions(ModifyHybridCloudClusterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterRuleResourceId)) {
            query.put("ClusterRuleResourceId", request.clusterRuleResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            query.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("RuleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudClusterRule"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudClusterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the rule of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudClusterRuleRequest
     * @return ModifyHybridCloudClusterRuleResponse
     */
    public ModifyHybridCloudClusterRuleResponse modifyHybridCloudClusterRule(ModifyHybridCloudClusterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudClusterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a node group in a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudGroupResponse
     */
    public ModifyHybridCloudGroupResponse modifyHybridCloudGroupWithOptions(ModifyHybridCloudGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudGroup"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a node group in a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupRequest
     * @return ModifyHybridCloudGroupResponse
     */
    public ModifyHybridCloudGroupResponse modifyHybridCloudGroup(ModifyHybridCloudGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a node to a node group of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupExpansionServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudGroupExpansionServerResponse
     */
    public ModifyHybridCloudGroupExpansionServerResponse modifyHybridCloudGroupExpansionServerWithOptions(ModifyHybridCloudGroupExpansionServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mids)) {
            query.put("Mids", request.mids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudGroupExpansionServer"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudGroupExpansionServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a node to a node group of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupExpansionServerRequest
     * @return ModifyHybridCloudGroupExpansionServerResponse
     */
    public ModifyHybridCloudGroupExpansionServerResponse modifyHybridCloudGroupExpansionServer(ModifyHybridCloudGroupExpansionServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudGroupExpansionServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a node from a node group of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupShrinkServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudGroupShrinkServerResponse
     */
    public ModifyHybridCloudGroupShrinkServerResponse modifyHybridCloudGroupShrinkServerWithOptions(ModifyHybridCloudGroupShrinkServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mids)) {
            query.put("Mids", request.mids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudGroupShrinkServer"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudGroupShrinkServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a node from a node group of a hybrid cloud cluster.</p>
     * 
     * @param request ModifyHybridCloudGroupShrinkServerRequest
     * @return ModifyHybridCloudGroupShrinkServerResponse
     */
    public ModifyHybridCloudGroupShrinkServerResponse modifyHybridCloudGroupShrinkServer(ModifyHybridCloudGroupShrinkServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudGroupShrinkServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the traffic redirection status of a hybrid cloud cluster by using an SDK.</p>
     * 
     * @param request ModifyHybridCloudSdkPullinStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudSdkPullinStatusResponse
     */
    public ModifyHybridCloudSdkPullinStatusResponse modifyHybridCloudSdkPullinStatusWithOptions(ModifyHybridCloudSdkPullinStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mid)) {
            query.put("Mid", request.mid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullinStatus)) {
            query.put("PullinStatus", request.pullinStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudSdkPullinStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudSdkPullinStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the traffic redirection status of a hybrid cloud cluster by using an SDK.</p>
     * 
     * @param request ModifyHybridCloudSdkPullinStatusRequest
     * @return ModifyHybridCloudSdkPullinStatusResponse
     */
    public ModifyHybridCloudSdkPullinStatusResponse modifyHybridCloudSdkPullinStatus(ModifyHybridCloudSdkPullinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudSdkPullinStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a hybrid cloud node.</p>
     * 
     * @param request ModifyHybridCloudServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridCloudServerResponse
     */
    public ModifyHybridCloudServerResponse modifyHybridCloudServerWithOptions(ModifyHybridCloudServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continents)) {
            query.put("Continents", request.continents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customName)) {
            query.put("CustomName", request.customName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mid)) {
            query.put("Mid", request.mid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridCloudServer"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridCloudServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a hybrid cloud node.</p>
     * 
     * @param request ModifyHybridCloudServerRequest
     * @return ModifyHybridCloudServerResponse
     */
    public ModifyHybridCloudServerResponse modifyHybridCloudServer(ModifyHybridCloudServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridCloudServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a hybrid cloud log delivery configuration.</p>
     * 
     * @param request ModifyLogDeliveryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLogDeliveryConfigResponse
     */
    public ModifyLogDeliveryConfigResponse modifyLogDeliveryConfigWithOptions(ModifyLogDeliveryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryDetail)) {
            query.put("DeliveryDetail", request.deliveryDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryName)) {
            query.put("DeliveryName", request.deliveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogDeliveryConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogDeliveryConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a hybrid cloud log delivery configuration.</p>
     * 
     * @param request ModifyLogDeliveryConfigRequest
     * @return ModifyLogDeliveryConfigResponse
     */
    public ModifyLogDeliveryConfigResponse modifyLogDeliveryConfig(ModifyLogDeliveryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLogDeliveryConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an IP address blacklist for major event protection.</p>
     * 
     * @param request ModifyMajorProtectionBlackIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMajorProtectionBlackIpResponse
     */
    public ModifyMajorProtectionBlackIpResponse modifyMajorProtectionBlackIpWithOptions(ModifyMajorProtectionBlackIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMajorProtectionBlackIp"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMajorProtectionBlackIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an IP address blacklist for major event protection.</p>
     * 
     * @param request ModifyMajorProtectionBlackIpRequest
     * @return ModifyMajorProtectionBlackIpResponse
     */
    public ModifyMajorProtectionBlackIpResponse modifyMajorProtectionBlackIp(ModifyMajorProtectionBlackIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMajorProtectionBlackIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about members that are added for multi-account management.</p>
     * 
     * @param request ModifyMemberAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMemberAccountResponse
     */
    public ModifyMemberAccountResponse modifyMemberAccountWithOptions(ModifyMemberAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMemberAccount"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMemberAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about members that are added for multi-account management.</p>
     * 
     * @param request ModifyMemberAccountRequest
     * @return ModifyMemberAccountResponse
     */
    public ModifyMemberAccountResponse modifyMemberAccount(ModifyMemberAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMemberAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the protection status of Web Application Firewall (WAF).</p>
     * 
     * @param request ModifyPauseProtectionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPauseProtectionStatusResponse
     */
    public ModifyPauseProtectionStatusResponse modifyPauseProtectionStatusWithOptions(ModifyPauseProtectionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseStatus)) {
            query.put("PauseStatus", request.pauseStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPauseProtectionStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPauseProtectionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the protection status of Web Application Firewall (WAF).</p>
     * 
     * @param request ModifyPauseProtectionStatusRequest
     * @return ModifyPauseProtectionStatusResponse
     */
    public ModifyPauseProtectionStatusResponse modifyPauseProtectionStatus(ModifyPauseProtectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPauseProtectionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改防护对象日志外发状态</p>
     * 
     * @param request ModifyResourceLogDeliveryStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyResourceLogDeliveryStatusResponse
     */
    public ModifyResourceLogDeliveryStatusResponse modifyResourceLogDeliveryStatusWithOptions(ModifyResourceLogDeliveryStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryName)) {
            query.put("DeliveryName", request.deliveryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyResourceLogDeliveryStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyResourceLogDeliveryStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改防护对象日志外发状态</p>
     * 
     * @param request ModifyResourceLogDeliveryStatusRequest
     * @return ModifyResourceLogDeliveryStatusResponse
     */
    public ModifyResourceLogDeliveryStatusResponse modifyResourceLogDeliveryStatus(ModifyResourceLogDeliveryStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceLogDeliveryStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改防护对象的日志字段配置</p>
     * 
     * @param request ModifyResourceLogFieldConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyResourceLogFieldConfigResponse
     */
    public ModifyResourceLogFieldConfigResponse modifyResourceLogFieldConfigWithOptions(ModifyResourceLogFieldConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendConfig)) {
            query.put("ExtendConfig", request.extendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldList)) {
            query.put("FieldList", request.fieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDeliveryStrategy)) {
            query.put("LogDeliveryStrategy", request.logDeliveryStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyResourceLogFieldConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyResourceLogFieldConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改防护对象的日志字段配置</p>
     * 
     * @param request ModifyResourceLogFieldConfigRequest
     * @return ModifyResourceLogFieldConfigResponse
     */
    public ModifyResourceLogFieldConfigResponse modifyResourceLogFieldConfig(ModifyResourceLogFieldConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceLogFieldConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the log collection feature for a protected object.</p>
     * 
     * @param request ModifyResourceLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyResourceLogStatusResponse
     */
    public ModifyResourceLogStatusResponse modifyResourceLogStatusWithOptions(ModifyResourceLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyResourceLogStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyResourceLogStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the log collection feature for a protected object.</p>
     * 
     * @param request ModifyResourceLogStatusRequest
     * @return ModifyResourceLogStatusResponse
     */
    public ModifyResourceLogStatusResponse modifyResourceLogStatus(ModifyResourceLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceLogStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates or disassociates a protected object or protected object group with or from a protection rule template.</p>
     * 
     * @param request ModifyTemplateResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTemplateResourcesResponse
     */
    public ModifyTemplateResourcesResponse modifyTemplateResourcesWithOptions(ModifyTemplateResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindAssets)) {
            query.put("BindAssets", request.bindAssets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindResourceGroups)) {
            query.put("BindResourceGroups", request.bindResourceGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindResources)) {
            query.put("BindResources", request.bindResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindAssets)) {
            query.put("UnbindAssets", request.unbindAssets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindResourceGroups)) {
            query.put("UnbindResourceGroups", request.unbindResourceGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unbindResources)) {
            query.put("UnbindResources", request.unbindResources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTemplateResources"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTemplateResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates or disassociates a protected object or protected object group with or from a protection rule template.</p>
     * 
     * @param request ModifyTemplateResourcesRequest
     * @return ModifyTemplateResourcesResponse
     */
    public ModifyTemplateResourcesResponse modifyTemplateResources(ModifyTemplateResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户日志服务的默认字段配置</p>
     * 
     * @param request ModifyUserLogFieldConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserLogFieldConfigResponse
     */
    public ModifyUserLogFieldConfigResponse modifyUserLogFieldConfigWithOptions(ModifyUserLogFieldConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            query.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendConfig)) {
            query.put("ExtendConfig", request.extendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldList)) {
            query.put("FieldList", request.fieldList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDeliveryStrategy)) {
            query.put("LogDeliveryStrategy", request.logDeliveryStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserLogFieldConfig"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserLogFieldConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户日志服务的默认字段配置</p>
     * 
     * @param request ModifyUserLogFieldConfigRequest
     * @return ModifyUserLogFieldConfigResponse
     */
    public ModifyUserLogFieldConfigResponse modifyUserLogFieldConfig(ModifyUserLogFieldConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserLogFieldConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通或关闭WAF日志服务</p>
     * 
     * @param request ModifyUserWafLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserWafLogStatusResponse
     */
    public ModifyUserWafLogStatusResponse modifyUserWafLogStatusWithOptions(ModifyUserWafLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRegionId)) {
            query.put("LogRegionId", request.logRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStatus)) {
            query.put("LogStatus", request.logStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserWafLogStatus"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserWafLogStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通或关闭WAF日志服务</p>
     * 
     * @param request ModifyUserWafLogStatusRequest
     * @return ModifyUserWafLogStatusResponse
     */
    public ModifyUserWafLogStatusResponse modifyUserWafLogStatus(ModifyUserWafLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserWafLogStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新接入云产品</p>
     * 
     * @param request ReCreateCloudResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReCreateCloudResourceResponse
     */
    public ReCreateCloudResourceResponse reCreateCloudResourceWithOptions(ReCreateCloudResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudResourceId)) {
            query.put("CloudResourceId", request.cloudResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceId)) {
            query.put("ResourceInstanceId", request.resourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReCreateCloudResource"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReCreateCloudResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新接入云产品</p>
     * 
     * @param request ReCreateCloudResourceRequest
     * @return ReCreateCloudResourceResponse
     */
    public ReCreateCloudResourceResponse reCreateCloudResource(ReCreateCloudResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reCreateCloudResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Web Application Firewall (WAF) 3.0 instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Web Application Firewall (WAF) 3.0 instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>SyncProductInstance is an asynchronous operation. You can call the <a href="https://help.aliyun.com/document_detail/2743168.html">DescribeProductInstances</a> operation to query the status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes Elastic Compute Service (ECS), Classic Load Balancer (CLB), and Network Load Balancer (NLB) instances to Web Application Firewall (WAF).</p>
     * 
     * @param request SyncProductInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncProductInstanceResponse
     */
    public SyncProductInstanceResponse syncProductInstanceWithOptions(SyncProductInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncProductInstance"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncProductInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>SyncProductInstance is an asynchronous operation. You can call the <a href="https://help.aliyun.com/document_detail/2743168.html">DescribeProductInstances</a> operation to query the status of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes Elastic Compute Service (ECS), Classic Load Balancer (CLB), and Network Load Balancer (NLB) instances to Web Application Firewall (WAF).</p>
     * 
     * @param request SyncProductInstanceRequest
     * @return SyncProductInstanceResponse
     */
    public SyncProductInstanceResponse syncProductInstance(SyncProductInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncProductInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2021-10-01"),
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
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources and then deletes the tags.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2021-10-01"),
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
     * <b>summary</b> : 
     * <p>Removes tags from resources and then deletes the tags.</p>
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
     * <p>Verifies the ownership of a domain name.</p>
     * 
     * @param request VerifyDomainOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyDomainOwnerResponse
     */
    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDomainOwner"),
            new TeaPair("version", "2021-10-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDomainOwnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the ownership of a domain name.</p>
     * 
     * @param request VerifyDomainOwnerRequest
     * @return VerifyDomainOwnerResponse
     */
    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }
}
