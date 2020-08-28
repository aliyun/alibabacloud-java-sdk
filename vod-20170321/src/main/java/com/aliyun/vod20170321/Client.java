// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321;

import com.aliyun.tea.*;
import com.aliyun.vod20170321.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-chengdu", "vod.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vod.aliyuncs.com"),
            new TeaPair("cn-fujian", "vod.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "vod.aliyuncs.com"),
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
            new TeaPair("cn-yushanfang", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(_productId, _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJobWithOptions(SubmitMediaDNADeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitMediaDNADeleteJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitMediaDNADeleteJobResponse());
    }

    public SubmitMediaDNADeleteJobResponse submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaDNADeleteJobWithOptions(request, runtime);
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJobWithOptions(ListMediaDNADeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListMediaDNADeleteJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListMediaDNADeleteJobResponse());
    }

    public ListMediaDNADeleteJobResponse listMediaDNADeleteJob(ListMediaDNADeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaDNADeleteJobWithOptions(request, runtime);
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetailWithOptions(GetMediaAuditAudioResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditAudioResultDetail", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMediaAuditAudioResultDetailResponse());
    }

    public GetMediaAuditAudioResultDetailResponse getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditAudioResultDetailWithOptions(request, runtime);
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJobWithOptions(SubmitDynamicImageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitDynamicImageJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitDynamicImageJobResponse());
    }

    public SubmitDynamicImageJobResponse submitDynamicImageJob(SubmitDynamicImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDynamicImageJobWithOptions(request, runtime);
    }

    public SubmitWorkflowJobResponse submitWorkflowJobWithOptions(SubmitWorkflowJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitWorkflowJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitWorkflowJobResponse());
    }

    public SubmitWorkflowJobResponse submitWorkflowJob(SubmitWorkflowJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitWorkflowJobWithOptions(request, runtime);
    }

    public GetAIVideoTagResultResponse getAIVideoTagResultWithOptions(GetAIVideoTagResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIVideoTagResult", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAIVideoTagResultResponse());
    }

    public GetAIVideoTagResultResponse getAIVideoTagResult(GetAIVideoTagResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIVideoTagResultWithOptions(request, runtime);
    }

    public GetUploadDetailsResponse getUploadDetailsWithOptions(GetUploadDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUploadDetails", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetUploadDetailsResponse());
    }

    public GetUploadDetailsResponse getUploadDetails(GetUploadDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadDetailsWithOptions(request, runtime);
    }

    public DescribeVodStorageDataResponse describeVodStorageDataWithOptions(DescribeVodStorageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodStorageData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodStorageDataResponse());
    }

    public DescribeVodStorageDataResponse describeVodStorageData(DescribeVodStorageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodStorageDataWithOptions(request, runtime);
    }

    public DescribeVodAIDataResponse describeVodAIDataWithOptions(DescribeVodAIDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodAIData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodAIDataResponse());
    }

    public DescribeVodAIDataResponse describeVodAIData(DescribeVodAIDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodAIDataWithOptions(request, runtime);
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeDataWithOptions(DescribeVodTranscodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodTranscodeData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodTranscodeDataResponse());
    }

    public DescribeVodTranscodeDataResponse describeVodTranscodeData(DescribeVodTranscodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodTranscodeDataWithOptions(request, runtime);
    }

    public DeleteMultipartUploadResponse deleteMultipartUploadWithOptions(DeleteMultipartUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMultipartUpload", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMultipartUploadResponse());
    }

    public DeleteMultipartUploadResponse deleteMultipartUpload(DeleteMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultipartUploadWithOptions(request, runtime);
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfoWithOptions(GetAttachedMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAttachedMediaInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAttachedMediaInfoResponse());
    }

    public GetAttachedMediaInfoResponse getAttachedMediaInfo(GetAttachedMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttachedMediaInfoWithOptions(request, runtime);
    }

    public DeleteAttachedMediaResponse deleteAttachedMediaWithOptions(DeleteAttachedMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAttachedMedia", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAttachedMediaResponse());
    }

    public DeleteAttachedMediaResponse deleteAttachedMedia(DeleteAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAttachedMediaWithOptions(request, runtime);
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfosWithOptions(UpdateAttachedMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAttachedMediaInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAttachedMediaInfosResponse());
    }

    public UpdateAttachedMediaInfosResponse updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAttachedMediaInfosWithOptions(request, runtime);
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentityWithOptions(AttachAppPolicyToIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachAppPolicyToIdentity", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AttachAppPolicyToIdentityResponse());
    }

    public AttachAppPolicyToIdentityResponse attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAppPolicyToIdentityWithOptions(request, runtime);
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentityWithOptions(DetachAppPolicyFromIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachAppPolicyFromIdentity", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DetachAppPolicyFromIdentityResponse());
    }

    public DetachAppPolicyFromIdentityResponse detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAppPolicyFromIdentityWithOptions(request, runtime);
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentityWithOptions(ListAppPoliciesForIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAppPoliciesForIdentity", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListAppPoliciesForIdentityResponse());
    }

    public ListAppPoliciesForIdentityResponse listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPoliciesForIdentityWithOptions(request, runtime);
    }

    public CreateAppInfoResponse createAppInfoWithOptions(CreateAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAppInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new CreateAppInfoResponse());
    }

    public CreateAppInfoResponse createAppInfo(CreateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInfoWithOptions(request, runtime);
    }

    public GetAppInfosResponse getAppInfosWithOptions(GetAppInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAppInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAppInfosResponse());
    }

    public GetAppInfosResponse getAppInfos(GetAppInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInfosWithOptions(request, runtime);
    }

    public UpdateAppInfoResponse updateAppInfoWithOptions(UpdateAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAppInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAppInfoResponse());
    }

    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInfoWithOptions(request, runtime);
    }

    public DeleteAppInfoResponse deleteAppInfoWithOptions(DeleteAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAppInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAppInfoResponse());
    }

    public DeleteAppInfoResponse deleteAppInfo(DeleteAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInfoWithOptions(request, runtime);
    }

    public ListAppInfoResponse listAppInfoWithOptions(ListAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAppInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListAppInfoResponse());
    }

    public ListAppInfoResponse listAppInfo(ListAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInfoWithOptions(request, runtime);
    }

    public MoveAppResourceResponse moveAppResourceWithOptions(MoveAppResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MoveAppResource", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new MoveAppResourceResponse());
    }

    public MoveAppResourceResponse moveAppResource(MoveAppResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveAppResourceWithOptions(request, runtime);
    }

    public DeleteMessageCallbackResponse deleteMessageCallbackWithOptions(DeleteMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMessageCallback", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMessageCallbackResponse());
    }

    public DeleteMessageCallbackResponse deleteMessageCallback(DeleteMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessageCallbackWithOptions(request, runtime);
    }

    public GetTranscodeSummaryResponse getTranscodeSummaryWithOptions(GetTranscodeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTranscodeSummary", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetTranscodeSummaryResponse());
    }

    public GetTranscodeSummaryResponse getTranscodeSummary(GetTranscodeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeSummaryWithOptions(request, runtime);
    }

    public ListTranscodeTaskResponse listTranscodeTaskWithOptions(ListTranscodeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTranscodeTask", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListTranscodeTaskResponse());
    }

    public ListTranscodeTaskResponse listTranscodeTask(ListTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTaskWithOptions(request, runtime);
    }

    public GetTranscodeTaskResponse getTranscodeTaskWithOptions(GetTranscodeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTranscodeTask", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetTranscodeTaskResponse());
    }

    public GetTranscodeTaskResponse getTranscodeTask(GetTranscodeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTaskWithOptions(request, runtime);
    }

    public GetURLUploadInfosResponse getURLUploadInfosWithOptions(GetURLUploadInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetURLUploadInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetURLUploadInfosResponse());
    }

    public GetURLUploadInfosResponse getURLUploadInfos(GetURLUploadInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getURLUploadInfosWithOptions(request, runtime);
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroupWithOptions(UpdateTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTranscodeTemplateGroupResponse());
    }

    public UpdateTranscodeTemplateGroupResponse updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroupWithOptions(AddTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddTranscodeTemplateGroupResponse());
    }

    public AddTranscodeTemplateGroupResponse addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroupWithOptions(DeleteTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTranscodeTemplateGroupResponse());
    }

    public DeleteTranscodeTemplateGroupResponse deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupWithOptions(GetTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetTranscodeTemplateGroupResponse());
    }

    public GetTranscodeTemplateGroupResponse getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroupWithOptions(SetDefaultTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetDefaultTranscodeTemplateGroupResponse());
    }

    public SetDefaultTranscodeTemplateGroupResponse setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroupWithOptions(ListTranscodeTemplateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTranscodeTemplateGroup", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListTranscodeTemplateGroupResponse());
    }

    public ListTranscodeTemplateGroupResponse listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTranscodeTemplateGroupWithOptions(request, runtime);
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJobWithOptions(GetAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIMediaAuditJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAIMediaAuditJobResponse());
    }

    public GetAIMediaAuditJobResponse getAIMediaAuditJob(GetAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIMediaAuditJobWithOptions(request, runtime);
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJobWithOptions(SubmitAIMediaAuditJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIMediaAuditJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitAIMediaAuditJobResponse());
    }

    public SubmitAIMediaAuditJobResponse submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIMediaAuditJobWithOptions(request, runtime);
    }

    public GetMediaAuditResultResponse getMediaAuditResultWithOptions(GetMediaAuditResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResult", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMediaAuditResultResponse());
    }

    public GetMediaAuditResultResponse getMediaAuditResult(GetMediaAuditResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultWithOptions(request, runtime);
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetailWithOptions(GetMediaAuditResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResultDetail", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMediaAuditResultDetailResponse());
    }

    public GetMediaAuditResultDetailResponse getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultDetailWithOptions(request, runtime);
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineWithOptions(GetMediaAuditResultTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaAuditResultTimeline", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMediaAuditResultTimelineResponse());
    }

    public GetMediaAuditResultTimelineResponse getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaAuditResultTimelineWithOptions(request, runtime);
    }

    public AddAITemplateResponse addAITemplateWithOptions(AddAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddAITemplateResponse());
    }

    public AddAITemplateResponse addAITemplate(AddAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAITemplateWithOptions(request, runtime);
    }

    public DeleteAITemplateResponse deleteAITemplateWithOptions(DeleteAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAITemplateResponse());
    }

    public DeleteAITemplateResponse deleteAITemplate(DeleteAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAITemplateWithOptions(request, runtime);
    }

    public UpdateAITemplateResponse updateAITemplateWithOptions(UpdateAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAITemplateResponse());
    }

    public UpdateAITemplateResponse updateAITemplate(UpdateAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAITemplateWithOptions(request, runtime);
    }

    public GetAITemplateResponse getAITemplateWithOptions(GetAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAITemplateResponse());
    }

    public GetAITemplateResponse getAITemplate(GetAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAITemplateWithOptions(request, runtime);
    }

    public ListAITemplateResponse listAITemplateWithOptions(ListAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListAITemplateResponse());
    }

    public ListAITemplateResponse listAITemplate(ListAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAITemplateWithOptions(request, runtime);
    }

    public GetDefaultAITemplateResponse getDefaultAITemplateWithOptions(GetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDefaultAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetDefaultAITemplateResponse());
    }

    public GetDefaultAITemplateResponse getDefaultAITemplate(GetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultAITemplateWithOptions(request, runtime);
    }

    public SetDefaultAITemplateResponse setDefaultAITemplateWithOptions(SetDefaultAITemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultAITemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetDefaultAITemplateResponse());
    }

    public SetDefaultAITemplateResponse setDefaultAITemplate(SetDefaultAITemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultAITemplateWithOptions(request, runtime);
    }

    public DescribeVodDomainLogResponse describeVodDomainLogWithOptions(DescribeVodDomainLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainLog", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainLogResponse());
    }

    public DescribeVodDomainLogResponse describeVodDomainLog(DescribeVodDomainLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainLogWithOptions(request, runtime);
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoWithOptions(DescribeVodDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainCertificateInfo", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainCertificateInfoResponse());
    }

    public DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficDataWithOptions(DescribeVodDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainTrafficData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainTrafficDataResponse());
    }

    public DescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsDataWithOptions(DescribeVodDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainBpsData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainBpsDataResponse());
    }

    public DescribeVodDomainBpsDataResponse describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageDataWithOptions(DescribeVodDomainUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainUsageData", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribeVodDomainUsageDataResponse());
    }

    public DescribeVodDomainUsageDataResponse describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeVodCertificateListResponse describeVodCertificateListWithOptions(DescribeVodCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodCertificateList", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodCertificateListResponse());
    }

    public DescribeVodCertificateListResponse describeVodCertificateList(DescribeVodCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodCertificateListWithOptions(request, runtime);
    }

    public BatchStopVodDomainResponse batchStopVodDomainWithOptions(BatchStopVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchStopVodDomain", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new BatchStopVodDomainResponse());
    }

    public BatchStopVodDomainResponse batchStopVodDomain(BatchStopVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopVodDomainWithOptions(request, runtime);
    }

    public DeleteVodDomainResponse deleteVodDomainWithOptions(DeleteVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVodDomain", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVodDomainResponse());
    }

    public DeleteVodDomainResponse deleteVodDomain(DeleteVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodDomainWithOptions(request, runtime);
    }

    public SetVodDomainCertificateResponse setVodDomainCertificateWithOptions(SetVodDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetVodDomainCertificate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetVodDomainCertificateResponse());
    }

    public SetVodDomainCertificateResponse setVodDomainCertificate(SetVodDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVodDomainCertificateWithOptions(request, runtime);
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfigWithOptions(DeleteVodSpecificConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVodSpecificConfig", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVodSpecificConfigResponse());
    }

    public DeleteVodSpecificConfigResponse deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodSpecificConfigWithOptions(request, runtime);
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigsWithOptions(BatchSetVodDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchSetVodDomainConfigs", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new BatchSetVodDomainConfigsResponse());
    }

    public BatchSetVodDomainConfigsResponse batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetVodDomainConfigsWithOptions(request, runtime);
    }

    public AddVodDomainResponse addVodDomainWithOptions(AddVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddVodDomain", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddVodDomainResponse());
    }

    public AddVodDomainResponse addVodDomain(AddVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodDomainWithOptions(request, runtime);
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuotaWithOptions(DescribeVodRefreshQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodRefreshQuota", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodRefreshQuotaResponse());
    }

    public DescribeVodRefreshQuotaResponse describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasksWithOptions(DescribeVodRefreshTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodRefreshTasks", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodRefreshTasksResponse());
    }

    public DescribeVodRefreshTasksResponse describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodRefreshTasksWithOptions(request, runtime);
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigsWithOptions(DescribeVodDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainConfigs", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodDomainConfigsResponse());
    }

    public DescribeVodDomainConfigsResponse describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainConfigsWithOptions(request, runtime);
    }

    public DescribeVodUserDomainsResponse describeVodUserDomainsWithOptions(DescribeVodUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodUserDomains", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodUserDomainsResponse());
    }

    public DescribeVodUserDomainsResponse describeVodUserDomains(DescribeVodUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodUserDomainsWithOptions(request, runtime);
    }

    public UpdateVodDomainResponse updateVodDomainWithOptions(UpdateVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVodDomain", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateVodDomainResponse());
    }

    public UpdateVodDomainResponse updateVodDomain(UpdateVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodDomainWithOptions(request, runtime);
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCachesWithOptions(RefreshVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshVodObjectCaches", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new RefreshVodObjectCachesResponse());
    }

    public RefreshVodObjectCachesResponse refreshVodObjectCaches(RefreshVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshVodObjectCachesWithOptions(request, runtime);
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCachesWithOptions(PreloadVodObjectCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreloadVodObjectCaches", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new PreloadVodObjectCachesResponse());
    }

    public PreloadVodObjectCachesResponse preloadVodObjectCaches(PreloadVodObjectCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadVodObjectCachesWithOptions(request, runtime);
    }

    public BatchStartVodDomainResponse batchStartVodDomainWithOptions(BatchStartVodDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchStartVodDomain", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new BatchStartVodDomainResponse());
    }

    public BatchStartVodDomainResponse batchStartVodDomain(BatchStartVodDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartVodDomainWithOptions(request, runtime);
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetailWithOptions(DescribeVodDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVodDomainDetail", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVodDomainDetailResponse());
    }

    public DescribeVodDomainDetailResponse describeVodDomainDetail(DescribeVodDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodDomainDetailWithOptions(request, runtime);
    }

    public DeleteVodTemplateResponse deleteVodTemplateWithOptions(DeleteVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVodTemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVodTemplateResponse());
    }

    public DeleteVodTemplateResponse deleteVodTemplate(DeleteVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVodTemplateWithOptions(request, runtime);
    }

    public GetVodTemplateResponse getVodTemplateWithOptions(GetVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVodTemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetVodTemplateResponse());
    }

    public GetVodTemplateResponse getVodTemplate(GetVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVodTemplateWithOptions(request, runtime);
    }

    public ListVodTemplateResponse listVodTemplateWithOptions(ListVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVodTemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListVodTemplateResponse());
    }

    public ListVodTemplateResponse listVodTemplate(ListVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVodTemplateWithOptions(request, runtime);
    }

    public UpdateVodTemplateResponse updateVodTemplateWithOptions(UpdateVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVodTemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateVodTemplateResponse());
    }

    public UpdateVodTemplateResponse updateVodTemplate(UpdateVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVodTemplateWithOptions(request, runtime);
    }

    public AddVodTemplateResponse addVodTemplateWithOptions(AddVodTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddVodTemplate", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddVodTemplateResponse());
    }

    public AddVodTemplateResponse addVodTemplate(AddVodTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVodTemplateWithOptions(request, runtime);
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMediaWithOptions(CreateUploadAttachedMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadAttachedMedia", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new CreateUploadAttachedMediaResponse());
    }

    public CreateUploadAttachedMediaResponse createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadAttachedMediaWithOptions(request, runtime);
    }

    public RegisterMediaResponse registerMediaWithOptions(RegisterMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RegisterMedia", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new RegisterMediaResponse());
    }

    public RegisterMediaResponse registerMedia(RegisterMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerMediaWithOptions(request, runtime);
    }

    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteWatermarkResponse());
    }

    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetWatermarkResponse());
    }

    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    public SetDefaultWatermarkResponse setDefaultWatermarkWithOptions(SetDefaultWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetDefaultWatermarkResponse());
    }

    public SetDefaultWatermarkResponse setDefaultWatermark(SetDefaultWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultWatermarkWithOptions(request, runtime);
    }

    public ListWatermarkResponse listWatermarkWithOptions(ListWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListWatermarkResponse());
    }

    public ListWatermarkResponse listWatermark(ListWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWatermarkWithOptions(request, runtime);
    }

    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateWatermarkResponse());
    }

    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    public AddWatermarkResponse addWatermarkWithOptions(AddWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddWatermark", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddWatermarkResponse());
    }

    public AddWatermarkResponse addWatermark(AddWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatermarkWithOptions(request, runtime);
    }

    public GetMediaDNAResultResponse getMediaDNAResultWithOptions(GetMediaDNAResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMediaDNAResult", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMediaDNAResultResponse());
    }

    public GetMediaDNAResultResponse getMediaDNAResult(GetMediaDNAResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaDNAResultWithOptions(request, runtime);
    }

    public DeleteMezzaninesResponse deleteMezzaninesWithOptions(DeleteMezzaninesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMezzanines", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMezzaninesResponse());
    }

    public DeleteMezzaninesResponse deleteMezzanines(DeleteMezzaninesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMezzaninesWithOptions(request, runtime);
    }

    public UpdateImageInfosResponse updateImageInfosWithOptions(UpdateImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateImageInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateImageInfosResponse());
    }

    public UpdateImageInfosResponse updateImageInfos(UpdateImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageInfosWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteImage", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public ListAuditSecurityIpResponse listAuditSecurityIpWithOptions(ListAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAuditSecurityIp", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListAuditSecurityIpResponse());
    }

    public ListAuditSecurityIpResponse listAuditSecurityIp(ListAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuditSecurityIpWithOptions(request, runtime);
    }

    public SetAuditSecurityIpResponse setAuditSecurityIpWithOptions(SetAuditSecurityIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetAuditSecurityIp", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetAuditSecurityIpResponse());
    }

    public SetAuditSecurityIpResponse setAuditSecurityIp(SetAuditSecurityIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAuditSecurityIpWithOptions(request, runtime);
    }

    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadMediaByURL", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UploadMediaByURLResponse());
    }

    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMediaByURLWithOptions(request, runtime);
    }

    public UpdateVideoInfosResponse updateVideoInfosWithOptions(UpdateVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVideoInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateVideoInfosResponse());
    }

    public UpdateVideoInfosResponse updateVideoInfos(UpdateVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfosWithOptions(request, runtime);
    }

    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMedia", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SearchMediaResponse());
    }

    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    public GetVideoInfosResponse getVideoInfosWithOptions(GetVideoInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoInfos", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoInfosResponse());
    }

    public GetVideoInfosResponse getVideoInfos(GetVideoInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfosWithOptions(request, runtime);
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobsWithOptions(SubmitPreprocessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitPreprocessJobs", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitPreprocessJobsResponse());
    }

    public SubmitPreprocessJobsResponse submitPreprocessJobs(SubmitPreprocessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPreprocessJobsWithOptions(request, runtime);
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatisWithOptions(DescribePlayVideoStatisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePlayVideoStatis", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribePlayVideoStatisResponse());
    }

    public DescribePlayVideoStatisResponse describePlayVideoStatis(DescribePlayVideoStatisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayVideoStatisWithOptions(request, runtime);
    }

    public DescribePlayUserTotalResponse describePlayUserTotalWithOptions(DescribePlayUserTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePlayUserTotal", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribePlayUserTotalResponse());
    }

    public DescribePlayUserTotalResponse describePlayUserTotal(DescribePlayUserTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserTotalWithOptions(request, runtime);
    }

    public DescribePlayUserAvgResponse describePlayUserAvgWithOptions(DescribePlayUserAvgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePlayUserAvg", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribePlayUserAvgResponse());
    }

    public DescribePlayUserAvgResponse describePlayUserAvg(DescribePlayUserAvgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayUserAvgWithOptions(request, runtime);
    }

    public DescribePlayTopVideosResponse describePlayTopVideosWithOptions(DescribePlayTopVideosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePlayTopVideos", "HTTPS", "POST", "2017-03-21", "AK", TeaModel.buildMap(request), null, runtime), new DescribePlayTopVideosResponse());
    }

    public DescribePlayTopVideosResponse describePlayTopVideos(DescribePlayTopVideosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlayTopVideosWithOptions(request, runtime);
    }

    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSnapshots", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListSnapshotsResponse());
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobsWithOptions(SubmitTranscodeJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitTranscodeJobs", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitTranscodeJobsResponse());
    }

    public SubmitTranscodeJobsResponse submitTranscodeJobs(SubmitTranscodeJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTranscodeJobsWithOptions(request, runtime);
    }

    public ListLiveRecordVideoResponse listLiveRecordVideoWithOptions(ListLiveRecordVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLiveRecordVideo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListLiveRecordVideoResponse());
    }

    public ListLiveRecordVideoResponse listLiveRecordVideo(ListLiveRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRecordVideoWithOptions(request, runtime);
    }

    public CreateAuditResponse createAuditWithOptions(CreateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAudit", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new CreateAuditResponse());
    }

    public CreateAuditResponse createAudit(CreateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuditWithOptions(request, runtime);
    }

    public GetAuditHistoryResponse getAuditHistoryWithOptions(GetAuditHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAuditHistory", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetAuditHistoryResponse());
    }

    public GetAuditHistoryResponse getAuditHistory(GetAuditHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditHistoryWithOptions(request, runtime);
    }

    public ListAIJobResponse listAIJobWithOptions(ListAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAIJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ListAIJobResponse());
    }

    public ListAIJobResponse listAIJob(ListAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIJobWithOptions(request, runtime);
    }

    public SubmitAIJobResponse submitAIJobWithOptions(SubmitAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitAIJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitAIJobResponse());
    }

    public SubmitAIJobResponse submitAIJob(SubmitAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAIJobWithOptions(request, runtime);
    }

    public GetImageInfoResponse getImageInfoWithOptions(GetImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetImageInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetImageInfoResponse());
    }

    public GetImageInfoResponse getImageInfo(GetImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageInfoWithOptions(request, runtime);
    }

    public DeleteStreamResponse deleteStreamWithOptions(DeleteStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteStream", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteStreamResponse());
    }

    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamWithOptions(request, runtime);
    }

    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSnapshotJob", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSnapshotJobResponse());
    }

    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEditingProject", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEditingProjectResponse());
    }

    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterialsWithOptions(SetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetEditingProjectMaterials", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetEditingProjectMaterialsResponse());
    }

    public SetEditingProjectMaterialsResponse setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchEditingProject", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SearchEditingProjectResponse());
    }

    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideoWithOptions(ProduceEditingProjectVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ProduceEditingProjectVideo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new ProduceEditingProjectVideoResponse());
    }

    public ProduceEditingProjectVideoResponse produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.produceEditingProjectVideoWithOptions(request, runtime);
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEditingProjectMaterials", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetEditingProjectMaterialsResponse());
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEditingProject", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetEditingProjectResponse());
    }

    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    public DeleteEditingProjectResponse deleteEditingProjectWithOptions(DeleteEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEditingProject", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEditingProjectResponse());
    }

    public DeleteEditingProjectResponse deleteEditingProject(DeleteEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEditingProjectWithOptions(request, runtime);
    }

    public AddEditingProjectResponse addEditingProjectWithOptions(AddEditingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddEditingProject", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddEditingProjectResponse());
    }

    public AddEditingProjectResponse addEditingProject(AddEditingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEditingProjectWithOptions(request, runtime);
    }

    public GetMezzanineInfoResponse getMezzanineInfoWithOptions(GetMezzanineInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMezzanineInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMezzanineInfoResponse());
    }

    public GetMezzanineInfoResponse getMezzanineInfo(GetMezzanineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMezzanineInfoWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCategory", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateCategoryResponse());
    }

    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public GetCategoriesResponse getCategoriesWithOptions(GetCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCategories", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetCategoriesResponse());
    }

    public GetCategoriesResponse getCategories(GetCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCategoriesWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCategory", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public AddCategoryResponse addCategoryWithOptions(AddCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCategory", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new AddCategoryResponse());
    }

    public AddCategoryResponse addCategory(AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCategoryWithOptions(request, runtime);
    }

    public GetPlayInfoResponse getPlayInfoWithOptions(GetPlayInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPlayInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetPlayInfoResponse());
    }

    public GetPlayInfoResponse getPlayInfo(GetPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlayInfoWithOptions(request, runtime);
    }

    public CreateUploadImageResponse createUploadImageWithOptions(CreateUploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadImage", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new CreateUploadImageResponse());
    }

    public CreateUploadImageResponse createUploadImage(CreateUploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadImageWithOptions(request, runtime);
    }

    public SetMessageCallbackResponse setMessageCallbackWithOptions(SetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetMessageCallback", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new SetMessageCallbackResponse());
    }

    public SetMessageCallbackResponse setMessageCallback(SetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMessageCallbackWithOptions(request, runtime);
    }

    public GetMessageCallbackResponse getMessageCallbackWithOptions(GetMessageCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMessageCallback", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetMessageCallbackResponse());
    }

    public GetMessageCallbackResponse getMessageCallback(GetMessageCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageCallbackWithOptions(request, runtime);
    }

    public UpdateVideoInfoResponse updateVideoInfoWithOptions(UpdateVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateVideoInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new UpdateVideoInfoResponse());
    }

    public UpdateVideoInfoResponse updateVideoInfo(UpdateVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoInfoWithOptions(request, runtime);
    }

    public GetVideoPlayAuthResponse getVideoPlayAuthWithOptions(GetVideoPlayAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoPlayAuth", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoPlayAuthResponse());
    }

    public GetVideoPlayAuthResponse getVideoPlayAuth(GetVideoPlayAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoPlayAuthWithOptions(request, runtime);
    }

    public GetVideoListResponse getVideoListWithOptions(GetVideoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoList", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoListResponse());
    }

    public GetVideoListResponse getVideoList(GetVideoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoListWithOptions(request, runtime);
    }

    public GetVideoInfoResponse getVideoInfoWithOptions(GetVideoInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoInfo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoInfoResponse());
    }

    public GetVideoInfoResponse getVideoInfo(GetVideoInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoInfoWithOptions(request, runtime);
    }

    public DeleteVideoResponse deleteVideoWithOptions(DeleteVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVideo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVideoResponse());
    }

    public DeleteVideoResponse deleteVideo(DeleteVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoWithOptions(request, runtime);
    }

    public RefreshUploadVideoResponse refreshUploadVideoWithOptions(RefreshUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshUploadVideo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new RefreshUploadVideoResponse());
    }

    public RefreshUploadVideoResponse refreshUploadVideo(RefreshUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshUploadVideoWithOptions(request, runtime);
    }

    public CreateUploadVideoResponse createUploadVideoWithOptions(CreateUploadVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUploadVideo", "HTTPS", "POST", "2017-03-21", "AK", null, TeaModel.buildMap(request), runtime), new CreateUploadVideoResponse());
    }

    public CreateUploadVideoResponse createUploadVideo(CreateUploadVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadVideoWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
