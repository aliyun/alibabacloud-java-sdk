// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130;

import com.aliyun.tea.*;
import com.aliyun.openapiexplorer20241130.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "openapi-mcp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "openapi-mcp.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("openapiexplorer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>验证 Terraform HCL 语法</p>
     * 
     * @param request ApiMcpServerValidateHclRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApiMcpServerValidateHclResponse
     */
    public ApiMcpServerValidateHclResponse apiMcpServerValidateHclWithOptions(ApiMcpServerValidateHclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApiMcpServerValidateHcl"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/terraform/validate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApiMcpServerValidateHclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证 Terraform HCL 语法</p>
     * 
     * @param request ApiMcpServerValidateHclRequest
     * @return ApiMcpServerValidateHclResponse
     */
    public ApiMcpServerValidateHclResponse apiMcpServerValidateHcl(ApiMcpServerValidateHclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiMcpServerValidateHclWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ApiMcpServer</p>
     * 
     * @param request CreateApiMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiMcpServerResponse
     */
    public CreateApiMcpServerResponse createApiMcpServerWithOptions(CreateApiMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalApiDescriptions)) {
            body.put("additionalApiDescriptions", request.additionalApiDescriptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apis)) {
            body.put("apis", request.apis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assumeRoleExtraPolicy)) {
            body.put("assumeRoleExtraPolicy", request.assumeRoleExtraPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assumeRoleName)) {
            body.put("assumeRoleName", request.assumeRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAssumeRole)) {
            body.put("enableAssumeRole", request.enableAssumeRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCustomVpcWhitelist)) {
            body.put("enableCustomVpcWhitelist", request.enableCustomVpcWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oauthClientId)) {
            body.put("oauthClientId", request.oauthClientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompts)) {
            body.put("prompts", request.prompts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicAccess)) {
            body.put("publicAccess", request.publicAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemTools)) {
            body.put("systemTools", request.systemTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformTools)) {
            body.put("terraformTools", request.terraformTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcWhitelists)) {
            body.put("vpcWhitelists", request.vpcWhitelists);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiMcpServer"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apimcpserver"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ApiMcpServer</p>
     * 
     * @param request CreateApiMcpServerRequest
     * @return CreateApiMcpServerResponse
     */
    public CreateApiMcpServerResponse createApiMcpServer(CreateApiMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiMcpServerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ApiMcpServer</p>
     * 
     * @param request DeleteApiMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiMcpServerResponse
     */
    public DeleteApiMcpServerResponse deleteApiMcpServerWithOptions(DeleteApiMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiMcpServer"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apimcpserver"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ApiMcpServer</p>
     * 
     * @param request DeleteApiMcpServerRequest
     * @return DeleteApiMcpServerResponse
     */
    public DeleteApiMcpServerResponse deleteApiMcpServer(DeleteApiMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiMcpServerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>动态生成Aliyun CLI命令</p>
     * 
     * @param tmpReq GenerateCLICommandRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCLICommandResponse
     */
    public GenerateCLICommandResponse generateCLICommandWithOptions(GenerateCLICommandRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateCLICommandShrinkRequest request = new GenerateCLICommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiParams)) {
            request.apiParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiParams, "apiParams", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            body.put("api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiParamsShrink)) {
            body.put("apiParams", request.apiParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            body.put("apiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonApiParams)) {
            body.put("jsonApiParams", request.jsonApiParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCLICommand"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/cli/makeCode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCLICommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>动态生成Aliyun CLI命令</p>
     * 
     * @param request GenerateCLICommandRequest
     * @return GenerateCLICommandResponse
     */
    public GenerateCLICommandResponse generateCLICommand(GenerateCLICommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateCLICommandWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品相关接口的开放元数据</p>
     * 
     * @param request GetApiDefinitionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiDefinitionResponse
     */
    public GetApiDefinitionResponse getApiDefinitionWithOptions(GetApiDefinitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("apiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiDefinition"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/definition"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品相关接口的开放元数据</p>
     * 
     * @param request GetApiDefinitionRequest
     * @return GetApiDefinitionResponse
     */
    public GetApiDefinitionResponse getApiDefinition(GetApiDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiDefinitionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 ApiMcpServer</p>
     * 
     * @param request GetApiMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiMcpServerResponse
     */
    public GetApiMcpServerResponse getApiMcpServerWithOptions(GetApiMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiMcpServer"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apimcpserver"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 ApiMcpServer</p>
     * 
     * @param request GetApiMcpServerRequest
     * @return GetApiMcpServerResponse
     */
    public GetApiMcpServerResponse getApiMcpServer(GetApiMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiMcpServerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户全局API MCP Server配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiMcpServerUserConfigResponse
     */
    public GetApiMcpServerUserConfigResponse getApiMcpServerUserConfigWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiMcpServerUserConfig"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/userconfig/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiMcpServerUserConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户全局API MCP Server配置</p>
     * @return GetApiMcpServerUserConfigResponse
     */
    public GetApiMcpServerUserConfigResponse getApiMcpServerUserConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiMcpServerUserConfigWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query public information instead of special information, such as the account ownership. Permissions on this API operation cannot be granted to other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an error solution by error code.</p>
     * 
     * @param request GetErrorCodeSolutionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErrorCodeSolutionsResponse
     */
    public GetErrorCodeSolutionsResponse getErrorCodeSolutionsWithOptions(GetErrorCodeSolutionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            query.put("errorCode", request.errorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorMessage)) {
            query.put("errorMessage", request.errorMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErrorCodeSolutions"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/getErrorCodeSolutions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErrorCodeSolutionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query public information instead of special information, such as the account ownership. Permissions on this API operation cannot be granted to other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an error solution by error code.</p>
     * 
     * @param request GetErrorCodeSolutionsRequest
     * @return GetErrorCodeSolutionsResponse
     */
    public GetErrorCodeSolutionsResponse getErrorCodeSolutions(GetErrorCodeSolutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getErrorCodeSolutionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Permissions on this API cannot be granted to other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an API call performed by using the current account based on the returned request ID of the API to troubleshoot issues.</p>
     * 
     * @param request GetOwnRequestLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOwnRequestLogResponse
     */
    public GetOwnRequestLogResponse getOwnRequestLogWithOptions(GetOwnRequestLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            query.put("logRequestId", request.logRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOwnRequestLog"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/getOwnRequestLog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOwnRequestLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Permissions on this API cannot be granted to other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an API call performed by using the current account based on the returned request ID of the API to troubleshoot issues.</p>
     * 
     * @param request GetOwnRequestLogRequest
     * @return GetOwnRequestLogResponse
     */
    public GetOwnRequestLogResponse getOwnRequestLog(GetOwnRequestLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOwnRequestLogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品的接入点信息</p>
     * 
     * @param request GetProductEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductEndpointsResponse
     */
    public GetProductEndpointsResponse getProductEndpointsWithOptions(GetProductEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductEndpoints"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/product/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品的接入点信息</p>
     * 
     * @param request GetProductEndpointsRequest
     * @return GetProductEndpointsResponse
     */
    public GetProductEndpointsResponse getProductEndpoints(GetProductEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductEndpointsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can grant permissions to a Resource Access Management (RAM) user or assume a role to query the log of an API call across RAM users or Alibaba Cloud accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2868101.html">Grant permissions to troubleshoot API errors across accounts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an API call based on the returned request ID of the API to troubleshoot issues.</p>
     * 
     * @param request GetRequestLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRequestLogResponse
     */
    public GetRequestLogResponse getRequestLogWithOptions(GetRequestLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            query.put("logRequestId", request.logRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRequestLog"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/getRequestLog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRequestLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can grant permissions to a Resource Access Management (RAM) user or assume a role to query the log of an API call across RAM users or Alibaba Cloud accounts. For more information, see <a href="https://help.aliyun.com/document_detail/2868101.html">Grant permissions to troubleshoot API errors across accounts</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an API call based on the returned request ID of the API to troubleshoot issues.</p>
     * 
     * @param request GetRequestLogRequest
     * @return GetRequestLogResponse
     */
    public GetRequestLogResponse getRequestLog(GetRequestLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRequestLogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品的开放元数据</p>
     * 
     * @param request ListApiDefinitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiDefinitionsResponse
     */
    public ListApiDefinitionsResponse listApiDefinitionsWithOptions(ListApiDefinitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            query.put("apiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiDefinitions"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/definitions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiDefinitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取产品的开放元数据</p>
     * 
     * @param request ListApiDefinitionsRequest
     * @return ListApiDefinitionsResponse
     */
    public ListApiDefinitionsResponse listApiDefinitions(ListApiDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiDefinitionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统工具列表</p>
     * 
     * @param request ListApiMcpServerSystemToolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiMcpServerSystemToolsResponse
     */
    public ListApiMcpServerSystemToolsResponse listApiMcpServerSystemToolsWithOptions(ListApiMcpServerSystemToolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("skip", request.skip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiMcpServerSystemTools"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/mcpSystemTools"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiMcpServerSystemToolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统工具列表</p>
     * 
     * @param request ListApiMcpServerSystemToolsRequest
     * @return ListApiMcpServerSystemToolsResponse
     */
    public ListApiMcpServerSystemToolsResponse listApiMcpServerSystemTools(ListApiMcpServerSystemToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiMcpServerSystemToolsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源ApiMcpServer</p>
     * 
     * @param request ListApiMcpServersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiMcpServersResponse
     */
    public ListApiMcpServersResponse listApiMcpServersWithOptions(ListApiMcpServersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("createTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTime)) {
            query.put("updateTime", request.updateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiMcpServers"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apimcpservers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiMcpServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源ApiMcpServer</p>
     * 
     * @param request ListApiMcpServersRequest
     * @return ListApiMcpServersResponse
     */
    public ListApiMcpServersResponse listApiMcpServers(ListApiMcpServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiMcpServersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateApiMcpServer</p>
     * 
     * @param request UpdateApiMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiMcpServerResponse
     */
    public UpdateApiMcpServerResponse updateApiMcpServerWithOptions(UpdateApiMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalApiDescriptions)) {
            body.put("additionalApiDescriptions", request.additionalApiDescriptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apis)) {
            body.put("apis", request.apis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assumeRoleExtraPolicy)) {
            body.put("assumeRoleExtraPolicy", request.assumeRoleExtraPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assumeRoleName)) {
            body.put("assumeRoleName", request.assumeRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAssumeRole)) {
            body.put("enableAssumeRole", request.enableAssumeRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCustomVpcWhitelist)) {
            body.put("enableCustomVpcWhitelist", request.enableCustomVpcWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oauthClientId)) {
            body.put("oauthClientId", request.oauthClientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompts)) {
            body.put("prompts", request.prompts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicAccess)) {
            body.put("publicAccess", request.publicAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemTools)) {
            body.put("systemTools", request.systemTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformTools)) {
            body.put("terraformTools", request.terraformTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcWhitelists)) {
            body.put("vpcWhitelists", request.vpcWhitelists);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiMcpServer"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apimcpserver"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateApiMcpServer</p>
     * 
     * @param request UpdateApiMcpServerRequest
     * @return UpdateApiMcpServerResponse
     */
    public UpdateApiMcpServerResponse updateApiMcpServer(UpdateApiMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiMcpServerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户全局API MCP Server配置</p>
     * 
     * @param request UpdateApiMcpServerUserConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiMcpServerUserConfigResponse
     */
    public UpdateApiMcpServerUserConfigResponse updateApiMcpServerUserConfigWithOptions(UpdateApiMcpServerUserConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePublicAccess)) {
            body.put("enablePublicAccess", request.enablePublicAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcWhitelists)) {
            body.put("vpcWhitelists", request.vpcWhitelists);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiMcpServerUserConfig"),
            new TeaPair("version", "2024-11-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/userconfig/update"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiMcpServerUserConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户全局API MCP Server配置</p>
     * 
     * @param request UpdateApiMcpServerUserConfigRequest
     * @return UpdateApiMcpServerUserConfigResponse
     */
    public UpdateApiMcpServerUserConfigResponse updateApiMcpServerUserConfig(UpdateApiMcpServerUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiMcpServerUserConfigWithOptions(request, headers, runtime);
    }
}
