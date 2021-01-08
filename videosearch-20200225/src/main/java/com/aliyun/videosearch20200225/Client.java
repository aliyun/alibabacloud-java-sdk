// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225;

import com.aliyun.tea.*;
import com.aliyun.videosearch20200225.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "multisearch.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "multisearch.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("videosearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public CreateBatchTaskResponse createBatchTaskWithOptions(CreateBatchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBatchTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateBatchTaskResponse());
    }

    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBatchTaskWithOptions(request, runtime);
    }

    public GetStorageHistoryResponse getStorageHistoryWithOptions(GetStorageHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStorageHistory", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new GetStorageHistoryResponse());
    }

    public GetStorageHistoryResponse getStorageHistory(GetStorageHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStorageHistoryWithOptions(request, runtime);
    }

    public ListBatchTaskResponse listBatchTaskWithOptions(ListBatchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBatchTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new ListBatchTaskResponse());
    }

    public ListBatchTaskResponse listBatchTask(ListBatchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBatchTaskWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListInstances", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListStorageVideoTasksResponse listStorageVideoTasksWithOptions(ListStorageVideoTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStorageVideoTasks", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new ListStorageVideoTasksResponse());
    }

    public ListStorageVideoTasksResponse listStorageVideoTasks(ListStorageVideoTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStorageVideoTasksWithOptions(request, runtime);
    }

    public ListSearchVideoTasksResponse listSearchVideoTasksWithOptions(ListSearchVideoTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSearchVideoTasks", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new ListSearchVideoTasksResponse());
    }

    public ListSearchVideoTasksResponse listSearchVideoTasks(ListSearchVideoTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSearchVideoTasksWithOptions(request, runtime);
    }

    public AddStorageVideoTaskResponse addStorageVideoTaskWithOptions(AddStorageVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddStorageVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddStorageVideoTaskResponse());
    }

    public AddStorageVideoTaskResponse addStorageVideoTask(AddStorageVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addStorageVideoTaskWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstance", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public AddDeletionVideoTaskResponse addDeletionVideoTaskWithOptions(AddDeletionVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDeletionVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddDeletionVideoTaskResponse());
    }

    public AddDeletionVideoTaskResponse addDeletionVideoTask(AddDeletionVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeletionVideoTaskWithOptions(request, runtime);
    }

    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTaskStatus", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new GetTaskStatusResponse());
    }

    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    public AddSearchVideoTaskResponse addSearchVideoTaskWithOptions(AddSearchVideoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSearchVideoTask", "HTTPS", "POST", "2020-02-25", "AK", null, TeaModel.buildMap(request), runtime), new AddSearchVideoTaskResponse());
    }

    public AddSearchVideoTaskResponse addSearchVideoTask(AddSearchVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
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
