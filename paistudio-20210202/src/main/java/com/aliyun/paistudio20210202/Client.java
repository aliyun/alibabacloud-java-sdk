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

    public CreateExperimentResponse createExperiment(CreateExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentWithOptions(request, headers, runtime);
    }

    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateExperiment", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/experiments", "json", req, runtime), new CreateExperimentResponse());
    }

    public DeleteServiceResponse deleteService(String ServiceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(ServiceId, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String ServiceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteService", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/services/" + ServiceId + "", "json", req, runtime), new DeleteServiceResponse());
    }

    public GetExperimentStatusResponse getExperimentStatus(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentStatusWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentStatusResponse getExperimentStatusWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetExperimentStatus", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/status", "json", req, runtime), new GetExperimentStatusResponse());
    }

    public GetExperimentFolderChildrenResponse getExperimentFolderChildren(String FolderId, GetExperimentFolderChildrenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentFolderChildrenWithOptions(FolderId, request, headers, runtime);
    }

    public GetExperimentFolderChildrenResponse getExperimentFolderChildrenWithOptions(String FolderId, GetExperimentFolderChildrenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyFolder)) {
            query.put("OnlyFolder", request.onlyFolder);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetExperimentFolderChildren", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experimentfolders/" + FolderId + "/children", "json", req, runtime), new GetExperimentFolderChildrenResponse());
    }

    public ListAuthRolesResponse listAuthRoles(ListAuthRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthRolesWithOptions(request, headers, runtime);
    }

    public ListAuthRolesResponse listAuthRolesWithOptions(ListAuthRolesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGenerateToken)) {
            query.put("IsGenerateToken", request.isGenerateToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAuthRoles", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/authorization/roles", "json", req, runtime), new ListAuthRolesResponse());
    }

    public GetNodeInputSchemaResponse getNodeInputSchema(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeInputSchemaWithOptions(ExperimentId, NodeId, request, headers, runtime);
    }

    public GetNodeInputSchemaResponse getNodeInputSchemaWithOptions(String ExperimentId, String NodeId, GetNodeInputSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("GetNodeInputSchema", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/schema", "json", req, runtime), new GetNodeInputSchemaResponse());
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
        return TeaModel.toModel(this.doROARequest("ListAlgoDefs", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/algo/detail", "json", req, runtime), new ListAlgoDefsResponse());
    }

    public AddImageLabelsResponse addImageLabels(String ImageId, AddImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageLabelsWithOptions(ImageId, request, headers, runtime);
    }

    public AddImageLabelsResponse addImageLabelsWithOptions(String ImageId, AddImageLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AddImageLabels", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/images/" + ImageId + "/labels", "json", req, runtime), new AddImageLabelsResponse());
    }

    public ListExperimentsResponse listExperiments(ListExperimentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentsWithOptions(request, headers, runtime);
    }

    public ListExperimentsResponse listExperimentsWithOptions(ListExperimentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
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
        return TeaModel.toModel(this.doROARequest("ListExperiments", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments", "json", req, runtime), new ListExperimentsResponse());
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
        return TeaModel.toModel(this.doROARequest("GetAlgorithmTree", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/algorithm/tree", "json", req, runtime), new GetAlgorithmTreeResponse());
    }

    public CreateExperimentFolderResponse createExperimentFolder(CreateExperimentFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExperimentFolderWithOptions(request, headers, runtime);
    }

    public CreateExperimentFolderResponse createExperimentFolderWithOptions(CreateExperimentFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateExperimentFolder", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/experimentfolders", "json", req, runtime), new CreateExperimentFolderResponse());
    }

    public GetJobResponse getJob(String JobId, GetJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(JobId, request, headers, runtime);
    }

    public GetJobResponse getJobWithOptions(String JobId, GetJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJob", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/jobs/" + JobId + "", "json", req, runtime), new GetJobResponse());
    }

    public GetExperimentMetaResponse getExperimentMeta(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentMetaWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentMetaResponse getExperimentMetaWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetExperimentMeta", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/meta", "json", req, runtime), new GetExperimentMetaResponse());
    }

    public ListNodeOutputsResponse listNodeOutputs(String ExperimentId, String NodeId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodeOutputsWithOptions(ExperimentId, NodeId, headers, runtime);
    }

    public ListNodeOutputsResponse listNodeOutputsWithOptions(String ExperimentId, String NodeId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListNodeOutputs", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/outputs", "json", req, runtime), new ListNodeOutputsResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.list)) {
            query.put("List", request.list);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTemplates", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/templates", "json", req, runtime), new ListTemplatesResponse());
    }

    public UpdateExperimentMetaResponse updateExperimentMeta(String ExperimentId, UpdateExperimentMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentMetaWithOptions(ExperimentId, request, headers, runtime);
    }

    public UpdateExperimentMetaResponse updateExperimentMetaWithOptions(String ExperimentId, UpdateExperimentMetaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateExperimentMeta", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/experiments/" + ExperimentId + "/meta", "json", req, runtime), new UpdateExperimentMetaResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListImages", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/images", "json", req, runtime), new ListImagesResponse());
    }

    public GetAlgorithmDefsResponse getAlgorithmDefs(GetAlgorithmDefsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefsWithOptions(request, headers, runtime);
    }

    public GetAlgorithmDefsResponse getAlgorithmDefsWithOptions(GetAlgorithmDefsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("Timestamp", request.timestamp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetAlgorithmDefs", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/algorithm/defs", "json", req, runtime), new GetAlgorithmDefsResponse());
    }

    public DeleteExperimentFolderResponse deleteExperimentFolder(String FolderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentFolderWithOptions(FolderId, headers, runtime);
    }

    public DeleteExperimentFolderResponse deleteExperimentFolderWithOptions(String FolderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteExperimentFolder", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/experimentfolders/" + FolderId + "", "json", req, runtime), new DeleteExperimentFolderResponse());
    }

    public ListImageLabelsResponse listImageLabels(ListImageLabelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImageLabelsWithOptions(request, headers, runtime);
    }

    public ListImageLabelsResponse listImageLabelsWithOptions(ListImageLabelsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelKeys)) {
            query.put("LabelKeys", request.labelKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelFilter)) {
            query.put("LabelFilter", request.labelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListImageLabels", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/image/labels", "json", req, runtime), new ListImageLabelsResponse());
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
        return TeaModel.toModel(this.doROARequest("GetAlgoTree", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/algo/tree", "json", req, runtime), new GetAlgoTreeResponse());
    }

    public GetExperimentResponse getExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public GetExperimentResponse getExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetExperiment", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "", "json", req, runtime), new GetExperimentResponse());
    }

    public CopyExperimentResponse copyExperiment(String ExperimentId, CopyExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.copyExperimentWithOptions(ExperimentId, request, headers, runtime);
    }

    public CopyExperimentResponse copyExperimentWithOptions(String ExperimentId, CopyExperimentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CopyExperiment", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/experiments/[ExperimentId]/copy", "json", req, runtime), new CopyExperimentResponse());
    }

    public StopJobResponse stopJob(String JobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(JobId, headers, runtime);
    }

    public StopJobResponse stopJobWithOptions(String JobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopJob", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/jobs/" + JobId + "/stop", "json", req, runtime), new StopJobResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            body.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
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
        return TeaModel.toModel(this.doROARequest("CreateJob", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/jobs", "json", req, runtime), new CreateJobResponse());
    }

    public GetNodeVisualizationResponse getNodeVisualization(String ExperimentId, String NodeId, String VisualizationId, GetNodeVisualizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeVisualizationWithOptions(ExperimentId, NodeId, VisualizationId, request, headers, runtime);
    }

    public GetNodeVisualizationResponse getNodeVisualizationWithOptions(String ExperimentId, String NodeId, String VisualizationId, GetNodeVisualizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetNodeVisualization", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/visualizations/" + VisualizationId + "", "json", req, runtime), new GetNodeVisualizationResponse());
    }

    public GetNodeOutputResponse getNodeOutput(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNodeOutputWithOptions(ExperimentId, NodeId, OutputId, request, headers, runtime);
    }

    public GetNodeOutputResponse getNodeOutputWithOptions(String ExperimentId, String NodeId, String OutputId, GetNodeOutputRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputIndex)) {
            query.put("OutputIndex", request.outputIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetNodeOutput", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/experiments/" + ExperimentId + "/nodes/" + NodeId + "/outputs/" + OutputId + "", "json", req, runtime), new GetNodeOutputResponse());
    }

    public RemoveImageLabelsResponse removeImageLabels(String ImageId, String LabelKey) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageLabelsWithOptions(ImageId, LabelKey, headers, runtime);
    }

    public RemoveImageLabelsResponse removeImageLabelsWithOptions(String ImageId, String LabelKey, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveImageLabels", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/images/" + ImageId + "/labels/" + LabelKey + "", "json", req, runtime), new RemoveImageLabelsResponse());
    }

    public PreviewMCTableResponse previewMCTable(String TableName, PreviewMCTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewMCTableWithOptions(TableName, request, headers, runtime);
    }

    public PreviewMCTableResponse previewMCTableWithOptions(String TableName, PreviewMCTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PreviewMCTable", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/datasources/maxcompute/tables/" + TableName + "/preview", "json", req, runtime), new PreviewMCTableResponse());
    }

    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListServices", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/services", "json", req, runtime), new ListServicesResponse());
    }

    public RemoveImageResponse removeImage(String ImageId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeImageWithOptions(ImageId, headers, runtime);
    }

    public RemoveImageResponse removeImageWithOptions(String ImageId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RemoveImage", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/images/" + ImageId + "", "json", req, runtime), new RemoveImageResponse());
    }

    public StopExperimentResponse stopExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public StopExperimentResponse stopExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopExperiment", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/experiments/" + ExperimentId + "/stop", "json", req, runtime), new StopExperimentResponse());
    }

    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageWithOptions(request, headers, runtime);
    }

    public AddImageResponse addImageWithOptions(AddImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUri)) {
            body.put("ImageUri", request.imageUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AddImage", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/images", "json", req, runtime), new AddImageResponse());
    }

    public SearchMCTablesResponse searchMCTables(SearchMCTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMCTablesWithOptions(request, headers, runtime);
    }

    public SearchMCTablesResponse searchMCTablesWithOptions(SearchMCTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SearchMCTables", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/datasources/maxcompute/tables", "json", req, runtime), new SearchMCTablesResponse());
    }

    public GetTemplateResponse getTemplate(String TemplateId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(TemplateId, headers, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(String TemplateId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetTemplate", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/templates/" + TemplateId + "", "json", req, runtime), new GetTemplateResponse());
    }

    public DeleteExperimentResponse deleteExperiment(String ExperimentId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(ExperimentId, headers, runtime);
    }

    public DeleteExperimentResponse deleteExperimentWithOptions(String ExperimentId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteExperiment", "2021-02-02", "HTTPS", "DELETE", "AK", "/api/v1/experiments/" + ExperimentId + "", "json", req, runtime), new DeleteExperimentResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.config))) {
            body.put("Config", request.config);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateService", "2021-02-02", "HTTPS", "POST", "AK", "/api/v1/services", "json", req, runtime), new CreateServiceResponse());
    }

    public UpdateExperimentFolderResponse updateExperimentFolder(String FolderId, UpdateExperimentFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentFolderWithOptions(FolderId, request, headers, runtime);
    }

    public UpdateExperimentFolderResponse updateExperimentFolderWithOptions(String FolderId, UpdateExperimentFolderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("UpdateExperimentFolder", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/experimentfolders/" + FolderId + "", "json", req, runtime), new UpdateExperimentFolderResponse());
    }

    public GetMCTableSchemaResponse getMCTableSchema(String TableName, GetMCTableSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMCTableSchemaWithOptions(TableName, request, headers, runtime);
    }

    public GetMCTableSchemaResponse getMCTableSchemaWithOptions(String TableName, GetMCTableSchemaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMCTableSchema", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/datasources/maxcompute/tables/" + TableName + "/schema", "json", req, runtime), new GetMCTableSchemaResponse());
    }

    public UpdateExperimentContentResponse updateExperimentContent(String ExperimentId, UpdateExperimentContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentContentWithOptions(ExperimentId, request, headers, runtime);
    }

    public UpdateExperimentContentResponse updateExperimentContentWithOptions(String ExperimentId, UpdateExperimentContentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.doROARequest("UpdateExperimentContent", "2021-02-02", "HTTPS", "PUT", "AK", "/api/v1/experiments/" + ExperimentId + "/content", "json", req, runtime), new UpdateExperimentContentResponse());
    }

    public GetAlgorithmDefResponse getAlgorithmDef(GetAlgorithmDefRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlgorithmDefWithOptions(request, headers, runtime);
    }

    public GetAlgorithmDefResponse getAlgorithmDefWithOptions(GetAlgorithmDefRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetAlgorithmDef", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/algorithm/def", "json", req, runtime), new GetAlgorithmDefResponse());
    }

    public GetImageResponse getImage(String ImageId, GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageWithOptions(ImageId, request, headers, runtime);
    }

    public GetImageResponse getImageWithOptions(String ImageId, GetImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetImage", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/images/" + ImageId + "", "json", req, runtime), new GetImageResponse());
    }

    public GetServiceResponse getService(String ServiceId, GetServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(ServiceId, request, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String ServiceId, GetServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetService", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/services/" + ServiceId + "", "json", req, runtime), new GetServiceResponse());
    }

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.experimentId)) {
            query.put("ExperimentId", request.experimentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
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
        return TeaModel.toModel(this.doROARequest("ListJobs", "2021-02-02", "HTTPS", "GET", "AK", "/api/v1/jobs", "json", req, runtime), new ListJobsResponse());
    }
}
