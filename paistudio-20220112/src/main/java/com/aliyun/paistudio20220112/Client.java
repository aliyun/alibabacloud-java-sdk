// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112;

import com.aliyun.tea.*;
import com.aliyun.paistudio20220112.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "pai.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pai.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "pai.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "pai.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "pai.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "pai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "pai.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "pai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "pai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-west-1", "pai.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "pai.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "pai.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "pai.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "pai.ap-south-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "pai.cn-qingdao.aliyuncs.com"),
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

    public CreateAlgorithmResponse createAlgorithm(CreateAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlgorithmWithOptions(request, headers, runtime);
    }

    public CreateAlgorithmResponse createAlgorithmWithOptions(CreateAlgorithmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmDescription)) {
            body.put("AlgorithmDescription", request.algorithmDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            body.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlgorithmResponse());
    }

    public CreateAlgorithmVersionResponse createAlgorithmVersion(String AlgorithmId, String AlgorithmVersion, CreateAlgorithmVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, request, headers, runtime);
    }

    public CreateAlgorithmVersionResponse createAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, CreateAlgorithmVersionRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AlgorithmId = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId);
        AlgorithmVersion = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion);
        CreateAlgorithmVersionShrinkRequest request = new CreateAlgorithmVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.algorithmSpec))) {
            request.algorithmSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.algorithmSpec), "AlgorithmSpec", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmSpecShrink)) {
            body.put("AlgorithmSpec", request.algorithmSpecShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + AlgorithmId + "/versions/" + AlgorithmVersion + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlgorithmVersionResponse());
    }

    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceGroupWithOptions(request, headers, runtime);
    }

    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    public CreateTrainingJobResponse createTrainingJob(CreateTrainingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrainingJobWithOptions(request, headers, runtime);
    }

    public CreateTrainingJobResponse createTrainingJobWithOptions(CreateTrainingJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            body.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmProvider)) {
            body.put("AlgorithmProvider", request.algorithmProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVersion)) {
            body.put("AlgorithmVersion", request.algorithmVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.computeResource))) {
            body.put("ComputeResource", request.computeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperParameters)) {
            body.put("HyperParameters", request.hyperParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputChannels)) {
            body.put("InputChannels", request.inputChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputChannels)) {
            body.put("OutputChannels", request.outputChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.scheduler))) {
            body.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobDescription)) {
            body.put("TrainingJobDescription", request.trainingJobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainingJobName)) {
            body.put("TrainingJobName", request.trainingJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrainingJobResponse());
    }

    public DeleteMachineGroupResponse deleteMachineGroup(String MachineGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachineGroupWithOptions(MachineGroupID, headers, runtime);
    }

    public DeleteMachineGroupResponse deleteMachineGroupWithOptions(String MachineGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        MachineGroupID = com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/machinegroups/" + MachineGroupID + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMachineGroupResponse());
    }

    public DeleteResourceGroupResponse deleteResourceGroup(String ResourceGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceGroupWithOptions(ResourceGroupID, headers, runtime);
    }

    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(String ResourceGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ResourceGroupID = com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + ResourceGroupID + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    public DeleteResourceGroupMachineGroupResponse deleteResourceGroupMachineGroup(String MachineGroupID, String ResourceGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceGroupMachineGroupWithOptions(MachineGroupID, ResourceGroupID, headers, runtime);
    }

    public DeleteResourceGroupMachineGroupResponse deleteResourceGroupMachineGroupWithOptions(String MachineGroupID, String ResourceGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        MachineGroupID = com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID);
        ResourceGroupID = com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroupMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + ResourceGroupID + "/machinegroups/" + MachineGroupID + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupMachineGroupResponse());
    }

    public GetAlgorithmResponse getAlgorithm(String AlgorithmId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmWithOptions(AlgorithmId, headers, runtime);
    }

    public GetAlgorithmResponse getAlgorithmWithOptions(String AlgorithmId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        AlgorithmId = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithm"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + AlgorithmId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmResponse());
    }

    public GetAlgorithmVersionResponse getAlgorithmVersion(String AlgorithmId, String AlgorithmVersion) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmVersionWithOptions(AlgorithmId, AlgorithmVersion, headers, runtime);
    }

    public GetAlgorithmVersionResponse getAlgorithmVersionWithOptions(String AlgorithmId, String AlgorithmVersion, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        AlgorithmId = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId);
        AlgorithmVersion = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlgorithmVersion"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + AlgorithmId + "/versions/" + AlgorithmVersion + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlgorithmVersionResponse());
    }

    public GetMachineGroupResponse getMachineGroup(String MachineGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineGroupWithOptions(MachineGroupID, headers, runtime);
    }

    public GetMachineGroupResponse getMachineGroupWithOptions(String MachineGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        MachineGroupID = com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/machinegroups/" + MachineGroupID + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMachineGroupResponse());
    }

    public GetResourceGroupResponse getResourceGroup(String ResourceGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupWithOptions(ResourceGroupID, headers, runtime);
    }

    public GetResourceGroupResponse getResourceGroupWithOptions(String ResourceGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ResourceGroupID = com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + ResourceGroupID + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroup(String MachineGroupID, String ResourceGroupID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupMachineGroupWithOptions(MachineGroupID, ResourceGroupID, headers, runtime);
    }

    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroupWithOptions(String MachineGroupID, String ResourceGroupID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        MachineGroupID = com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID);
        ResourceGroupID = com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupMachineGroup"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + ResourceGroupID + "/machinegroups/" + MachineGroupID + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupMachineGroupResponse());
    }

    public GetTrainingJobResponse getTrainingJob(String TrainingJobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainingJobWithOptions(TrainingJobId, headers, runtime);
    }

    public GetTrainingJobResponse getTrainingJobWithOptions(String TrainingJobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        TrainingJobId = com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainingJob"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + TrainingJobId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainingJobResponse());
    }

    public ListAlgorithmVersionsResponse listAlgorithmVersions(String AlgorithmId, ListAlgorithmVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgorithmVersionsWithOptions(AlgorithmId, request, headers, runtime);
    }

    public ListAlgorithmVersionsResponse listAlgorithmVersionsWithOptions(String AlgorithmId, ListAlgorithmVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        AlgorithmId = com.aliyun.openapiutil.Client.getEncodeParam(AlgorithmId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithmVersions"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms/" + AlgorithmId + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmVersionsResponse());
    }

    public ListAlgorithmsResponse listAlgorithms(ListAlgorithmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgorithmsWithOptions(request, headers, runtime);
    }

    public ListAlgorithmsResponse listAlgorithmsWithOptions(ListAlgorithmsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            query.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            query.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmProvider)) {
            query.put("AlgorithmProvider", request.algorithmProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithms"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algorithms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmsResponse());
    }

    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroups(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupMachineGroupsWithOptions(ResourceGroupID, request, headers, runtime);
    }

    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroupsWithOptions(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResourceGroupID = com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorID)) {
            query.put("CreatorID", request.creatorID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            query.put("EcsSpec", request.ecsSpec);
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

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            query.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            query.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupMachineGroups"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + ResourceGroupID + "/machinegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupMachineGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupsWithOptions(request, headers, runtime);
    }

    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    public ListTrainingJobLogsResponse listTrainingJobLogs(String TrainingJobId, ListTrainingJobLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobLogsWithOptions(TrainingJobId, request, headers, runtime);
    }

    public ListTrainingJobLogsResponse listTrainingJobLogsWithOptions(String TrainingJobId, ListTrainingJobLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TrainingJobId = com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerId)) {
            query.put("WorkerId", request.workerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobLogs"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + TrainingJobId + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobLogsResponse());
    }

    public ListTrainingJobMetricsResponse listTrainingJobMetrics(String TrainingJobId, ListTrainingJobMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTrainingJobMetricsWithOptions(TrainingJobId, request, headers, runtime);
    }

    public ListTrainingJobMetricsResponse listTrainingJobMetricsWithOptions(String TrainingJobId, ListTrainingJobMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TrainingJobId = com.aliyun.openapiutil.Client.getEncodeParam(TrainingJobId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrainingJobMetrics"),
            new TeaPair("version", "2022-01-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/trainingjobs/" + TrainingJobId + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrainingJobMetricsResponse());
    }
}
