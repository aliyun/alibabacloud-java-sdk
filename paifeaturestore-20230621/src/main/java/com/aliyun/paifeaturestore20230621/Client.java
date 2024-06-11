// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621;

import com.aliyun.tea.*;
import com.aliyun.paifeaturestore20230621.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paifeaturestore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 切换生效的热点数据的版本。
     *
     * @param request ChangeProjectFeatureEntityHotIdVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeProjectFeatureEntityHotIdVersionResponse
     */
    public ChangeProjectFeatureEntityHotIdVersionResponse changeProjectFeatureEntityHotIdVersionWithOptions(String InstanceId, String ProjectId, String FeatureEntityName, ChangeProjectFeatureEntityHotIdVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeProjectFeatureEntityHotIdVersion"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityName) + "/action/changehotidversion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeProjectFeatureEntityHotIdVersionResponse());
    }

    /**
     * @summary 切换生效的热点数据的版本。
     *
     * @param request ChangeProjectFeatureEntityHotIdVersionRequest
     * @return ChangeProjectFeatureEntityHotIdVersionResponse
     */
    public ChangeProjectFeatureEntityHotIdVersionResponse changeProjectFeatureEntityHotIdVersion(String InstanceId, String ProjectId, String FeatureEntityName, ChangeProjectFeatureEntityHotIdVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeProjectFeatureEntityHotIdVersionWithOptions(InstanceId, ProjectId, FeatureEntityName, request, headers, runtime);
    }

    /**
     * @summary 检测资源连接状态。
     *
     * @param request CheckInstanceDatasourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceDatasourceResponse
     */
    public CheckInstanceDatasourceResponse checkInstanceDatasourceWithOptions(String InstanceId, CheckInstanceDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstanceDatasource"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/action/checkdatasource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceDatasourceResponse());
    }

    /**
     * @summary 检测资源连接状态。
     *
     * @param request CheckInstanceDatasourceRequest
     * @return CheckInstanceDatasourceResponse
     */
    public CheckInstanceDatasourceResponse checkInstanceDatasource(String InstanceId, CheckInstanceDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInstanceDatasourceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建数据源。
     *
     * @param request CreateDatasourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasourceResponse
     */
    public CreateDatasourceResponse createDatasourceWithOptions(String InstanceId, CreateDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasource"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasourceResponse());
    }

    /**
     * @summary 创建数据源。
     *
     * @param request CreateDatasourceRequest
     * @return CreateDatasourceResponse
     */
    public CreateDatasourceResponse createDatasource(String InstanceId, CreateDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatasourceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建特征实体
     *
     * @param request CreateFeatureEntityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFeatureEntityResponse
     */
    public CreateFeatureEntityResponse createFeatureEntityWithOptions(String InstanceId, CreateFeatureEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinId)) {
            body.put("JoinId", request.joinId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFeatureEntity"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureentities"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFeatureEntityResponse());
    }

    /**
     * @summary 创建特征实体
     *
     * @param request CreateFeatureEntityRequest
     * @return CreateFeatureEntityResponse
     */
    public CreateFeatureEntityResponse createFeatureEntity(String InstanceId, CreateFeatureEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFeatureEntityWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建特征视图。
     *
     * @param request CreateFeatureViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFeatureViewResponse
     */
    public CreateFeatureViewResponse createFeatureViewWithOptions(String InstanceId, CreateFeatureViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureEntityId)) {
            body.put("FeatureEntityId", request.featureEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerDatasourceId)) {
            body.put("RegisterDatasourceId", request.registerDatasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerTable)) {
            body.put("RegisterTable", request.registerTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncOnlineTable)) {
            body.put("SyncOnlineTable", request.syncOnlineTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TTL)) {
            body.put("TTL", request.TTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writeMethod)) {
            body.put("WriteMethod", request.writeMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writeToFeatureDB)) {
            body.put("WriteToFeatureDB", request.writeToFeatureDB);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFeatureView"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFeatureViewResponse());
    }

    /**
     * @summary 创建特征视图。
     *
     * @param request CreateFeatureViewRequest
     * @return CreateFeatureViewResponse
     */
    public CreateFeatureViewResponse createFeatureView(String InstanceId, CreateFeatureViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFeatureViewWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建Feature Store实例。
     *
     * @param request CreateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * @summary 创建Feature Store实例。
     *
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建label表
     *
     * @param request CreateLabelTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabelTableResponse
     */
    public CreateLabelTableResponse createLabelTableWithOptions(String InstanceId, CreateLabelTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabelTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labeltables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabelTableResponse());
    }

    /**
     * @summary 创建label表
     *
     * @param request CreateLabelTableRequest
     * @return CreateLabelTableResponse
     */
    public CreateLabelTableResponse createLabelTable(String InstanceId, CreateLabelTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLabelTableWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建模型特征。
     *
     * @param request CreateModelFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelFeatureResponse
     */
    public CreateModelFeatureResponse createModelFeatureWithOptions(String InstanceId, CreateModelFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.features)) {
            body.put("Features", request.features);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTableId)) {
            body.put("LabelTableId", request.labelTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceFeatureViewIds)) {
            body.put("SequenceFeatureViewIds", request.sequenceFeatureViewIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelFeatureResponse());
    }

    /**
     * @summary 创建模型特征。
     *
     * @param request CreateModelFeatureRequest
     * @return CreateModelFeatureResponse
     */
    public CreateModelFeatureResponse createModelFeature(String InstanceId, CreateModelFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelFeatureWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建训练样本FG表。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelFeatureTrainingSetFGTableResponse
     */
    public CreateModelFeatureTrainingSetFGTableResponse createModelFeatureTrainingSetFGTableWithOptions(String InstanceId, String ModelFeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelFeatureTrainingSetFGTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/trainingsetfgtable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelFeatureTrainingSetFGTableResponse());
    }

    /**
     * @summary 创建训练样本FG表。
     *
     * @return CreateModelFeatureTrainingSetFGTableResponse
     */
    public CreateModelFeatureTrainingSetFGTableResponse createModelFeatureTrainingSetFGTable(String InstanceId, String ModelFeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelFeatureTrainingSetFGTableWithOptions(InstanceId, ModelFeatureId, headers, runtime);
    }

    /**
     * @summary 创建FeatureStore项目
     *
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(String InstanceId, CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineDatasourceId)) {
            body.put("OfflineDatasourceId", request.offlineDatasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineLifeCycle)) {
            body.put("OfflineLifeCycle", request.offlineLifeCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineDatasourceId)) {
            body.put("OnlineDatasourceId", request.onlineDatasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * @summary 创建FeatureStore项目
     *
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(String InstanceId, CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建feature store服务账户角色
     *
     * @param request CreateServiceIdentityRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRoleWithOptions(CreateServiceIdentityRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceIdentityRole"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/serviceidentityroles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceIdentityRoleResponse());
    }

    /**
     * @summary 创建feature store服务账户角色
     *
     * @param request CreateServiceIdentityRoleRequest
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRole(CreateServiceIdentityRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceIdentityRoleWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除指定数据源。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasourceResponse
     */
    public DeleteDatasourceResponse deleteDatasourceWithOptions(String InstanceId, String DatasourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatasource"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasourceResponse());
    }

    /**
     * @summary 删除指定数据源。
     *
     * @return DeleteDatasourceResponse
     */
    public DeleteDatasourceResponse deleteDatasource(String InstanceId, String DatasourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatasourceWithOptions(InstanceId, DatasourceId, headers, runtime);
    }

    /**
     * @summary 删除指定特征实体
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFeatureEntityResponse
     */
    public DeleteFeatureEntityResponse deleteFeatureEntityWithOptions(String InstanceId, String FeatureEntityId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFeatureEntity"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFeatureEntityResponse());
    }

    /**
     * @summary 删除指定特征实体
     *
     * @return DeleteFeatureEntityResponse
     */
    public DeleteFeatureEntityResponse deleteFeatureEntity(String InstanceId, String FeatureEntityId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFeatureEntityWithOptions(InstanceId, FeatureEntityId, headers, runtime);
    }

    /**
     * @summary 删除指定特征视图。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFeatureViewResponse
     */
    public DeleteFeatureViewResponse deleteFeatureViewWithOptions(String InstanceId, String FeatureViewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFeatureView"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFeatureViewResponse());
    }

    /**
     * @summary 删除指定特征视图。
     *
     * @return DeleteFeatureViewResponse
     */
    public DeleteFeatureViewResponse deleteFeatureView(String InstanceId, String FeatureViewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFeatureViewWithOptions(InstanceId, FeatureViewId, headers, runtime);
    }

    /**
     * @summary 删除label表
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLabelTableResponse
     */
    public DeleteLabelTableResponse deleteLabelTableWithOptions(String InstanceId, String LabelTableId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLabelTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labeltables/" + com.aliyun.openapiutil.Client.getEncodeParam(LabelTableId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLabelTableResponse());
    }

    /**
     * @summary 删除label表
     *
     * @return DeleteLabelTableResponse
     */
    public DeleteLabelTableResponse deleteLabelTable(String InstanceId, String LabelTableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLabelTableWithOptions(InstanceId, LabelTableId, headers, runtime);
    }

    /**
     * @summary 删除指定模型特征。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelFeatureResponse
     */
    public DeleteModelFeatureResponse deleteModelFeatureWithOptions(String InstanceId, String ModelFeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelFeatureResponse());
    }

    /**
     * @summary 删除指定模型特征。
     *
     * @return DeleteModelFeatureResponse
     */
    public DeleteModelFeatureResponse deleteModelFeature(String InstanceId, String ModelFeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelFeatureWithOptions(InstanceId, ModelFeatureId, headers, runtime);
    }

    /**
     * @summary 删除指定Feature Store项目。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String InstanceId, String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * @summary 删除指定Feature Store项目。
     *
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String InstanceId, String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(InstanceId, ProjectId, headers, runtime);
    }

    /**
     * @summary 导出训练样本FG表。
     *
     * @param request ExportModelFeatureTrainingSetFGTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportModelFeatureTrainingSetFGTableResponse
     */
    public ExportModelFeatureTrainingSetFGTableResponse exportModelFeatureTrainingSetFGTableWithOptions(String InstanceId, String ModelFeatureId, ExportModelFeatureTrainingSetFGTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trainingSetFgConfig)) {
            body.put("TrainingSetFgConfig", request.trainingSetFgConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportModelFeatureTrainingSetFGTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/action/exporttrainingsetfgtable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportModelFeatureTrainingSetFGTableResponse());
    }

    /**
     * @summary 导出训练样本FG表。
     *
     * @param request ExportModelFeatureTrainingSetFGTableRequest
     * @return ExportModelFeatureTrainingSetFGTableResponse
     */
    public ExportModelFeatureTrainingSetFGTableResponse exportModelFeatureTrainingSetFGTable(String InstanceId, String ModelFeatureId, ExportModelFeatureTrainingSetFGTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportModelFeatureTrainingSetFGTableWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 导出训练集表。
     *
     * @param request ExportModelFeatureTrainingSetTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportModelFeatureTrainingSetTableResponse
     */
    public ExportModelFeatureTrainingSetTableResponse exportModelFeatureTrainingSetTableWithOptions(String InstanceId, String ModelFeatureId, ExportModelFeatureTrainingSetTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureViewConfig)) {
            body.put("FeatureViewConfig", request.featureViewConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelInputConfig)) {
            body.put("LabelInputConfig", request.labelInputConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingSetConfig)) {
            body.put("TrainingSetConfig", request.trainingSetConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportModelFeatureTrainingSetTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/action/exporttrainingsettable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportModelFeatureTrainingSetTableResponse());
    }

    /**
     * @summary 导出训练集表。
     *
     * @param request ExportModelFeatureTrainingSetTableRequest
     * @return ExportModelFeatureTrainingSetTableResponse
     */
    public ExportModelFeatureTrainingSetTableResponse exportModelFeatureTrainingSetTable(String InstanceId, String ModelFeatureId, ExportModelFeatureTrainingSetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportModelFeatureTrainingSetTableWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 获取数据源详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasourceResponse
     */
    public GetDatasourceResponse getDatasourceWithOptions(String InstanceId, String DatasourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatasource"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasourceResponse());
    }

    /**
     * @summary 获取数据源详细信息。
     *
     * @return GetDatasourceResponse
     */
    public GetDatasourceResponse getDatasource(String InstanceId, String DatasourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasourceWithOptions(InstanceId, DatasourceId, headers, runtime);
    }

    /**
     * @summary 获取数据源下指定表的详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasourceTableResponse
     */
    public GetDatasourceTableResponse getDatasourceTableWithOptions(String InstanceId, String DatasourceId, String TableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatasourceTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasourceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(TableName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasourceTableResponse());
    }

    /**
     * @summary 获取数据源下指定表的详细信息。
     *
     * @return GetDatasourceTableResponse
     */
    public GetDatasourceTableResponse getDatasourceTable(String InstanceId, String DatasourceId, String TableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatasourceTableWithOptions(InstanceId, DatasourceId, TableName, headers, runtime);
    }

    /**
     * @summary 获取特征实体详细信息
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureEntityResponse
     */
    public GetFeatureEntityResponse getFeatureEntityWithOptions(String InstanceId, String FeatureEntityId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureEntity"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureEntityResponse());
    }

    /**
     * @summary 获取特征实体详细信息
     *
     * @return GetFeatureEntityResponse
     */
    public GetFeatureEntityResponse getFeatureEntity(String InstanceId, String FeatureEntityId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFeatureEntityWithOptions(InstanceId, FeatureEntityId, headers, runtime);
    }

    /**
     * @summary 获取特征视图详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureViewResponse
     */
    public GetFeatureViewResponse getFeatureViewWithOptions(String InstanceId, String FeatureViewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureView"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureViewResponse());
    }

    /**
     * @summary 获取特征视图详细信息。
     *
     * @return GetFeatureViewResponse
     */
    public GetFeatureViewResponse getFeatureView(String InstanceId, String FeatureViewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFeatureViewWithOptions(InstanceId, FeatureViewId, headers, runtime);
    }

    /**
     * @summary 获取实例详细信息
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * @summary 获取实例详细信息
     *
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 获取Label表详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLabelTableResponse
     */
    public GetLabelTableResponse getLabelTableWithOptions(String InstanceId, String LabelTableId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLabelTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labeltables/" + com.aliyun.openapiutil.Client.getEncodeParam(LabelTableId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLabelTableResponse());
    }

    /**
     * @summary 获取Label表详细信息。
     *
     * @return GetLabelTableResponse
     */
    public GetLabelTableResponse getLabelTable(String InstanceId, String LabelTableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLabelTableWithOptions(InstanceId, LabelTableId, headers, runtime);
    }

    /**
     * @summary 获取模型特征详情。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelFeatureResponse
     */
    public GetModelFeatureResponse getModelFeatureWithOptions(String InstanceId, String ModelFeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelFeatureResponse());
    }

    /**
     * @summary 获取模型特征详情。
     *
     * @return GetModelFeatureResponse
     */
    public GetModelFeatureResponse getModelFeature(String InstanceId, String ModelFeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelFeatureWithOptions(InstanceId, ModelFeatureId, headers, runtime);
    }

    /**
     * @summary 获取模型特征的FG特征配置信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelFeatureFGFeatureResponse
     */
    public GetModelFeatureFGFeatureResponse getModelFeatureFGFeatureWithOptions(String InstanceId, String ModelFeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelFeatureFGFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/fgfeature"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelFeatureFGFeatureResponse());
    }

    /**
     * @summary 获取模型特征的FG特征配置信息。
     *
     * @return GetModelFeatureFGFeatureResponse
     */
    public GetModelFeatureFGFeatureResponse getModelFeatureFGFeature(String InstanceId, String ModelFeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelFeatureFGFeatureWithOptions(InstanceId, ModelFeatureId, headers, runtime);
    }

    /**
     * @summary 获取模型特征的fg.json文件配置信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelFeatureFGInfoResponse
     */
    public GetModelFeatureFGInfoResponse getModelFeatureFGInfoWithOptions(String InstanceId, String ModelFeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelFeatureFGInfo"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/fginfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelFeatureFGInfoResponse());
    }

    /**
     * @summary 获取模型特征的fg.json文件配置信息。
     *
     * @return GetModelFeatureFGInfoResponse
     */
    public GetModelFeatureFGInfoResponse getModelFeatureFGInfo(String InstanceId, String ModelFeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelFeatureFGInfoWithOptions(InstanceId, ModelFeatureId, headers, runtime);
    }

    /**
     * @summary 获取指定Feature Store项目详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String InstanceId, String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * @summary 获取指定Feature Store项目详细信息。
     *
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String InstanceId, String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(InstanceId, ProjectId, headers, runtime);
    }

    /**
     * @summary 获取项目下特征实体详细信息
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectFeatureEntityResponse
     */
    public GetProjectFeatureEntityResponse getProjectFeatureEntityWithOptions(String InstanceId, String ProjectId, String FeatureEntityName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectFeatureEntity"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectFeatureEntityResponse());
    }

    /**
     * @summary 获取项目下特征实体详细信息
     *
     * @return GetProjectFeatureEntityResponse
     */
    public GetProjectFeatureEntityResponse getProjectFeatureEntity(String InstanceId, String ProjectId, String FeatureEntityName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectFeatureEntityWithOptions(InstanceId, ProjectId, FeatureEntityName, headers, runtime);
    }

    /**
     * @summary 获取项目下，指定特征实体指定的热点数据。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectFeatureEntityHotIdsResponse
     */
    public GetProjectFeatureEntityHotIdsResponse getProjectFeatureEntityHotIdsWithOptions(String InstanceId, String ProjectId, String NextSeqNumber, String FeatureEntityName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectFeatureEntityHotIds"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityName) + "/hotids/" + com.aliyun.openapiutil.Client.getEncodeParam(NextSeqNumber) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectFeatureEntityHotIdsResponse());
    }

    /**
     * @summary 获取项目下，指定特征实体指定的热点数据。
     *
     * @return GetProjectFeatureEntityHotIdsResponse
     */
    public GetProjectFeatureEntityHotIdsResponse getProjectFeatureEntityHotIds(String InstanceId, String ProjectId, String NextSeqNumber, String FeatureEntityName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectFeatureEntityHotIdsWithOptions(InstanceId, ProjectId, NextSeqNumber, FeatureEntityName, headers, runtime);
    }

    /**
     * @summary 获取项目下特征视图详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectFeatureViewResponse
     */
    public GetProjectFeatureViewResponse getProjectFeatureViewWithOptions(String InstanceId, String ProjectId, String FeatureViewName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectFeatureView"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectFeatureViewResponse());
    }

    /**
     * @summary 获取项目下特征视图详细信息。
     *
     * @return GetProjectFeatureViewResponse
     */
    public GetProjectFeatureViewResponse getProjectFeatureView(String InstanceId, String ProjectId, String FeatureViewName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectFeatureViewWithOptions(InstanceId, ProjectId, FeatureViewName, headers, runtime);
    }

    /**
     * @summary 获取项目下指定模型特征的详细信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectModelFeatureResponse
     */
    public GetProjectModelFeatureResponse getProjectModelFeatureWithOptions(String InstanceId, String ProjectId, String ModelFeatureName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectModelFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectModelFeatureResponse());
    }

    /**
     * @summary 获取项目下指定模型特征的详细信息。
     *
     * @return GetProjectModelFeatureResponse
     */
    public GetProjectModelFeatureResponse getProjectModelFeature(String InstanceId, String ProjectId, String ModelFeatureName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectModelFeatureWithOptions(InstanceId, ProjectId, ModelFeatureName, headers, runtime);
    }

    /**
     * @summary 获取feature store服务账户角色。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRoleWithOptions(String RoleName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceIdentityRole"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/serviceidentityroles/" + com.aliyun.openapiutil.Client.getEncodeParam(RoleName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceIdentityRoleResponse());
    }

    /**
     * @summary 获取feature store服务账户角色。
     *
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRole(String RoleName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceIdentityRoleWithOptions(RoleName, headers, runtime);
    }

    /**
     * @summary 获取任务详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String InstanceId, String TaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * @summary 获取任务详情
     *
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String InstanceId, String TaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(InstanceId, TaskId, headers, runtime);
    }

    /**
     * @summary 获取数据源下所有表。
     *
     * @param request ListDatasourceTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasourceTablesResponse
     */
    public ListDatasourceTablesResponse listDatasourceTablesWithOptions(String InstanceId, String DatasourceId, ListDatasourceTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasourceTables"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasourceId) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasourceTablesResponse());
    }

    /**
     * @summary 获取数据源下所有表。
     *
     * @param request ListDatasourceTablesRequest
     * @return ListDatasourceTablesResponse
     */
    public ListDatasourceTablesResponse listDatasourceTables(String InstanceId, String DatasourceId, ListDatasourceTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatasourceTablesWithOptions(InstanceId, DatasourceId, request, headers, runtime);
    }

    /**
     * @summary 获取数据源列表。
     *
     * @param request ListDatasourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasourcesResponse
     */
    public ListDatasourcesResponse listDatasourcesWithOptions(String InstanceId, ListDatasourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListDatasources"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasourcesResponse());
    }

    /**
     * @summary 获取数据源列表。
     *
     * @param request ListDatasourcesRequest
     * @return ListDatasourcesResponse
     */
    public ListDatasourcesResponse listDatasources(String InstanceId, ListDatasourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatasourcesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建特征实体列表
     *
     * @param tmpReq ListFeatureEntitiesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureEntitiesResponse
     */
    public ListFeatureEntitiesResponse listFeatureEntitiesWithOptions(String InstanceId, ListFeatureEntitiesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFeatureEntitiesShrinkRequest request = new ListFeatureEntitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.featureEntityIds)) {
            request.featureEntityIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.featureEntityIds, "FeatureEntityIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureEntityIdsShrink)) {
            query.put("FeatureEntityIds", request.featureEntityIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureEntities"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureentities"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureEntitiesResponse());
    }

    /**
     * @summary 创建特征实体列表
     *
     * @param request ListFeatureEntitiesRequest
     * @return ListFeatureEntitiesResponse
     */
    public ListFeatureEntitiesResponse listFeatureEntities(String InstanceId, ListFeatureEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureEntitiesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取特征字段血缘关系。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureViewFieldRelationshipsResponse
     */
    public ListFeatureViewFieldRelationshipsResponse listFeatureViewFieldRelationshipsWithOptions(String InstanceId, String FeatureViewId, String FieldName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureViewFieldRelationships"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + "/fields/" + com.aliyun.openapiutil.Client.getEncodeParam(FieldName) + "/relationships"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureViewFieldRelationshipsResponse());
    }

    /**
     * @summary 获取特征字段血缘关系。
     *
     * @return ListFeatureViewFieldRelationshipsResponse
     */
    public ListFeatureViewFieldRelationshipsResponse listFeatureViewFieldRelationships(String InstanceId, String FeatureViewId, String FieldName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureViewFieldRelationshipsWithOptions(InstanceId, FeatureViewId, FieldName, headers, runtime);
    }

    /**
     * @summary 获取特征视图下的在线特征数据。
     *
     * @param tmpReq ListFeatureViewOnlineFeaturesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureViewOnlineFeaturesResponse
     */
    public ListFeatureViewOnlineFeaturesResponse listFeatureViewOnlineFeaturesWithOptions(String InstanceId, String FeatureViewId, ListFeatureViewOnlineFeaturesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFeatureViewOnlineFeaturesShrinkRequest request = new ListFeatureViewOnlineFeaturesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.joinIds)) {
            request.joinIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.joinIds, "JoinIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinIdsShrink)) {
            query.put("JoinIds", request.joinIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureViewOnlineFeatures"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + "/onlinefeatures"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureViewOnlineFeaturesResponse());
    }

    /**
     * @summary 获取特征视图下的在线特征数据。
     *
     * @param request ListFeatureViewOnlineFeaturesRequest
     * @return ListFeatureViewOnlineFeaturesResponse
     */
    public ListFeatureViewOnlineFeaturesResponse listFeatureViewOnlineFeatures(String InstanceId, String FeatureViewId, ListFeatureViewOnlineFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureViewOnlineFeaturesWithOptions(InstanceId, FeatureViewId, request, headers, runtime);
    }

    /**
     * @summary 获取特征视图血缘关系。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureViewRelationshipsResponse
     */
    public ListFeatureViewRelationshipsResponse listFeatureViewRelationshipsWithOptions(String InstanceId, String FeatureViewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureViewRelationships"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + "/relationships"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureViewRelationshipsResponse());
    }

    /**
     * @summary 获取特征视图血缘关系。
     *
     * @return ListFeatureViewRelationshipsResponse
     */
    public ListFeatureViewRelationshipsResponse listFeatureViewRelationships(String InstanceId, String FeatureViewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureViewRelationshipsWithOptions(InstanceId, FeatureViewId, headers, runtime);
    }

    /**
     * @summary 获取特征视图列表。
     *
     * @param tmpReq ListFeatureViewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureViewsResponse
     */
    public ListFeatureViewsResponse listFeatureViewsWithOptions(String InstanceId, ListFeatureViewsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFeatureViewsShrinkRequest request = new ListFeatureViewsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.featureViewIds)) {
            request.featureViewIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.featureViewIds, "FeatureViewIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureViewIdsShrink)) {
            query.put("FeatureViewIds", request.featureViewIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureViews"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureViewsResponse());
    }

    /**
     * @summary 获取特征视图列表。
     *
     * @param request ListFeatureViewsRequest
     * @return ListFeatureViewsResponse
     */
    public ListFeatureViewsResponse listFeatureViews(String InstanceId, ListFeatureViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureViewsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取Feature Store实例列表。
     *
     * @param request ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * @summary 获取Feature Store实例列表。
     *
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取Label表列表。
     *
     * @param tmpReq ListLabelTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLabelTablesResponse
     */
    public ListLabelTablesResponse listLabelTablesWithOptions(String InstanceId, ListLabelTablesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListLabelTablesShrinkRequest request = new ListLabelTablesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelTableIds)) {
            request.labelTableIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelTableIds, "LabelTableIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelTableIdsShrink)) {
            query.put("LabelTableIds", request.labelTableIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLabelTables"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labeltables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLabelTablesResponse());
    }

    /**
     * @summary 获取Label表列表。
     *
     * @param request ListLabelTablesRequest
     * @return ListLabelTablesResponse
     */
    public ListLabelTablesResponse listLabelTables(String InstanceId, ListLabelTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLabelTablesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取注册FG特征时模型特征下可选的所有特征。
     *
     * @param request ListModelFeatureAvailableFeaturesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelFeatureAvailableFeaturesResponse
     */
    public ListModelFeatureAvailableFeaturesResponse listModelFeatureAvailableFeaturesWithOptions(String InstanceId, String ModelFeatureId, ListModelFeatureAvailableFeaturesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelFeatureAvailableFeatures"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/availablefeatures"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelFeatureAvailableFeaturesResponse());
    }

    /**
     * @summary 获取注册FG特征时模型特征下可选的所有特征。
     *
     * @param request ListModelFeatureAvailableFeaturesRequest
     * @return ListModelFeatureAvailableFeaturesResponse
     */
    public ListModelFeatureAvailableFeaturesResponse listModelFeatureAvailableFeatures(String InstanceId, String ModelFeatureId, ListModelFeatureAvailableFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelFeatureAvailableFeaturesWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 获取模型特征列表。
     *
     * @param tmpReq ListModelFeaturesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelFeaturesResponse
     */
    public ListModelFeaturesResponse listModelFeaturesWithOptions(String InstanceId, ListModelFeaturesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModelFeaturesShrinkRequest request = new ListModelFeaturesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelFeatureIds)) {
            request.modelFeatureIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelFeatureIds, "ModelFeatureIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelFeatureIdsShrink)) {
            query.put("ModelFeatureIds", request.modelFeatureIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelFeatures"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelFeaturesResponse());
    }

    /**
     * @summary 获取模型特征列表。
     *
     * @param request ListModelFeaturesRequest
     * @return ListModelFeaturesResponse
     */
    public ListModelFeaturesResponse listModelFeatures(String InstanceId, ListModelFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listModelFeaturesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取项目下特征视图的所有创建人。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectFeatureViewOwnersResponse
     */
    public ListProjectFeatureViewOwnersResponse listProjectFeatureViewOwnersWithOptions(String InstanceId, String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectFeatureViewOwners"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureviewowners"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectFeatureViewOwnersResponse());
    }

    /**
     * @summary 获取项目下特征视图的所有创建人。
     *
     * @return ListProjectFeatureViewOwnersResponse
     */
    public ListProjectFeatureViewOwnersResponse listProjectFeatureViewOwners(String InstanceId, String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectFeatureViewOwnersWithOptions(InstanceId, ProjectId, headers, runtime);
    }

    /**
     * @summary 获取项目下特征视图的所有标签。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectFeatureViewTagsResponse
     */
    public ListProjectFeatureViewTagsResponse listProjectFeatureViewTagsWithOptions(String InstanceId, String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectFeatureViewTags"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureviewtags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectFeatureViewTagsResponse());
    }

    /**
     * @summary 获取项目下特征视图的所有标签。
     *
     * @return ListProjectFeatureViewTagsResponse
     */
    public ListProjectFeatureViewTagsResponse listProjectFeatureViewTags(String InstanceId, String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectFeatureViewTagsWithOptions(InstanceId, ProjectId, headers, runtime);
    }

    /**
     * @summary 获取项目下的所有特征视图、特征信息。
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectFeatureViewsResponse
     */
    public ListProjectFeatureViewsResponse listProjectFeatureViewsWithOptions(String InstanceId, String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectFeatureViews"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectFeatureViewsResponse());
    }

    /**
     * @summary 获取项目下的所有特征视图、特征信息。
     *
     * @return ListProjectFeatureViewsResponse
     */
    public ListProjectFeatureViewsResponse listProjectFeatureViews(String InstanceId, String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectFeatureViewsWithOptions(InstanceId, ProjectId, headers, runtime);
    }

    /**
     * @summary 获取Feature Store项目列表。
     *
     * @param tmpReq ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(String InstanceId, ListProjectsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.projectIds)) {
            request.projectIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.projectIds, "ProjectIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdsShrink)) {
            query.put("ProjectIds", request.projectIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * @summary 获取Feature Store项目列表。
     *
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(String InstanceId, ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取任务日志列表
     *
     * @param request ListTaskLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskLogsResponse
     */
    public ListTaskLogsResponse listTaskLogsWithOptions(String InstanceId, String TaskId, ListTaskLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListTaskLogs"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TaskId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskLogsResponse());
    }

    /**
     * @summary 获取任务日志列表
     *
     * @param request ListTaskLogsRequest
     * @return ListTaskLogsResponse
     */
    public ListTaskLogsResponse listTaskLogs(String InstanceId, String TaskId, ListTaskLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTaskLogsWithOptions(InstanceId, TaskId, request, headers, runtime);
    }

    /**
     * @summary 获取任务列表
     *
     * @param tmpReq ListTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(String InstanceId, ListTasksRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("TaskIds", request.taskIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * @summary 获取任务列表
     *
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(String InstanceId, ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 将特征视图的离线数据发布/同步到线上。
     *
     * @param request PublishFeatureViewTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishFeatureViewTableResponse
     */
    public PublishFeatureViewTableResponse publishFeatureViewTableWithOptions(String InstanceId, String FeatureViewId, PublishFeatureViewTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTime)) {
            body.put("EventTime", request.eventTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineToOnline)) {
            body.put("OfflineToOnline", request.offlineToOnline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitions)) {
            body.put("Partitions", request.partitions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFeatureViewTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + "/action/publishtable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFeatureViewTableResponse());
    }

    /**
     * @summary 将特征视图的离线数据发布/同步到线上。
     *
     * @param request PublishFeatureViewTableRequest
     * @return PublishFeatureViewTableResponse
     */
    public PublishFeatureViewTableResponse publishFeatureViewTable(String InstanceId, String FeatureViewId, PublishFeatureViewTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishFeatureViewTableWithOptions(InstanceId, FeatureViewId, request, headers, runtime);
    }

    /**
     * @summary 更新数据源信息。
     *
     * @param request UpdateDatasourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasourceResponse
     */
    public UpdateDatasourceResponse updateDatasourceWithOptions(String InstanceId, String DatasourceId, UpdateDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDatasource"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/datasources/" + com.aliyun.openapiutil.Client.getEncodeParam(DatasourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasourceResponse());
    }

    /**
     * @summary 更新数据源信息。
     *
     * @param request UpdateDatasourceRequest
     * @return UpdateDatasourceResponse
     */
    public UpdateDatasourceResponse updateDatasource(String InstanceId, String DatasourceId, UpdateDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatasourceWithOptions(InstanceId, DatasourceId, request, headers, runtime);
    }

    /**
     * @summary 更新label表。
     *
     * @param request UpdateLabelTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLabelTableResponse
     */
    public UpdateLabelTableResponse updateLabelTableWithOptions(String InstanceId, String LabelTableId, UpdateLabelTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLabelTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/labeltables/" + com.aliyun.openapiutil.Client.getEncodeParam(LabelTableId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLabelTableResponse());
    }

    /**
     * @summary 更新label表。
     *
     * @param request UpdateLabelTableRequest
     * @return UpdateLabelTableResponse
     */
    public UpdateLabelTableResponse updateLabelTable(String InstanceId, String LabelTableId, UpdateLabelTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLabelTableWithOptions(InstanceId, LabelTableId, request, headers, runtime);
    }

    /**
     * @summary 更新模型特征。
     *
     * @param request UpdateModelFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelFeatureResponse
     */
    public UpdateModelFeatureResponse updateModelFeatureWithOptions(String InstanceId, String ModelFeatureId, UpdateModelFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.features)) {
            body.put("Features", request.features);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTableId)) {
            body.put("LabelTableId", request.labelTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceFeatureViewIds)) {
            body.put("SequenceFeatureViewIds", request.sequenceFeatureViewIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelFeatureResponse());
    }

    /**
     * @summary 更新模型特征。
     *
     * @param request UpdateModelFeatureRequest
     * @return UpdateModelFeatureResponse
     */
    public UpdateModelFeatureResponse updateModelFeature(String InstanceId, String ModelFeatureId, UpdateModelFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelFeatureWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 更新模型特征的FG特征配置信息。
     *
     * @param request UpdateModelFeatureFGFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelFeatureFGFeatureResponse
     */
    public UpdateModelFeatureFGFeatureResponse updateModelFeatureFGFeatureWithOptions(String InstanceId, String ModelFeatureId, UpdateModelFeatureFGFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lookupFeatures)) {
            body.put("LookupFeatures", request.lookupFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawFeatures)) {
            body.put("RawFeatures", request.rawFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserves)) {
            body.put("Reserves", request.reserves);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceFeatures)) {
            body.put("SequenceFeatures", request.sequenceFeatures);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelFeatureFGFeature"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/fgfeature"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelFeatureFGFeatureResponse());
    }

    /**
     * @summary 更新模型特征的FG特征配置信息。
     *
     * @param request UpdateModelFeatureFGFeatureRequest
     * @return UpdateModelFeatureFGFeatureResponse
     */
    public UpdateModelFeatureFGFeatureResponse updateModelFeatureFGFeature(String InstanceId, String ModelFeatureId, UpdateModelFeatureFGFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelFeatureFGFeatureWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 更新模型特征的fg.json文件配置信息。
     *
     * @param request UpdateModelFeatureFGInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelFeatureFGInfoResponse
     */
    public UpdateModelFeatureFGInfoResponse updateModelFeatureFGInfoWithOptions(String InstanceId, String ModelFeatureId, UpdateModelFeatureFGInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelFeatureFGInfo"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/modelfeatures/" + com.aliyun.openapiutil.Client.getEncodeParam(ModelFeatureId) + "/fginfo"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelFeatureFGInfoResponse());
    }

    /**
     * @summary 更新模型特征的fg.json文件配置信息。
     *
     * @param request UpdateModelFeatureFGInfoRequest
     * @return UpdateModelFeatureFGInfoResponse
     */
    public UpdateModelFeatureFGInfoResponse updateModelFeatureFGInfo(String InstanceId, String ModelFeatureId, UpdateModelFeatureFGInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelFeatureFGInfoWithOptions(InstanceId, ModelFeatureId, request, headers, runtime);
    }

    /**
     * @summary 更新指定Feature Store项目信息。
     *
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String InstanceId, String ProjectId, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * @summary 更新指定Feature Store项目信息。
     *
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String InstanceId, String ProjectId, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(InstanceId, ProjectId, request, headers, runtime);
    }

    /**
     * @summary 获取特征视图血缘关系。
     *
     * @param request WriteFeatureViewTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WriteFeatureViewTableResponse
     */
    public WriteFeatureViewTableResponse writeFeatureViewTableWithOptions(String InstanceId, String FeatureViewId, WriteFeatureViewTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitions)) {
            body.put("Partitions", request.partitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlDatasource)) {
            body.put("UrlDatasource", request.urlDatasource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteFeatureViewTable"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/featureviews/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureViewId) + "/action/writetable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteFeatureViewTableResponse());
    }

    /**
     * @summary 获取特征视图血缘关系。
     *
     * @param request WriteFeatureViewTableRequest
     * @return WriteFeatureViewTableResponse
     */
    public WriteFeatureViewTableResponse writeFeatureViewTable(String InstanceId, String FeatureViewId, WriteFeatureViewTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.writeFeatureViewTableWithOptions(InstanceId, FeatureViewId, request, headers, runtime);
    }

    /**
     * @summary 向指定项目下的特征实体写入热点数据。
     *
     * @param request WriteProjectFeatureEntityHotIdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WriteProjectFeatureEntityHotIdsResponse
     */
    public WriteProjectFeatureEntityHotIdsResponse writeProjectFeatureEntityHotIdsWithOptions(String InstanceId, String ProjectId, String FeatureEntityName, WriteProjectFeatureEntityHotIdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotIds)) {
            body.put("HotIds", request.hotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteProjectFeatureEntityHotIds"),
            new TeaPair("version", "2023-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/featureentities/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureEntityName) + "/action/writehotids"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteProjectFeatureEntityHotIdsResponse());
    }

    /**
     * @summary 向指定项目下的特征实体写入热点数据。
     *
     * @param request WriteProjectFeatureEntityHotIdsRequest
     * @return WriteProjectFeatureEntityHotIdsResponse
     */
    public WriteProjectFeatureEntityHotIdsResponse writeProjectFeatureEntityHotIds(String InstanceId, String ProjectId, String FeatureEntityName, WriteProjectFeatureEntityHotIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.writeProjectFeatureEntityHotIdsWithOptions(InstanceId, ProjectId, FeatureEntityName, request, headers, runtime);
    }
}
