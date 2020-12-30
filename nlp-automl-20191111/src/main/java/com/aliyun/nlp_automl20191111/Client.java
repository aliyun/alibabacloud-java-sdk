// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111;

import com.aliyun.tea.*;
import com.aliyun.nlp_automl20191111.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nlp-automl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAsyncPredictResponse createAsyncPredictWithOptions(CreateAsyncPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAsyncPredict", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAsyncPredictResponse());
    }

    public CreateAsyncPredictResponse createAsyncPredict(CreateAsyncPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAsyncPredictWithOptions(request, runtime);
    }

    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataset", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatasetResponse());
    }

    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    public CreateDatasetRecordResponse createDatasetRecordWithOptions(CreateDatasetRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDatasetRecord", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatasetRecordResponse());
    }

    public CreateDatasetRecordResponse createDatasetRecord(CreateDatasetRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatasetRecordWithOptions(request, runtime);
    }

    public CreateModelResponse createModelWithOptions(CreateModelRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateModelShrinkRequest request = new CreateModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.datasetIdList)) {
            request.datasetIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.datasetIdList, "DatasetIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.testDatasetIdList)) {
            request.testDatasetIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.testDatasetIdList, "TestDatasetIdList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateModel", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateModelResponse());
    }

    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteModel", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteModelResponse());
    }

    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    public DeployModelResponse deployModelWithOptions(DeployModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeployModel", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeployModelResponse());
    }

    public DeployModelResponse deployModel(DeployModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployModelWithOptions(request, runtime);
    }

    public GetAsyncPredictResponse getAsyncPredictWithOptions(GetAsyncPredictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAsyncPredict", "2019-11-11", "HTTPS", "GET", "AK", "json", req, runtime), new GetAsyncPredictResponse());
    }

    public GetAsyncPredictResponse getAsyncPredict(GetAsyncPredictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAsyncPredictWithOptions(request, runtime);
    }

    public GetModelResponse getModelWithOptions(GetModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetModel", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetModelResponse());
    }

    public GetModelResponse getModel(GetModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelWithOptions(request, runtime);
    }

    public GetPredictResultResponse getPredictResultWithOptions(GetPredictResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPredictResult", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetPredictResultResponse());
    }

    public GetPredictResultResponse getPredictResult(GetPredictResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPredictResultWithOptions(request, runtime);
    }

    public ListDatasetResponse listDatasetWithOptions(ListDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataset", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListDatasetResponse());
    }

    public ListDatasetResponse listDataset(ListDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasetWithOptions(request, runtime);
    }

    public ListModelsResponse listModelsWithOptions(ListModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListModels", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListModelsResponse());
    }

    public ListModelsResponse listModels(ListModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModelsWithOptions(request, runtime);
    }

    public RunContactReviewResponse runContactReviewWithOptions(RunContactReviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunContactReview", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new RunContactReviewResponse());
    }

    public RunContactReviewResponse runContactReview(RunContactReviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runContactReviewWithOptions(request, runtime);
    }

    public RunPreTrainServiceResponse runPreTrainServiceWithOptions(RunPreTrainServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunPreTrainService", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new RunPreTrainServiceResponse());
    }

    public RunPreTrainServiceResponse runPreTrainService(RunPreTrainServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runPreTrainServiceWithOptions(request, runtime);
    }

    public RunSmartCallServiceResponse runSmartCallServiceWithOptions(RunSmartCallServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunSmartCallService", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new RunSmartCallServiceResponse());
    }

    public RunSmartCallServiceResponse runSmartCallService(RunSmartCallServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runSmartCallServiceWithOptions(request, runtime);
    }
}
