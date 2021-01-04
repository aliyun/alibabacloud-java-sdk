// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510;

import com.aliyun.tea.*;
import com.aliyun.quotas20200510.models.*;
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
        this._endpoint = this.getEndpoint("quotas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateQuotaAlarmResponse createQuotaAlarmWithOptions(CreateQuotaAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQuotaAlarm", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQuotaAlarmResponse());
    }

    public CreateQuotaAlarmResponse createQuotaAlarm(CreateQuotaAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQuotaAlarmWithOptions(request, runtime);
    }

    public CreateQuotaApplicationResponse createQuotaApplicationWithOptions(CreateQuotaApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQuotaApplication", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQuotaApplicationResponse());
    }

    public CreateQuotaApplicationResponse createQuotaApplication(CreateQuotaApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQuotaApplicationWithOptions(request, runtime);
    }

    public DeleteQuotaAlarmResponse deleteQuotaAlarmWithOptions(DeleteQuotaAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQuotaAlarm", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQuotaAlarmResponse());
    }

    public DeleteQuotaAlarmResponse deleteQuotaAlarm(DeleteQuotaAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQuotaAlarmWithOptions(request, runtime);
    }

    public GetProductQuotaResponse getProductQuotaWithOptions(GetProductQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProductQuota", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetProductQuotaResponse());
    }

    public GetProductQuotaResponse getProductQuota(GetProductQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProductQuotaWithOptions(request, runtime);
    }

    public GetProductQuotaDimensionResponse getProductQuotaDimensionWithOptions(GetProductQuotaDimensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProductQuotaDimension", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetProductQuotaDimensionResponse());
    }

    public GetProductQuotaDimensionResponse getProductQuotaDimension(GetProductQuotaDimensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProductQuotaDimensionWithOptions(request, runtime);
    }

    public GetQuotaAlarmResponse getQuotaAlarmWithOptions(GetQuotaAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQuotaAlarm", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetQuotaAlarmResponse());
    }

    public GetQuotaAlarmResponse getQuotaAlarm(GetQuotaAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQuotaAlarmWithOptions(request, runtime);
    }

    public GetQuotaApplicationResponse getQuotaApplicationWithOptions(GetQuotaApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQuotaApplication", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new GetQuotaApplicationResponse());
    }

    public GetQuotaApplicationResponse getQuotaApplication(GetQuotaApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQuotaApplicationWithOptions(request, runtime);
    }

    public ListAlarmHistoriesResponse listAlarmHistoriesWithOptions(ListAlarmHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmHistories", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListAlarmHistoriesResponse());
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    public ListDependentQuotasResponse listDependentQuotasWithOptions(ListDependentQuotasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDependentQuotas", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListDependentQuotasResponse());
    }

    public ListDependentQuotasResponse listDependentQuotas(ListDependentQuotasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDependentQuotasWithOptions(request, runtime);
    }

    public ListProductQuotaDimensionsResponse listProductQuotaDimensionsWithOptions(ListProductQuotaDimensionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProductQuotaDimensions", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListProductQuotaDimensionsResponse());
    }

    public ListProductQuotaDimensionsResponse listProductQuotaDimensions(ListProductQuotaDimensionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductQuotaDimensionsWithOptions(request, runtime);
    }

    public ListProductQuotasResponse listProductQuotasWithOptions(ListProductQuotasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProductQuotas", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListProductQuotasResponse());
    }

    public ListProductQuotasResponse listProductQuotas(ListProductQuotasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductQuotasWithOptions(request, runtime);
    }

    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProducts", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListProductsResponse());
    }

    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    public ListQuotaAlarmsResponse listQuotaAlarmsWithOptions(ListQuotaAlarmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQuotaAlarms", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListQuotaAlarmsResponse());
    }

    public ListQuotaAlarmsResponse listQuotaAlarms(ListQuotaAlarmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQuotaAlarmsWithOptions(request, runtime);
    }

    public ListQuotaApplicationsResponse listQuotaApplicationsWithOptions(ListQuotaApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQuotaApplications", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListQuotaApplicationsResponse());
    }

    public ListQuotaApplicationsResponse listQuotaApplications(ListQuotaApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQuotaApplicationsWithOptions(request, runtime);
    }

    public UpdateQuotaAlarmResponse updateQuotaAlarmWithOptions(UpdateQuotaAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateQuotaAlarm", "2020-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateQuotaAlarmResponse());
    }

    public UpdateQuotaAlarmResponse updateQuotaAlarm(UpdateQuotaAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateQuotaAlarmWithOptions(request, runtime);
    }
}
