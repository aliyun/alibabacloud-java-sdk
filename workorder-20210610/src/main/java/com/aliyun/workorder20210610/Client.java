// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610;

import com.aliyun.tea.*;
import com.aliyun.workorder20210610.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "workorder.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "workorder.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("workorder", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Closes a ticket.</p>
     * 
     * @param request CloseTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseTicketResponse
     */
    public CloseTicketResponse closeTicketWithOptions(CloseTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Closes a ticket.</p>
     * 
     * @param request CloseTicketRequest
     * @return CloseTicketResponse
     */
    public CloseTicketResponse closeTicket(CloseTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a ticket.</p>
     * 
     * @param tmpReq CreateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTicketShrinkRequest request = new CreateTicketShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileNameList)) {
            request.fileNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileNameList, "FileNameList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.secretInfo)) {
            request.secretInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.secretInfo, "SecretInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretInfoShrink)) {
            query.put("SecretInfo", request.secretInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameListShrink)) {
            body.put("FileNameList", request.fileNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            body.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a ticket.</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates a ticket.</p>
     * 
     * @param request EvaluateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvaluateTicketResponse
     */
    public EvaluateTicketResponse evaluateTicketWithOptions(EvaluateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.score)) {
            body.put("Score", request.score);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solved)) {
            body.put("Solved", request.solved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EvaluateTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvaluateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates a ticket.</p>
     * 
     * @param request EvaluateTicketRequest
     * @return EvaluateTicketResponse
     */
    public EvaluateTicketResponse evaluateTicket(EvaluateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluateTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Object Storage Service (OSS) URL that is used to upload attachments.</p>
     * 
     * @param request GetAttachmentUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAttachmentUploadUrlResponse
     */
    public GetAttachmentUploadUrlResponse getAttachmentUploadUrlWithOptions(GetAttachmentUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAttachmentUploadUrl"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAttachmentUploadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Object Storage Service (OSS) URL that is used to upload attachments.</p>
     * 
     * @param request GetAttachmentUploadUrlRequest
     * @return GetAttachmentUploadUrlResponse
     */
    public GetAttachmentUploadUrlResponse getAttachmentUploadUrl(GetAttachmentUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAttachmentUploadUrlWithOptions(request, runtime);
    }

    /**
     * @param request GetMqConsumerTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMqConsumerTagResponse
     */
    public GetMqConsumerTagResponse getMqConsumerTagWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMqConsumerTag"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMqConsumerTagResponse());
    }

    /**
     * @return GetMqConsumerTagResponse
     */
    public GetMqConsumerTagResponse getMqConsumerTag() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMqConsumerTagWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query tickets.</p>
     * 
     * @param request GetTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTicketResponse
     */
    public GetTicketResponse getTicketWithOptions(GetTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query tickets.</p>
     * 
     * @param request GetTicketRequest
     * @return GetTicketResponse
     */
    public GetTicketResponse getTicket(GetTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list data of ticket problem categories.</p>
     * 
     * @param request ListCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategories"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list data of ticket problem categories.</p>
     * 
     * @param request ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the data of the Alibaba Cloud product list.</p>
     * 
     * @param request ListProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the data of the Alibaba Cloud product list.</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ticket communication records.</p>
     * 
     * @param request ListTicketNotesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketNotesResponse
     */
    public ListTicketNotesResponse listTicketNotesWithOptions(ListTicketNotesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTicketNotes"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketNotesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ticket communication records.</p>
     * 
     * @param request ListTicketNotesRequest
     * @return ListTicketNotesResponse
     */
    public ListTicketNotesResponse listTicketNotes(ListTicketNotesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTicketNotesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of my tickets.</p>
     * 
     * @param tmpReq ListTicketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTicketsWithOptions(ListTicketsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTicketsShrinkRequest request = new ListTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ticketIdList)) {
            request.ticketIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ticketIdList, "TicketIdList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketIdListShrink)) {
            body.put("TicketIdList", request.ticketIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTickets"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTicketsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of my tickets.</p>
     * 
     * @param request ListTicketsRequest
     * @return ListTicketsResponse
     */
    public ListTicketsResponse listTickets(ListTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTicketsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reopens a ticket</p>
     * 
     * @param request ReopenTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReopenTicketResponse
     */
    public ReopenTicketResponse reopenTicketWithOptions(ReopenTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReopenTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReopenTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reopens a ticket</p>
     * 
     * @param request ReopenTicketRequest
     * @return ReopenTicketResponse
     */
    public ReopenTicketResponse reopenTicket(ReopenTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reopenTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reply to the ticket. You can call the ListTicketNotes operation to obtain the content of the reply.</p>
     * 
     * @param tmpReq ReplyTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplyTicketResponse
     */
    public ReplyTicketResponse replyTicketWithOptions(ReplyTicketRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplyTicketShrinkRequest request = new ReplyTicketShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileNameList)) {
            request.fileNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileNameList, "FileNameList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileNameListShrink)) {
            query.put("FileNameList", request.fileNameListShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypt)) {
            body.put("Encrypt", request.encrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            body.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplyTicket"),
            new TeaPair("version", "2021-06-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplyTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reply to the ticket. You can call the ListTicketNotes operation to obtain the content of the reply.</p>
     * 
     * @param request ReplyTicketRequest
     * @return ReplyTicketResponse
     */
    public ReplyTicketResponse replyTicket(ReplyTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replyTicketWithOptions(request, runtime);
    }
}
