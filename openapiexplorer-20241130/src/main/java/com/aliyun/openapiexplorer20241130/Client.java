// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130;

import com.aliyun.tea.*;
import com.aliyun.openapiexplorer20241130.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过POST或GET方法调用。</li>
     * <li><code>Accept-Language</code>请求头必须设置为<code>zh-CN</code>或<code>en-US</code>之一，用于指定返回结果的语言类型。</li>
     * <li>错误码格式需符合特定规则，特别是针对OSS的错误码应遵循正则表达式<code>[0-9]{4}-[0-9]{8}</code>。</li>
     * <li>当前实现中未使用<code>maxResults</code>和<code>nextToken</code>参数。</li>
     * <li>如果请求失败，将根据不同的错误情况返回相应的错误代码及描述信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据提供的错误码获取对应的解决方案</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetErrorCodeSolutionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetErrorCodeSolutionsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过POST或GET方法调用。</li>
     * <li><code>Accept-Language</code>请求头必须设置为<code>zh-CN</code>或<code>en-US</code>之一，用于指定返回结果的语言类型。</li>
     * <li>错误码格式需符合特定规则，特别是针对OSS的错误码应遵循正则表达式<code>[0-9]{4}-[0-9]{8}</code>。</li>
     * <li>当前实现中未使用<code>maxResults</code>和<code>nextToken</code>参数。</li>
     * <li>如果请求失败，将根据不同的错误情况返回相应的错误代码及描述信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>根据提供的错误码获取对应的解决方案</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过API RequestId 查询当前账号调用OpenAPI的日志详情，用于故障排查。</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetOwnRequestLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetOwnRequestLogResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过API RequestId 查询当前账号调用OpenAPI的日志详情，用于故障排查。</p>
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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过API请求ID查询特定请求的日志详情，用于故障排查。</p>
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRequestLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRequestLogResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过API请求ID查询特定请求的日志详情，用于故障排查。</p>
     * 
     * @param request GetRequestLogRequest
     * @return GetRequestLogResponse
     */
    public GetRequestLogResponse getRequestLog(GetRequestLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRequestLogWithOptions(request, headers, runtime);
    }
}
