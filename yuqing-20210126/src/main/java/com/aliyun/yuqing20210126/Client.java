// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126;

import com.aliyun.tea.*;
import com.aliyun.yuqing20210126.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yuqing", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AggregateSearchYuqingResponse aggregateSearchYuqing(AggregateSearchYuqingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.aggregateSearchYuqingWithOptions(request, headers, runtime);
    }

    public AggregateSearchYuqingResponse aggregateSearchYuqingWithOptions(AggregateSearchYuqingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregateFunction)) {
            body.put("aggregateFunction", request.aggregateFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByKey)) {
            body.put("groupByKey", request.groupByKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupLimits)) {
            body.put("groupLimits", request.groupLimits);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.searchCondition))) {
            body.put("searchCondition", request.searchCondition);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AggregateSearchYuqing"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/aggSearch.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AggregateSearchYuqingResponse());
    }

    public CloseProductResponse closeProduct(CloseProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeProductWithOptions(request, headers, runtime);
    }

    public CloseProductResponse closeProductWithOptions(CloseProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.productInstance))) {
            body.put("productInstance", request.productInstance);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseProduct"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/closeProduct.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseProductResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            body.put("createUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserName)) {
            body.put("createUserName", request.createUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.project))) {
            body.put("project", request.project);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/createProject.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(request, headers, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedUserId)) {
            body.put("modifiedUserId", request.modifiedUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedUserName)) {
            body.put("modifiedUserName", request.modifiedUserName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/deleteProject.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public GetAnalysisComponentResultResponse getAnalysisComponentResult(GetAnalysisComponentResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnalysisComponentResultWithOptions(request, headers, runtime);
    }

    public GetAnalysisComponentResultResponse getAnalysisComponentResultWithOptions(GetAnalysisComponentResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisId)) {
            query.put("analysisId", request.analysisId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnalysisComponentResult"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/getAnalysisComponentResult.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAnalysisComponentResultResponse());
    }

    public GetMessageDetailResponse getMessageDetail(GetMessageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMessageDetailWithOptions(request, headers, runtime);
    }

    public GetMessageDetailResponse getMessageDetailWithOptions(GetMessageDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            query.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageDetail"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/getMessageFromHbase.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageDetailResponse());
    }

    public ListHotspotMessageResponse listHotspotMessage(ListHotspotMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHotspotMessageWithOptions(request, headers, runtime);
    }

    public ListHotspotMessageResponse listHotspotMessageWithOptions(ListHotspotMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.hotspotSearchCondition))) {
            body.put("hotspotSearchCondition", request.hotspotSearchCondition);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotspotMessage"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/searchHotspotDetail.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotspotMessageResponse());
    }

    public ListYuqingMessagesResponse listYuqingMessages(ListYuqingMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listYuqingMessagesWithOptions(request, headers, runtime);
    }

    public ListYuqingMessagesResponse listYuqingMessagesWithOptions(ListYuqingMessagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.searchCondition))) {
            body.put("searchCondition", request.searchCondition);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListYuqingMessages"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/searchMessages.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYuqingMessagesResponse());
    }

    public OpenProductResponse openProduct(OpenProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openProductWithOptions(request, headers, runtime);
    }

    public OpenProductResponse openProductWithOptions(OpenProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.productInstance))) {
            body.put("productInstance", request.productInstance);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenProduct"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/openProduct.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenProductResponse());
    }

    public QueryAlarmDataListResponse queryAlarmDataList(QueryAlarmDataListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAlarmDataListWithOptions(request, headers, runtime);
    }

    public QueryAlarmDataListResponse queryAlarmDataListWithOptions(QueryAlarmDataListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.alarmQuery))) {
            query.put("alarmQuery", request.alarmQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByKey)) {
            query.put("orderByKey", request.orderByKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAlarmDataList"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryAlarmDataList.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAlarmDataListResponse());
    }

    public QueryAnalysisComponentResponse queryAnalysisComponent(QueryAnalysisComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAnalysisComponentWithOptions(request, headers, runtime);
    }

    public QueryAnalysisComponentResponse queryAnalysisComponentWithOptions(QueryAnalysisComponentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyseType)) {
            body.put("analyseType", request.analyseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.searchCondition))) {
            body.put("searchCondition", request.searchCondition);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAnalysisComponent"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryAnalysisComponent.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAnalysisComponentResponse());
    }

    public QueryFilterListResponse queryFilterList(QueryFilterListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFilterListWithOptions(request, headers, runtime);
    }

    public QueryFilterListResponse queryFilterListWithOptions(QueryFilterListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterId)) {
            query.put("filterId", request.filterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNow)) {
            query.put("pageNow", request.pageNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFilterList"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryFilterList.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFilterListResponse());
    }

    public QueryProjectListResponse queryProjectList(QueryProjectListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProjectListWithOptions(request, headers, runtime);
    }

    public QueryProjectListResponse queryProjectListWithOptions(QueryProjectListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNow)) {
            query.put("pageNow", request.pageNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectGroupId)) {
            query.put("projectGroupId", request.projectGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProjectList"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryProjectList.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProjectListResponse());
    }

    public QueryReportNotifiesResponse queryReportNotifies(QueryReportNotifiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryReportNotifiesWithOptions(request, headers, runtime);
    }

    public QueryReportNotifiesResponse queryReportNotifiesWithOptions(QueryReportNotifiesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpId)) {
            query.put("cpId", request.cpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTimestamp)) {
            query.put("createEndTimestamp", request.createEndTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTimestamp)) {
            query.put("createStartTimestamp", request.createStartTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNow)) {
            query.put("pageNow", request.pageNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReportNotifies"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryReportNotifies.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReportNotifiesResponse());
    }

    public QueryTagNodesResponse queryTagNodes(QueryTagNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTagNodesWithOptions(request, headers, runtime);
    }

    public QueryTagNodesResponse queryTagNodesWithOptions(QueryTagNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTagNodes"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryTagNodes.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTagNodesResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(request, headers, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isInfo)) {
            body.put("isInfo", request.isInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.project))) {
            body.put("project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateUserId)) {
            body.put("updateUserId", request.updateUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateUserName)) {
            body.put("updateUserName", request.updateUserName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/updateProject.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    public UpdatePropagationResponse updatePropagation(UpdatePropagationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePropagationWithOptions(request, headers, runtime);
    }

    public UpdatePropagationResponse updatePropagationWithOptions(UpdatePropagationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.weiboUrls)) {
            body.put("weiboUrls", request.weiboUrls);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePropagation"),
            new TeaPair("version", "2021-01-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/updatePropagation.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePropagationResponse());
    }
}
