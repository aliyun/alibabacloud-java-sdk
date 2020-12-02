// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320;

import com.aliyun.tea.*;
import com.aliyun.videoenhan20200320.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("videoenhan", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public EnhanceVideoQualityResponse enhanceVideoQuality(EnhanceVideoQualityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnhanceVideoQuality", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new EnhanceVideoQualityResponse());
    }

    public EnhanceVideoQualityResponse enhanceVideoQualitySimply(EnhanceVideoQualityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enhanceVideoQuality(request, runtime);
    }

    public EnhanceVideoQualityResponse enhanceVideoQualityAdvance(EnhanceVideoQualityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        EnhanceVideoQualityRequest enhanceVideoQualityReq = new EnhanceVideoQualityRequest();
        com.aliyun.common.Common.convert(request, enhanceVideoQualityReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        enhanceVideoQualityReq.videoURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EnhanceVideoQualityResponse enhanceVideoQualityResp = this.enhanceVideoQuality(enhanceVideoQualityReq, runtime);
        return enhanceVideoQualityResp;
    }

    public MergeVideoFaceResponse mergeVideoFace(MergeVideoFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MergeVideoFace", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new MergeVideoFaceResponse());
    }

    public MergeVideoFaceResponse mergeVideoFaceSimply(MergeVideoFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mergeVideoFace(request, runtime);
    }

    public MergeVideoFaceResponse mergeVideoFaceAdvance(MergeVideoFaceAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        MergeVideoFaceRequest mergeVideoFaceReq = new MergeVideoFaceRequest();
        com.aliyun.common.Common.convert(request, mergeVideoFaceReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        mergeVideoFaceReq.videoURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        MergeVideoFaceResponse mergeVideoFaceResp = this.mergeVideoFace(mergeVideoFaceReq, runtime);
        return mergeVideoFaceResp;
    }

    public ChangeVideoSizeResponse changeVideoSize(ChangeVideoSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeVideoSize", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new ChangeVideoSizeResponse());
    }

    public ChangeVideoSizeResponse changeVideoSizeSimply(ChangeVideoSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeVideoSize(request, runtime);
    }

    public ChangeVideoSizeResponse changeVideoSizeAdvance(ChangeVideoSizeAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ChangeVideoSizeRequest changeVideoSizeReq = new ChangeVideoSizeRequest();
        com.aliyun.common.Common.convert(request, changeVideoSizeReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        changeVideoSizeReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        ChangeVideoSizeResponse changeVideoSizeResp = this.changeVideoSize(changeVideoSizeReq, runtime);
        return changeVideoSizeResp;
    }

    public GenerateVideoResponse generateVideo(GenerateVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new GenerateVideoResponse());
    }

    public GenerateVideoResponse generateVideoSimply(GenerateVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateVideo(request, runtime);
    }

    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAsyncJobResult", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAsyncJobResultResponse());
    }

    public GetAsyncJobResultResponse getAsyncJobResultSimply(GetAsyncJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncJobResult(request, runtime);
    }

    public SuperResolveVideoResponse superResolveVideo(SuperResolveVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SuperResolveVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new SuperResolveVideoResponse());
    }

    public SuperResolveVideoResponse superResolveVideoSimply(SuperResolveVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.superResolveVideo(request, runtime);
    }

    public SuperResolveVideoResponse superResolveVideoAdvance(SuperResolveVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        SuperResolveVideoRequest superResolveVideoReq = new SuperResolveVideoRequest();
        com.aliyun.common.Common.convert(request, superResolveVideoReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        superResolveVideoReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        SuperResolveVideoResponse superResolveVideoResp = this.superResolveVideo(superResolveVideoReq, runtime);
        return superResolveVideoResp;
    }

    public EraseVideoLogoResponse eraseVideoLogo(EraseVideoLogoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EraseVideoLogo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoLogoResponse());
    }

    public EraseVideoLogoResponse eraseVideoLogoSimply(EraseVideoLogoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eraseVideoLogo(request, runtime);
    }

    public EraseVideoLogoResponse eraseVideoLogoAdvance(EraseVideoLogoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        EraseVideoLogoRequest eraseVideoLogoReq = new EraseVideoLogoRequest();
        com.aliyun.common.Common.convert(request, eraseVideoLogoReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        eraseVideoLogoReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoLogoResponse eraseVideoLogoResp = this.eraseVideoLogo(eraseVideoLogoReq, runtime);
        return eraseVideoLogoResp;
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitles(EraseVideoSubtitlesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EraseVideoSubtitles", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoSubtitlesResponse());
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitlesSimply(EraseVideoSubtitlesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.eraseVideoSubtitles(request, runtime);
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitlesAdvance(EraseVideoSubtitlesAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        EraseVideoSubtitlesRequest eraseVideoSubtitlesReq = new EraseVideoSubtitlesRequest();
        com.aliyun.common.Common.convert(request, eraseVideoSubtitlesReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        eraseVideoSubtitlesReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoSubtitlesResponse eraseVideoSubtitlesResp = this.eraseVideoSubtitles(eraseVideoSubtitlesReq, runtime);
        return eraseVideoSubtitlesResp;
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideo(AbstractEcommerceVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbstractEcommerceVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AbstractEcommerceVideoResponse());
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideoSimply(AbstractEcommerceVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abstractEcommerceVideo(request, runtime);
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideoAdvance(AbstractEcommerceVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        AbstractEcommerceVideoRequest abstractEcommerceVideoReq = new AbstractEcommerceVideoRequest();
        com.aliyun.common.Common.convert(request, abstractEcommerceVideoReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        abstractEcommerceVideoReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractEcommerceVideoResponse abstractEcommerceVideoResp = this.abstractEcommerceVideo(abstractEcommerceVideoReq, runtime);
        return abstractEcommerceVideoResp;
    }

    public AbstractFilmVideoResponse abstractFilmVideo(AbstractFilmVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbstractFilmVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AbstractFilmVideoResponse());
    }

    public AbstractFilmVideoResponse abstractFilmVideoSimply(AbstractFilmVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abstractFilmVideo(request, runtime);
    }

    public AbstractFilmVideoResponse abstractFilmVideoAdvance(AbstractFilmVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        AbstractFilmVideoRequest abstractFilmVideoReq = new AbstractFilmVideoRequest();
        com.aliyun.common.Common.convert(request, abstractFilmVideoReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        abstractFilmVideoReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractFilmVideoResponse abstractFilmVideoResp = this.abstractFilmVideo(abstractFilmVideoReq, runtime);
        return abstractFilmVideoResp;
    }

    public AdjustVideoColorResponse adjustVideoColor(AdjustVideoColorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdjustVideoColor", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AdjustVideoColorResponse());
    }

    public AdjustVideoColorResponse adjustVideoColorSimply(AdjustVideoColorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustVideoColor(request, runtime);
    }

    public AdjustVideoColorResponse adjustVideoColorAdvance(AdjustVideoColorAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        AdjustVideoColorRequest adjustVideoColorReq = new AdjustVideoColorRequest();
        com.aliyun.common.Common.convert(request, adjustVideoColorReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        adjustVideoColorReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AdjustVideoColorResponse adjustVideoColorResp = this.adjustVideoColor(adjustVideoColorReq, runtime);
        return adjustVideoColorResp;
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
