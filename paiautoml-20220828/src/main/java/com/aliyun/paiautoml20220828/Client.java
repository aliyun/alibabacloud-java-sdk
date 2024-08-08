// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828;

import com.aliyun.tea.*;
import com.aliyun.paiautoml20220828.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paiautoml", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>CreateAutofeExperiment</p>
     * 
     * @param request CreateAutofeExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutofeExperimentResponse
     */
    public CreateAutofeExperimentResponse createAutofeExperimentWithOptions(CreateAutofeExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autofeExperimentConfiguration)) {
            body.put("AutofeExperimentConfiguration", request.autofeExperimentConfiguration);
        }

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
            new TeaPair("action", "CreateAutofeExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/autofe/experiment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutofeExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateAutofeExperiment</p>
     * 
     * @param request CreateAutofeExperimentRequest
     * @return CreateAutofeExperimentResponse
     */
    public CreateAutofeExperimentResponse createAutofeExperiment(CreateAutofeExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutofeExperimentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an HyperParameter Optimization experiment.</p>
     * 
     * @param request CreateHpoExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHpoExperimentResponse
     */
    public CreateHpoExperimentResponse createHpoExperimentWithOptions(CreateHpoExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpoExperimentConfiguration)) {
            body.put("HpoExperimentConfiguration", request.hpoExperimentConfiguration);
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
            new TeaPair("action", "CreateHpoExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHpoExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an HyperParameter Optimization experiment.</p>
     * 
     * @param request CreateHpoExperimentRequest
     * @return CreateHpoExperimentResponse
     */
    public CreateHpoExperimentResponse createHpoExperiment(CreateHpoExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHpoExperimentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateServiceIdentityRole</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceIdentityRole"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/serviceidentityrole"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceIdentityRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateServiceIdentityRole</p>
     * @return CreateServiceIdentityRoleResponse
     */
    public CreateServiceIdentityRoleResponse createServiceIdentityRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceIdentityRoleWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete an HPO experiment</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHpoExperimentResponse
     */
    public DeleteHpoExperimentResponse deleteHpoExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHpoExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/delete"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHpoExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete an HPO experiment</p>
     * @return DeleteHpoExperimentResponse
     */
    public DeleteHpoExperimentResponse deleteHpoExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHpoExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get AutoFE Experiment。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutofeExperimentResponse
     */
    public GetAutofeExperimentResponse getAutofeExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutofeExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/autofe/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutofeExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get AutoFE Experiment。</p>
     * @return GetAutofeExperimentResponse
     */
    public GetAutofeExperimentResponse getAutofeExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAutofeExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get hpo experiment by user id and exp id</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHpoExperimentResponse
     */
    public GetHpoExperimentResponse getHpoExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHpoExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHpoExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get hpo experiment by user id and exp id</p>
     * @return GetHpoExperimentResponse
     */
    public GetHpoExperimentResponse getHpoExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHpoExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get trial detail information</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHpoTrialResponse
     */
    public GetHpoTrialResponse getHpoTrialWithOptions(String ExperimentId, String TrialId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHpoTrial"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/trial/" + com.aliyun.openapiutil.Client.getEncodeParam(TrialId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHpoTrialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get trial detail information</p>
     * @return GetHpoTrialResponse
     */
    public GetHpoTrialResponse getHpoTrial(String ExperimentId, String TrialId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHpoTrialWithOptions(ExperimentId, TrialId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetServiceIdentityRole, return role name if SLR exists, empty otherwise</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceIdentityRole"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/serviceidentityrole"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceIdentityRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetServiceIdentityRole, return role name if SLR exists, empty otherwise</p>
     * @return GetServiceIdentityRoleResponse
     */
    public GetServiceIdentityRoleResponse getServiceIdentityRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceIdentityRoleWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list the content of a specified hpo experiment log</p>
     * 
     * @param request ListHpoExperimentLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoExperimentLogsResponse
     */
    public ListHpoExperimentLogsResponse listHpoExperimentLogsWithOptions(String ExperimentId, ListHpoExperimentLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logName)) {
            query.put("LogName", request.logName);
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
            new TeaPair("action", "ListHpoExperimentLogs"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoExperimentLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list the content of a specified hpo experiment log</p>
     * 
     * @param request ListHpoExperimentLogsRequest
     * @return ListHpoExperimentLogsResponse
     */
    public ListHpoExperimentLogsResponse listHpoExperimentLogs(String ExperimentId, ListHpoExperimentLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoExperimentLogsWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List HPO experiments</p>
     * 
     * @param request ListHpoExperimentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoExperimentsResponse
     */
    public ListHpoExperimentsResponse listHpoExperimentsWithOptions(ListHpoExperimentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            query.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeConfigData)) {
            query.put("IncludeConfigData", request.includeConfigData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCreateTime)) {
            query.put("MaxCreateTime", request.maxCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minCreateTime)) {
            query.put("MinCreateTime", request.minCreateTime);
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
            new TeaPair("action", "ListHpoExperiments"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoExperimentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List HPO experiments</p>
     * 
     * @param request ListHpoExperimentsRequest
     * @return ListHpoExperimentsResponse
     */
    public ListHpoExperimentsResponse listHpoExperiments(ListHpoExperimentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoExperimentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>返回一个trial所对应的任务里所有已经执行的命令</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoTrialCommandsResponse
     */
    public ListHpoTrialCommandsResponse listHpoTrialCommandsWithOptions(String ExperimentId, String TrialId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHpoTrialCommands"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/trial/" + com.aliyun.openapiutil.Client.getEncodeParam(TrialId) + "/commands"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoTrialCommandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>返回一个trial所对应的任务里所有已经执行的命令</p>
     * @return ListHpoTrialCommandsResponse
     */
    public ListHpoTrialCommandsResponse listHpoTrialCommands(String ExperimentId, String TrialId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoTrialCommandsWithOptions(ExperimentId, TrialId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List all log file names a trial have.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoTrialLogNamesResponse
     */
    public ListHpoTrialLogNamesResponse listHpoTrialLogNamesWithOptions(String ExperimentId, String TrialId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHpoTrialLogNames"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/trial/" + com.aliyun.openapiutil.Client.getEncodeParam(TrialId) + "/lognames"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoTrialLogNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List all log file names a trial have.</p>
     * @return ListHpoTrialLogNamesResponse
     */
    public ListHpoTrialLogNamesResponse listHpoTrialLogNames(String ExperimentId, String TrialId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoTrialLogNamesWithOptions(ExperimentId, TrialId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Trial log lines</p>
     * 
     * @param request ListHpoTrialLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoTrialLogsResponse
     */
    public ListHpoTrialLogsResponse listHpoTrialLogsWithOptions(String ExperimentId, String TrialId, ListHpoTrialLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logName)) {
            query.put("LogName", request.logName);
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
            new TeaPair("action", "ListHpoTrialLogs"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/trial/" + com.aliyun.openapiutil.Client.getEncodeParam(TrialId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoTrialLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Trial log lines</p>
     * 
     * @param request ListHpoTrialLogsRequest
     * @return ListHpoTrialLogsResponse
     */
    public ListHpoTrialLogsResponse listHpoTrialLogs(String ExperimentId, String TrialId, ListHpoTrialLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoTrialLogsWithOptions(ExperimentId, TrialId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List HPO trials</p>
     * 
     * @param request ListHpoTrialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHpoTrialsResponse
     */
    public ListHpoTrialsResponse listHpoTrialsWithOptions(String ExperimentId, ListHpoTrialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHpoTrials"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/trials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHpoTrialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List HPO trials</p>
     * 
     * @param request ListHpoTrialsRequest
     * @return ListHpoTrialsResponse
     */
    public ListHpoTrialsResponse listHpoTrials(String ExperimentId, ListHpoTrialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHpoTrialsWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restart HPO trials</p>
     * 
     * @param request RestartHpoTrialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartHpoTrialsResponse
     */
    public RestartHpoTrialsResponse restartHpoTrialsWithOptions(String ExperimentId, RestartHpoTrialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trialHyperParameters)) {
            body.put("TrialHyperParameters", request.trialHyperParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trialIds)) {
            body.put("TrialIds", request.trialIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartHpoTrials"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/restart_trials"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartHpoTrialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restart HPO trials</p>
     * 
     * @param request RestartHpoTrialsRequest
     * @return RestartHpoTrialsResponse
     */
    public RestartHpoTrialsResponse restartHpoTrials(String ExperimentId, RestartHpoTrialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartHpoTrialsWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>calling hpo StopExperiment</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopHpoExperimentResponse
     */
    public StopHpoExperimentResponse stopHpoExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopHpoExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopHpoExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>calling hpo StopExperiment</p>
     * @return StopHpoExperimentResponse
     */
    public StopHpoExperimentResponse stopHpoExperiment(String ExperimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopHpoExperimentWithOptions(ExperimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stop an HPO trial.</p>
     * 
     * @param request StopHpoTrialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopHpoTrialsResponse
     */
    public StopHpoTrialsResponse stopHpoTrialsWithOptions(String ExperimentId, StopHpoTrialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trialIds)) {
            body.put("TrialIds", request.trialIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopHpoTrials"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/stop_trials"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopHpoTrialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stop an HPO trial.</p>
     * 
     * @param request StopHpoTrialsRequest
     * @return StopHpoTrialsResponse
     */
    public StopHpoTrialsResponse stopHpoTrials(String ExperimentId, StopHpoTrialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopHpoTrialsWithOptions(ExperimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update a running HPO experiment\&quot;s configuration</p>
     * 
     * @param request UpdateHpoExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHpoExperimentResponse
     */
    public UpdateHpoExperimentResponse updateHpoExperimentWithOptions(String ExperimentId, UpdateHpoExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpoExperimentConfiguration)) {
            body.put("HpoExperimentConfiguration", request.hpoExperimentConfiguration);
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
            new TeaPair("action", "UpdateHpoExperiment"),
            new TeaPair("version", "2022-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/automl/v1/hpo/experiment/" + com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId) + "/update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHpoExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update a running HPO experiment\&quot;s configuration</p>
     * 
     * @param request UpdateHpoExperimentRequest
     * @return UpdateHpoExperimentResponse
     */
    public UpdateHpoExperimentResponse updateHpoExperiment(String ExperimentId, UpdateHpoExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHpoExperimentWithOptions(ExperimentId, request, headers, runtime);
    }
}
