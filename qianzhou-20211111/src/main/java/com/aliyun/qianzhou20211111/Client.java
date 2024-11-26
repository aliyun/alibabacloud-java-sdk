// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111;

import com.aliyun.tea.*;
import com.aliyun.qianzhou20211111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qianzhou", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>ACK AI助手千舟InnerAPI</p>
     * 
     * @param request AICreateSessionMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AICreateSessionMessageResponse
     */
    public AICreateSessionMessageResponse aICreateSessionMessageWithOptions(AICreateSessionMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.employeeId)) {
            query.put("employee_id", request.employeeId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            body.put("context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AICreateSessionMessage"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/AICreateSessionMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AICreateSessionMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ACK AI助手千舟InnerAPI</p>
     * 
     * @param request AICreateSessionMessageRequest
     * @return AICreateSessionMessageResponse
     */
    public AICreateSessionMessageResponse aICreateSessionMessage(AICreateSessionMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aICreateSessionMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDiagnosis</p>
     * 
     * @param request CreateDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnosisResponse
     */
    public CreateDiagnosisResponse createDiagnosisWithOptions(CreateDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterID)) {
            query.put("clusterID", request.clusterID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnosisType)) {
            query.put("diagnosisType", request.diagnosisType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnosis"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/createDiagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDiagnosis</p>
     * 
     * @param request CreateDiagnosisRequest
     * @return CreateDiagnosisResponse
     */
    public CreateDiagnosisResponse createDiagnosis(CreateDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群信息</p>
     * 
     * @param request GetClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterID)) {
            query.put("clusterID", request.clusterID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/getCluster"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群信息</p>
     * 
     * @param request GetClusterRequest
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单个集群的高危风险项</p>
     * 
     * @param request GetClusterWarningRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterWarningResponse
     */
    public GetClusterWarningResponse getClusterWarningWithOptions(GetClusterWarningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterID)) {
            query.put("clusterID", request.clusterID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterWarning"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/getKeyClusterWarningList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterWarningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单个集群的高危风险项</p>
     * 
     * @param request GetClusterWarningRequest
     * @return GetClusterWarningResponse
     */
    public GetClusterWarningResponse getClusterWarning(GetClusterWarningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWarningWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetDiagnosisResult</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResultWithOptions(GetDiagnosisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnosisId)) {
            query.put("diagnosisId", request.diagnosisId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("ownerUid", request.ownerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnosisResult"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/GetDiagnosisResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetDiagnosisResult</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResult(GetDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDiagnosisResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单个用户的高危集群</p>
     * 
     * @param request GetUserClusterWarningRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserClusterWarningResponse
     */
    public GetUserClusterWarningResponse getUserClusterWarningWithOptions(GetUserClusterWarningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserClusterWarning"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/listUserKeyClusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserClusterWarningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单个用户的高危集群</p>
     * 
     * @param request GetUserClusterWarningRequest
     * @return GetUserClusterWarningResponse
     */
    public GetUserClusterWarningResponse getUserClusterWarning(GetUserClusterWarningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserClusterWarningWithOptions(request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI GetWebshellToken is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWebshellTokenResponse
     */
    @Deprecated
    // Deprecated
    public GetWebshellTokenResponse getWebshellTokenWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebshellToken"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/getChorusToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebshellTokenResponse());
    }

    /**
     * @deprecated OpenAPI GetWebshellToken is deprecated
     * @return GetWebshellTokenResponse
     */
    @Deprecated
    // Deprecated
    public GetWebshellTokenResponse getWebshellToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWebshellTokenWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>测试接口</p>
     * 
     * @param request HelloRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HelloResponse
     */
    public HelloResponse helloWithOptions(HelloRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("user", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Hello"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/hello"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HelloResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>测试接口</p>
     * 
     * @param request HelloRequest
     * @return HelloResponse
     */
    public HelloResponse hello(HelloRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.helloWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某集群废弃api的统计情况</p>
     * 
     * @param request ListClusterDeprecatedAPIRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterDeprecatedAPIResponse
     */
    public ListClusterDeprecatedAPIResponse listClusterDeprecatedAPIWithOptions(ListClusterDeprecatedAPIRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("target_version", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterDeprecatedAPI"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/listDeprecatedK8sAPI"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterDeprecatedAPIResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某集群废弃api的统计情况</p>
     * 
     * @param request ListClusterDeprecatedAPIRequest
     * @return ListClusterDeprecatedAPIResponse
     */
    public ListClusterDeprecatedAPIResponse listClusterDeprecatedAPI(ListClusterDeprecatedAPIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterDeprecatedAPIWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某集群中的Image列表</p>
     * 
     * @param request ListClusterImagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterImagesResponse
     */
    public ListClusterImagesResponse listClusterImagesWithOptions(ListClusterImagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageHash)) {
            query.put("image_hash", request.imageHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("image_name", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterImages"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/listClusterPodImages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某集群中的Image列表</p>
     * 
     * @param request ListClusterImagesRequest
     * @return ListClusterImagesResponse
     */
    public ListClusterImagesResponse listClusterImages(ListClusterImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterImagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户下的集群列表</p>
     * 
     * @param request ListUserClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserClustersResponse
     */
    public ListUserClustersResponse listUserClustersWithOptions(ListUserClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserClusters"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/listUserClusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户下的集群列表</p>
     * 
     * @param request ListUserClustersRequest
     * @return ListUserClustersResponse
     */
    public ListUserClustersResponse listUserClusters(ListUserClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserClustersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点相关集群、用户信息</p>
     * 
     * @param request QueryByInstanceInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryByInstanceInfoResponse
     */
    public QueryByInstanceInfoResponse queryByInstanceInfoWithOptions(QueryByInstanceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryByInstanceInfo"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/queryByInstanceInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryByInstanceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点相关集群、用户信息</p>
     * 
     * @param request QueryByInstanceInfoRequest
     * @return QueryByInstanceInfoResponse
     */
    public QueryByInstanceInfoResponse queryByInstanceInfo(QueryByInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryByInstanceInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据节点instanceId查询集群/用户信息</p>
     * 
     * @param request QueryNodeInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryNodeInfoResponse
     */
    public QueryNodeInfoResponse queryNodeInfoWithOptions(QueryNodeInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNodeInfo"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/popapi/queryByInstanceId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNodeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据节点instanceId查询集群/用户信息</p>
     * 
     * @param request QueryNodeInfoRequest
     * @return QueryNodeInfoResponse
     */
    public QueryNodeInfoResponse queryNodeInfo(QueryNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryNodeInfoWithOptions(request, headers, runtime);
    }
}
