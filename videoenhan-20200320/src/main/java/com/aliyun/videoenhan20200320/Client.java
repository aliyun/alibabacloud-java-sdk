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


    public ChangeVideoSizeResponse changeVideoSize(ChangeVideoSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeVideoSize", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new ChangeVideoSizeResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        ChangeVideoSizeRequest changeVideoSizereq = new ChangeVideoSizeRequest();
        com.aliyun.common.Common.convert(request, changeVideoSizereq);
        changeVideoSizereq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        ChangeVideoSizeResponse changeVideoSizeResp = this.changeVideoSize(changeVideoSizereq, runtime);
        return changeVideoSizeResp;
    }

    public GenerateVideoResponse generateVideo(GenerateVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new GenerateVideoResponse());
    }

    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAsyncJobResult", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAsyncJobResultResponse());
    }

    public SuperResolveVideoResponse superResolveVideo(SuperResolveVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SuperResolveVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new SuperResolveVideoResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        SuperResolveVideoRequest superResolveVideoreq = new SuperResolveVideoRequest();
        com.aliyun.common.Common.convert(request, superResolveVideoreq);
        superResolveVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        SuperResolveVideoResponse superResolveVideoResp = this.superResolveVideo(superResolveVideoreq, runtime);
        return superResolveVideoResp;
    }

    public EraseVideoLogoResponse eraseVideoLogo(EraseVideoLogoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EraseVideoLogo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoLogoResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        EraseVideoLogoRequest eraseVideoLogoreq = new EraseVideoLogoRequest();
        com.aliyun.common.Common.convert(request, eraseVideoLogoreq);
        eraseVideoLogoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoLogoResponse eraseVideoLogoResp = this.eraseVideoLogo(eraseVideoLogoreq, runtime);
        return eraseVideoLogoResp;
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitles(EraseVideoSubtitlesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EraseVideoSubtitles", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoSubtitlesResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        EraseVideoSubtitlesRequest eraseVideoSubtitlesreq = new EraseVideoSubtitlesRequest();
        com.aliyun.common.Common.convert(request, eraseVideoSubtitlesreq);
        eraseVideoSubtitlesreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoSubtitlesResponse eraseVideoSubtitlesResp = this.eraseVideoSubtitles(eraseVideoSubtitlesreq, runtime);
        return eraseVideoSubtitlesResp;
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideo(AbstractEcommerceVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbstractEcommerceVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AbstractEcommerceVideoResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        AbstractEcommerceVideoRequest abstractEcommerceVideoreq = new AbstractEcommerceVideoRequest();
        com.aliyun.common.Common.convert(request, abstractEcommerceVideoreq);
        abstractEcommerceVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractEcommerceVideoResponse abstractEcommerceVideoResp = this.abstractEcommerceVideo(abstractEcommerceVideoreq, runtime);
        return abstractEcommerceVideoResp;
    }

    public AbstractFilmVideoResponse abstractFilmVideo(AbstractFilmVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbstractFilmVideo", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AbstractFilmVideoResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        AbstractFilmVideoRequest abstractFilmVideoreq = new AbstractFilmVideoRequest();
        com.aliyun.common.Common.convert(request, abstractFilmVideoreq);
        abstractFilmVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractFilmVideoResponse abstractFilmVideoResp = this.abstractFilmVideo(abstractFilmVideoreq, runtime);
        return abstractFilmVideoResp;
    }

    public AdjustVideoColorResponse adjustVideoColor(AdjustVideoColorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdjustVideoColor", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new AdjustVideoColorResponse());
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
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        AdjustVideoColorRequest adjustVideoColorreq = new AdjustVideoColorRequest();
        com.aliyun.common.Common.convert(request, adjustVideoColorreq);
        adjustVideoColorreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AdjustVideoColorResponse adjustVideoColorResp = this.adjustVideoColor(adjustVideoColorreq, runtime);
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
