// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930;

import com.aliyun.tea.*;
import com.aliyun.tingwu20220930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("tingwu", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateFileTransResponse createFileTransWithOptions(CreateFileTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abilityParams)) {
            body.put("AbilityParams", request.abilityParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrParams)) {
            body.put("AsrParams", request.asrParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioLanguage)) {
            body.put("AudioLanguage", request.audioLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOssBucket)) {
            body.put("AudioOssBucket", request.audioOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOssPath)) {
            body.put("AudioOssPath", request.audioOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputEnabled)) {
            body.put("AudioOutputEnabled", request.audioOutputEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputOssBucket)) {
            body.put("AudioOutputOssBucket", request.audioOutputOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputOssPath)) {
            body.put("AudioOutputOssPath", request.audioOutputOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioRoleNum)) {
            body.put("AudioRoleNum", request.audioRoleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioSegmentsEnabled)) {
            body.put("AudioSegmentsEnabled", request.audioSegmentsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labParams)) {
            body.put("LabParams", request.labParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transKey)) {
            body.put("TransKey", request.transKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transResultOssBucket)) {
            body.put("TransResultOssBucket", request.transResultOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transResultOssPath)) {
            body.put("TransResultOssPath", request.transResultOssPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileTrans"),
            new TeaPair("version", "2022-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/file-trans"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileTransResponse());
    }

    public CreateFileTransResponse createFileTrans(CreateFileTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileTransWithOptions(request, headers, runtime);
    }

    public CreateMeetingTransResponse createMeetingTransWithOptions(CreateMeetingTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abilityParams)) {
            body.put("AbilityParams", request.abilityParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrParams)) {
            body.put("AsrParams", request.asrParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioBitRate)) {
            body.put("AudioBitRate", request.audioBitRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioLanguage)) {
            body.put("AudioLanguage", request.audioLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputEnabled)) {
            body.put("AudioOutputEnabled", request.audioOutputEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputOssBucket)) {
            body.put("AudioOutputOssBucket", request.audioOutputOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioOutputOssPath)) {
            body.put("AudioOutputOssPath", request.audioOutputOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioPackage)) {
            body.put("AudioPackage", request.audioPackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioSampleRate)) {
            body.put("AudioSampleRate", request.audioSampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioSegmentsEnabled)) {
            body.put("AudioSegmentsEnabled", request.audioSegmentsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docResultEnabled)) {
            body.put("DocResultEnabled", request.docResultEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labParams)) {
            body.put("LabParams", request.labParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingKey)) {
            body.put("MeetingKey", request.meetingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingResultEnabled)) {
            body.put("MeetingResultEnabled", request.meetingResultEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingResultOssBucket)) {
            body.put("MeetingResultOssBucket", request.meetingResultOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingResultOssPath)) {
            body.put("MeetingResultOssPath", request.meetingResultOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeActiveResultLevel)) {
            body.put("RealtimeActiveResultLevel", request.realtimeActiveResultLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeResultEnabled)) {
            body.put("RealtimeResultEnabled", request.realtimeResultEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeResultLevel)) {
            body.put("RealtimeResultLevel", request.realtimeResultLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeResultMeetingInfoEnabled)) {
            body.put("RealtimeResultMeetingInfoEnabled", request.realtimeResultMeetingInfoEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeResultWordsEnabled)) {
            body.put("RealtimeResultWordsEnabled", request.realtimeResultWordsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateActiveResultLevel)) {
            body.put("TranslateActiveResultLevel", request.translateActiveResultLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateLanguages)) {
            body.put("TranslateLanguages", request.translateLanguages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateResultEnabled)) {
            body.put("TranslateResultEnabled", request.translateResultEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.translateResultLevel)) {
            body.put("TranslateResultLevel", request.translateResultLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMeetingTrans"),
            new TeaPair("version", "2022-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/meeting-trans"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMeetingTransResponse());
    }

    public CreateMeetingTransResponse createMeetingTrans(CreateMeetingTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMeetingTransWithOptions(request, headers, runtime);
    }

    public GetFileTransResponse getFileTransWithOptions(String TransId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileTrans"),
            new TeaPair("version", "2022-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/file-trans/" + com.aliyun.openapiutil.Client.getEncodeParam(TransId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileTransResponse());
    }

    public GetFileTransResponse getFileTrans(String TransId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileTransWithOptions(TransId, headers, runtime);
    }

    public GetMeetingTransResponse getMeetingTransWithOptions(String MeetingId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMeetingTrans"),
            new TeaPair("version", "2022-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/meeting-trans/" + com.aliyun.openapiutil.Client.getEncodeParam(MeetingId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMeetingTransResponse());
    }

    public GetMeetingTransResponse getMeetingTrans(String MeetingId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMeetingTransWithOptions(MeetingId, headers, runtime);
    }

    public StopMeetingTransResponse stopMeetingTransWithOptions(String MeetingId, StopMeetingTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meetingRoleNum)) {
            body.put("MeetingRoleNum", request.meetingRoleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyRoleSplitResult)) {
            body.put("OnlyRoleSplitResult", request.onlyRoleSplitResult);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMeetingTrans"),
            new TeaPair("version", "2022-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/meeting-trans/" + com.aliyun.openapiutil.Client.getEncodeParam(MeetingId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMeetingTransResponse());
    }

    public StopMeetingTransResponse stopMeetingTrans(String MeetingId, StopMeetingTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMeetingTransWithOptions(MeetingId, request, headers, runtime);
    }
}
