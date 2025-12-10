// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202;

import com.aliyun.tea.*;
import com.aliyun.paistudio20210202.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.data.aliyun.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "pai.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "pai.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "pai.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "pai.cn-zhangjiakou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paistudio", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>复制实验</p>
     * 
     * @param request CopyExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyExperimentResponse
     */
    public CopyExperimentResponse copyExperimentWithOptions(String ExperimentId, CopyExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/copy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>复制实验</p>
     * 
     * @param request CopyExperimentRequest
     * @return CopyExperimentResponse
     */
    public CopyExperimentResponse copyExperiment(String ExperimentId, CopyExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.copyExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验，或根据实验模版创建实验</p>
     * 
     * @param request CreateExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentResponse
     */
    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验，或根据实验模版创建实验</p>
     * 
     * @param request CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    public CreateExperimentResponse createExperiment(CreateExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建算法文件夹</p>
     * 
     * @param request CreateExperimentFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentFolderResponse
     */
    public CreateExperimentFolderResponse createExperimentFolderWithOptions(CreateExperimentFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            body.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentFolder"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建算法文件夹</p>
     * 
     * @param request CreateExperimentFolderRequest
     * @return CreateExperimentFolderResponse
     */
    public CreateExperimentFolderResponse createExperimentFolder(CreateExperimentFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentFolderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验实验是否能迁移</p>
     * 
     * @param request CreateExperimentMigrateValidationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentMigrateValidationResponse
     */
    public CreateExperimentMigrateValidationResponse createExperimentMigrateValidationWithOptions(CreateExperimentMigrateValidationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceExpId)) {
            query.put("SourceExpId", request.sourceExpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentMigrateValidation"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/migrate/experimentvalidation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentMigrateValidationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验实验是否能迁移</p>
     * 
     * @param request CreateExperimentMigrateValidationRequest
     * @return CreateExperimentMigrateValidationResponse
     */
    public CreateExperimentMigrateValidationResponse createExperimentMigrateValidation(CreateExperimentMigrateValidationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentMigrateValidationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个工作流的作业</p>
     * 
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            body.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineDraftId)) {
            body.put("PipelineDraftId", request.pipelineDraftId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个工作流的作业</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验</p>
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除算法文件夹</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentFolderResponse
     */
    public DeleteExperimentFolderResponse deleteExperimentFolderWithOptions(String FolderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentFolder"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + com.aliyun.openapiutil.Client.getEncodeParam(FolderId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除算法文件夹</p>
     * @return DeleteExperimentFolderResponse
     */
    public DeleteExperimentFolderResponse deleteExperimentFolder(String FolderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentFolderWithOptions(FolderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法树</p>
     * 
     * @param request GetAlgoTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgoTreeResponse
     */
    public GetAlgoTreeResponse getAlgoTreeWithOptions(GetAlgoTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgoTree"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algo/tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgoTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法树</p>
     * 
     * @param request GetAlgoTreeRequest
     * @return GetAlgoTreeResponse
     */
    public GetAlgoTreeResponse getAlgoTree(GetAlgoTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgoTreeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法定义</p>
     * 
     * @param request GetAlgorithmDefRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgorithmDefResponse
     */
    public GetAlgorithmDefResponse getAlgorithmDefWithOptions(GetAlgorithmDefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algoVersion)) {
            query.put("AlgoVersion", request.algoVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithmDef"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithm/def"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmDefResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法定义</p>
     * 
     * @param request GetAlgorithmDefRequest
     * @return GetAlgorithmDefResponse
     */
    public GetAlgorithmDefResponse getAlgorithmDef(GetAlgorithmDefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取算法定义</p>
     * 
     * @param request GetAlgorithmDefsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgorithmDefsResponse
     */
    public GetAlgorithmDefsResponse getAlgorithmDefsWithOptions(GetAlgorithmDefsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.latestTimestamp)) {
            query.put("LatestTimestamp", request.latestTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeEnd)) {
            query.put("RangeEnd", request.rangeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeStart)) {
            query.put("RangeStart", request.rangeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("Timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithmDefs"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithm/defs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmDefsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取算法定义</p>
     * 
     * @param request GetAlgorithmDefsRequest
     * @return GetAlgorithmDefsResponse
     */
    public GetAlgorithmDefsResponse getAlgorithmDefs(GetAlgorithmDefsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法树</p>
     * 
     * @param request GetAlgorithmTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlgorithmTreeResponse
     */
    public GetAlgorithmTreeResponse getAlgorithmTreeWithOptions(GetAlgorithmTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithmTree"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithm/tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法树</p>
     * 
     * @param request GetAlgorithmTreeRequest
     * @return GetAlgorithmTreeResponse
     */
    public GetAlgorithmTreeResponse getAlgorithmTree(GetAlgorithmTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmTreeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验信息</p>
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法文件夹下的内容</p>
     * 
     * @param request GetExperimentFolderChildrenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentFolderChildrenResponse
     */
    public GetExperimentFolderChildrenResponse getExperimentFolderChildrenWithOptions(String FolderId, GetExperimentFolderChildrenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyFolder)) {
            query.put("OnlyFolder", request.onlyFolder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentFolderChildren"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + com.aliyun.openapiutil.Client.getEncodeParam(FolderId) + "/children"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentFolderChildrenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取算法文件夹下的内容</p>
     * 
     * @param request GetExperimentFolderChildrenRequest
     * @return GetExperimentFolderChildrenResponse
     */
    public GetExperimentFolderChildrenResponse getExperimentFolderChildren(String FolderId, GetExperimentFolderChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentFolderChildrenWithOptions(FolderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验的元信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentMetaResponse
     */
    public GetExperimentMetaResponse getExperimentMetaWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/meta"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验的元信息</p>
     * @return GetExperimentMetaResponse
     */
    public GetExperimentMetaResponse getExperimentMeta(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentMetaWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验以及实验节点的状态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentStatusResponse
     */
    public GetExperimentStatusResponse getExperimentStatusWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentStatus"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验以及实验节点的状态</p>
     * @return GetExperimentStatusResponse
     */
    public GetExperimentStatusResponse getExperimentStatus(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentStatusWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实验的可视化meta</p>
     * 
     * @param request GetExperimentVisualizationMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentVisualizationMetaResponse
     */
    public GetExperimentVisualizationMetaResponse getExperimentVisualizationMetaWithOptions(String ExperimentId, GetExperimentVisualizationMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentVisualizationMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/visualizationMeta"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentVisualizationMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实验的可视化meta</p>
     * 
     * @param request GetExperimentVisualizationMetaRequest
     * @return GetExperimentVisualizationMetaResponse
     */
    public GetExperimentVisualizationMetaResponse getExperimentVisualizationMeta(String ExperimentId, GetExperimentVisualizationMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentVisualizationMetaWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验的统计信息</p>
     * 
     * @param request GetExperimentsStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentsStatisticsResponse
     */
    public GetExperimentsStatisticsResponse getExperimentsStatisticsWithOptions(GetExperimentsStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentsStatistics"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/statistics/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentsStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验的统计信息</p>
     * 
     * @param request GetExperimentsStatisticsRequest
     * @return GetExperimentsStatisticsResponse
     */
    public GetExperimentsStatisticsResponse getExperimentsStatistics(GetExperimentsStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentsStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验或文件夹所有者列表</p>
     * 
     * @param request GetExperimentsUsersStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentsUsersStatisticsResponse
     */
    public GetExperimentsUsersStatisticsResponse getExperimentsUsersStatisticsWithOptions(GetExperimentsUsersStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentsUsersStatistics"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/statistics/experimentsusers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentsUsersStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验或文件夹所有者列表</p>
     * 
     * @param request GetExperimentsUsersStatisticsRequest
     * @return GetExperimentsUsersStatisticsResponse
     */
    public GetExperimentsUsersStatisticsResponse getExperimentsUsersStatistics(GetExperimentsUsersStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentsUsersStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个PAI Studio作业详情</p>
     * 
     * @param request GetJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String JobId, GetJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个PAI Studio作业详情</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(String JobId, GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(JobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取MaxCompute表schema</p>
     * 
     * @param request GetMCTableSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMCTableSchemaResponse
     */
    public GetMCTableSchemaResponse getMCTableSchemaWithOptions(String TableName, GetMCTableSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMCTableSchema"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasources/maxcompute/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(TableName) + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMCTableSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取MaxCompute表schema</p>
     * 
     * @param request GetMCTableSchemaRequest
     * @return GetMCTableSchemaResponse
     */
    public GetMCTableSchemaResponse getMCTableSchema(String TableName, GetMCTableSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMCTableSchemaWithOptions(TableName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验节点输入桩的输入表的格式</p>
     * 
     * @param request GetNodeInputSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeInputSchemaResponse
     */
    public GetNodeInputSchemaResponse getNodeInputSchemaWithOptions(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputId)) {
            query.put("InputId", request.inputId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputIndex)) {
            query.put("InputIndex", request.inputIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeInputSchema"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(NodeId) + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeInputSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验节点输入桩的输入表的格式</p>
     * 
     * @param request GetNodeInputSchemaRequest
     * @return GetNodeInputSchemaResponse
     */
    public GetNodeInputSchemaResponse getNodeInputSchema(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeInputSchemaWithOptions(ExperimentId, NodeId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个节点的输出模型信息</p>
     * 
     * @param request GetNodeOutputRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeOutputResponse
     */
    public GetNodeOutputResponse getNodeOutputWithOptions(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputIndex)) {
            query.put("OutputIndex", request.outputIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeOutput"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(NodeId) + "/outputs/" + com.aliyun.openapiutil.Client.getEncodeParam(OutputId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个节点的输出模型信息</p>
     * 
     * @param request GetNodeOutputRequest
     * @return GetNodeOutputResponse
     */
    public GetNodeOutputResponse getNodeOutput(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeOutputWithOptions(ExperimentId, NodeId, OutputId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取PAI Studio中指定模板</p>
     * 
     * @param request GetTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String TemplateId, GetTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
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
     * <p>获取PAI Studio中指定模板</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String TemplateId, GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(TemplateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权角色列表</p>
     * 
     * @param request ListAuthRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthRolesResponse
     */
    public ListAuthRolesResponse listAuthRolesWithOptions(ListAuthRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isGenerateToken)) {
            query.put("IsGenerateToken", request.isGenerateToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthRoles"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/authorization/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权角色列表</p>
     * 
     * @param request ListAuthRolesRequest
     * @return ListAuthRolesResponse
     */
    public ListAuthRolesResponse listAuthRoles(ListAuthRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验列表</p>
     * 
     * @param request ListExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperiments"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验列表</p>
     * 
     * @param request ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperiments(ListExperimentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举标签</p>
     * 
     * @param request ListImageLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageLabelsResponse
     */
    public ListImageLabelsResponse listImageLabelsWithOptions(ListImageLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelFilter)) {
            query.put("LabelFilter", request.labelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageLabels"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/image/labels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举标签</p>
     * 
     * @param request ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    public ListImageLabelsResponse listImageLabels(ListImageLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImageLabelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举已注册镜像</p>
     * 
     * @param request ListImagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举已注册镜像</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业详情</p>
     * 
     * @param request ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取作业详情</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个节点的输出模型列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeOutputsResponse
     */
    public ListNodeOutputsResponse listNodeOutputsWithOptions(String ExperimentId, String NodeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeOutputs"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(NodeId) + "/outputs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeOutputsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个节点的输出模型列表</p>
     * @return ListNodeOutputsResponse
     */
    public ListNodeOutputsResponse listNodeOutputs(String ExperimentId, String NodeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeOutputsWithOptions(ExperimentId, NodeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取最近的实验</p>
     * 
     * @param request ListRecentExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentExperimentsResponse
     */
    public ListRecentExperimentsResponse listRecentExperimentsWithOptions(ListRecentExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentExperiments"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recentexperiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取最近的实验</p>
     * 
     * @param request ListRecentExperimentsRequest
     * @return ListRecentExperimentsResponse
     */
    public ListRecentExperimentsResponse listRecentExperiments(ListRecentExperimentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecentExperimentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取PAI Studio中指定模板列表</p>
     * 
     * @param request ListTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.list)) {
            query.put("List", request.list);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/templates"),
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
     * <p>获取PAI Studio中指定模板列表</p>
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
     * <p>迁移PAI Studio 1.0的实验目录 </p>
     * 
     * @param request MigrateExperimentFoldersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateExperimentFoldersResponse
     */
    public MigrateExperimentFoldersResponse migrateExperimentFoldersWithOptions(MigrateExperimentFoldersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOwner)) {
            query.put("IsOwner", request.isOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateExperimentFolders"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/migrate/folders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateExperimentFoldersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>迁移PAI Studio 1.0的实验目录 </p>
     * 
     * @param request MigrateExperimentFoldersRequest
     * @return MigrateExperimentFoldersResponse
     */
    public MigrateExperimentFoldersResponse migrateExperimentFolders(MigrateExperimentFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateExperimentFoldersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>迁移PAI Studio 1.0的实验</p>
     * 
     * @param request MigrateExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateExperimentsResponse
     */
    public MigrateExperimentsResponse migrateExperimentsWithOptions(MigrateExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destFolderId)) {
            query.put("DestFolderId", request.destFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOwner)) {
            query.put("IsOwner", request.isOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceExpId)) {
            query.put("SourceExpId", request.sourceExpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateIfExists)) {
            query.put("UpdateIfExists", request.updateIfExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateExperiments"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/migrate/experiments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>迁移PAI Studio 1.0的实验</p>
     * 
     * @param request MigrateExperimentsRequest
     * @return MigrateExperimentsResponse
     */
    public MigrateExperimentsResponse migrateExperiments(MigrateExperimentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateExperimentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览Maxcompute表数据</p>
     * 
     * @param request PreviewMCTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewMCTableResponse
     */
    public PreviewMCTableResponse previewMCTableWithOptions(String TableName, PreviewMCTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("Partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewMCTable"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasources/maxcompute/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(TableName) + "/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewMCTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预览Maxcompute表数据</p>
     * 
     * @param request PreviewMCTableRequest
     * @return PreviewMCTableResponse
     */
    public PreviewMCTableResponse previewMCTable(String TableName, PreviewMCTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewMCTableWithOptions(TableName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布实验</p>
     * 
     * @param request PublishExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishExperimentResponse
     */
    public PublishExperimentResponse publishExperimentWithOptions(String ExperimentId, PublishExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布实验</p>
     * 
     * @param request PublishExperimentRequest
     * @return PublishExperimentResponse
     */
    public PublishExperimentResponse publishExperiment(String ExperimentId, PublishExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实验的可视化数据</p>
     * 
     * @param request QueryExperimentVisualizationDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExperimentVisualizationDataResponse
     */
    public QueryExperimentVisualizationDataResponse queryExperimentVisualizationDataWithOptions(String ExperimentId, QueryExperimentVisualizationDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExperimentVisualizationData"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/visualizationDataQuery"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExperimentVisualizationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实验的可视化数据</p>
     * 
     * @param request QueryExperimentVisualizationDataRequest
     * @return QueryExperimentVisualizationDataResponse
     */
    public QueryExperimentVisualizationDataResponse queryExperimentVisualizationData(String ExperimentId, QueryExperimentVisualizationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExperimentVisualizationDataWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索MaxCompute表</p>
     * 
     * @param request SearchMCTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMCTablesResponse
     */
    public SearchMCTablesResponse searchMCTablesWithOptions(SearchMCTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMCTables"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasources/maxcompute/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMCTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索MaxCompute表</p>
     * 
     * @param request SearchMCTablesRequest
     * @return SearchMCTablesResponse
     */
    public SearchMCTablesResponse searchMCTables(SearchMCTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMCTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止实验所有运行中的作业</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopExperimentResponse
     */
    public StopExperimentResponse stopExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止实验所有运行中的作业</p>
     * @return StopExperimentResponse
     */
    public StopExperimentResponse stopExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止一个实验的作业</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopJobResponse
     */
    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJob"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(JobId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止一个实验的作业</p>
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(String JobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验内容</p>
     * 
     * @param request UpdateExperimentContentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentContentResponse
     */
    public UpdateExperimentContentResponse updateExperimentContentWithOptions(String ExperimentId, UpdateExperimentContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentContent"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/content"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验内容</p>
     * 
     * @param request UpdateExperimentContentRequest
     * @return UpdateExperimentContentResponse
     */
    public UpdateExperimentContentResponse updateExperimentContent(String ExperimentId, UpdateExperimentContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentContentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新算法文件夹</p>
     * 
     * @param request UpdateExperimentFolderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentFolderResponse
     */
    public UpdateExperimentFolderResponse updateExperimentFolderWithOptions(String FolderId, UpdateExperimentFolderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            body.put("ParentFolderId", request.parentFolderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentFolder"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + com.aliyun.openapiutil.Client.getEncodeParam(FolderId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新算法文件夹</p>
     * 
     * @param request UpdateExperimentFolderRequest
     * @return UpdateExperimentFolderResponse
     */
    public UpdateExperimentFolderResponse updateExperimentFolder(String FolderId, UpdateExperimentFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentFolderWithOptions(FolderId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验的Meta信息</p>
     * 
     * @param request UpdateExperimentMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentMetaResponse
     */
    public UpdateExperimentMetaResponse updateExperimentMetaWithOptions(String ExperimentId, UpdateExperimentMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/meta"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验的Meta信息</p>
     * 
     * @param request UpdateExperimentMetaRequest
     * @return UpdateExperimentMetaResponse
     */
    public UpdateExperimentMetaResponse updateExperimentMeta(String ExperimentId, UpdateExperimentMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentMetaWithOptions(ExperimentId, request, headers, runtime);
    }
}
