// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930;

import com.aliyun.tea.*;
import com.aliyun.viapi20210930.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("viapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetAiStoreUserTaskResponse getAiStoreUserTaskWithOptions(GetAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAiStoreUserTaskResponse());
    }

    public GetAiStoreUserTaskResponse getAiStoreUserTask(GetAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAiStoreUserTaskWithOptions(request, runtime);
    }

    public QueryAiStoreUserTaskPageResponse queryAiStoreUserTaskPageWithOptions(QueryAiStoreUserTaskPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAiStoreUserTaskPage", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAiStoreUserTaskPageResponse());
    }

    public QueryAiStoreUserTaskPageResponse queryAiStoreUserTaskPage(QueryAiStoreUserTaskPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiStoreUserTaskPageWithOptions(request, runtime);
    }

    public QueryAiStoreRegionsResponse queryAiStoreRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryAiStoreRegions", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAiStoreRegionsResponse());
    }

    public QueryAiStoreRegionsResponse queryAiStoreRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiStoreRegionsWithOptions(runtime);
    }

    public ListAiStoreBucketsResponse listAiStoreBucketsWithOptions(ListAiStoreBucketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAiStoreBuckets", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListAiStoreBucketsResponse());
    }

    public ListAiStoreBucketsResponse listAiStoreBuckets(ListAiStoreBucketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAiStoreBucketsWithOptions(request, runtime);
    }

    public GetAiStoreUserTaskByNameResponse getAiStoreUserTaskByNameWithOptions(GetAiStoreUserTaskByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAiStoreUserTaskByName", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAiStoreUserTaskByNameResponse());
    }

    public GetAiStoreUserTaskByNameResponse getAiStoreUserTaskByName(GetAiStoreUserTaskByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAiStoreUserTaskByNameWithOptions(request, runtime);
    }

    public UpdateAiStoreUserTaskResponse updateAiStoreUserTaskWithOptions(UpdateAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAiStoreUserTaskResponse());
    }

    public UpdateAiStoreUserTaskResponse updateAiStoreUserTask(UpdateAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAiStoreUserTaskWithOptions(request, runtime);
    }

    public DisableAiStoreUserTaskResponse disableAiStoreUserTaskWithOptions(DisableAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DisableAiStoreUserTaskResponse());
    }

    public DisableAiStoreUserTaskResponse disableAiStoreUserTask(DisableAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAiStoreUserTaskWithOptions(request, runtime);
    }

    public QueryAiStoreApiTreeResponse queryAiStoreApiTreeWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryAiStoreApiTree", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAiStoreApiTreeResponse());
    }

    public QueryAiStoreApiTreeResponse queryAiStoreApiTree() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiStoreApiTreeWithOptions(runtime);
    }

    public DeleteAiStoreUserTaskResponse deleteAiStoreUserTaskWithOptions(DeleteAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAiStoreUserTaskResponse());
    }

    public DeleteAiStoreUserTaskResponse deleteAiStoreUserTask(DeleteAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAiStoreUserTaskWithOptions(request, runtime);
    }

    public CreateAiStoreUserTaskResponse createAiStoreUserTaskWithOptions(CreateAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAiStoreUserTaskResponse());
    }

    public CreateAiStoreUserTaskResponse createAiStoreUserTask(CreateAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAiStoreUserTaskWithOptions(request, runtime);
    }

    public CreateAiStoreReceiveConfigResponse createAiStoreReceiveConfigWithOptions(CreateAiStoreReceiveConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAiStoreReceiveConfig", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAiStoreReceiveConfigResponse());
    }

    public CreateAiStoreReceiveConfigResponse createAiStoreReceiveConfig(CreateAiStoreReceiveConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAiStoreReceiveConfigWithOptions(request, runtime);
    }

    public GetAiStoreReceiveConfigResponse getAiStoreReceiveConfigWithOptions(GetAiStoreReceiveConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAiStoreReceiveConfig", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAiStoreReceiveConfigResponse());
    }

    public GetAiStoreReceiveConfigResponse getAiStoreReceiveConfig(GetAiStoreReceiveConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAiStoreReceiveConfigWithOptions(request, runtime);
    }

    public EnableAiStoreUserTaskResponse enableAiStoreUserTaskWithOptions(EnableAiStoreUserTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableAiStoreUserTask", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new EnableAiStoreUserTaskResponse());
    }

    public EnableAiStoreUserTaskResponse enableAiStoreUserTask(EnableAiStoreUserTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAiStoreUserTaskWithOptions(request, runtime);
    }

    public CreateAiStoreBucketResponse createAiStoreBucketWithOptions(CreateAiStoreBucketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAiStoreBucket", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAiStoreBucketResponse());
    }

    public CreateAiStoreBucketResponse createAiStoreBucket(CreateAiStoreBucketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAiStoreBucketWithOptions(request, runtime);
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeletingWithOptions(CheckServiceLinkedRoleForDeletingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceLinkedRoleForDeleting", "2021-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceLinkedRoleForDeletingResponse());
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceLinkedRoleForDeletingWithOptions(request, runtime);
    }
}
