// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106;

import com.aliyun.tea.*;
import com.aliyun.paidms20210106.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paidms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddStreamGroupResponse addStreamGroup(AddStreamGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        AddStreamGroupHeaders headers = new AddStreamGroupHeaders();
        return this.addStreamGroupWithOptions(request, headers, runtime);
    }

    public AddStreamGroupResponse addStreamGroupWithOptions(AddStreamGroupRequest request, AddStreamGroupHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algoTypeEnum)) {
            body.put("AlgoTypeEnum", request.algoTypeEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alinkJobUser)) {
            body.put("AlinkJobUser", request.alinkJobUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamId)) {
            body.put("StreamId", request.streamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamTaskId)) {
            body.put("StreamTaskId", request.streamTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNumber)) {
            body.put("UserNumber", request.userNumber);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.transToAlink)) {
            realHeaders.put("TransToAlink", com.aliyun.teautil.Common.toJSONString(headers.transToAlink));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddStreamGroup"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/stream.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddStreamGroupResponse());
    }

    public ExportExperimentResponse exportExperiment(ExportExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportExperimentWithOptions(request, headers, runtime);
    }

    public ExportExperimentResponse exportExperimentWithOptions(ExportExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportExperiment"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/exportExperiment.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportExperimentResponse());
    }

    public ExportExperimentTreeResponse exportExperimentTree(ExportExperimentTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportExperimentTreeWithOptions(request, headers, runtime);
    }

    public ExportExperimentTreeResponse exportExperimentTreeWithOptions(ExportExperimentTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportExperimentTree"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/exportExperimentTree.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportExperimentTreeResponse());
    }

    public ExportExperimentTreeByProjectOwnerResponse exportExperimentTreeByProjectOwner(ExportExperimentTreeByProjectOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportExperimentTreeByProjectOwnerWithOptions(request, headers, runtime);
    }

    public ExportExperimentTreeByProjectOwnerResponse exportExperimentTreeByProjectOwnerWithOptions(ExportExperimentTreeByProjectOwnerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.treeOwnerId)) {
            query.put("TreeOwnerId", request.treeOwnerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportExperimentTreeByProjectOwner"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/exportExperimentTreeByProjectOwner.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportExperimentTreeByProjectOwnerResponse());
    }

    public GetAlinkAlgoInfoResponse getAlinkAlgoInfo(GetAlinkAlgoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlinkAlgoInfoWithOptions(request, headers, runtime);
    }

    public GetAlinkAlgoInfoResponse getAlinkAlgoInfoWithOptions(GetAlinkAlgoInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algoName)) {
            query.put("AlgoName", request.algoName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNumber)) {
            query.put("UserNumber", request.userNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlinkAlgoInfo"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/getAlinkAlgoInfo.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlinkAlgoInfoResponse());
    }

    public GetAlinkAlgoPublicKeyResponse getAlinkAlgoPublicKey() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlinkAlgoPublicKeyWithOptions(headers, runtime);
    }

    public GetAlinkAlgoPublicKeyResponse getAlinkAlgoPublicKeyWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlinkAlgoPublicKey"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/getAlinkAlgoPublicKey.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlinkAlgoPublicKeyResponse());
    }

    public GetProjectInfoResponse getProjectInfo(GetProjectInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectInfoWithOptions(request, headers, runtime);
    }

    public GetProjectInfoResponse getProjectInfoWithOptions(GetProjectInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectInfo"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/getProjectInfo.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectInfoResponse());
    }

    public ListUsedProjectsResponse listUsedProjects() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsedProjectsWithOptions(headers, runtime);
    }

    public ListUsedProjectsResponse listUsedProjectsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsedProjects"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/listUsedProjects.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsedProjectsResponse());
    }

    public ListUsedProjectsByOwnerResponse listUsedProjectsByOwner() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsedProjectsByOwnerWithOptions(headers, runtime);
    }

    public ListUsedProjectsByOwnerResponse listUsedProjectsByOwnerWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsedProjectsByOwner"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/migrate/listUsedProjectsByOwner.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsedProjectsByOwnerResponse());
    }

    public SaveAutomlJobIdResponse saveAutomlJobId(SaveAutomlJobIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAutomlJobIdWithOptions(request, headers, runtime);
    }

    public SaveAutomlJobIdResponse saveAutomlJobIdWithOptions(SaveAutomlJobIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAutomlJobId"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/automlJob.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAutomlJobIdResponse());
    }

    public SaveAutomlModelResponse saveAutomlModel(SaveAutomlModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAutomlModelWithOptions(request, headers, runtime);
    }

    public SaveAutomlModelResponse saveAutomlModelWithOptions(SaveAutomlModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auc)) {
            body.put("Auc", request.auc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionRecordId)) {
            body.put("ExecutionRecordId", request.executionRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            body.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.f1score)) {
            body.put("F1score", request.f1score);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indicator)) {
            body.put("Indicator", request.indicator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indicatorData)) {
            body.put("IndicatorData", request.indicatorData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMigrate)) {
            body.put("IsMigrate", request.isMigrate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iterations)) {
            body.put("Iterations", request.iterations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelIndex)) {
            body.put("ModelIndex", request.modelIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            body.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelParam)) {
            body.put("ModelParam", request.modelParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precisionScore)) {
            body.put("PrecisionScore", request.precisionScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recall)) {
            body.put("Recall", request.recall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roc)) {
            body.put("Roc", request.roc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAutomlModel"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/automl.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAutomlModelResponse());
    }

    public SaveOdpsInstanceResponse saveOdpsInstance(SaveOdpsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveOdpsInstanceWithOptions(request, headers, runtime);
    }

    public SaveOdpsInstanceResponse saveOdpsInstanceWithOptions(SaveOdpsInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceId)) {
            body.put("NodeInstanceId", request.nodeInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.odpsInstanceId)) {
            body.put("OdpsInstanceId", request.odpsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.odpsInstanceStatus)) {
            body.put("OdpsInstanceStatus", request.odpsInstanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveOdpsInstance"),
            new TeaPair("version", "2021-01-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/roa/api/v1.0/instance.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveOdpsInstanceResponse());
    }
}
