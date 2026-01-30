// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213;

import com.aliyun.tea.*;
import com.aliyun.pairecservice20221213.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pairecservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>应用/发布指定的推荐引擎配置</p>
     * 
     * @param request ApplyEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyEngineConfigResponse
     */
    public ApplyEngineConfigResponse applyEngineConfigWithOptions(String EngineConfigId, ApplyEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(EngineConfigId) + "/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用/发布指定的推荐引擎配置</p>
     * 
     * @param request ApplyEngineConfigRequest
     * @return ApplyEngineConfigResponse
     */
    public ApplyEngineConfigResponse applyEngineConfig(String EngineConfigId, ApplyEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyEngineConfigWithOptions(EngineConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>特征一致性检查数据回流。</p>
     * 
     * @param request BackflowFeatureConsistencyCheckJobDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackflowFeatureConsistencyCheckJobDataResponse
     */
    public BackflowFeatureConsistencyCheckJobDataResponse backflowFeatureConsistencyCheckJobDataWithOptions(BackflowFeatureConsistencyCheckJobDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureConsistencyCheckJobConfigId)) {
            body.put("FeatureConsistencyCheckJobConfigId", request.featureConsistencyCheckJobConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemFeatures)) {
            body.put("ItemFeatures", request.itemFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logItemId)) {
            body.put("LogItemId", request.logItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            body.put("LogRequestId", request.logRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestTime)) {
            body.put("LogRequestTime", request.logRequestTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            body.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scores)) {
            body.put("Scores", request.scores);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFeatures)) {
            body.put("UserFeatures", request.userFeatures);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackflowFeatureConsistencyCheckJobData"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/action/backflowdata"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BackflowFeatureConsistencyCheckJobDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>特征一致性检查数据回流。</p>
     * 
     * @param request BackflowFeatureConsistencyCheckJobDataRequest
     * @return BackflowFeatureConsistencyCheckJobDataResponse
     */
    public BackflowFeatureConsistencyCheckJobDataResponse backflowFeatureConsistencyCheckJobData(BackflowFeatureConsistencyCheckJobDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.backflowFeatureConsistencyCheckJobDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更改召回管理服务的版本</p>
     * 
     * @param request ChangeRecallManagementServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeRecallManagementServiceVersionResponse
     */
    public ChangeRecallManagementServiceVersionResponse changeRecallManagementServiceVersionWithOptions(String RecallManagementServiceId, ChangeRecallManagementServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallManagementServiceVersionId)) {
            body.put("RecallManagementServiceVersionId", request.recallManagementServiceVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeRecallManagementServiceVersion"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/action/changeversion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeRecallManagementServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更改召回管理服务的版本</p>
     * 
     * @param request ChangeRecallManagementServiceVersionRequest
     * @return ChangeRecallManagementServiceVersionResponse
     */
    public ChangeRecallManagementServiceVersionResponse changeRecallManagementServiceVersion(String RecallManagementServiceId, ChangeRecallManagementServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeRecallManagementServiceVersionWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检测实例下配置的资源的连接状态。</p>
     * 
     * @param request CheckInstanceResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceResourcesResponse
     */
    public CheckInstanceResourcesResponse checkInstanceResourcesWithOptions(String InstanceId, CheckInstanceResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
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
            new TeaPair("action", "CheckInstanceResources"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/action/checkresources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检测实例下配置的资源的连接状态。</p>
     * 
     * @param request CheckInstanceResourcesRequest
     * @return CheckInstanceResourcesResponse
     */
    public CheckInstanceResourcesResponse checkInstanceResources(String InstanceId, CheckInstanceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInstanceResourcesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验流量调控任务中的表达式</p>
     * 
     * @param request CheckTrafficControlTaskExpressionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckTrafficControlTaskExpressionResponse
     */
    public CheckTrafficControlTaskExpressionResponse checkTrafficControlTaskExpressionWithOptions(CheckTrafficControlTaskExpressionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaId)) {
            query.put("TableMetaId", request.tableMetaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTrafficControlTaskExpression"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/action/checkexpression"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTrafficControlTaskExpressionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验流量调控任务中的表达式</p>
     * 
     * @param request CheckTrafficControlTaskExpressionRequest
     * @return CheckTrafficControlTaskExpressionResponse
     */
    public CheckTrafficControlTaskExpressionResponse checkTrafficControlTaskExpression(CheckTrafficControlTaskExpressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkTrafficControlTaskExpressionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆指定的推荐引擎配置</p>
     * 
     * @param request CloneEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneEngineConfigResponse
     */
    public CloneEngineConfigResponse cloneEngineConfigWithOptions(String EngineConfigId, CloneEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            body.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(EngineConfigId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆指定的推荐引擎配置</p>
     * 
     * @param request CloneEngineConfigRequest
     * @return CloneEngineConfigResponse
     */
    public CloneEngineConfigResponse cloneEngineConfig(String EngineConfigId, CloneEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneEngineConfigWithOptions(EngineConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验。</p>
     * 
     * @param request CloneExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneExperimentResponse
     */
    public CloneExperimentResponse cloneExperimentWithOptions(String ExperimentId, CloneExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneExperiment"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验。</p>
     * 
     * @param request CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    public CloneExperimentResponse cloneExperiment(String ExperimentId, CloneExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验组，并克隆实验组下的所有实验至新的实验组中。</p>
     * 
     * @param request CloneExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneExperimentGroupResponse
     */
    public CloneExperimentGroupResponse cloneExperimentGroupWithOptions(String ExperimentGroupId, CloneExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            body.put("LayerId", request.layerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验组，并克隆实验组下的所有实验至新的实验组中。</p>
     * 
     * @param request CloneExperimentGroupRequest
     * @return CloneExperimentGroupResponse
     */
    public CloneExperimentGroupResponse cloneExperimentGroup(String ExperimentGroupId, CloneExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆特征一致性检查配置。</p>
     * 
     * @param request CloneFeatureConsistencyCheckJobConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneFeatureConsistencyCheckJobConfigResponse
     */
    public CloneFeatureConsistencyCheckJobConfigResponse cloneFeatureConsistencyCheckJobConfigWithOptions(String SourceFeatureConsistencyCheckJobConfigId, CloneFeatureConsistencyCheckJobConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneFeatureConsistencyCheckJobConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(SourceFeatureConsistencyCheckJobConfigId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneFeatureConsistencyCheckJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆特征一致性检查配置。</p>
     * 
     * @param request CloneFeatureConsistencyCheckJobConfigRequest
     * @return CloneFeatureConsistencyCheckJobConfigResponse
     */
    public CloneFeatureConsistencyCheckJobConfigResponse cloneFeatureConsistencyCheckJobConfig(String SourceFeatureConsistencyCheckJobConfigId, CloneFeatureConsistencyCheckJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneFeatureConsistencyCheckJobConfigWithOptions(SourceFeatureConsistencyCheckJobConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验室。</p>
     * 
     * @param request CloneLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneLaboratoryResponse
     */
    public CloneLaboratoryResponse cloneLaboratoryWithOptions(String LaboratoryId, CloneLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloneExperimentGroup)) {
            body.put("CloneExperimentGroup", request.cloneExperimentGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆实验室。</p>
     * 
     * @param request CloneLaboratoryRequest
     * @return CloneLaboratoryResponse
     */
    public CloneLaboratoryResponse cloneLaboratory(String LaboratoryId, CloneLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>克隆流量调控任务</p>
     * 
     * @param request CloneTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneTrafficControlTaskResponse
     */
    public CloneTrafficControlTaskResponse cloneTrafficControlTaskWithOptions(String TrafficControlTaskId, CloneTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>克隆流量调控任务</p>
     * 
     * @param request CloneTrafficControlTaskRequest
     * @return CloneTrafficControlTaskResponse
     */
    public CloneTrafficControlTaskResponse cloneTrafficControlTask(String TrafficControlTaskId, CloneTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对比样本一致性任务</p>
     * 
     * @param request CompareSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareSampleConsistencyJobResponse
     */
    public CompareSampleConsistencyJobResponse compareSampleConsistencyJobWithOptions(String SampleConsistencyJobId, CompareSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + "/action/compare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对比样本一致性任务</p>
     * 
     * @param request CompareSampleConsistencyJobRequest
     * @return CompareSampleConsistencyJobResponse
     */
    public CompareSampleConsistencyJobResponse compareSampleConsistencyJob(String SampleConsistencyJobId, CompareSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.compareSampleConsistencyJobWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建AB test实验指标</p>
     * 
     * @param request CreateABMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateABMetricResponse
     */
    public CreateABMetricResponse createABMetricWithOptions(CreateABMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leftMetricId)) {
            body.put("LeftMetricId", request.leftMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            body.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultResourceId)) {
            body.put("ResultResourceId", request.resultResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rightMetricId)) {
            body.put("RightMetricId", request.rightMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsCycle)) {
            body.put("StatisticsCycle", request.statisticsCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaId)) {
            body.put("TableMetaId", request.tableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABMetric"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetrics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建AB test实验指标</p>
     * 
     * @param request CreateABMetricRequest
     * @return CreateABMetricResponse
     */
    public CreateABMetricResponse createABMetric(CreateABMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABMetricWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建指标组</p>
     * 
     * @param request CreateABMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateABMetricGroupResponse
     */
    public CreateABMetricGroupResponse createABMetricGroupWithOptions(CreateABMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ABMetricIds)) {
            body.put("ABMetricIds", request.ABMetricIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            body.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateABMetricGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateABMetricGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建指标组</p>
     * 
     * @param request CreateABMetricGroupRequest
     * @return CreateABMetricGroupResponse
     */
    public CreateABMetricGroupResponse createABMetricGroup(CreateABMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createABMetricGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建AB指标的计算任务。</p>
     * 
     * @param request CreateCalculationJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCalculationJobsResponse
     */
    public CreateCalculationJobsResponse createCalculationJobsWithOptions(CreateCalculationJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ABMetricIds)) {
            body.put("ABMetricIds", request.ABMetricIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCalculationJobs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/batch/calculationjobs/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCalculationJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建AB指标的计算任务。</p>
     * 
     * @param request CreateCalculationJobsRequest
     * @return CreateCalculationJobsResponse
     */
    public CreateCalculationJobsResponse createCalculationJobs(CreateCalculationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCalculationJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建人群。</p>
     * 
     * @param request CreateCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCrowdResponse
     */
    public CreateCrowdResponse createCrowdWithOptions(CreateCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建人群。</p>
     * 
     * @param request CreateCrowdRequest
     * @return CreateCrowdResponse
     */
    public CreateCrowdResponse createCrowd(CreateCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCrowdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建引擎配置</p>
     * 
     * @param request CreateEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEngineConfigResponse
     */
    public CreateEngineConfigResponse createEngineConfigWithOptions(CreateEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            body.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建引擎配置</p>
     * 
     * @param request CreateEngineConfigRequest
     * @return CreateEngineConfigResponse
     */
    public CreateEngineConfigResponse createEngineConfig(CreateEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEngineConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验。</p>
     * 
     * @param request CreateExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentResponse
     */
    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentGroupId)) {
            body.put("ExperimentGroupId", request.experimentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowPercent)) {
            body.put("FlowPercent", request.flowPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperiment"),
            new TeaPair("version", "2022-12-13"),
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
     * <p>创建实验。</p>
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
     * <p>创建实验组。</p>
     * 
     * @param request CreateExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentGroupResponse
     */
    public CreateExperimentGroupResponse createExperimentGroupWithOptions(CreateExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdId)) {
            body.put("CrowdId", request.crowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdTargetType)) {
            body.put("CrowdTargetType", request.crowdTargetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionTimeDuration)) {
            body.put("DistributionTimeDuration", request.distributionTimeDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionType)) {
            body.put("DistributionType", request.distributionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            body.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAA)) {
            body.put("NeedAA", request.needAA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomFlow)) {
            body.put("RandomFlow", request.randomFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedBuckets)) {
            body.put("ReservedBuckets", request.reservedBuckets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验组。</p>
     * 
     * @param request CreateExperimentGroupRequest
     * @return CreateExperimentGroupResponse
     */
    public CreateExperimentGroupResponse createExperimentGroup(CreateExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建特征一致性检查任务。</p>
     * 
     * @param request CreateFeatureConsistencyCheckJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFeatureConsistencyCheckJobResponse
     */
    public CreateFeatureConsistencyCheckJobResponse createFeatureConsistencyCheckJobWithOptions(CreateFeatureConsistencyCheckJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureConsistencyCheckJobConfigId)) {
            body.put("FeatureConsistencyCheckJobConfigId", request.featureConsistencyCheckJobConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingDuration)) {
            body.put("SamplingDuration", request.samplingDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFeatureConsistencyCheckJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFeatureConsistencyCheckJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建特征一致性检查任务。</p>
     * 
     * @param request CreateFeatureConsistencyCheckJobRequest
     * @return CreateFeatureConsistencyCheckJobResponse
     */
    public CreateFeatureConsistencyCheckJobResponse createFeatureConsistencyCheckJob(CreateFeatureConsistencyCheckJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFeatureConsistencyCheckJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建特征一致性检查配置。</p>
     * 
     * @param request CreateFeatureConsistencyCheckJobConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFeatureConsistencyCheckJobConfigResponse
     */
    public CreateFeatureConsistencyCheckJobConfigResponse createFeatureConsistencyCheckJobConfigWithOptions(CreateFeatureConsistencyCheckJobConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compareFeature)) {
            body.put("CompareFeature", request.compareFeature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMountPath)) {
            body.put("DatasetMountPath", request.datasetMountPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetType)) {
            body.put("DatasetType", request.datasetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetUri)) {
            body.put("DatasetUri", request.datasetUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRoute)) {
            body.put("DefaultRoute", request.defaultRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easServiceName)) {
            body.put("EasServiceName", request.easServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easyRecPackagePath)) {
            body.put("EasyRecPackagePath", request.easyRecPackagePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easyRecVersion)) {
            body.put("EasyRecVersion", request.easyRecVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDisplayExclude)) {
            body.put("FeatureDisplayExclude", request.featureDisplayExclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureLandingResourceId)) {
            body.put("FeatureLandingResourceId", request.featureLandingResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featurePriority)) {
            body.put("FeaturePriority", request.featurePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreItemId)) {
            body.put("FeatureStoreItemId", request.featureStoreItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreModelId)) {
            body.put("FeatureStoreModelId", request.featureStoreModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreProjectId)) {
            body.put("FeatureStoreProjectId", request.featureStoreProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreProjectName)) {
            body.put("FeatureStoreProjectName", request.featureStoreProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreSeqFeatureView)) {
            body.put("FeatureStoreSeqFeatureView", request.featureStoreSeqFeatureView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreUserId)) {
            body.put("FeatureStoreUserId", request.featureStoreUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fgJarVersion)) {
            body.put("FgJarVersion", request.fgJarVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fgJsonFileName)) {
            body.put("FgJsonFileName", request.fgJsonFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateZip)) {
            body.put("GenerateZip", request.generateZip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdField)) {
            body.put("ItemIdField", request.itemIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTable)) {
            body.put("ItemTable", request.itemTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTablePartitionField)) {
            body.put("ItemTablePartitionField", request.itemTablePartitionField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTablePartitionFieldFormat)) {
            body.put("ItemTablePartitionFieldFormat", request.itemTablePartitionFieldFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossResourceId)) {
            body.put("OssResourceId", request.ossResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerCount)) {
            body.put("PredictWorkerCount", request.predictWorkerCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerCpu)) {
            body.put("PredictWorkerCpu", request.predictWorkerCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerMemory)) {
            body.put("PredictWorkerMemory", request.predictWorkerMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceConfig)) {
            body.put("ResourceConfig", request.resourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            body.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchId)) {
            body.put("SwitchId", request.switchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useFeatureStore)) {
            body.put("UseFeatureStore", request.useFeatureStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdField)) {
            body.put("UserIdField", request.userIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTable)) {
            body.put("UserTable", request.userTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTablePartitionField)) {
            body.put("UserTablePartitionField", request.userTablePartitionField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTablePartitionFieldFormat)) {
            body.put("UserTablePartitionFieldFormat", request.userTablePartitionFieldFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowName)) {
            body.put("WorkflowName", request.workflowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFeatureConsistencyCheckJobConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobconfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFeatureConsistencyCheckJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建特征一致性检查配置。</p>
     * 
     * @param request CreateFeatureConsistencyCheckJobConfigRequest
     * @return CreateFeatureConsistencyCheckJobConfigResponse
     */
    public CreateFeatureConsistencyCheckJobConfigResponse createFeatureConsistencyCheckJobConfig(CreateFeatureConsistencyCheckJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFeatureConsistencyCheckJobConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为指定实例配置创建新的配置资源</p>
     * 
     * @param request CreateInstanceResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResourceResponse
     */
    public CreateInstanceResourceResponse createInstanceResourceWithOptions(String InstanceId, CreateInstanceResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
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
            new TeaPair("action", "CreateInstanceResource"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为指定实例配置创建新的配置资源</p>
     * 
     * @param request CreateInstanceResourceRequest
     * @return CreateInstanceResourceResponse
     */
    public CreateInstanceResourceResponse createInstanceResource(String InstanceId, CreateInstanceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceResourceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验室</p>
     * 
     * @param request CreateLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLaboratoryResponse
     */
    public CreateLaboratoryResponse createLaboratoryWithOptions(CreateLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketCount)) {
            body.put("BucketCount", request.bucketCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buckets)) {
            body.put("Buckets", request.buckets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实验室</p>
     * 
     * @param request CreateLaboratoryRequest
     * @return CreateLaboratoryResponse
     */
    public CreateLaboratoryResponse createLaboratory(CreateLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLaboratoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建层。</p>
     * 
     * @param request CreateLayerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLayerResponse
     */
    public CreateLayerResponse createLayerWithOptions(CreateLayerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laboratoryId)) {
            body.put("LaboratoryId", request.laboratoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLayer"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建层。</p>
     * 
     * @param request CreateLayerRequest
     * @return CreateLayerResponse
     */
    public CreateLayerResponse createLayer(CreateLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLayerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建参数。</p>
     * 
     * @param request CreateParamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParamResponse
     */
    public CreateParamResponse createParamWithOptions(CreateParamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParam"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/params"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建参数。</p>
     * 
     * @param request CreateParamRequest
     * @return CreateParamResponse
     */
    public CreateParamResponse createParam(CreateParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createParamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理初始化配置。</p>
     * 
     * @param request CreateRecallManagementConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecallManagementConfigResponse
     */
    public CreateRecallManagementConfigResponse createRecallManagementConfigWithOptions(CreateRecallManagementConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkConfigs)) {
            body.put("NetworkConfigs", request.networkConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecallManagementConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementconfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecallManagementConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理初始化配置。</p>
     * 
     * @param request CreateRecallManagementConfigRequest
     * @return CreateRecallManagementConfigResponse
     */
    public CreateRecallManagementConfigResponse createRecallManagementConfig(CreateRecallManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecallManagementConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理服务</p>
     * 
     * @param request CreateRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecallManagementServiceResponse
     */
    public CreateRecallManagementServiceResponse createRecallManagementServiceWithOptions(CreateRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理服务</p>
     * 
     * @param request CreateRecallManagementServiceRequest
     * @return CreateRecallManagementServiceResponse
     */
    public CreateRecallManagementServiceResponse createRecallManagementService(CreateRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecallManagementServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理版本</p>
     * 
     * @param request CreateRecallManagementServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecallManagementServiceVersionResponse
     */
    public CreateRecallManagementServiceVersionResponse createRecallManagementServiceVersionWithOptions(String RecallManagementServiceId, CreateRecallManagementServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            body.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRecallManagementServiceVersionId)) {
            body.put("SourceRecallManagementServiceVersionId", request.sourceRecallManagementServiceVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecallManagementServiceVersion"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecallManagementServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理版本</p>
     * 
     * @param request CreateRecallManagementServiceVersionRequest
     * @return CreateRecallManagementServiceVersionResponse
     */
    public CreateRecallManagementServiceVersionResponse createRecallManagementServiceVersion(String RecallManagementServiceId, CreateRecallManagementServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecallManagementServiceVersionWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理服务版本配置</p>
     * 
     * @param request CreateRecallManagementServiceVersionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecallManagementServiceVersionConfigResponse
     */
    public CreateRecallManagementServiceVersionConfigResponse createRecallManagementServiceVersionConfigWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, CreateRecallManagementServiceVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            body.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeConfig)) {
            body.put("MergeConfig", request.mergeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallConfig)) {
            body.put("RecallConfig", request.recallConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecallManagementServiceVersionConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + "/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecallManagementServiceVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理服务版本配置</p>
     * 
     * @param request CreateRecallManagementServiceVersionConfigRequest
     * @return CreateRecallManagementServiceVersionConfigResponse
     */
    public CreateRecallManagementServiceVersionConfigResponse createRecallManagementServiceVersionConfig(String RecallManagementServiceId, String RecallManagementServiceVersionId, CreateRecallManagementServiceVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecallManagementServiceVersionConfigWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理表。</p>
     * 
     * @param request CreateRecallManagementTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecallManagementTableResponse
     */
    public CreateRecallManagementTableResponse createRecallManagementTableWithOptions(CreateRecallManagementTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDataSizeFluctuationThreshold)) {
            body.put("EnableDataSizeFluctuationThreshold", request.enableDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRowCountFluctuationThreshold)) {
            body.put("EnableRowCountFluctuationThreshold", request.enableRowCountFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDataSizeFluctuationThreshold)) {
            body.put("MaxDataSizeFluctuationThreshold", request.maxDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRowCountFluctuationThreshold)) {
            body.put("MaxRowCountFluctuationThreshold", request.maxRowCountFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxcomputeProjectName)) {
            body.put("MaxcomputeProjectName", request.maxcomputeProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxcomputeSchema)) {
            body.put("MaxcomputeSchema", request.maxcomputeSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxcomputeTableName)) {
            body.put("MaxcomputeTableName", request.maxcomputeTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDataSizeFluctuationThreshold)) {
            body.put("MinDataSizeFluctuationThreshold", request.minDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRowCountFluctuationThreshold)) {
            body.put("MinRowCountFluctuationThreshold", request.minRowCountFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallType)) {
            body.put("RecallType", request.recallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecallManagementTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecallManagementTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建召回管理表。</p>
     * 
     * @param request CreateRecallManagementTableRequest
     * @return CreateRecallManagementTableResponse
     */
    public CreateRecallManagementTableResponse createRecallManagementTable(CreateRecallManagementTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRecallManagementTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源规则</p>
     * 
     * @param request CreateResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceRuleResponse
     */
    public CreateResourceRuleResponse createResourceRuleWithOptions(CreateResourceRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricOperationType)) {
            body.put("MetricOperationType", request.metricOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricPullInfo)) {
            body.put("MetricPullInfo", request.metricPullInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricPullPeriod)) {
            body.put("MetricPullPeriod", request.metricPullPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleComputingDefinition)) {
            body.put("RuleComputingDefinition", request.ruleComputingDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleItems)) {
            body.put("RuleItems", request.ruleItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源规则</p>
     * 
     * @param request CreateResourceRuleRequest
     * @return CreateResourceRuleResponse
     */
    public CreateResourceRuleResponse createResourceRule(CreateResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源规则条目</p>
     * 
     * @param request CreateResourceRuleItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceRuleItemResponse
     */
    public CreateResourceRuleItemResponse createResourceRuleItemWithOptions(String ResourceRuleId, CreateResourceRuleItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            body.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            body.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceRuleItem"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + "/items"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceRuleItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源规则条目</p>
     * 
     * @param request CreateResourceRuleItemRequest
     * @return CreateResourceRuleItemResponse
     */
    public CreateResourceRuleItemResponse createResourceRuleItem(String ResourceRuleId, CreateResourceRuleItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceRuleItemWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本一致性任务</p>
     * 
     * @param request CreateSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleConsistencyJobResponse
     */
    public CreateSampleConsistencyJobResponse createSampleConsistencyJobWithOptions(CreateSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easModelServiceName)) {
            body.put("EasModelServiceName", request.easModelServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureSaveResourceId)) {
            body.put("FeatureSaveResourceId", request.featureSaveResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdField)) {
            body.put("ItemIdField", request.itemIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionField)) {
            body.put("PartitionField", request.partitionField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionFieldFormat)) {
            body.put("PartitionFieldFormat", request.partitionFieldFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestIdField)) {
            body.put("RequestIdField", request.requestIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            body.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleTableName)) {
            body.put("SampleTableName", request.sampleTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdField)) {
            body.put("UserIdField", request.userIdField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本一致性任务</p>
     * 
     * @param request CreateSampleConsistencyJobRequest
     * @return CreateSampleConsistencyJobResponse
     */
    public CreateSampleConsistencyJobResponse createSampleConsistencyJob(CreateSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSampleConsistencyJobWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景</p>
     * 
     * @param request CreateSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSceneResponse
     */
    public CreateSceneResponse createSceneWithOptions(CreateSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flows)) {
            body.put("Flows", request.flows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScene"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/scenes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景</p>
     * 
     * @param request CreateSceneRequest
     * @return CreateSceneResponse
     */
    public CreateSceneResponse createScene(CreateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在指定人群下创建子人群。</p>
     * 
     * @param request CreateSubCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubCrowdResponse
     */
    public CreateSubCrowdResponse createSubCrowdWithOptions(String CrowdId, CreateSubCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + "/subcrowds"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在指定人群下创建子人群。</p>
     * 
     * @param request CreateSubCrowdRequest
     * @return CreateSubCrowdResponse
     */
    public CreateSubCrowdResponse createSubCrowd(String CrowdId, CreateSubCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSubCrowdWithOptions(CrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据表。</p>
     * 
     * @param request CreateTableMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableMetaResponse
     */
    public CreateTableMetaResponse createTableMetaWithOptions(CreateTableMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            body.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableMeta"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tablemetas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据表。</p>
     * 
     * @param request CreateTableMetaRequest
     * @return CreateTableMetaResponse
     */
    public CreateTableMetaResponse createTableMeta(CreateTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTableMetaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流量调控目标</p>
     * 
     * @param request CreateTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrafficControlTargetResponse
     */
    public CreateTrafficControlTargetResponse createTrafficControlTargetWithOptions(CreateTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            body.put("Event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionArray)) {
            body.put("ItemConditionArray", request.itemConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionExpress)) {
            body.put("ItemConditionExpress", request.itemConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionType)) {
            body.put("ItemConditionType", request.itemConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newProductRegulation)) {
            body.put("NewProductRegulation", request.newProductRegulation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallName)) {
            body.put("RecallName", request.recallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisPeriod)) {
            body.put("StatisPeriod", request.statisPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toleranceValue)) {
            body.put("ToleranceValue", request.toleranceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlTaskId)) {
            body.put("TrafficControlTaskId", request.trafficControlTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建流量调控目标</p>
     * 
     * @param request CreateTrafficControlTargetRequest
     * @return CreateTrafficControlTargetResponse
     */
    public CreateTrafficControlTargetResponse createTrafficControlTarget(CreateTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrafficControlTargetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流量调控任务</p>
     * 
     * @param request CreateTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrafficControlTaskResponse
     */
    public CreateTrafficControlTaskResponse createTrafficControlTaskWithOptions(CreateTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.behaviorTableMetaId)) {
            body.put("BehaviorTableMetaId", request.behaviorTableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlGranularity)) {
            body.put("ControlGranularity", request.controlGranularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlLogic)) {
            body.put("ControlLogic", request.controlLogic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("ControlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveSceneIds)) {
            body.put("EffectiveSceneIds", request.effectiveSceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionTime)) {
            body.put("ExecutionTime", request.executionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flinkResourceId)) {
            body.put("FlinkResourceId", request.flinkResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionArray)) {
            body.put("ItemConditionArray", request.itemConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionExpress)) {
            body.put("ItemConditionExpress", request.itemConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionType)) {
            body.put("ItemConditionType", request.itemConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTableMetaId)) {
            body.put("ItemTableMetaId", request.itemTableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preExperimentIds)) {
            body.put("PreExperimentIds", request.preExperimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodExperimentIds)) {
            body.put("ProdExperimentIds", request.prodExperimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            body.put("ServiceIds", request.serviceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionArray)) {
            body.put("StatisBehaviorConditionArray", request.statisBehaviorConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionExpress)) {
            body.put("StatisBehaviorConditionExpress", request.statisBehaviorConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionType)) {
            body.put("StatisBehaviorConditionType", request.statisBehaviorConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlTargets)) {
            body.put("TrafficControlTargets", request.trafficControlTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionArray)) {
            body.put("UserConditionArray", request.userConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionExpress)) {
            body.put("UserConditionExpress", request.userConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionType)) {
            body.put("UserConditionType", request.userConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTableMetaId)) {
            body.put("UserTableMetaId", request.userTableMetaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建流量调控任务</p>
     * 
     * @param request CreateTrafficControlTaskRequest
     * @return CreateTrafficControlTaskResponse
     */
    public CreateTrafficControlTaskResponse createTrafficControlTask(CreateTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrafficControlTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对指定资源规则中的计算公式进行调试</p>
     * 
     * @param tmpReq DebugResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugResourceRuleResponse
     */
    public DebugResourceRuleResponse debugResourceRuleWithOptions(String ResourceRuleId, DebugResourceRuleRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DebugResourceRuleShrinkRequest request = new DebugResourceRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricInfo)) {
            request.metricInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricInfo, "MetricInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricInfoShrink)) {
            query.put("MetricInfo", request.metricInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + "/action/debug"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对指定资源规则中的计算公式进行调试</p>
     * 
     * @param request DebugResourceRuleRequest
     * @return DebugResourceRuleResponse
     */
    public DebugResourceRuleResponse debugResourceRule(String ResourceRuleId, DebugResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.debugResourceRuleWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定AB实验指标。</p>
     * 
     * @param request DeleteABMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteABMetricResponse
     */
    public DeleteABMetricResponse deleteABMetricWithOptions(String ABMetricId, DeleteABMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABMetric"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetrics/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定AB实验指标。</p>
     * 
     * @param request DeleteABMetricRequest
     * @return DeleteABMetricResponse
     */
    public DeleteABMetricResponse deleteABMetric(String ABMetricId, DeleteABMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABMetricWithOptions(ABMetricId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除AB实验指标组。</p>
     * 
     * @param request DeleteABMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteABMetricGroupResponse
     */
    public DeleteABMetricGroupResponse deleteABMetricGroupWithOptions(String ABMetricGroupId, DeleteABMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteABMetricGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteABMetricGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除AB实验指标组。</p>
     * 
     * @param request DeleteABMetricGroupRequest
     * @return DeleteABMetricGroupResponse
     */
    public DeleteABMetricGroupResponse deleteABMetricGroup(String ABMetricGroupId, DeleteABMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteABMetricGroupWithOptions(ABMetricGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定人群。</p>
     * 
     * @param request DeleteCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCrowdResponse
     */
    public DeleteCrowdResponse deleteCrowdWithOptions(String CrowdId, DeleteCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定人群。</p>
     * 
     * @param request DeleteCrowdRequest
     * @return DeleteCrowdResponse
     */
    public DeleteCrowdResponse deleteCrowd(String CrowdId, DeleteCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCrowdWithOptions(CrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定推荐引擎配置。</p>
     * 
     * @param request DeleteEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEngineConfigResponse
     */
    public DeleteEngineConfigResponse deleteEngineConfigWithOptions(String EngineConfigId, DeleteEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(EngineConfigId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定推荐引擎配置。</p>
     * 
     * @param request DeleteEngineConfigRequest
     * @return DeleteEngineConfigResponse
     */
    public DeleteEngineConfigResponse deleteEngineConfig(String EngineConfigId, DeleteEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEngineConfigWithOptions(EngineConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验。</p>
     * 
     * @param request DeleteExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperimentWithOptions(String ExperimentId, DeleteExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperiment"),
            new TeaPair("version", "2022-12-13"),
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
     * <p>删除实验。</p>
     * 
     * @param request DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperiment(String ExperimentId, DeleteExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定实验组。</p>
     * 
     * @param request DeleteExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentGroupResponse
     */
    public DeleteExperimentGroupResponse deleteExperimentGroupWithOptions(String ExperimentGroupId, DeleteExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定实验组。</p>
     * 
     * @param request DeleteExperimentGroupRequest
     * @return DeleteExperimentGroupResponse
     */
    public DeleteExperimentGroupResponse deleteExperimentGroup(String ExperimentGroupId, DeleteExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定实例下的指定配置资源。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResourceResponse
     */
    public DeleteInstanceResourceResponse deleteInstanceResourceWithOptions(String InstanceId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceResource"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定实例下的指定配置资源。</p>
     * @return DeleteInstanceResourceResponse
     */
    public DeleteInstanceResourceResponse deleteInstanceResource(String InstanceId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceResourceWithOptions(InstanceId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验室。</p>
     * 
     * @param request DeleteLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLaboratoryResponse
     */
    public DeleteLaboratoryResponse deleteLaboratoryWithOptions(String LaboratoryId, DeleteLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实验室。</p>
     * 
     * @param request DeleteLaboratoryRequest
     * @return DeleteLaboratoryResponse
     */
    public DeleteLaboratoryResponse deleteLaboratory(String LaboratoryId, DeleteLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除层。</p>
     * 
     * @param request DeleteLayerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLayerResponse
     */
    public DeleteLayerResponse deleteLayerWithOptions(String LayerId, DeleteLayerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLayer"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(LayerId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除层。</p>
     * 
     * @param request DeleteLayerRequest
     * @return DeleteLayerResponse
     */
    public DeleteLayerResponse deleteLayer(String LayerId, DeleteLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLayerWithOptions(LayerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定参数。</p>
     * 
     * @param request DeleteParamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParamResponse
     */
    public DeleteParamResponse deleteParamWithOptions(String ParamId, DeleteParamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParam"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/params/" + com.aliyun.openapiutil.Client.getEncodeParam(ParamId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定参数。</p>
     * 
     * @param request DeleteParamRequest
     * @return DeleteParamResponse
     */
    public DeleteParamResponse deleteParam(String ParamId, DeleteParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteParamWithOptions(ParamId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理服务</p>
     * 
     * @param request DeleteRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecallManagementServiceResponse
     */
    public DeleteRecallManagementServiceResponse deleteRecallManagementServiceWithOptions(String RecallManagementServiceId, DeleteRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理服务</p>
     * 
     * @param request DeleteRecallManagementServiceRequest
     * @return DeleteRecallManagementServiceResponse
     */
    public DeleteRecallManagementServiceResponse deleteRecallManagementService(String RecallManagementServiceId, DeleteRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRecallManagementServiceWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理服务版本</p>
     * 
     * @param request DeleteRecallManagementServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecallManagementServiceVersionResponse
     */
    public DeleteRecallManagementServiceVersionResponse deleteRecallManagementServiceVersionWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, DeleteRecallManagementServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecallManagementServiceVersion"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecallManagementServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理服务版本</p>
     * 
     * @param request DeleteRecallManagementServiceVersionRequest
     * @return DeleteRecallManagementServiceVersionResponse
     */
    public DeleteRecallManagementServiceVersionResponse deleteRecallManagementServiceVersion(String RecallManagementServiceId, String RecallManagementServiceVersionId, DeleteRecallManagementServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRecallManagementServiceVersionWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除召回管理服务版本配置</p>
     * 
     * @param request DeleteRecallManagementServiceVersionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecallManagementServiceVersionConfigResponse
     */
    public DeleteRecallManagementServiceVersionConfigResponse deleteRecallManagementServiceVersionConfigWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, DeleteRecallManagementServiceVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecallManagementServiceVersionConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionConfigId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecallManagementServiceVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除召回管理服务版本配置</p>
     * 
     * @param request DeleteRecallManagementServiceVersionConfigRequest
     * @return DeleteRecallManagementServiceVersionConfigResponse
     */
    public DeleteRecallManagementServiceVersionConfigResponse deleteRecallManagementServiceVersionConfig(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, DeleteRecallManagementServiceVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRecallManagementServiceVersionConfigWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, RecallManagementServiceVersionConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理表。</p>
     * 
     * @param request DeleteRecallManagementTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecallManagementTableResponse
     */
    public DeleteRecallManagementTableResponse deleteRecallManagementTableWithOptions(String RecallManagementTableId, DeleteRecallManagementTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecallManagementTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementTableId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecallManagementTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定召回管理表。</p>
     * 
     * @param request DeleteRecallManagementTableRequest
     * @return DeleteRecallManagementTableResponse
     */
    public DeleteRecallManagementTableResponse deleteRecallManagementTable(String RecallManagementTableId, DeleteRecallManagementTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRecallManagementTableWithOptions(RecallManagementTableId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源规则</p>
     * 
     * @param request DeleteResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceRuleResponse
     */
    public DeleteResourceRuleResponse deleteResourceRuleWithOptions(String ResourceRuleId, DeleteResourceRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源规则</p>
     * 
     * @param request DeleteResourceRuleRequest
     * @return DeleteResourceRuleResponse
     */
    public DeleteResourceRuleResponse deleteResourceRule(String ResourceRuleId, DeleteResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceRuleWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源规则条目</p>
     * 
     * @param request DeleteResourceRuleItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceRuleItemResponse
     */
    public DeleteResourceRuleItemResponse deleteResourceRuleItemWithOptions(String ResourceRuleId, String ResourceRuleItemId, DeleteResourceRuleItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceRuleItem"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleItemId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceRuleItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源规则条目</p>
     * 
     * @param request DeleteResourceRuleItemRequest
     * @return DeleteResourceRuleItemResponse
     */
    public DeleteResourceRuleItemResponse deleteResourceRuleItem(String ResourceRuleId, String ResourceRuleItemId, DeleteResourceRuleItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceRuleItemWithOptions(ResourceRuleId, ResourceRuleItemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的样本一致性任务</p>
     * 
     * @param request DeleteSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSampleConsistencyJobResponse
     */
    public DeleteSampleConsistencyJobResponse deleteSampleConsistencyJobWithOptions(String SampleConsistencyJobId, DeleteSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的样本一致性任务</p>
     * 
     * @param request DeleteSampleConsistencyJobRequest
     * @return DeleteSampleConsistencyJobResponse
     */
    public DeleteSampleConsistencyJobResponse deleteSampleConsistencyJob(String SampleConsistencyJobId, DeleteSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSampleConsistencyJobWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteSceneWithOptions(String SceneId, DeleteSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScene"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(SceneId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteScene(String SceneId, DeleteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSceneWithOptions(SceneId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定人群下的指定子人群。</p>
     * 
     * @param request DeleteSubCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubCrowdResponse
     */
    public DeleteSubCrowdResponse deleteSubCrowdWithOptions(String CrowdId, String SubCrowdId, DeleteSubCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + "/subcrowds/" + com.aliyun.openapiutil.Client.getEncodeParam(SubCrowdId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定人群下的指定子人群。</p>
     * 
     * @param request DeleteSubCrowdRequest
     * @return DeleteSubCrowdResponse
     */
    public DeleteSubCrowdResponse deleteSubCrowd(String CrowdId, String SubCrowdId, DeleteSubCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSubCrowdWithOptions(CrowdId, SubCrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据表。</p>
     * 
     * @param request DeleteTableMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableMetaResponse
     */
    public DeleteTableMetaResponse deleteTableMetaWithOptions(String TableMetaId, DeleteTableMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableMeta"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tablemetas/" + com.aliyun.openapiutil.Client.getEncodeParam(TableMetaId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据表。</p>
     * 
     * @param request DeleteTableMetaRequest
     * @return DeleteTableMetaResponse
     */
    public DeleteTableMetaResponse deleteTableMeta(String TableMetaId, DeleteTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableMetaWithOptions(TableMetaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控目标</p>
     * 
     * @param request DeleteTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrafficControlTargetResponse
     */
    public DeleteTrafficControlTargetResponse deleteTrafficControlTargetWithOptions(String TrafficControlTargetId, DeleteTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控目标</p>
     * 
     * @param request DeleteTrafficControlTargetRequest
     * @return DeleteTrafficControlTargetResponse
     */
    public DeleteTrafficControlTargetResponse deleteTrafficControlTarget(String TrafficControlTargetId, DeleteTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的流量调控任务</p>
     * 
     * @param request DeleteTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrafficControlTaskResponse
     */
    public DeleteTrafficControlTaskResponse deleteTrafficControlTaskWithOptions(String TrafficControlTaskId, DeleteTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的流量调控任务</p>
     * 
     * @param request DeleteTrafficControlTaskRequest
     * @return DeleteTrafficControlTaskResponse
     */
    public DeleteTrafficControlTaskResponse deleteTrafficControlTask(String TrafficControlTaskId, DeleteTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成算法定制脚本</p>
     * 
     * @param request GenerateAlgorithmCustomizationScriptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAlgorithmCustomizationScriptResponse
     */
    public GenerateAlgorithmCustomizationScriptResponse generateAlgorithmCustomizationScriptWithOptions(String AlgorithmCustomizationId, GenerateAlgorithmCustomizationScriptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployMode)) {
            body.put("DeployMode", request.deployMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleFieldTypes)) {
            body.put("ModuleFieldTypes", request.moduleFieldTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAlgorithmCustomizationScript"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithmcustomizations/" + com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmCustomizationId) + "/action/generatescript"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAlgorithmCustomizationScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成算法定制脚本</p>
     * 
     * @param request GenerateAlgorithmCustomizationScriptRequest
     * @return GenerateAlgorithmCustomizationScriptResponse
     */
    public GenerateAlgorithmCustomizationScriptResponse generateAlgorithmCustomizationScript(String AlgorithmCustomizationId, GenerateAlgorithmCustomizationScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateAlgorithmCustomizationScriptWithOptions(AlgorithmCustomizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>产生流量调控的相关代码</p>
     * 
     * @param request GenerateTrafficControlTaskCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateTrafficControlTaskCodeResponse
     */
    public GenerateTrafficControlTaskCodeResponse generateTrafficControlTaskCodeWithOptions(String TrafficControlTaskId, GenerateTrafficControlTaskCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTrafficControlTaskCode"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/generatecode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateTrafficControlTaskCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>产生流量调控的相关代码</p>
     * 
     * @param request GenerateTrafficControlTaskCodeRequest
     * @return GenerateTrafficControlTaskCodeResponse
     */
    public GenerateTrafficControlTaskCodeResponse generateTrafficControlTaskCode(String TrafficControlTaskId, GenerateTrafficControlTaskCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateTrafficControlTaskCodeWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>产生流量调控的相关召回配置</p>
     * 
     * @param request GenerateTrafficControlTaskConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateTrafficControlTaskConfigResponse
     */
    public GenerateTrafficControlTaskConfigResponse generateTrafficControlTaskConfigWithOptions(String TrafficControlTaskId, GenerateTrafficControlTaskConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateTrafficControlTaskConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/generateconfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateTrafficControlTaskConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>产生流量调控的相关召回配置</p>
     * 
     * @param request GenerateTrafficControlTaskConfigRequest
     * @return GenerateTrafficControlTaskConfigResponse
     */
    public GenerateTrafficControlTaskConfigResponse generateTrafficControlTaskConfig(String TrafficControlTaskId, GenerateTrafficControlTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateTrafficControlTaskConfigWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标详细信息。</p>
     * 
     * @param request GetABMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetABMetricResponse
     */
    public GetABMetricResponse getABMetricWithOptions(String ABMetricId, GetABMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetABMetric"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetrics/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetABMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标详细信息。</p>
     * 
     * @param request GetABMetricRequest
     * @return GetABMetricResponse
     */
    public GetABMetricResponse getABMetric(String ABMetricId, GetABMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getABMetricWithOptions(ABMetricId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB实验指标组详细信息。</p>
     * 
     * @param request GetABMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetABMetricGroupResponse
     */
    public GetABMetricGroupResponse getABMetricGroupWithOptions(String ABMetricGroupId, GetABMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetABMetricGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricGroupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetABMetricGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB实验指标组详细信息。</p>
     * 
     * @param request GetABMetricGroupRequest
     * @return GetABMetricGroupResponse
     */
    public GetABMetricGroupResponse getABMetricGroup(String ABMetricGroupId, GetABMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getABMetricGroupWithOptions(ABMetricGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定计算任务详细信息。</p>
     * 
     * @param request GetCalculationJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCalculationJobResponse
     */
    public GetCalculationJobResponse getCalculationJobWithOptions(String CalculationJobId, GetCalculationJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCalculationJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/calculationjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(CalculationJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCalculationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定计算任务详细信息。</p>
     * 
     * @param request GetCalculationJobRequest
     * @return GetCalculationJobResponse
     */
    public GetCalculationJobResponse getCalculationJob(String CalculationJobId, GetCalculationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCalculationJobWithOptions(CalculationJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎配置详细信息。</p>
     * 
     * @param request GetEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEngineConfigResponse
     */
    public GetEngineConfigResponse getEngineConfigWithOptions(String EngineConfigId, GetEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(EngineConfigId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎配置详细信息。</p>
     * 
     * @param request GetEngineConfigRequest
     * @return GetEngineConfigResponse
     */
    public GetEngineConfigResponse getEngineConfig(String EngineConfigId, GetEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEngineConfigWithOptions(EngineConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验详细信息。</p>
     * 
     * @param request GetExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperimentWithOptions(String ExperimentId, GetExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperiment"),
            new TeaPair("version", "2022-12-13"),
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
     * <p>获取实验详细信息。</p>
     * 
     * @param request GetExperimentRequest
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperiment(String ExperimentId, GetExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定实验组详细信息。</p>
     * 
     * @param request GetExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentGroupResponse
     */
    public GetExperimentGroupResponse getExperimentGroupWithOptions(String ExperimentGroupId, GetExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定实验组详细信息。</p>
     * 
     * @param request GetExperimentGroupRequest
     * @return GetExperimentGroupResponse
     */
    public GetExperimentGroupResponse getExperimentGroup(String ExperimentGroupId, GetExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务详细信息。</p>
     * 
     * @param request GetFeatureConsistencyCheckJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureConsistencyCheckJobResponse
     */
    public GetFeatureConsistencyCheckJobResponse getFeatureConsistencyCheckJobWithOptions(String FeatureConsistencyCheckJobId, GetFeatureConsistencyCheckJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureConsistencyCheckJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureConsistencyCheckJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务详细信息。</p>
     * 
     * @param request GetFeatureConsistencyCheckJobRequest
     * @return GetFeatureConsistencyCheckJobResponse
     */
    public GetFeatureConsistencyCheckJobResponse getFeatureConsistencyCheckJob(String FeatureConsistencyCheckJobId, GetFeatureConsistencyCheckJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFeatureConsistencyCheckJobWithOptions(FeatureConsistencyCheckJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检测配置详情。</p>
     * 
     * @param request GetFeatureConsistencyCheckJobConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureConsistencyCheckJobConfigResponse
     */
    public GetFeatureConsistencyCheckJobConfigResponse getFeatureConsistencyCheckJobConfigWithOptions(String FeatureConsistencyCheckJobConfigId, GetFeatureConsistencyCheckJobConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureConsistencyCheckJobConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobConfigId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureConsistencyCheckJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检测配置详情。</p>
     * 
     * @param request GetFeatureConsistencyCheckJobConfigRequest
     * @return GetFeatureConsistencyCheckJobConfigResponse
     */
    public GetFeatureConsistencyCheckJobConfigResponse getFeatureConsistencyCheckJobConfig(String FeatureConsistencyCheckJobConfigId, GetFeatureConsistencyCheckJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFeatureConsistencyCheckJobConfigWithOptions(FeatureConsistencyCheckJobConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定推荐全链路深度定制开发平台实例信息。</p>
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
            new TeaPair("version", "2022-12-13"),
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
     * <b>summary</b> : 
     * <p>获取指定推荐全链路深度定制开发平台实例信息。</p>
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(InstanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定实例下指定资源的详细信息。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResourceResponse
     */
    public GetInstanceResourceResponse getInstanceResourceWithOptions(String InstanceId, String ResourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceResource"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定实例下指定资源的详细信息。</p>
     * @return GetInstanceResourceResponse
     */
    public GetInstanceResourceResponse getInstanceResource(String InstanceId, String ResourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceResourceWithOptions(InstanceId, ResourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源下指定表的详细信息。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResourceTableResponse
     */
    public GetInstanceResourceTableResponse getInstanceResourceTableWithOptions(String InstanceId, String ResourceId, String TableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceResourceTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(TableName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResourceTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源下指定表的详细信息。</p>
     * @return GetInstanceResourceTableResponse
     */
    public GetInstanceResourceTableResponse getInstanceResourceTable(String InstanceId, String ResourceId, String TableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceResourceTableWithOptions(InstanceId, ResourceId, TableName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验室详细信息。</p>
     * 
     * @param request GetLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLaboratoryResponse
     */
    public GetLaboratoryResponse getLaboratoryWithOptions(String LaboratoryId, GetLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验室详细信息。</p>
     * 
     * @param request GetLaboratoryRequest
     * @return GetLaboratoryResponse
     */
    public GetLaboratoryResponse getLaboratory(String LaboratoryId, GetLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取层详细信息。</p>
     * 
     * @param request GetLayerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLayerResponse
     */
    public GetLayerResponse getLayerWithOptions(String LayerId, GetLayerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayer"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(LayerId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取层详细信息。</p>
     * 
     * @param request GetLayerRequest
     * @return GetLayerResponse
     */
    public GetLayerResponse getLayer(String LayerId, GetLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerWithOptions(LayerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理初始化配置。</p>
     * 
     * @param request GetRecallManagementConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementConfigResponse
     */
    public GetRecallManagementConfigResponse getRecallManagementConfigWithOptions(GetRecallManagementConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementconfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理初始化配置。</p>
     * 
     * @param request GetRecallManagementConfigRequest
     * @return GetRecallManagementConfigResponse
     */
    public GetRecallManagementConfigResponse getRecallManagementConfig(GetRecallManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理任务详情。</p>
     * 
     * @param request GetRecallManagementJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementJobResponse
     */
    public GetRecallManagementJobResponse getRecallManagementJobWithOptions(String RecallManagementJobId, GetRecallManagementJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理任务详情。</p>
     * 
     * @param request GetRecallManagementJobRequest
     * @return GetRecallManagementJobResponse
     */
    public GetRecallManagementJobResponse getRecallManagementJob(String RecallManagementJobId, GetRecallManagementJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementJobWithOptions(RecallManagementJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理服务详细信息</p>
     * 
     * @param request GetRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementServiceResponse
     */
    public GetRecallManagementServiceResponse getRecallManagementServiceWithOptions(String RecallManagementServiceId, GetRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理服务详细信息</p>
     * 
     * @param request GetRecallManagementServiceRequest
     * @return GetRecallManagementServiceResponse
     */
    public GetRecallManagementServiceResponse getRecallManagementService(String RecallManagementServiceId, GetRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementServiceWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理版本详细信息</p>
     * 
     * @param request GetRecallManagementServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementServiceVersionResponse
     */
    public GetRecallManagementServiceVersionResponse getRecallManagementServiceVersionWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, GetRecallManagementServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementServiceVersion"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理版本详细信息</p>
     * 
     * @param request GetRecallManagementServiceVersionRequest
     * @return GetRecallManagementServiceVersionResponse
     */
    public GetRecallManagementServiceVersionResponse getRecallManagementServiceVersion(String RecallManagementServiceId, String RecallManagementServiceVersionId, GetRecallManagementServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementServiceVersionWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务版本配置详细信息</p>
     * 
     * @param request GetRecallManagementServiceVersionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementServiceVersionConfigResponse
     */
    public GetRecallManagementServiceVersionConfigResponse getRecallManagementServiceVersionConfigWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, GetRecallManagementServiceVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementServiceVersionConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionConfigId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementServiceVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务版本配置详细信息</p>
     * 
     * @param request GetRecallManagementServiceVersionConfigRequest
     * @return GetRecallManagementServiceVersionConfigResponse
     */
    public GetRecallManagementServiceVersionConfigResponse getRecallManagementServiceVersionConfig(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, GetRecallManagementServiceVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementServiceVersionConfigWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, RecallManagementServiceVersionConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理表详细信息。</p>
     * 
     * @param request GetRecallManagementTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecallManagementTableResponse
     */
    public GetRecallManagementTableResponse getRecallManagementTableWithOptions(String RecallManagementTableId, GetRecallManagementTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecallManagementTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementTableId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecallManagementTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定召回管理表详细信息。</p>
     * 
     * @param request GetRecallManagementTableRequest
     * @return GetRecallManagementTableResponse
     */
    public GetRecallManagementTableResponse getRecallManagementTable(String RecallManagementTableId, GetRecallManagementTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRecallManagementTableWithOptions(RecallManagementTableId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则详细信息</p>
     * 
     * @param request GetResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceRuleResponse
     */
    public GetResourceRuleResponse getResourceRuleWithOptions(String ResourceRuleId, GetResourceRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则详细信息</p>
     * 
     * @param request GetResourceRuleRequest
     * @return GetResourceRuleResponse
     */
    public GetResourceRuleResponse getResourceRule(String ResourceRuleId, GetResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceRuleWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本一致性任务详细信息</p>
     * 
     * @param request GetSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSampleConsistencyJobResponse
     */
    public GetSampleConsistencyJobResponse getSampleConsistencyJobWithOptions(String SampleConsistencyJobId, GetSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本一致性任务详细信息</p>
     * 
     * @param request GetSampleConsistencyJobRequest
     * @return GetSampleConsistencyJobResponse
     */
    public GetSampleConsistencyJobResponse getSampleConsistencyJob(String SampleConsistencyJobId, GetSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSampleConsistencyJobWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景详细信息</p>
     * 
     * @param request GetSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSceneResponse
     */
    public GetSceneResponse getSceneWithOptions(String SceneId, GetSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScene"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(SceneId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景详细信息</p>
     * 
     * @param request GetSceneRequest
     * @return GetSceneResponse
     */
    public GetSceneResponse getScene(String SceneId, GetSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSceneWithOptions(SceneId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务详细信息。</p>
     * 
     * @param request GetServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
    public GetServiceResponse getServiceWithOptions(String ServiceId, GetServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务详细信息。</p>
     * 
     * @param request GetServiceRequest
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(String ServiceId, GetServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(ServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定人群下的指定子人群的详细信息。</p>
     * 
     * @param request GetSubCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubCrowdResponse
     */
    public GetSubCrowdResponse getSubCrowdWithOptions(String CrowdId, String SubCrowdId, GetSubCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + "/subcrowds/" + com.aliyun.openapiutil.Client.getEncodeParam(SubCrowdId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定人群下的指定子人群的详细信息。</p>
     * 
     * @param request GetSubCrowdRequest
     * @return GetSubCrowdResponse
     */
    public GetSubCrowdResponse getSubCrowd(String CrowdId, String SubCrowdId, GetSubCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubCrowdWithOptions(CrowdId, SubCrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表详细信息。</p>
     * 
     * @param request GetTableMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableMetaResponse
     */
    public GetTableMetaResponse getTableMetaWithOptions(String TableMetaId, GetTableMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableMeta"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tablemetas/" + com.aliyun.openapiutil.Client.getEncodeParam(TableMetaId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表详细信息。</p>
     * 
     * @param request GetTableMetaRequest
     * @return GetTableMetaResponse
     */
    public GetTableMetaResponse getTableMeta(String TableMetaId, GetTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableMetaWithOptions(TableMetaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控目标详情</p>
     * 
     * @param request GetTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrafficControlTargetResponse
     */
    public GetTrafficControlTargetResponse getTrafficControlTargetWithOptions(String TrafficControlTargetId, GetTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控目标详情</p>
     * 
     * @param request GetTrafficControlTargetRequest
     * @return GetTrafficControlTargetResponse
     */
    public GetTrafficControlTargetResponse getTrafficControlTarget(String TrafficControlTargetId, GetTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务详情</p>
     * 
     * @param request GetTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrafficControlTaskResponse
     */
    public GetTrafficControlTaskResponse getTrafficControlTaskWithOptions(String TrafficControlTaskId, GetTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlTargetFilter)) {
            query.put("ControlTargetFilter", request.controlTargetFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务详情</p>
     * 
     * @param request GetTrafficControlTaskRequest
     * @return GetTrafficControlTaskResponse
     */
    public GetTrafficControlTaskResponse getTrafficControlTask(String TrafficControlTaskId, GetTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务的流量详情</p>
     * 
     * @param request GetTrafficControlTaskTrafficRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrafficControlTaskTrafficResponse
     */
    public GetTrafficControlTaskTrafficResponse getTrafficControlTaskTrafficWithOptions(String TrafficControlTaskId, GetTrafficControlTaskTrafficRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrafficControlTaskTraffic"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/trafficinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrafficControlTaskTrafficResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务的流量详情</p>
     * 
     * @param request GetTrafficControlTaskTrafficRequest
     * @return GetTrafficControlTaskTrafficResponse
     */
    public GetTrafficControlTaskTrafficResponse getTrafficControlTaskTraffic(String TrafficControlTaskId, GetTrafficControlTaskTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrafficControlTaskTrafficWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标组列表。</p>
     * 
     * @param request ListABMetricGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABMetricGroupsResponse
     */
    public ListABMetricGroupsResponse listABMetricGroupsWithOptions(ListABMetricGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            query.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABMetricGroups"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABMetricGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标组列表。</p>
     * 
     * @param request ListABMetricGroupsRequest
     * @return ListABMetricGroupsResponse
     */
    public ListABMetricGroupsResponse listABMetricGroups(ListABMetricGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABMetricGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标列表。</p>
     * 
     * @param request ListABMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListABMetricsResponse
     */
    public ListABMetricsResponse listABMetricsWithOptions(ListABMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            query.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaId)) {
            query.put("TableMetaId", request.tableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListABMetrics"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListABMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AB Test实验指标列表。</p>
     * 
     * @param request ListABMetricsRequest
     * @return ListABMetricsResponse
     */
    public ListABMetricsResponse listABMetrics(ListABMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listABMetricsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取计算任务列表。</p>
     * 
     * @param request ListCalculationJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCalculationJobsResponse
     */
    public ListCalculationJobsResponse listCalculationJobsWithOptions(ListCalculationJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalculationJobs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/calculationjobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalculationJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取计算任务列表。</p>
     * 
     * @param request ListCalculationJobsRequest
     * @return ListCalculationJobsResponse
     */
    public ListCalculationJobsResponse listCalculationJobs(ListCalculationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCalculationJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群下的所有用户。</p>
     * 
     * @param request ListCrowdUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCrowdUsersResponse
     */
    public ListCrowdUsersResponse listCrowdUsersWithOptions(String CrowdId, ListCrowdUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCrowdUsers"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCrowdUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群下的所有用户。</p>
     * 
     * @param request ListCrowdUsersRequest
     * @return ListCrowdUsersResponse
     */
    public ListCrowdUsersResponse listCrowdUsers(String CrowdId, ListCrowdUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCrowdUsersWithOptions(CrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群列表。</p>
     * 
     * @param request ListCrowdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCrowdsResponse
     */
    public ListCrowdsResponse listCrowdsWithOptions(ListCrowdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCrowds"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCrowdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群列表。</p>
     * 
     * @param request ListCrowdsRequest
     * @return ListCrowdsResponse
     */
    public ListCrowdsResponse listCrowds(ListCrowdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCrowdsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎配置列表。</p>
     * 
     * @param request ListEngineConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEngineConfigsResponse
     */
    public ListEngineConfigsResponse listEngineConfigsWithOptions(ListEngineConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEngineConfigs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎配置列表。</p>
     * 
     * @param request ListEngineConfigsRequest
     * @return ListEngineConfigsResponse
     */
    public ListEngineConfigsResponse listEngineConfigs(ListEngineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEngineConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验组列表。</p>
     * 
     * @param request ListExperimentGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentGroupsResponse
     */
    public ListExperimentGroupsResponse listExperimentGroupsWithOptions(ListExperimentGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            query.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeEnd)) {
            query.put("TimeRangeEnd", request.timeRangeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeStart)) {
            query.put("TimeRangeStart", request.timeRangeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentGroups"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验组列表。</p>
     * 
     * @param request ListExperimentGroupsRequest
     * @return ListExperimentGroupsResponse
     */
    public ListExperimentGroupsResponse listExperimentGroups(ListExperimentGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验列表。</p>
     * 
     * @param request ListExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentGroupId)) {
            query.put("ExperimentGroupId", request.experimentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperiments"),
            new TeaPair("version", "2022-12-13"),
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
     * <p>获取实验列表。</p>
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
     * <p>获取特征一致性检查配置列表。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureConsistencyCheckJobConfigsResponse
     */
    public ListFeatureConsistencyCheckJobConfigsResponse listFeatureConsistencyCheckJobConfigsWithOptions(ListFeatureConsistencyCheckJobConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureConsistencyCheckJobConfigs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobconfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureConsistencyCheckJobConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查配置列表。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobConfigsRequest
     * @return ListFeatureConsistencyCheckJobConfigsResponse
     */
    public ListFeatureConsistencyCheckJobConfigsResponse listFeatureConsistencyCheckJobConfigs(ListFeatureConsistencyCheckJobConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureConsistencyCheckJobConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务的特征报表/比对结果。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobFeatureReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureConsistencyCheckJobFeatureReportsResponse
     */
    public ListFeatureConsistencyCheckJobFeatureReportsResponse listFeatureConsistencyCheckJobFeatureReportsWithOptions(String FeatureConsistencyCheckJobId, ListFeatureConsistencyCheckJobFeatureReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logItemId)) {
            query.put("LogItemId", request.logItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            query.put("LogRequestId", request.logRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            query.put("LogUserId", request.logUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureConsistencyCheckJobFeatureReports"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobId) + "/featurereports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureConsistencyCheckJobFeatureReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务的特征报表/比对结果。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobFeatureReportsRequest
     * @return ListFeatureConsistencyCheckJobFeatureReportsResponse
     */
    public ListFeatureConsistencyCheckJobFeatureReportsResponse listFeatureConsistencyCheckJobFeatureReports(String FeatureConsistencyCheckJobId, ListFeatureConsistencyCheckJobFeatureReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureConsistencyCheckJobFeatureReportsWithOptions(FeatureConsistencyCheckJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务分数报表/比对结果。</p>
     * 
     * @param tmpReq ListFeatureConsistencyCheckJobScoreReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureConsistencyCheckJobScoreReportsResponse
     */
    public ListFeatureConsistencyCheckJobScoreReportsResponse listFeatureConsistencyCheckJobScoreReportsWithOptions(String FeatureConsistencyCheckJobId, ListFeatureConsistencyCheckJobScoreReportsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFeatureConsistencyCheckJobScoreReportsShrinkRequest request = new ListFeatureConsistencyCheckJobScoreReportsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeRequestIds)) {
            request.excludeRequestIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeRequestIds, "ExcludeRequestIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeRequestIdsShrink)) {
            query.put("ExcludeRequestIds", request.excludeRequestIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureConsistencyCheckJobScoreReports"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobId) + "/scorereports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureConsistencyCheckJobScoreReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务分数报表/比对结果。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobScoreReportsRequest
     * @return ListFeatureConsistencyCheckJobScoreReportsResponse
     */
    public ListFeatureConsistencyCheckJobScoreReportsResponse listFeatureConsistencyCheckJobScoreReports(String FeatureConsistencyCheckJobId, ListFeatureConsistencyCheckJobScoreReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureConsistencyCheckJobScoreReportsWithOptions(FeatureConsistencyCheckJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务列表。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureConsistencyCheckJobsResponse
     */
    public ListFeatureConsistencyCheckJobsResponse listFeatureConsistencyCheckJobsWithOptions(ListFeatureConsistencyCheckJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureConsistencyCheckJobs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureConsistencyCheckJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征一致性检查任务列表。</p>
     * 
     * @param request ListFeatureConsistencyCheckJobsRequest
     * @return ListFeatureConsistencyCheckJobsResponse
     */
    public ListFeatureConsistencyCheckJobsResponse listFeatureConsistencyCheckJobs(ListFeatureConsistencyCheckJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureConsistencyCheckJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据资源下的Schema列表。</p>
     * 
     * @param request ListInstanceResourceSchemasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResourceSchemasResponse
     */
    public ListInstanceResourceSchemasResponse listInstanceResourceSchemasWithOptions(String InstanceId, String ResourceId, ListInstanceResourceSchemasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceResourceSchemas"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResourceSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据资源下的Schema列表。</p>
     * 
     * @param request ListInstanceResourceSchemasRequest
     * @return ListInstanceResourceSchemasResponse
     */
    public ListInstanceResourceSchemasResponse listInstanceResourceSchemas(String InstanceId, String ResourceId, ListInstanceResourceSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceResourceSchemasWithOptions(InstanceId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源下数据表的列表。</p>
     * 
     * @param request ListInstanceResourceTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResourceTablesResponse
     */
    public ListInstanceResourceTablesResponse listInstanceResourceTablesWithOptions(String InstanceId, String ResourceId, ListInstanceResourceTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxcomputeSchema)) {
            query.put("MaxcomputeSchema", request.maxcomputeSchema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceResourceTables"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResourceTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源下数据表的列表。</p>
     * 
     * @param request ListInstanceResourceTablesRequest
     * @return ListInstanceResourceTablesResponse
     */
    public ListInstanceResourceTablesResponse listInstanceResourceTables(String InstanceId, String ResourceId, ListInstanceResourceTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceResourceTablesWithOptions(InstanceId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例下配置的资源列表。</p>
     * 
     * @param request ListInstanceResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResourcesResponse
     */
    public ListInstanceResourcesResponse listInstanceResourcesWithOptions(String InstanceId, ListInstanceResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceResources"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例下配置的资源列表。</p>
     * 
     * @param request ListInstanceResourcesRequest
     * @return ListInstanceResourcesResponse
     */
    public ListInstanceResourcesResponse listInstanceResources(String InstanceId, ListInstanceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceResourcesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐全链路深度定制开发平台实例信息列表。</p>
     * 
     * @param request ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2022-12-13"),
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
     * <b>summary</b> : 
     * <p>获取推荐全链路深度定制开发平台实例信息列表。</p>
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
     * <b>summary</b> : 
     * <p>获取实验室列表。</p>
     * 
     * @param request ListLaboratoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLaboratoriesResponse
     */
    public ListLaboratoriesResponse listLaboratoriesWithOptions(ListLaboratoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLaboratories"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLaboratoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实验室列表。</p>
     * 
     * @param request ListLaboratoriesRequest
     * @return ListLaboratoriesResponse
     */
    public ListLaboratoriesResponse listLaboratories(ListLaboratoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLaboratoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取层列表。</p>
     * 
     * @param request ListLayersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLayersResponse
     */
    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laboratoryId)) {
            query.put("LaboratoryId", request.laboratoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLayers"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLayersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取层列表。</p>
     * 
     * @param request ListLayersRequest
     * @return ListLayersResponse
     */
    public ListLayersResponse listLayers(ListLayersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLayersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取参数列表。</p>
     * 
     * @param request ListParamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParamsResponse
     */
    public ListParamsResponse listParamsWithOptions(ListParamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParams"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/params"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取参数列表。</p>
     * 
     * @param request ListParamsRequest
     * @return ListParamsResponse
     */
    public ListParamsResponse listParams(ListParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listParamsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理任务列表。</p>
     * 
     * @param request ListRecallManagementJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecallManagementJobsResponse
     */
    public ListRecallManagementJobsResponse listRecallManagementJobsWithOptions(ListRecallManagementJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecallManagementJobs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementjobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecallManagementJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理任务列表。</p>
     * 
     * @param request ListRecallManagementJobsRequest
     * @return ListRecallManagementJobsResponse
     */
    public ListRecallManagementJobsResponse listRecallManagementJobs(ListRecallManagementJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecallManagementJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务下的版本列表</p>
     * 
     * @param request ListRecallManagementServiceVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecallManagementServiceVersionsResponse
     */
    public ListRecallManagementServiceVersionsResponse listRecallManagementServiceVersionsWithOptions(String RecallManagementServiceId, ListRecallManagementServiceVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecallManagementServiceVersions"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecallManagementServiceVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务下的版本列表</p>
     * 
     * @param request ListRecallManagementServiceVersionsRequest
     * @return ListRecallManagementServiceVersionsResponse
     */
    public ListRecallManagementServiceVersionsResponse listRecallManagementServiceVersions(String RecallManagementServiceId, ListRecallManagementServiceVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecallManagementServiceVersionsWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务列表</p>
     * 
     * @param request ListRecallManagementServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecallManagementServicesResponse
     */
    public ListRecallManagementServicesResponse listRecallManagementServicesWithOptions(ListRecallManagementServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecallManagementServices"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecallManagementServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理服务列表</p>
     * 
     * @param request ListRecallManagementServicesRequest
     * @return ListRecallManagementServicesResponse
     */
    public ListRecallManagementServicesResponse listRecallManagementServices(ListRecallManagementServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecallManagementServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理表版本列表。</p>
     * 
     * @param request ListRecallManagementTableVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecallManagementTableVersionsResponse
     */
    public ListRecallManagementTableVersionsResponse listRecallManagementTableVersionsWithOptions(String RecallManagementTableId, ListRecallManagementTableVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecallManagementTableVersions"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementTableId) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecallManagementTableVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理表版本列表。</p>
     * 
     * @param request ListRecallManagementTableVersionsRequest
     * @return ListRecallManagementTableVersionsResponse
     */
    public ListRecallManagementTableVersionsResponse listRecallManagementTableVersions(String RecallManagementTableId, ListRecallManagementTableVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecallManagementTableVersionsWithOptions(RecallManagementTableId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理表列表。</p>
     * 
     * @param request ListRecallManagementTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecallManagementTablesResponse
     */
    public ListRecallManagementTablesResponse listRecallManagementTablesWithOptions(ListRecallManagementTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecallManagementTables"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecallManagementTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取召回管理表列表。</p>
     * 
     * @param request ListRecallManagementTablesRequest
     * @return ListRecallManagementTablesResponse
     */
    public ListRecallManagementTablesResponse listRecallManagementTables(ListRecallManagementTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecallManagementTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则列表</p>
     * 
     * @param request ListResourceRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceRulesResponse
     */
    public ListResourceRulesResponse listResourceRulesWithOptions(ListResourceRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRuleId)) {
            query.put("ResourceRuleId", request.resourceRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRuleName)) {
            query.put("ResourceRuleName", request.resourceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceRules"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则列表</p>
     * 
     * @param request ListResourceRulesRequest
     * @return ListResourceRulesResponse
     */
    public ListResourceRulesResponse listResourceRules(ListResourceRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本一致性任务列表</p>
     * 
     * @param request ListSampleConsistencyJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSampleConsistencyJobsResponse
     */
    public ListSampleConsistencyJobsResponse listSampleConsistencyJobsWithOptions(ListSampleConsistencyJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSampleConsistencyJobs"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSampleConsistencyJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本一致性任务列表</p>
     * 
     * @param request ListSampleConsistencyJobsRequest
     * @return ListSampleConsistencyJobsResponse
     */
    public ListSampleConsistencyJobsResponse listSampleConsistencyJobs(ListSampleConsistencyJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSampleConsistencyJobsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景列表</p>
     * 
     * @param request ListScenesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScenesResponse
     */
    public ListScenesResponse listScenesWithOptions(ListScenesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScenes"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/scenes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScenesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景列表</p>
     * 
     * @param request ListScenesRequest
     * @return ListScenesResponse
     */
    public ListScenesResponse listScenes(ListScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScenesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群下的所有子人群。</p>
     * 
     * @param request ListSubCrowdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubCrowdsResponse
     */
    public ListSubCrowdsResponse listSubCrowdsWithOptions(String CrowdId, ListSubCrowdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubCrowds"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + "/subcrowds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubCrowdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取人群下的所有子人群。</p>
     * 
     * @param request ListSubCrowdsRequest
     * @return ListSubCrowdsResponse
     */
    public ListSubCrowdsResponse listSubCrowds(String CrowdId, ListSubCrowdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubCrowdsWithOptions(CrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表列表。</p>
     * 
     * @param request ListTableMetasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableMetasResponse
     */
    public ListTableMetasResponse listTableMetasWithOptions(ListTableMetasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableMetas"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tablemetas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableMetasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表列表。</p>
     * 
     * @param request ListTableMetasRequest
     * @return ListTableMetasResponse
     */
    public ListTableMetasResponse listTableMetas(ListTableMetasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableMetasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务流量变更的历史列表</p>
     * 
     * @param request ListTrafficControlTargetTrafficHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    public ListTrafficControlTargetTrafficHistoryResponse listTrafficControlTargetTrafficHistoryWithOptions(String TrafficControlTargetId, ListTrafficControlTargetTrafficHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentGroupId)) {
            query.put("ExperimentGroupId", request.experimentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficControlTargetTrafficHistory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + "/traffichistories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficControlTargetTrafficHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控任务流量变更的历史列表</p>
     * 
     * @param request ListTrafficControlTargetTrafficHistoryRequest
     * @return ListTrafficControlTargetTrafficHistoryResponse
     */
    public ListTrafficControlTargetTrafficHistoryResponse listTrafficControlTargetTrafficHistory(String TrafficControlTargetId, ListTrafficControlTargetTrafficHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrafficControlTargetTrafficHistoryWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控列表</p>
     * 
     * @param request ListTrafficControlTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrafficControlTasksResponse
     */
    public ListTrafficControlTasksResponse listTrafficControlTasksWithOptions(ListTrafficControlTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlTargetFilter)) {
            query.put("ControlTargetFilter", request.controlTargetFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlTaskId)) {
            query.put("TrafficControlTaskId", request.trafficControlTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficControlTasks"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficControlTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流量调控列表</p>
     * 
     * @param request ListTrafficControlTasksRequest
     * @return ListTrafficControlTasksResponse
     */
    public ListTrafficControlTasksResponse listTrafficControlTasks(ListTrafficControlTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrafficControlTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验。</p>
     * 
     * @param request OfflineExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineExperimentResponse
     */
    public OfflineExperimentResponse offlineExperimentWithOptions(String ExperimentId, OfflineExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineExperiment"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验。</p>
     * 
     * @param request OfflineExperimentRequest
     * @return OfflineExperimentResponse
     */
    public OfflineExperimentResponse offlineExperiment(String ExperimentId, OfflineExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线实验组。</p>
     * 
     * @param request OfflineExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineExperimentGroupResponse
     */
    public OfflineExperimentGroupResponse offlineExperimentGroupWithOptions(String ExperimentGroupId, OfflineExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + "/action/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线实验组。</p>
     * 
     * @param request OfflineExperimentGroupRequest
     * @return OfflineExperimentGroupResponse
     */
    public OfflineExperimentGroupResponse offlineExperimentGroup(String ExperimentGroupId, OfflineExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线实验室。</p>
     * 
     * @param request OfflineLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineLaboratoryResponse
     */
    public OfflineLaboratoryResponse offlineLaboratoryWithOptions(String LaboratoryId, OfflineLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + "/action/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线实验室。</p>
     * 
     * @param request OfflineLaboratoryRequest
     * @return OfflineLaboratoryResponse
     */
    public OfflineLaboratoryResponse offlineLaboratory(String LaboratoryId, OfflineLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线召回管理服务</p>
     * 
     * @param request OfflineRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineRecallManagementServiceResponse
     */
    public OfflineRecallManagementServiceResponse offlineRecallManagementServiceWithOptions(String RecallManagementServiceId, OfflineRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/action/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线召回管理服务</p>
     * 
     * @param request OfflineRecallManagementServiceRequest
     * @return OfflineRecallManagementServiceResponse
     */
    public OfflineRecallManagementServiceResponse offlineRecallManagementService(String RecallManagementServiceId, OfflineRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineRecallManagementServiceWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验</p>
     * 
     * @param request OnlineExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineExperimentResponse
     */
    public OnlineExperimentResponse onlineExperimentWithOptions(String ExperimentId, OnlineExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineExperiment"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/online"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验</p>
     * 
     * @param request OnlineExperimentRequest
     * @return OnlineExperimentResponse
     */
    public OnlineExperimentResponse onlineExperiment(String ExperimentId, OnlineExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验组。</p>
     * 
     * @param request OnlineExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineExperimentGroupResponse
     */
    public OnlineExperimentGroupResponse onlineExperimentGroupWithOptions(String ExperimentGroupId, OnlineExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + "/action/online"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验组。</p>
     * 
     * @param request OnlineExperimentGroupRequest
     * @return OnlineExperimentGroupResponse
     */
    public OnlineExperimentGroupResponse onlineExperimentGroup(String ExperimentGroupId, OnlineExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验室。</p>
     * 
     * @param request OnlineLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineLaboratoryResponse
     */
    public OnlineLaboratoryResponse onlineLaboratoryWithOptions(String LaboratoryId, OnlineLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + "/action/online"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线实验室。</p>
     * 
     * @param request OnlineLaboratoryRequest
     * @return OnlineLaboratoryResponse
     */
    public OnlineLaboratoryResponse onlineLaboratory(String LaboratoryId, OnlineLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线召回管理服务</p>
     * 
     * @param request OnlineRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineRecallManagementServiceResponse
     */
    public OnlineRecallManagementServiceResponse onlineRecallManagementServiceWithOptions(String RecallManagementServiceId, OnlineRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/action/online"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上线召回管理服务</p>
     * 
     * @param request OnlineRecallManagementServiceRequest
     * @return OnlineRecallManagementServiceResponse
     */
    public OnlineRecallManagementServiceResponse onlineRecallManagementService(String RecallManagementServiceId, OnlineRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineRecallManagementServiceWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将maxcompute的表同步到召回引擎中。</p>
     * 
     * @param request PublishRecallManagementTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRecallManagementTableResponse
     */
    public PublishRecallManagementTableResponse publishRecallManagementTableWithOptions(String RecallManagementTableId, PublishRecallManagementTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("Partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitions)) {
            body.put("Partitions", request.partitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipThresholdCheck)) {
            body.put("SkipThresholdCheck", request.skipThresholdCheck);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRecallManagementTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementTableId) + "/action/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRecallManagementTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将maxcompute的表同步到召回引擎中。</p>
     * 
     * @param request PublishRecallManagementTableRequest
     * @return PublishRecallManagementTableResponse
     */
    public PublishRecallManagementTableResponse publishRecallManagementTable(String RecallManagementTableId, PublishRecallManagementTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRecallManagementTableWithOptions(RecallManagementTableId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推全。</p>
     * 
     * @param request PushAllExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushAllExperimentResponse
     */
    public PushAllExperimentResponse pushAllExperimentWithOptions(String ExperimentId, PushAllExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushAllExperiment"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/pushall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushAllExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推全。</p>
     * 
     * @param request PushAllExperimentRequest
     * @return PushAllExperimentResponse
     */
    public PushAllExperimentResponse pushAllExperiment(String ExperimentId, PushAllExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAllExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送指标到指定资源规则</p>
     * 
     * @param tmpReq PushResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushResourceRuleResponse
     */
    public PushResourceRuleResponse pushResourceRuleWithOptions(String ResourceRuleId, PushResourceRuleRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushResourceRuleShrinkRequest request = new PushResourceRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricInfo)) {
            request.metricInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricInfo, "MetricInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricInfoShrink)) {
            query.put("MetricInfo", request.metricInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + "/action/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送指标到指定资源规则</p>
     * 
     * @param request PushResourceRuleRequest
     * @return PushResourceRuleResponse
     */
    public PushResourceRuleResponse pushResourceRule(String ResourceRuleId, PushResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushResourceRuleWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看样本一致性任务差异的详情</p>
     * 
     * @param request QuerySampleConsistencyJobDifferenceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    public QuerySampleConsistencyJobDifferenceResponse querySampleConsistencyJobDifferenceWithOptions(String SampleConsistencyJobId, QuerySampleConsistencyJobDifferenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySampleConsistencyJobDifference"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + "/action/querydifference"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySampleConsistencyJobDifferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看样本一致性任务差异的详情</p>
     * 
     * @param request QuerySampleConsistencyJobDifferenceRequest
     * @return QuerySampleConsistencyJobDifferenceResponse
     */
    public QuerySampleConsistencyJobDifferenceResponse querySampleConsistencyJobDifference(String SampleConsistencyJobId, QuerySampleConsistencyJobDifferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySampleConsistencyJobDifferenceWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流量调控目标的单品调控报表详情。</p>
     * 
     * @param request QueryTrafficControlTargetItemReportDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    public QueryTrafficControlTargetItemReportDetailResponse queryTrafficControlTargetItemReportDetailWithOptions(String TrafficControlTargetId, QueryTrafficControlTargetItemReportDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrafficControlTargetItemReportDetail"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + "/itemcontrolreportdetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrafficControlTargetItemReportDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流量调控目标的单品调控报表详情。</p>
     * 
     * @param request QueryTrafficControlTargetItemReportDetailRequest
     * @return QueryTrafficControlTargetItemReportDetailResponse
     */
    public QueryTrafficControlTargetItemReportDetailResponse queryTrafficControlTargetItemReportDetail(String TrafficControlTargetId, QueryTrafficControlTargetItemReportDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTrafficControlTargetItemReportDetailWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布流量调控任务</p>
     * 
     * @param request ReleaseTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseTrafficControlTaskResponse
     */
    public ReleaseTrafficControlTaskResponse releaseTrafficControlTaskWithOptions(String TrafficControlTaskId, ReleaseTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/release"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布流量调控任务</p>
     * 
     * @param request ReleaseTrafficControlTaskRequest
     * @return ReleaseTrafficControlTaskResponse
     */
    public ReleaseTrafficControlTaskResponse releaseTrafficControlTask(String TrafficControlTaskId, ReleaseTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对指标组进行报表。</p>
     * 
     * @param request ReportABMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportABMetricGroupResponse
     */
    public ReportABMetricGroupResponse reportABMetricGroupWithOptions(String ABMetricGroupId, ReportABMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseExperimentId)) {
            body.put("BaseExperimentId", request.baseExperimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionFields)) {
            body.put("DimensionFields", request.dimensionFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentGroupId)) {
            body.put("ExperimentGroupId", request.experimentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentIds)) {
            body.put("ExperimentIds", request.experimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            body.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStatisticsMethod)) {
            body.put("TimeStatisticsMethod", request.timeStatisticsMethod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportABMetricGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricGroupId) + "/action/report"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportABMetricGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对指标组进行报表。</p>
     * 
     * @param request ReportABMetricGroupRequest
     * @return ReportABMetricGroupResponse
     */
    public ReportABMetricGroupResponse reportABMetricGroup(String ABMetricGroupId, ReportABMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reportABMetricGroupWithOptions(ABMetricGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>样本一致性任务报表</p>
     * 
     * @param request ReportSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportSampleConsistencyJobResponse
     */
    public ReportSampleConsistencyJobResponse reportSampleConsistencyJobWithOptions(String SampleConsistencyJobId, ReportSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + "/action/report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>样本一致性任务报表</p>
     * 
     * @param request ReportSampleConsistencyJobRequest
     * @return ReportSampleConsistencyJobResponse
     */
    public ReportSampleConsistencyJobResponse reportSampleConsistencyJob(String SampleConsistencyJobId, ReportSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reportSampleConsistencyJobWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拆分流量调控目标</p>
     * 
     * @param request SplitTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SplitTrafficControlTargetResponse
     */
    public SplitTrafficControlTargetResponse splitTrafficControlTargetWithOptions(String TrafficControlTargetId, SplitTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setPoints)) {
            body.put("SetPoints", request.setPoints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setValues)) {
            body.put("SetValues", request.setValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoints)) {
            body.put("TimePoints", request.timePoints);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SplitTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + "/action/split"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SplitTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>拆分流量调控目标</p>
     * 
     * @param request SplitTrafficControlTargetRequest
     * @return SplitTrafficControlTargetResponse
     */
    public SplitTrafficControlTargetResponse splitTrafficControlTarget(String TrafficControlTargetId, SplitTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.splitTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启流量调控目标</p>
     * 
     * @param request StartTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTrafficControlTargetResponse
     */
    public StartTrafficControlTargetResponse startTrafficControlTargetWithOptions(String TrafficControlTargetId, StartTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + "/action/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启流量调控目标</p>
     * 
     * @param request StartTrafficControlTargetRequest
     * @return StartTrafficControlTargetResponse
     */
    public StartTrafficControlTargetResponse startTrafficControlTarget(String TrafficControlTargetId, StartTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启流量调控任务</p>
     * 
     * @param request StartTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTrafficControlTaskResponse
     */
    public StartTrafficControlTaskResponse startTrafficControlTaskWithOptions(String TrafficControlTaskId, StartTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启流量调控任务</p>
     * 
     * @param request StartTrafficControlTaskRequest
     * @return StartTrafficControlTaskResponse
     */
    public StartTrafficControlTaskResponse startTrafficControlTask(String TrafficControlTaskId, StartTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止样本一致性任务</p>
     * 
     * @param request StopSampleConsistencyJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSampleConsistencyJobResponse
     */
    public StopSampleConsistencyJobResponse stopSampleConsistencyJobWithOptions(String SampleConsistencyJobId, StopSampleConsistencyJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSampleConsistencyJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sampleconsistencyjobs/" + com.aliyun.openapiutil.Client.getEncodeParam(SampleConsistencyJobId) + "/action/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSampleConsistencyJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止样本一致性任务</p>
     * 
     * @param request StopSampleConsistencyJobRequest
     * @return StopSampleConsistencyJobResponse
     */
    public StopSampleConsistencyJobResponse stopSampleConsistencyJob(String SampleConsistencyJobId, StopSampleConsistencyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopSampleConsistencyJobWithOptions(SampleConsistencyJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止流量调控目标</p>
     * 
     * @param request StopTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTrafficControlTargetResponse
     */
    public StopTrafficControlTargetResponse stopTrafficControlTargetWithOptions(String TrafficControlTargetId, StopTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + "/action/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止流量调控目标</p>
     * 
     * @param request StopTrafficControlTargetRequest
     * @return StopTrafficControlTargetResponse
     */
    public StopTrafficControlTargetResponse stopTrafficControlTarget(String TrafficControlTargetId, StopTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止流量调控任务</p>
     * 
     * @param request StopTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTrafficControlTaskResponse
     */
    public StopTrafficControlTaskResponse stopTrafficControlTaskWithOptions(String TrafficControlTaskId, StopTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止流量调控任务</p>
     * 
     * @param request StopTrafficControlTaskRequest
     * @return StopTrafficControlTaskResponse
     */
    public StopTrafficControlTaskResponse stopTrafficControlTask(String TrafficControlTaskId, StopTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步特征一致性检测任务重放日志。</p>
     * 
     * @param request SyncFeatureConsistencyCheckJobReplayLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncFeatureConsistencyCheckJobReplayLogResponse
     */
    public SyncFeatureConsistencyCheckJobReplayLogResponse syncFeatureConsistencyCheckJobReplayLogWithOptions(SyncFeatureConsistencyCheckJobReplayLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextFeatures)) {
            body.put("ContextFeatures", request.contextFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureConsistencyCheckJobConfigId)) {
            body.put("FeatureConsistencyCheckJobConfigId", request.featureConsistencyCheckJobConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generatedFeatures)) {
            body.put("GeneratedFeatures", request.generatedFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logItemId)) {
            body.put("LogItemId", request.logItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            body.put("LogRequestId", request.logRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestTime)) {
            body.put("LogRequestTime", request.logRequestTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logUserId)) {
            body.put("LogUserId", request.logUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawFeatures)) {
            body.put("RawFeatures", request.rawFeatures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            body.put("SceneName", request.sceneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncFeatureConsistencyCheckJobReplayLog"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/action/syncreplaylog"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncFeatureConsistencyCheckJobReplayLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步特征一致性检测任务重放日志。</p>
     * 
     * @param request SyncFeatureConsistencyCheckJobReplayLogRequest
     * @return SyncFeatureConsistencyCheckJobReplayLogResponse
     */
    public SyncFeatureConsistencyCheckJobReplayLogResponse syncFeatureConsistencyCheckJobReplayLog(SyncFeatureConsistencyCheckJobReplayLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFeatureConsistencyCheckJobReplayLogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消指定特征一致性检查正在运行中的任务。</p>
     * 
     * @param request TerminateFeatureConsistencyCheckJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateFeatureConsistencyCheckJobResponse
     */
    public TerminateFeatureConsistencyCheckJobResponse terminateFeatureConsistencyCheckJobWithOptions(String FeatureConsistencyCheckJobId, TerminateFeatureConsistencyCheckJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateFeatureConsistencyCheckJob"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobId) + "/action/terminate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateFeatureConsistencyCheckJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消指定特征一致性检查正在运行中的任务。</p>
     * 
     * @param request TerminateFeatureConsistencyCheckJobRequest
     * @return TerminateFeatureConsistencyCheckJobResponse
     */
    public TerminateFeatureConsistencyCheckJobResponse terminateFeatureConsistencyCheckJob(String FeatureConsistencyCheckJobId, TerminateFeatureConsistencyCheckJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.terminateFeatureConsistencyCheckJobWithOptions(FeatureConsistencyCheckJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新AB Test实验指标。</p>
     * 
     * @param request UpdateABMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABMetricResponse
     */
    public UpdateABMetricResponse updateABMetricWithOptions(String ABMetricId, UpdateABMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leftMetricId)) {
            body.put("LeftMetricId", request.leftMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            body.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultResourceId)) {
            body.put("ResultResourceId", request.resultResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rightMetricId)) {
            body.put("RightMetricId", request.rightMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsCycle)) {
            body.put("StatisticsCycle", request.statisticsCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaId)) {
            body.put("TableMetaId", request.tableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABMetric"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetrics/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新AB Test实验指标。</p>
     * 
     * @param request UpdateABMetricRequest
     * @return UpdateABMetricResponse
     */
    public UpdateABMetricResponse updateABMetric(String ABMetricId, UpdateABMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABMetricWithOptions(ABMetricId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新AB test实验指标组。</p>
     * 
     * @param request UpdateABMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateABMetricGroupResponse
     */
    public UpdateABMetricGroupResponse updateABMetricGroupWithOptions(String ABMetricGroupId, UpdateABMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ABMetricIds)) {
            body.put("ABMetricIds", request.ABMetricIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtime)) {
            body.put("Realtime", request.realtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateABMetricGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/abmetricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ABMetricGroupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateABMetricGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新AB test实验指标组。</p>
     * 
     * @param request UpdateABMetricGroupRequest
     * @return UpdateABMetricGroupResponse
     */
    public UpdateABMetricGroupResponse updateABMetricGroup(String ABMetricGroupId, UpdateABMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateABMetricGroupWithOptions(ABMetricGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定人群。</p>
     * 
     * @param request UpdateCrowdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCrowdResponse
     */
    public UpdateCrowdResponse updateCrowdWithOptions(String CrowdId, UpdateCrowdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCrowd"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCrowdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定人群。</p>
     * 
     * @param request UpdateCrowdRequest
     * @return UpdateCrowdResponse
     */
    public UpdateCrowdResponse updateCrowd(String CrowdId, UpdateCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCrowdWithOptions(CrowdId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新引擎配置。</p>
     * 
     * @param request UpdateEngineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEngineConfigResponse
     */
    public UpdateEngineConfigResponse updateEngineConfigWithOptions(String EngineConfigId, UpdateEngineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            body.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEngineConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/engineconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(EngineConfigId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新引擎配置。</p>
     * 
     * @param request UpdateEngineConfigRequest
     * @return UpdateEngineConfigResponse
     */
    public UpdateEngineConfigResponse updateEngineConfig(String EngineConfigId, UpdateEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEngineConfigWithOptions(EngineConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验。</p>
     * 
     * @param request UpdateExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentResponse
     */
    public UpdateExperimentResponse updateExperimentWithOptions(String ExperimentId, UpdateExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowPercent)) {
            body.put("FlowPercent", request.flowPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperiment"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验。</p>
     * 
     * @param request UpdateExperimentRequest
     * @return UpdateExperimentResponse
     */
    public UpdateExperimentResponse updateExperiment(String ExperimentId, UpdateExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定实验组。</p>
     * 
     * @param request UpdateExperimentGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentGroupResponse
     */
    public UpdateExperimentGroupResponse updateExperimentGroupWithOptions(String ExperimentGroupId, UpdateExperimentGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdId)) {
            body.put("CrowdId", request.crowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdTargetType)) {
            body.put("CrowdTargetType", request.crowdTargetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionTimeDuration)) {
            body.put("DistributionTimeDuration", request.distributionTimeDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionType)) {
            body.put("DistributionType", request.distributionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            body.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAA)) {
            body.put("NeedAA", request.needAA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomFlow)) {
            body.put("RandomFlow", request.randomFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservcedBuckets)) {
            body.put("ReservcedBuckets", request.reservcedBuckets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentGroup"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentGroupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定实验组。</p>
     * 
     * @param request UpdateExperimentGroupRequest
     * @return UpdateExperimentGroupResponse
     */
    public UpdateExperimentGroupResponse updateExperimentGroup(String ExperimentGroupId, UpdateExperimentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentGroupWithOptions(ExperimentGroupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新特征一致性检查配置信息。</p>
     * 
     * @param request UpdateFeatureConsistencyCheckJobConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFeatureConsistencyCheckJobConfigResponse
     */
    public UpdateFeatureConsistencyCheckJobConfigResponse updateFeatureConsistencyCheckJobConfigWithOptions(String FeatureConsistencyCheckJobConfigId, UpdateFeatureConsistencyCheckJobConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compareFeature)) {
            body.put("CompareFeature", request.compareFeature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            body.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMountPath)) {
            body.put("DatasetMountPath", request.datasetMountPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetType)) {
            body.put("DatasetType", request.datasetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetUri)) {
            body.put("DatasetUri", request.datasetUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRoute)) {
            body.put("DefaultRoute", request.defaultRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easServiceName)) {
            body.put("EasServiceName", request.easServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easyRecPackagePath)) {
            body.put("EasyRecPackagePath", request.easyRecPackagePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.easyRecVersion)) {
            body.put("EasyRecVersion", request.easyRecVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureDisplayExclude)) {
            body.put("FeatureDisplayExclude", request.featureDisplayExclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureLandingResourceId)) {
            body.put("FeatureLandingResourceId", request.featureLandingResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featurePriority)) {
            body.put("FeaturePriority", request.featurePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreItemId)) {
            body.put("FeatureStoreItemId", request.featureStoreItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreModelId)) {
            body.put("FeatureStoreModelId", request.featureStoreModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreProjectId)) {
            body.put("FeatureStoreProjectId", request.featureStoreProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreProjectName)) {
            body.put("FeatureStoreProjectName", request.featureStoreProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreSeqFeatureView)) {
            body.put("FeatureStoreSeqFeatureView", request.featureStoreSeqFeatureView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureStoreUserId)) {
            body.put("FeatureStoreUserId", request.featureStoreUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fgJarVersion)) {
            body.put("FgJarVersion", request.fgJarVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fgJsonFileName)) {
            body.put("FgJsonFileName", request.fgJsonFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateZip)) {
            body.put("GenerateZip", request.generateZip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isUseFeatureStore)) {
            body.put("IsUseFeatureStore", request.isUseFeatureStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdField)) {
            body.put("ItemIdField", request.itemIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTable)) {
            body.put("ItemTable", request.itemTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTablePartitionField)) {
            body.put("ItemTablePartitionField", request.itemTablePartitionField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTablePartitionFieldFormat)) {
            body.put("ItemTablePartitionFieldFormat", request.itemTablePartitionFieldFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossResourceId)) {
            body.put("OssResourceId", request.ossResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerCount)) {
            body.put("PredictWorkerCount", request.predictWorkerCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerCpu)) {
            body.put("PredictWorkerCpu", request.predictWorkerCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictWorkerMemory)) {
            body.put("PredictWorkerMemory", request.predictWorkerMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceConfig)) {
            body.put("ResourceConfig", request.resourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            body.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchId)) {
            body.put("SwitchId", request.switchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdField)) {
            body.put("UserIdField", request.userIdField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTable)) {
            body.put("UserTable", request.userTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTablePartitionField)) {
            body.put("UserTablePartitionField", request.userTablePartitionField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTablePartitionFieldFormat)) {
            body.put("UserTablePartitionFieldFormat", request.userTablePartitionFieldFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowName)) {
            body.put("WorkflowName", request.workflowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFeatureConsistencyCheckJobConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/featureconsistencycheck/jobconfigs/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureConsistencyCheckJobConfigId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFeatureConsistencyCheckJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新特征一致性检查配置信息。</p>
     * 
     * @param request UpdateFeatureConsistencyCheckJobConfigRequest
     * @return UpdateFeatureConsistencyCheckJobConfigResponse
     */
    public UpdateFeatureConsistencyCheckJobConfigResponse updateFeatureConsistencyCheckJobConfig(String FeatureConsistencyCheckJobConfigId, UpdateFeatureConsistencyCheckJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFeatureConsistencyCheckJobConfigWithOptions(FeatureConsistencyCheckJobConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定实例下指定资源的信息。</p>
     * 
     * @param request UpdateInstanceResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResourceResponse
     */
    public UpdateInstanceResourceResponse updateInstanceResourceWithOptions(String InstanceId, String ResourceId, UpdateInstanceResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceResource"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新指定实例下指定资源的信息。</p>
     * 
     * @param request UpdateInstanceResourceRequest
     * @return UpdateInstanceResourceResponse
     */
    public UpdateInstanceResourceResponse updateInstanceResource(String InstanceId, String ResourceId, UpdateInstanceResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceResourceWithOptions(InstanceId, ResourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验室。</p>
     * 
     * @param request UpdateLaboratoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLaboratoryResponse
     */
    public UpdateLaboratoryResponse updateLaboratoryWithOptions(String LaboratoryId, UpdateLaboratoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketCount)) {
            body.put("BucketCount", request.bucketCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buckets)) {
            body.put("Buckets", request.buckets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugCrowdId)) {
            body.put("DebugCrowdId", request.debugCrowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLaboratory"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/laboratories/" + com.aliyun.openapiutil.Client.getEncodeParam(LaboratoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLaboratoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实验室。</p>
     * 
     * @param request UpdateLaboratoryRequest
     * @return UpdateLaboratoryResponse
     */
    public UpdateLaboratoryResponse updateLaboratory(String LaboratoryId, UpdateLaboratoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLaboratoryWithOptions(LaboratoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新层。</p>
     * 
     * @param request UpdateLayerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLayerResponse
     */
    public UpdateLayerResponse updateLayerWithOptions(String LayerId, UpdateLayerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLayer"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(LayerId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新层。</p>
     * 
     * @param request UpdateLayerRequest
     * @return UpdateLayerResponse
     */
    public UpdateLayerResponse updateLayer(String LayerId, UpdateLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLayerWithOptions(LayerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新参数。</p>
     * 
     * @param request UpdateParamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateParamResponse
     */
    public UpdateParamResponse updateParamWithOptions(String ParamId, UpdateParamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateParam"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/params/" + com.aliyun.openapiutil.Client.getEncodeParam(ParamId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateParamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新参数。</p>
     * 
     * @param request UpdateParamRequest
     * @return UpdateParamResponse
     */
    public UpdateParamResponse updateParam(String ParamId, UpdateParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateParamWithOptions(ParamId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理初始化配置。</p>
     * 
     * @param request UpdateRecallManagementConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecallManagementConfigResponse
     */
    public UpdateRecallManagementConfigResponse updateRecallManagementConfigWithOptions(UpdateRecallManagementConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkConfigs)) {
            body.put("NetworkConfigs", request.networkConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecallManagementConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementconfigs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecallManagementConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理初始化配置。</p>
     * 
     * @param request UpdateRecallManagementConfigRequest
     * @return UpdateRecallManagementConfigResponse
     */
    public UpdateRecallManagementConfigResponse updateRecallManagementConfig(UpdateRecallManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecallManagementConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理服务信息</p>
     * 
     * @param request UpdateRecallManagementServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecallManagementServiceResponse
     */
    public UpdateRecallManagementServiceResponse updateRecallManagementServiceWithOptions(String RecallManagementServiceId, UpdateRecallManagementServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecallManagementService"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecallManagementServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理服务信息</p>
     * 
     * @param request UpdateRecallManagementServiceRequest
     * @return UpdateRecallManagementServiceResponse
     */
    public UpdateRecallManagementServiceResponse updateRecallManagementService(String RecallManagementServiceId, UpdateRecallManagementServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecallManagementServiceWithOptions(RecallManagementServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理服务版本配置</p>
     * 
     * @param request UpdateRecallManagementServiceVersionConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecallManagementServiceVersionConfigResponse
     */
    public UpdateRecallManagementServiceVersionConfigResponse updateRecallManagementServiceVersionConfigWithOptions(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, UpdateRecallManagementServiceVersionConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            body.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeConfig)) {
            body.put("MergeConfig", request.mergeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallConfig)) {
            body.put("RecallConfig", request.recallConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecallManagementServiceVersionConfig"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementservices/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionId) + "/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementServiceVersionConfigId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecallManagementServiceVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理服务版本配置</p>
     * 
     * @param request UpdateRecallManagementServiceVersionConfigRequest
     * @return UpdateRecallManagementServiceVersionConfigResponse
     */
    public UpdateRecallManagementServiceVersionConfigResponse updateRecallManagementServiceVersionConfig(String RecallManagementServiceId, String RecallManagementServiceVersionId, String RecallManagementServiceVersionConfigId, UpdateRecallManagementServiceVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecallManagementServiceVersionConfigWithOptions(RecallManagementServiceId, RecallManagementServiceVersionId, RecallManagementServiceVersionConfigId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理表。</p>
     * 
     * @param request UpdateRecallManagementTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecallManagementTableResponse
     */
    public UpdateRecallManagementTableResponse updateRecallManagementTableWithOptions(String RecallManagementTableId, UpdateRecallManagementTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableDataSizeFluctuationThreshold)) {
            body.put("EnableDataSizeFluctuationThreshold", request.enableDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRowCountFluctuationThreshold)) {
            body.put("EnableRowCountFluctuationThreshold", request.enableRowCountFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexVersionId)) {
            body.put("IndexVersionId", request.indexVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDataSizeFluctuationThreshold)) {
            body.put("MaxDataSizeFluctuationThreshold", request.maxDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRowCountFluctuationThreshold)) {
            body.put("MaxRowCountFluctuationThreshold", request.maxRowCountFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDataSizeFluctuationThreshold)) {
            body.put("MinDataSizeFluctuationThreshold", request.minDataSizeFluctuationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRowCountFluctuationThreshold)) {
            body.put("MinRowCountFluctuationThreshold", request.minRowCountFluctuationThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecallManagementTable"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recallmanagementtables/" + com.aliyun.openapiutil.Client.getEncodeParam(RecallManagementTableId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecallManagementTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新召回管理表。</p>
     * 
     * @param request UpdateRecallManagementTableRequest
     * @return UpdateRecallManagementTableResponse
     */
    public UpdateRecallManagementTableResponse updateRecallManagementTable(String RecallManagementTableId, UpdateRecallManagementTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRecallManagementTableWithOptions(RecallManagementTableId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则列表</p>
     * 
     * @param request UpdateResourceRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceRuleResponse
     */
    public UpdateResourceRuleResponse updateResourceRuleWithOptions(String ResourceRuleId, UpdateResourceRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricOperationType)) {
            body.put("MetricOperationType", request.metricOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricPullInfo)) {
            body.put("MetricPullInfo", request.metricPullInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricPullPeriod)) {
            body.put("MetricPullPeriod", request.metricPullPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleComputingDefinition)) {
            body.put("RuleComputingDefinition", request.ruleComputingDefinition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceRule"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规则列表</p>
     * 
     * @param request UpdateResourceRuleRequest
     * @return UpdateResourceRuleResponse
     */
    public UpdateResourceRuleResponse updateResourceRule(String ResourceRuleId, UpdateResourceRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceRuleWithOptions(ResourceRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源规则条目</p>
     * 
     * @param request UpdateResourceRuleItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceRuleItemResponse
     */
    public UpdateResourceRuleItemResponse updateResourceRuleItemWithOptions(String ResourceRuleId, String ResourceRuleItemId, UpdateResourceRuleItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            body.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            body.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceRuleItem"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resourcerules/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleId) + "/items/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceRuleItemId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceRuleItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源规则条目</p>
     * 
     * @param request UpdateResourceRuleItemRequest
     * @return UpdateResourceRuleItemResponse
     */
    public UpdateResourceRuleItemResponse updateResourceRuleItem(String ResourceRuleId, String ResourceRuleItemId, UpdateResourceRuleItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceRuleItemWithOptions(ResourceRuleId, ResourceRuleItemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新场景</p>
     * 
     * @param request UpdateSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSceneResponse
     */
    public UpdateSceneResponse updateSceneWithOptions(String SceneId, UpdateSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flows)) {
            body.put("Flows", request.flows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScene"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(SceneId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新场景</p>
     * 
     * @param request UpdateSceneRequest
     * @return UpdateSceneResponse
     */
    public UpdateSceneResponse updateScene(String SceneId, UpdateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSceneWithOptions(SceneId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表详细信息。</p>
     * 
     * @param request UpdateTableMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableMetaResponse
     */
    public UpdateTableMetaResponse updateTableMetaWithOptions(String TableMetaId, UpdateTableMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            body.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableMeta"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tablemetas/" + com.aliyun.openapiutil.Client.getEncodeParam(TableMetaId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据表详细信息。</p>
     * 
     * @param request UpdateTableMetaRequest
     * @return UpdateTableMetaResponse
     */
    public UpdateTableMetaResponse updateTableMeta(String TableMetaId, UpdateTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableMetaWithOptions(TableMetaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控目标</p>
     * 
     * @param request UpdateTrafficControlTargetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrafficControlTargetResponse
     */
    public UpdateTrafficControlTargetResponse updateTrafficControlTargetWithOptions(String TrafficControlTargetId, UpdateTrafficControlTargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newParam3)) {
            query.put("new-param-3", request.newParam3);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            body.put("Event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionArray)) {
            body.put("ItemConditionArray", request.itemConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionExpress)) {
            body.put("ItemConditionExpress", request.itemConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionType)) {
            body.put("ItemConditionType", request.itemConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newProductRegulation)) {
            body.put("NewProductRegulation", request.newProductRegulation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallName)) {
            body.put("RecallName", request.recallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisPeriod)) {
            body.put("StatisPeriod", request.statisPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toleranceValue)) {
            body.put("ToleranceValue", request.toleranceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrafficControlTarget"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltargets/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTargetId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficControlTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控目标</p>
     * 
     * @param request UpdateTrafficControlTargetRequest
     * @return UpdateTrafficControlTargetResponse
     */
    public UpdateTrafficControlTargetResponse updateTrafficControlTarget(String TrafficControlTargetId, UpdateTrafficControlTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTrafficControlTargetWithOptions(TrafficControlTargetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控任务</p>
     * 
     * @param request UpdateTrafficControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrafficControlTaskResponse
     */
    public UpdateTrafficControlTaskResponse updateTrafficControlTaskWithOptions(String TrafficControlTaskId, UpdateTrafficControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.behaviorTableMetaId)) {
            body.put("BehaviorTableMetaId", request.behaviorTableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlGranularity)) {
            body.put("ControlGranularity", request.controlGranularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlLogic)) {
            body.put("ControlLogic", request.controlLogic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("ControlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveSceneIds)) {
            body.put("EffectiveSceneIds", request.effectiveSceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionTime)) {
            body.put("ExecutionTime", request.executionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flinkResourceId)) {
            body.put("FlinkResourceId", request.flinkResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionArray)) {
            body.put("ItemConditionArray", request.itemConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionExpress)) {
            body.put("ItemConditionExpress", request.itemConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemConditionType)) {
            body.put("ItemConditionType", request.itemConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemTableMetaId)) {
            body.put("ItemTableMetaId", request.itemTableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preExperimentIds)) {
            body.put("PreExperimentIds", request.preExperimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodExperimentIds)) {
            body.put("ProdExperimentIds", request.prodExperimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            body.put("ServiceIds", request.serviceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBaeaviorConditionArray)) {
            body.put("StatisBaeaviorConditionArray", request.statisBaeaviorConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionArray)) {
            body.put("StatisBehaviorConditionArray", request.statisBehaviorConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionExpress)) {
            body.put("StatisBehaviorConditionExpress", request.statisBehaviorConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisBehaviorConditionType)) {
            body.put("StatisBehaviorConditionType", request.statisBehaviorConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlTargets)) {
            body.put("TrafficControlTargets", request.trafficControlTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionArray)) {
            body.put("UserConditionArray", request.userConditionArray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionExpress)) {
            body.put("UserConditionExpress", request.userConditionExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConditionType)) {
            body.put("UserConditionType", request.userConditionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTableMetaId)) {
            body.put("UserTableMetaId", request.userTableMetaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrafficControlTask"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控任务</p>
     * 
     * @param request UpdateTrafficControlTaskRequest
     * @return UpdateTrafficControlTaskResponse
     */
    public UpdateTrafficControlTaskResponse updateTrafficControlTask(String TrafficControlTaskId, UpdateTrafficControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTrafficControlTaskWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控任务的流量参数</p>
     * 
     * @param request UpdateTrafficControlTaskTrafficRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrafficControlTaskTrafficResponse
     */
    public UpdateTrafficControlTaskTrafficResponse updateTrafficControlTaskTrafficWithOptions(String TrafficControlTaskId, UpdateTrafficControlTaskTrafficRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newParam3)) {
            query.put("new-param-3", request.newParam3);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traffics)) {
            body.put("Traffics", request.traffics);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrafficControlTaskTraffic"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trafficcontroltasks/" + com.aliyun.openapiutil.Client.getEncodeParam(TrafficControlTaskId) + "/action/traffic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficControlTaskTrafficResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流量调控任务的流量参数</p>
     * 
     * @param request UpdateTrafficControlTaskTrafficRequest
     * @return UpdateTrafficControlTaskTrafficResponse
     */
    public UpdateTrafficControlTaskTrafficResponse updateTrafficControlTaskTraffic(String TrafficControlTaskId, UpdateTrafficControlTaskTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTrafficControlTaskTrafficWithOptions(TrafficControlTaskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传数据</p>
     * 
     * @param request UploadRecommendationDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadRecommendationDataResponse
     */
    public UploadRecommendationDataResponse uploadRecommendationDataWithOptions(UploadRecommendationDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadRecommendationData"),
            new TeaPair("version", "2022-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/recommendationdata/action/upload"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadRecommendationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传数据</p>
     * 
     * @param request UploadRecommendationDataRequest
     * @return UploadRecommendationDataResponse
     */
    public UploadRecommendationDataResponse uploadRecommendationData(UploadRecommendationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadRecommendationDataWithOptions(request, headers, runtime);
    }
}
