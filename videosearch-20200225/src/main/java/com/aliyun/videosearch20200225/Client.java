// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225;

import com.aliyun.tea.*;
import com.aliyun.videosearch20200225.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "multisearch.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "multisearch.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("videosearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetStorageHistoryResponse getStorageHistoryWithOptions(GetStorageHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStorageHistory", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new GetStorageHistoryResponse());
    }

    public GetStorageHistoryResponse getStorageHistory(GetStorageHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageHistoryWithOptions(request, runtime);
    }

    public AddStorageVideoTaskResponse addStorageVideoTaskWithOptions(AddStorageVideoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddStorageVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddStorageVideoTaskResponse());
    }

    public AddStorageVideoTaskResponse addStorageVideoTask(AddStorageVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addStorageVideoTaskWithOptions(request, runtime);
    }

    public AddDeletionVideoTaskResponse addDeletionVideoTaskWithOptions(AddDeletionVideoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDeletionVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddDeletionVideoTaskResponse());
    }

    public AddDeletionVideoTaskResponse addDeletionVideoTask(AddDeletionVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeletionVideoTaskWithOptions(request, runtime);
    }

    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTaskStatus", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new GetTaskStatusResponse());
    }

    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    public AddSearchVideoTaskResponse addSearchVideoTaskWithOptions(AddSearchVideoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSearchVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddSearchVideoTaskResponse());
    }

    public AddSearchVideoTaskResponse addSearchVideoTask(AddSearchVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSearchVideoTaskWithOptions(request, runtime);
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
}
