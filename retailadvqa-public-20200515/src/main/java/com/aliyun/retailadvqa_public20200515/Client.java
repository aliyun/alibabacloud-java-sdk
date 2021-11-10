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

    public ActivityInfoQueryResponse activityInfoQueryWithOptions(ActivityInfoQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivityInfoQuery", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ActivityInfoQueryResponse());
    }

    public ActivityInfoQueryResponse activityInfoQuery(ActivityInfoQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activityInfoQueryWithOptions(request, runtime);
    }

    public AddTemplateResponse addTemplateWithOptions(AddTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTemplate", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddTemplateResponse());
    }

    public AddTemplateResponse addTemplate(AddTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTemplateWithOptions(request, runtime);
    }

    public AudienceDetailByIdResponse audienceDetailByIdWithOptions(AudienceDetailByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AudienceDetailById", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AudienceDetailByIdResponse());
    }

    public AudienceDetailByIdResponse audienceDetailById(AudienceDetailByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.audienceDetailByIdWithOptions(request, runtime);
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

    public CheckMarketingAudienceExportStatusResponse checkMarketingAudienceExportStatusWithOptions(CheckMarketingAudienceExportStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckMarketingAudienceExportStatus", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckMarketingAudienceExportStatusResponse());
    }

    public CheckMarketingAudienceExportStatusResponse checkMarketingAudienceExportStatus(CheckMarketingAudienceExportStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMarketingAudienceExportStatusWithOptions(request, runtime);
    }

    public CheckPermissionResponse checkPermissionWithOptions(CheckPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckPermission", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckPermissionResponse());
    }

    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkPermissionWithOptions(request, runtime);
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

    public CheckSmsReceiptExportStatusResponse checkSmsReceiptExportStatusWithOptions(CheckSmsReceiptExportStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckSmsReceiptExportStatus", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckSmsReceiptExportStatusResponse());
    }

    public CheckSmsReceiptExportStatusResponse checkSmsReceiptExportStatus(CheckSmsReceiptExportStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSmsReceiptExportStatusWithOptions(request, runtime);
    }

    public CheckUmengInnerOuterCompleteResponse checkUmengInnerOuterCompleteWithOptions(CheckUmengInnerOuterCompleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckUmengInnerOuterComplete", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckUmengInnerOuterCompleteResponse());
    }

    public CheckUmengInnerOuterCompleteResponse checkUmengInnerOuterComplete(CheckUmengInnerOuterCompleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUmengInnerOuterCompleteWithOptions(request, runtime);
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

    public ConsumeResPacksResponse consumeResPacksWithOptions(ConsumeResPacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConsumeResPacks", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ConsumeResPacksResponse());
    }

    public ConsumeResPacksResponse consumeResPacks(ConsumeResPacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.consumeResPacksWithOptions(request, runtime);
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

    public CreateDefaultEventResponse createDefaultEventWithOptions(CreateDefaultEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDefaultEvent", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDefaultEventResponse());
    }

    public CreateDefaultEventResponse createDefaultEvent(CreateDefaultEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDefaultEventWithOptions(request, runtime);
    }

    public CreateDefaultEventSourceResponse createDefaultEventSourceWithOptions(CreateDefaultEventSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDefaultEventSource", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDefaultEventSourceResponse());
    }

    public CreateDefaultEventSourceResponse createDefaultEventSource(CreateDefaultEventSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDefaultEventSourceWithOptions(request, runtime);
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

    public DeleteTemplatesResponse deleteTemplatesWithOptions(DeleteTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplates", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplatesResponse());
    }

    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplatesWithOptions(request, runtime);
    }

    public DetailDigitalTemplateResponse detailDigitalTemplateWithOptions(DetailDigitalTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DetailDigitalTemplate", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new DetailDigitalTemplateResponse());
    }

    public DetailDigitalTemplateResponse detailDigitalTemplate(DetailDigitalTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detailDigitalTemplateWithOptions(request, runtime);
    }

    public DetailTemplateResponse detailTemplateWithOptions(DetailTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DetailTemplate", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new DetailTemplateResponse());
    }

    public DetailTemplateResponse detailTemplate(DetailTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detailTemplateWithOptions(request, runtime);
    }

    public ExportMarketingAudienceToOSSResponse exportMarketingAudienceToOSSWithOptions(ExportMarketingAudienceToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportMarketingAudienceToOSS", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ExportMarketingAudienceToOSSResponse());
    }

    public ExportMarketingAudienceToOSSResponse exportMarketingAudienceToOSS(ExportMarketingAudienceToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportMarketingAudienceToOSSWithOptions(request, runtime);
    }

    public ExportSmsReceiptToOSSResponse exportSmsReceiptToOSSWithOptions(ExportSmsReceiptToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportSmsReceiptToOSS", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ExportSmsReceiptToOSSResponse());
    }

    public ExportSmsReceiptToOSSResponse exportSmsReceiptToOSS(ExportSmsReceiptToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportSmsReceiptToOSSWithOptions(request, runtime);
    }

    public GetAudienceMarketingInfoResponse getAudienceMarketingInfoWithOptions(GetAudienceMarketingInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAudienceMarketingInfo", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetAudienceMarketingInfoResponse());
    }

    public GetAudienceMarketingInfoResponse getAudienceMarketingInfo(GetAudienceMarketingInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAudienceMarketingInfoWithOptions(request, runtime);
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

    public GetResPacksResponse getResPacksWithOptions(GetResPacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResPacks", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetResPacksResponse());
    }

    public GetResPacksResponse getResPacks(GetResPacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResPacksWithOptions(request, runtime);
    }

    public GetTokenPayLoadByCheckResponse getTokenPayLoadByCheckWithOptions(GetTokenPayLoadByCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTokenPayLoadByCheck", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTokenPayLoadByCheckResponse());
    }

    public GetTokenPayLoadByCheckResponse getTokenPayLoadByCheck(GetTokenPayLoadByCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenPayLoadByCheckWithOptions(request, runtime);
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

    public ListDigitalTemplatesResponse listDigitalTemplatesWithOptions(ListDigitalTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDigitalTemplates", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListDigitalTemplatesResponse());
    }

    public ListDigitalTemplatesResponse listDigitalTemplates(ListDigitalTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDigitalTemplatesWithOptions(request, runtime);
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

    public ListSignsResponse listSignsWithOptions(ListSignsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSigns", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListSignsResponse());
    }

    public ListSignsResponse listSigns(ListSignsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSignsWithOptions(request, runtime);
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

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplates", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
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

    public MarketTaskInfoQueryResponse marketTaskInfoQueryWithOptions(MarketTaskInfoQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MarketTaskInfoQuery", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new MarketTaskInfoQueryResponse());
    }

    public MarketTaskInfoQueryResponse marketTaskInfoQuery(MarketTaskInfoQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.marketTaskInfoQueryWithOptions(request, runtime);
    }

    public NewListMenuResponse newListMenuWithOptions(NewListMenuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NewListMenu", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new NewListMenuResponse());
    }

    public NewListMenuResponse newListMenu(NewListMenuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newListMenuWithOptions(request, runtime);
    }

    public OemListMenuResponse oemListMenuWithOptions(OemListMenuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OemListMenu", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new OemListMenuResponse());
    }

    public OemListMenuResponse oemListMenu(OemListMenuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.oemListMenuWithOptions(request, runtime);
    }

    public ParamListResponse paramListWithOptions(ParamListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ParamList", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new ParamListResponse());
    }

    public ParamListResponse paramList(ParamListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.paramListWithOptions(request, runtime);
    }

    public QueryFunctionModuleResponse queryFunctionModuleWithOptions(QueryFunctionModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFunctionModule", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFunctionModuleResponse());
    }

    public QueryFunctionModuleResponse queryFunctionModule(QueryFunctionModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFunctionModuleWithOptions(request, runtime);
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

    public RecieveEventMessageResponse recieveEventMessageWithOptions(RecieveEventMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecieveEventMessage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecieveEventMessageResponse());
    }

    public RecieveEventMessageResponse recieveEventMessage(RecieveEventMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recieveEventMessageWithOptions(request, runtime);
    }

    public RecieveUserMessageResponse recieveUserMessageWithOptions(RecieveUserMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecieveUserMessage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecieveUserMessageResponse());
    }

    public RecieveUserMessageResponse recieveUserMessage(RecieveUserMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recieveUserMessageWithOptions(request, runtime);
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

    public SaveExternalDirectoryResponse saveExternalDirectoryWithOptions(SaveExternalDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveExternalDirectory", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveExternalDirectoryResponse());
    }

    public SaveExternalDirectoryResponse saveExternalDirectory(SaveExternalDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveExternalDirectoryWithOptions(request, runtime);
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

    public SearchDirectoriesResponse searchDirectoriesWithOptions(SearchDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchDirectories", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchDirectoriesResponse());
    }

    public SearchDirectoriesResponse searchDirectories(SearchDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchDirectoriesWithOptions(request, runtime);
    }

    public SendDigitalSmsResponse sendDigitalSmsWithOptions(SendDigitalSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SendDigitalSms", "2020-05-15", "HTTPS", "GET", "AK", "json", req, runtime), new SendDigitalSmsResponse());
    }

    public SendDigitalSmsResponse sendDigitalSms(SendDigitalSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendDigitalSmsWithOptions(request, runtime);
    }

    public SendSmsResponse sendSmsWithOptions(SendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendSms", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SendSmsResponse());
    }

    public SendSmsResponse sendSms(SendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendSmsWithOptions(request, runtime);
    }

    public SmsShortUrlTaskQueryResponse smsShortUrlTaskQueryWithOptions(SmsShortUrlTaskQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SmsShortUrlTaskQuery", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SmsShortUrlTaskQueryResponse());
    }

    public SmsShortUrlTaskQueryResponse smsShortUrlTaskQuery(SmsShortUrlTaskQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smsShortUrlTaskQueryWithOptions(request, runtime);
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

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public UserConfigQueryResponse userConfigQueryWithOptions(UserConfigQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UserConfigQuery", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UserConfigQueryResponse());
    }

    public UserConfigQueryResponse userConfigQuery(UserConfigQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.userConfigQueryWithOptions(request, runtime);
    }

    public WorkSaveAudienceResponse workSaveAudienceWithOptions(WorkSaveAudienceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WorkSaveAudience", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new WorkSaveAudienceResponse());
    }

    public WorkSaveAudienceResponse workSaveAudience(WorkSaveAudienceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.workSaveAudienceWithOptions(request, runtime);
    }
}
