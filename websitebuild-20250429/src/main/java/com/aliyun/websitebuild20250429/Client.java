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
     * <p>绑定应用域名</p>
     * 
     * @param request BindAppDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAppDomainResponse
     */
    public BindAppDomainResponse bindAppDomainWithOptions(BindAppDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAppDomain"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAppDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定应用域名</p>
     * 
     * @param request BindAppDomainRequest
     * @return BindAppDomainResponse
     */
    public BindAppDomainResponse bindAppDomain(BindAppDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAppDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建建站实例</p>
     * 
     * @param request CreateAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstanceWithOptions(CreateAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployArea)) {
            query.put("DeployArea", request.deployArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建建站实例</p>
     * 
     * @param request CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>免登ticket</p>
     * 
     * @param request CreateAppInstanceTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceTicketResponse
     */
    public CreateAppInstanceTicketResponse createAppInstanceTicketWithOptions(CreateAppInstanceTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstanceTicket"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>免登ticket</p>
     * 
     * @param request CreateAppInstanceTicketRequest
     * @return CreateAppInstanceTicketResponse
     */
    public CreateAppInstanceTicketResponse createAppInstanceTicket(CreateAppInstanceTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceTicketWithOptions(request, runtime);
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
     * <p>删除域名的SSL证书</p>
     * 
     * @param request DeleteAppDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppDomainCertificateResponse
     */
    public DeleteAppDomainCertificateResponse deleteAppDomainCertificateWithOptions(DeleteAppDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppDomainCertificate"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名的SSL证书</p>
     * 
     * @param request DeleteAppDomainCertificateRequest
     * @return DeleteAppDomainCertificateResponse
     */
    public DeleteAppDomainCertificateResponse deleteAppDomainCertificate(DeleteAppDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名的跳转规则</p>
     * 
     * @param request DeleteAppDomainRedirectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppDomainRedirectResponse
     */
    public DeleteAppDomainRedirectResponse deleteAppDomainRedirectWithOptions(DeleteAppDomainRedirectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppDomainRedirect"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppDomainRedirectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名的跳转规则</p>
     * 
     * @param request DeleteAppDomainRedirectRequest
     * @return DeleteAppDomainRedirectResponse
     */
    public DeleteAppDomainRedirectResponse deleteAppDomainRedirect(DeleteAppDomainRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppDomainRedirectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的DNS解析记录</p>
     * 
     * @param request DescribeAppDomainDnsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppDomainDnsRecordResponse
     */
    public DescribeAppDomainDnsRecordResponse describeAppDomainDnsRecordWithOptions(DescribeAppDomainDnsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppDomainDnsRecord"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppDomainDnsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的DNS解析记录</p>
     * 
     * @param request DescribeAppDomainDnsRecordRequest
     * @return DescribeAppDomainDnsRecordResponse
     */
    public DescribeAppDomainDnsRecordResponse describeAppDomainDnsRecord(DescribeAppDomainDnsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppDomainDnsRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DispatchConsoleAPIForPartner</p>
     * 
     * @param request DispatchConsoleAPIForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DispatchConsoleAPIForPartnerResponse
     */
    public DispatchConsoleAPIForPartnerResponse dispatchConsoleAPIForPartnerWithOptions(DispatchConsoleAPIForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveToken)) {
            query.put("LiveToken", request.liveToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteHost)) {
            query.put("SiteHost", request.siteHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DispatchConsoleAPIForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DispatchConsoleAPIForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DispatchConsoleAPIForPartner</p>
     * 
     * @param request DispatchConsoleAPIForPartnerRequest
     * @return DispatchConsoleAPIForPartnerResponse
     */
    public DispatchConsoleAPIForPartnerResponse dispatchConsoleAPIForPartner(DispatchConsoleAPIForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dispatchConsoleAPIForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用实例详情</p>
     * 
     * @param request GetAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceResponse
     */
    public GetAppInstanceResponse getAppInstanceWithOptions(GetAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用实例详情</p>
     * 
     * @param request GetAppInstanceRequest
     * @return GetAppInstanceResponse
     */
    public GetAppInstanceResponse getAppInstance(GetAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceWithOptions(request, runtime);
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
     * <p>提供给服务商的域名查询接口</p>
     * 
     * @param request GetDomainInfoForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainInfoForPartnerResponse
     */
    public GetDomainInfoForPartnerResponse getDomainInfoForPartnerWithOptions(GetDomainInfoForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainInfoForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainInfoForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提供给服务商的域名查询接口</p>
     * 
     * @param request GetDomainInfoForPartnerRequest
     * @return GetDomainInfoForPartnerResponse
     */
    public GetDomainInfoForPartnerResponse getDomainInfoForPartner(GetDomainInfoForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainInfoForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名备案信息</p>
     * 
     * @param request GetIcpFilingInfoForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIcpFilingInfoForPartnerResponse
     */
    public GetIcpFilingInfoForPartnerResponse getIcpFilingInfoForPartnerWithOptions(GetIcpFilingInfoForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIcpFilingInfoForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIcpFilingInfoForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名备案信息</p>
     * 
     * @param request GetIcpFilingInfoForPartnerRequest
     * @return GetIcpFilingInfoForPartnerResponse
     */
    public GetIcpFilingInfoForPartnerResponse getIcpFilingInfoForPartner(GetIcpFilingInfoForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIcpFilingInfoForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过授权码得到accessToken</p>
     * 
     * @param request GetUserAccessTokenForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAccessTokenForPartnerResponse
     */
    public GetUserAccessTokenForPartnerResponse getUserAccessTokenForPartnerWithOptions(GetUserAccessTokenForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteHost)) {
            query.put("SiteHost", request.siteHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserAccessTokenForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAccessTokenForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过授权码得到accessToken</p>
     * 
     * @param request GetUserAccessTokenForPartnerRequest
     * @return GetUserAccessTokenForPartnerResponse
     */
    public GetUserAccessTokenForPartnerResponse getUserAccessTokenForPartner(GetUserAccessTokenForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAccessTokenForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户SLR角色授权临时凭证</p>
     * 
     * @param request GetUserTmpIdentityForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserTmpIdentityForPartnerResponse
     */
    public GetUserTmpIdentityForPartnerResponse getUserTmpIdentityForPartnerWithOptions(GetUserTmpIdentityForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authPurpose)) {
            query.put("AuthPurpose", request.authPurpose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLinkedRole)) {
            query.put("ServiceLinkedRole", request.serviceLinkedRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserTmpIdentityForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTmpIdentityForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户SLR角色授权临时凭证</p>
     * 
     * @param request GetUserTmpIdentityForPartnerRequest
     * @return GetUserTmpIdentityForPartnerResponse
     */
    public GetUserTmpIdentityForPartnerResponse getUserTmpIdentityForPartner(GetUserTmpIdentityForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTmpIdentityForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的跳转规则列表</p>
     * 
     * @param request ListAppDomainRedirectRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppDomainRedirectRecordsResponse
     */
    public ListAppDomainRedirectRecordsResponse listAppDomainRedirectRecordsWithOptions(ListAppDomainRedirectRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppDomainRedirectRecords"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppDomainRedirectRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名的跳转规则列表</p>
     * 
     * @param request ListAppDomainRedirectRecordsRequest
     * @return ListAppDomainRedirectRecordsResponse
     */
    public ListAppDomainRedirectRecordsResponse listAppDomainRedirectRecords(ListAppDomainRedirectRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppDomainRedirectRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用实例下的所有域名列表</p>
     * 
     * @param request ListAppInstanceDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstanceDomainsResponse
     */
    public ListAppInstanceDomainsResponse listAppInstanceDomainsWithOptions(ListAppInstanceDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstanceDomains"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用实例下的所有域名列表</p>
     * 
     * @param request ListAppInstanceDomainsRequest
     * @return ListAppInstanceDomainsResponse
     */
    public ListAppInstanceDomainsResponse listAppInstanceDomains(ListAppInstanceDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例列表查询</p>
     * 
     * @param tmpReq ListAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstancesWithOptions(ListAppInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppInstancesShrinkRequest request = new ListAppInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeBegin)) {
            query.put("EndTimeBegin", request.endTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeEnd)) {
            query.put("EndTimeEnd", request.endTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstances"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例列表查询</p>
     * 
     * @param request ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstances(ListAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例变配</p>
     * 
     * @param request ModifyAppInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceSpecResponse
     */
    public ModifyAppInstanceSpecResponse modifyAppInstanceSpecWithOptions(ModifyAppInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployArea)) {
            query.put("DeployArea", request.deployArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstanceSpec"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例变配</p>
     * 
     * @param request ModifyAppInstanceSpecRequest
     * @return ModifyAppInstanceSpecResponse
     */
    public ModifyAppInstanceSpecResponse modifyAppInstanceSpec(ModifyAppInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceSpecWithOptions(request, runtime);
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
     * <p>刷新ticket</p>
     * 
     * @param request RefreshAppInstanceTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAppInstanceTicketResponse
     */
    public RefreshAppInstanceTicketResponse refreshAppInstanceTicketWithOptions(RefreshAppInstanceTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAppInstanceTicket"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAppInstanceTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新ticket</p>
     * 
     * @param request RefreshAppInstanceTicketRequest
     * @return RefreshAppInstanceTicketResponse
     */
    public RefreshAppInstanceTicketResponse refreshAppInstanceTicket(RefreshAppInstanceTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAppInstanceTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例续费</p>
     * 
     * @param request RenewAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppInstanceResponse
     */
    public RenewAppInstanceResponse renewAppInstanceWithOptions(RenewAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例续费</p>
     * 
     * @param request RenewAppInstanceRequest
     * @return RenewAppInstanceResponse
     */
    public RenewAppInstanceResponse renewAppInstance(RenewAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAppInstanceWithOptions(request, runtime);
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
     * <p>设置域名的SSL证书</p>
     * 
     * @param request SetAppDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAppDomainCertificateResponse
     */
    public SetAppDomainCertificateResponse setAppDomainCertificateWithOptions(SetAppDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateName)) {
            query.put("CertificateName", request.certificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateType)) {
            query.put("CertificateType", request.certificateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAppDomainCertificate"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置域名的SSL证书</p>
     * 
     * @param request SetAppDomainCertificateRequest
     * @return SetAppDomainCertificateResponse
     */
    public SetAppDomainCertificateResponse setAppDomainCertificate(SetAppDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAppDomainCertificateWithOptions(request, runtime);
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

    /**
     * <b>summary</b> : 
     * <p>解绑应用域名</p>
     * 
     * @param request UnbindAppDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAppDomainResponse
     */
    public UnbindAppDomainResponse unbindAppDomainWithOptions(UnbindAppDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAppDomain"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAppDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑应用域名</p>
     * 
     * @param request UnbindAppDomainRequest
     * @return UnbindAppDomainResponse
     */
    public UnbindAppDomainResponse unbindAppDomain(UnbindAppDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAppDomainWithOptions(request, runtime);
    }
}
