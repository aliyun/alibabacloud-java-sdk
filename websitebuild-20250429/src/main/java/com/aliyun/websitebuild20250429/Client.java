// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429;

import com.aliyun.tea.*;
import com.aliyun.websitebuild20250429.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("websitebuild", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>提交创建Logo任务</p>
     * 
     * @param request CreateLogoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogoTaskResponse
     */
    public CreateLogoTaskResponse createLogoTaskWithOptions(CreateLogoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logoVersion)) {
            query.put("LogoVersion", request.logoVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.negativePrompt)) {
            query.put("NegativePrompt", request.negativePrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogoTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交创建Logo任务</p>
     * 
     * @param request CreateLogoTaskRequest
     * @return CreateLogoTaskResponse
     */
    public CreateLogoTaskResponse createLogoTask(CreateLogoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogoTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Logo创建任务</p>
     * 
     * @param request GetCreateLogoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateLogoTaskResponse
     */
    public GetCreateLogoTaskResponse getCreateLogoTaskWithOptions(GetCreateLogoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateLogoTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateLogoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Logo创建任务</p>
     * 
     * @param request GetCreateLogoTaskRequest
     * @return GetCreateLogoTaskResponse
     */
    public GetCreateLogoTaskResponse getCreateLogoTask(GetCreateLogoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateLogoTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用</p>
     * 
     * @param request OperateAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppInstanceForPartnerResponse
     */
    public OperateAppInstanceForPartnerResponse operateAppInstanceForPartnerWithOptions(OperateAppInstanceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEvent)) {
            query.put("OperateEvent", request.operateEvent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用</p>
     * 
     * @param request OperateAppInstanceForPartnerRequest
     * @return OperateAppInstanceForPartnerResponse
     */
    public OperateAppInstanceForPartnerResponse operateAppInstanceForPartner(OperateAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppInstanceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用服务</p>
     * 
     * @param request OperateAppServiceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppServiceForPartnerResponse
     */
    public OperateAppServiceForPartnerResponse operateAppServiceForPartnerWithOptions(OperateAppServiceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEvent)) {
            query.put("OperateEvent", request.operateEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAppServiceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppServiceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用服务</p>
     * 
     * @param request OperateAppServiceForPartnerRequest
     * @return OperateAppServiceForPartnerResponse
     */
    public OperateAppServiceForPartnerResponse operateAppServiceForPartner(OperateAppServiceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppServiceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片检索</p>
     * 
     * @param tmpReq SearchImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageResponse
     */
    public SearchImageResponse searchImageWithOptions(SearchImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchImageShrinkRequest request = new SearchImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.colorHex)) {
            query.put("ColorHex", request.colorHex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasPerson)) {
            query.put("HasPerson", request.hasPerson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCategory)) {
            query.put("ImageCategory", request.imageCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRatio)) {
            query.put("ImageRatio", request.imageRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeight)) {
            query.put("MaxHeight", request.maxHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxWidth)) {
            query.put("MaxWidth", request.maxWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeight)) {
            query.put("MinHeight", request.minHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minWidth)) {
            query.put("MinWidth", request.minWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImage"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片检索</p>
     * 
     * @param request SearchImageRequest
     * @return SearchImageResponse
     */
    public SearchImageResponse searchImage(SearchImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴同步应用实例</p>
     * 
     * @param tmpReq SyncAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncAppInstanceForPartnerResponse
     */
    public SyncAppInstanceForPartnerResponse syncAppInstanceForPartnerWithOptions(SyncAppInstanceForPartnerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncAppInstanceForPartnerShrinkRequest request = new SyncAppInstanceForPartnerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appInstance)) {
            request.appInstanceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appInstance, "AppInstance", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceShrink)) {
            query.put("AppInstance", request.appInstanceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBizId)) {
            query.put("SourceBizId", request.sourceBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴同步应用实例</p>
     * 
     * @param request SyncAppInstanceForPartnerRequest
     * @return SyncAppInstanceForPartnerResponse
     */
    public SyncAppInstanceForPartnerResponse syncAppInstanceForPartner(SyncAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncAppInstanceForPartnerWithOptions(request, runtime);
    }
}
