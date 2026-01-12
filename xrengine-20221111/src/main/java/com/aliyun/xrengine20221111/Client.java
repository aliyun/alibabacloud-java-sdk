// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111;

import com.aliyun.tea.*;
import com.aliyun.xrengine20221111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-south-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "xrengine-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-beijing", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-chengdu", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-edge-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-fujian", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hongkong", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-qingdao", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-wuhan", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "xrengine-daily.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("eu-central-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("eu-west-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "xrengine-daily.aliyuncs.com"),
            new TeaPair("me-east-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "xrengine-daily.aliyuncs.com"),
            new TeaPair("us-east-1", "xrengine-daily.aliyuncs.com"),
            new TeaPair("us-west-1", "xrengine-daily.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("xrengine", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>用户签署协议</p>
     * 
     * @param request AcceptAgreementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptAgreementResponse
     */
    public AcceptAgreementResponse acceptAgreementWithOptions(AcceptAgreementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptAgreement"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptAgreementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户签署协议</p>
     * 
     * @param request AcceptAgreementRequest
     * @return AcceptAgreementResponse
     */
    public AcceptAgreementResponse acceptAgreement(AcceptAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptAgreementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加白名单（云账号）</p>
     * 
     * @param request AddWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWhitelistResponse
     */
    public AddWhitelistResponse addWhitelistWithOptions(AddWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            body.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWhitelist"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加白名单（云账号）</p>
     * 
     * @param request AddWhitelistRequest
     * @return AddWhitelistResponse
     */
    public AddWhitelistResponse addWhitelist(AddWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请ai试衣服务</p>
     * 
     * @param request ApplyForTryOnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyForTryOnResponse
     */
    public ApplyForTryOnResponse applyForTryOnWithOptions(ApplyForTryOnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyForTryOn"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyForTryOnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请ai试衣服务</p>
     * 
     * @param request ApplyForTryOnRequest
     * @return ApplyForTryOnResponse
     */
    public ApplyForTryOnResponse applyForTryOn(ApplyForTryOnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyForTryOnWithOptions(request, runtime);
    }

    /**
     * @param request AuthUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthUserResponse
     */
    public AuthUserResponse authUserWithOptions(AuthUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthUser"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthUserResponse());
    }

    /**
     * @param request AuthUserRequest
     * @return AuthUserResponse
     */
    public AuthUserResponse authUser(AuthUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authUserWithOptions(request, runtime);
    }

    /**
     * @param tmpReq BatchCreateSvcMapBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateSvcMapBindResponse
     */
    public BatchCreateSvcMapBindResponse batchCreateSvcMapBindWithOptions(BatchCreateSvcMapBindRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateSvcMapBindShrinkRequest request = new BatchCreateSvcMapBindShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mapIds)) {
            request.mapIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mapIds, "MapIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapIdsShrink)) {
            body.put("MapIds", request.mapIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcId)) {
            body.put("SvcId", request.svcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateSvcMapBind"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateSvcMapBindResponse());
    }

    /**
     * @param request BatchCreateSvcMapBindRequest
     * @return BatchCreateSvcMapBindResponse
     */
    public BatchCreateSvcMapBindResponse batchCreateSvcMapBind(BatchCreateSvcMapBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateSvcMapBindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消关联</p>
     * 
     * @param tmpReq BatchDeleteSvcMapBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteSvcMapBindResponse
     */
    public BatchDeleteSvcMapBindResponse batchDeleteSvcMapBindWithOptions(BatchDeleteSvcMapBindRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteSvcMapBindShrinkRequest request = new BatchDeleteSvcMapBindShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteSvcMapBind"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteSvcMapBindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消关联</p>
     * 
     * @param request BatchDeleteSvcMapBindRequest
     * @return BatchDeleteSvcMapBindResponse
     */
    public BatchDeleteSvcMapBindResponse batchDeleteSvcMapBind(BatchDeleteSvcMapBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteSvcMapBindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>构建项目</p>
     * 
     * @param request BuildProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuildProjectResponse
     */
    public BuildProjectResponse buildProjectWithOptions(BuildProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoName)) {
            query.put("VideoName", request.videoName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuildProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuildProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>构建项目</p>
     * 
     * @param request BuildProjectRequest
     * @return BuildProjectResponse
     */
    public BuildProjectResponse buildProject(BuildProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buildProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建，同时创建空白的pai占位</p>
     * 
     * @param request CreateLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLocationServiceResponse
     */
    public CreateLocationServiceResponse createLocationServiceWithOptions(CreateLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qps)) {
            body.put("Qps", request.qps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLocationServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建，同时创建空白的pai占位</p>
     * 
     * @param request CreateLocationServiceRequest
     * @return CreateLocationServiceResponse
     */
    public CreateLocationServiceResponse createLocationService(CreateLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tryOnParams)) {
            request.tryOnParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tryOnParams, "TryOnParams", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuild)) {
            body.put("AutoBuild", request.autoBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependencies)) {
            body.put("Dependencies", request.dependencies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            body.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intro)) {
            body.put("Intro", request.intro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapUuid)) {
            body.put("MapUuid", request.mapUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tryOnParamsShrink)) {
            body.put("TryOnParams", request.tryOnParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            body.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建素材上传policy</p>
     * 
     * @param request CreateSourcePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSourcePolicyResponse
     */
    public CreateSourcePolicyResponse createSourcePolicyWithOptions(CreateSourcePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSourcePolicy"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSourcePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建素材上传policy</p>
     * 
     * @param request CreateSourcePolicyRequest
     * @return CreateSourcePolicyResponse
     */
    public CreateSourcePolicyResponse createSourcePolicy(CreateSourcePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSourcePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目信息</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目信息</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteSourceFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSourceFileResponse
     */
    public DeleteSourceFileResponse deleteSourceFileWithOptions(DeleteSourceFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSourceFile"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSourceFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteSourceFileRequest
     * @return DeleteSourceFileResponse
     */
    public DeleteSourceFileResponse deleteSourceFile(DeleteSourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSourceFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>1校验部署状态，一期不支持二次部署。相关关联记录里状态智能变更</p>
     * 
     * @param request DeployLocationTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployLocationTreeResponse
     */
    public DeployLocationTreeResponse deployLocationTreeWithOptions(DeployLocationTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceUpdate)) {
            body.put("ForceUpdate", request.forceUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcId)) {
            body.put("SvcId", request.svcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployLocationTree"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployLocationTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>1校验部署状态，一期不支持二次部署。相关关联记录里状态智能变更</p>
     * 
     * @param request DeployLocationTreeRequest
     * @return DeployLocationTreeResponse
     */
    public DeployLocationTreeResponse deployLocationTree(DeployLocationTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployLocationTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查出绑定记录</p>
     * 
     * @param request FindSvcMapBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindSvcMapBindResponse
     */
    public FindSvcMapBindResponse findSvcMapBindWithOptions(FindSvcMapBindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcId)) {
            body.put("SvcId", request.svcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindSvcMapBind"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindSvcMapBindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查出绑定记录</p>
     * 
     * @param request FindSvcMapBindRequest
     * @return FindSvcMapBindResponse
     */
    public FindSvcMapBindResponse findSvcMapBind(FindSvcMapBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findSvcMapBindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户申请状态</p>
     * 
     * @param request GetApplyStatusForTryOnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplyStatusForTryOnResponse
     */
    public GetApplyStatusForTryOnResponse getApplyStatusForTryOnWithOptions(GetApplyStatusForTryOnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplyStatusForTryOn"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplyStatusForTryOnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户申请状态</p>
     * 
     * @param request GetApplyStatusForTryOnRequest
     * @return GetApplyStatusForTryOnResponse
     */
    public GetApplyStatusForTryOnResponse getApplyStatusForTryOn(GetApplyStatusForTryOnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplyStatusForTryOnWithOptions(request, runtime);
    }

    /**
     * @param request GetArEditCommonMaterialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArEditCommonMaterialResponse
     */
    public GetArEditCommonMaterialResponse getArEditCommonMaterialWithOptions(GetArEditCommonMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArEditCommonMaterial"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArEditCommonMaterialResponse());
    }

    /**
     * @param request GetArEditCommonMaterialRequest
     * @return GetArEditCommonMaterialResponse
     */
    public GetArEditCommonMaterialResponse getArEditCommonMaterial(GetArEditCommonMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArEditCommonMaterialWithOptions(request, runtime);
    }

    /**
     * @param request GetArEditStsAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArEditStsAuthResponse
     */
    public GetArEditStsAuthResponse getArEditStsAuthWithOptions(GetArEditStsAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapId)) {
            body.put("MapId", request.mapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArEditStsAuth"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArEditStsAuthResponse());
    }

    /**
     * @param request GetArEditStsAuthRequest
     * @return GetArEditStsAuthResponse
     */
    public GetArEditStsAuthResponse getArEditStsAuth(GetArEditStsAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArEditStsAuthWithOptions(request, runtime);
    }

    /**
     * @param request GetArEditUgcMaterialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArEditUgcMaterialResponse
     */
    public GetArEditUgcMaterialResponse getArEditUgcMaterialWithOptions(GetArEditUgcMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapId)) {
            body.put("MapId", request.mapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArEditUgcMaterial"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArEditUgcMaterialResponse());
    }

    /**
     * @param request GetArEditUgcMaterialRequest
     * @return GetArEditUgcMaterialResponse
     */
    public GetArEditUgcMaterialResponse getArEditUgcMaterial(GetArEditUgcMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getArEditUgcMaterialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目模型详情</p>
     * 
     * @param request GetProjectDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectDatasetResponse
     */
    public GetProjectDatasetResponse getProjectDatasetWithOptions(GetProjectDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectDataset"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目模型详情</p>
     * 
     * @param request GetProjectDatasetRequest
     * @return GetProjectDatasetResponse
     */
    public GetProjectDatasetResponse getProjectDataset(GetProjectDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用同步算法</p>
     * 
     * @param tmpReq InvokeSyncAlgorithmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeSyncAlgorithmResponse
     */
    public InvokeSyncAlgorithmResponse invokeSyncAlgorithmWithOptions(InvokeSyncAlgorithmRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvokeSyncAlgorithmShrinkRequest request = new InvokeSyncAlgorithmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeSyncAlgorithm"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeSyncAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用同步算法</p>
     * 
     * @param request InvokeSyncAlgorithmRequest
     * @return InvokeSyncAlgorithmResponse
     */
    public InvokeSyncAlgorithmResponse invokeSyncAlgorithm(InvokeSyncAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeSyncAlgorithmWithOptions(request, runtime);
    }

    /**
     * @param request ListAreaMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAreaMapResponse
     */
    public ListAreaMapResponse listAreaMapWithOptions(ListAreaMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAreaMap"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAreaMapResponse());
    }

    /**
     * @param request ListAreaMapRequest
     * @return ListAreaMapResponse
     */
    public ListAreaMapResponse listAreaMap(ListAreaMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAreaMapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举服饰类型</p>
     * 
     * @param request ListClothTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClothTypesResponse
     */
    public ListClothTypesResponse listClothTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClothTypes"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClothTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举服饰类型</p>
     * @return ListClothTypesResponse
     */
    public ListClothTypesResponse listClothTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClothTypesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举服饰</p>
     * 
     * @param tmpReq ListClothesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClothesResponse
     */
    public ListClothesResponse listClothesWithOptions(ListClothesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClothesShrinkRequest request = new ListClothesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categories)) {
            request.categoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categories, "Categories", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoriesShrink)) {
            query.put("Categories", request.categoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clothSize)) {
            query.put("ClothSize", request.clothSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClothes"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClothesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举服饰</p>
     * 
     * @param request ListClothesRequest
     * @return ListClothesResponse
     */
    public ListClothesResponse listClothes(ListClothesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClothesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>hdr文件目录列表</p>
     * 
     * @param request ListHdrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHdrResponse
     */
    public ListHdrResponse listHdrWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHdr"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHdrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>hdr文件目录列表</p>
     * @return ListHdrResponse
     */
    public ListHdrResponse listHdr() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHdrWithOptions(runtime);
    }

    /**
     * @param request ListLocationPaiImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLocationPaiImageResponse
     */
    public ListLocationPaiImageResponse listLocationPaiImageWithOptions(ListLocationPaiImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLocationPaiImage"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLocationPaiImageResponse());
    }

    /**
     * @param request ListLocationPaiImageRequest
     * @return ListLocationPaiImageResponse
     */
    public ListLocationPaiImageResponse listLocationPaiImage(ListLocationPaiImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLocationPaiImageWithOptions(request, runtime);
    }

    /**
     * @param request ListLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLocationServiceResponse
     */
    public ListLocationServiceResponse listLocationServiceWithOptions(ListLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLocationServiceResponse());
    }

    /**
     * @param request ListLocationServiceRequest
     * @return ListLocationServiceResponse
     */
    public ListLocationServiceResponse listLocationService(ListLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出当前用户项目列表</p>
     * 
     * @param request ListProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizUsage)) {
            body.put("BizUsage", request.bizUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedBizUsage)) {
            body.put("ExcludedBizUsage", request.excludedBizUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withSource)) {
            body.put("WithSource", request.withSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withUser)) {
            body.put("WithUser", request.withUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出当前用户项目列表</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据项目Id查出依赖当前项目的项目</p>
     * 
     * @param request ListProjectsByDependencyIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsByDependencyIdResponse
     */
    public ListProjectsByDependencyIdResponse listProjectsByDependencyIdWithOptions(ListProjectsByDependencyIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dependencyProjectId)) {
            body.put("DependencyProjectId", request.dependencyProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapUuid)) {
            body.put("MapUuid", request.mapUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDataset)) {
            body.put("WithDataset", request.withDataset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withSource)) {
            body.put("WithSource", request.withSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectsByDependencyId"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsByDependencyIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据项目Id查出依赖当前项目的项目</p>
     * 
     * @param request ListProjectsByDependencyIdRequest
     * @return ListProjectsByDependencyIdResponse
     */
    public ListProjectsByDependencyIdResponse listProjectsByDependencyId(ListProjectsByDependencyIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsByDependencyIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举项目中上传的文件列表</p>
     * 
     * @param request ListSourceFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSourceFileResponse
     */
    public ListSourceFileResponse listSourceFileWithOptions(ListSourceFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSourceFile"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSourceFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举项目中上传的文件列表</p>
     * 
     * @param request ListSourceFileRequest
     * @return ListSourceFileResponse
     */
    public ListSourceFileResponse listSourceFile(ListSourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSourceFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举流水线</p>
     * 
     * @param request ListWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflowWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflow"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举流水线</p>
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflow() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowWithOptions(runtime);
    }

    /**
     * @param request LoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoginResponse
     */
    public LoginResponse loginWithOptions(LoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.empId)) {
            body.put("EmpId", request.empId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.empName)) {
            body.put("EmpName", request.empName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Login"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoginResponse());
    }

    /**
     * @param request LoginRequest
     * @return LoginResponse
     */
    public LoginResponse login(LoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loginWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>无线端APP登陆</p>
     * 
     * @param request LoginAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoginAppResponse
     */
    public LoginAppResponse loginAppWithOptions(LoginAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.empId)) {
            body.put("EmpId", request.empId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.empName)) {
            body.put("EmpName", request.empName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoginApp"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoginAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>无线端APP登陆</p>
     * 
     * @param request LoginAppRequest
     * @return LoginAppResponse
     */
    public LoginAppResponse loginApp(LoginAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loginAppWithOptions(request, runtime);
    }

    /**
     * @param request PublishArEditProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishArEditProjectResponse
     */
    public PublishArEditProjectResponse publishArEditProjectWithOptions(PublishArEditProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapId)) {
            body.put("MapId", request.mapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishArEditProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishArEditProjectResponse());
    }

    /**
     * @param request PublishArEditProjectRequest
     * @return PublishArEditProjectResponse
     */
    public PublishArEditProjectResponse publishArEditProject(PublishArEditProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishArEditProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>项目发布</p>
     * 
     * @param request PublishProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishProjectResponse
     */
    public PublishProjectResponse publishProjectWithOptions(PublishProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目发布</p>
     * 
     * @param request PublishProjectRequest
     * @return PublishProjectResponse
     */
    public PublishProjectResponse publishProject(PublishProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishProjectWithOptions(request, runtime);
    }

    /**
     * @param request QueryAreaMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAreaMapResponse
     */
    public QueryAreaMapResponse queryAreaMapWithOptions(QueryAreaMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAreaMap"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAreaMapResponse());
    }

    /**
     * @param request QueryAreaMapRequest
     * @return QueryAreaMapResponse
     */
    public QueryAreaMapResponse queryAreaMap(QueryAreaMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAreaMapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找项目构建失败时的信息</p>
     * 
     * @param request QueryBuildBreakpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBuildBreakpointResponse
     */
    public QueryBuildBreakpointResponse queryBuildBreakpointWithOptions(QueryBuildBreakpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBuildBreakpoint"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBuildBreakpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查找项目构建失败时的信息</p>
     * 
     * @param request QueryBuildBreakpointRequest
     * @return QueryBuildBreakpointResponse
     */
    public QueryBuildBreakpointResponse queryBuildBreakpoint(QueryBuildBreakpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBuildBreakpointWithOptions(request, runtime);
    }

    /**
     * @param request QueryLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLocationServiceResponse
     */
    public QueryLocationServiceResponse queryLocationServiceWithOptions(QueryLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLocationServiceResponse());
    }

    /**
     * @param request QueryLocationServiceRequest
     * @return QueryLocationServiceResponse
     */
    public QueryLocationServiceResponse queryLocationService(QueryLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目构建详情</p>
     * 
     * @param request QueryProjectBuildDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProjectBuildDetailResponse
     */
    public QueryProjectBuildDetailResponse queryProjectBuildDetailWithOptions(QueryProjectBuildDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProjectBuildDetail"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProjectBuildDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目构建详情</p>
     * 
     * @param request QueryProjectBuildDetailRequest
     * @return QueryProjectBuildDetailResponse
     */
    public QueryProjectBuildDetailResponse queryProjectBuildDetail(QueryProjectBuildDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProjectBuildDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request QueryProjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProjectDetailResponse
     */
    public QueryProjectDetailResponse queryProjectDetailWithOptions(QueryProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProjectDetail"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProjectDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request QueryProjectDetailRequest
     * @return QueryProjectDetailResponse
     */
    public QueryProjectDetailResponse queryProjectDetail(QueryProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProjectDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>该注册接口只用于oneconsole页面的注册</p>
     * 
     * @param request RegisterUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterUserResponse
     */
    public RegisterUserResponse registerUserWithOptions(RegisterUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterUser"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>该注册接口只用于oneconsole页面的注册</p>
     * 
     * @param request RegisterUserRequest
     * @return RegisterUserResponse
     */
    public RegisterUserResponse registerUser(RegisterUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerUserWithOptions(request, runtime);
    }

    /**
     * @param request ResumeLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeLocationServiceResponse
     */
    public ResumeLocationServiceResponse resumeLocationServiceWithOptions(ResumeLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeLocationServiceResponse());
    }

    /**
     * @param request ResumeLocationServiceRequest
     * @return ResumeLocationServiceResponse
     */
    public ResumeLocationServiceResponse resumeLocationService(ResumeLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeLocationServiceWithOptions(request, runtime);
    }

    /**
     * @param request SaveArEditProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveArEditProjectResponse
     */
    public SaveArEditProjectResponse saveArEditProjectWithOptions(SaveArEditProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapId)) {
            body.put("MapId", request.mapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveArEditProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveArEditProjectResponse());
    }

    /**
     * @param request SaveArEditProjectRequest
     * @return SaveArEditProjectResponse
     */
    public SaveArEditProjectResponse saveArEditProject(SaveArEditProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveArEditProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存素材</p>
     * 
     * @param request SaveSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSourceResponse
     */
    public SaveSourceResponse saveSourceWithOptions(SaveSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeStatus)) {
            query.put("ChangeStatus", request.changeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needCheck)) {
            query.put("NeedCheck", request.needCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSource"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存素材</p>
     * 
     * @param request SaveSourceRequest
     * @return SaveSourceResponse
     */
    public SaveSourceResponse saveSource(SaveSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSourceWithOptions(request, runtime);
    }

    /**
     * @param request SuspendLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendLocationServiceResponse
     */
    public SuspendLocationServiceResponse suspendLocationServiceWithOptions(SuspendLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendLocationServiceResponse());
    }

    /**
     * @param request SuspendLocationServiceRequest
     * @return SuspendLocationServiceResponse
     */
    public SuspendLocationServiceResponse suspendLocationService(SuspendLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>项目(发布状态改回隐私状态)</p>
     * 
     * @param request UnPublishProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnPublishProjectResponse
     */
    public UnPublishProjectResponse unPublishProjectWithOptions(UnPublishProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnPublishProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnPublishProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目(发布状态改回隐私状态)</p>
     * 
     * @param request UnPublishProjectRequest
     * @return UnPublishProjectResponse
     */
    public UnPublishProjectResponse unPublishProject(UnPublishProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unPublishProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>如果不包含treeConfig则只是简单更新</p>
     * 
     * @param request UpdateLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLocationServiceResponse
     */
    public UpdateLocationServiceResponse updateLocationServiceWithOptions(UpdateLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qps)) {
            body.put("Qps", request.qps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcName)) {
            body.put("SvcName", request.svcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.svcState)) {
            body.put("SvcState", request.svcState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLocationService"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLocationServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>如果不包含treeConfig则只是简单更新</p>
     * 
     * @param request UpdateLocationServiceRequest
     * @return UpdateLocationServiceResponse
     */
    public UpdateLocationServiceResponse updateLocationService(UpdateLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂存接口比较复杂，单独拎出来</p>
     * 
     * @param request UpdateLocationTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLocationTreeResponse
     */
    public UpdateLocationTreeResponse updateLocationTreeWithOptions(UpdateLocationTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            body.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.treeConfig)) {
            body.put("TreeConfig", request.treeConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLocationTree"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLocationTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂存接口比较复杂，单独拎出来</p>
     * 
     * @param request UpdateLocationTreeRequest
     * @return UpdateLocationTreeResponse
     */
    public UpdateLocationTreeResponse updateLocationTree(UpdateLocationTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLocationTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目信息</p>
     * 
     * @param tmpReq UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProjectShrinkRequest request = new UpdateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "Ext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBuild)) {
            query.put("AutoBuild", request.autoBuild);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            query.put("Ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intro)) {
            query.put("Intro", request.intro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("JwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2022-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目信息</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }
}
