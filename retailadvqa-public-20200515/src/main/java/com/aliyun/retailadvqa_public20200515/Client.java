// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515;

import com.aliyun.tea.*;
import com.aliyun.retailadvqa_public20200515.models.*;
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
        this._endpoint = this.getEndpoint("retailadvqa-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RecreateTableResponse recreateTableWithOptions(RecreateTableRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecreateTableShrinkRequest request = new RecreateTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableSchema)) {
            request.tableSchemaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableSchema, "TableSchema", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecreateTable", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecreateTableResponse());
    }

    public RecreateTableResponse recreateTable(RecreateTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recreateTableWithOptions(request, runtime);
    }

    public AudiencePushStatusResponse audiencePushStatusWithOptions(AudiencePushStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AudiencePushStatus", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AudiencePushStatusResponse());
    }

    public AudiencePushStatusResponse audiencePushStatus(AudiencePushStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.audiencePushStatusWithOptions(request, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataSource", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataSourceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    public QueryMediaResourcePackageResponse queryMediaResourcePackageWithOptions(QueryMediaResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaResourcePackage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaResourcePackageResponse());
    }

    public QueryMediaResourcePackageResponse queryMediaResourcePackage(QueryMediaResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaResourcePackageWithOptions(request, runtime);
    }

    public ListDatasetResponse listDatasetWithOptions(ListDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataset", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListDatasetResponse());
    }

    public ListDatasetResponse listDataset(ListDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasetWithOptions(request, runtime);
    }

    public SearchAudiencesResponse searchAudiencesWithOptions(SearchAudiencesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAudiences", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAudiencesResponse());
    }

    public SearchAudiencesResponse searchAudiences(SearchAudiencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAudiencesWithOptions(request, runtime);
    }

    public GetInstanceInstanceInstanceResponse getInstanceInstanceInstanceWithOptions(GetInstanceInstanceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceInstanceInstance", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceInstanceInstanceResponse());
    }

    public GetInstanceInstanceInstanceResponse getInstanceInstanceInstance(GetInstanceInstanceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceInstanceInstanceWithOptions(request, runtime);
    }

    public SaveExternalAudienceResponse saveExternalAudienceWithOptions(SaveExternalAudienceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveExternalAudience", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveExternalAudienceResponse());
    }

    public SaveExternalAudienceResponse saveExternalAudience(SaveExternalAudienceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveExternalAudienceWithOptions(request, runtime);
    }

    public SaveLabelDataSetResponse saveLabelDataSetWithOptions(SaveLabelDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveLabelDataSet", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveLabelDataSetResponse());
    }

    public SaveLabelDataSetResponse saveLabelDataSet(SaveLabelDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveLabelDataSetWithOptions(request, runtime);
    }

    public ListAccountResponse listAccountWithOptions(ListAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccount", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccountResponse());
    }

    public ListAccountResponse listAccount(ListAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountWithOptions(request, runtime);
    }

    public SearchAudienceResponse searchAudienceWithOptions(SearchAudienceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAudience", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAudienceResponse());
    }

    public SearchAudienceResponse searchAudience(SearchAudienceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAudienceWithOptions(request, runtime);
    }

    public LoadDataToLabelDataSetResponse loadDataToLabelDataSetWithOptions(LoadDataToLabelDataSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LoadDataToLabelDataSet", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new LoadDataToLabelDataSetResponse());
    }

    public LoadDataToLabelDataSetResponse loadDataToLabelDataSet(LoadDataToLabelDataSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.loadDataToLabelDataSetWithOptions(request, runtime);
    }

    public GetMediaResourcePackageResponse getMediaResourcePackageWithOptions(GetMediaResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaResourcePackage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaResourcePackageResponse());
    }

    public GetMediaResourcePackageResponse getMediaResourcePackage(GetMediaResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaResourcePackageWithOptions(request, runtime);
    }

    public CreateExportTaskResponse createExportTaskWithOptions(CreateExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExportTask", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExportTaskResponse());
    }

    public CreateExportTaskResponse createExportTask(CreateExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExportTaskWithOptions(request, runtime);
    }

    public CheckAudienceExportStatusResponse checkAudienceExportStatusWithOptions(CheckAudienceExportStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAudienceExportStatus", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new CheckAudienceExportStatusResponse());
    }

    public CheckAudienceExportStatusResponse checkAudienceExportStatus(CheckAudienceExportStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAudienceExportStatusWithOptions(request, runtime);
    }

    public ListWorkspaceResponse listWorkspaceWithOptions(ListWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWorkspace", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListWorkspaceResponse());
    }

    public ListWorkspaceResponse listWorkspace(ListWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkspaceWithOptions(request, runtime);
    }

    public ListTableResponse listTableWithOptions(ListTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTable", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTableResponse());
    }

    public ListTableResponse listTable(ListTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTableWithOptions(request, runtime);
    }

    public ListAudienceResponse listAudienceWithOptions(ListAudienceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAudience", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListAudienceResponse());
    }

    public ListAudienceResponse listAudience(ListAudienceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAudienceWithOptions(request, runtime);
    }

    public CheckResourcepackSlrResponse checkResourcepackSlrWithOptions(CheckResourcepackSlrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResourcepackSlr", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourcepackSlrResponse());
    }

    public CheckResourcepackSlrResponse checkResourcepackSlr(CheckResourcepackSlrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourcepackSlrWithOptions(request, runtime);
    }

    public AudienceMemberQueryResponse audienceMemberQueryWithOptions(AudienceMemberQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AudienceMemberQuery", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AudienceMemberQueryResponse());
    }

    public AudienceMemberQueryResponse audienceMemberQuery(AudienceMemberQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.audienceMemberQueryWithOptions(request, runtime);
    }

    public ConsumeMediaResourcePackageResponse consumeMediaResourcePackageWithOptions(ConsumeMediaResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConsumeMediaResourcePackage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ConsumeMediaResourcePackageResponse());
    }

    public ConsumeMediaResourcePackageResponse consumeMediaResourcePackage(ConsumeMediaResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.consumeMediaResourcePackageWithOptions(request, runtime);
    }

    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatasetShrinkRequest request = new CreateDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSet)) {
            request.dataSetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSet, "DataSet", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataset", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDatasetResponse());
    }

    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    public ListMenuResponse listMenuWithOptions(ListMenuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMenu", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListMenuResponse());
    }

    public ListMenuResponse listMenu(ListMenuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMenuWithOptions(request, runtime);
    }

    public GetInstanceInstanceResponse getInstanceInstanceWithOptions(GetInstanceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceInstance", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceInstanceResponse());
    }

    public GetInstanceInstanceResponse getInstanceInstance(GetInstanceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceInstanceWithOptions(request, runtime);
    }

    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDataset", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDatasetResponse());
    }

    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    public LoadDataToExternalAudienceResponse loadDataToExternalAudienceWithOptions(LoadDataToExternalAudienceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LoadDataToExternalAudience", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new LoadDataToExternalAudienceResponse());
    }

    public LoadDataToExternalAudienceResponse loadDataToExternalAudience(LoadDataToExternalAudienceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.loadDataToExternalAudienceWithOptions(request, runtime);
    }
}
