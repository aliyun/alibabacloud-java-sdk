// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820;

import com.aliyun.tea.*;
import com.aliyun.sandbox20260820.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Sandbox";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sandbox", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKeyWithOptions(CreateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiKey"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain name.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomainWithOptions(CreateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomDomain"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/custom-domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain name.</p>
     * 
     * @param request CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    public CreateCustomDomainResponse createCustomDomain(CreateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a team.</p>
     * 
     * @param request CreateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeamWithOptions(CreateTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTeam"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a team.</p>
     * 
     * @param request CreateTeamRequest
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeam(CreateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTeamWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a template. If runtimeConfig.vpcBindings is null, it is treated as omitted. Inbound bindings are independent of the egress vpcConfig and API key source policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a template. If runtimeConfig.vpcBindings is null, it is treated as omitted. Inbound bindings are independent of the egress vpcConfig and API key source policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template cache.</p>
     * 
     * @param request CreateTemplateCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateCacheResponse
     */
    public CreateTemplateCacheResponse createTemplateCacheWithOptions(CreateTemplateCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplateCache"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/template-caches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template cache.</p>
     * 
     * @param request CreateTemplateCacheRequest
     * @return CreateTemplateCacheResponse
     */
    public CreateTemplateCacheResponse createTemplateCache(CreateTemplateCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateCacheWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a storage volume.</p>
     * 
     * @param request CreateVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolumeWithOptions(CreateVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVolume"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/volumes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a storage volume.</p>
     * 
     * @param request CreateVolumeRequest
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVolumeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a warm pool.</p>
     * 
     * @param request CreateWarmPoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWarmPoolResponse
     */
    public CreateWarmPoolResponse createWarmPoolWithOptions(String teamID, CreateWarmPoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWarmPool"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + "/warmPools"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWarmPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a warm pool.</p>
     * 
     * @param request CreateWarmPoolRequest
     * @return CreateWarmPoolResponse
     */
    public CreateWarmPoolResponse createWarmPool(String teamID, CreateWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWarmPoolWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKeyWithOptions(String apiKeyID, DeleteApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiKey"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKey(String apiKeyID, DeleteApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name.</p>
     * 
     * @param request DeleteCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomainWithOptions(String domainName, DeleteCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomDomain"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name.</p>
     * 
     * @param request DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     */
    public DeleteCustomDomainResponse deleteCustomDomain(String domainName, DeleteCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the quota configuration for a specified team.</p>
     * 
     * @param request DeleteQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuotaWithOptions(DeleteQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuota"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/quotas/tag"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the quota configuration for a specified team.</p>
     * 
     * @param request DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuota(DeleteQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified team.</p>
     * 
     * @param request DeleteTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeamWithOptions(String teamID, DeleteTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTeam"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified team.</p>
     * 
     * @param request DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(String teamID, DeleteTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(String templateID, DeleteTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String templateID, DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the template cache.</p>
     * 
     * @param request DeleteTemplateCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateCacheResponse
     */
    public DeleteTemplateCacheResponse deleteTemplateCacheWithOptions(String templateID, DeleteTemplateCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplateCache"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/template-caches/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the template cache.</p>
     * 
     * @param request DeleteTemplateCacheRequest
     * @return DeleteTemplateCacheResponse
     */
    public DeleteTemplateCacheResponse deleteTemplateCache(String templateID, DeleteTemplateCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateCacheWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified storage volume.</p>
     * 
     * @param request DeleteVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolumeWithOptions(String volumeID, DeleteVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVolume"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified storage volume.</p>
     * 
     * @param request DeleteVolumeRequest
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolume(String volumeID, DeleteVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVolumeWithOptions(volumeID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a warm-up pool.</p>
     * 
     * @param request DeleteWarmPoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarmPoolResponse
     */
    public DeleteWarmPoolResponse deleteWarmPoolWithOptions(String teamID, String templateID, DeleteWarmPoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWarmPool"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + "/warmPools/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarmPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a warm-up pool.</p>
     * 
     * @param request DeleteWarmPoolRequest
     * @return DeleteWarmPoolResponse
     */
    public DeleteWarmPoolResponse deleteWarmPool(String teamID, String templateID, DeleteWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWarmPoolWithOptions(teamID, templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified API key.</p>
     * 
     * @param request DescribeApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiKeyResponse
     */
    public DescribeApiKeyResponse describeApiKeyWithOptions(String apiKeyID, DescribeApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiKey"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified API key.</p>
     * 
     * @param request DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     */
    public DescribeApiKeyResponse describeApiKey(String apiKeyID, DescribeApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configuration of a specified team.</p>
     * 
     * @param request DescribeQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuotaWithOptions(DescribeQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQuota"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/quotas/tag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configuration of a specified team.</p>
     * 
     * @param request DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the template cache.</p>
     * 
     * @param request DescribeTemplateCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateCacheResponse
     */
    public DescribeTemplateCacheResponse describeTemplateCacheWithOptions(String templateID, DescribeTemplateCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateCache"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/template-caches/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the template cache.</p>
     * 
     * @param request DescribeTemplateCacheRequest
     * @return DescribeTemplateCacheResponse
     */
    public DescribeTemplateCacheResponse describeTemplateCache(String templateID, DescribeTemplateCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplateCacheWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the warm pool.</p>
     * 
     * @param request DescribeWarmPoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWarmPoolResponse
     */
    public DescribeWarmPoolResponse describeWarmPoolWithOptions(String teamID, String templateID, DescribeWarmPoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWarmPool"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + "/warmPools/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWarmPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the warm pool.</p>
     * 
     * @param request DescribeWarmPoolRequest
     * @return DescribeWarmPoolResponse
     */
    public DescribeWarmPoolResponse describeWarmPool(String teamID, String templateID, DescribeWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWarmPoolWithOptions(teamID, templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom domain names.</p>
     * 
     * @param request GetCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomainWithOptions(String domainName, GetCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomDomain"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom domain names.</p>
     * 
     * @param request GetCustomDomainRequest
     * @return GetCustomDomainResponse
     */
    public GetCustomDomainResponse getCustomDomain(String domainName, GetCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Views monitoring metrics at a specific point in time or queries trends over a period of time. Supports querying by account, team, template, or sandbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries monitoring metrics.</p>
     * 
     * @param tmpReq GetMetricDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricDataResponse
     */
    public GetMetricDataResponse getMetricDataWithOptions(GetMetricDataRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMetricDataShrinkRequest request = new GetMetricDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupBy)) {
            request.groupByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupBy, "groupBy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricNames)) {
            request.metricNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricNames, "metricNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByShrink)) {
            query.put("groupBy", request.groupByShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricNamesShrink)) {
            query.put("metricNames", request.metricNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandboxID)) {
            query.put("sandboxID", request.sandboxID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandboxPlan)) {
            query.put("sandboxPlan", request.sandboxPlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateID)) {
            query.put("templateID", request.templateID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetricData"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetricDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Views monitoring metrics at a specific point in time or queries trends over a period of time. Supports querying by account, team, template, or sandbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries monitoring metrics.</p>
     * 
     * @param request GetMetricDataRequest
     * @return GetMetricDataResponse
     */
    public GetMetricDataResponse getMetricData(GetMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the CPU, memory, and disk usage over a specified period. You can view the cumulative usage and usage trends by account, team, or template.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries resource usage.</p>
     * 
     * @param tmpReq GetResourceUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceUsageResponse
     */
    public GetResourceUsageResponse getResourceUsageWithOptions(GetResourceUsageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceUsageShrinkRequest request = new GetResourceUsageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupBy)) {
            request.groupByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupBy, "groupBy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.usageNames)) {
            request.usageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.usageNames, "usageNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByShrink)) {
            query.put("groupBy", request.groupByShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sandboxPlan)) {
            query.put("sandboxPlan", request.sandboxPlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateID)) {
            query.put("templateID", request.templateID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageNamesShrink)) {
            query.put("usageNames", request.usageNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceUsage"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/resource-usage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the CPU, memory, and disk usage over a specified period. You can view the cumulative usage and usage trends by account, team, or template.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries resource usage.</p>
     * 
     * @param request GetResourceUsageRequest
     * @return GetResourceUsageResponse
     */
    public GetResourceUsageResponse getResourceUsage(GetResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified team.</p>
     * 
     * @param request GetTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeamWithOptions(String teamID, GetTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTeam"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified team.</p>
     * 
     * @param request GetTeamRequest
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeam(String teamID, GetTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a template.</p>
     * 
     * @param request GetTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String templateID, GetTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a template.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String templateID, GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified storage volume.</p>
     * 
     * @param request GetVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolumeWithOptions(String volumeID, GetVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVolume"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified storage volume.</p>
     * 
     * @param request GetVolumeRequest
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolume(String volumeID, GetVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVolumeWithOptions(volumeID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of API keys by using paging.</p>
     * 
     * @param request ListApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeysWithOptions(ListApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyName)) {
            query.put("apiKeyName", request.apiKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiKeys"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of API keys by using paging.</p>
     * 
     * @param request ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiKeysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query of custom domain names.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomainsWithOptions(ListCustomDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomDomains"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/custom-domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query of custom domain names.</p>
     * 
     * @param request ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    public ListCustomDomainsResponse listCustomDomains(ListCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configuration list for the current account by using paging.</p>
     * 
     * @param request ListQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuotaWithOptions(ListQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuota"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configuration list for the current account by using paging.</p>
     * 
     * @param request ListQuotaRequest
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the team list by using paging.</p>
     * 
     * @param request ListTeamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeamsWithOptions(ListTeamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plan)) {
            query.put("plan", request.plan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamName)) {
            query.put("teamName", request.teamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeams"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the team list by using paging.</p>
     * 
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTeamsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries template caches by paging.</p>
     * 
     * @param request ListTemplateCacheRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplateCacheResponse
     */
    public ListTemplateCacheResponse listTemplateCacheWithOptions(ListTemplateCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateID)) {
            query.put("templateID", request.templateID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateCache"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/template-caches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries template caches by paging.</p>
     * 
     * @param request ListTemplateCacheRequest
     * @return ListTemplateCacheResponse
     */
    public ListTemplateCacheResponse listTemplateCache(ListTemplateCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplateCacheWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the template list.</p>
     * 
     * @param tmpReq ListTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTemplatesShrinkRequest request = new ListTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTags)) {
            request.resourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTags, "resourceTags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTagsShrink)) {
            query.put("resourceTags", request.resourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paging query to retrieve the template list.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of storage volumes by using paging.</p>
     * 
     * @param request ListVolumesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumesWithOptions(ListVolumesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("storageClass", request.storageClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeName)) {
            query.put("volumeName", request.volumeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVolumes"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/volumes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of storage volumes by using paging.</p>
     * 
     * @param request ListVolumesRequest
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVolumesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of warm pools.</p>
     * 
     * @param request ListWarmPoolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWarmPoolsResponse
     */
    public ListWarmPoolsResponse listWarmPoolsWithOptions(String teamID, ListWarmPoolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWarmPools"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + "/warmPools"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWarmPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of warm pools.</p>
     * 
     * @param request ListWarmPoolsRequest
     * @return ListWarmPoolsResponse
     */
    public ListWarmPoolsResponse listWarmPools(String teamID, ListWarmPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWarmPoolsWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rotates the credential value of an API key while retaining the original API key ID, IP address whitelist, IP address blacklist, and vpcBindings source policy. The apiKey field in the response returns the retained policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a specified API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKeyWithOptions(String apiKeyID, ResetApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetApiKey"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + "/reset"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rotates the credential value of an API key while retaining the original API key ID, IP address whitelist, IP address blacklist, and vpcBindings source policy. The apiKey field in the response returns the retained policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a specified API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKey(String apiKeyID, ResetApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates an API key. IP blacklists and whitelists follow a paired replacement rule. If you commit a non-null array for one list and omit the other list or set it to null, the omitted list is cleared. If both lists are omitted or set to null, they are retained. The vpcBindings field is updated independently. If it is omitted or set to null, the current value is retained. A non-empty array replaces the current value, and an empty array [] clears it. Updates to IP addresses and VPCs do not clear each other. Source restrictions are retained if the source is null or if you update only other fields. An empty request body {} clears the IP address whitelist, IP blacklist, and VPC restrictions. You can also explicitly commit empty IP and VPC arrays to clear all source restrictions. To update the access policy, you must commit only the permissionPolicy and expectedPolicyVersion fields. Do not include other fields, including source fields with null values.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKeyWithOptions(String apiKeyID, UpdateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiKey"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates an API key. IP blacklists and whitelists follow a paired replacement rule. If you commit a non-null array for one list and omit the other list or set it to null, the omitted list is cleared. If both lists are omitted or set to null, they are retained. The vpcBindings field is updated independently. If it is omitted or set to null, the current value is retained. A non-empty array replaces the current value, and an empty array [] clears it. Updates to IP addresses and VPCs do not clear each other. Source restrictions are retained if the source is null or if you update only other fields. An empty request body {} clears the IP address whitelist, IP blacklist, and VPC restrictions. You can also explicitly commit empty IP and VPC arrays to clear all source restrictions. To update the access policy, you must commit only the permissionPolicy and expectedPolicyVersion fields. Do not include other fields, including source fields with null values.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKey(String apiKeyID, UpdateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom domain name.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomainWithOptions(String domainName, UpdateCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomDomain"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom domain name.</p>
     * 
     * @param request UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    public UpdateCustomDomainResponse updateCustomDomain(String domainName, UpdateCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomDomainWithOptions(domainName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the quota configuration.</p>
     * 
     * @param request UpdateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuotaWithOptions(UpdateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/quotas/tag"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the quota configuration.</p>
     * 
     * @param request UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuota(UpdateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified team.</p>
     * 
     * @param request UpdateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeamWithOptions(String teamID, UpdateTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTeam"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified team.</p>
     * 
     * @param request UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(String teamID, UpdateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a template. For runtimeConfig.vpcBindings, you can omit the field or set it to null to retain the current bindings, provide a non-empty array to replace the entire list, or provide an empty array [] to clear the list. The new list takes effect when the new version is successfully built. Existing sandboxes continue to use the original configuration. If the build fails, the original effective version is retained.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a template.</p>
     * 
     * @param request UpdateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(String templateID, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a template. For runtimeConfig.vpcBindings, you can omit the field or set it to null to retain the current bindings, provide a non-empty array to replace the entire list, or provide an empty array [] to clear the list. The new list takes effect when the new version is successfully built. Existing sandboxes continue to use the original configuration. If the build fails, the original effective version is retained.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a template.</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String templateID, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified storage volume.</p>
     * 
     * @param request UpdateVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVolumeResponse
     */
    public UpdateVolumeResponse updateVolumeWithOptions(String volumeID, UpdateVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVolume"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified storage volume.</p>
     * 
     * @param request UpdateVolumeRequest
     * @return UpdateVolumeResponse
     */
    public UpdateVolumeResponse updateVolume(String volumeID, UpdateVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVolumeWithOptions(volumeID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the capacity policy of a warm pool.</p>
     * 
     * @param request UpdateWarmPoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWarmPoolResponse
     */
    public UpdateWarmPoolResponse updateWarmPoolWithOptions(String teamID, String templateID, UpdateWarmPoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWarmPool"),
            new TeaPair("version", "2026-08-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-08-20/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + "/warmPools/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWarmPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the capacity policy of a warm pool.</p>
     * 
     * @param request UpdateWarmPoolRequest
     * @return UpdateWarmPoolResponse
     */
    public UpdateWarmPoolResponse updateWarmPool(String teamID, String templateID, UpdateWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWarmPoolWithOptions(teamID, templateID, request, headers, runtime);
    }
}
