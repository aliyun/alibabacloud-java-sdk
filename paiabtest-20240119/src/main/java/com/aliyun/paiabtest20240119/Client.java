// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119;

import com.aliyun.tea.*;
import com.aliyun.paiabtest20240119.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paiabtest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 对层上的参数进行校验
     *
     * @param request CheckLayerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckLayerResponse
     */
    public CheckLayerResponse checkLayerWithOptions(String LayerId, CheckLayerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramNames)) {
            query.put("ParamNames", request.paramNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckLayer"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/layers/" + com.aliyun.openapiutil.Client.getEncodeParam(LayerId) + "/action/check"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckLayerResponse());
    }

    /**
     * @summary 对层上的参数进行校验
     *
     * @param request CheckLayerRequest
     * @return CheckLayerResponse
     */
    public CheckLayerResponse checkLayer(String LayerId, CheckLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkLayerWithOptions(LayerId, request, headers, runtime);
    }

    /**
     * @summary 创建人群
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

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCrowd"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 创建人群
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
     * @summary 创建实验域
     *
     * @param request CreateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdIds)) {
            body.put("CrowdIds", request.crowdIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            body.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * @summary 创建实验域
     *
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDomainWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建实验
     *
     * @param request CreateExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentResponse
     */
    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coreMetricId)) {
            body.put("CoreMetricId", request.coreMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdIds)) {
            body.put("CrowdIds", request.crowdIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusMetricIds)) {
            body.put("FocusMetricIds", request.focusMetricIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            body.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
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
            new TeaPair("version", "2024-01-19"),
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
     * @summary 创建实验
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
     * @summary 创建实验版本
     *
     * @param request CreateExperimentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExperimentVersionResponse
     */
    public CreateExperimentVersionResponse createExperimentVersionWithOptions(CreateExperimentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdIds)) {
            body.put("CrowdIds", request.crowdIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            body.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
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
            new TeaPair("action", "CreateExperimentVersion"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExperimentVersionResponse());
    }

    /**
     * @summary 创建实验版本
     *
     * @param request CreateExperimentVersionRequest
     * @return CreateExperimentVersionResponse
     */
    public CreateExperimentVersionResponse createExperimentVersion(CreateExperimentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentVersionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建Feature
     *
     * @param request CreateFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFeatureResponse
     */
    public CreateFeatureResponse createFeatureWithOptions(CreateFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFeature"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/features"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFeatureResponse());
    }

    /**
     * @summary 创建Feature
     *
     * @param request CreateFeatureRequest
     * @return CreateFeatureResponse
     */
    public CreateFeatureResponse createFeature(CreateFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFeatureWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建实验层
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

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLayer"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 创建实验层
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
     * @summary 创建指标
     *
     * @param request CreateMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricResponse
     */
    public CreateMetricResponse createMetricWithOptions(CreateMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricGroupId)) {
            body.put("MetricGroupId", request.metricGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableMetaId)) {
            body.put("SourceTableMetaId", request.sourceTableMetaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetric"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metrics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetricResponse());
    }

    /**
     * @summary 创建指标
     *
     * @param request CreateMetricRequest
     * @return CreateMetricResponse
     */
    public CreateMetricResponse createMetric(CreateMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建指标组
     *
     * @param request CreateMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricGroupResponse
     */
    public CreateMetricGroupResponse createMetricGroupWithOptions(CreateMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetricGroup"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metricgroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetricGroupResponse());
    }

    /**
     * @summary 创建指标组
     *
     * @param request CreateMetricGroupRequest
     * @return CreateMetricGroupResponse
     */
    public CreateMetricGroupResponse createMetricGroup(CreateMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetricGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建实验项目
     *
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * @summary 创建实验项目
     *
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建数据表
     *
     * @param request CreateTableMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableMetaResponse
     */
    public CreateTableMetaResponse createTableMetaWithOptions(CreateTableMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceInfo)) {
            body.put("DatasourceInfo", request.datasourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableMeta"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 创建数据表
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
     * @summary 删除指定的人群
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCrowdResponse
     */
    public DeleteCrowdResponse deleteCrowdWithOptions(String CrowdId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCrowd"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 删除指定的人群
     *
     * @return DeleteCrowdResponse
     */
    public DeleteCrowdResponse deleteCrowd(String CrowdId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCrowdWithOptions(CrowdId, headers, runtime);
    }

    /**
     * @summary 删除指定的实验域
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(String DomainId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * @summary 删除指定的实验域
     *
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(String DomainId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(DomainId, headers, runtime);
    }

    /**
     * @summary 删除指定的实验
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
            new TeaPair("version", "2024-01-19"),
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
     * @summary 删除指定的实验
     *
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * @summary 删除指定的实验版本
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentVersionResponse
     */
    public DeleteExperimentVersionResponse deleteExperimentVersionWithOptions(String ExperimentVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentVersion"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentVersionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentVersionResponse());
    }

    /**
     * @summary 删除指定的实验版本
     *
     * @return DeleteExperimentVersionResponse
     */
    public DeleteExperimentVersionResponse deleteExperimentVersion(String ExperimentVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentVersionWithOptions(ExperimentVersionId, headers, runtime);
    }

    /**
     * @summary 删除Feature
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFeatureResponse
     */
    public DeleteFeatureResponse deleteFeatureWithOptions(String FeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFeature"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/features/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFeatureResponse());
    }

    /**
     * @summary 删除Feature
     *
     * @return DeleteFeatureResponse
     */
    public DeleteFeatureResponse deleteFeature(String FeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFeatureWithOptions(FeatureId, headers, runtime);
    }

    /**
     * @summary 删除指定的实验层
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLayerResponse
     */
    public DeleteLayerResponse deleteLayerWithOptions(String LayerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLayer"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 删除指定的实验层
     *
     * @return DeleteLayerResponse
     */
    public DeleteLayerResponse deleteLayer(String LayerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLayerWithOptions(LayerId, headers, runtime);
    }

    /**
     * @summary 删除指定指标
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricResponse
     */
    public DeleteMetricResponse deleteMetricWithOptions(String MetricId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetric"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metrics/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricResponse());
    }

    /**
     * @summary 删除指定指标
     *
     * @return DeleteMetricResponse
     */
    public DeleteMetricResponse deleteMetric(String MetricId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetricWithOptions(MetricId, headers, runtime);
    }

    /**
     * @summary 删除指定的指标组
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricGroupResponse
     */
    public DeleteMetricGroupResponse deleteMetricGroupWithOptions(String MetricGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricGroup"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricGroupResponse());
    }

    /**
     * @summary 删除指定的指标组
     *
     * @return DeleteMetricGroupResponse
     */
    public DeleteMetricGroupResponse deleteMetricGroup(String MetricGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetricGroupWithOptions(MetricGroupId, headers, runtime);
    }

    /**
     * @summary 删除实验项目
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * @summary 删除实验项目
     *
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(ProjectId, headers, runtime);
    }

    /**
     * @summary 删除数据表
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableMetaResponse
     */
    public DeleteTableMetaResponse deleteTableMetaWithOptions(String TableMetaId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableMeta"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 删除数据表
     *
     * @return DeleteTableMetaResponse
     */
    public DeleteTableMetaResponse deleteTableMeta(String TableMetaId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableMetaWithOptions(TableMetaId, headers, runtime);
    }

    /**
     * @summary 获取指定人群详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCrowdResponse
     */
    public GetCrowdResponse getCrowdWithOptions(String CrowdId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCrowd"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/crowds/" + com.aliyun.openapiutil.Client.getEncodeParam(CrowdId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCrowdResponse());
    }

    /**
     * @summary 获取指定人群详情
     *
     * @return GetCrowdResponse
     */
    public GetCrowdResponse getCrowd(String CrowdId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCrowdWithOptions(CrowdId, headers, runtime);
    }

    /**
     * @summary 获取指定实验域详情
     *
     * @param request GetDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(String DomainId, GetDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    /**
     * @summary 获取指定实验域详情
     *
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(String DomainId, GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(DomainId, request, headers, runtime);
    }

    /**
     * @summary 获取指定实验的详情
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
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取指定实验的详情
     *
     * @return GetExperimentResponse
     */
    public GetExperimentResponse getExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * @summary 获取指定实验版本的详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExperimentVersionResponse
     */
    public GetExperimentVersionResponse getExperimentVersionWithOptions(String ExperimentVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentVersion"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentVersionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentVersionResponse());
    }

    /**
     * @summary 获取指定实验版本的详情
     *
     * @return GetExperimentVersionResponse
     */
    public GetExperimentVersionResponse getExperimentVersion(String ExperimentVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentVersionWithOptions(ExperimentVersionId, headers, runtime);
    }

    /**
     * @summary 获取Feature详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureResponse
     */
    public GetFeatureResponse getFeatureWithOptions(String FeatureId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeature"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/features/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureResponse());
    }

    /**
     * @summary 获取Feature详情
     *
     * @return GetFeatureResponse
     */
    public GetFeatureResponse getFeature(String FeatureId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFeatureWithOptions(FeatureId, headers, runtime);
    }

    /**
     * @summary 获取指定的实验层详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLayerResponse
     */
    public GetLayerResponse getLayerWithOptions(String LayerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLayer"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取指定的实验层详情
     *
     * @return GetLayerResponse
     */
    public GetLayerResponse getLayer(String LayerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLayerWithOptions(LayerId, headers, runtime);
    }

    /**
     * @summary 获取指标详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricResponse
     */
    public GetMetricResponse getMetricWithOptions(String MetricId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetric"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metrics/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetricResponse());
    }

    /**
     * @summary 获取指标详情
     *
     * @return GetMetricResponse
     */
    public GetMetricResponse getMetric(String MetricId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricWithOptions(MetricId, headers, runtime);
    }

    /**
     * @summary 获取指标组的详细信息
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricGroupResponse
     */
    public GetMetricGroupResponse getMetricGroupWithOptions(String MetricGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetricGroup"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricGroupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetricGroupResponse());
    }

    /**
     * @summary 获取指标组的详细信息
     *
     * @return GetMetricGroupResponse
     */
    public GetMetricGroupResponse getMetricGroup(String MetricGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricGroupWithOptions(MetricGroupId, headers, runtime);
    }

    /**
     * @summary 获取指定的实验项目
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String ProjectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * @summary 获取指定的实验项目
     *
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String ProjectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(ProjectId, headers, runtime);
    }

    /**
     * @summary 获取数据表详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableMetaResponse
     */
    public GetTableMetaResponse getTableMetaWithOptions(String TableMetaId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableMeta"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取数据表详情
     *
     * @return GetTableMetaResponse
     */
    public GetTableMetaResponse getTableMeta(String TableMetaId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableMetaWithOptions(TableMetaId, headers, runtime);
    }

    /**
     * @summary 获取人群列表
     *
     * @param request ListCrowdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCrowdsResponse
     */
    public ListCrowdsResponse listCrowdsWithOptions(ListCrowdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdId)) {
            query.put("CrowdId", request.crowdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdName)) {
            query.put("CrowdName", request.crowdName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ListCrowds"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取人群列表
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
     * @summary 获取实验域列表
     *
     * @param request ListDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            query.put("LayerId", request.layerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * @summary 获取实验域列表
     *
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDomainsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取实验版本列表
     *
     * @param request ListExperimentVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentVersionsResponse
     */
    public ListExperimentVersionsResponse listExperimentVersionsWithOptions(ListExperimentVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperimentVersions"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentVersionsResponse());
    }

    /**
     * @summary 获取实验版本列表
     *
     * @param request ListExperimentVersionsRequest
     * @return ListExperimentVersionsResponse
     */
    public ListExperimentVersionsResponse listExperimentVersions(ListExperimentVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentVersionsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取实验列表
     *
     * @param request ListExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentName)) {
            query.put("ExperimentName", request.experimentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            query.put("LayerId", request.layerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
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
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取实验列表
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
     * @summary 获取Faeture列表
     *
     * @param request ListFeaturesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeaturesResponse
     */
    public ListFeaturesResponse listFeaturesWithOptions(ListFeaturesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureId)) {
            query.put("FeatureId", request.featureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatures"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/features"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeaturesResponse());
    }

    /**
     * @summary 获取Faeture列表
     *
     * @param request ListFeaturesRequest
     * @return ListFeaturesResponse
     */
    public ListFeaturesResponse listFeatures(ListFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeaturesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取实验层列表
     *
     * @param request ListLayersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLayersResponse
     */
    public ListLayersResponse listLayersWithOptions(ListLayersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerId)) {
            query.put("LayerId", request.layerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layerName)) {
            query.put("LayerName", request.layerName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListLayers"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取实验层列表
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
     * @summary 获取指标组列表
     *
     * @param request ListMetricGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetricGroupsResponse
     */
    public ListMetricGroupsResponse listMetricGroupsWithOptions(ListMetricGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricGroupId)) {
            query.put("MetricGroupId", request.metricGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricGroupName)) {
            query.put("MetricGroupName", request.metricGroupName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetricGroups"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metricgroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetricGroupsResponse());
    }

    /**
     * @summary 获取指标组列表
     *
     * @param request ListMetricGroupsRequest
     * @return ListMetricGroupsResponse
     */
    public ListMetricGroupsResponse listMetricGroups(ListMetricGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetricGroupsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取指标列表
     *
     * @param request ListMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetricsWithOptions(ListMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricGroupId)) {
            query.put("MetricGroupId", request.metricGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricId)) {
            query.put("MetricId", request.metricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
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
            new TeaPair("action", "ListMetrics"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetricsResponse());
    }

    /**
     * @summary 获取指标列表
     *
     * @param request ListMetricsRequest
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetricsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取实验项目列表
     *
     * @param request ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * @summary 获取实验项目列表
     *
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取数据表列表
     *
     * @param request ListTableMetasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableMetasResponse
     */
    public ListTableMetasResponse listTableMetasWithOptions(ListTableMetasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            query.put("DatasourceType", request.datasourceType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaId)) {
            query.put("TableMetaId", request.tableMetaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMetaName)) {
            query.put("TableMetaName", request.tableMetaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableMetas"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 获取数据表列表
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
     * @summary 对实验版本推全
     *
     * @param request PushAllExperimentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushAllExperimentVersionResponse
     */
    public PushAllExperimentVersionResponse pushAllExperimentVersionWithOptions(String ExperimentVersionId, PushAllExperimentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            body.put("FeatureName", request.featureName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushAllExperimentVersion"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentVersionId) + "/action/pushall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushAllExperimentVersionResponse());
    }

    /**
     * @summary 对实验版本推全
     *
     * @param request PushAllExperimentVersionRequest
     * @return PushAllExperimentVersionResponse
     */
    public PushAllExperimentVersionResponse pushAllExperimentVersion(String ExperimentVersionId, PushAllExperimentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAllExperimentVersionWithOptions(ExperimentVersionId, request, headers, runtime);
    }

    /**
     * @summary 启动实验
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartExperimentResponse
     */
    public StartExperimentResponse startExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartExperiment"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartExperimentResponse());
    }

    /**
     * @summary 启动实验
     *
     * @return StartExperimentResponse
     */
    public StartExperimentResponse startExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * @summary 停止实验
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
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/action/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopExperimentResponse());
    }

    /**
     * @summary 停止实验
     *
     * @return StopExperimentResponse
     */
    public StopExperimentResponse stopExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * @summary 更新指定人群。
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

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCrowd"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 更新指定人群。
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
     * @summary 更新指定实验域
     *
     * @param request UpdateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomainWithOptions(String DomainId, UpdateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowIds)) {
            body.put("CrowIds", request.crowIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
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
            new TeaPair("action", "UpdateDomain"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainResponse());
    }

    /**
     * @summary 更新指定实验域
     *
     * @param request UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(String DomainId, UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDomainWithOptions(DomainId, request, headers, runtime);
    }

    /**
     * @summary 更新指定的实验
     *
     * @param request UpdateExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentResponse
     */
    public UpdateExperimentResponse updateExperimentWithOptions(String ExperimentId, UpdateExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketType)) {
            body.put("BucketType", request.bucketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            body.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coreMetricId)) {
            body.put("CoreMetricId", request.coreMetricId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdIds)) {
            body.put("CrowdIds", request.crowdIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.focusMetricIds)) {
            body.put("FocusMetricIds", request.focusMetricIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperiment"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 更新指定的实验
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
     * @summary 更新指定的实验版本
     *
     * @param request UpdateExperimentVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentVersionResponse
     */
    public UpdateExperimentVersionResponse updateExperimentVersionWithOptions(String ExperimentVersionId, UpdateExperimentVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crowdIds)) {
            body.put("CrowdIds", request.crowdIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugUsers)) {
            body.put("DebugUsers", request.debugUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flow)) {
            body.put("Flow", request.flow);
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
            new TeaPair("action", "UpdateExperimentVersion"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentversions/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentVersionId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentVersionResponse());
    }

    /**
     * @summary 更新指定的实验版本
     *
     * @param request UpdateExperimentVersionRequest
     * @return UpdateExperimentVersionResponse
     */
    public UpdateExperimentVersionResponse updateExperimentVersion(String ExperimentVersionId, UpdateExperimentVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentVersionWithOptions(ExperimentVersionId, request, headers, runtime);
    }

    /**
     * @summary 更新Feature
     *
     * @param request UpdateFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFeatureResponse
     */
    public UpdateFeatureResponse updateFeatureWithOptions(String FeatureId, UpdateFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFeature"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/features/" + com.aliyun.openapiutil.Client.getEncodeParam(FeatureId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFeatureResponse());
    }

    /**
     * @summary 更新Feature
     *
     * @param request UpdateFeatureRequest
     * @return UpdateFeatureResponse
     */
    public UpdateFeatureResponse updateFeature(String FeatureId, UpdateFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFeatureWithOptions(FeatureId, request, headers, runtime);
    }

    /**
     * @summary 更新指定的实验层
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

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("DomainId", request.domainId);
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
            new TeaPair("action", "UpdateLayer"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 更新指定的实验层
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
     * @summary 更新指标
     *
     * @param request UpdateMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricResponse
     */
    public UpdateMetricResponse updateMetricWithOptions(String MetricId, UpdateMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableMetaId)) {
            body.put("SourceTableMetaId", request.sourceTableMetaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetric"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metrics/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetricResponse());
    }

    /**
     * @summary 更新指标
     *
     * @param request UpdateMetricRequest
     * @return UpdateMetricResponse
     */
    public UpdateMetricResponse updateMetric(String MetricId, UpdateMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetricWithOptions(MetricId, request, headers, runtime);
    }

    /**
     * @summary 更新指定的指标组
     *
     * @param request UpdateMetricGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricGroupResponse
     */
    public UpdateMetricGroupResponse updateMetricGroupWithOptions(String MetricGroupId, UpdateMetricGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetricGroup"),
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metricgroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MetricGroupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetricGroupResponse());
    }

    /**
     * @summary 更新指定的指标组
     *
     * @param request UpdateMetricGroupRequest
     * @return UpdateMetricGroupResponse
     */
    public UpdateMetricGroupResponse updateMetricGroup(String MetricGroupId, UpdateMetricGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetricGroupWithOptions(MetricGroupId, request, headers, runtime);
    }

    /**
     * @summary 更新指定的实验项目
     *
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String ProjectId, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("version", "2024-01-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * @summary 更新指定的实验项目
     *
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String ProjectId, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(ProjectId, request, headers, runtime);
    }

    /**
     * @summary 更新数据表
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

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableMeta"),
            new TeaPair("version", "2024-01-19"),
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
     * @summary 更新数据表
     *
     * @param request UpdateTableMetaRequest
     * @return UpdateTableMetaResponse
     */
    public UpdateTableMetaResponse updateTableMeta(String TableMetaId, UpdateTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableMetaWithOptions(TableMetaId, request, headers, runtime);
    }
}
