// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320;

import com.aliyun.tea.*;
import com.aliyun.videorecog20200320.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.oss.*;
import com.aliyun.oss.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.openplatform20191219.*;
import com.aliyun.openplatform20191219.models.*;
import com.aliyun.ossutil.*;
import com.aliyun.ossutil.models.*;
import com.aliyun.fileform.*;
import com.aliyun.fileform.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("videorecog", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetAsyncJobResultResponse getAsyncJobResultWithOptions(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAsyncJobResult", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAsyncJobResultResponse());
    }

    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncJobResultWithOptions(request, runtime);
    }

    public DetectVideoShotResponse detectVideoShotWithOptions(DetectVideoShotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectVideoShot", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DetectVideoShotResponse());
    }

    public DetectVideoShotResponse detectVideoShot(DetectVideoShotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectVideoShotWithOptions(request, runtime);
    }

    public DetectVideoShotResponse detectVideoShotAdvance(DetectVideoShotAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videorecog"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectVideoShotRequest detectVideoShotReq = new DetectVideoShotRequest();
        com.aliyun.openapiutil.Client.convert(request, detectVideoShotReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        detectVideoShotReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        DetectVideoShotResponse detectVideoShotResp = this.detectVideoShotWithOptions(detectVideoShotReq, runtime);
        return detectVideoShotResp;
    }

    public GenerateVideoCoverResponse generateVideoCoverWithOptions(GenerateVideoCoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateVideoCover", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateVideoCoverResponse());
    }

    public GenerateVideoCoverResponse generateVideoCover(GenerateVideoCoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateVideoCoverWithOptions(request, runtime);
    }

    public GenerateVideoCoverResponse generateVideoCoverAdvance(GenerateVideoCoverAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videorecog"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        GenerateVideoCoverRequest generateVideoCoverReq = new GenerateVideoCoverRequest();
        com.aliyun.openapiutil.Client.convert(request, generateVideoCoverReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        generateVideoCoverReq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        GenerateVideoCoverResponse generateVideoCoverResp = this.generateVideoCoverWithOptions(generateVideoCoverReq, runtime);
        return generateVideoCoverResp;
    }

    public UnderstandVideoContentResponse understandVideoContentWithOptions(UnderstandVideoContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnderstandVideoContent", "2020-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new UnderstandVideoContentResponse());
    }

    public UnderstandVideoContentResponse understandVideoContent(UnderstandVideoContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.understandVideoContentWithOptions(request, runtime);
    }

    public UnderstandVideoContentResponse understandVideoContentAdvance(UnderstandVideoContentAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videorecog"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UnderstandVideoContentRequest understandVideoContentReq = new UnderstandVideoContentRequest();
        com.aliyun.openapiutil.Client.convert(request, understandVideoContentReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        understandVideoContentReq.videoURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        UnderstandVideoContentResponse understandVideoContentResp = this.understandVideoContentWithOptions(understandVideoContentReq, runtime);
        return understandVideoContentResp;
    }
}
