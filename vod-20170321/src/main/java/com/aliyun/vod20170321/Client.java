// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321;

import com.aliyun.tea.*;
import com.aliyun.vod20170321.models.*;
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
            new TeaPair("ap-northeast-2-pop", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-chengdu", "vod.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vod.aliyuncs.com"),
            new TeaPair("cn-fujian", "vod.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vod.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "vod.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.aliyuncs.com"),
            new TeaPair("us-west-1", "vod.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vod", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAITemplateResponse addAITemplateWithOptions(AddAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddAITemplateResponse());
    }

    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCategory", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddCategoryResponse());
    }

    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public AddEditingProjectResponse addEditingProjectWithOptions(AddEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEditingProject", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddEditingProjectResponse());
    }

    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroupWithOptions(AddTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddTranscodeTemplateGroupResponse());
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public AddVodDomainResponse addVodDomainWithOptions(AddVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVodDomain", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddVodDomainResponse());
    }

    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    public AddVodTemplateResponse addVodTemplateWithOptions(AddVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVodTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddVodTemplateResponse());
    }

    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    public AddWatermarkResponse addWatermarkWithOptions(AddWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddWatermarkResponse());
    }

    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentityWithOptions(AttachAppPolicyToIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachAppPolicyToIdentity", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new AttachAppPolicyToIdentityResponse());
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachAppPolicyToIdentityWithOptions(request, runtime);
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigsWithOptions(BatchSetVodDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetVodDomainConfigs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetVodDomainConfigsResponse());
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetVodDomainConfigsWithOptions(request, runtime);
    }

    public BatchStartVodDomainResponse batchStartVodDomainWithOptions(BatchStartVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStartVodDomain", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStartVodDomainResponse());
    }

    public BatchStartVodDomainResponse batchStartVodDomain(BatchStartVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartVodDomainWithOptions(request, runtime);
    }

    public BatchStopVodDomainResponse batchStopVodDomainWithOptions(BatchStopVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopVodDomain", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopVodDomainResponse());
    }

    public BatchStopVodDomainResponse batchStopVodDomain(BatchStopVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopVodDomainWithOptions(request, runtime);
    }

    public CancelUrlUploadJobsResponse cancelUrlUploadJobsWithOptions(CancelUrlUploadJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelUrlUploadJobs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CancelUrlUploadJobsResponse());
    }

    public CancelUrlUploadJobsResponse cancelUrlUploadJobs(CancelUrlUploadJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelUrlUploadJobsWithOptions(request, runtime);
    }

    public CreateAppInfoResponse createAppInfoWithOptions(CreateAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAppInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppInfoResponse());
    }

    public CreateAppInfoResponse createAppInfo(CreateAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppInfoWithOptions(request, runtime);
    }

    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAudit", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAuditResponse());
    }

    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    public CreateDetectionTemplateResponse createDetectionTemplateWithOptions(CreateDetectionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDetectionTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDetectionTemplateResponse());
    }

    public CreateDetectionTemplateResponse createDetectionTemplate(CreateDetectionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDetectionTemplateWithOptions(request, runtime);
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUploadAttachedMedia", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUploadAttachedMediaResponse());
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    public CreateUploadImageResponse createUploadImageWithOptions(CreateUploadImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUploadImage", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUploadImageResponse());
    }

    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    public CreateUploadVideoResponse createUploadVideoWithOptions(CreateUploadVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUploadVideo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUploadVideoResponse());
    }

    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    public CreateVodRealTimeLogDeliveryResponse createVodRealTimeLogDeliveryWithOptions(CreateVodRealTimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVodRealTimeLogDelivery", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new CreateVodRealTimeLogDeliveryResponse());
    }

    public CreateVodRealTimeLogDeliveryResponse createVodRealTimeLogDelivery(CreateVodRealTimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVodRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteAIImageInfosResponse deleteAIImageInfosWithOptions(DeleteAIImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAIImageInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAIImageInfosResponse());
    }

    public DeleteAIImageInfosResponse deleteAIImageInfos(DeleteAIImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAIImageInfosWithOptions(request, runtime);
    }

    public DeleteAITemplateResponse deleteAITemplateWithOptions(DeleteAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAITemplateResponse());
    }

    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    public DeleteAppInfoResponse deleteAppInfoWithOptions(DeleteAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAppInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppInfoResponse());
    }

    public DeleteAppInfoResponse deleteAppInfo(DeleteAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppInfoWithOptions(request, runtime);
    }

    public DeleteAttachedMediaResponse deleteAttachedMediaWithOptions(DeleteAttachedMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAttachedMedia", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAttachedMediaResponse());
    }

    public DeleteAttachedMediaResponse deleteAttachedMedia(DeleteAttachedMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAttachedMediaWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCategory", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public DeleteDetectionTemplateResponse deleteDetectionTemplateWithOptions(DeleteDetectionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDetectionTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDetectionTemplateResponse());
    }

    public DeleteDetectionTemplateResponse deleteDetectionTemplate(DeleteDetectionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDetectionTemplateWithOptions(request, runtime);
    }

    public DeleteDynamicImageResponse deleteDynamicImageWithOptions(DeleteDynamicImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDynamicImage", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDynamicImageResponse());
    }

    public DeleteDynamicImageResponse deleteDynamicImage(DeleteDynamicImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDynamicImageWithOptions(request, runtime);
    }

    public DeleteEditingProjectResponse deleteEditingProjectWithOptions(DeleteEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEditingProject", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEditingProjectResponse());
    }

    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImage", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteMessageCallbackResponse deleteMessageCallbackWithOptions(DeleteMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMessageCallback", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMessageCallbackResponse());
    }

    public DeleteMessageCallbackResponse deleteMessageCallback(DeleteMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMessageCallbackWithOptions(request, runtime);
    }

    public DeleteMezzaninesResponse deleteMezzaninesWithOptions(DeleteMezzaninesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMezzanines", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMezzaninesResponse());
    }

    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    public DeleteMultipartUploadResponse deleteMultipartUploadWithOptions(DeleteMultipartUploadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMultipartUpload", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMultipartUploadResponse());
    }

    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    public DeleteStreamResponse deleteStreamWithOptions(DeleteStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStream", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStreamResponse());
    }

    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroupWithOptions(DeleteTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTranscodeTemplateGroupResponse());
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVideo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public DeleteVodDomainResponse deleteVodDomainWithOptions(DeleteVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVodDomain", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVodDomainResponse());
    }

    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    public DeleteVodRealtimeLogDeliveryResponse deleteVodRealtimeLogDeliveryWithOptions(DeleteVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVodRealtimeLogDelivery", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteVodRealtimeLogDeliveryResponse());
    }

    public DeleteVodRealtimeLogDeliveryResponse deleteVodRealtimeLogDelivery(DeleteVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfigWithOptions(DeleteVodSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVodSpecificConfig", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVodSpecificConfigResponse());
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodSpecificConfigWithOptions(request, runtime);
    }

    public DeleteVodTemplateResponse deleteVodTemplateWithOptions(DeleteVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVodTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVodTemplateResponse());
    }

    public DeleteVodTemplateResponse deleteVodTemplate(DeleteVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWatermarkResponse());
    }

    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    public DescribePlayTopVideosResponse describePlayTopVideosWithOptions(DescribePlayTopVideosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePlayTopVideos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePlayTopVideosResponse());
    }

    public DescribePlayTopVideosResponse describePlayTopVideos(DescribePlayTopVideosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayTopVideosWithOptions(request, runtime);
    }

    public DescribePlayUserAvgResponse describePlayUserAvgWithOptions(DescribePlayUserAvgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePlayUserAvg", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePlayUserAvgResponse());
    }

    public DescribePlayUserAvgResponse describePlayUserAvg(DescribePlayUserAvgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayUserAvgWithOptions(request, runtime);
    }

    public DescribePlayUserTotalResponse describePlayUserTotalWithOptions(DescribePlayUserTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePlayUserTotal", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePlayUserTotalResponse());
    }

    public DescribePlayUserTotalResponse describePlayUserTotal(DescribePlayUserTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayUserTotalWithOptions(request, runtime);
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePlayVideoStatis", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePlayVideoStatisResponse());
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    public DescribeVodAIDataResponse describeVodAIDataWithOptions(DescribeVodAIDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodAIData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodAIDataResponse());
    }

    public DescribeVodAIDataResponse describeVodAIData(DescribeVodAIDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodAIDataWithOptions(request, runtime);
    }

    public DescribeVodCertificateListResponse describeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodCertificateList", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodCertificateListResponse());
    }

    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainBpsData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainBpsDataResponse());
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainCertificateInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainCertificateInfoResponse());
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainConfigs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainConfigsResponse());
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainDetail", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainDetailResponse());
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    public DescribeVodDomainLogResponse describeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainLog", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainLogResponse());
    }

    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse describeVodDomainRealtimeLogDeliveryWithOptions(DescribeVodDomainRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainRealtimeLogDelivery", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeVodDomainRealtimeLogDeliveryResponse());
    }

    public DescribeVodDomainRealtimeLogDeliveryResponse describeVodDomainRealtimeLogDelivery(DescribeVodDomainRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainTrafficData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainTrafficDataResponse());
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodDomainUsageData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodDomainUsageDataResponse());
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodRefreshQuota", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodRefreshQuotaResponse());
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodRefreshTasks", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodRefreshTasksResponse());
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    public DescribeVodStorageDataResponse describeVodStorageDataWithOptions(DescribeVodStorageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodStorageData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodStorageDataResponse());
    }

    public DescribeVodStorageDataResponse describeVodStorageData(DescribeVodStorageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodStorageDataWithOptions(request, runtime);
    }

    public DescribeVodTagResourcesResponse describeVodTagResourcesWithOptions(DescribeVodTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodTagResources", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodTagResourcesResponse());
    }

    public DescribeVodTagResourcesResponse describeVodTagResources(DescribeVodTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodTagResourcesWithOptions(request, runtime);
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeDataWithOptions(DescribeVodTranscodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodTranscodeData", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodTranscodeDataResponse());
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeData(DescribeVodTranscodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodTranscodeDataWithOptions(request, runtime);
    }

    public DescribeVodUserDomainsResponse describeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodUserDomains", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodUserDomainsResponse());
    }

    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    public DescribeVodUserTagsResponse describeVodUserTagsWithOptions(DescribeVodUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodUserTags", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodUserTagsResponse());
    }

    public DescribeVodUserTagsResponse describeVodUserTags(DescribeVodUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodUserTagsWithOptions(request, runtime);
    }

    public DescribeVodVerifyContentResponse describeVodVerifyContentWithOptions(DescribeVodVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodVerifyContent", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodVerifyContentResponse());
    }

    public DescribeVodVerifyContentResponse describeVodVerifyContent(DescribeVodVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodVerifyContentWithOptions(request, runtime);
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentityWithOptions(DetachAppPolicyFromIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachAppPolicyFromIdentity", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new DetachAppPolicyFromIdentityResponse());
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachAppPolicyFromIdentityWithOptions(request, runtime);
    }

    public DisableVodRealtimeLogDeliveryResponse disableVodRealtimeLogDeliveryWithOptions(DisableVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableVodRealtimeLogDelivery", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new DisableVodRealtimeLogDeliveryResponse());
    }

    public DisableVodRealtimeLogDeliveryResponse disableVodRealtimeLogDelivery(DisableVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EnableVodRealtimeLogDeliveryResponse enableVodRealtimeLogDeliveryWithOptions(EnableVodRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableVodRealtimeLogDelivery", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new EnableVodRealtimeLogDeliveryResponse());
    }

    public EnableVodRealtimeLogDeliveryResponse enableVodRealtimeLogDelivery(EnableVodRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableVodRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public GetAICaptionExtractionJobsResponse getAICaptionExtractionJobsWithOptions(GetAICaptionExtractionJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAICaptionExtractionJobs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAICaptionExtractionJobsResponse());
    }

    public GetAICaptionExtractionJobsResponse getAICaptionExtractionJobs(GetAICaptionExtractionJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAICaptionExtractionJobsWithOptions(request, runtime);
    }

    public GetAIImageJobsResponse getAIImageJobsWithOptions(GetAIImageJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAIImageJobs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAIImageJobsResponse());
    }

    public GetAIImageJobsResponse getAIImageJobs(GetAIImageJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIImageJobsWithOptions(request, runtime);
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAIMediaAuditJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAIMediaAuditJobResponse());
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    public GetAITemplateResponse getAITemplateWithOptions(GetAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAITemplateResponse());
    }

    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    public GetAIVideoTagResultResponse getAIVideoTagResultWithOptions(GetAIVideoTagResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAIVideoTagResult", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAIVideoTagResultResponse());
    }

    public GetAIVideoTagResultResponse getAIVideoTagResult(GetAIVideoTagResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIVideoTagResultWithOptions(request, runtime);
    }

    public GetAppInfosResponse getAppInfosWithOptions(GetAppInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppInfosResponse());
    }

    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfoWithOptions(GetAttachedMediaInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAttachedMediaInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAttachedMediaInfoResponse());
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfo(GetAttachedMediaInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    public GetAuditHistoryResponse getAuditHistoryWithOptions(GetAuditHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuditHistory", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuditHistoryResponse());
    }

    public GetAuditHistoryResponse getAuditHistory(GetAuditHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCategories", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetCategoriesResponse());
    }

    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    public GetDefaultAITemplateResponse getDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDefaultAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetDefaultAITemplateResponse());
    }

    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    public GetDetectionJobResponse getDetectionJobWithOptions(GetDetectionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectionJob", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetDetectionJobResponse());
    }

    public GetDetectionJobResponse getDetectionJob(GetDetectionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectionJobWithOptions(request, runtime);
    }

    public GetDetectionResultResponse getDetectionResultWithOptions(GetDetectionResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectionResult", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetDetectionResultResponse());
    }

    public GetDetectionResultResponse getDetectionResult(GetDetectionResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectionResultWithOptions(request, runtime);
    }

    public GetDetectionTemplateResponse getDetectionTemplateWithOptions(GetDetectionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectionTemplate", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetDetectionTemplateResponse());
    }

    public GetDetectionTemplateResponse getDetectionTemplate(GetDetectionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectionTemplateWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEditingProject", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetEditingProjectResponse());
    }

    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEditingProjectMaterials", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetEditingProjectMaterialsResponse());
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetImageInfoResponse getImageInfoWithOptions(GetImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageInfoResponse());
    }

    public GetImageInfoResponse getImageInfo(GetImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetailWithOptions(GetMediaAuditAudioResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaAuditAudioResultDetail", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaAuditAudioResultDetailResponse());
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultResponse getMediaAuditResultWithOptions(GetMediaAuditResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaAuditResult", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaAuditResultResponse());
    }

    public GetMediaAuditResultResponse getMediaAuditResult(GetMediaAuditResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaAuditResultDetail", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaAuditResultDetailResponse());
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaAuditResultTimeline", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaAuditResultTimelineResponse());
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    public GetMediaDNAResultResponse getMediaDNAResultWithOptions(GetMediaDNAResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaDNAResult", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaDNAResultResponse());
    }

    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    public GetMessageCallbackResponse getMessageCallbackWithOptions(GetMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMessageCallback", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMessageCallbackResponse());
    }

    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    public GetMezzanineInfoResponse getMezzanineInfoWithOptions(GetMezzanineInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMezzanineInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetMezzanineInfoResponse());
    }

    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPlayInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetPlayInfoResponse());
    }

    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    public GetTranscodeSummaryResponse getTranscodeSummaryWithOptions(GetTranscodeSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTranscodeSummary", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetTranscodeSummaryResponse());
    }

    public GetTranscodeSummaryResponse getTranscodeSummary(GetTranscodeSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeSummaryWithOptions(request, runtime);
    }

    public GetTranscodeTaskResponse getTranscodeTaskWithOptions(GetTranscodeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTranscodeTask", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetTranscodeTaskResponse());
    }

    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeTaskWithOptions(request, runtime);
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupWithOptions(GetTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetTranscodeTemplateGroupResponse());
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public GetURLUploadInfosResponse getURLUploadInfosWithOptions(GetURLUploadInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetURLUploadInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetURLUploadInfosResponse());
    }

    public GetURLUploadInfosResponse getURLUploadInfos(GetURLUploadInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getURLUploadInfosWithOptions(request, runtime);
    }

    public GetUploadDetailsResponse getUploadDetailsWithOptions(GetUploadDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUploadDetails", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetUploadDetailsResponse());
    }

    public GetUploadDetailsResponse getUploadDetails(GetUploadDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUploadDetailsWithOptions(request, runtime);
    }

    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoInfoResponse());
    }

    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoInfosResponse());
    }

    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoList", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoListResponse());
    }

    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    public GetVideoPlayAuthResponse getVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoPlayAuth", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoPlayAuthResponse());
    }

    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    public GetVodTemplateResponse getVodTemplateWithOptions(GetVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVodTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetVodTemplateResponse());
    }

    public GetVodTemplateResponse getVodTemplate(GetVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetWatermarkResponse());
    }

    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    public ListAIImageInfoResponse listAIImageInfoWithOptions(ListAIImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAIImageInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAIImageInfoResponse());
    }

    public ListAIImageInfoResponse listAIImageInfo(ListAIImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAIImageInfoWithOptions(request, runtime);
    }

    public ListAIJobResponse listAIJobWithOptions(ListAIJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAIJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAIJobResponse());
    }

    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    public ListAITemplateResponse listAITemplateWithOptions(ListAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAITemplateResponse());
    }

    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    public ListAppInfoResponse listAppInfoWithOptions(ListAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAppInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppInfoResponse());
    }

    public ListAppInfoResponse listAppInfo(ListAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppInfoWithOptions(request, runtime);
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityWithOptions(ListAppPoliciesForIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAppPoliciesForIdentity", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppPoliciesForIdentityResponse());
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppPoliciesForIdentityWithOptions(request, runtime);
    }

    public ListAuditSecurityIpResponse listAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuditSecurityIp", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuditSecurityIpResponse());
    }

    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    public ListDetectionJobResponse listDetectionJobWithOptions(ListDetectionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDetectionJob", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListDetectionJobResponse());
    }

    public ListDetectionJobResponse listDetectionJob(ListDetectionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDetectionJobWithOptions(request, runtime);
    }

    public ListDetectionTemplateResponse listDetectionTemplateWithOptions(ListDetectionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDetectionTemplate", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListDetectionTemplateResponse());
    }

    public ListDetectionTemplateResponse listDetectionTemplate(ListDetectionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDetectionTemplateWithOptions(request, runtime);
    }

    public ListDynamicImageResponse listDynamicImageWithOptions(ListDynamicImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDynamicImage", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListDynamicImageResponse());
    }

    public ListDynamicImageResponse listDynamicImage(ListDynamicImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDynamicImageWithOptions(request, runtime);
    }

    public ListLetterSendJobResponse listLetterSendJobWithOptions(ListLetterSendJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLetterSendJob", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListLetterSendJobResponse());
    }

    public ListLetterSendJobResponse listLetterSendJob(ListLetterSendJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLetterSendJobWithOptions(request, runtime);
    }

    public ListLiveRecordVideoResponse listLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLiveRecordVideo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListLiveRecordVideoResponse());
    }

    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJobWithOptions(ListMediaDNADeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMediaDNADeleteJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaDNADeleteJobResponse());
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJob(ListMediaDNADeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaDNADeleteJobWithOptions(request, runtime);
    }

    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSnapshots", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListSnapshotsResponse());
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    public ListTranscodeTaskResponse listTranscodeTaskWithOptions(ListTranscodeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTranscodeTask", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListTranscodeTaskResponse());
    }

    public ListTranscodeTaskResponse listTranscodeTask(ListTranscodeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTranscodeTaskWithOptions(request, runtime);
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroupWithOptions(ListTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListTranscodeTemplateGroupResponse());
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public ListVodRealtimeLogDeliveryDomainsResponse listVodRealtimeLogDeliveryDomainsWithOptions(ListVodRealtimeLogDeliveryDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVodRealtimeLogDeliveryDomains", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListVodRealtimeLogDeliveryDomainsResponse());
    }

    public ListVodRealtimeLogDeliveryDomainsResponse listVodRealtimeLogDeliveryDomains(ListVodRealtimeLogDeliveryDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ListVodRealtimeLogDeliveryInfosResponse listVodRealtimeLogDeliveryInfosWithOptions(ListVodRealtimeLogDeliveryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVodRealtimeLogDeliveryInfos", "2017-03-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListVodRealtimeLogDeliveryInfosResponse());
    }

    public ListVodRealtimeLogDeliveryInfosResponse listVodRealtimeLogDeliveryInfos(ListVodRealtimeLogDeliveryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public ListVodTemplateResponse listVodTemplateWithOptions(ListVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVodTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListVodTemplateResponse());
    }

    public ListVodTemplateResponse listVodTemplate(ListVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    public ListWatermarkResponse listWatermarkWithOptions(ListWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListWatermarkResponse());
    }

    public ListWatermarkResponse listWatermark(ListWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWatermarkWithOptions(request, runtime);
    }

    public MoveAppResourceResponse moveAppResourceWithOptions(MoveAppResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveAppResource", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new MoveAppResourceResponse());
    }

    public MoveAppResourceResponse moveAppResource(MoveAppResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAppResourceWithOptions(request, runtime);
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PreloadVodObjectCaches", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new PreloadVodObjectCachesResponse());
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProduceEditingProjectVideo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new ProduceEditingProjectVideoResponse());
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    public RefreshUploadVideoResponse refreshUploadVideoWithOptions(RefreshUploadVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshUploadVideo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshUploadVideoResponse());
    }

    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshVodObjectCaches", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshVodObjectCachesResponse());
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    public RegisterMediaResponse registerMediaWithOptions(RegisterMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterMedia", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterMediaResponse());
    }

    public RegisterMediaResponse registerMedia(RegisterMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerMediaWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchEditingProject", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SearchEditingProjectResponse());
    }

    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchMedia", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SearchMediaResponse());
    }

    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    public SetAuditSecurityIpResponse setAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAuditSecurityIp", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetAuditSecurityIpResponse());
    }

    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    public SetCrossdomainContentResponse setCrossdomainContentWithOptions(SetCrossdomainContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCrossdomainContent", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetCrossdomainContentResponse());
    }

    public SetCrossdomainContentResponse setCrossdomainContent(SetCrossdomainContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCrossdomainContentWithOptions(request, runtime);
    }

    public SetDefaultAITemplateResponse setDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultAITemplateResponse());
    }

    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroupWithOptions(SetDefaultTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultTranscodeTemplateGroupResponse());
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public SetDefaultWatermarkResponse setDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultWatermarkResponse());
    }

    public SetDefaultWatermarkResponse setDefaultWatermark(SetDefaultWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetEditingProjectMaterials", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetEditingProjectMaterialsResponse());
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SetMessageCallbackResponse setMessageCallbackWithOptions(SetMessageCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetMessageCallback", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetMessageCallbackResponse());
    }

    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    public SetVodDomainCertificateResponse setVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetVodDomainCertificate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SetVodDomainCertificateResponse());
    }

    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    public SubmitAICaptionExtractionJobResponse submitAICaptionExtractionJobWithOptions(SubmitAICaptionExtractionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAICaptionExtractionJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAICaptionExtractionJobResponse());
    }

    public SubmitAICaptionExtractionJobResponse submitAICaptionExtractionJob(SubmitAICaptionExtractionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAICaptionExtractionJobWithOptions(request, runtime);
    }

    public SubmitAIImageAuditJobResponse submitAIImageAuditJobWithOptions(SubmitAIImageAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAIImageAuditJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAIImageAuditJobResponse());
    }

    public SubmitAIImageAuditJobResponse submitAIImageAuditJob(SubmitAIImageAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIImageAuditJobWithOptions(request, runtime);
    }

    public SubmitAIImageJobResponse submitAIImageJobWithOptions(SubmitAIImageJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAIImageJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAIImageJobResponse());
    }

    public SubmitAIImageJobResponse submitAIImageJob(SubmitAIImageJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIImageJobWithOptions(request, runtime);
    }

    public SubmitAIJobResponse submitAIJobWithOptions(SubmitAIJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAIJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAIJobResponse());
    }

    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAIMediaAuditJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAIMediaAuditJobResponse());
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    public SubmitDetectionJobResponse submitDetectionJobWithOptions(SubmitDetectionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitDetectionJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitDetectionJobResponse());
    }

    public SubmitDetectionJobResponse submitDetectionJob(SubmitDetectionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDetectionJobWithOptions(request, runtime);
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJobWithOptions(SubmitDynamicImageJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitDynamicImageJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitDynamicImageJobResponse());
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    public SubmitLiveEditingResponse submitLiveEditingWithOptions(SubmitLiveEditingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitLiveEditing", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitLiveEditingResponse());
    }

    public SubmitLiveEditingResponse submitLiveEditing(SubmitLiveEditingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitLiveEditingWithOptions(request, runtime);
    }

    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJobWithOptions(SubmitMediaDNADeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaDNADeleteJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaDNADeleteJobResponse());
    }

    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaDNADeleteJobWithOptions(request, runtime);
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitPreprocessJobs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitPreprocessJobsResponse());
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSnapshotJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSnapshotJobResponse());
    }

    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitTranscodeJobs", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitTranscodeJobsResponse());
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    public SubmitWorkflowJobResponse submitWorkflowJobWithOptions(SubmitWorkflowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitWorkflowJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitWorkflowJobResponse());
    }

    public SubmitWorkflowJobResponse submitWorkflowJob(SubmitWorkflowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitWorkflowJobWithOptions(request, runtime);
    }

    public TagVodResourcesResponse tagVodResourcesWithOptions(TagVodResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagVodResources", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new TagVodResourcesResponse());
    }

    public TagVodResourcesResponse tagVodResources(TagVodResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagVodResourcesWithOptions(request, runtime);
    }

    public UnTagVodResourcesResponse unTagVodResourcesWithOptions(UnTagVodResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagVodResources", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagVodResourcesResponse());
    }

    public UnTagVodResourcesResponse unTagVodResources(UnTagVodResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagVodResourcesWithOptions(request, runtime);
    }

    public UpdateAITemplateResponse updateAITemplateWithOptions(UpdateAITemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAITemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAITemplateResponse());
    }

    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    public UpdateAppInfoResponse updateAppInfoWithOptions(UpdateAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppInfoResponse());
    }

    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppInfoWithOptions(request, runtime);
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfosWithOptions(UpdateAttachedMediaInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAttachedMediaInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAttachedMediaInfosResponse());
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAttachedMediaInfosWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCategory", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCategoryResponse());
    }

    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public UpdateDetectionJobResponse updateDetectionJobWithOptions(UpdateDetectionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDetectionJob", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDetectionJobResponse());
    }

    public UpdateDetectionJobResponse updateDetectionJob(UpdateDetectionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDetectionJobWithOptions(request, runtime);
    }

    public UpdateDetectionTemplateResponse updateDetectionTemplateWithOptions(UpdateDetectionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDetectionTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDetectionTemplateResponse());
    }

    public UpdateDetectionTemplateResponse updateDetectionTemplate(UpdateDetectionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDetectionTemplateWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEditingProject", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEditingProjectResponse());
    }

    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public UpdateImageInfosResponse updateImageInfosWithOptions(UpdateImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateImageInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateImageInfosResponse());
    }

    public UpdateImageInfosResponse updateImageInfos(UpdateImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    public UpdateStreamInfoResponse updateStreamInfoWithOptions(UpdateStreamInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateStreamInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateStreamInfoResponse());
    }

    public UpdateStreamInfoResponse updateStreamInfo(UpdateStreamInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateStreamInfoWithOptions(request, runtime);
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroupWithOptions(UpdateTranscodeTemplateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTranscodeTemplateGroup", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTranscodeTemplateGroupResponse());
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public UpdateVideoInfoResponse updateVideoInfoWithOptions(UpdateVideoInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVideoInfo", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVideoInfoResponse());
    }

    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    public UpdateVideoInfosResponse updateVideoInfosWithOptions(UpdateVideoInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVideoInfos", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVideoInfosResponse());
    }

    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    public UpdateVodDomainResponse updateVodDomainWithOptions(UpdateVodDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVodDomain", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVodDomainResponse());
    }

    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    public UpdateVodTemplateResponse updateVodTemplateWithOptions(UpdateVodTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVodTemplate", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVodTemplateResponse());
    }

    public UpdateVodTemplateResponse updateVodTemplate(UpdateVodTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWatermark", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWatermarkResponse());
    }

    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadMediaByURL", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UploadMediaByURLResponse());
    }

    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    public UploadStreamByURLResponse uploadStreamByURLWithOptions(UploadStreamByURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadStreamByURL", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new UploadStreamByURLResponse());
    }

    public UploadStreamByURLResponse uploadStreamByURL(UploadStreamByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadStreamByURLWithOptions(request, runtime);
    }

    public VerifyVodDomainOwnerResponse verifyVodDomainOwnerWithOptions(VerifyVodDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyVodDomainOwner", "2017-03-21", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyVodDomainOwnerResponse());
    }

    public VerifyVodDomainOwnerResponse verifyVodDomainOwner(VerifyVodDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyVodDomainOwnerWithOptions(request, runtime);
    }
}
