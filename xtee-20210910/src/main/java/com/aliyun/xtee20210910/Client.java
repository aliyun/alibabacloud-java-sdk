// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910;

import com.aliyun.tea.*;
import com.aliyun.xtee20210910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("xtee", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>变量绑定操作</p>
     * 
     * @param request BindVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindVariableResponse
     */
    public BindVariableResponse bindVariableWithOptions(BindVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiRegionId)) {
            query.put("apiRegionId", request.apiRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defineId)) {
            query.put("defineId", request.defineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defineIds)) {
            query.put("defineIds", request.defineIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exceptionValue)) {
            query.put("exceptionValue", request.exceptionValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputField)) {
            query.put("outputField", request.outputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("outputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsList)) {
            query.put("paramsList", request.paramsList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变量绑定操作</p>
     * 
     * @param request BindVariableRequest
     * @return BindVariableResponse
     */
    public BindVariableResponse bindVariable(BindVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验累计变量数目是否超过限定值</p>
     * 
     * @param request CheckCustVariableLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCustVariableLimitResponse
     */
    public CheckCustVariableLimitResponse checkCustVariableLimitWithOptions(CheckCustVariableLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCustVariableLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCustVariableLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验累计变量数目是否超过限定值</p>
     * 
     * @param request CheckCustVariableLimitRequest
     * @return CheckCustVariableLimitResponse
     */
    public CheckCustVariableLimitResponse checkCustVariableLimit(CheckCustVariableLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCustVariableLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验创建变量是否超过上限</p>
     * 
     * @param request CheckExpressionVariableLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckExpressionVariableLimitResponse
     */
    public CheckExpressionVariableLimitResponse checkExpressionVariableLimitWithOptions(CheckExpressionVariableLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckExpressionVariableLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckExpressionVariableLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验创建变量是否超过上限</p>
     * 
     * @param request CheckExpressionVariableLimitRequest
     * @return CheckExpressionVariableLimitResponse
     */
    public CheckExpressionVariableLimitResponse checkExpressionVariableLimit(CheckExpressionVariableLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkExpressionVariableLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验字段数目是否操过限定值</p>
     * 
     * @param request CheckFieldLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckFieldLimitResponse
     */
    public CheckFieldLimitResponse checkFieldLimitWithOptions(CheckFieldLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFieldLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFieldLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验字段数目是否操过限定值</p>
     * 
     * @param request CheckFieldLimitRequest
     * @return CheckFieldLimitResponse
     */
    public CheckFieldLimitResponse checkFieldLimit(CheckFieldLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFieldLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运营权限检查</p>
     * 
     * @param request CheckPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckPermissionResponse
     */
    public CheckPermissionResponse checkPermissionWithOptions(CheckPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckPermission"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运营权限检查</p>
     * 
     * @param request CheckPermissionRequest
     * @return CheckPermissionResponse
     */
    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验变量引用</p>
     * 
     * @param request CheckUsageVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUsageVariableResponse
     */
    public CheckUsageVariableResponse checkUsageVariableWithOptions(CheckUsageVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUsageVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUsageVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验变量引用</p>
     * 
     * @param request CheckUsageVariableRequest
     * @return CheckUsageVariableResponse
     */
    public CheckUsageVariableResponse checkUsageVariable(CheckUsageVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUsageVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清除名单</p>
     * 
     * @param request ClearNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearNameListResponse
     */
    public ClearNameListResponse clearNameListWithOptions(ClearNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清除名单</p>
     * 
     * @param request ClearNameListRequest
     * @return ClearNameListResponse
     */
    public ClearNameListResponse clearNameList(ClearNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增查询条件</p>
     * 
     * @param request CreateAnalysisConditionFavoriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnalysisConditionFavoriteResponse
     */
    public CreateAnalysisConditionFavoriteResponse createAnalysisConditionFavoriteWithOptions(CreateAnalysisConditionFavoriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBeginTime)) {
            query.put("eventBeginTime", request.eventBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventEndTime)) {
            query.put("eventEndTime", request.eventEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("fieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("fieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnalysisConditionFavorite"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnalysisConditionFavoriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增查询条件</p>
     * 
     * @param request CreateAnalysisConditionFavoriteRequest
     * @return CreateAnalysisConditionFavoriteResponse
     */
    public CreateAnalysisConditionFavoriteResponse createAnalysisConditionFavorite(CreateAnalysisConditionFavoriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAnalysisConditionFavoriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建导出任务</p>
     * 
     * @param request CreateAnalysisExportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnalysisExportTaskResponse
     */
    public CreateAnalysisExportTaskResponse createAnalysisExportTaskWithOptions(CreateAnalysisExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            query.put("conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBeginTime)) {
            query.put("eventBeginTime", request.eventBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventEndTime)) {
            query.put("eventEndTime", request.eventEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("fieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("fieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            query.put("fileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnalysisExportTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnalysisExportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建导出任务</p>
     * 
     * @param request CreateAnalysisExportTaskRequest
     * @return CreateAnalysisExportTaskResponse
     */
    public CreateAnalysisExportTaskResponse createAnalysisExportTask(CreateAnalysisExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAnalysisExportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建appKey</p>
     * 
     * @param request CreateAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppKeyResponse
     */
    public CreateAppKeyResponse createAppKeyWithOptions(CreateAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppKey"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建appKey</p>
     * 
     * @param request CreateAppKeyRequest
     * @return CreateAppKeyResponse
     */
    public CreateAppKeyResponse createAppKey(CreateAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增用户授权</p>
     * 
     * @param request CreateAuthorizationUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorizationUserResponse
     */
    public CreateAuthorizationUserResponse createAuthorizationUserWithOptions(CreateAuthorizationUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindId)) {
            query.put("bindId", request.bindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTemplateId)) {
            query.put("eventTemplateId", request.eventTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorizationUser"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增用户授权</p>
     * 
     * @param request CreateAuthorizationUserRequest
     * @return CreateAuthorizationUserResponse
     */
    public CreateAuthorizationUserResponse createAuthorizationUser(CreateAuthorizationUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthorizationUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建累计变量</p>
     * 
     * @param request CreateCustVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustVariableResponse
     */
    public CreateCustVariableResponse createCustVariableWithOptions(CreateCustVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyValueType)) {
            query.put("historyValueType", request.historyValueType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.object)) {
            query.put("object", request.object);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            query.put("timeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.twCount)) {
            query.put("twCount", request.twCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.velocityFC)) {
            query.put("velocityFC", request.velocityFC);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.velocityTW)) {
            query.put("velocityTW", request.velocityTW);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建累计变量</p>
     * 
     * @param request CreateCustVariableRequest
     * @return CreateCustVariableResponse
     */
    public CreateCustVariableResponse createCustVariable(CreateCustVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增数据源</p>
     * 
     * @param request CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("ossKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增数据源</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建事件</p>
     * 
     * @param request CreateEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventResponse
     */
    public CreateEventResponse createEventWithOptions(CreateEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputFieldsStr)) {
            query.put("inputFieldsStr", request.inputFieldsStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("templateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建事件</p>
     * 
     * @param request CreateEventRequest
     * @return CreateEventResponse
     */
    public CreateEventResponse createEvent(CreateEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义变量</p>
     * 
     * @param request CreateExpressionVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExpressionVariableResponse
     */
    public CreateExpressionVariableResponse createExpressionVariableWithOptions(CreateExpressionVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionTitle)) {
            query.put("expressionTitle", request.expressionTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariable)) {
            query.put("expressionVariable", request.expressionVariable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlier)) {
            query.put("outlier", request.outlier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressionVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressionVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义变量</p>
     * 
     * @param request CreateExpressionVariableRequest
     * @return CreateExpressionVariableResponse
     */
    public CreateExpressionVariableResponse createExpressionVariable(CreateExpressionVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressionVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增字段</p>
     * 
     * @param request CreateFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFieldResponse
     */
    public CreateFieldResponse createFieldWithOptions(CreateFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enumData)) {
            query.put("enumData", request.enumData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateField"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增字段</p>
     * 
     * @param request CreateFieldRequest
     * @return CreateFieldResponse
     */
    public CreateFieldResponse createField(CreateFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社群打标</p>
     * 
     * @param request CreateGroupSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupSignResponse
     */
    public CreateGroupSignResponse createGroupSignWithOptions(CreateGroupSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signList)) {
            query.put("SignList", request.signList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupSign"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>社群打标</p>
     * 
     * @param request CreateGroupSignRequest
     * @return CreateGroupSignResponse
     */
    public CreateGroupSignResponse createGroupSign(CreateGroupSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupSignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建监控任务</p>
     * 
     * @param request CreateMonitorTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorTaskResponse
     */
    public CreateMonitorTaskResponse createMonitorTaskWithOptions(CreateMonitorTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            query.put("cycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listdayStr)) {
            query.put("listdayStr", request.listdayStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建监控任务</p>
     * 
     * @param request CreateMonitorTaskRequest
     * @return CreateMonitorTaskResponse
     */
    public CreateMonitorTaskResponse createMonitorTask(CreateMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建poc</p>
     * 
     * @param request CreatePocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePocResponse
     */
    public CreatePocResponse createPocWithOptions(CreatePocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configStr)) {
            query.put("configStr", request.configStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("fileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("serviceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePoc"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePocResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建poc</p>
     * 
     * @param request CreatePocRequest
     * @return CreatePocResponse
     */
    public CreatePocResponse createPoc(CreatePocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建poc</p>
     * 
     * @param request CreatePocEvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePocEvResponse
     */
    public CreatePocEvResponse createPocEvWithOptions(CreatePocEvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateFormat)) {
            query.put("DateFormat", request.dateFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tab)) {
            query.put("Tab", request.tab);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePocEv"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePocEvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建poc</p>
     * 
     * @param request CreatePocEvRequest
     * @return CreatePocEvResponse
     */
    public CreatePocEvResponse createPocEv(CreatePocEvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPocEvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义查询变量新增</p>
     * 
     * @param request CreateQueryVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueryVariableResponse
     */
    public CreateQueryVariableResponse createQueryVariableWithOptions(CreateQueryVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceCode)) {
            query.put("dataSourceCode", request.dataSourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionTitle)) {
            query.put("expressionTitle", request.expressionTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariable)) {
            query.put("expressionVariable", request.expressionVariable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlier)) {
            query.put("outlier", request.outlier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueryVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueryVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义查询变量新增</p>
     * 
     * @param request CreateQueryVariableRequest
     * @return CreateQueryVariableResponse
     */
    public CreateQueryVariableResponse createQueryVariable(CreateQueryVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueryVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建推荐事件策略</p>
     * 
     * @param request CreateRecommendEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecommendEventRuleResponse
     */
    public CreateRecommendEventRuleResponse createRecommendEventRuleWithOptions(CreateRecommendEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendRuleIdsStr)) {
            query.put("recommendRuleIdsStr", request.recommendRuleIdsStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecommendEventRule"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecommendEventRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建推荐事件策略</p>
     * 
     * @param request CreateRecommendEventRuleRequest
     * @return CreateRecommendEventRuleResponse
     */
    public CreateRecommendEventRuleResponse createRecommendEventRule(CreateRecommendEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecommendEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建推荐任务</p>
     * 
     * @param request CreateRecommendTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecommendTaskResponse
     */
    public CreateRecommendTaskResponse createRecommendTaskWithOptions(CreateRecommendTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleId)) {
            query.put("sampleId", request.sampleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variablesStr)) {
            query.put("variablesStr", request.variablesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.velocitiesStr)) {
            query.put("velocitiesStr", request.velocitiesStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecommendTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecommendTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建推荐任务</p>
     * 
     * @param request CreateRecommendTaskRequest
     * @return CreateRecommendTaskResponse
     */
    public CreateRecommendTaskResponse createRecommendTask(CreateRecommendTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecommendTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>补充上传</p>
     * 
     * @param request CreateReplenishTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReplenishTaskResponse
     */
    public CreateReplenishTaskResponse createReplenishTaskWithOptions(CreateReplenishTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientFileName)) {
            query.put("ClientFileName", request.clientFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPath)) {
            query.put("ClientPath", request.clientPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReplenishTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReplenishTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>补充上传</p>
     * 
     * @param request CreateReplenishTaskRequest
     * @return CreateReplenishTaskResponse
     */
    public CreateReplenishTaskResponse createReplenishTask(CreateReplenishTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReplenishTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略&amp;版本</p>
     * 
     * @param request CreateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicExpression)) {
            query.put("logicExpression", request.logicExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("ruleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleExpressions)) {
            query.put("ruleExpressions", request.ruleExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建策略&amp;版本</p>
     * 
     * @param request CreateRuleRequest
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加样本</p>
     * 
     * @param request CreateSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleResponse
     */
    public CreateSampleResponse createSampleWithOptions(CreateSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientFileName)) {
            query.put("clientFileName", request.clientFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPath)) {
            query.put("clientPath", request.clientPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("fileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleTag)) {
            query.put("sampleTag", request.sampleTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleType)) {
            query.put("sampleType", request.sampleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleValues)) {
            query.put("sampleValues", request.sampleValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("uploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSample"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加样本</p>
     * 
     * @param request CreateSampleRequest
     * @return CreateSampleResponse
     */
    public CreateSampleResponse createSample(CreateSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSampleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户级别单API创建样本批</p>
     * 
     * @param request CreateSampleApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleApiResponse
     */
    public CreateSampleApiResponse createSampleApiWithOptions(CreateSampleApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleBatchType)) {
            query.put("SampleBatchType", request.sampleBatchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceList)) {
            query.put("ServiceList", request.serviceList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSampleApi"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户级别单API创建样本批</p>
     * 
     * @param request CreateSampleApiRequest
     * @return CreateSampleApiResponse
     */
    public CreateSampleApiResponse createSampleApi(CreateSampleApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSampleApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本数据</p>
     * 
     * @param request CreateSampleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleDataResponse
     */
    public CreateSampleDataResponse createSampleDataWithOptions(CreateSampleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("encryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskValue)) {
            query.put("riskValue", request.riskValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storePath)) {
            query.put("storePath", request.storePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            query.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSampleData"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本数据</p>
     * 
     * @param request CreateSampleDataRequest
     * @return CreateSampleDataResponse
     */
    public CreateSampleDataResponse createSampleData(CreateSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSampleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateSimulationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimulationTaskResponse
     */
    public CreateSimulationTaskResponse createSimulationTaskWithOptions(CreateSimulationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            query.put("dataSourceConfig", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("dataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersStr)) {
            query.put("filtersStr", request.filtersStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesStr)) {
            query.put("rulesStr", request.rulesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runTask)) {
            query.put("runTask", request.runTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimulationTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimulationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateSimulationTaskRequest
     * @return CreateSimulationTaskResponse
     */
    public CreateSimulationTaskResponse createSimulationTask(CreateSimulationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimulationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientFileName)) {
            query.put("ClientFileName", request.clientFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPath)) {
            query.put("ClientPath", request.clientPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describe)) {
            query.put("Describe", request.describe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模版</p>
     * 
     * @param request CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicExpression)) {
            query.put("logicExpression", request.logicExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("ruleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleExpressions)) {
            query.put("ruleExpressions", request.ruleExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模版</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除查询条件</p>
     * 
     * @param request DeleteAnalysisConditionFavoriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnalysisConditionFavoriteResponse
     */
    public DeleteAnalysisConditionFavoriteResponse deleteAnalysisConditionFavoriteWithOptions(DeleteAnalysisConditionFavoriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnalysisConditionFavorite"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAnalysisConditionFavoriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除查询条件</p>
     * 
     * @param request DeleteAnalysisConditionFavoriteRequest
     * @return DeleteAnalysisConditionFavoriteResponse
     */
    public DeleteAnalysisConditionFavoriteResponse deleteAnalysisConditionFavorite(DeleteAnalysisConditionFavoriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAnalysisConditionFavoriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户授权</p>
     * 
     * @param request DeleteAuthUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthUserResponse
     */
    public DeleteAuthUserResponse deleteAuthUserWithOptions(DeleteAuthUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthUser"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户授权</p>
     * 
     * @param request DeleteAuthUserRequest
     * @return DeleteAuthUserResponse
     */
    public DeleteAuthUserResponse deleteAuthUser(DeleteAuthUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除旁路事件</p>
     * 
     * @param request DeleteByPassShuntEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteByPassShuntEventResponse
     */
    public DeleteByPassShuntEventResponse deleteByPassShuntEventWithOptions(DeleteByPassShuntEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteByPassShuntEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteByPassShuntEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除旁路事件</p>
     * 
     * @param request DeleteByPassShuntEventRequest
     * @return DeleteByPassShuntEventResponse
     */
    public DeleteByPassShuntEventResponse deleteByPassShuntEvent(DeleteByPassShuntEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteByPassShuntEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除累计变量</p>
     * 
     * @param request DeleteCustVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustVariableResponse
     */
    public DeleteCustVariableResponse deleteCustVariableWithOptions(DeleteCustVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除累计变量</p>
     * 
     * @param request DeleteCustVariableRequest
     * @return DeleteCustVariableResponse
     */
    public DeleteCustVariableResponse deleteCustVariable(DeleteCustVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义变量</p>
     * 
     * @param request DeleteExpressionVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExpressionVariableResponse
     */
    public DeleteExpressionVariableResponse deleteExpressionVariableWithOptions(DeleteExpressionVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressionVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressionVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义变量</p>
     * 
     * @param request DeleteExpressionVariableRequest
     * @return DeleteExpressionVariableResponse
     */
    public DeleteExpressionVariableResponse deleteExpressionVariable(DeleteExpressionVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressionVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除字段</p>
     * 
     * @param request DeleteFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFieldResponse
     */
    public DeleteFieldResponse deleteFieldWithOptions(DeleteFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteField"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除字段</p>
     * 
     * @param request DeleteFieldRequest
     * @return DeleteFieldResponse
     */
    public DeleteFieldResponse deleteField(DeleteFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除名单</p>
     * 
     * @param request DeleteNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNameListResponse
     */
    public DeleteNameListResponse deleteNameListWithOptions(DeleteNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除名单</p>
     * 
     * @param request DeleteNameListRequest
     * @return DeleteNameListResponse
     */
    public DeleteNameListResponse deleteNameList(DeleteNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除(伪)名单变量数据</p>
     * 
     * @param request DeleteNameListDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNameListDataResponse
     */
    public DeleteNameListDataResponse deleteNameListDataWithOptions(DeleteNameListDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNameListData"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNameListDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除(伪)名单变量数据</p>
     * 
     * @param request DeleteNameListDataRequest
     * @return DeleteNameListDataResponse
     */
    public DeleteNameListDataResponse deleteNameListData(DeleteNameListDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNameListDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量删除</p>
     * 
     * @param request DeleteQueryVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQueryVariableResponse
     */
    public DeleteQueryVariableResponse deleteQueryVariableWithOptions(DeleteQueryVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueryVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueryVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量删除</p>
     * 
     * @param request DeleteQueryVariableRequest
     * @return DeleteQueryVariableResponse
     */
    public DeleteQueryVariableResponse deleteQueryVariable(DeleteQueryVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQueryVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略版本</p>
     * 
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除策略版本</p>
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除样本</p>
     * 
     * @param request DeleteSampleBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSampleBatchResponse
     */
    public DeleteSampleBatchResponse deleteSampleBatchWithOptions(DeleteSampleBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("versions", request.versions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSampleBatch"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSampleBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除样本</p>
     * 
     * @param request DeleteSampleBatchRequest
     * @return DeleteSampleBatchResponse
     */
    public DeleteSampleBatchResponse deleteSampleBatch(DeleteSampleBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSampleBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除样本数据</p>
     * 
     * @param request DeleteSampleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSampleDataResponse
     */
    public DeleteSampleDataResponse deleteSampleDataWithOptions(DeleteSampleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSampleData"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSampleDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除样本数据</p>
     * 
     * @param request DeleteSampleDataRequest
     * @return DeleteSampleDataResponse
     */
    public DeleteSampleDataResponse deleteSampleData(DeleteSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSampleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除社群任务</p>
     * 
     * @param request DeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(DeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除社群任务</p>
     * 
     * @param request DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高级查询获取左变量接口</p>
     * 
     * @param request DescribeAdvanceSearchLeftVariableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvanceSearchLeftVariableListResponse
     */
    public DescribeAdvanceSearchLeftVariableListResponse describeAdvanceSearchLeftVariableListWithOptions(DescribeAdvanceSearchLeftVariableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvanceSearchLeftVariableList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvanceSearchLeftVariableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>高级查询获取左变量接口</p>
     * 
     * @param request DescribeAdvanceSearchLeftVariableListRequest
     * @return DescribeAdvanceSearchLeftVariableListResponse
     */
    public DescribeAdvanceSearchLeftVariableListResponse describeAdvanceSearchLeftVariableList(DescribeAdvanceSearchLeftVariableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvanceSearchLeftVariableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高级查询</p>
     * 
     * @param request DescribeAdvanceSearchPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdvanceSearchPageListResponse
     */
    public DescribeAdvanceSearchPageListResponse describeAdvanceSearchPageListWithOptions(DescribeAdvanceSearchPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBeginTime)) {
            query.put("eventBeginTime", request.eventBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventEndTime)) {
            query.put("eventEndTime", request.eventEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("fieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("fieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdvanceSearchPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdvanceSearchPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>高级查询</p>
     * 
     * @param request DescribeAdvanceSearchPageListRequest
     * @return DescribeAdvanceSearchPageListResponse
     */
    public DescribeAdvanceSearchPageListResponse describeAdvanceSearchPageList(DescribeAdvanceSearchPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdvanceSearchPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>数据源列表</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSourceWithOptions(DescribeAllDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllDataSource"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>数据源列表</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件列表查询</p>
     * 
     * @param request DescribeAllEventNameAndCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllEventNameAndCodeResponse
     */
    public DescribeAllEventNameAndCodeResponse describeAllEventNameAndCodeWithOptions(DescribeAllEventNameAndCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllEventNameAndCode"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllEventNameAndCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件列表查询</p>
     * 
     * @param request DescribeAllEventNameAndCodeRequest
     * @return DescribeAllEventNameAndCodeResponse
     */
    public DescribeAllEventNameAndCodeResponse describeAllEventNameAndCode(DescribeAllEventNameAndCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllEventNameAndCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义表达式测试时，展示所有的根变量</p>
     * 
     * @param request DescribeAllRootVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllRootVariableResponse
     */
    public DescribeAllRootVariableResponse describeAllRootVariableWithOptions(DescribeAllRootVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVariableIds)) {
            query.put("deviceVariableIds", request.deviceVariableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariableIds)) {
            query.put("expressionVariableIds", request.expressionVariableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nativeVariableIds)) {
            query.put("nativeVariableIds", request.nativeVariableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryVariableIds)) {
            query.put("queryVariableIds", request.queryVariableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.velocityVariableIds)) {
            query.put("velocityVariableIds", request.velocityVariableIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllRootVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllRootVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义表达式测试时，展示所有的根变量</p>
     * 
     * @param request DescribeAllRootVariableRequest
     * @return DescribeAllRootVariableResponse
     */
    public DescribeAllRootVariableResponse describeAllRootVariable(DescribeAllRootVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllRootVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>展示所有字段</p>
     * 
     * @param request DescribeAnalysisColumnFieldListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAnalysisColumnFieldListResponse
     */
    public DescribeAnalysisColumnFieldListResponse describeAnalysisColumnFieldListWithOptions(DescribeAnalysisColumnFieldListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnalysisColumnFieldList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnalysisColumnFieldListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>展示所有字段</p>
     * 
     * @param request DescribeAnalysisColumnFieldListRequest
     * @return DescribeAnalysisColumnFieldListResponse
     */
    public DescribeAnalysisColumnFieldListResponse describeAnalysisColumnFieldList(DescribeAnalysisColumnFieldListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAnalysisColumnFieldListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义列</p>
     * 
     * @param request DescribeAnalysisColumnListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAnalysisColumnListResponse
     */
    public DescribeAnalysisColumnListResponse describeAnalysisColumnListWithOptions(DescribeAnalysisColumnListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnalysisColumnList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnalysisColumnListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义列</p>
     * 
     * @param request DescribeAnalysisColumnListRequest
     * @return DescribeAnalysisColumnListResponse
     */
    public DescribeAnalysisColumnListResponse describeAnalysisColumnList(DescribeAnalysisColumnListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAnalysisColumnListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询条件列表</p>
     * 
     * @param request DescribeAnalysisConditionFavoriteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAnalysisConditionFavoriteListResponse
     */
    public DescribeAnalysisConditionFavoriteListResponse describeAnalysisConditionFavoriteListWithOptions(DescribeAnalysisConditionFavoriteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnalysisConditionFavoriteList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnalysisConditionFavoriteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询条件列表</p>
     * 
     * @param request DescribeAnalysisConditionFavoriteListRequest
     * @return DescribeAnalysisConditionFavoriteListResponse
     */
    public DescribeAnalysisConditionFavoriteListResponse describeAnalysisConditionFavoriteList(DescribeAnalysisConditionFavoriteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAnalysisConditionFavoriteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载查询结果</p>
     * 
     * @param request DescribeAnalysisExportTaskDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAnalysisExportTaskDownloadUrlResponse
     */
    public DescribeAnalysisExportTaskDownloadUrlResponse describeAnalysisExportTaskDownloadUrlWithOptions(DescribeAnalysisExportTaskDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnalysisExportTaskDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnalysisExportTaskDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载查询结果</p>
     * 
     * @param request DescribeAnalysisExportTaskDownloadUrlRequest
     * @return DescribeAnalysisExportTaskDownloadUrlResponse
     */
    public DescribeAnalysisExportTaskDownloadUrlResponse describeAnalysisExportTaskDownloadUrl(DescribeAnalysisExportTaskDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAnalysisExportTaskDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>得到api详情</p>
     * 
     * @param request DescribeApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiResponse
     */
    public DescribeApiResponse describeApiWithOptions(DescribeApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("apiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiRegionId)) {
            query.put("apiRegionId", request.apiRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApi"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>得到api详情</p>
     * 
     * @param request DescribeApiRequest
     * @return DescribeApiResponse
     */
    public DescribeApiResponse describeApi(DescribeApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>得到api分组包括用户购买的以及自定义的</p>
     * 
     * @param request DescribeApiGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiGroupsResponse
     */
    public DescribeApiGroupsResponse describeApiGroupsWithOptions(DescribeApiGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiRegionId)) {
            query.put("apiRegionId", request.apiRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiGroups"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>得到api分组包括用户购买的以及自定义的</p>
     * 
     * @param request DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     */
    public DescribeApiGroupsResponse describeApiGroups(DescribeApiGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询创建api任务的limit信息</p>
     * 
     * @param request DescribeApiLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiLimitResponse
     */
    public DescribeApiLimitResponse describeApiLimitWithOptions(DescribeApiLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询创建api任务的limit信息</p>
     * 
     * @param request DescribeApiLimitRequest
     * @return DescribeApiLimitResponse
     */
    public DescribeApiLimitResponse describeApiLimit(DescribeApiLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取api服务名称</p>
     * 
     * @param request DescribeApiNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiNameListResponse
     */
    public DescribeApiNameListResponse describeApiNameListWithOptions(DescribeApiNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取api服务名称</p>
     * 
     * @param request DescribeApiNameListRequest
     * @return DescribeApiNameListResponse
     */
    public DescribeApiNameListResponse describeApiNameList(DescribeApiNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeApiVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiVariableResponse
     */
    public DescribeApiVariableResponse describeApiVariableWithOptions(DescribeApiVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeApiVariableRequest
     * @return DescribeApiVariableResponse
     */
    public DescribeApiVariableResponse describeApiVariable(DescribeApiVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>得到api列表包括用户购买的以及自定义的</p>
     * 
     * @param request DescribeApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApisResponse
     */
    public DescribeApisResponse describeApisWithOptions(DescribeApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiGroupId)) {
            query.put("apiGroupId", request.apiGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiRegionId)) {
            query.put("apiRegionId", request.apiRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApis"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>得到api列表包括用户购买的以及自定义的</p>
     * 
     * @param request DescribeApisRequest
     * @return DescribeApisResponse
     */
    public DescribeApisResponse describeApis(DescribeApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询appKey列表</p>
     * 
     * @param request DescribeAppKeyPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppKeyPageResponse
     */
    public DescribeAppKeyPageResponse describeAppKeyPageWithOptions(DescribeAppKeyPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppKeyPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppKeyPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询appKey列表</p>
     * 
     * @param request DescribeAppKeyPageRequest
     * @return DescribeAppKeyPageResponse
     */
    public DescribeAppKeyPageResponse describeAppKeyPage(DescribeAppKeyPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppKeyPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批开关</p>
     * 
     * @param request DescribeAuditConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditConfigResponse
     */
    public DescribeAuditConfigResponse describeAuditConfigWithOptions(DescribeAuditConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditRelationType)) {
            query.put("auditRelationType", request.auditRelationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditConfig"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批开关</p>
     * 
     * @param request DescribeAuditConfigRequest
     * @return DescribeAuditConfigResponse
     */
    public DescribeAuditConfigResponse describeAuditConfig(DescribeAuditConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批详情</p>
     * 
     * @param request DescribeAuditDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditDetailsResponse
     */
    public DescribeAuditDetailsResponse describeAuditDetailsWithOptions(DescribeAuditDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditDetails"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批详情</p>
     * 
     * @param request DescribeAuditDetailsRequest
     * @return DescribeAuditDetailsResponse
     */
    public DescribeAuditDetailsResponse describeAuditDetails(DescribeAuditDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审核列表展示、查询</p>
     * 
     * @param request DescribeAuditPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditPageListResponse
     */
    public DescribeAuditPageListResponse describeAuditPageListWithOptions(DescribeAuditPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("auditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审核列表展示、查询</p>
     * 
     * @param request DescribeAuditPageListRequest
     * @return DescribeAuditPageListResponse
     */
    public DescribeAuditPageListResponse describeAuditPageList(DescribeAuditPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户的事件名列表</p>
     * 
     * @param request DescribeAuthEventNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthEventNameListResponse
     */
    public DescribeAuthEventNameListResponse describeAuthEventNameListWithOptions(DescribeAuthEventNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthEventNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthEventNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户的事件名列表</p>
     * 
     * @param request DescribeAuthEventNameListRequest
     * @return DescribeAuthEventNameListResponse
     */
    public DescribeAuthEventNameListResponse describeAuthEventNameList(DescribeAuthEventNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthEventNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略列表</p>
     * 
     * @param request DescribeAuthRulePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthRulePageListResponse
     */
    public DescribeAuthRulePageListResponse describeAuthRulePageListWithOptions(DescribeAuthRulePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthRulePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthRulePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略列表</p>
     * 
     * @param request DescribeAuthRulePageListRequest
     * @return DescribeAuthRulePageListResponse
     */
    public DescribeAuthRulePageListResponse describeAuthRulePageList(DescribeAuthRulePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthRulePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>场景列表</p>
     * 
     * @param request DescribeAuthSceneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthSceneListResponse
     */
    public DescribeAuthSceneListResponse describeAuthSceneListWithOptions(DescribeAuthSceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthSceneList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthSceneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>场景列表</p>
     * 
     * @param request DescribeAuthSceneListRequest
     * @return DescribeAuthSceneListResponse
     */
    public DescribeAuthSceneListResponse describeAuthSceneList(DescribeAuthSceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthSceneListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>场景列表</p>
     * 
     * @param request DescribeAuthScenePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthScenePageListResponse
     */
    public DescribeAuthScenePageListResponse describeAuthScenePageListWithOptions(DescribeAuthScenePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("sceneName", request.sceneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthScenePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthScenePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>场景列表</p>
     * 
     * @param request DescribeAuthScenePageListRequest
     * @return DescribeAuthScenePageListResponse
     */
    public DescribeAuthScenePageListResponse describeAuthScenePageList(DescribeAuthScenePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthScenePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看是否授权</p>
     * 
     * @param request DescribeAuthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthStatusResponse
     */
    public DescribeAuthStatusResponse describeAuthStatusWithOptions(DescribeAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthStatus"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看是否授权</p>
     * 
     * @param request DescribeAuthStatusRequest
     * @return DescribeAuthStatusResponse
     */
    public DescribeAuthStatusResponse describeAuthStatus(DescribeAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>平均执行耗时</p>
     * 
     * @param request DescribeAvgExecuteCostReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvgExecuteCostReportResponse
     */
    public DescribeAvgExecuteCostReportResponse describeAvgExecuteCostReportWithOptions(DescribeAvgExecuteCostReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvgExecuteCostReport"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvgExecuteCostReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>平均执行耗时</p>
     * 
     * @param request DescribeAvgExecuteCostReportRequest
     * @return DescribeAvgExecuteCostReportResponse
     */
    public DescribeAvgExecuteCostReportResponse describeAvgExecuteCostReport(DescribeAvgExecuteCostReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvgExecuteCostReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基础查询</p>
     * 
     * @param request DescribeBasicSearchPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBasicSearchPageListResponse
     */
    public DescribeBasicSearchPageListResponse describeBasicSearchPageListWithOptions(DescribeBasicSearchPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBeginTime)) {
            query.put("eventBeginTime", request.eventBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventEndTime)) {
            query.put("eventEndTime", request.eventEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("fieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("fieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBasicSearchPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBasicSearchPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基础查询</p>
     * 
     * @param request DescribeBasicSearchPageListRequest
     * @return DescribeBasicSearchPageListResponse
     */
    public DescribeBasicSearchPageListResponse describeBasicSearchPageList(DescribeBasicSearchPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBasicSearchPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基础统计</p>
     * 
     * @param request DescribeBasicStartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBasicStartResponse
     */
    public DescribeBasicStartResponse describeBasicStartWithOptions(DescribeBasicStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("appKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDs)) {
            query.put("endDs", request.endDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDs)) {
            query.put("startDs", request.startDs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBasicStart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBasicStartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基础统计</p>
     * 
     * @param request DescribeBasicStartRequest
     * @return DescribeBasicStartResponse
     */
    public DescribeBasicStartResponse describeBasicStart(DescribeBasicStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBasicStartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看旁路事件</p>
     * 
     * @param request DescribeByPassShuntEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeByPassShuntEventResponse
     */
    public DescribeByPassShuntEventResponse describeByPassShuntEventWithOptions(DescribeByPassShuntEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeByPassShuntEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeByPassShuntEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看旁路事件</p>
     * 
     * @param request DescribeByPassShuntEventRequest
     * @return DescribeByPassShuntEventResponse
     */
    public DescribeByPassShuntEventResponse describeByPassShuntEvent(DescribeByPassShuntEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeByPassShuntEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义累计变量的类型配置</p>
     * 
     * @param request DescribeCustVariableConfigListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustVariableConfigListResponse
     */
    public DescribeCustVariableConfigListResponse describeCustVariableConfigListWithOptions(DescribeCustVariableConfigListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            query.put("timeType", request.timeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustVariableConfigList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustVariableConfigListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义累计变量的类型配置</p>
     * 
     * @param request DescribeCustVariableConfigListRequest
     * @return DescribeCustVariableConfigListResponse
     */
    public DescribeCustVariableConfigListResponse describeCustVariableConfigList(DescribeCustVariableConfigListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustVariableConfigListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>累计变量详情</p>
     * 
     * @param request DescribeCustVariableDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustVariableDetailResponse
     */
    public DescribeCustVariableDetailResponse describeCustVariableDetailWithOptions(DescribeCustVariableDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustVariableDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustVariableDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>累计变量详情</p>
     * 
     * @param request DescribeCustVariableDetailRequest
     * @return DescribeCustVariableDetailResponse
     */
    public DescribeCustVariableDetailResponse describeCustVariableDetail(DescribeCustVariableDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustVariableDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义累计变量列表</p>
     * 
     * @param request DescribeCustVariablePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustVariablePageResponse
     */
    public DescribeCustVariablePageResponse describeCustVariablePageWithOptions(DescribeCustVariablePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustVariablePage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustVariablePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义累计变量列表</p>
     * 
     * @param request DescribeCustVariablePageRequest
     * @return DescribeCustVariablePageResponse
     */
    public DescribeCustVariablePageResponse describeCustVariablePage(DescribeCustVariablePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustVariablePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源数据下载链接</p>
     * 
     * @param request DescribeDataSourceDataDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSourceDataDownloadUrlResponse
     */
    public DescribeDataSourceDataDownloadUrlResponse describeDataSourceDataDownloadUrlWithOptions(DescribeDataSourceDataDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSourceDataDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourceDataDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源数据下载链接</p>
     * 
     * @param request DescribeDataSourceDataDownloadUrlRequest
     * @return DescribeDataSourceDataDownloadUrlResponse
     */
    public DescribeDataSourceDataDownloadUrlResponse describeDataSourceDataDownloadUrl(DescribeDataSourceDataDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourceDataDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源所有字段</p>
     * 
     * @param request DescribeDataSourceFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSourceFieldsResponse
     */
    public DescribeDataSourceFieldsResponse describeDataSourceFieldsWithOptions(DescribeDataSourceFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceCode)) {
            query.put("dataSourceCode", request.dataSourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSourceFields"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourceFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源所有字段</p>
     * 
     * @param request DescribeDataSourceFieldsRequest
     * @return DescribeDataSourceFieldsResponse
     */
    public DescribeDataSourceFieldsResponse describeDataSourceFields(DescribeDataSourceFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourceFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>数据源列表接口</p>
     * 
     * @param request DescribeDataSourcePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSourcePageListResponse
     */
    public DescribeDataSourcePageListResponse describeDataSourcePageListWithOptions(DescribeDataSourcePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSourcePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourcePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>数据源列表接口</p>
     * 
     * @param request DescribeDataSourcePageListRequest
     * @return DescribeDataSourcePageListResponse
     */
    public DescribeDataSourcePageListResponse describeDataSourcePageList(DescribeDataSourcePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourcePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>决策结果波动检测</p>
     * 
     * @param request DescribeDecisionResultFluctuationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDecisionResultFluctuationResponse
     */
    public DescribeDecisionResultFluctuationResponse describeDecisionResultFluctuationWithOptions(DescribeDecisionResultFluctuationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDecisionResultFluctuation"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDecisionResultFluctuationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>决策结果波动检测</p>
     * 
     * @param request DescribeDecisionResultFluctuationRequest
     * @return DescribeDecisionResultFluctuationResponse
     */
    public DescribeDecisionResultFluctuationResponse describeDecisionResultFluctuation(DescribeDecisionResultFluctuationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDecisionResultFluctuationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>决策结果波动趋势</p>
     * 
     * @param request DescribeDecisionResultTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDecisionResultTrendResponse
     */
    public DescribeDecisionResultTrendResponse describeDecisionResultTrendWithOptions(DescribeDecisionResultTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDecisionResultTrend"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDecisionResultTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>决策结果波动趋势</p>
     * 
     * @param request DescribeDecisionResultTrendRequest
     * @return DescribeDecisionResultTrendResponse
     */
    public DescribeDecisionResultTrendResponse describeDecisionResultTrend(DescribeDecisionResultTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDecisionResultTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>详细统计</p>
     * 
     * @param request DescribeDetailStartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDetailStartResponse
     */
    public DescribeDetailStartResponse describeDetailStartWithOptions(DescribeDetailStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("appKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDs)) {
            query.put("endDs", request.endDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDs)) {
            query.put("startDs", request.startDs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDetailStart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDetailStartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>详细统计</p>
     * 
     * @param request DescribeDetailStartRequest
     * @return DescribeDetailStartResponse
     */
    public DescribeDetailStartResponse describeDetailStart(DescribeDetailStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDetailStartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载</p>
     * 
     * @param request DescribeDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadUrlResponse
     */
    public DescribeDownloadUrlResponse describeDownloadUrlWithOptions(DescribeDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载</p>
     * 
     * @param request DescribeDownloadUrlRequest
     * @return DescribeDownloadUrlResponse
     */
    public DescribeDownloadUrlResponse describeDownloadUrl(DescribeDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件详情</p>
     * 
     * @param request DescribeEventBaseInfoByEventCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventBaseInfoByEventCodeResponse
     */
    public DescribeEventBaseInfoByEventCodeResponse describeEventBaseInfoByEventCodeWithOptions(DescribeEventBaseInfoByEventCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventBaseInfoByEventCode"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventBaseInfoByEventCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件详情</p>
     * 
     * @param request DescribeEventBaseInfoByEventCodeRequest
     * @return DescribeEventBaseInfoByEventCodeResponse
     */
    public DescribeEventBaseInfoByEventCodeResponse describeEventBaseInfoByEventCode(DescribeEventBaseInfoByEventCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventBaseInfoByEventCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeEventCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventCountResponse
     */
    public DescribeEventCountResponse describeEventCountWithOptions(DescribeEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventCount"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeEventCountRequest
     * @return DescribeEventCountResponse
     */
    public DescribeEventCountResponse describeEventCount(DescribeEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据requestId查询事件详情</p>
     * 
     * @param request DescribeEventDetailByRequestIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventDetailByRequestIdResponse
     */
    public DescribeEventDetailByRequestIdResponse describeEventDetailByRequestIdWithOptions(DescribeEventDetailByRequestIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTime)) {
            query.put("eventTime", request.eventTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sRequestId)) {
            query.put("sRequestId", request.sRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventDetailByRequestId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventDetailByRequestIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据requestId查询事件详情</p>
     * 
     * @param request DescribeEventDetailByRequestIdRequest
     * @return DescribeEventDetailByRequestIdResponse
     */
    public DescribeEventDetailByRequestIdResponse describeEventDetailByRequestId(DescribeEventDetailByRequestIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventDetailByRequestIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件历史详情</p>
     * 
     * @param request DescribeEventLogDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventLogDetailResponse
     */
    public DescribeEventLogDetailResponse describeEventLogDetailWithOptions(DescribeEventLogDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqIdByLog)) {
            query.put("reqIdByLog", request.reqIdByLog);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventLogDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventLogDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件历史详情</p>
     * 
     * @param request DescribeEventLogDetailRequest
     * @return DescribeEventLogDetailResponse
     */
    public DescribeEventLogDetailResponse describeEventLogDetail(DescribeEventLogDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventLogDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件历史列表</p>
     * 
     * @param request DescribeEventLogPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventLogPageResponse
     */
    public DescribeEventLogPageResponse describeEventLogPageWithOptions(DescribeEventLogPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountIdPRP)) {
            query.put("accountIdPRP", request.accountIdPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition1AL)) {
            query.put("condition1AL", request.condition1AL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition2AL)) {
            query.put("condition2AL", request.condition2AL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition3AL)) {
            query.put("condition3AL", request.condition3AL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTypeLRP)) {
            query.put("deviceTypeLRP", request.deviceTypeLRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailPRP)) {
            query.put("emailPRP", request.emailPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failReasonLRP)) {
            query.put("failReasonLRP", request.failReasonLRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipPRP)) {
            query.put("ipPRP", request.ipPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginResultARP)) {
            query.put("loginResultARP", request.loginResultARP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginTypeLRP)) {
            query.put("loginTypeLRP", request.loginTypeLRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macPRP)) {
            query.put("macPRP", request.macPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobilePRP)) {
            query.put("mobilePRP", request.mobilePRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickNamePRP)) {
            query.put("nickNamePRP", request.nickNamePRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSourceLRP)) {
            query.put("operateSourceLRP", request.operateSourceLRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referPRP)) {
            query.put("referPRP", request.referPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerIpPRP)) {
            query.put("registerIpPRP", request.registerIpPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqIdPBS)) {
            query.put("reqIdPBS", request.reqIdPBS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scoreEBS)) {
            query.put("scoreEBS", request.scoreEBS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scoreSBS)) {
            query.put("scoreSBS", request.scoreSBS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceABS)) {
            query.put("serviceABS", request.serviceABS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsLBS)) {
            query.put("tagsLBS", request.tagsLBS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidPDI)) {
            query.put("umidPDI", request.umidPDI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAgentPRP)) {
            query.put("userAgentPRP", request.userAgentPRP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNameTypeLRP)) {
            query.put("userNameTypeLRP", request.userNameTypeLRP);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventLogPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventLogPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件历史列表</p>
     * 
     * @param request DescribeEventLogPageRequest
     * @return DescribeEventLogPageResponse
     */
    public DescribeEventLogPageResponse describeEventLogPage(DescribeEventLogPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventLogPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件分页查询</p>
     * 
     * @param request DescribeEventPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventPageListResponse
     */
    public DescribeEventPageListResponse describeEventPageListWithOptions(DescribeEventPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventStatus)) {
            query.put("eventStatus", request.eventStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件分页查询</p>
     * 
     * @param request DescribeEventPageListRequest
     * @return DescribeEventPageListResponse
     */
    public DescribeEventPageListResponse describeEventPageList(DescribeEventPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险大盘</p>
     * 
     * @param request DescribeEventResultBarChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventResultBarChartResponse
     */
    public DescribeEventResultBarChartResponse describeEventResultBarChartWithOptions(DescribeEventResultBarChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventResultBarChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventResultBarChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险大盘</p>
     * 
     * @param request DescribeEventResultBarChartRequest
     * @return DescribeEventResultBarChartResponse
     */
    public DescribeEventResultBarChartResponse describeEventResultBarChart(DescribeEventResultBarChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventResultBarChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件概览列表</p>
     * 
     * @param request DescribeEventResultListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventResultListResponse
     */
    public DescribeEventResultListResponse describeEventResultListWithOptions(DescribeEventResultListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventResultList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventResultListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件概览列表</p>
     * 
     * @param request DescribeEventResultListRequest
     * @return DescribeEventResultListResponse
     */
    public DescribeEventResultListResponse describeEventResultList(DescribeEventResultListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventResultListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略下载列表</p>
     * 
     * @param request DescribeEventTaskHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventTaskHistoryResponse
     */
    public DescribeEventTaskHistoryResponse describeEventTaskHistoryWithOptions(DescribeEventTaskHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventTaskHistory"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventTaskHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略下载列表</p>
     * 
     * @param request DescribeEventTaskHistoryRequest
     * @return DescribeEventTaskHistoryResponse
     */
    public DescribeEventTaskHistoryResponse describeEventTaskHistory(DescribeEventTaskHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventTaskHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用事件次数</p>
     * 
     * @param request DescribeEventTotalCountReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventTotalCountReportResponse
     */
    public DescribeEventTotalCountReportResponse describeEventTotalCountReportWithOptions(DescribeEventTotalCountReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventTotalCountReport"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventTotalCountReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用事件次数</p>
     * 
     * @param request DescribeEventTotalCountReportRequest
     * @return DescribeEventTotalCountReportResponse
     */
    public DescribeEventTotalCountReportResponse describeEventTotalCountReport(DescribeEventTotalCountReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventTotalCountReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入策略</p>
     * 
     * @param request DescribeEventUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventUploadPolicyResponse
     */
    public DescribeEventUploadPolicyResponse describeEventUploadPolicyWithOptions(DescribeEventUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventUploadPolicy"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入策略</p>
     * 
     * @param request DescribeEventUploadPolicyRequest
     * @return DescribeEventUploadPolicyResponse
     */
    public DescribeEventUploadPolicyResponse describeEventUploadPolicy(DescribeEventUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件变量</p>
     * 
     * @param request DescribeEventVariableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventVariableListResponse
     */
    public DescribeEventVariableListResponse describeEventVariableListWithOptions(DescribeEventVariableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDTO)) {
            query.put("filterDTO", request.filterDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refObjId)) {
            query.put("refObjId", request.refObjId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refObjType)) {
            query.put("refObjType", request.refObjType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventVariableList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventVariableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件变量</p>
     * 
     * @param request DescribeEventVariableListRequest
     * @return DescribeEventVariableListResponse
     */
    public DescribeEventVariableListResponse describeEventVariableList(DescribeEventVariableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventVariableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版</p>
     * 
     * @param request DescribeEventVariableTemplateBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventVariableTemplateBindResponse
     */
    public DescribeEventVariableTemplateBindResponse describeEventVariableTemplateBindWithOptions(DescribeEventVariableTemplateBindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            query.put("inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("templateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventVariableTemplateBind"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventVariableTemplateBindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版</p>
     * 
     * @param request DescribeEventVariableTemplateBindRequest
     * @return DescribeEventVariableTemplateBindResponse
     */
    public DescribeEventVariableTemplateBindResponse describeEventVariableTemplateBind(DescribeEventVariableTemplateBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventVariableTemplateBindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版</p>
     * 
     * @param request DescribeEventVariableTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventVariableTemplateListResponse
     */
    public DescribeEventVariableTemplateListResponse describeEventVariableTemplateListWithOptions(DescribeEventVariableTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            query.put("inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("templateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventVariableTemplateList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventVariableTemplateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版</p>
     * 
     * @param request DescribeEventVariableTemplateListRequest
     * @return DescribeEventVariableTemplateListResponse
     */
    public DescribeEventVariableTemplateListResponse describeEventVariableTemplateList(DescribeEventVariableTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventVariableTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件变量</p>
     * 
     * @param request DescribeEventsVariableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsVariableListResponse
     */
    public DescribeEventsVariableListResponse describeEventsVariableListWithOptions(DescribeEventsVariableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDTO)) {
            query.put("filterDTO", request.filterDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventsVariableList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsVariableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件变量</p>
     * 
     * @param request DescribeEventsVariableListRequest
     * @return DescribeEventsVariableListResponse
     */
    public DescribeEventsVariableListResponse describeEventsVariableList(DescribeEventsVariableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsVariableListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExcuteNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExcuteNumResponse
     */
    public DescribeExcuteNumResponse describeExcuteNumWithOptions(DescribeExcuteNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.degree)) {
            query.put("Degree", request.degree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExcuteNum"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExcuteNumResponse());
    }

    /**
     * @param request DescribeExcuteNumRequest
     * @return DescribeExcuteNumResponse
     */
    public DescribeExcuteNumResponse describeExcuteNum(DescribeExcuteNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExcuteNumWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验字段名是否重复(基于用户单位)</p>
     * 
     * @param request DescribeExistNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExistNameResponse
     */
    public DescribeExistNameResponse describeExistNameWithOptions(DescribeExistNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExistName"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExistNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验字段名是否重复(基于用户单位)</p>
     * 
     * @param request DescribeExistNameRequest
     * @return DescribeExistNameResponse
     */
    public DescribeExistNameResponse describeExistName(DescribeExistNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExistNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>场景是否存在</p>
     * 
     * @param request DescribeExistSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExistSceneResponse
     */
    public DescribeExistSceneResponse describeExistSceneWithOptions(DescribeExistSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExistScene"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExistSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>场景是否存在</p>
     * 
     * @param request DescribeExistSceneRequest
     * @return DescribeExistSceneResponse
     */
    public DescribeExistSceneResponse describeExistScene(DescribeExistSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExistSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量详情</p>
     * 
     * @param request DescribeExpressionVariableDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressionVariableDetailResponse
     */
    public DescribeExpressionVariableDetailResponse describeExpressionVariableDetailWithOptions(DescribeExpressionVariableDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressionVariableDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressionVariableDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量详情</p>
     * 
     * @param request DescribeExpressionVariableDetailRequest
     * @return DescribeExpressionVariableDetailResponse
     */
    public DescribeExpressionVariableDetailResponse describeExpressionVariableDetail(DescribeExpressionVariableDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressionVariableDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>函数列表</p>
     * 
     * @param request DescribeExpressionVariableFunctionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressionVariableFunctionListResponse
     */
    public DescribeExpressionVariableFunctionListResponse describeExpressionVariableFunctionListWithOptions(DescribeExpressionVariableFunctionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressionVariableFunctionList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressionVariableFunctionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>函数列表</p>
     * 
     * @param request DescribeExpressionVariableFunctionListRequest
     * @return DescribeExpressionVariableFunctionListResponse
     */
    public DescribeExpressionVariableFunctionListResponse describeExpressionVariableFunctionList(DescribeExpressionVariableFunctionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressionVariableFunctionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量分页查询</p>
     * 
     * @param request DescribeExpressionVariablePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressionVariablePageResponse
     */
    public DescribeExpressionVariablePageResponse describeExpressionVariablePageWithOptions(DescribeExpressionVariablePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressionVariablePage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressionVariablePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量分页查询</p>
     * 
     * @param request DescribeExpressionVariablePageRequest
     * @return DescribeExpressionVariablePageResponse
     */
    public DescribeExpressionVariablePageResponse describeExpressionVariablePage(DescribeExpressionVariablePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressionVariablePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取字段详情</p>
     * 
     * @param request DescribeFieldByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFieldByIdResponse
     */
    public DescribeFieldByIdResponse describeFieldByIdWithOptions(DescribeFieldByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFieldById"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFieldByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取字段详情</p>
     * 
     * @param request DescribeFieldByIdRequest
     * @return DescribeFieldByIdResponse
     */
    public DescribeFieldByIdResponse describeFieldById(DescribeFieldByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFieldByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段列表</p>
     * 
     * @param request DescribeFieldListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFieldListResponse
     */
    public DescribeFieldListResponse describeFieldListWithOptions(DescribeFieldListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            query.put("inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFieldList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFieldListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段列表</p>
     * 
     * @param request DescribeFieldListRequest
     * @return DescribeFieldListResponse
     */
    public DescribeFieldListResponse describeFieldList(DescribeFieldListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFieldListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段分页列表</p>
     * 
     * @param request DescribeFieldPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFieldPageResponse
     */
    public DescribeFieldPageResponse describeFieldPageWithOptions(DescribeFieldPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFieldPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFieldPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询字段分页列表</p>
     * 
     * @param request DescribeFieldPageRequest
     * @return DescribeFieldPageResponse
     */
    public DescribeFieldPageResponse describeFieldPage(DescribeFieldPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFieldPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社群账户列表</p>
     * 
     * @param request DescribeGroupAccountPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupAccountPageResponse
     */
    public DescribeGroupAccountPageResponse describeGroupAccountPageWithOptions(DescribeGroupAccountPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communityNo)) {
            query.put("communityNo", request.communityNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldKey)) {
            query.put("fieldKey", request.fieldKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldVal)) {
            query.put("fieldVal", request.fieldVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            query.put("isPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupAccountPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupAccountPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>社群账户列表</p>
     * 
     * @param request DescribeGroupAccountPageRequest
     * @return DescribeGroupAccountPageResponse
     */
    public DescribeGroupAccountPageResponse describeGroupAccountPage(DescribeGroupAccountPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupAccountPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社群列表查询条件</p>
     * 
     * @param request DescribeGroupConditionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupConditionListResponse
     */
    public DescribeGroupConditionListResponse describeGroupConditionListWithOptions(DescribeGroupConditionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupConditionList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupConditionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>社群列表查询条件</p>
     * 
     * @param request DescribeGroupConditionListRequest
     * @return DescribeGroupConditionListResponse
     */
    public DescribeGroupConditionListResponse describeGroupConditionList(DescribeGroupConditionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupConditionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社群列表</p>
     * 
     * @param request DescribeGroupPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupPageResponse
     */
    public DescribeGroupPageResponse describeGroupPageWithOptions(DescribeGroupPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            query.put("timeType", request.timeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>社群列表</p>
     * 
     * @param request DescribeGroupPageRequest
     * @return DescribeGroupPageResponse
     */
    public DescribeGroupPageResponse describeGroupPage(DescribeGroupPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当日发现的风险社群</p>
     * 
     * @param request DescribeGroupStatisticsByTodayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupStatisticsByTodayResponse
     */
    public DescribeGroupStatisticsByTodayResponse describeGroupStatisticsByTodayWithOptions(DescribeGroupStatisticsByTodayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupStatisticsByToday"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupStatisticsByTodayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>当日发现的风险社群</p>
     * 
     * @param request DescribeGroupStatisticsByTodayRequest
     * @return DescribeGroupStatisticsByTodayResponse
     */
    public DescribeGroupStatisticsByTodayResponse describeGroupStatisticsByToday(DescribeGroupStatisticsByTodayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupStatisticsByTodayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险社群的近期趋势</p>
     * 
     * @param request DescribeGroupTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupTrendResponse
     */
    public DescribeGroupTrendResponse describeGroupTrendWithOptions(DescribeGroupTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.day)) {
            query.put("day", request.day);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupTrend"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险社群的近期趋势</p>
     * 
     * @param request DescribeGroupTrendRequest
     * @return DescribeGroupTrendResponse
     */
    public DescribeGroupTrendResponse describeGroupTrend(DescribeGroupTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件名下的策略名是否存在</p>
     * 
     * @param request DescribeHasRuleNameByEventCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHasRuleNameByEventCodeResponse
     */
    public DescribeHasRuleNameByEventCodeResponse describeHasRuleNameByEventCodeWithOptions(DescribeHasRuleNameByEventCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRuleId)) {
            query.put("excludeRuleId", request.excludeRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHasRuleNameByEventCode"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHasRuleNameByEventCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件名下的策略名是否存在</p>
     * 
     * @param request DescribeHasRuleNameByEventCodeRequest
     * @return DescribeHasRuleNameByEventCodeResponse
     */
    public DescribeHasRuleNameByEventCodeResponse describeHasRuleNameByEventCode(DescribeHasRuleNameByEventCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHasRuleNameByEventCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险地图概览图表(饼图)</p>
     * 
     * @param request DescribeHighRiskPieChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHighRiskPieChartResponse
     */
    public DescribeHighRiskPieChartResponse describeHighRiskPieChartWithOptions(DescribeHighRiskPieChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHighRiskPieChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHighRiskPieChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险地图概览图表(饼图)</p>
     * 
     * @param request DescribeHighRiskPieChartRequest
     * @return DescribeHighRiskPieChartResponse
     */
    public DescribeHighRiskPieChartResponse describeHighRiskPieChart(DescribeHighRiskPieChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHighRiskPieChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略命中波动检测</p>
     * 
     * @param request DescribeHitRuleFluctuationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHitRuleFluctuationResponse
     */
    public DescribeHitRuleFluctuationResponse describeHitRuleFluctuationWithOptions(DescribeHitRuleFluctuationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHitRuleFluctuation"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHitRuleFluctuationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略命中波动检测</p>
     * 
     * @param request DescribeHitRuleFluctuationRequest
     * @return DescribeHitRuleFluctuationResponse
     */
    public DescribeHitRuleFluctuationResponse describeHitRuleFluctuation(DescribeHitRuleFluctuationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHitRuleFluctuationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>主事件/旁路/分流策略命中TOP20</p>
     * 
     * @param request DescribeHitRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHitRuleListResponse
     */
    public DescribeHitRuleListResponse describeHitRuleListWithOptions(DescribeHitRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("eventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHitRuleList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHitRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主事件/旁路/分流策略命中TOP20</p>
     * 
     * @param request DescribeHitRuleListRequest
     * @return DescribeHitRuleListResponse
     */
    public DescribeHitRuleListResponse describeHitRuleList(DescribeHitRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHitRuleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略命中趋势</p>
     * 
     * @param request DescribeHitRuleTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHitRuleTrendResponse
     */
    public DescribeHitRuleTrendResponse describeHitRuleTrendWithOptions(DescribeHitRuleTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHitRuleTrend"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHitRuleTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略命中趋势</p>
     * 
     * @param request DescribeHitRuleTrendRequest
     * @return DescribeHitRuleTrendResponse
     */
    public DescribeHitRuleTrendResponse describeHitRuleTrend(DescribeHitRuleTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHitRuleTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeInputFeildCountByEventCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInputFeildCountByEventCodeResponse
     */
    public DescribeInputFeildCountByEventCodeResponse describeInputFeildCountByEventCodeWithOptions(DescribeInputFeildCountByEventCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInputFeildCountByEventCode"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInputFeildCountByEventCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeInputFeildCountByEventCodeRequest
     * @return DescribeInputFeildCountByEventCodeResponse
     */
    public DescribeInputFeildCountByEventCodeResponse describeInputFeildCountByEventCode(DescribeInputFeildCountByEventCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInputFeildCountByEventCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeListPocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeListPocResponse
     */
    public DescribeListPocResponse describeListPocWithOptions(DescribeListPocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListPoc"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListPocResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeListPocRequest
     * @return DescribeListPocResponse
     */
    public DescribeListPocResponse describeListPoc(DescribeListPocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListPocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控对象列表</p>
     * 
     * @param request DescribeLoanExecListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoanExecListResponse
     */
    public DescribeLoanExecListResponse describeLoanExecListWithOptions(DescribeLoanExecListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchNo)) {
            query.put("batchNo", request.batchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorObj)) {
            query.put("monitorObj", request.monitorObj);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorStatus)) {
            query.put("monitorStatus", request.monitorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoanExecList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoanExecListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控对象列表</p>
     * 
     * @param request DescribeLoanExecListRequest
     * @return DescribeLoanExecListResponse
     */
    public DescribeLoanExecListResponse describeLoanExecList(DescribeLoanExecListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoanExecListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取贷中监控任务列表</p>
     * 
     * @param request DescribeLoanTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoanTaskListResponse
     */
    public DescribeLoanTaskListResponse describeLoanTaskListWithOptions(DescribeLoanTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchNo)) {
            query.put("batchNo", request.batchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorStatus)) {
            query.put("monitorStatus", request.monitorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoanTaskList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoanTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取贷中监控任务列表</p>
     * 
     * @param request DescribeLoanTaskListRequest
     * @return DescribeLoanTaskListResponse
     */
    public DescribeLoanTaskListResponse describeLoanTaskList(DescribeLoanTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoanTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打标列表</p>
     * 
     * @param request DescribeMarkPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMarkPageResponse
     */
    public DescribeMarkPageResponse describeMarkPageWithOptions(DescribeMarkPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            query.put("isPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskLogId)) {
            query.put("taskLogId", request.taskLogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMarkPage"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMarkPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打标列表</p>
     * 
     * @param request DescribeMarkPageRequest
     * @return DescribeMarkPageResponse
     */
    public DescribeMarkPageResponse describeMarkPage(DescribeMarkPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMarkPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询是否有权限</p>
     * 
     * @param request DescribeMenuPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMenuPermissionResponse
     */
    public DescribeMenuPermissionResponse describeMenuPermissionWithOptions(DescribeMenuPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionType)) {
            query.put("permissionType", request.permissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMenuPermission"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMenuPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询是否有权限</p>
     * 
     * @param request DescribeMenuPermissionRequest
     * @return DescribeMenuPermissionResponse
     */
    public DescribeMenuPermissionResponse describeMenuPermission(DescribeMenuPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMenuPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务的限制</p>
     * 
     * @param request DescribeMonitorTaskLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorTaskLimitResponse
     */
    public DescribeMonitorTaskLimitResponse describeMonitorTaskLimitWithOptions(DescribeMonitorTaskLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorTaskLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorTaskLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务的限制</p>
     * 
     * @param request DescribeMonitorTaskLimitRequest
     * @return DescribeMonitorTaskLimitResponse
     */
    public DescribeMonitorTaskLimitResponse describeMonitorTaskLimit(DescribeMonitorTaskLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorTaskLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询名单分页</p>
     * 
     * @param request DescribeNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListResponse
     */
    public DescribeNameListResponse describeNameListWithOptions(DescribeNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询名单分页</p>
     * 
     * @param request DescribeNameListRequest
     * @return DescribeNameListResponse
     */
    public DescribeNameListResponse describeNameList(DescribeNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载名单列表</p>
     * 
     * @param request DescribeNameListDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListDownloadUrlResponse
     */
    public DescribeNameListDownloadUrlResponse describeNameListDownloadUrlWithOptions(DescribeNameListDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameListDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载名单列表</p>
     * 
     * @param request DescribeNameListDownloadUrlRequest
     * @return DescribeNameListDownloadUrlResponse
     */
    public DescribeNameListDownloadUrlResponse describeNameListDownloadUrl(DescribeNameListDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询名单限制数</p>
     * 
     * @param request DescribeNameListLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListLimitResponse
     */
    public DescribeNameListLimitResponse describeNameListLimitWithOptions(DescribeNameListLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameListLimit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询名单限制数</p>
     * 
     * @param request DescribeNameListLimitRequest
     * @return DescribeNameListLimitResponse
     */
    public DescribeNameListLimitResponse describeNameListLimit(DescribeNameListLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>名单内容查询</p>
     * 
     * @param request DescribeNameListPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListPageListResponse
     */
    public DescribeNameListPageListResponse describeNameListPageListWithOptions(DescribeNameListPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateBeginTime)) {
            query.put("updateBeginTime", request.updateBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("updateEndTime", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameListPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>名单内容查询</p>
     * 
     * @param request DescribeNameListPageListRequest
     * @return DescribeNameListPageListResponse
     */
    public DescribeNameListPageListResponse describeNameListPageList(DescribeNameListPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>名单类型列表</p>
     * 
     * @param request DescribeNameListTypeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListTypeListResponse
     */
    public DescribeNameListTypeListResponse describeNameListTypeListWithOptions(DescribeNameListTypeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameListTypeList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListTypeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>名单类型列表</p>
     * 
     * @param request DescribeNameListTypeListRequest
     * @return DescribeNameListTypeListResponse
     */
    public DescribeNameListTypeListResponse describeNameListTypeList(DescribeNameListTypeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListTypeListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>名单列表</p>
     * 
     * @param request DescribeNameListVariablePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNameListVariablePageListResponse
     */
    public DescribeNameListVariablePageListResponse describeNameListVariablePageListWithOptions(DescribeNameListVariablePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameListType)) {
            query.put("nameListType", request.nameListType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNameListVariablePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNameListVariablePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>名单列表</p>
     * 
     * @param request DescribeNameListVariablePageListRequest
     * @return DescribeNameListVariablePageListResponse
     */
    public DescribeNameListVariablePageListResponse describeNameListVariablePageList(DescribeNameListVariablePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNameListVariablePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件名称查询事件列表</p>
     * 
     * @param request DescribeOperationLogPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperationLogPageListResponse
     */
    public DescribeOperationLogPageListResponse describeOperationLogPageListWithOptions(DescribeOperationLogPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperationLogPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperationLogPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件名称查询事件列表</p>
     * 
     * @param request DescribeOperationLogPageListRequest
     * @return DescribeOperationLogPageListResponse
     */
    public DescribeOperationLogPageListResponse describeOperationLogPageList(DescribeOperationLogPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperationLogPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据客户ID查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperatorListResponse
     */
    public DescribeOperatorListResponse describeOperatorListWithOptions(DescribeOperatorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperatorList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperatorListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据客户ID查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListRequest
     * @return DescribeOperatorListResponse
     */
    public DescribeOperatorListResponse describeOperatorList(DescribeOperatorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperatorListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListBySceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperatorListBySceneResponse
     */
    public DescribeOperatorListBySceneResponse describeOperatorListBySceneWithOptions(DescribeOperatorListBySceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperatorListByScene"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperatorListBySceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListBySceneRequest
     * @return DescribeOperatorListBySceneResponse
     */
    public DescribeOperatorListBySceneResponse describeOperatorListByScene(DescribeOperatorListBySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperatorListBySceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListByTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperatorListByTypeResponse
     */
    public DescribeOperatorListByTypeResponse describeOperatorListByTypeWithOptions(DescribeOperatorListByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperatorListByType"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperatorListByTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询操作符映射列表</p>
     * 
     * @param request DescribeOperatorListByTypeRequest
     * @return DescribeOperatorListByTypeResponse
     */
    public DescribeOperatorListByTypeResponse describeOperatorListByType(DescribeOperatorListByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperatorListByTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看是否授权Oss</p>
     * 
     * @param request DescribeOssAuthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssAuthStatusResponse
     */
    public DescribeOssAuthStatusResponse describeOssAuthStatusWithOptions(DescribeOssAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssAuthStatus"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssAuthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看是否授权Oss</p>
     * 
     * @param request DescribeOssAuthStatusRequest
     * @return DescribeOssAuthStatusResponse
     */
    public DescribeOssAuthStatusResponse describeOssAuthStatus(DescribeOssAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssAuthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS Policy</p>
     * 
     * @param request DescribeOssPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssPolicyResponse
     */
    public DescribeOssPolicyResponse describeOssPolicyWithOptions(DescribeOssPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssPolicy"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS Policy</p>
     * 
     * @param request DescribeOssPolicyRequest
     * @return DescribeOssPolicyResponse
     */
    public DescribeOssPolicyResponse describeOssPolicy(DescribeOssPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传凭证</p>
     * 
     * @param request DescribeOssTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssTokenResponse
     */
    public DescribeOssTokenResponse describeOssTokenWithOptions(DescribeOssTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("uploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssToken"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传凭证</p>
     * 
     * @param request DescribeOssTokenRequest
     * @return DescribeOssTokenResponse
     */
    public DescribeOssTokenResponse describeOssToken(DescribeOssTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件属性列表</p>
     * 
     * @param request DescribeParamByEventCodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParamByEventCodesResponse
     */
    public DescribeParamByEventCodesResponse describeParamByEventCodesWithOptions(DescribeParamByEventCodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parma)) {
            query.put("parma", request.parma);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParamByEventCodes"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParamByEventCodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件属性列表</p>
     * 
     * @param request DescribeParamByEventCodesRequest
     * @return DescribeParamByEventCodesResponse
     */
    public DescribeParamByEventCodesResponse describeParamByEventCodes(DescribeParamByEventCodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParamByEventCodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取映射关系</p>
     * 
     * @param request DescribeParamListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParamListResponse
     */
    public DescribeParamListResponse describeParamListWithOptions(DescribeParamListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("serviceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParamList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParamListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取映射关系</p>
     * 
     * @param request DescribeParamListRequest
     * @return DescribeParamListResponse
     */
    public DescribeParamListResponse describeParamList(DescribeParamListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParamListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务详情</p>
     * 
     * @param request DescribePocDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePocDetailResponse
     */
    public DescribePocDetailResponse describePocDetailWithOptions(DescribePocDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePocDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePocDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务详情</p>
     * 
     * @param request DescribePocDetailRequest
     * @return DescribePocDetailResponse
     */
    public DescribePocDetailResponse describePocDetail(DescribePocDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePocDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传凭证</p>
     * 
     * @param request DescribePocOssTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePocOssTokenResponse
     */
    public DescribePocOssTokenResponse describePocOssTokenWithOptions(DescribePocOssTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePocOssToken"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePocOssTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传凭证</p>
     * 
     * @param request DescribePocOssTokenRequest
     * @return DescribePocOssTokenResponse
     */
    public DescribePocOssTokenResponse describePocOssToken(DescribePocOssTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePocOssTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取poc任务列表</p>
     * 
     * @param request DescribePocTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePocTaskListResponse
     */
    public DescribePocTaskListResponse describePocTaskListWithOptions(DescribePocTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePocTaskList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePocTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取poc任务列表</p>
     * 
     * @param request DescribePocTaskListRequest
     * @return DescribePocTaskListResponse
     */
    public DescribePocTaskListResponse describePocTaskList(DescribePocTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePocTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>判断是否开通Stack私域模式</p>
     * 
     * @param request DescribePrivateStackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrivateStackResponse
     */
    public DescribePrivateStackResponse describePrivateStackWithOptions(DescribePrivateStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrivateStack"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrivateStackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>判断是否开通Stack私域模式</p>
     * 
     * @param request DescribePrivateStackRequest
     * @return DescribePrivateStackResponse
     */
    public DescribePrivateStackResponse describePrivateStack(DescribePrivateStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrivateStackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情查询</p>
     * 
     * @param request DescribeQueryVariableDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQueryVariableDetailResponse
     */
    public DescribeQueryVariableDetailResponse describeQueryVariableDetailWithOptions(DescribeQueryVariableDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQueryVariableDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQueryVariableDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情查询</p>
     * 
     * @param request DescribeQueryVariableDetailRequest
     * @return DescribeQueryVariableDetailResponse
     */
    public DescribeQueryVariableDetailResponse describeQueryVariableDetail(DescribeQueryVariableDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQueryVariableDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量列表查询</p>
     * 
     * @param request DescribeQueryVariablePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQueryVariablePageListResponse
     */
    public DescribeQueryVariablePageListResponse describeQueryVariablePageListWithOptions(DescribeQueryVariablePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceCode)) {
            query.put("dataSourceCode", request.dataSourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQueryVariablePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQueryVariablePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量列表查询</p>
     * 
     * @param request DescribeQueryVariablePageListRequest
     * @return DescribeQueryVariablePageListResponse
     */
    public DescribeQueryVariablePageListResponse describeQueryVariablePageList(DescribeQueryVariablePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQueryVariablePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本&amp;场景下的变量列表</p>
     * 
     * @param request DescribeRecommendSceneVariablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendSceneVariablesResponse
     */
    public DescribeRecommendSceneVariablesResponse describeRecommendSceneVariablesWithOptions(DescribeRecommendSceneVariablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleId)) {
            query.put("sampleId", request.sampleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendSceneVariables"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendSceneVariablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本&amp;场景下的变量列表</p>
     * 
     * @param request DescribeRecommendSceneVariablesRequest
     * @return DescribeRecommendSceneVariablesResponse
     */
    public DescribeRecommendSceneVariablesResponse describeRecommendSceneVariables(DescribeRecommendSceneVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendSceneVariablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变量推荐详情查询接口</p>
     * 
     * @param request DescribeRecommendTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendTaskDetailResponse
     */
    public DescribeRecommendTaskDetailResponse describeRecommendTaskDetailWithOptions(DescribeRecommendTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendTaskDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变量推荐详情查询接口</p>
     * 
     * @param request DescribeRecommendTaskDetailRequest
     * @return DescribeRecommendTaskDetailResponse
     */
    public DescribeRecommendTaskDetailResponse describeRecommendTaskDetail(DescribeRecommendTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变量推荐列表查询接口</p>
     * 
     * @param request DescribeRecommendTaskPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendTaskPageListResponse
     */
    public DescribeRecommendTaskPageListResponse describeRecommendTaskPageListWithOptions(DescribeRecommendTaskPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendTaskPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendTaskPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变量推荐列表查询接口</p>
     * 
     * @param request DescribeRecommendTaskPageListRequest
     * @return DescribeRecommendTaskPageListResponse
     */
    public DescribeRecommendTaskPageListResponse describeRecommendTaskPageList(DescribeRecommendTaskPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendTaskPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量下的指标信息</p>
     * 
     * @param request DescribeRecommendVariablesVelocityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendVariablesVelocityResponse
     */
    public DescribeRecommendVariablesVelocityResponse describeRecommendVariablesVelocityWithOptions(DescribeRecommendVariablesVelocityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableIdsStr)) {
            query.put("variableIdsStr", request.variableIdsStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendVariablesVelocity"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendVariablesVelocityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量下的指标信息</p>
     * 
     * @param request DescribeRecommendVariablesVelocityRequest
     * @return DescribeRecommendVariablesVelocityResponse
     */
    public DescribeRecommendVariablesVelocityResponse describeRecommendVariablesVelocity(DescribeRecommendVariablesVelocityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendVariablesVelocityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持的指标列表</p>
     * 
     * @param request DescribeRecommendVelocitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendVelocitiesResponse
     */
    public DescribeRecommendVelocitiesResponse describeRecommendVelocitiesWithOptions(DescribeRecommendVelocitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendVelocities"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendVelocitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持的指标列表</p>
     * 
     * @param request DescribeRecommendVelocitiesRequest
     * @return DescribeRecommendVelocitiesResponse
     */
    public DescribeRecommendVelocitiesResponse describeRecommendVelocities(DescribeRecommendVelocitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendVelocitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询ApiGateway支持的region列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询ApiGateway支持的region列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询请求命中详情</p>
     * 
     * @param request DescribeRequestHitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRequestHitResponse
     */
    public DescribeRequestHitResponse describeRequestHitWithOptions(DescribeRequestHitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sRequestId)) {
            query.put("sRequestId", request.sRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRequestHit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRequestHitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询请求命中详情</p>
     * 
     * @param request DescribeRequestHitRequest
     * @return DescribeRequestHitResponse
     */
    public DescribeRequestHitResponse describeRequestHit(DescribeRequestHitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRequestHitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>请求峰值</p>
     * 
     * @param request DescribeRequestPeakReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRequestPeakReportResponse
     */
    public DescribeRequestPeakReportResponse describeRequestPeakReportWithOptions(DescribeRequestPeakReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRequestPeakReport"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRequestPeakReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>请求峰值</p>
     * 
     * @param request DescribeRequestPeakReportRequest
     * @return DescribeRequestPeakReportResponse
     */
    public DescribeRequestPeakReportResponse describeRequestPeakReport(DescribeRequestPeakReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRequestPeakReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下钻分析</p>
     * 
     * @param request DescribeResultCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResultCountResponse
     */
    public DescribeResultCountResponse describeResultCountWithOptions(DescribeResultCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResultCount"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResultCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下钻分析</p>
     * 
     * @param request DescribeResultCountRequest
     * @return DescribeResultCountResponse
     */
    public DescribeResultCountResponse describeResultCount(DescribeResultCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResultCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险地图概览图表(折线图)</p>
     * 
     * @param request DescribeRiskLineChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskLineChartResponse
     */
    public DescribeRiskLineChartResponse describeRiskLineChartWithOptions(DescribeRiskLineChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskLineChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskLineChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险地图概览图表(折线图)</p>
     * 
     * @param request DescribeRiskLineChartRequest
     * @return DescribeRiskLineChartResponse
     */
    public DescribeRiskLineChartResponse describeRiskLineChart(DescribeRiskLineChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskLineChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略概览列表</p>
     * 
     * @param request DescribeRuleBarChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleBarChartResponse
     */
    public DescribeRuleBarChartResponse describeRuleBarChartWithOptions(DescribeRuleBarChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleBarChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleBarChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略概览列表</p>
     * 
     * @param request DescribeRuleBarChartRequest
     * @return DescribeRuleBarChartResponse
     */
    public DescribeRuleBarChartResponse describeRuleBarChart(DescribeRuleBarChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleBarChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据用户Id查询策略数</p>
     * 
     * @param request DescribeRuleCountByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleCountByUserIdResponse
     */
    public DescribeRuleCountByUserIdResponse describeRuleCountByUserIdWithOptions(DescribeRuleCountByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleCountByUserId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleCountByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据用户Id查询策略数</p>
     * 
     * @param request DescribeRuleCountByUserIdRequest
     * @return DescribeRuleCountByUserIdResponse
     */
    public DescribeRuleCountByUserIdResponse describeRuleCountByUserId(DescribeRuleCountByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleCountByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略/版本详情</p>
     * 
     * @param request DescribeRuleDetailByRuleIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleDetailByRuleIdResponse
     */
    public DescribeRuleDetailByRuleIdResponse describeRuleDetailByRuleIdWithOptions(DescribeRuleDetailByRuleIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleDetailByRuleId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleDetailByRuleIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略/版本详情</p>
     * 
     * @param request DescribeRuleDetailByRuleIdRequest
     * @return DescribeRuleDetailByRuleIdResponse
     */
    public DescribeRuleDetailByRuleIdResponse describeRuleDetailByRuleId(DescribeRuleDetailByRuleIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleDetailByRuleIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略命中详情</p>
     * 
     * @param request DescribeRuleHitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleHitResponse
     */
    public DescribeRuleHitResponse describeRuleHitWithOptions(DescribeRuleHitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSnapshotId)) {
            query.put("ruleSnapshotId", request.ruleSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sRequestId)) {
            query.put("sRequestId", request.sRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleHit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleHitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略命中详情</p>
     * 
     * @param request DescribeRuleHitRequest
     * @return DescribeRuleHitResponse
     */
    public DescribeRuleHitResponse describeRuleHit(DescribeRuleHitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleHitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略列表</p>
     * 
     * @param request DescribeRuleListByEventCodesListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleListByEventCodesListResponse
     */
    public DescribeRuleListByEventCodesListResponse describeRuleListByEventCodesListWithOptions(DescribeRuleListByEventCodesListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleListByEventCodesList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleListByEventCodesListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略列表</p>
     * 
     * @param request DescribeRuleListByEventCodesListRequest
     * @return DescribeRuleListByEventCodesListResponse
     */
    public DescribeRuleListByEventCodesListResponse describeRuleListByEventCodesList(DescribeRuleListByEventCodesListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleListByEventCodesListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略列表</p>
     * 
     * @param request DescribeRulePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRulePageListResponse
     */
    public DescribeRulePageListResponse describeRulePageListWithOptions(DescribeRulePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAuthType)) {
            query.put("ruleAuthType", request.ruleAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRulePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRulePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略列表</p>
     * 
     * @param request DescribeRulePageListRequest
     * @return DescribeRulePageListResponse
     */
    public DescribeRulePageListResponse describeRulePageList(DescribeRulePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRulePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ruleId+version查询历史快照</p>
     * 
     * @param request DescribeRuleSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleSnapshotResponse
     */
    public DescribeRuleSnapshotResponse describeRuleSnapshotWithOptions(DescribeRuleSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotVersion)) {
            query.put("snapshotVersion", request.snapshotVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleSnapshot"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ruleId+version查询历史快照</p>
     * 
     * @param request DescribeRuleSnapshotRequest
     * @return DescribeRuleSnapshotResponse
     */
    public DescribeRuleSnapshotResponse describeRuleSnapshot(DescribeRuleSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略版本列表</p>
     * 
     * @param request DescribeRuleVersionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleVersionListResponse
     */
    public DescribeRuleVersionListResponse describeRuleVersionListWithOptions(DescribeRuleVersionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRuleVersionList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleVersionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询策略版本列表</p>
     * 
     * @param request DescribeRuleVersionListRequest
     * @return DescribeRuleVersionListResponse
     */
    public DescribeRuleVersionListResponse describeRuleVersionList(DescribeRuleVersionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRuleVersionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取老旧版本sdk下载列表</p>
     * 
     * @param request DescribeSDKDownloadListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSDKDownloadListResponse
     */
    public DescribeSDKDownloadListResponse describeSDKDownloadListWithOptions(DescribeSDKDownloadListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("deviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("listType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSDKDownloadList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSDKDownloadListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取老旧版本sdk下载列表</p>
     * 
     * @param request DescribeSDKDownloadListRequest
     * @return DescribeSDKDownloadListResponse
     */
    public DescribeSDKDownloadListResponse describeSDKDownloadList(DescribeSDKDownloadListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSDKDownloadListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSafConsoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafConsoleResponse
     */
    public DescribeSafConsoleResponse describeSafConsoleWithOptions(DescribeSafConsoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafConsole"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafConsoleResponse());
    }

    /**
     * @param request DescribeSafConsoleRequest
     * @return DescribeSafConsoleResponse
     */
    public DescribeSafConsoleResponse describeSafConsole(DescribeSafConsoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafConsoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询saf_de订单</p>
     * 
     * @param request DescribeSafDeOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafDeOrderResponse
     */
    public DescribeSafDeOrderResponse describeSafDeOrderWithOptions(DescribeSafDeOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafDeOrder"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafDeOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询saf_de订单</p>
     * 
     * @param request DescribeSafDeOrderRequest
     * @return DescribeSafDeOrderResponse
     */
    public DescribeSafDeOrderResponse describeSafDeOrder(DescribeSafDeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafDeOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询订单信息</p>
     * 
     * @param request DescribeSafOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafOrderResponse
     */
    public DescribeSafOrderResponse describeSafOrderWithOptions(DescribeSafOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exactProductCode)) {
            query.put("exactProductCode", request.exactProductCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafOrder"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询订单信息</p>
     * 
     * @param request DescribeSafOrderRequest
     * @return DescribeSafOrderResponse
     */
    public DescribeSafOrderResponse describeSafOrder(DescribeSafOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入配置</p>
     * 
     * @param request DescribeSafStartConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafStartConfigResponse
     */
    public DescribeSafStartConfigResponse describeSafStartConfigWithOptions(DescribeSafStartConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafStartConfig"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafStartConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入配置</p>
     * 
     * @param request DescribeSafStartConfigRequest
     * @return DescribeSafStartConfigResponse
     */
    public DescribeSafStartConfigResponse describeSafStartConfig(DescribeSafStartConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafStartConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入配置</p>
     * 
     * @param request DescribeSafStartStepsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafStartStepsResponse
     */
    public DescribeSafStartStepsResponse describeSafStartStepsWithOptions(DescribeSafStartStepsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunServer)) {
            query.put("aliyunServer", request.aliyunServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTypesStr)) {
            query.put("deviceTypesStr", request.deviceTypesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("serverRegion", request.serverRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafStartSteps"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafStartStepsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入配置</p>
     * 
     * @param request DescribeSafStartStepsRequest
     * @return DescribeSafStartStepsResponse
     */
    public DescribeSafStartStepsResponse describeSafStartSteps(DescribeSafStartStepsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafStartStepsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险标签列表</p>
     * 
     * @param request DescribeSafTagListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSafTagListResponse
     */
    public DescribeSafTagListResponse describeSafTagListWithOptions(DescribeSafTagListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("apiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSafTagList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSafTagListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险标签列表</p>
     * 
     * @param request DescribeSafTagListRequest
     * @return DescribeSafTagListResponse
     */
    public DescribeSafTagListResponse describeSafTagList(DescribeSafTagListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSafTagListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>样本列表分页查询</p>
     * 
     * @param request DescribeSampleDataListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleDataListResponse
     */
    public DescribeSampleDataListResponse describeSampleDataListWithOptions(DescribeSampleDataListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteTag)) {
            query.put("deleteTag", request.deleteTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryContent)) {
            query.put("queryContent", request.queryContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleId)) {
            query.put("sampleId", request.sampleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleDataList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleDataListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>样本列表分页查询</p>
     * 
     * @param request DescribeSampleDataListRequest
     * @return DescribeSampleDataListResponse
     */
    public DescribeSampleDataListResponse describeSampleDataList(DescribeSampleDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleDataListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本示例授权</p>
     * 
     * @param request DescribeSampleDemoDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleDemoDownloadUrlResponse
     */
    public DescribeSampleDemoDownloadUrlResponse describeSampleDemoDownloadUrlWithOptions(DescribeSampleDemoDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleDemoDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleDemoDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本示例授权</p>
     * 
     * @param request DescribeSampleDemoDownloadUrlRequest
     * @return DescribeSampleDemoDownloadUrlResponse
     */
    public DescribeSampleDemoDownloadUrlResponse describeSampleDemoDownloadUrl(DescribeSampleDemoDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleDemoDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本下载授权信息</p>
     * 
     * @param request DescribeSampleDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleDownloadUrlResponse
     */
    public DescribeSampleDownloadUrlResponse describeSampleDownloadUrlWithOptions(DescribeSampleDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleId)) {
            query.put("sampleId", request.sampleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本下载授权信息</p>
     * 
     * @param request DescribeSampleDownloadUrlRequest
     * @return DescribeSampleDownloadUrlResponse
     */
    public DescribeSampleDownloadUrlResponse describeSampleDownloadUrl(DescribeSampleDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本详情</p>
     * 
     * @param request DescribeSampleInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleInfoResponse
     */
    public DescribeSampleInfoResponse describeSampleInfoWithOptions(DescribeSampleInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("versions", request.versions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleInfo"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本详情</p>
     * 
     * @param request DescribeSampleInfoRequest
     * @return DescribeSampleInfoResponse
     */
    public DescribeSampleInfoResponse describeSampleInfo(DescribeSampleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本列表</p>
     * 
     * @param request DescribeSampleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleListResponse
     */
    public DescribeSampleListResponse describeSampleListWithOptions(DescribeSampleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleType)) {
            query.put("sampleType", request.sampleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleValue)) {
            query.put("sampleValue", request.sampleValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本列表</p>
     * 
     * @param request DescribeSampleListRequest
     * @return DescribeSampleListResponse
     */
    public DescribeSampleListResponse describeSampleList(DescribeSampleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询场景列表</p>
     * 
     * @param request DescribeSampleSceneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleSceneListResponse
     */
    public DescribeSampleSceneListResponse describeSampleSceneListWithOptions(DescribeSampleSceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleSceneList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleSceneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询场景列表</p>
     * 
     * @param request DescribeSampleSceneListRequest
     * @return DescribeSampleSceneListResponse
     */
    public DescribeSampleSceneListResponse describeSampleSceneList(DescribeSampleSceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleSceneListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request DescribeSampleTagListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleTagListResponse
     */
    public DescribeSampleTagListResponse describeSampleTagListWithOptions(DescribeSampleTagListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleTagList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleTagListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request DescribeSampleTagListRequest
     * @return DescribeSampleTagListResponse
     */
    public DescribeSampleTagListResponse describeSampleTagList(DescribeSampleTagListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleTagListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本上传授权信息</p>
     * 
     * @param request DescribeSampleUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleUploadPolicyResponse
     */
    public DescribeSampleUploadPolicyResponse describeSampleUploadPolicyWithOptions(DescribeSampleUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleUploadPolicy"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询样本上传授权信息</p>
     * 
     * @param request DescribeSampleUploadPolicyRequest
     * @return DescribeSampleUploadPolicyResponse
     */
    public DescribeSampleUploadPolicyResponse describeSampleUploadPolicy(DescribeSampleUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>场景化服务事件下拉列表</p>
     * 
     * @param request DescribeSceneAllEventNameCodeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneAllEventNameCodeListResponse
     */
    public DescribeSceneAllEventNameCodeListResponse describeSceneAllEventNameCodeListWithOptions(DescribeSceneAllEventNameCodeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneAllEventNameCodeList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneAllEventNameCodeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>场景化服务事件下拉列表</p>
     * 
     * @param request DescribeSceneAllEventNameCodeListRequest
     * @return DescribeSceneAllEventNameCodeListResponse
     */
    public DescribeSceneAllEventNameCodeListResponse describeSceneAllEventNameCodeList(DescribeSceneAllEventNameCodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneAllEventNameCodeListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>场景化风控事件列表</p>
     * 
     * @param request DescribeSceneEventPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneEventPageListResponse
     */
    public DescribeSceneEventPageListResponse describeSceneEventPageListWithOptions(DescribeSceneEventPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameOrCode)) {
            query.put("nameOrCode", request.nameOrCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneEventPageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneEventPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>场景化风控事件列表</p>
     * 
     * @param request DescribeSceneEventPageListRequest
     * @return DescribeSceneEventPageListResponse
     */
    public DescribeSceneEventPageListResponse describeSceneEventPageList(DescribeSceneEventPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneEventPageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风控服务白盒化策略列表</p>
     * 
     * @param request DescribeSceneRulePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneRulePageListResponse
     */
    public DescribeSceneRulePageListResponse describeSceneRulePageListWithOptions(DescribeSceneRulePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAuthType)) {
            query.put("ruleAuthType", request.ruleAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneRulePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneRulePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风控服务白盒化策略列表</p>
     * 
     * @param request DescribeSceneRulePageListRequest
     * @return DescribeSceneRulePageListResponse
     */
    public DescribeSceneRulePageListResponse describeSceneRulePageList(DescribeSceneRulePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneRulePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分值区间数量分析</p>
     * 
     * @param request DescribeScoreSectionNumLineChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScoreSectionNumLineChartResponse
     */
    public DescribeScoreSectionNumLineChartResponse describeScoreSectionNumLineChartWithOptions(DescribeScoreSectionNumLineChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byPassEventCodes)) {
            query.put("byPassEventCodes", request.byPassEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainEventCodes)) {
            query.put("mainEventCodes", request.mainEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shuntEventCodes)) {
            query.put("shuntEventCodes", request.shuntEventCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScoreSectionNumLineChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScoreSectionNumLineChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分值区间数量分析</p>
     * 
     * @param request DescribeScoreSectionNumLineChartRequest
     * @return DescribeScoreSectionNumLineChartResponse
     */
    public DescribeScoreSectionNumLineChartResponse describeScoreSectionNumLineChart(DescribeScoreSectionNumLineChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScoreSectionNumLineChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>主事件/旁路事件/分流事件分值区间占比</p>
     * 
     * @param request DescribeScoreSectionPieChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScoreSectionPieChartResponse
     */
    public DescribeScoreSectionPieChartResponse describeScoreSectionPieChartWithOptions(DescribeScoreSectionPieChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("eventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScoreSectionPieChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScoreSectionPieChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主事件/旁路事件/分流事件分值区间占比</p>
     * 
     * @param request DescribeScoreSectionPieChartRequest
     * @return DescribeScoreSectionPieChartResponse
     */
    public DescribeScoreSectionPieChartResponse describeScoreSectionPieChart(DescribeScoreSectionPieChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScoreSectionPieChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分值区间占比分析</p>
     * 
     * @param request DescribeScoreSectionRatioLineChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScoreSectionRatioLineChartResponse
     */
    public DescribeScoreSectionRatioLineChartResponse describeScoreSectionRatioLineChartWithOptions(DescribeScoreSectionRatioLineChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byPassEventCodes)) {
            query.put("byPassEventCodes", request.byPassEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainEventCodes)) {
            query.put("mainEventCodes", request.mainEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shuntEventCodes)) {
            query.put("shuntEventCodes", request.shuntEventCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScoreSectionRatioLineChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScoreSectionRatioLineChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分值区间占比分析</p>
     * 
     * @param request DescribeScoreSectionRatioLineChartRequest
     * @return DescribeScoreSectionRatioLineChartResponse
     */
    public DescribeScoreSectionRatioLineChartResponse describeScoreSectionRatioLineChart(DescribeScoreSectionRatioLineChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScoreSectionRatioLineChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务ID列表</p>
     * 
     * @param request DescribeSelectItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSelectItemResponse
     */
    public DescribeSelectItemResponse describeSelectItemWithOptions(DescribeSelectItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSelectItem"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSelectItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务ID列表</p>
     * 
     * @param request DescribeSelectItemRequest
     * @return DescribeSelectItemResponse
     */
    public DescribeSelectItemResponse describeSelectItem(DescribeSelectItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSelectItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ServiceAppkey下拉</p>
     * 
     * @param request DescribeServiceAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceAppKeyResponse
     */
    public DescribeServiceAppKeyResponse describeServiceAppKeyWithOptions(DescribeServiceAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceAppKey"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ServiceAppkey下拉</p>
     * 
     * @param request DescribeServiceAppKeyRequest
     * @return DescribeServiceAppKeyResponse
     */
    public DescribeServiceAppKeyResponse describeServiceAppKey(DescribeServiceAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务调用量</p>
     * 
     * @param request DescribeServiceConsumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceConsumeResponse
     */
    public DescribeServiceConsumeResponse describeServiceConsumeWithOptions(DescribeServiceConsumeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("serviceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceConsume"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceConsumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务调用量</p>
     * 
     * @param request DescribeServiceConsumeRequest
     * @return DescribeServiceConsumeResponse
     */
    public DescribeServiceConsumeResponse describeServiceConsume(DescribeServiceConsumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceConsumeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载服务调用量数据文件URL</p>
     * 
     * @param request DescribeServiceConsumeDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceConsumeDownloadUrlResponse
     */
    public DescribeServiceConsumeDownloadUrlResponse describeServiceConsumeDownloadUrlWithOptions(DescribeServiceConsumeDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("serviceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceConsumeDownloadUrl"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceConsumeDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载服务调用量数据文件URL</p>
     * 
     * @param request DescribeServiceConsumeDownloadUrlRequest
     * @return DescribeServiceConsumeDownloadUrlResponse
     */
    public DescribeServiceConsumeDownloadUrlResponse describeServiceConsumeDownloadUrl(DescribeServiceConsumeDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceConsumeDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务列表</p>
     * 
     * @param request DescribeServiceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceListResponse
     */
    public DescribeServiceListResponse describeServiceListWithOptions(DescribeServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务列表</p>
     * 
     * @param request DescribeServiceListRequest
     * @return DescribeServiceListResponse
     */
    public DescribeServiceListResponse describeServiceList(DescribeServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预估调用信息</p>
     * 
     * @param request DescribeSimulationPreditInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSimulationPreditInfoResponse
     */
    public DescribeSimulationPreditInfoResponse describeSimulationPreditInfoWithOptions(DescribeSimulationPreditInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesStr)) {
            query.put("rulesStr", request.rulesStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSimulationPreditInfo"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSimulationPreditInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预估调用信息</p>
     * 
     * @param request DescribeSimulationPreditInfoRequest
     * @return DescribeSimulationPreditInfoResponse
     */
    public DescribeSimulationPreditInfoResponse describeSimulationPreditInfo(DescribeSimulationPreditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSimulationPreditInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务记录数</p>
     * 
     * @param request DescribeSimulationTaskCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSimulationTaskCountResponse
     */
    public DescribeSimulationTaskCountResponse describeSimulationTaskCountWithOptions(DescribeSimulationTaskCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            query.put("dataSourceConfig", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("dataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersStr)) {
            query.put("filtersStr", request.filtersStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSimulationTaskCount"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSimulationTaskCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务记录数</p>
     * 
     * @param request DescribeSimulationTaskCountRequest
     * @return DescribeSimulationTaskCountResponse
     */
    public DescribeSimulationTaskCountResponse describeSimulationTaskCount(DescribeSimulationTaskCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSimulationTaskCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeSimulationTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSimulationTaskListResponse
     */
    public DescribeSimulationTaskListResponse describeSimulationTaskListWithOptions(DescribeSimulationTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSimulationTaskList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSimulationTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeSimulationTaskListRequest
     * @return DescribeSimulationTaskListResponse
     */
    public DescribeSimulationTaskListResponse describeSimulationTaskList(DescribeSimulationTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSimulationTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取project配置</p>
     * 
     * @param request DescribeSlsUrlConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsUrlConfigResponse
     */
    public DescribeSlsUrlConfigResponse describeSlsUrlConfigWithOptions(DescribeSlsUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsUrlConfig"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsUrlConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取project配置</p>
     * 
     * @param request DescribeSlsUrlConfigRequest
     * @return DescribeSlsUrlConfigResponse
     */
    public DescribeSlsUrlConfigResponse describeSlsUrlConfig(DescribeSlsUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsUrlConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持仿真的策略列表</p>
     * 
     * @param request DescribeSupportRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupportRuleListResponse
     */
    public DescribeSupportRuleListResponse describeSupportRuleListWithOptions(DescribeSupportRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportRuleList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询支持仿真的策略列表</p>
     * 
     * @param request DescribeSupportRuleListRequest
     * @return DescribeSupportRuleListResponse
     */
    public DescribeSupportRuleListResponse describeSupportRuleList(DescribeSupportRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportRuleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签列表</p>
     * 
     * @param request DescribeTagListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagListResponse
     */
    public DescribeTagListResponse describeTagListWithOptions(DescribeTagListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签列表</p>
     * 
     * @param request DescribeTagListRequest
     * @return DescribeTagListResponse
     */
    public DescribeTagListResponse describeTagList(DescribeTagListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签概览列表</p>
     * 
     * @param request DescribeTagsBarChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsBarChartResponse
     */
    public DescribeTagsBarChartResponse describeTagsBarChartWithOptions(DescribeTagsBarChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.result)) {
            query.put("result", request.result);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsBarChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsBarChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签概览列表</p>
     * 
     * @param request DescribeTagsBarChartRequest
     * @return DescribeTagsBarChartResponse
     */
    public DescribeTagsBarChartResponse describeTagsBarChart(DescribeTagsBarChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsBarChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签波动检测</p>
     * 
     * @param request DescribeTagsFluctuationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsFluctuationResponse
     */
    public DescribeTagsFluctuationResponse describeTagsFluctuationWithOptions(DescribeTagsFluctuationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsFluctuation"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsFluctuationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签波动检测</p>
     * 
     * @param request DescribeTagsFluctuationRequest
     * @return DescribeTagsFluctuationResponse
     */
    public DescribeTagsFluctuationResponse describeTagsFluctuation(DescribeTagsFluctuationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsFluctuationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request DescribeTagsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsListResponse
     */
    public DescribeTagsListResponse describeTagsListWithOptions(DescribeTagsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request DescribeTagsListRequest
     * @return DescribeTagsListResponse
     */
    public DescribeTagsListResponse describeTagsList(DescribeTagsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中数量分析</p>
     * 
     * @param request DescribeTagsNumLineChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsNumLineChartResponse
     */
    public DescribeTagsNumLineChartResponse describeTagsNumLineChartWithOptions(DescribeTagsNumLineChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byPassEventCodes)) {
            query.put("byPassEventCodes", request.byPassEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainEventCodes)) {
            query.put("mainEventCodes", request.mainEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shuntEventCodes)) {
            query.put("shuntEventCodes", request.shuntEventCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsNumLineChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsNumLineChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中数量分析</p>
     * 
     * @param request DescribeTagsNumLineChartRequest
     * @return DescribeTagsNumLineChartResponse
     */
    public DescribeTagsNumLineChartResponse describeTagsNumLineChart(DescribeTagsNumLineChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsNumLineChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中占比分析</p>
     * 
     * @param request DescribeTagsRatioLineChartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsRatioLineChartResponse
     */
    public DescribeTagsRatioLineChartResponse describeTagsRatioLineChartWithOptions(DescribeTagsRatioLineChartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byPassEventCodes)) {
            query.put("byPassEventCodes", request.byPassEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainEventCodes)) {
            query.put("mainEventCodes", request.mainEventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shuntEventCodes)) {
            query.put("shuntEventCodes", request.shuntEventCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsRatioLineChart"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsRatioLineChartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中占比分析</p>
     * 
     * @param request DescribeTagsRatioLineChartRequest
     * @return DescribeTagsRatioLineChartResponse
     */
    public DescribeTagsRatioLineChartResponse describeTagsRatioLineChart(DescribeTagsRatioLineChartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsRatioLineChartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中趋势</p>
     * 
     * @param request DescribeTagsTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsTrendResponse
     */
    public DescribeTagsTrendResponse describeTagsTrendWithOptions(DescribeTagsTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.result)) {
            query.put("result", request.result);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagsTrend"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>标签命中趋势</p>
     * 
     * @param request DescribeTagsTrendRequest
     * @return DescribeTagsTrendResponse
     */
    public DescribeTagsTrendResponse describeTagsTrend(DescribeTagsTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskListResponse
     */
    public DescribeTaskListResponse describeTaskListWithOptions(DescribeTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            query.put("IsPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务列表</p>
     * 
     * @param request DescribeTaskListRequest
     * @return DescribeTaskListResponse
     */
    public DescribeTaskListResponse describeTaskList(DescribeTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务日志列表</p>
     * 
     * @param request DescribeTaskLogListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskLogListResponse
     */
    public DescribeTaskLogListResponse describeTaskLogListWithOptions(DescribeTaskLogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            query.put("IsPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskLogId)) {
            query.put("TaskLogId", request.taskLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskLogList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskLogListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务日志列表</p>
     * 
     * @param request DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     */
    public DescribeTaskLogListResponse describeTaskLogList(DescribeTaskLogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskLogListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版详情</p>
     * 
     * @param request DescribeTemplateBaseInfoByTemplateIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateBaseInfoByTemplateIdResponse
     */
    public DescribeTemplateBaseInfoByTemplateIdResponse describeTemplateBaseInfoByTemplateIdWithOptions(DescribeTemplateBaseInfoByTemplateIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateBaseInfoByTemplateId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateBaseInfoByTemplateIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件模版详情</p>
     * 
     * @param request DescribeTemplateBaseInfoByTemplateIdRequest
     * @return DescribeTemplateBaseInfoByTemplateIdResponse
     */
    public DescribeTemplateBaseInfoByTemplateIdResponse describeTemplateBaseInfoByTemplateId(DescribeTemplateBaseInfoByTemplateIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateBaseInfoByTemplateIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeTemplateCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateCountResponse
     */
    public DescribeTemplateCountResponse describeTemplateCountWithOptions(DescribeTemplateCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateCount"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询事件总数量</p>
     * 
     * @param request DescribeTemplateCountRequest
     * @return DescribeTemplateCountResponse
     */
    public DescribeTemplateCountResponse describeTemplateCount(DescribeTemplateCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模版下载</p>
     * 
     * @param request DescribeTemplateDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateDownloadResponse
     */
    public DescribeTemplateDownloadResponse describeTemplateDownloadWithOptions(DescribeTemplateDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateDownload"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateDownloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模版下载</p>
     * 
     * @param request DescribeTemplateDownloadRequest
     * @return DescribeTemplateDownloadResponse
     */
    public DescribeTemplateDownloadResponse describeTemplateDownload(DescribeTemplateDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateDownloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件名称查询事件列表</p>
     * 
     * @param request DescribeTemplatePageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplatePageListResponse
     */
    public DescribeTemplatePageListResponse describeTemplatePageListWithOptions(DescribeTemplatePageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("templateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateSearchItem)) {
            query.put("templateSearchItem", request.templateSearchItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateStatus)) {
            query.put("templateStatus", request.templateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplatePageList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplatePageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据事件名称查询事件列表</p>
     * 
     * @param request DescribeTemplatePageListRequest
     * @return DescribeTemplatePageListResponse
     */
    public DescribeTemplatePageListResponse describeTemplatePageList(DescribeTemplatePageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatePageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户使用过服务列表</p>
     * 
     * @param request DescribeUsedServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsedServiceResponse
     */
    public DescribeUsedServiceResponse describeUsedServiceWithOptions(DescribeUsedServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsedService"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsedServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户使用过服务列表</p>
     * 
     * @param request DescribeUsedServiceRequest
     * @return DescribeUsedServiceResponse
     */
    public DescribeUsedServiceResponse describeUsedService(DescribeUsedServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsedServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前登录用户信息</p>
     * 
     * @param request DescribeUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserInfoResponse
     */
    public DescribeUserInfoResponse describeUserInfoWithOptions(DescribeUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserInfo"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前登录用户信息</p>
     * 
     * @param request DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     */
    public DescribeUserInfoResponse describeUserInfo(DescribeUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量绑定信息</p>
     * 
     * @param request DescribeVariableBindDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableBindDetailResponse
     */
    public DescribeVariableBindDetailResponse describeVariableBindDetailWithOptions(DescribeVariableBindDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defineId)) {
            query.put("defineId", request.defineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableBindDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableBindDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量绑定信息</p>
     * 
     * @param request DescribeVariableBindDetailRequest
     * @return DescribeVariableBindDetailResponse
     */
    public DescribeVariableBindDetailResponse describeVariableBindDetail(DescribeVariableBindDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableBindDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeVariableDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableDetailResponse
     */
    public DescribeVariableDetailResponse describeVariableDetailWithOptions(DescribeVariableDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableDetail"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeVariableDetailRequest
     * @return DescribeVariableDetailResponse
     */
    public DescribeVariableDetailResponse describeVariableDetail(DescribeVariableDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量收费信息</p>
     * 
     * @param request DescribeVariableFeeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableFeeResponse
     */
    public DescribeVariableFeeResponse describeVariableFeeWithOptions(DescribeVariableFeeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableFee"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableFeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量收费信息</p>
     * 
     * @param request DescribeVariableFeeRequest
     * @return DescribeVariableFeeResponse
     */
    public DescribeVariableFeeResponse describeVariableFee(DescribeVariableFeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableFeeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeVariableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableListResponse
     */
    public DescribeVariableListResponse describeVariableListWithOptions(DescribeVariableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refObjId)) {
            query.put("refObjId", request.refObjId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesStr)) {
            query.put("typesStr", request.typesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量详情</p>
     * 
     * @param request DescribeVariableListRequest
     * @return DescribeVariableListResponse
     */
    public DescribeVariableListResponse describeVariableList(DescribeVariableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量定义</p>
     * 
     * @param request DescribeVariableMarketListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableMarketListResponse
     */
    public DescribeVariableMarketListResponse describeVariableMarketListWithOptions(DescribeVariableMarketListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargingMode)) {
            query.put("chargingMode", request.chargingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paging)) {
            query.put("paging", request.paging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryContent)) {
            query.put("queryContent", request.queryContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenesStr)) {
            query.put("scenesStr", request.scenesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableMarketList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableMarketListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量定义</p>
     * 
     * @param request DescribeVariableMarketListRequest
     * @return DescribeVariableMarketListResponse
     */
    public DescribeVariableMarketListResponse describeVariableMarketList(DescribeVariableMarketListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableMarketListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询配置信息</p>
     * 
     * @param request DescribeVariableSceneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVariableSceneListResponse
     */
    public DescribeVariableSceneListResponse describeVariableSceneListWithOptions(DescribeVariableSceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configKey)) {
            query.put("configKey", request.configKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paging)) {
            query.put("paging", request.paging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVariableSceneList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVariableSceneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询配置信息</p>
     * 
     * @param request DescribeVariableSceneListRequest
     * @return DescribeVariableSceneListResponse
     */
    public DescribeVariableSceneListResponse describeVariableSceneList(DescribeVariableSceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVariableSceneListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量测试</p>
     * 
     * @param request ExpressionTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExpressionTestResponse
     */
    public ExpressionTestResponse expressionTestWithOptions(ExpressionTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariable)) {
            query.put("expressionVariable", request.expressionVariable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariableIds)) {
            query.put("expressionVariableIds", request.expressionVariableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpressionTest"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpressionTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量测试</p>
     * 
     * @param request ExpressionTestRequest
     * @return ExpressionTestResponse
     */
    public ExpressionTestResponse expressionTest(ExpressionTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.expressionTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传</p>
     * 
     * @param request FileUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileUploadResponse
     */
    public FileUploadResponse fileUploadWithOptions(FileUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tab)) {
            query.put("Tab", request.tab);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileUpload"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传</p>
     * 
     * @param request FileUploadRequest
     * @return FileUploadResponse
     */
    public FileUploadResponse fileUpload(FileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fileUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或导入名单</p>
     * 
     * @param request ImportNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportNameListResponse
     */
    public ImportNameListResponse importNameListWithOptions(ImportNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importType)) {
            query.put("importType", request.importType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameListType)) {
            query.put("nameListType", request.nameListType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            query.put("variableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportNameList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或导入名单</p>
     * 
     * @param request ImportNameListRequest
     * @return ImportNameListResponse
     */
    public ImportNameListResponse importNameList(ImportNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入模板事件</p>
     * 
     * @param request ImportTemplateEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportTemplateEventResponse
     */
    public ImportTemplateEventResponse importTemplateEventWithOptions(ImportTemplateEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTemplateIds)) {
            query.put("eventTemplateIds", request.eventTemplateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportTemplateEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportTemplateEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入模板事件</p>
     * 
     * @param request ImportTemplateEventRequest
     * @return ImportTemplateEventResponse
     */
    public ImportTemplateEventResponse importTemplateEvent(ImportTemplateEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importTemplateEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新备注</p>
     * 
     * @param request ModifyAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppKeyResponse
     */
    public ModifyAppKeyResponse modifyAppKeyWithOptions(ModifyAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("appKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppKey"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新备注</p>
     * 
     * @param request ModifyAppKeyRequest
     * @return ModifyAppKeyResponse
     */
    public ModifyAppKeyResponse modifyAppKey(ModifyAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑累计变量</p>
     * 
     * @param request ModifyCustVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustVariableResponse
     */
    public ModifyCustVariableResponse modifyCustVariableWithOptions(ModifyCustVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodes)) {
            query.put("eventCodes", request.eventCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑累计变量</p>
     * 
     * @param request ModifyCustVariableRequest
     * @return ModifyCustVariableResponse
     */
    public ModifyCustVariableResponse modifyCustVariable(ModifyCustVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑事件</p>
     * 
     * @param request ModifyEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEventResponse
     */
    public ModifyEventResponse modifyEventWithOptions(ModifyEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizVersion)) {
            query.put("bizVersion", request.bizVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputFieldsStr)) {
            query.put("inputFieldsStr", request.inputFieldsStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑事件</p>
     * 
     * @param request ModifyEventRequest
     * @return ModifyEventResponse
     */
    public ModifyEventResponse modifyEvent(ModifyEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改事件状态</p>
     * 
     * @param request ModifyEventStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEventStatusResponse
     */
    public ModifyEventStatusResponse modifyEventStatusWithOptions(ModifyEventStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromEventSatus)) {
            query.put("fromEventSatus", request.fromEventSatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toEventSatus)) {
            query.put("toEventSatus", request.toEventSatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEventStatus"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改事件状态</p>
     * 
     * @param request ModifyEventStatusRequest
     * @return ModifyEventStatusResponse
     */
    public ModifyEventStatusResponse modifyEventStatus(ModifyEventStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEventStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑自定义变量</p>
     * 
     * @param request ModifyExpressionVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressionVariableResponse
     */
    public ModifyExpressionVariableResponse modifyExpressionVariableWithOptions(ModifyExpressionVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionTitle)) {
            query.put("expressionTitle", request.expressionTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariable)) {
            query.put("expressionVariable", request.expressionVariable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlier)) {
            query.put("outlier", request.outlier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressionVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressionVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑自定义变量</p>
     * 
     * @param request ModifyExpressionVariableRequest
     * @return ModifyExpressionVariableResponse
     */
    public ModifyExpressionVariableResponse modifyExpressionVariable(ModifyExpressionVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressionVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改字段</p>
     * 
     * @param request ModifyFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFieldResponse
     */
    public ModifyFieldResponse modifyFieldWithOptions(ModifyFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enumData)) {
            query.put("enumData", request.enumData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyField"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改字段</p>
     * 
     * @param request ModifyFieldRequest
     * @return ModifyFieldResponse
     */
    public ModifyFieldResponse modifyField(ModifyFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改poc任务</p>
     * 
     * @param request ModifyPocTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPocTaskResponse
     */
    public ModifyPocTaskResponse modifyPocTaskWithOptions(ModifyPocTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("accessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("fileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("serviceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPocTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPocTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改poc任务</p>
     * 
     * @param request ModifyPocTaskRequest
     * @return ModifyPocTaskResponse
     */
    public ModifyPocTaskResponse modifyPocTask(ModifyPocTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPocTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略修改优先级</p>
     * 
     * @param request ModifyRulePriorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRulePriorityResponse
     */
    public ModifyRulePriorityResponse modifyRulePriorityWithOptions(ModifyRulePriorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRulePriority"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRulePriorityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略修改优先级</p>
     * 
     * @param request ModifyRulePriorityRequest
     * @return ModifyRulePriorityResponse
     */
    public ModifyRulePriorityResponse modifyRulePriority(ModifyRulePriorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRulePriorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略版本申请状态变更</p>
     * 
     * @param request ModifyRuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRuleStatusResponse
     */
    public ModifyRuleStatusResponse modifyRuleStatusWithOptions(ModifyRuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyUserId)) {
            query.put("applyUserId", request.applyUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyUserName)) {
            query.put("applyUserName", request.applyUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditRemark)) {
            query.put("auditRemark", request.auditRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditUserId)) {
            query.put("auditUserId", request.auditUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditUserName)) {
            query.put("auditUserName", request.auditUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("eventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAuditType)) {
            query.put("ruleAuditType", request.ruleAuditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRuleStatus"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略版本申请状态变更</p>
     * 
     * @param request ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     */
    public ModifyRuleStatusResponse modifyRuleStatus(ModifyRuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改模版</p>
     * 
     * @param request ModifyTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTemplateResponse
     */
    public ModifyTemplateResponse modifyTemplateWithOptions(ModifyTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputFields)) {
            query.put("inputFields", request.inputFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTemplate"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改模版</p>
     * 
     * @param request ModifyTemplateRequest
     * @return ModifyTemplateResponse
     */
    public ModifyTemplateResponse modifyTemplate(ModifyTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新模版状态</p>
     * 
     * @param request ModifyTemplateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTemplateStatusResponse
     */
    public ModifyTemplateStatusResponse modifyTemplateStatusWithOptions(ModifyTemplateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTemplateSatus)) {
            query.put("fromTemplateSatus", request.fromTemplateSatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTemplateSatus)) {
            query.put("toTemplateSatus", request.toTemplateSatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTemplateStatus"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTemplateStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模版状态</p>
     * 
     * @param request ModifyTemplateStatusRequest
     * @return ModifyTemplateStatusResponse
     */
    public ModifyTemplateStatusResponse modifyTemplateStatus(ModifyTemplateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改变量信息</p>
     * 
     * @param request ModifyVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVariableResponse
     */
    public ModifyVariableResponse modifyVariableWithOptions(ModifyVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改变量信息</p>
     * 
     * @param request ModifyVariableRequest
     * @return ModifyVariableResponse
     */
    public ModifyVariableResponse modifyVariable(ModifyVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通服务</p>
     * 
     * @param request OpenConsoleSlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenConsoleSlsResponse
     */
    public OpenConsoleSlsResponse openConsoleSlsWithOptions(OpenConsoleSlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenConsoleSls"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenConsoleSlsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通服务</p>
     * 
     * @param request OpenConsoleSlsRequest
     * @return OpenConsoleSlsResponse
     */
    public OpenConsoleSlsResponse openConsoleSls(OpenConsoleSlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openConsoleSlsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作收藏</p>
     * 
     * @param request OperateFavoriteVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateFavoriteVariableResponse
     */
    public OperateFavoriteVariableResponse operateFavoriteVariableWithOptions(OperateFavoriteVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("operate", request.operate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateFavoriteVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateFavoriteVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作收藏</p>
     * 
     * @param request OperateFavoriteVariableRequest
     * @return OperateFavoriteVariableResponse
     */
    public OperateFavoriteVariableResponse operateFavoriteVariable(OperateFavoriteVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateFavoriteVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>企业认证</p>
     * 
     * @param request PermissionCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PermissionCheckResponse
     */
    public PermissionCheckResponse permissionCheckWithOptions(PermissionCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PermissionCheck"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PermissionCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>企业认证</p>
     * 
     * @param request PermissionCheckRequest
     * @return PermissionCheckResponse
     */
    public PermissionCheckResponse permissionCheck(PermissionCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.permissionCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>白盒化策略详情查询</p>
     * 
     * @param request QueryAuthRuleDetailByRuleIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuthRuleDetailByRuleIdResponse
     */
    public QueryAuthRuleDetailByRuleIdResponse queryAuthRuleDetailByRuleIdWithOptions(QueryAuthRuleDetailByRuleIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuthRuleDetailByRuleId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuthRuleDetailByRuleIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>白盒化策略详情查询</p>
     * 
     * @param request QueryAuthRuleDetailByRuleIdRequest
     * @return QueryAuthRuleDetailByRuleIdResponse
     */
    public QueryAuthRuleDetailByRuleIdResponse queryAuthRuleDetailByRuleId(QueryAuthRuleDetailByRuleIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuthRuleDetailByRuleIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权用户名</p>
     * 
     * @param request QueryAuthUserNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuthUserNameResponse
     */
    public QueryAuthUserNameResponse queryAuthUserNameWithOptions(QueryAuthUserNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindId)) {
            query.put("bindId", request.bindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuthUserName"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuthUserNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权用户名</p>
     * 
     * @param request QueryAuthUserNameRequest
     * @return QueryAuthUserNameResponse
     */
    public QueryAuthUserNameResponse queryAuthUserName(QueryAuthUserNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuthUserNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>事件模版授权用户列表</p>
     * 
     * @param request QueryAuthorizationUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuthorizationUserListResponse
     */
    public QueryAuthorizationUserListResponse queryAuthorizationUserListWithOptions(QueryAuthorizationUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuthorizationUserList"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuthorizationUserListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>事件模版授权用户列表</p>
     * 
     * @param request QueryAuthorizationUserListRequest
     * @return QueryAuthorizationUserListResponse
     */
    public QueryAuthorizationUserListResponse queryAuthorizationUserList(QueryAuthorizationUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuthorizationUserListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤回</p>
     * 
     * @param request RecallRuleAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecallRuleAuditResponse
     */
    public RecallRuleAuditResponse recallRuleAuditWithOptions(RecallRuleAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecallRuleAudit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecallRuleAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤回</p>
     * 
     * @param request RecallRuleAuditRequest
     * @return RecallRuleAuditResponse
     */
    public RecallRuleAuditResponse recallRuleAudit(RecallRuleAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recallRuleAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除事件</p>
     * 
     * @param request RemoveEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveEventResponse
     */
    public RemoveEventResponse removeEventWithOptions(RemoveEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            query.put("createType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("templateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除事件</p>
     * 
     * @param request RemoveEventRequest
     * @return RemoveEventResponse
     */
    public RemoveEventResponse removeEvent(RemoveEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模版事件</p>
     * 
     * @param request RemoveTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTemplateResponse
     */
    public RemoveTemplateResponse removeTemplateWithOptions(RemoveTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTemplate"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模版事件</p>
     * 
     * @param request RemoveTemplateRequest
     * @return RemoveTemplateResponse
     */
    public RemoveTemplateResponse removeTemplate(RemoveTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模板下载</p>
     * 
     * @param request SampleFileDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SampleFileDownloadResponse
     */
    public SampleFileDownloadResponse sampleFileDownloadWithOptions(SampleFileDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tab)) {
            query.put("Tab", request.tab);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SampleFileDownload"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SampleFileDownloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模板下载</p>
     * 
     * @param request SampleFileDownloadRequest
     * @return SampleFileDownloadResponse
     */
    public SampleFileDownloadResponse sampleFileDownload(SampleFileDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sampleFileDownloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存自定义列</p>
     * 
     * @param request SaveAnalysisColumnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAnalysisColumnResponse
     */
    public SaveAnalysisColumnResponse saveAnalysisColumnWithOptions(SaveAnalysisColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAnalysisColumn"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAnalysisColumnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存自定义列</p>
     * 
     * @param request SaveAnalysisColumnRequest
     * @return SaveAnalysisColumnResponse
     */
    public SaveAnalysisColumnResponse saveAnalysisColumn(SaveAnalysisColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAnalysisColumnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>旁路/分流配置</p>
     * 
     * @param request SaveByPassOrShuntEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveByPassOrShuntEventResponse
     */
    public SaveByPassOrShuntEventResponse saveByPassOrShuntEventWithOptions(SaveByPassOrShuntEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("eventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveByPassOrShuntEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveByPassOrShuntEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>旁路/分流配置</p>
     * 
     * @param request SaveByPassOrShuntEventRequest
     * @return SaveByPassOrShuntEventResponse
     */
    public SaveByPassOrShuntEventResponse saveByPassOrShuntEvent(SaveByPassOrShuntEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveByPassOrShuntEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启/停止旁路事件</p>
     * 
     * @param request StartOrStopByPassShuntEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOrStopByPassShuntEventResponse
     */
    public StartOrStopByPassShuntEventResponse startOrStopByPassShuntEventWithOptions(StartOrStopByPassShuntEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOrStopByPassShuntEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartOrStopByPassShuntEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启/停止旁路事件</p>
     * 
     * @param request StartOrStopByPassShuntEventRequest
     * @return StartOrStopByPassShuntEventResponse
     */
    public StartOrStopByPassShuntEventResponse startOrStopByPassShuntEvent(StartOrStopByPassShuntEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startOrStopByPassShuntEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始执行任务</p>
     * 
     * @param request StartSimulationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSimulationTaskResponse
     */
    public StartSimulationTaskResponse startSimulationTaskWithOptions(StartSimulationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSimulationTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSimulationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开始执行任务</p>
     * 
     * @param request StartSimulationTaskRequest
     * @return StartSimulationTaskResponse
     */
    public StartSimulationTaskResponse startSimulationTask(StartSimulationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSimulationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止任务</p>
     * 
     * @param request StopSimulationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSimulationTaskResponse
     */
    public StopSimulationTaskResponse stopSimulationTaskWithOptions(StopSimulationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSimulationTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSimulationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止任务</p>
     * 
     * @param request StopSimulationTaskRequest
     * @return StopSimulationTaskResponse
     */
    public StopSimulationTaskResponse stopSimulationTask(StopSimulationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopSimulationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建策略</p>
     * 
     * @param request SubmitImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImportTaskResponse
     */
    public SubmitImportTaskResponse submitImportTaskWithOptions(SubmitImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImportTask"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建策略</p>
     * 
     * @param request SubmitImportTaskRequest
     * @return SubmitImportTaskResponse
     */
    public SubmitImportTaskResponse submitImportTask(SubmitImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量开关</p>
     * 
     * @param request SwitchExpressionVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchExpressionVariableResponse
     */
    public SwitchExpressionVariableResponse switchExpressionVariableWithOptions(SwitchExpressionVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchExpressionVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchExpressionVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义变量开关</p>
     * 
     * @param request SwitchExpressionVariableRequest
     * @return SwitchExpressionVariableResponse
     */
    public SwitchExpressionVariableResponse switchExpressionVariable(SwitchExpressionVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchExpressionVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>字段开关</p>
     * 
     * @param request SwitchFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchFieldResponse
     */
    public SwitchFieldResponse switchFieldWithOptions(SwitchFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchField"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>字段开关</p>
     * 
     * @param request SwitchFieldRequest
     * @return SwitchFieldResponse
     */
    public SwitchFieldResponse switchField(SwitchFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量启用/禁用</p>
     * 
     * @param request SwitchQueryVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchQueryVariableResponse
     */
    public SwitchQueryVariableResponse switchQueryVariableWithOptions(SwitchQueryVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchQueryVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchQueryVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询变量启用/禁用</p>
     * 
     * @param request SwitchQueryVariableRequest
     * @return SwitchQueryVariableResponse
     */
    public SwitchQueryVariableResponse switchQueryVariable(SwitchQueryVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchQueryVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>一键切换上线</p>
     * 
     * @param request SwitchToOnlineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchToOnlineResponse
     */
    public SwitchToOnlineResponse switchToOnlineWithOptions(SwitchToOnlineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchToOnline"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchToOnlineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>一键切换上线</p>
     * 
     * @param request SwitchToOnlineRequest
     * @return SwitchToOnlineResponse
     */
    public SwitchToOnlineResponse switchToOnline(SwitchToOnlineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchToOnlineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>累计变量开关</p>
     * 
     * @param request SwitchVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchVariableResponse
     */
    public SwitchVariableResponse switchVariableWithOptions(SwitchVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("dataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>累计变量开关</p>
     * 
     * @param request SwitchVariableRequest
     * @return SwitchVariableResponse
     */
    public SwitchVariableResponse switchVariable(SwitchVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>判断任务名是否重复</p>
     * 
     * @param request TaskNameByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TaskNameByUserIdResponse
     */
    public TaskNameByUserIdResponse taskNameByUserIdWithOptions(TaskNameByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("RegId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaskNameByUserId"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaskNameByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>判断任务名是否重复</p>
     * 
     * @param request TaskNameByUserIdRequest
     * @return TaskNameByUserIdResponse
     */
    public TaskNameByUserIdResponse taskNameByUserId(TaskNameByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taskNameByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改查询条件</p>
     * 
     * @param request UpdateAnalysisConditionFavoriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAnalysisConditionFavoriteResponse
     */
    public UpdateAnalysisConditionFavoriteResponse updateAnalysisConditionFavoriteWithOptions(UpdateAnalysisConditionFavoriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBeginTime)) {
            query.put("eventBeginTime", request.eventBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventEndTime)) {
            query.put("eventEndTime", request.eventEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("fieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("fieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAnalysisConditionFavorite"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAnalysisConditionFavoriteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改查询条件</p>
     * 
     * @param request UpdateAnalysisConditionFavoriteRequest
     * @return UpdateAnalysisConditionFavoriteResponse
     */
    public UpdateAnalysisConditionFavoriteResponse updateAnalysisConditionFavorite(UpdateAnalysisConditionFavoriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAnalysisConditionFavoriteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批</p>
     * 
     * @param request UpdateAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuditResponse
     */
    public UpdateAuditResponse updateAuditWithOptions(UpdateAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditMsg)) {
            query.put("auditMsg", request.auditMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditRelationType)) {
            query.put("auditRelationType", request.auditRelationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("auditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAudit"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批</p>
     * 
     * @param request UpdateAuditRequest
     * @return UpdateAuditResponse
     */
    public UpdateAuditResponse updateAudit(UpdateAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改授权策略</p>
     * 
     * @param request UpdateAuthRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthRuleResponse
     */
    public UpdateAuthRuleResponse updateAuthRuleWithOptions(UpdateAuthRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("ruleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleExpressions)) {
            query.put("ruleExpressions", request.ruleExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthRule"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改授权策略</p>
     * 
     * @param request UpdateAuthRuleRequest
     * @return UpdateAuthRuleResponse
     */
    public UpdateAuthRuleResponse updateAuthRule(UpdateAuthRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑旁路事件</p>
     * 
     * @param request UpdateByPassShuntEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateByPassShuntEventResponse
     */
    public UpdateByPassShuntEventResponse updateByPassShuntEventWithOptions(UpdateByPassShuntEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("eventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("eventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateByPassShuntEvent"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateByPassShuntEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑旁路事件</p>
     * 
     * @param request UpdateByPassShuntEventRequest
     * @return UpdateByPassShuntEventResponse
     */
    public UpdateByPassShuntEventResponse updateByPassShuntEvent(UpdateByPassShuntEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateByPassShuntEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源</p>
     * 
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("ossKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改数据源</p>
     * 
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义查询变量修改</p>
     * 
     * @param request UpdateQueryVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQueryVariableResponse
     */
    public UpdateQueryVariableResponse updateQueryVariableWithOptions(UpdateQueryVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceCode)) {
            query.put("dataSourceCode", request.dataSourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionTitle)) {
            query.put("expressionTitle", request.expressionTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionVariable)) {
            query.put("expressionVariable", request.expressionVariable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlier)) {
            query.put("outlier", request.outlier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQueryVariable"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQueryVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义查询变量修改</p>
     * 
     * @param request UpdateQueryVariableRequest
     * @return UpdateQueryVariableResponse
     */
    public UpdateQueryVariableResponse updateQueryVariable(UpdateQueryVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQueryVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新策略</p>
     * 
     * @param request UpdateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicExpression)) {
            query.put("logicExpression", request.logicExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleActions)) {
            query.put("ruleActions", request.ruleActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleExpressions)) {
            query.put("ruleExpressions", request.ruleExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleStatus)) {
            query.put("ruleStatus", request.ruleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersionId)) {
            query.put("ruleVersionId", request.ruleVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRule"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新策略</p>
     * 
     * @param request UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新策略基础信息</p>
     * 
     * @param request UpdateRuleBaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRuleBaseResponse
     */
    public UpdateRuleBaseResponse updateRuleBaseWithOptions(UpdateRuleBaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleRuleId)) {
            query.put("consoleRuleId", request.consoleRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("eventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("ruleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("ruleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleBase"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新策略基础信息</p>
     * 
     * @param request UpdateRuleBaseRequest
     * @return UpdateRuleBaseResponse
     */
    public UpdateRuleBaseResponse updateRuleBase(UpdateRuleBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleBaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改样本</p>
     * 
     * @param request UpdateSampleBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSampleBatchResponse
     */
    public UpdateSampleBatchResponse updateSampleBatchWithOptions(UpdateSampleBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regId)) {
            query.put("regId", request.regId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("versions", request.versions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSampleBatch"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSampleBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改样本</p>
     * 
     * @param request UpdateSampleBatchRequest
     * @return UpdateSampleBatchResponse
     */
    public UpdateSampleBatchResponse updateSampleBatch(UpdateSampleBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSampleBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单用户API创建样本</p>
     * 
     * @param request UploadSampleApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadSampleApiResponse
     */
    public UploadSampleApiResponse uploadSampleApiWithOptions(UploadSampleApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleType)) {
            query.put("SampleType", request.sampleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadSampleApi"),
            new TeaPair("version", "2021-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadSampleApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单用户API创建样本</p>
     * 
     * @param request UploadSampleApiRequest
     * @return UploadSampleApiResponse
     */
    public UploadSampleApiResponse uploadSampleApi(UploadSampleApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadSampleApiWithOptions(request, runtime);
    }
}
