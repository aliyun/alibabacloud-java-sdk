// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202;

import com.aliyun.tea.*;
import com.aliyun.paistudio20210202.models.*;
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

    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageWithOptions(request, headers, runtime);
    }

    public AddImageResponse addImageWithOptions(AddImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            body.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
    }

    public AddImageLabelsResponse addImageLabels(String ImageId, AddImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageLabelsWithOptions(ImageId, request, headers, runtime);
    }

    public AddImageLabelsResponse addImageLabelsWithOptions(String ImageId, AddImageLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ImageId = com.aliyun.openapiutil.Client.getEncodeParam(ImageId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImageLabels"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + ImageId + "/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageLabelsResponse());
    }

    public CopyExperimentResponse copyExperiment(String ExperimentId, CopyExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.copyExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    public CopyExperimentResponse copyExperimentWithOptions(String ExperimentId, CopyExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/[ExperimentId]/copy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyExperimentResponse());
    }

    public CreateExperimentResponse createExperiment(CreateExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentWithOptions(request, headers, runtime);
    }

    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateExperimentFolderResponse createExperimentFolder(CreateExperimentFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentFolderWithOptions(request, headers, runtime);
    }

    public CreateExperimentFolderResponse createExperimentFolderWithOptions(CreateExperimentFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateExperimentMigrateValidationResponse createExperimentMigrateValidation(CreateExperimentMigrateValidationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentMigrateValidationWithOptions(request, headers, runtime);
    }

    public CreateExperimentMigrateValidationResponse createExperimentMigrateValidationWithOptions(CreateExperimentMigrateValidationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceExpId)) {
            query.put("SourceExpId", request.sourceExpId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.config))) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("ServiceType", request.serviceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    public DeleteExperimentResponse deleteExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public DeleteExperimentResponse deleteExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentResponse());
    }

    public DeleteExperimentFolderResponse deleteExperimentFolder(String FolderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentFolderWithOptions(FolderId, headers, runtime);
    }

    public DeleteExperimentFolderResponse deleteExperimentFolderWithOptions(String FolderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        FolderId = com.aliyun.openapiutil.Client.getEncodeParam(FolderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperimentFolder"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + FolderId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentFolderResponse());
    }

    public DeleteServiceResponse deleteService(String ServiceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(ServiceId, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String ServiceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ServiceId = com.aliyun.openapiutil.Client.getEncodeParam(ServiceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/services/" + ServiceId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public GetAlgoTreeResponse getAlgoTree(GetAlgoTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgoTreeWithOptions(request, headers, runtime);
    }

    public GetAlgoTreeResponse getAlgoTreeWithOptions(GetAlgoTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAlgorithmDefResponse getAlgorithmDef(GetAlgorithmDefRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefWithOptions(request, headers, runtime);
    }

    public GetAlgorithmDefResponse getAlgorithmDefWithOptions(GetAlgorithmDefRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAlgorithmDefsResponse getAlgorithmDefs(GetAlgorithmDefsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefsWithOptions(request, headers, runtime);
    }

    public GetAlgorithmDefsResponse getAlgorithmDefsWithOptions(GetAlgorithmDefsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAlgorithmTreeResponse getAlgorithmTree(GetAlgorithmTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmTreeWithOptions(request, headers, runtime);
    }

    public GetAlgorithmTreeResponse getAlgorithmTreeWithOptions(GetAlgorithmTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetExperimentResponse getExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentResponse getExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentResponse());
    }

    public GetExperimentFolderChildrenResponse getExperimentFolderChildren(String FolderId, GetExperimentFolderChildrenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentFolderChildrenWithOptions(FolderId, request, headers, runtime);
    }

    public GetExperimentFolderChildrenResponse getExperimentFolderChildrenWithOptions(String FolderId, GetExperimentFolderChildrenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        FolderId = com.aliyun.openapiutil.Client.getEncodeParam(FolderId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentFolderChildren"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + FolderId + "/children"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentFolderChildrenResponse());
    }

    public GetExperimentMetaResponse getExperimentMeta(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentMetaWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentMetaResponse getExperimentMetaWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/meta"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentMetaResponse());
    }

    public GetExperimentStatusResponse getExperimentStatus(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentStatusWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentStatusResponse getExperimentStatusWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentStatus"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentStatusResponse());
    }

    public GetExperimentVisualizationMetaResponse getExperimentVisualizationMeta(String ExperimentId, GetExperimentVisualizationMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentVisualizationMetaWithOptions(ExperimentId, request, headers, runtime);
    }

    public GetExperimentVisualizationMetaResponse getExperimentVisualizationMetaWithOptions(String ExperimentId, GetExperimentVisualizationMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExperimentVisualizationMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/visualizationMeta"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExperimentVisualizationMetaResponse());
    }

    public GetExperimentsStatisticsResponse getExperimentsStatistics(GetExperimentsStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentsStatisticsWithOptions(request, headers, runtime);
    }

    public GetExperimentsStatisticsResponse getExperimentsStatisticsWithOptions(GetExperimentsStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetExperimentsUsersStatisticsResponse getExperimentsUsersStatistics(GetExperimentsUsersStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentsUsersStatisticsWithOptions(request, headers, runtime);
    }

    public GetExperimentsUsersStatisticsResponse getExperimentsUsersStatisticsWithOptions(GetExperimentsUsersStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetImageResponse getImage(String ImageId, GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageWithOptions(ImageId, request, headers, runtime);
    }

    public GetImageResponse getImageWithOptions(String ImageId, GetImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ImageId = com.aliyun.openapiutil.Client.getEncodeParam(ImageId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + ImageId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    public GetJobResponse getJob(String JobId, GetJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(JobId, request, headers, runtime);
    }

    public GetJobResponse getJobWithOptions(String JobId, GetJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + JobId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    public GetMCTableSchemaResponse getMCTableSchema(String TableName, GetMCTableSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMCTableSchemaWithOptions(TableName, request, headers, runtime);
    }

    public GetMCTableSchemaResponse getMCTableSchemaWithOptions(String TableName, GetMCTableSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TableName = com.aliyun.openapiutil.Client.getEncodeParam(TableName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMCTableSchema"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasources/maxcompute/tables/" + TableName + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMCTableSchemaResponse());
    }

    public GetNodeInputSchemaResponse getNodeInputSchema(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeInputSchemaWithOptions(ExperimentId, NodeId, request, headers, runtime);
    }

    public GetNodeInputSchemaResponse getNodeInputSchemaWithOptions(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputId)) {
            query.put("InputId", request.inputId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputIndex)) {
            query.put("InputIndex", request.inputIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeInputSchema"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/schema"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeInputSchemaResponse());
    }

    public GetNodeOutputResponse getNodeOutput(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeOutputWithOptions(ExperimentId, NodeId, OutputId, request, headers, runtime);
    }

    public GetNodeOutputResponse getNodeOutputWithOptions(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        OutputId = com.aliyun.openapiutil.Client.getEncodeParam(OutputId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputIndex)) {
            query.put("OutputIndex", request.outputIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeOutput"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/outputs/" + OutputId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeOutputResponse());
    }

    public GetNodeVisualizationResponse getNodeVisualization(String ExperimentId, String NodeId, String VisualizationId, GetNodeVisualizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeVisualizationWithOptions(ExperimentId, NodeId, VisualizationId, request, headers, runtime);
    }

    public GetNodeVisualizationResponse getNodeVisualizationWithOptions(String ExperimentId, String NodeId, String VisualizationId, GetNodeVisualizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        VisualizationId = com.aliyun.openapiutil.Client.getEncodeParam(VisualizationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeVisualization"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/visualizations/" + VisualizationId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeVisualizationResponse());
    }

    public GetServiceResponse getService(String ServiceId, GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(ServiceId, request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String ServiceId, GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ServiceId = com.aliyun.openapiutil.Client.getEncodeParam(ServiceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/services/" + ServiceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    public GetTemplateResponse getTemplate(String TemplateId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(TemplateId, headers, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(String TemplateId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        TemplateId = com.aliyun.openapiutil.Client.getEncodeParam(TemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/templates/" + TemplateId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    public ListAlgoDefsResponse listAlgoDefs(ListAlgoDefsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlgoDefsWithOptions(request, headers, runtime);
    }

    public ListAlgoDefsResponse listAlgoDefsWithOptions(ListAlgoDefsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgoDefs"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/algo/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgoDefsResponse());
    }

    public ListAuthRolesResponse listAuthRoles(ListAuthRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthRolesWithOptions(request, headers, runtime);
    }

    public ListAuthRolesResponse listAuthRolesWithOptions(ListAuthRolesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isGenerateToken)) {
            query.put("IsGenerateToken", request.isGenerateToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListExperimentsResponse listExperiments(ListExperimentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentsWithOptions(request, headers, runtime);
    }

    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListImageLabelsResponse listImageLabels(ListImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImageLabelsWithOptions(request, headers, runtime);
    }

    public ListImageLabelsResponse listImageLabelsWithOptions(ListImageLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListNodeOutputsResponse listNodeOutputs(String ExperimentId, String NodeId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeOutputsWithOptions(ExperimentId, NodeId, headers, runtime);
    }

    public ListNodeOutputsResponse listNodeOutputsWithOptions(String ExperimentId, String NodeId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        NodeId = com.aliyun.openapiutil.Client.getEncodeParam(NodeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeOutputs"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/outputs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeOutputsResponse());
    }

    public ListRecentExperimentsResponse listRecentExperiments(ListRecentExperimentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecentExperimentsWithOptions(request, headers, runtime);
    }

    public ListRecentExperimentsResponse listRecentExperimentsWithOptions(ListRecentExperimentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.list)) {
            query.put("List", request.list);
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

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MigrateExperimentFoldersResponse migrateExperimentFolders(MigrateExperimentFoldersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateExperimentFoldersWithOptions(request, headers, runtime);
    }

    public MigrateExperimentFoldersResponse migrateExperimentFoldersWithOptions(MigrateExperimentFoldersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public MigrateExperimentsResponse migrateExperiments(MigrateExperimentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateExperimentsWithOptions(request, headers, runtime);
    }

    public MigrateExperimentsResponse migrateExperimentsWithOptions(MigrateExperimentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public PreviewMCTableResponse previewMCTable(String TableName, PreviewMCTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewMCTableWithOptions(TableName, request, headers, runtime);
    }

    public PreviewMCTableResponse previewMCTableWithOptions(String TableName, PreviewMCTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TableName = com.aliyun.openapiutil.Client.getEncodeParam(TableName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("Partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewMCTable"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/datasources/maxcompute/tables/" + TableName + "/preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewMCTableResponse());
    }

    public PublishExperimentResponse publishExperiment(String ExperimentId, PublishExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    public PublishExperimentResponse publishExperimentWithOptions(String ExperimentId, PublishExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishExperimentResponse());
    }

    public QueryExperimentVisualizationDataResponse queryExperimentVisualizationData(String ExperimentId, QueryExperimentVisualizationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExperimentVisualizationDataWithOptions(ExperimentId, request, headers, runtime);
    }

    public QueryExperimentVisualizationDataResponse queryExperimentVisualizationDataWithOptions(String ExperimentId, QueryExperimentVisualizationDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExperimentVisualizationData"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/visualizationDataQuery"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExperimentVisualizationDataResponse());
    }

    public RemoveImageResponse removeImage(String ImageId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageWithOptions(ImageId, headers, runtime);
    }

    public RemoveImageResponse removeImageWithOptions(String ImageId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ImageId = com.aliyun.openapiutil.Client.getEncodeParam(ImageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveImage"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + ImageId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveImageResponse());
    }

    public RemoveImageLabelsResponse removeImageLabels(String ImageId, String LabelKey) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageLabelsWithOptions(ImageId, LabelKey, headers, runtime);
    }

    public RemoveImageLabelsResponse removeImageLabelsWithOptions(String ImageId, String LabelKey, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ImageId = com.aliyun.openapiutil.Client.getEncodeParam(ImageId);
        LabelKey = com.aliyun.openapiutil.Client.getEncodeParam(LabelKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveImageLabels"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/images/" + ImageId + "/labels/" + LabelKey + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveImageLabelsResponse());
    }

    public SearchMCTablesResponse searchMCTables(SearchMCTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMCTablesWithOptions(request, headers, runtime);
    }

    public SearchMCTablesResponse searchMCTablesWithOptions(SearchMCTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopExperimentResponse stopExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public StopExperimentResponse stopExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopExperiment"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopExperimentResponse());
    }

    public StopJobResponse stopJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        JobId = com.aliyun.openapiutil.Client.getEncodeParam(JobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJob"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/jobs/" + JobId + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobResponse());
    }

    public UpdateExperimentContentResponse updateExperimentContent(String ExperimentId, UpdateExperimentContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentContentWithOptions(ExperimentId, request, headers, runtime);
    }

    public UpdateExperimentContentResponse updateExperimentContentWithOptions(String ExperimentId, UpdateExperimentContentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentContent"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/content"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentContentResponse());
    }

    public UpdateExperimentFolderResponse updateExperimentFolder(String FolderId, UpdateExperimentFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentFolderWithOptions(FolderId, request, headers, runtime);
    }

    public UpdateExperimentFolderResponse updateExperimentFolderWithOptions(String FolderId, UpdateExperimentFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        FolderId = com.aliyun.openapiutil.Client.getEncodeParam(FolderId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            body.put("ParentFolderId", request.parentFolderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentFolder"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experimentfolders/" + FolderId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentFolderResponse());
    }

    public UpdateExperimentMetaResponse updateExperimentMeta(String ExperimentId, UpdateExperimentMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentMetaWithOptions(ExperimentId, request, headers, runtime);
    }

    public UpdateExperimentMetaResponse updateExperimentMetaWithOptions(String ExperimentId, UpdateExperimentMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExperimentId = com.aliyun.openapiutil.Client.getEncodeParam(ExperimentId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentMeta"),
            new TeaPair("version", "2021-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/experiments/" + ExperimentId + "/meta"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentMetaResponse());
    }
}
