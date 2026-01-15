// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013;

import com.aliyun.tea.*;
import com.aliyun.polardbai20251013.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("polardbai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建chatbi配置表</p>
     * 
     * @param request ChatBIConfigCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigCreateResponse
     */
    public ChatBIConfigCreateResponse chatBIConfigCreateWithOptions(ChatBIConfigCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigCreate"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi配置表</p>
     * 
     * @param request ChatBIConfigCreateRequest
     * @return ChatBIConfigCreateResponse
     */
    public ChatBIConfigCreateResponse chatBIConfigCreate(ChatBIConfigCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除chatbi配置表</p>
     * 
     * @param request ChatBIConfigDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigDeleteResponse
     */
    public ChatBIConfigDeleteResponse chatBIConfigDeleteWithOptions(ChatBIConfigDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigDelete"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除chatbi配置表</p>
     * 
     * @param request ChatBIConfigDeleteRequest
     * @return ChatBIConfigDeleteResponse
     */
    public ChatBIConfigDeleteResponse chatBIConfigDelete(ChatBIConfigDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIConfigDeleteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigDeleteEntryResponse
     */
    public ChatBIConfigDeleteEntryResponse chatBIConfigDeleteEntryWithOptions(ChatBIConfigDeleteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigDeleteEntry"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigDeleteEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIConfigDeleteEntryRequest
     * @return ChatBIConfigDeleteEntryResponse
     */
    public ChatBIConfigDeleteEntryResponse chatBIConfigDeleteEntry(ChatBIConfigDeleteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigDeleteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi配置表内容</p>
     * 
     * @param request ChatBIConfigQueryEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigQueryEntriesResponse
     */
    public ChatBIConfigQueryEntriesResponse chatBIConfigQueryEntriesWithOptions(ChatBIConfigQueryEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigQueryEntries"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigQueryEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi配置表内容</p>
     * 
     * @param request ChatBIConfigQueryEntriesRequest
     * @return ChatBIConfigQueryEntriesResponse
     */
    public ChatBIConfigQueryEntriesResponse chatBIConfigQueryEntries(ChatBIConfigQueryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigQueryEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询客户chatbi配置表名</p>
     * 
     * @param request ChatBIConfigQueryTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigQueryTablesResponse
     */
    public ChatBIConfigQueryTablesResponse chatBIConfigQueryTablesWithOptions(ChatBIConfigQueryTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputField)) {
            query.put("InputField", request.inputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigQueryTables"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigQueryTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询客户chatbi配置表名</p>
     * 
     * @param request ChatBIConfigQueryTablesRequest
     * @return ChatBIConfigQueryTablesResponse
     */
    public ChatBIConfigQueryTablesResponse chatBIConfigQueryTables(ChatBIConfigQueryTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigQueryTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改chatbi配置表内容</p>
     * 
     * @param request ChatBIConfigUpdateEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIConfigUpdateEntryResponse
     */
    public ChatBIConfigUpdateEntryResponse chatBIConfigUpdateEntryWithOptions(ChatBIConfigUpdateEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formulaFunction)) {
            query.put("FormulaFunction", request.formulaFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFunctional)) {
            query.put("IsFunctional", request.isFunctional);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryFunction)) {
            query.put("QueryFunction", request.queryFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlCondition)) {
            query.put("SqlCondition", request.sqlCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlFunction)) {
            query.put("SqlFunction", request.sqlFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textCondition)) {
            query.put("TextCondition", request.textCondition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIConfigUpdateEntry"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIConfigUpdateEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改chatbi配置表内容</p>
     * 
     * @param request ChatBIConfigUpdateEntryRequest
     * @return ChatBIConfigUpdateEntryResponse
     */
    public ChatBIConfigUpdateEntryResponse chatBIConfigUpdateEntry(ChatBIConfigUpdateEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIConfigUpdateEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileTemplateDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIFileTemplateDownloadResponse
     */
    public ChatBIFileTemplateDownloadResponse chatBIFileTemplateDownloadWithOptions(ChatBIFileTemplateDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIFileTemplateDownload"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIFileTemplateDownloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileTemplateDownloadRequest
     * @return ChatBIFileTemplateDownloadResponse
     */
    public ChatBIFileTemplateDownloadResponse chatBIFileTemplateDownload(ChatBIFileTemplateDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIFileTemplateDownloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIFileUploadResponse
     */
    public ChatBIFileUploadResponse chatBIFileUploadWithOptions(ChatBIFileUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIFileUpload"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIFileUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileUploadRequest
     * @return ChatBIFileUploadResponse
     */
    public ChatBIFileUploadResponse chatBIFileUpload(ChatBIFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIFileUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileUploadCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIFileUploadCallbackResponse
     */
    public ChatBIFileUploadCallbackResponse chatBIFileUploadCallbackWithOptions(ChatBIFileUploadCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterSetName)) {
            query.put("CharacterSetName", request.characterSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIFileUploadCallback"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIFileUploadCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIFileUploadCallbackRequest
     * @return ChatBIFileUploadCallbackResponse
     */
    public ChatBIFileUploadCallbackResponse chatBIFileUploadCallback(ChatBIFileUploadCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIFileUploadCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIPatternCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternCreateResponse
     */
    public ChatBIPatternCreateResponse chatBIPatternCreateWithOptions(ChatBIPatternCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNameSuffix)) {
            query.put("TableNameSuffix", request.tableNameSuffix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternCreate"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi问题模板表</p>
     * 
     * @param request ChatBIPatternCreateRequest
     * @return ChatBIPatternCreateResponse
     */
    public ChatBIPatternCreateResponse chatBIPatternCreate(ChatBIPatternCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除chatbi问题模板表</p>
     * 
     * @param request ChatBIPatternDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternDeleteResponse
     */
    public ChatBIPatternDeleteResponse chatBIPatternDeleteWithOptions(ChatBIPatternDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternDelete"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除chatbi问题模板表</p>
     * 
     * @param request ChatBIPatternDeleteRequest
     * @return ChatBIPatternDeleteResponse
     */
    public ChatBIPatternDeleteResponse chatBIPatternDelete(ChatBIPatternDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternDeleteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternDeleteEntryResponse
     */
    public ChatBIPatternDeleteEntryResponse chatBIPatternDeleteEntryWithOptions(ChatBIPatternDeleteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternDeleteEntry"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternDeleteEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternDeleteEntryRequest
     * @return ChatBIPatternDeleteEntryResponse
     */
    public ChatBIPatternDeleteEntryResponse chatBIPatternDeleteEntry(ChatBIPatternDeleteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternDeleteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi检索索引表</p>
     * 
     * @param request ChatBIPatternIndexCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternIndexCreateResponse
     */
    public ChatBIPatternIndexCreateResponse chatBIPatternIndexCreateWithOptions(ChatBIPatternIndexCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternTableName)) {
            query.put("PatternTableName", request.patternTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNameSuffix)) {
            query.put("TableNameSuffix", request.tableNameSuffix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternIndexCreate"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternIndexCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi检索索引表</p>
     * 
     * @param request ChatBIPatternIndexCreateRequest
     * @return ChatBIPatternIndexCreateResponse
     */
    public ChatBIPatternIndexCreateResponse chatBIPatternIndexCreate(ChatBIPatternIndexCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternIndexCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除检索索引表</p>
     * 
     * @param request ChatBIPatternIndexDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternIndexDeleteResponse
     */
    public ChatBIPatternIndexDeleteResponse chatBIPatternIndexDeleteWithOptions(ChatBIPatternIndexDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternIndexDelete"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternIndexDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除检索索引表</p>
     * 
     * @param request ChatBIPatternIndexDeleteRequest
     * @return ChatBIPatternIndexDeleteResponse
     */
    public ChatBIPatternIndexDeleteResponse chatBIPatternIndexDelete(ChatBIPatternIndexDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternIndexDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检索索引表名</p>
     * 
     * @param request ChatBIPatternIndexQueryTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternIndexQueryTablesResponse
     */
    public ChatBIPatternIndexQueryTablesResponse chatBIPatternIndexQueryTablesWithOptions(ChatBIPatternIndexQueryTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputField)) {
            query.put("InputField", request.inputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternIndexQueryTables"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternIndexQueryTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询检索索引表名</p>
     * 
     * @param request ChatBIPatternIndexQueryTablesRequest
     * @return ChatBIPatternIndexQueryTablesResponse
     */
    public ChatBIPatternIndexQueryTablesResponse chatBIPatternIndexQueryTables(ChatBIPatternIndexQueryTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternIndexQueryTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternQueryEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternQueryEntriesResponse
     */
    public ChatBIPatternQueryEntriesResponse chatBIPatternQueryEntriesWithOptions(ChatBIPatternQueryEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternQueryEntries"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternQueryEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternQueryEntriesRequest
     * @return ChatBIPatternQueryEntriesResponse
     */
    public ChatBIPatternQueryEntriesResponse chatBIPatternQueryEntries(ChatBIPatternQueryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternQueryEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表名</p>
     * 
     * @param request ChatBIPatternQueryTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternQueryTablesResponse
     */
    public ChatBIPatternQueryTablesResponse chatBIPatternQueryTablesWithOptions(ChatBIPatternQueryTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputField)) {
            query.put("InputField", request.inputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternQueryTables"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternQueryTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表名</p>
     * 
     * @param request ChatBIPatternQueryTablesRequest
     * @return ChatBIPatternQueryTablesResponse
     */
    public ChatBIPatternQueryTablesResponse chatBIPatternQueryTables(ChatBIPatternQueryTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternQueryTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternUpdateEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPatternUpdateEntryResponse
     */
    public ChatBIPatternUpdateEntryResponse chatBIPatternUpdateEntryWithOptions(ChatBIPatternUpdateEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternDescription)) {
            query.put("PatternDescription", request.patternDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternParams)) {
            query.put("PatternParams", request.patternParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternQuestion)) {
            query.put("PatternQuestion", request.patternQuestion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternSql)) {
            query.put("PatternSql", request.patternSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPatternUpdateEntry"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPatternUpdateEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改chatbi问题模板表内容</p>
     * 
     * @param request ChatBIPatternUpdateEntryRequest
     * @return ChatBIPatternUpdateEntryResponse
     */
    public ChatBIPatternUpdateEntryResponse chatBIPatternUpdateEntry(ChatBIPatternUpdateEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPatternUpdateEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流式返回</p>
     * 
     * @param tmpReq ChatBIPredictSseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIPredictSseResponse
     */
    public ChatBIPredictSseResponse chatBIPredictSseWithOptions(ChatBIPredictSseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChatBIPredictSseShrinkRequest request = new ChatBIPredictSseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateChart)) {
            query.put("GenerateChart", request.generateChart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateSummary)) {
            query.put("GenerateSummary", request.generateSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternIndexTableName)) {
            query.put("PatternIndexTableName", request.patternIndexTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            query.put("Question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaIndexTableName)) {
            query.put("SchemaIndexTableName", request.schemaIndexTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectData)) {
            query.put("SelectData", request.selectData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thinkingMode)) {
            query.put("ThinkingMode", request.thinkingMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIPredictSse"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIPredictSseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流式返回</p>
     * 
     * @param request ChatBIPredictSseRequest
     * @return ChatBIPredictSseResponse
     */
    public ChatBIPredictSseResponse chatBIPredictSse(ChatBIPredictSseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIPredictSseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi检索索引表</p>
     * 
     * @param request ChatBISchemaIndexCreateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBISchemaIndexCreateResponse
     */
    public ChatBISchemaIndexCreateResponse chatBISchemaIndexCreateWithOptions(ChatBISchemaIndexCreateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsExcluded)) {
            query.put("ColumnsExcluded", request.columnsExcluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNameSuffix)) {
            query.put("TableNameSuffix", request.tableNameSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablesIncluded)) {
            query.put("TablesIncluded", request.tablesIncluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toSample)) {
            query.put("ToSample", request.toSample);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBISchemaIndexCreate"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBISchemaIndexCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建chatbi检索索引表</p>
     * 
     * @param request ChatBISchemaIndexCreateRequest
     * @return ChatBISchemaIndexCreateResponse
     */
    public ChatBISchemaIndexCreateResponse chatBISchemaIndexCreate(ChatBISchemaIndexCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBISchemaIndexCreateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除检索索引表</p>
     * 
     * @param request ChatBISchemaIndexDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBISchemaIndexDeleteResponse
     */
    public ChatBISchemaIndexDeleteResponse chatBISchemaIndexDeleteWithOptions(ChatBISchemaIndexDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBISchemaIndexDelete"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBISchemaIndexDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除检索索引表</p>
     * 
     * @param request ChatBISchemaIndexDeleteRequest
     * @return ChatBISchemaIndexDeleteResponse
     */
    public ChatBISchemaIndexDeleteResponse chatBISchemaIndexDelete(ChatBISchemaIndexDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBISchemaIndexDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检索索引表名</p>
     * 
     * @param request ChatBISchemaIndexQueryTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBISchemaIndexQueryTablesResponse
     */
    public ChatBISchemaIndexQueryTablesResponse chatBISchemaIndexQueryTablesWithOptions(ChatBISchemaIndexQueryTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputField)) {
            query.put("InputField", request.inputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBISchemaIndexQueryTables"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBISchemaIndexQueryTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询检索索引表名</p>
     * 
     * @param request ChatBISchemaIndexQueryTablesRequest
     * @return ChatBISchemaIndexQueryTablesResponse
     */
    public ChatBISchemaIndexQueryTablesResponse chatBISchemaIndexQueryTables(ChatBISchemaIndexQueryTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBISchemaIndexQueryTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIUpdateTableValidationColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatBIUpdateTableValidationColumnsResponse
     */
    public ChatBIUpdateTableValidationColumnsResponse chatBIUpdateTableValidationColumnsWithOptions(ChatBIUpdateTableValidationColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatBIUpdateTableValidationColumns"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatBIUpdateTableValidationColumnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询chatbi问题模板表内容</p>
     * 
     * @param request ChatBIUpdateTableValidationColumnsRequest
     * @return ChatBIUpdateTableValidationColumnsResponse
     */
    public ChatBIUpdateTableValidationColumnsResponse chatBIUpdateTableValidationColumns(ChatBIUpdateTableValidationColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatBIUpdateTableValidationColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询多模态数据集列表</p>
     * 
     * @param request CreateMultimodalDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMultimodalDatasetResponse
     */
    public CreateMultimodalDatasetResponse createMultimodalDatasetWithOptions(CreateMultimodalDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetDescription)) {
            query.put("DatasetDescription", request.datasetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMultimodalDataset"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMultimodalDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询多模态数据集列表</p>
     * 
     * @param request CreateMultimodalDatasetRequest
     * @return CreateMultimodalDatasetResponse
     */
    public CreateMultimodalDatasetResponse createMultimodalDataset(CreateMultimodalDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultimodalDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Embedding</p>
     * 
     * @param request CreateMultimodalDatasetEmbeddingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMultimodalDatasetEmbeddingResponse
     */
    public CreateMultimodalDatasetEmbeddingResponse createMultimodalDatasetEmbeddingWithOptions(CreateMultimodalDatasetEmbeddingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelMode)) {
            query.put("ModelMode", request.modelMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMultimodalDatasetEmbedding"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMultimodalDatasetEmbeddingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Embedding</p>
     * 
     * @param request CreateMultimodalDatasetEmbeddingRequest
     * @return CreateMultimodalDatasetEmbeddingResponse
     */
    public CreateMultimodalDatasetEmbeddingResponse createMultimodalDatasetEmbedding(CreateMultimodalDatasetEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultimodalDatasetEmbeddingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建SearchTask</p>
     * 
     * @param tmpReq CreateMultimodalSearchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMultimodalSearchTaskResponse
     */
    public CreateMultimodalSearchTaskResponse createMultimodalSearchTaskWithOptions(CreateMultimodalSearchTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMultimodalSearchTaskShrinkRequest request = new CreateMultimodalSearchTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.datasetIds)) {
            request.datasetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.datasetIds, "DatasetIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetIdsShrink)) {
            query.put("DatasetIds", request.datasetIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingModel)) {
            query.put("EmbeddingModel", request.embeddingModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelMode)) {
            query.put("ModelMode", request.modelMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchModel)) {
            query.put("SearchModel", request.searchModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            query.put("TopK", request.topK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMultimodalSearchTask"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMultimodalSearchTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建SearchTask</p>
     * 
     * @param request CreateMultimodalSearchTaskRequest
     * @return CreateMultimodalSearchTaskResponse
     */
    public CreateMultimodalSearchTaskResponse createMultimodalSearchTask(CreateMultimodalSearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultimodalSearchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态数据集</p>
     * 
     * @param request DeleteMultimodalDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMultimodalDatasetResponse
     */
    public DeleteMultimodalDatasetResponse deleteMultimodalDatasetWithOptions(DeleteMultimodalDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultimodalDataset"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMultimodalDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态数据集</p>
     * 
     * @param request DeleteMultimodalDatasetRequest
     * @return DeleteMultimodalDatasetResponse
     */
    public DeleteMultimodalDatasetResponse deleteMultimodalDataset(DeleteMultimodalDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultimodalDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态数据集embedding</p>
     * 
     * @param request DeleteMultimodalEmbeddingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMultimodalEmbeddingResponse
     */
    public DeleteMultimodalEmbeddingResponse deleteMultimodalEmbeddingWithOptions(DeleteMultimodalEmbeddingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embedding)) {
            query.put("Embedding", request.embedding);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultimodalEmbedding"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMultimodalEmbeddingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态数据集embedding</p>
     * 
     * @param request DeleteMultimodalEmbeddingRequest
     * @return DeleteMultimodalEmbeddingResponse
     */
    public DeleteMultimodalEmbeddingResponse deleteMultimodalEmbedding(DeleteMultimodalEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultimodalEmbeddingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载Search任务的结果元数据</p>
     * 
     * @param request DownloadMultimodalSearchTaskResultMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadMultimodalSearchTaskResultMetadataResponse
     */
    public DownloadMultimodalSearchTaskResultMetadataResponse downloadMultimodalSearchTaskResultMetadataWithOptions(DownloadMultimodalSearchTaskResultMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadMultimodalSearchTaskResultMetadata"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadMultimodalSearchTaskResultMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载Search任务的结果元数据</p>
     * 
     * @param request DownloadMultimodalSearchTaskResultMetadataRequest
     * @return DownloadMultimodalSearchTaskResultMetadataResponse
     */
    public DownloadMultimodalSearchTaskResultMetadataResponse downloadMultimodalSearchTaskResultMetadata(DownloadMultimodalSearchTaskResultMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadMultimodalSearchTaskResultMetadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得鉴权token</p>
     * 
     * @param request GetUserTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserTokenResponse
     */
    public GetUserTokenResponse getUserTokenWithOptions(GetUserTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserToken"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得鉴权token</p>
     * 
     * @param request GetUserTokenRequest
     * @return GetUserTokenResponse
     */
    public GetUserTokenResponse getUserToken(GetUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询多模态数据集列表</p>
     * 
     * @param request ListMultimodalDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalDatasetResponse
     */
    public ListMultimodalDatasetResponse listMultimodalDatasetWithOptions(ListMultimodalDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputField)) {
            query.put("InputField", request.inputField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalDataset"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询多模态数据集列表</p>
     * 
     * @param request ListMultimodalDatasetRequest
     * @return ListMultimodalDatasetResponse
     */
    public ListMultimodalDatasetResponse listMultimodalDataset(ListMultimodalDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型列表</p>
     * 
     * @param request ListMultimodalEmbeddingModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalEmbeddingModelResponse
     */
    public ListMultimodalEmbeddingModelResponse listMultimodalEmbeddingModelWithOptions(ListMultimodalEmbeddingModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalEmbeddingModel"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalEmbeddingModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型列表</p>
     * 
     * @param request ListMultimodalEmbeddingModelRequest
     * @return ListMultimodalEmbeddingModelResponse
     */
    public ListMultimodalEmbeddingModelResponse listMultimodalEmbeddingModel(ListMultimodalEmbeddingModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalEmbeddingModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型mode可选列表</p>
     * 
     * @param request ListMultimodalEmbeddingModelModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalEmbeddingModelModeResponse
     */
    public ListMultimodalEmbeddingModelModeResponse listMultimodalEmbeddingModelModeWithOptions(ListMultimodalEmbeddingModelModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalEmbeddingModelMode"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalEmbeddingModelModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型mode可选列表</p>
     * 
     * @param request ListMultimodalEmbeddingModelModeRequest
     * @return ListMultimodalEmbeddingModelModeResponse
     */
    public ListMultimodalEmbeddingModelModeResponse listMultimodalEmbeddingModelMode(ListMultimodalEmbeddingModelModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalEmbeddingModelModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询search模型列表</p>
     * 
     * @param request ListMultimodalSearchModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalSearchModelResponse
     */
    public ListMultimodalSearchModelResponse listMultimodalSearchModelWithOptions(ListMultimodalSearchModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalSearchModel"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalSearchModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询search模型列表</p>
     * 
     * @param request ListMultimodalSearchModelRequest
     * @return ListMultimodalSearchModelResponse
     */
    public ListMultimodalSearchModelResponse listMultimodalSearchModel(ListMultimodalSearchModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalSearchModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询search task列表</p>
     * 
     * @param request ListMultimodalSearchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalSearchTaskResponse
     */
    public ListMultimodalSearchTaskResponse listMultimodalSearchTaskWithOptions(ListMultimodalSearchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalSearchTask"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalSearchTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询search task列表</p>
     * 
     * @param request ListMultimodalSearchTaskRequest
     * @return ListMultimodalSearchTaskResponse
     */
    public ListMultimodalSearchTaskResponse listMultimodalSearchTask(ListMultimodalSearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalSearchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询search task结果列表</p>
     * 
     * @param request ListMultimodalSearchTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultimodalSearchTaskResultResponse
     */
    public ListMultimodalSearchTaskResultResponse listMultimodalSearchTaskResultWithOptions(ListMultimodalSearchTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultimodalSearchTaskResult"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultimodalSearchTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询search task结果列表</p>
     * 
     * @param request ListMultimodalSearchTaskResultRequest
     * @return ListMultimodalSearchTaskResultResponse
     */
    public ListMultimodalSearchTaskResultResponse listMultimodalSearchTaskResult(ListMultimodalSearchTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultimodalSearchTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集信息</p>
     * 
     * @param request UpdateMultimodalDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMultimodalDatasetResponse
     */
    public UpdateMultimodalDatasetResponse updateMultimodalDatasetWithOptions(UpdateMultimodalDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetDescription)) {
            query.put("DatasetDescription", request.datasetDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMultimodalDataset"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMultimodalDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集信息</p>
     * 
     * @param request UpdateMultimodalDatasetRequest
     * @return UpdateMultimodalDatasetResponse
     */
    public UpdateMultimodalDatasetResponse updateMultimodalDataset(UpdateMultimodalDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMultimodalDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入OSS数据集</p>
     * 
     * @param request UploadOSSMultimodalDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadOSSMultimodalDatasetResponse
     */
    public UploadOSSMultimodalDatasetResponse uploadOSSMultimodalDatasetWithOptions(UploadOSSMultimodalDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            query.put("OssUrl", request.ossUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadOSSMultimodalDataset"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadOSSMultimodalDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入OSS数据集</p>
     * 
     * @param request UploadOSSMultimodalDatasetRequest
     * @return UploadOSSMultimodalDatasetResponse
     */
    public UploadOSSMultimodalDatasetResponse uploadOSSMultimodalDataset(UploadOSSMultimodalDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadOSSMultimodalDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预检验鉴权token</p>
     * 
     * @param request ValidateDatabaseUserTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateDatabaseUserTokenResponse
     */
    public ValidateDatabaseUserTokenResponse validateDatabaseUserTokenWithOptions(ValidateDatabaseUserTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateDatabaseUserToken"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateDatabaseUserTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预检验鉴权token</p>
     * 
     * @param request ValidateDatabaseUserTokenRequest
     * @return ValidateDatabaseUserTokenResponse
     */
    public ValidateDatabaseUserTokenResponse validateDatabaseUserToken(ValidateDatabaseUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateDatabaseUserTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预检验鉴权token</p>
     * 
     * @param request ValidateUserTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateUserTokenResponse
     */
    public ValidateUserTokenResponse validateUserTokenWithOptions(ValidateUserTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMessage)) {
            query.put("AuthMessage", request.authMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateUserToken"),
            new TeaPair("version", "2025-10-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateUserTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预检验鉴权token</p>
     * 
     * @param request ValidateUserTokenRequest
     * @return ValidateUserTokenResponse
     */
    public ValidateUserTokenResponse validateUserToken(ValidateUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateUserTokenWithOptions(request, runtime);
    }
}
