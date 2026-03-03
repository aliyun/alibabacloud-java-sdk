// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115;

import com.aliyun.tea.*;
import com.aliyun.neuron20211115.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "neuron.aliyuncs.com"),
            new TeaPair("ap-south-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-chengdu", "neuron.aliyuncs.com"),
            new TeaPair("cn-edge-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-fujian", "neuron.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-wuhan", "neuron.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "neuron.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-central-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "neuron.aliyuncs.com"),
            new TeaPair("me-east-1", "neuron.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "neuron.aliyuncs.com"),
            new TeaPair("us-east-1", "neuron.aliyuncs.com"),
            new TeaPair("us-west-1", "neuron.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("neuron", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>微服务分组加入或退出泳道</p>
     * 
     * @param request AddOrQuitPdpLaneForServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrQuitPdpLaneForServiceGroupResponse
     */
    public AddOrQuitPdpLaneForServiceGroupResponse addOrQuitPdpLaneForServiceGroupWithOptions(AddOrQuitPdpLaneForServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrQuitPdpLaneForServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/commands/add-quit-lane"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrQuitPdpLaneForServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>微服务分组加入或退出泳道</p>
     * 
     * @param request AddOrQuitPdpLaneForServiceGroupRequest
     * @return AddOrQuitPdpLaneForServiceGroupResponse
     */
    public AddOrQuitPdpLaneForServiceGroupResponse addOrQuitPdpLaneForServiceGroup(AddOrQuitPdpLaneForServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addOrQuitPdpLaneForServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核记录</p>
     * 
     * @param request AuditForkReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditForkReviewResponse
     */
    public AuditForkReviewResponse auditForkReviewWithOptions(String reviewId, AuditForkReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/audit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditForkReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核记录</p>
     * 
     * @param request AuditForkReviewRequest
     * @return AuditForkReviewResponse
     */
    public AuditForkReviewResponse auditForkReview(String reviewId, AuditForkReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditForkReviewWithOptions(reviewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核记录</p>
     * 
     * @param request AuditPbcInvokeReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditPbcInvokeReviewResponse
     */
    public AuditPbcInvokeReviewResponse auditPbcInvokeReviewWithOptions(String reviewId, AuditPbcInvokeReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approve)) {
            body.put("approve", request.approve);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditPbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/audit"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditPbcInvokeReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核记录</p>
     * 
     * @param request AuditPbcInvokeReviewRequest
     * @return AuditPbcInvokeReviewResponse
     */
    public AuditPbcInvokeReviewResponse auditPbcInvokeReview(String reviewId, AuditPbcInvokeReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditPbcInvokeReviewWithOptions(reviewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>公司授权产品</p>
     * 
     * @param request AuthorizeProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeProductsResponse
     */
    public AuthorizeProductsResponse authorizeProductsWithOptions(AuthorizeProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeProducts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products/commands/authorize"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>公司授权产品</p>
     * 
     * @param request AuthorizeProductsRequest
     * @return AuthorizeProductsResponse
     */
    public AuthorizeProductsResponse authorizeProducts(AuthorizeProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量给开发者授权</p>
     * 
     * @param request BatchGrantRolesToDeveloperRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGrantRolesToDeveloperResponse
     */
    public BatchGrantRolesToDeveloperResponse batchGrantRolesToDeveloperWithOptions(BatchGrantRolesToDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGrantRolesToDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/batch-grant-roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGrantRolesToDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量给开发者授权</p>
     * 
     * @param request BatchGrantRolesToDeveloperRequest
     * @return BatchGrantRolesToDeveloperResponse
     */
    public BatchGrantRolesToDeveloperResponse batchGrantRolesToDeveloper(BatchGrantRolesToDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGrantRolesToDeveloperWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验用户角色</p>
     * 
     * @param request CheckDeveloperRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDeveloperRoleResponse
     */
    public CheckDeveloperRoleResponse checkDeveloperRoleWithOptions(CheckDeveloperRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDeveloperRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/check-role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDeveloperRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验用户角色</p>
     * 
     * @param request CheckDeveloperRoleRequest
     * @return CheckDeveloperRoleResponse
     */
    public CheckDeveloperRoleResponse checkDeveloperRole(CheckDeveloperRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDeveloperRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>完成二方包注册</p>
     * 
     * @param request CompleteRegisterLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteRegisterLibraryResponse
     */
    public CompleteRegisterLibraryResponse completeRegisterLibraryWithOptions(String id, CompleteRegisterLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dependIntegral)) {
            body.put("dependIntegral", request.dependIntegral);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            body.put("marketId", request.marketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteRegisterLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/complete-register"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteRegisterLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>完成二方包注册</p>
     * 
     * @param request CompleteRegisterLibraryRequest
     * @return CompleteRegisterLibraryResponse
     */
    public CompleteRegisterLibraryResponse completeRegisterLibrary(String id, CompleteRegisterLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeRegisterLibraryWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>完成pbc版本注册</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteRegistrationPbcVersionResponse
     */
    public CompleteRegistrationPbcVersionResponse completeRegistrationPbcVersionWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteRegistrationPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/complete-register"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteRegistrationPbcVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>完成pbc版本注册</p>
     * @return CompleteRegistrationPbcVersionResponse
     */
    public CompleteRegistrationPbcVersionResponse completeRegistrationPbcVersion(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeRegistrationPbcVersionWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务信息</p>
     * 
     * @param request ContinueDeploymentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinueDeploymentResponse
     */
    public ContinueDeploymentResponse continueDeploymentWithOptions(ContinueDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/commands/continue"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueDeploymentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务信息</p>
     * 
     * @param request ContinueDeploymentRequest
     * @return ContinueDeploymentResponse
     */
    public ContinueDeploymentResponse continueDeployment(ContinueDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.continueDeploymentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关注资产</p>
     * 
     * @param request CreateAssetWatchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAssetWatchResponse
     */
    public CreateAssetWatchResponse createAssetWatchWithOptions(CreateAssetWatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAssetWatch"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watchs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAssetWatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关注资产</p>
     * 
     * @param request CreateAssetWatchRequest
     * @return CreateAssetWatchResponse
     */
    public CreateAssetWatchResponse createAssetWatch(CreateAssetWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAssetWatchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增组件</p>
     * 
     * @param request CreateComponentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponentWithOptions(CreateComponentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComponent"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增组件</p>
     * 
     * @param request CreateComponentRequest
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComponentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增组件模板</p>
     * 
     * @param request CreateComponentTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComponentTemplateResponse
     */
    public CreateComponentTemplateResponse createComponentTemplateWithOptions(CreateComponentTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComponentTemplate"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/component-templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComponentTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增组件模板</p>
     * 
     * @param request CreateComponentTemplateRequest
     * @return CreateComponentTemplateResponse
     */
    public CreateComponentTemplateResponse createComponentTemplate(CreateComponentTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComponentTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册开发者</p>
     * 
     * @param request CreateDeveloperRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeveloperResponse
     */
    public CreateDeveloperResponse createDeveloperWithOptions(CreateDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册开发者</p>
     * 
     * @param request CreateDeveloperRequest
     * @return CreateDeveloperResponse
     */
    public CreateDeveloperResponse createDeveloper(CreateDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeveloperWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建公司</p>
     * 
     * @param request CreateEnterpriseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseResponse
     */
    public CreateEnterpriseResponse createEnterpriseWithOptions(CreateEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建公司</p>
     * 
     * @param request CreateEnterpriseRequest
     * @return CreateEnterpriseResponse
     */
    public CreateEnterpriseResponse createEnterprise(CreateEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnterpriseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请代码Fork(创建代码Fork的审批流程)</p>
     * 
     * @param request CreateForkReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateForkReviewResponse
     */
    public CreateForkReviewResponse createForkReviewWithOptions(CreateForkReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForkReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请代码Fork(创建代码Fork的审批流程)</p>
     * 
     * @param request CreateForkReviewRequest
     * @return CreateForkReviewResponse
     */
    public CreateForkReviewResponse createForkReview(CreateForkReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createForkReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务灰度分组</p>
     * 
     * @param request CreateGreyPdpServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGreyPdpServiceGroupResponse
     */
    public CreateGreyPdpServiceGroupResponse createGreyPdpServiceGroupWithOptions(CreateGreyPdpServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGreyPdpServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups/grey"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGreyPdpServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务灰度分组</p>
     * 
     * @param request CreateGreyPdpServiceGroupRequest
     * @return CreateGreyPdpServiceGroupResponse
     */
    public CreateGreyPdpServiceGroupResponse createGreyPdpServiceGroup(CreateGreyPdpServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGreyPdpServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包</p>
     * 
     * @param request CreateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibraryWithOptions(CreateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包</p>
     * 
     * @param request CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    public CreateLibraryResponse createLibrary(CreateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包使用说明文档</p>
     * 
     * @param request CreateLibraryInstructionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibraryInstructionResponse
     */
    public CreateLibraryInstructionResponse createLibraryInstructionWithOptions(String libraryId, CreateLibraryInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            body.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libraryId)) {
            body.put("libraryId", request.libraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            body.put("marketId", request.marketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/instructions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包使用说明文档</p>
     * 
     * @param request CreateLibraryInstructionRequest
     * @return CreateLibraryInstructionResponse
     */
    public CreateLibraryInstructionResponse createLibraryInstruction(String libraryId, CreateLibraryInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryInstructionWithOptions(libraryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request CreateLibraryReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibraryReviewResponse
     */
    public CreateLibraryReviewResponse createLibraryReviewWithOptions(CreateLibraryReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibraryReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request CreateLibraryReviewRequest
     * @return CreateLibraryReviewResponse
     */
    public CreateLibraryReviewResponse createLibraryReview(CreateLibraryReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibraryReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包规格</p>
     * 
     * @param request CreateLibrarySchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLibrarySchemaResponse
     */
    public CreateLibrarySchemaResponse createLibrarySchemaWithOptions(CreateLibrarySchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLibrarySchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建二方包规格</p>
     * 
     * @param request CreateLibrarySchemaRequest
     * @return CreateLibrarySchemaResponse
     */
    public CreateLibrarySchemaResponse createLibrarySchema(CreateLibrarySchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLibrarySchemaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用报警任务</p>
     * 
     * @param request CreateMonitorArmsAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorArmsAlertResponse
     */
    public CreateMonitorArmsAlertResponse createMonitorArmsAlertWithOptions(CreateMonitorArmsAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorArmsAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorArmsAlert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorArmsAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用报警任务</p>
     * 
     * @param request CreateMonitorArmsAlertRequest
     * @return CreateMonitorArmsAlertResponse
     */
    public CreateMonitorArmsAlertResponse createMonitorArmsAlert(CreateMonitorArmsAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorArmsAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增应用报警任务</p>
     * 
     * @param request CreateMonitorArmsAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorArmsAlertsResponse
     */
    public CreateMonitorArmsAlertsResponse createMonitorArmsAlertsWithOptions(CreateMonitorArmsAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorArmsAlerts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorArmsAlerts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorArmsAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增应用报警任务</p>
     * 
     * @param request CreateMonitorArmsAlertsRequest
     * @return CreateMonitorArmsAlertsResponse
     */
    public CreateMonitorArmsAlertsResponse createMonitorArmsAlerts(CreateMonitorArmsAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorArmsAlertsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建联系人</p>
     * 
     * @param request CreateMonitorContactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorContactResponse
     */
    public CreateMonitorContactResponse createMonitorContactWithOptions(CreateMonitorContactRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorContact"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建联系人</p>
     * 
     * @param request CreateMonitorContactRequest
     * @return CreateMonitorContactResponse
     */
    public CreateMonitorContactResponse createMonitorContact(CreateMonitorContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorContactWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建联系人组</p>
     * 
     * @param request CreateMonitorContactGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorContactGroupResponse
     */
    public CreateMonitorContactGroupResponse createMonitorContactGroupWithOptions(CreateMonitorContactGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorContactGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建联系人组</p>
     * 
     * @param request CreateMonitorContactGroupRequest
     * @return CreateMonitorContactGroupResponse
     */
    public CreateMonitorContactGroupResponse createMonitorContactGroup(CreateMonitorContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorContactGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>加入联系人</p>
     * 
     * @param request CreateMonitorGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupMemberResponse
     */
    public CreateMonitorGroupMemberResponse createMonitorGroupMemberWithOptions(String groupId, CreateMonitorGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroupMember"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/commands/create-member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>加入联系人</p>
     * 
     * @param request CreateMonitorGroupMemberRequest
     * @return CreateMonitorGroupMemberResponse
     */
    public CreateMonitorGroupMemberResponse createMonitorGroupMember(String groupId, CreateMonitorGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建MQ报警任务</p>
     * 
     * @param request CreateMonitorMqAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorMqAlertResponse
     */
    public CreateMonitorMqAlertResponse createMonitorMqAlertWithOptions(CreateMonitorMqAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorMqAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorMqAlert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorMqAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建MQ报警任务</p>
     * 
     * @param request CreateMonitorMqAlertRequest
     * @return CreateMonitorMqAlertResponse
     */
    public CreateMonitorMqAlertResponse createMonitorMqAlert(CreateMonitorMqAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorMqAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增MQ报警任务</p>
     * 
     * @param request CreateMonitorMqAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorMqAlertsResponse
     */
    public CreateMonitorMqAlertsResponse createMonitorMqAlertsWithOptions(CreateMonitorMqAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorMqAlerts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorMqAlerts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorMqAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增MQ报警任务</p>
     * 
     * @param request CreateMonitorMqAlertsRequest
     * @return CreateMonitorMqAlertsResponse
     */
    public CreateMonitorMqAlertsResponse createMonitorMqAlerts(CreateMonitorMqAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorMqAlertsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建日志报警任务</p>
     * 
     * @param request CreateMonitorSlsAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorSlsAlertResponse
     */
    public CreateMonitorSlsAlertResponse createMonitorSlsAlertWithOptions(CreateMonitorSlsAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorSlsAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorSlsAlert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorSlsAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建日志报警任务</p>
     * 
     * @param request CreateMonitorSlsAlertRequest
     * @return CreateMonitorSlsAlertResponse
     */
    public CreateMonitorSlsAlertResponse createMonitorSlsAlert(CreateMonitorSlsAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorSlsAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增建报警任务</p>
     * 
     * @param request CreateMonitorSlsAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorSlsAlertsResponse
     */
    public CreateMonitorSlsAlertsResponse createMonitorSlsAlertsWithOptions(CreateMonitorSlsAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorSlsAlerts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/createMonitorSlsAlerts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorSlsAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增建报警任务</p>
     * 
     * @param request CreateMonitorSlsAlertsRequest
     * @return CreateMonitorSlsAlertsResponse
     */
    public CreateMonitorSlsAlertsResponse createMonitorSlsAlerts(CreateMonitorSlsAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorSlsAlertsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建webhook</p>
     * 
     * @param request CreateMonitorWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorWebhookResponse
     */
    public CreateMonitorWebhookResponse createMonitorWebhookWithOptions(CreateMonitorWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorWebhook"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/webhook"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建webhook</p>
     * 
     * @param request CreateMonitorWebhookRequest
     * @return CreateMonitorWebhookResponse
     */
    public CreateMonitorWebhookResponse createMonitorWebhook(CreateMonitorWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMonitorWebhookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Group</p>
     * 
     * @param request CreateMqGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMqGroupResponse
     */
    public CreateMqGroupResponse createMqGroupWithOptions(CreateMqGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMqGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMqGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Group</p>
     * 
     * @param request CreateMqGroupRequest
     * @return CreateMqGroupResponse
     */
    public CreateMqGroupResponse createMqGroup(CreateMqGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMqGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Topic</p>
     * 
     * @param request CreateMqTopicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMqTopicResponse
     */
    public CreateMqTopicResponse createMqTopicWithOptions(CreateMqTopicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMqTopic"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMqTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Topic</p>
     * 
     * @param request CreateMqTopicRequest
     * @return CreateMqTopicResponse
     */
    public CreateMqTopicResponse createMqTopic(CreateMqTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMqTopicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC</p>
     * 
     * @param request CreatePbcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcResponse
     */
    public CreatePbcResponse createPbcWithOptions(CreatePbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC</p>
     * 
     * @param request CreatePbcRequest
     * @return CreatePbcResponse
     */
    public CreatePbcResponse createPbc(CreatePbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC的Api规格</p>
     * 
     * @param request CreatePbcApiSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcApiSchemaResponse
     */
    public CreatePbcApiSchemaResponse createPbcApiSchemaWithOptions(CreatePbcApiSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/api-schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcApiSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC的Api规格</p>
     * 
     * @param request CreatePbcApiSchemaRequest
     * @return CreatePbcApiSchemaResponse
     */
    public CreatePbcApiSchemaResponse createPbcApiSchema(CreatePbcApiSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcApiSchemaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC使用说明文档</p>
     * 
     * @param request CreatePbcInstructionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcInstructionResponse
     */
    public CreatePbcInstructionResponse createPbcInstructionWithOptions(CreatePbcInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/instructions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC使用说明文档</p>
     * 
     * @param request CreatePbcInstructionRequest
     * @return CreatePbcInstructionResponse
     */
    public CreatePbcInstructionResponse createPbcInstruction(CreatePbcInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInstructionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务调用记录</p>
     * 
     * @param request CreatePbcInvokeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcInvokeResponse
     */
    public CreatePbcInvokeResponse createPbcInvokeWithOptions(CreatePbcInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInvoke"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invokes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务调用记录</p>
     * 
     * @param request CreatePbcInvokeRequest
     * @return CreatePbcInvokeResponse
     */
    public CreatePbcInvokeResponse createPbcInvoke(CreatePbcInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInvokeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC服务调用审核</p>
     * 
     * @param request CreatePbcInvokeReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcInvokeReviewResponse
     */
    public CreatePbcInvokeReviewResponse createPbcInvokeReviewWithOptions(CreatePbcInvokeReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcInvokeReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC服务调用审核</p>
     * 
     * @param request CreatePbcInvokeReviewRequest
     * @return CreatePbcInvokeReviewResponse
     */
    public CreatePbcInvokeReviewResponse createPbcInvokeReview(CreatePbcInvokeReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcInvokeReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request CreatePbcReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcReviewResponse
     */
    public CreatePbcReviewResponse createPbcReviewWithOptions(CreatePbcReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request CreatePbcReviewRequest
     * @return CreatePbcReviewResponse
     */
    public CreatePbcReviewResponse createPbcReview(CreatePbcReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC规格</p>
     * 
     * @param request CreatePbcSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcSchemaResponse
     */
    public CreatePbcSchemaResponse createPbcSchemaWithOptions(CreatePbcSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC规格</p>
     * 
     * @param request CreatePbcSchemaRequest
     * @return CreatePbcSchemaResponse
     */
    public CreatePbcSchemaResponse createPbcSchema(CreatePbcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcSchemaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC版本</p>
     * 
     * @param request CreatePbcVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePbcVersionResponse
     */
    public CreatePbcVersionResponse createPbcVersionWithOptions(CreatePbcVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePbcVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PBC版本</p>
     * 
     * @param request CreatePbcVersionRequest
     * @return CreatePbcVersionResponse
     */
    public CreatePbcVersionResponse createPbcVersion(CreatePbcVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPbcVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建配置</p>
     * 
     * @param request CreatePdpConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdpConfigResponse
     */
    public CreatePdpConfigResponse createPdpConfigWithOptions(CreatePdpConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建配置</p>
     * 
     * @param request CreatePdpConfigRequest
     * @return CreatePdpConfigResponse
     */
    public CreatePdpConfigResponse createPdpConfig(CreatePdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建泳道</p>
     * 
     * @param request CreatePdpLaneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdpLaneResponse
     */
    public CreatePdpLaneResponse createPdpLaneWithOptions(CreatePdpLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpLane"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建泳道</p>
     * 
     * @param request CreatePdpLaneRequest
     * @return CreatePdpLaneResponse
     */
    public CreatePdpLaneResponse createPdpLane(CreatePdpLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpLaneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建PdpPbc</p>
     * 
     * @param request CreatePdpPbcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdpPbcResponse
     */
    public CreatePdpPbcResponse createPdpPbcWithOptions(CreatePdpPbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建PdpPbc</p>
     * 
     * @param request CreatePdpPbcRequest
     * @return CreatePdpPbcResponse
     */
    public CreatePdpPbcResponse createPdpPbc(CreatePdpPbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpPbcWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreatePdpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdpServiceResponse
     */
    public CreatePdpServiceResponse createPdpServiceWithOptions(CreatePdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreatePdpServiceRequest
     * @return CreatePdpServiceResponse
     */
    public CreatePdpServiceResponse createPdpService(CreatePdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务分组</p>
     * 
     * @param request CreatePdpServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdpServiceGroupResponse
     */
    public CreatePdpServiceGroupResponse createPdpServiceGroupWithOptions(CreatePdpServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdpServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdpServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务分组</p>
     * 
     * @param request CreatePdpServiceGroupRequest
     * @return CreatePdpServiceGroupResponse
     */
    public CreatePdpServiceGroupResponse createPdpServiceGroup(CreatePdpServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPdpServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给角色添加权限</p>
     * 
     * @param request CreatePrivilegeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivilegeResponse
     */
    public CreatePrivilegeResponse createPrivilegeWithOptions(String roleId, CreatePrivilegeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivilege"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/privileges"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给角色添加权限</p>
     * 
     * @param request CreatePrivilegeRequest
     * @return CreatePrivilegeResponse
     */
    public CreatePrivilegeResponse createPrivilege(String roleId, CreatePrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivilegeWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给角色添加权限</p>
     * 
     * @param request CreatePrivilegePopRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivilegePopResponse
     */
    public CreatePrivilegePopResponse createPrivilegePopWithOptions(String roleId, CreatePrivilegePopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivilegePop"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/privileges/pop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivilegePopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>给角色添加权限</p>
     * 
     * @param request CreatePrivilegePopRequest
     * @return CreatePrivilegePopResponse
     */
    public CreatePrivilegePopResponse createPrivilegePop(String roleId, CreatePrivilegePopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivilegePopWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代码库Fork记录</p>
     * 
     * @param request CreateRepoForkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepoForkResponse
     */
    public CreateRepoForkResponse createRepoForkWithOptions(CreateRepoForkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepoFork"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/repo-forks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepoForkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建代码库Fork记录</p>
     * 
     * @param request CreateRepoForkRequest
     * @return CreateRepoForkResponse
     */
    public CreateRepoForkResponse createRepoFork(CreateRepoForkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepoForkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增资源</p>
     * 
     * @param request CreateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增资源</p>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成角色</p>
     * 
     * @param request CreateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成角色</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建入驻申请</p>
     * 
     * @param request CreateSettledRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSettledResponse
     */
    public CreateSettledResponse createSettledWithOptions(CreateSettledRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSettled"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/settleds"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSettledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建入驻申请</p>
     * 
     * @param request CreateSettledRequest
     * @return CreateSettledResponse
     */
    public CreateSettledResponse createSettled(CreateSettledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSettledWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除组件</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponentWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponent"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除组件</p>
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除组件模板</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentTemplateResponse
     */
    public DeleteComponentTemplateResponse deleteComponentTemplateWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponentTemplate"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/component-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComponentTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除组件模板</p>
     * @return DeleteComponentTemplateResponse
     */
    public DeleteComponentTemplateResponse deleteComponentTemplate(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentTemplateWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除开发者</p>
     * 
     * @param request DeleteDeveloperRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeveloperResponse
     */
    public DeleteDeveloperResponse deleteDeveloperWithOptions(String accountId, DeleteDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除开发者</p>
     * 
     * @param request DeleteDeveloperRequest
     * @return DeleteDeveloperResponse
     */
    public DeleteDeveloperResponse deleteDeveloper(String accountId, DeleteDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeveloperWithOptions(accountId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除公司</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseResponse
     */
    public DeleteEnterpriseResponse deleteEnterpriseWithOptions(String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除公司</p>
     * @return DeleteEnterpriseResponse
     */
    public DeleteEnterpriseResponse deleteEnterprise(String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnterpriseWithOptions(enterpriseId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibraryWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包</p>
     * @return DeleteLibraryResponse
     */
    public DeleteLibraryResponse deleteLibrary(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包使用说明文档</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLibraryInstructionResponse
     */
    public DeleteLibraryInstructionResponse deleteLibraryInstructionWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/instructions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibraryInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包使用说明文档</p>
     * @return DeleteLibraryInstructionResponse
     */
    public DeleteLibraryInstructionResponse deleteLibraryInstruction(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibraryInstructionWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包规格</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLibrarySchemaResponse
     */
    public DeleteLibrarySchemaResponse deleteLibrarySchemaWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/schemas"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLibrarySchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除二方包规格</p>
     * @return DeleteLibrarySchemaResponse
     */
    public DeleteLibrarySchemaResponse deleteLibrarySchema(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLibrarySchemaWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除报警任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorAlertResponse
     */
    public DeleteMonitorAlertResponse deleteMonitorAlertWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除报警任务</p>
     * @return DeleteMonitorAlertResponse
     */
    public DeleteMonitorAlertResponse deleteMonitorAlert(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMonitorAlertWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorContactResponse
     */
    public DeleteMonitorContactResponse deleteMonitorContactWithOptions(String contactId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorContact"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact/" + com.aliyun.openapiutil.Client.getEncodeParam(contactId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人</p>
     * @return DeleteMonitorContactResponse
     */
    public DeleteMonitorContactResponse deleteMonitorContact(String contactId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMonitorContactWithOptions(contactId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorContactGroupResponse
     */
    public DeleteMonitorContactGroupResponse deleteMonitorContactGroupWithOptions(String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorContactGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人组</p>
     * @return DeleteMonitorContactGroupResponse
     */
    public DeleteMonitorContactGroupResponse deleteMonitorContactGroup(String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMonitorContactGroupWithOptions(groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从联系人组中删除联系人</p>
     * 
     * @param request DeleteMonitorGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupMemberResponse
     */
    public DeleteMonitorGroupMemberResponse deleteMonitorGroupMemberWithOptions(String groupId, DeleteMonitorGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIds)) {
            query.put("contactIds", request.contactIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroupMember"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/commands/delete-member"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从联系人组中删除联系人</p>
     * 
     * @param request DeleteMonitorGroupMemberRequest
     * @return DeleteMonitorGroupMemberResponse
     */
    public DeleteMonitorGroupMemberResponse deleteMonitorGroupMember(String groupId, DeleteMonitorGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMonitorGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除webhook</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorWebhookResponse
     */
    public DeleteMonitorWebhookResponse deleteMonitorWebhookWithOptions(String webhookId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorWebhook"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/webhook/" + com.aliyun.openapiutil.Client.getEncodeParam(webhookId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除webhook</p>
     * @return DeleteMonitorWebhookResponse
     */
    public DeleteMonitorWebhookResponse deleteMonitorWebhook(String webhookId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMonitorWebhookWithOptions(webhookId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除MQ Group</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMqGroupResponse
     */
    public DeleteMqGroupResponse deleteMqGroupWithOptions(String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMqGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMqGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除MQ Group</p>
     * @return DeleteMqGroupResponse
     */
    public DeleteMqGroupResponse deleteMqGroup(String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMqGroupWithOptions(groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Topic</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMqTopicResponse
     */
    public DeleteMqTopicResponse deleteMqTopicWithOptions(String topicId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMqTopic"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic/" + com.aliyun.openapiutil.Client.getEncodeParam(topicId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMqTopicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Topic</p>
     * @return DeleteMqTopicResponse
     */
    public DeleteMqTopicResponse deleteMqTopic(String topicId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMqTopicWithOptions(topicId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消服务调用服务</p>
     * 
     * @param request DeletePbcInvokeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePbcInvokeResponse
     */
    public DeletePbcInvokeResponse deletePbcInvokeWithOptions(DeletePbcInvokeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePbcInvoke"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invokes"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePbcInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消服务调用服务</p>
     * 
     * @param request DeletePbcInvokeRequest
     * @return DeletePbcInvokeResponse
     */
    public DeletePbcInvokeResponse deletePbcInvoke(DeletePbcInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePbcInvokeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpConfigResponse
     */
    public DeletePdpConfigResponse deletePdpConfigWithOptions(String configId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/" + com.aliyun.openapiutil.Client.getEncodeParam(configId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务配置</p>
     * @return DeletePdpConfigResponse
     */
    public DeletePdpConfigResponse deletePdpConfig(String configId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpConfigWithOptions(configId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除泳道</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpLaneResponse
     */
    public DeletePdpLaneResponse deletePdpLaneWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpLane"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除泳道</p>
     * @return DeletePdpLaneResponse
     */
    public DeletePdpLaneResponse deletePdpLane(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpLaneWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定泳道入口微服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpLaneInletServiceResponse
     */
    public DeletePdpLaneInletServiceResponse deletePdpLaneInletServiceWithOptions(String laneId, String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpLaneInletService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/" + com.aliyun.openapiutil.Client.getEncodeParam(laneId) + "/commands/deleted-inlet-service/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpLaneInletServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定泳道入口微服务</p>
     * @return DeletePdpLaneInletServiceResponse
     */
    public DeletePdpLaneInletServiceResponse deletePdpLaneInletService(String laneId, String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpLaneInletServiceWithOptions(laneId, serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除所有泳道中含有指定的微服务组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpLaneServiceGroupResponse
     */
    public DeletePdpLaneServiceGroupResponse deletePdpLaneServiceGroupWithOptions(String serviceGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpLaneServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/commands/deleted-service-group/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpLaneServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除所有泳道中含有指定的微服务组</p>
     * @return DeletePdpLaneServiceGroupResponse
     */
    public DeletePdpLaneServiceGroupResponse deletePdpLaneServiceGroup(String serviceGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpLaneServiceGroupWithOptions(serviceGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除PdpPbc</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpPbcResponse
     */
    public DeletePdpPbcResponse deletePdpPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除PdpPbc</p>
     * @return DeletePdpPbcResponse
     */
    public DeletePdpPbcResponse deletePdpPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpPbcWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpServiceResponse
     */
    public DeletePdpServiceResponse deletePdpServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * @return DeletePdpServiceResponse
     */
    public DeletePdpServiceResponse deletePdpService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpServiceWithOptions(serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePdpServiceGroupResponse
     */
    public DeletePdpServiceGroupResponse deletePdpServiceGroupWithOptions(String serviceGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePdpServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceGroupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePdpServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务分组</p>
     * @return DeletePdpServiceGroupResponse
     */
    public DeletePdpServiceGroupResponse deletePdpServiceGroup(String serviceGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePdpServiceGroupWithOptions(serviceGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除权限</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivilegeResponse
     */
    public DeletePrivilegeResponse deletePrivilegeWithOptions(String privilegeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivilege"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/privileges/" + com.aliyun.openapiutil.Client.getEncodeParam(privilegeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除权限</p>
     * @return DeletePrivilegeResponse
     */
    public DeletePrivilegeResponse deletePrivilege(String privilegeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePrivilegeWithOptions(privilegeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(String id, DeleteProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(String id, DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定资源</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResourceWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定资源</p>
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRoleWithOptions(String roleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(roleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除入驻申请记录</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSettledResponse
     */
    public DeleteSettledResponse deleteSettledWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSettled"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/settleds/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSettledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除入驻申请记录</p>
     * @return DeleteSettledResponse
     */
    public DeleteSettledResponse deleteSettled(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSettledWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>依赖二方包</p>
     * 
     * @param request DependLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DependLibraryResponse
     */
    public DependLibraryResponse dependLibraryWithOptions(String id, DependLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DependLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/dependency"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DependLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>依赖二方包</p>
     * 
     * @param request DependLibraryRequest
     * @return DependLibraryResponse
     */
    public DependLibraryResponse dependLibrary(String id, DependLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dependLibraryWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核</p>
     * 
     * @param request FeedbackLibraryReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FeedbackLibraryReviewResponse
     */
    public FeedbackLibraryReviewResponse feedbackLibraryReviewWithOptions(String reviewId, FeedbackLibraryReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approve)) {
            body.put("approve", request.approve);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            body.put("feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewId)) {
            body.put("reviewId", request.reviewId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/feedback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackLibraryReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>审批审核</p>
     * 
     * @param request FeedbackLibraryReviewRequest
     * @return FeedbackLibraryReviewResponse
     */
    public FeedbackLibraryReviewResponse feedbackLibraryReview(String reviewId, FeedbackLibraryReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.feedbackLibraryReviewWithOptions(reviewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request FeedbackPbcReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FeedbackPbcReviewResponse
     */
    public FeedbackPbcReviewResponse feedbackPbcReviewWithOptions(String reviewId, FeedbackPbcReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackPbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + "/commands/feedback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackPbcReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交审核</p>
     * 
     * @param request FeedbackPbcReviewRequest
     * @return FeedbackPbcReviewResponse
     */
    public FeedbackPbcReviewResponse feedbackPbcReview(String reviewId, FeedbackPbcReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.feedbackPbcReviewWithOptions(reviewId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Buc公司</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucEnterpriseResponse
     */
    public GetBucEnterpriseResponse getBucEnterpriseWithOptions(String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/bucs/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Buc公司</p>
     * @return GetBucEnterpriseResponse
     */
    public GetBucEnterpriseResponse getBucEnterprise(String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucEnterpriseWithOptions(enterpriseId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComponentResponse
     */
    public GetComponentResponse getComponentWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComponent"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件</p>
     * @return GetComponentResponse
     */
    public GetComponentResponse getComponent(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件模板</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComponentTemplateResponse
     */
    public GetComponentTemplateResponse getComponentTemplateWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComponentTemplate"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/component-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComponentTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件模板</p>
     * @return GetComponentTemplateResponse
     */
    public GetComponentTemplateResponse getComponentTemplate(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComponentTemplateWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询部署详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeploymentWithOptions(String deploymentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(deploymentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询部署详情</p>
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeployment(String deploymentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeploymentWithOptions(deploymentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeveloperResponse
     */
    public GetDeveloperResponse getDeveloperWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者</p>
     * @return GetDeveloperResponse
     */
    public GetDeveloperResponse getDeveloper(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeveloperWithOptions(accountId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者所在公司</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeveloperEnterpriseResponse
     */
    public GetDeveloperEnterpriseResponse getDeveloperEnterpriseWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeveloperEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeveloperEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者所在公司</p>
     * @return GetDeveloperEnterpriseResponse
     */
    public GetDeveloperEnterpriseResponse getDeveloperEnterprise(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeveloperEnterpriseWithOptions(accountId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询公司</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseResponse
     */
    public GetEnterpriseResponse getEnterpriseWithOptions(String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询公司</p>
     * @return GetEnterpriseResponse
     */
    public GetEnterpriseResponse getEnterprise(String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnterpriseWithOptions(enterpriseId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseDeveloperResponse
     */
    public GetEnterpriseDeveloperResponse getEnterpriseDeveloperWithOptions(String accountId, String enterpriseId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterpriseDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + "/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者</p>
     * @return GetEnterpriseDeveloperResponse
     */
    public GetEnterpriseDeveloperResponse getEnterpriseDeveloper(String accountId, String enterpriseId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnterpriseDeveloperWithOptions(accountId, enterpriseId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取审核详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetForkReviewResponse
     */
    public GetForkReviewResponse getForkReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetForkReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetForkReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取审核详情</p>
     * @return GetForkReviewResponse
     */
    public GetForkReviewResponse getForkReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getForkReviewWithOptions(reviewId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询历史开发者</p>
     * 
     * @param request GetHistoryDeveloperRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoryDeveloperResponse
     */
    public GetHistoryDeveloperResponse getHistoryDeveloperWithOptions(String accountId, GetHistoryDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoryDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + "/commonds/history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoryDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询历史开发者</p>
     * 
     * @param request GetHistoryDeveloperRequest
     * @return GetHistoryDeveloperResponse
     */
    public GetHistoryDeveloperResponse getHistoryDeveloper(String accountId, GetHistoryDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHistoryDeveloperWithOptions(accountId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近一次部署配置</p>
     * 
     * @param request GetLastDeploymentConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLastDeploymentConfigResponse
     */
    public GetLastDeploymentConfigResponse getLastDeploymentConfigWithOptions(GetLastDeploymentConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLastDeploymentConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/last-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLastDeploymentConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最近一次部署配置</p>
     * 
     * @param request GetLastDeploymentConfigRequest
     * @return GetLastDeploymentConfigResponse
     */
    public GetLastDeploymentConfigResponse getLastDeploymentConfig(GetLastDeploymentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLastDeploymentConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最新版本二方库</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibraryWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最新版本二方库</p>
     * @return GetLibraryResponse
     */
    public GetLibraryResponse getLibrary(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取二方包代码库开发者统计信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryDeveloperRepoMetricsResponse
     */
    public GetLibraryDeveloperRepoMetricsResponse getLibraryDeveloperRepoMetricsWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryDeveloperRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/Librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/code/commands/get-developer-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryDeveloperRepoMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取二方包代码库开发者统计信息</p>
     * @return GetLibraryDeveloperRepoMetricsResponse
     */
    public GetLibraryDeveloperRepoMetricsResponse getLibraryDeveloperRepoMetrics(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryDeveloperRepoMetricsWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包使用说明文档</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryInstructionResponse
     */
    public GetLibraryInstructionResponse getLibraryInstructionWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/instructions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包使用说明文档</p>
     * @return GetLibraryInstructionResponse
     */
    public GetLibraryInstructionResponse getLibraryInstruction(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryInstructionWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取二方包的代码库统计信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryRepoMetricsResponse
     */
    public GetLibraryRepoMetricsResponse getLibraryRepoMetricsWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/Librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/code/commands/get-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryRepoMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取二方包的代码库统计信息</p>
     * @return GetLibraryRepoMetricsResponse
     */
    public GetLibraryRepoMetricsResponse getLibraryRepoMetrics(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryRepoMetricsWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibraryReviewResponse
     */
    public GetLibraryReviewResponse getLibraryReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibraryReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息</p>
     * @return GetLibraryReviewResponse
     */
    public GetLibraryReviewResponse getLibraryReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibraryReviewWithOptions(reviewId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包规格</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLibrarySchemaResponse
     */
    public GetLibrarySchemaResponse getLibrarySchemaWithOptions(String libraryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLibrarySchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包规格</p>
     * @return GetLibrarySchemaResponse
     */
    public GetLibrarySchemaResponse getLibrarySchema(String libraryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLibrarySchemaWithOptions(libraryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志链接</p>
     * 
     * @param request GetLogUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogUrlResponse
     */
    public GetLogUrlResponse getLogUrlWithOptions(GetLogUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogUrl"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/pdp-log/url"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志链接</p>
     * 
     * @param request GetLogUrlRequest
     * @return GetLogUrlResponse
     */
    public GetLogUrlResponse getLogUrl(GetLogUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取登录的buc用户信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginUserInfoResponse
     */
    public GetLoginUserInfoResponse getLoginUserInfoWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginUserInfo"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/bucs/logins"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取登录的buc用户信息</p>
     * @return GetLoginUserInfoResponse
     */
    public GetLoginUserInfoResponse getLoginUserInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoginUserInfoWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报警任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorAlertResponse
     */
    public GetMonitorAlertResponse getMonitorAlertWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报警任务</p>
     * @return GetMonitorAlertResponse
     */
    public GetMonitorAlertResponse getMonitorAlert(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorAlertWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报警历史</p>
     * 
     * @param request GetMonitorAlertHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorAlertHistoryResponse
     */
    public GetMonitorAlertHistoryResponse getMonitorAlertHistoryWithOptions(GetMonitorAlertHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleName)) {
            query.put("alertRuleName", request.alertRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorAlertHistory"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/getMonitorAlertHistory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorAlertHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报警历史</p>
     * 
     * @param request GetMonitorAlertHistoryRequest
     * @return GetMonitorAlertHistoryResponse
     */
    public GetMonitorAlertHistoryResponse getMonitorAlertHistory(GetMonitorAlertHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorAlertHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorContactResponse
     */
    public GetMonitorContactResponse getMonitorContactWithOptions(String contactId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorContact"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact/" + com.aliyun.openapiutil.Client.getEncodeParam(contactId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人</p>
     * @return GetMonitorContactResponse
     */
    public GetMonitorContactResponse getMonitorContact(String contactId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorContactWithOptions(contactId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorContactGroupResponse
     */
    public GetMonitorContactGroupResponse getMonitorContactGroupWithOptions(String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorContactGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人组</p>
     * @return GetMonitorContactGroupResponse
     */
    public GetMonitorContactGroupResponse getMonitorContactGroup(String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorContactGroupWithOptions(groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询webhook</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorWebhookResponse
     */
    public GetMonitorWebhookResponse getMonitorWebhookWithOptions(String webhookId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorWebhook"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/webhook/" + com.aliyun.openapiutil.Client.getEncodeParam(webhookId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询webhook</p>
     * @return GetMonitorWebhookResponse
     */
    public GetMonitorWebhookResponse getMonitorWebhook(String webhookId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorWebhookWithOptions(webhookId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询最新版本pbc</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcResponse
     */
    public GetPbcResponse getPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询最新版本pbc</p>
     * @return GetPbcResponse
     */
    public GetPbcResponse getPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC的api规格</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcApiSchemaResponse
     */
    public GetPbcApiSchemaResponse getPbcApiSchemaWithOptions(String pbcVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/api-schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcApiSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC的api规格</p>
     * @return GetPbcApiSchemaResponse
     */
    public GetPbcApiSchemaResponse getPbcApiSchema(String pbcVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcApiSchemaWithOptions(pbcVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取PBC代码库开发者统计信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcDeveloperRepoMetricsResponse
     */
    public GetPbcDeveloperRepoMetricsResponse getPbcDeveloperRepoMetricsWithOptions(String pbcId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcDeveloperRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcId) + "/code/commands/get-developer-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcDeveloperRepoMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取PBC代码库开发者统计信息</p>
     * @return GetPbcDeveloperRepoMetricsResponse
     */
    public GetPbcDeveloperRepoMetricsResponse getPbcDeveloperRepoMetrics(String pbcId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcDeveloperRepoMetricsWithOptions(pbcId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC使用说明文档</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcInstructionResponse
     */
    public GetPbcInstructionResponse getPbcInstructionWithOptions(String pbcVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/instructions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC使用说明文档</p>
     * @return GetPbcInstructionResponse
     */
    public GetPbcInstructionResponse getPbcInstruction(String pbcVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcInstructionWithOptions(pbcVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取审核详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcInvokeReviewResponse
     */
    public GetPbcInvokeReviewResponse getPbcInvokeReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcInvokeReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcInvokeReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取审核详情</p>
     * @return GetPbcInvokeReviewResponse
     */
    public GetPbcInvokeReviewResponse getPbcInvokeReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcInvokeReviewWithOptions(reviewId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取PBC的代码库统计信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcRepoMetricsResponse
     */
    public GetPbcRepoMetricsResponse getPbcRepoMetricsWithOptions(String pbcId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcRepoMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcId) + "/code/commands/get-repo-metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcRepoMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取PBC的代码库统计信息</p>
     * @return GetPbcRepoMetricsResponse
     */
    public GetPbcRepoMetricsResponse getPbcRepoMetrics(String pbcId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcRepoMetricsWithOptions(pbcId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc审核信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcReviewResponse
     */
    public GetPbcReviewResponse getPbcReviewWithOptions(String reviewId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/" + com.aliyun.openapiutil.Client.getEncodeParam(reviewId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc审核信息</p>
     * @return GetPbcReviewResponse
     */
    public GetPbcReviewResponse getPbcReview(String reviewId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcReviewWithOptions(reviewId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC规格</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcSchemaResponse
     */
    public GetPbcSchemaResponse getPbcSchemaWithOptions(String pbcVersionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询PBC规格</p>
     * @return GetPbcSchemaResponse
     */
    public GetPbcSchemaResponse getPbcSchema(String pbcVersionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcSchemaWithOptions(pbcVersionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc版本信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPbcVersionResponse
     */
    public GetPbcVersionResponse getPbcVersionWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPbcVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc版本信息</p>
     * @return GetPbcVersionResponse
     */
    public GetPbcVersionResponse getPbcVersion(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPbcVersionWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取配置信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpConfigResponse
     */
    public GetPdpConfigResponse getPdpConfigWithOptions(String configId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/last/" + com.aliyun.openapiutil.Client.getEncodeParam(configId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取配置信息</p>
     * @return GetPdpConfigResponse
     */
    public GetPdpConfigResponse getPdpConfig(String configId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpConfigWithOptions(configId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取历史配置详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpHistoryConfigResponse
     */
    public GetPdpHistoryConfigResponse getPdpHistoryConfigWithOptions(String historyConfigId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpHistoryConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/history/" + com.aliyun.openapiutil.Client.getEncodeParam(historyConfigId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpHistoryConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取历史配置详情</p>
     * @return GetPdpHistoryConfigResponse
     */
    public GetPdpHistoryConfigResponse getPdpHistoryConfig(String historyConfigId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpHistoryConfigWithOptions(historyConfigId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询泳道详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpLaneResponse
     */
    public GetPdpLaneResponse getPdpLaneWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpLane"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询泳道详情</p>
     * @return GetPdpLaneResponse
     */
    public GetPdpLaneResponse getPdpLane(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpLaneWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询PdpPbc</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpPbcResponse
     */
    public GetPdpPbcResponse getPdpPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询PdpPbc</p>
     * @return GetPdpPbcResponse
     */
    public GetPdpPbcResponse getPdpPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpPbcWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpServiceResponse
     */
    public GetPdpServiceResponse getPdpServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务</p>
     * @return GetPdpServiceResponse
     */
    public GetPdpServiceResponse getPdpService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpServiceWithOptions(serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPdpServiceGroupResponse
     */
    public GetPdpServiceGroupResponse getPdpServiceGroupWithOptions(String serviceGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPdpServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceGroupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPdpServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务分组</p>
     * @return GetPdpServiceGroupResponse
     */
    public GetPdpServiceGroupResponse getPdpServiceGroup(String serviceGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdpServiceGroupWithOptions(serviceGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductResponse
     */
    public GetProductResponse getProductWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProduct"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品</p>
     * @return GetProductResponse
     */
    public GetProductResponse getProduct(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceResponse
     */
    public GetResourceResponse getResourceWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源</p>
     * @return GetResourceResponse
     */
    public GetResourceResponse getResource(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleResponse
     */
    public GetRoleResponse getRoleWithOptions(String roleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/role-id/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色</p>
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(String roleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleWithOptions(roleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取调用链方法栈</p>
     * 
     * @param request GetStackDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStackDetailResponse
     */
    public GetStackDetailResponse getStackDetailWithOptions(String traceId, GetStackDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpcId)) {
            query.put("rpcId", request.rpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStackDetail"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/traces/" + com.aliyun.openapiutil.Client.getEncodeParam(traceId) + "/commonds/stack"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStackDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取调用链方法栈</p>
     * 
     * @param request GetStackDetailRequest
     * @return GetStackDetailResponse
     */
    public GetStackDetailResponse getStackDetail(String traceId, GetStackDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStackDetailWithOptions(traceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取token</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            body.put("pbcId", request.pbcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取token</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取调用链详情</p>
     * 
     * @param request GetTraceDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceDetailResponse
     */
    public GetTraceDetailResponse getTraceDetailWithOptions(String traceId, GetTraceDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTraceDetail"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/traces/" + com.aliyun.openapiutil.Client.getEncodeParam(traceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取调用链详情</p>
     * 
     * @param request GetTraceDetailRequest
     * @return GetTraceDetailResponse
     */
    public GetTraceDetailResponse getTraceDetail(String traceId, GetTraceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraceDetailWithOptions(traceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>授权</p>
     * 
     * @param request GrantRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantRoleResponse
     */
    public GrantRoleResponse grantRoleWithOptions(String roleId, GrantRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/commands/grant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>授权</p>
     * 
     * @param request GrantRoleRequest
     * @return GrantRoleResponse
     */
    public GrantRoleResponse grantRole(String roleId, GrantRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRoleWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询可以授权的产品</p>
     * 
     * @param request ListAuthorizeProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizeProductsResponse
     */
    public ListAuthorizeProductsResponse listAuthorizeProductsWithOptions(ListAuthorizeProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizeProducts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products/commands/list-authorize"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizeProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询可以授权的产品</p>
     * 
     * @param request ListAuthorizeProductsRequest
     * @return ListAuthorizeProductsResponse
     */
    public ListAuthorizeProductsResponse listAuthorizeProducts(ListAuthorizeProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorizeProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Buc用户的公司</p>
     * 
     * @param request ListBucUserEnterpriseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBucUserEnterpriseResponse
     */
    public ListBucUserEnterpriseResponse listBucUserEnterpriseWithOptions(ListBucUserEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.empId)) {
            query.put("empId", request.empId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBucUserEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/bucs/enterprises"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBucUserEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Buc用户的公司</p>
     * 
     * @param request ListBucUserEnterpriseRequest
     * @return ListBucUserEnterpriseResponse
     */
    public ListBucUserEnterpriseResponse listBucUserEnterprise(ListBucUserEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBucUserEnterpriseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件模板列表</p>
     * 
     * @param request ListComponentTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentTemplatesResponse
     */
    public ListComponentTemplatesResponse listComponentTemplatesWithOptions(ListComponentTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentTemplates"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/component-templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件模板列表</p>
     * 
     * @param request ListComponentTemplatesRequest
     * @return ListComponentTemplatesResponse
     */
    public ListComponentTemplatesResponse listComponentTemplates(ListComponentTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件列表</p>
     * 
     * @param request ListComponentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件列表</p>
     * 
     * @param request ListComponentsRequest
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询我依赖的二方包列表</p>
     * 
     * @param request ListDependLibrarysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDependLibrarysResponse
     */
    public ListDependLibrarysResponse listDependLibrarysWithOptions(ListDependLibrarysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDependLibrarys"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/commands/list-dependency"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDependLibrarysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询我依赖的二方包列表</p>
     * 
     * @param request ListDependLibrarysRequest
     * @return ListDependLibrarysResponse
     */
    public ListDependLibrarysResponse listDependLibrarys(ListDependLibrarysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDependLibrarysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询部署记录列表</p>
     * 
     * @param tmpReq ListDeploymentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeploymentsWithOptions(ListDeploymentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeploymentsShrinkRequest request = new ListDeploymentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeStatus)) {
            request.excludeStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeStatus, "excludeStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeStatusShrink)) {
            query.put("excludeStatus", request.excludeStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("status", request.statusShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployments"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询部署记录列表</p>
     * 
     * @param request ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeploymentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者所在公司列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeveloperEnterprisesResponse
     */
    public ListDeveloperEnterprisesResponse listDeveloperEnterprisesWithOptions(String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeveloperEnterprises"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + "/commands/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeveloperEnterprisesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者所在公司列表</p>
     * @return ListDeveloperEnterprisesResponse
     */
    public ListDeveloperEnterprisesResponse listDeveloperEnterprises(String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeveloperEnterprisesWithOptions(accountId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前开发者拥有权限的pbc列表</p>
     * 
     * @param request ListDeveloperPbcsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeveloperPbcsResponse
     */
    public ListDeveloperPbcsResponse listDeveloperPbcsWithOptions(ListDeveloperPbcsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeveloperPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/commands/allow-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeveloperPbcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前开发者拥有权限的pbc列表</p>
     * 
     * @param request ListDeveloperPbcsRequest
     * @return ListDeveloperPbcsResponse
     */
    public ListDeveloperPbcsResponse listDeveloperPbcs(ListDeveloperPbcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeveloperPbcsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者列表</p>
     * 
     * @param tmpReq ListDevelopersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDevelopersResponse
     */
    public ListDevelopersResponse listDevelopersWithOptions(ListDevelopersRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDevelopersShrinkRequest request = new ListDevelopersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "accountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("accountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("roleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevelopers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevelopersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发者列表</p>
     * 
     * @param request ListDevelopersRequest
     * @return ListDevelopersResponse
     */
    public ListDevelopersResponse listDevelopers(ListDevelopersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDevelopersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>此PBC依赖的PBC列表(下游游PBC)</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownstreamPbcResponse
     */
    public ListDownstreamPbcResponse listDownstreamPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/list-downstream"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>此PBC依赖的PBC列表(下游游PBC)</p>
     * @return ListDownstreamPbcResponse
     */
    public ListDownstreamPbcResponse listDownstreamPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDownstreamPbcWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询公司列表</p>
     * 
     * @param request ListEnterprisesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterprisesResponse
     */
    public ListEnterprisesResponse listEnterprisesWithOptions(ListEnterprisesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterprises"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterprisesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询公司列表</p>
     * 
     * @param request ListEnterprisesRequest
     * @return ListEnterprisesResponse
     */
    public ListEnterprisesResponse listEnterprises(ListEnterprisesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnterprisesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>产销环境信息列表</p>
     * 
     * @param request ListEnvInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvInfosResponse
     */
    public ListEnvInfosResponse listEnvInfosWithOptions(ListEnvInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvInfos"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/env/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>产销环境信息列表</p>
     * 
     * @param request ListEnvInfosRequest
     * @return ListEnvInfosResponse
     */
    public ListEnvInfosResponse listEnvInfos(ListEnvInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvInfosWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核列表，支持按照审核人、申请人查询</p>
     * 
     * @param request ListForkReviewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListForkReviewsResponse
     */
    public ListForkReviewsResponse listForkReviewsWithOptions(ListForkReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForkReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/fork-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForkReviewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核列表，支持按照审核人、申请人查询</p>
     * 
     * @param request ListForkReviewsRequest
     * @return ListForkReviewsResponse
     */
    public ListForkReviewsResponse listForkReviews(ListForkReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listForkReviewsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询被授权角色列表</p>
     * 
     * @param request ListGrantedRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGrantedRolesResponse
     */
    public ListGrantedRolesResponse listGrantedRolesWithOptions(ListGrantedRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            query.put("authorizerId", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizerType)) {
            query.put("authorizerType", request.authorizerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrantedRoles"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/commands/list-granted-roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantedRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询被授权角色列表</p>
     * 
     * @param request ListGrantedRolesRequest
     * @return ListGrantedRolesResponse
     */
    public ListGrantedRolesResponse listGrantedRoles(ListGrantedRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGrantedRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询订阅当前组件的pbc的列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInvokePbcsResponse
     */
    public ListInvokePbcsResponse listInvokePbcsWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvokePbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/invoke-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvokePbcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询订阅当前组件的pbc的列表</p>
     * @return ListInvokePbcsResponse
     */
    public ListInvokePbcsResponse listInvokePbcs(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInvokePbcsWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息列表</p>
     * 
     * @param request ListLibraryReviewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLibraryReviewsResponse
     */
    public ListLibraryReviewsResponse listLibraryReviewsWithOptions(ListLibraryReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLibraryReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLibraryReviewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息列表</p>
     * 
     * @param request ListLibraryReviewsRequest
     * @return ListLibraryReviewsResponse
     */
    public ListLibraryReviewsResponse listLibraryReviews(ListLibraryReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLibraryReviewsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包列表</p>
     * 
     * @param request ListLibrarysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLibrarysResponse
     */
    public ListLibrarysResponse listLibrarysWithOptions(ListLibrarysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLibrarys"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLibrarysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询二方包列表</p>
     * 
     * @param request ListLibrarysRequest
     * @return ListLibrarysResponse
     */
    public ListLibrarysResponse listLibrarys(ListLibrarysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLibrarysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询市场列表</p>
     * 
     * @param request ListMarketsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMarketsResponse
     */
    public ListMarketsResponse listMarketsWithOptions(ListMarketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMarkets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMarketsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询市场列表</p>
     * 
     * @param request ListMarketsRequest
     * @return ListMarketsResponse
     */
    public ListMarketsResponse listMarkets(ListMarketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMarketsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索元数据信息列表</p>
     * 
     * @param request ListMetadataInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetadataInfosResponse
     */
    public ListMetadataInfosResponse listMetadataInfosWithOptions(ListMetadataInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("namespace_id", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("namespace_name", request.namespaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("org_id", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbc_id", request.pbcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetadataInfos"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/metadata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetadataInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索元数据信息列表</p>
     * 
     * @param request ListMetadataInfosRequest
     * @return ListMetadataInfosResponse
     */
    public ListMetadataInfosResponse listMetadataInfos(ListMetadataInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetadataInfosWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询微服务列表</p>
     * 
     * @param request ListMicroServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMicroServiceResponse
     */
    public ListMicroServiceResponse listMicroServiceWithOptions(String env, ListMicroServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            query.put("serviceIds", request.serviceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMicroService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/group/env/" + com.aliyun.openapiutil.Client.getEncodeParam(env) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMicroServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询微服务列表</p>
     * 
     * @param request ListMicroServiceRequest
     * @return ListMicroServiceResponse
     */
    public ListMicroServiceResponse listMicroService(String env, ListMicroServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMicroServiceWithOptions(env, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人组列表</p>
     * 
     * @param request ListMonitorContactGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorContactGroupsResponse
     */
    public ListMonitorContactGroupsResponse listMonitorContactGroupsWithOptions(ListMonitorContactGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorContactGroups"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorContactGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人组列表</p>
     * 
     * @param request ListMonitorContactGroupsRequest
     * @return ListMonitorContactGroupsResponse
     */
    public ListMonitorContactGroupsResponse listMonitorContactGroups(ListMonitorContactGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorContactGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人列表</p>
     * 
     * @param request ListMonitorContactsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorContactsResponse
     */
    public ListMonitorContactsResponse listMonitorContactsWithOptions(ListMonitorContactsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorContacts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联系人列表</p>
     * 
     * @param request ListMonitorContactsRequest
     * @return ListMonitorContactsResponse
     */
    public ListMonitorContactsResponse listMonitorContacts(ListMonitorContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorContactsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有的联系人/联系人组/webhook列表</p>
     * 
     * @param request ListMonitorNotifyObjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorNotifyObjectsResponse
     */
    public ListMonitorNotifyObjectsResponse listMonitorNotifyObjectsWithOptions(ListMonitorNotifyObjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            query.put("webhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorNotifyObjects"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/listMonitorNotifyObjects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorNotifyObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有的联系人/联系人组/webhook列表</p>
     * 
     * @param request ListMonitorNotifyObjectsRequest
     * @return ListMonitorNotifyObjectsResponse
     */
    public ListMonitorNotifyObjectsResponse listMonitorNotifyObjects(ListMonitorNotifyObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorNotifyObjectsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询通知报警列表</p>
     * 
     * @param request ListMonitorTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorTasksResponse
     */
    public ListMonitorTasksResponse listMonitorTasksWithOptions(ListMonitorTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            query.put("alertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorTasks"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/listMonitorTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询通知报警列表</p>
     * 
     * @param request ListMonitorTasksRequest
     * @return ListMonitorTasksResponse
     */
    public ListMonitorTasksResponse listMonitorTasks(ListMonitorTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询webhook列表</p>
     * 
     * @param request ListMonitorWebhooksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonitorWebhooksResponse
     */
    public ListMonitorWebhooksResponse listMonitorWebhooksWithOptions(ListMonitorWebhooksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            query.put("webhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorWebhooks"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/webhook"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorWebhooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询webhook列表</p>
     * 
     * @param request ListMonitorWebhooksRequest
     * @return ListMonitorWebhooksResponse
     */
    public ListMonitorWebhooksResponse listMonitorWebhooks(ListMonitorWebhooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMonitorWebhooksWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Group下的死信消息列表</p>
     * 
     * @param request ListMqGroupMsgsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMqGroupMsgsResponse
     */
    public ListMqGroupMsgsResponse listMqGroupMsgsWithOptions(String groupId, ListMqGroupMsgsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("msgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMqGroupMsgs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/group/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/commands/msgs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMqGroupMsgsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Group下的死信消息列表</p>
     * 
     * @param request ListMqGroupMsgsRequest
     * @return ListMqGroupMsgsResponse
     */
    public ListMqGroupMsgsResponse listMqGroupMsgs(String groupId, ListMqGroupMsgsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMqGroupMsgsWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic下的消息列表</p>
     * 
     * @param request ListMqTopicMsgsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMqTopicMsgsResponse
     */
    public ListMqTopicMsgsResponse listMqTopicMsgsWithOptions(String topicId, ListMqTopicMsgsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            query.put("msgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMqTopicMsgs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic/" + com.aliyun.openapiutil.Client.getEncodeParam(topicId) + "/commands/msgs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMqTopicMsgsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic下的消息列表</p>
     * 
     * @param request ListMqTopicMsgsRequest
     * @return ListMqTopicMsgsResponse
     */
    public ListMqTopicMsgsResponse listMqTopicMsgs(String topicId, ListMqTopicMsgsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMqTopicMsgsWithOptions(topicId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic下的在线订阅列表</p>
     * 
     * @param request ListMqTopicSubsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMqTopicSubsResponse
     */
    public ListMqTopicSubsResponse listMqTopicSubsWithOptions(String topicId, ListMqTopicSubsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMqTopicSubs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic/" + com.aliyun.openapiutil.Client.getEncodeParam(topicId) + "/commands/subs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMqTopicSubsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic下的在线订阅列表</p>
     * 
     * @param request ListMqTopicSubsRequest
     * @return ListMqTopicSubsResponse
     */
    public ListMqTopicSubsResponse listMqTopicSubs(String topicId, ListMqTopicSubsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMqTopicSubsWithOptions(topicId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic列表</p>
     * 
     * @param request ListMqTopicsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMqTopicsResponse
     */
    public ListMqTopicsResponse listMqTopicsWithOptions(String env, String pbcId, ListMqTopicsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicName)) {
            query.put("topicName", request.topicName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMqTopics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic/env/" + com.aliyun.openapiutil.Client.getEncodeParam(env) + "/pbcId/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMqTopicsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Topic列表</p>
     * 
     * @param request ListMqTopicsRequest
     * @return ListMqTopicsResponse
     */
    public ListMqTopicsResponse listMqTopics(String env, String pbcId, ListMqTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMqTopicsWithOptions(env, pbcId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务调用审核列表，支持按照审核人、申请人查询</p>
     * 
     * @param request ListPbcInvokeReviewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcInvokeReviewsResponse
     */
    public ListPbcInvokeReviewsResponse listPbcInvokeReviewsWithOptions(ListPbcInvokeReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderby)) {
            query.put("orderby", request.orderby);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcInvokeReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invoke-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcInvokeReviewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务调用审核列表，支持按照审核人、申请人查询</p>
     * 
     * @param request ListPbcInvokeReviewsRequest
     * @return ListPbcInvokeReviewsResponse
     */
    public ListPbcInvokeReviewsResponse listPbcInvokeReviews(ListPbcInvokeReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcInvokeReviewsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询我调用的pbc列表</p>
     * 
     * @param request ListPbcInvokesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcInvokesResponse
     */
    public ListPbcInvokesResponse listPbcInvokesWithOptions(ListPbcInvokesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcInvokes"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-invokes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcInvokesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询我调用的pbc列表</p>
     * 
     * @param request ListPbcInvokesRequest
     * @return ListPbcInvokesResponse
     */
    public ListPbcInvokesResponse listPbcInvokes(ListPbcInvokesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcInvokesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息列表</p>
     * 
     * @param request ListPbcReviewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcReviewsResponse
     */
    public ListPbcReviewsResponse listPbcReviewsWithOptions(ListPbcReviewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewer)) {
            query.put("reviewer", request.reviewer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcReviews"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcReviewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审核信息列表</p>
     * 
     * @param request ListPbcReviewsRequest
     * @return ListPbcReviewsResponse
     */
    public ListPbcReviewsResponse listPbcReviews(ListPbcReviewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcReviewsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询我订阅的pbc列表</p>
     * 
     * @param request ListPbcSubscribeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcSubscribeResponse
     */
    public ListPbcSubscribeResponse listPbcSubscribeWithOptions(ListPbcSubscribeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcSubscribe"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/commands/list-subscribe"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcSubscribeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询我订阅的pbc列表</p>
     * 
     * @param request ListPbcSubscribeRequest
     * @return ListPbcSubscribeResponse
     */
    public ListPbcSubscribeResponse listPbcSubscribe(ListPbcSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcSubscribeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询我创建的资产</p>
     * 
     * @param request ListPbcVersionBuildRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcVersionBuildResponse
     */
    public ListPbcVersionBuildResponse listPbcVersionBuildWithOptions(ListPbcVersionBuildRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcVersionBuild"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/commands/list-build"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcVersionBuildResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询我创建的资产</p>
     * 
     * @param request ListPbcVersionBuildRequest
     * @return ListPbcVersionBuildResponse
     */
    public ListPbcVersionBuildResponse listPbcVersionBuild(ListPbcVersionBuildRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcVersionBuildWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc的版本号列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcVersionNumbersResponse
     */
    public ListPbcVersionNumbersResponse listPbcVersionNumbersWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcVersionNumbers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/listPbcVersionNumbers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcVersionNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc的版本号列表</p>
     * @return ListPbcVersionNumbersResponse
     */
    public ListPbcVersionNumbersResponse listPbcVersionNumbers(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcVersionNumbersWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc列表</p>
     * 
     * @param request ListPbcsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPbcsResponse
     */
    public ListPbcsResponse listPbcsWithOptions(ListPbcsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.developerId)) {
            query.put("developerId", request.developerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPbcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pbc列表</p>
     * 
     * @param request ListPbcsRequest
     * @return ListPbcsResponse
     */
    public ListPbcsResponse listPbcs(ListPbcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPbcsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务配置列表</p>
     * 
     * @param request ListPdpConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpConfigsResponse
     */
    public ListPdpConfigsResponse listPdpConfigsWithOptions(ListPdpConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpConfigs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务配置列表</p>
     * 
     * @param request ListPdpConfigsRequest
     * @return ListPdpConfigsResponse
     */
    public ListPdpConfigsResponse listPdpConfigs(ListPdpConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务历史配置列表</p>
     * 
     * @param request ListPdpHistoryConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpHistoryConfigsResponse
     */
    public ListPdpHistoryConfigsResponse listPdpHistoryConfigsWithOptions(ListPdpHistoryConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("configId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpHistoryConfigs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs/history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpHistoryConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务历史配置列表</p>
     * 
     * @param request ListPdpHistoryConfigsRequest
     * @return ListPdpHistoryConfigsResponse
     */
    public ListPdpHistoryConfigsResponse listPdpHistoryConfigs(ListPdpHistoryConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpHistoryConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务的镜像</p>
     * 
     * @param request ListPdpImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpImageResponse
     */
    public ListPdpImageResponse listPdpImageWithOptions(ListPdpImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpImage"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/instance/images"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务的镜像</p>
     * 
     * @param request ListPdpImageRequest
     * @return ListPdpImageResponse
     */
    public ListPdpImageResponse listPdpImage(ListPdpImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询泳道列表</p>
     * 
     * @param request ListPdpLanesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpLanesResponse
     */
    public ListPdpLanesResponse listPdpLanesWithOptions(ListPdpLanesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inletServiceId)) {
            query.put("inletServiceId", request.inletServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpLanes"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpLanesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询泳道列表</p>
     * 
     * @param request ListPdpLanesRequest
     * @return ListPdpLanesResponse
     */
    public ListPdpLanesResponse listPdpLanes(ListPdpLanesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpLanesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询微服务分组可以加入的泳道列表</p>
     * 
     * @param tmpReq ListPdpLanesForServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpLanesForServiceGroupResponse
     */
    public ListPdpLanesForServiceGroupResponse listPdpLanesForServiceGroupWithOptions(ListPdpLanesForServiceGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpLanesForServiceGroupShrinkRequest request = new ListPdpLanesForServiceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.laneIds)) {
            request.laneIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.laneIds, "laneIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneIdsShrink)) {
            query.put("laneIds", request.laneIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpLanesForServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/commands/list-service-group-lane"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpLanesForServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询微服务分组可以加入的泳道列表</p>
     * 
     * @param request ListPdpLanesForServiceGroupRequest
     * @return ListPdpLanesForServiceGroupResponse
     */
    public ListPdpLanesForServiceGroupResponse listPdpLanesForServiceGroup(ListPdpLanesForServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpLanesForServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志列表</p>
     * 
     * @param request ListPdpLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpLogsResponse
     */
    public ListPdpLogsResponse listPdpLogsWithOptions(ListPdpLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpLogs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/pdp-log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志列表</p>
     * 
     * @param request ListPdpLogsRequest
     * @return ListPdpLogsResponse
     */
    public ListPdpLogsResponse listPdpLogs(ListPdpLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpLogsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索PdpPbc列表</p>
     * 
     * @param tmpReq ListPdpPbcsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpPbcsResponse
     */
    public ListPdpPbcsResponse listPdpPbcsWithOptions(ListPdpPbcsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpPbcsShrinkRequest request = new ListPdpPbcsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pbcIds)) {
            request.pbcIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pbcIds, "pbcIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.developerId)) {
            query.put("developerId", request.developerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcIdsShrink)) {
            query.put("pbcIds", request.pbcIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpPbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpPbcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索PdpPbc列表</p>
     * 
     * @param request ListPdpPbcsRequest
     * @return ListPdpPbcsResponse
     */
    public ListPdpPbcsResponse listPdpPbcs(ListPdpPbcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpPbcsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务分组列表</p>
     * 
     * @param tmpReq ListPdpServiceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpServiceGroupsResponse
     */
    public ListPdpServiceGroupsResponse listPdpServiceGroupsWithOptions(ListPdpServiceGroupsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpServiceGroupsShrinkRequest request = new ListPdpServiceGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("envType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("groupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgType)) {
            query.put("orgType", request.orgType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("repoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpServiceGroups"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpServiceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务分组列表</p>
     * 
     * @param request ListPdpServiceGroupsRequest
     * @return ListPdpServiceGroupsResponse
     */
    public ListPdpServiceGroupsResponse listPdpServiceGroups(ListPdpServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpServiceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务列表</p>
     * 
     * @param tmpReq ListPdpServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPdpServicesResponse
     */
    public ListPdpServicesResponse listPdpServicesWithOptions(ListPdpServicesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPdpServicesShrinkRequest request = new ListPdpServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pdpServiceIds)) {
            request.pdpServiceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pdpServiceIds, "pdpServiceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pdpServiceIdsShrink)) {
            query.put("pdpServiceIds", request.pdpServiceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPdpServices"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPdpServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务列表</p>
     * 
     * @param request ListPdpServicesRequest
     * @return ListPdpServicesResponse
     */
    public ListPdpServicesResponse listPdpServices(ListPdpServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPdpServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取权限列表</p>
     * 
     * @param request ListPermissionResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionResourceResponse
     */
    public ListPermissionResourceResponse listPermissionResourceWithOptions(ListPermissionResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            query.put("operatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrefix)) {
            query.put("resourcePrefix", request.resourcePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/permissions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取权限列表</p>
     * 
     * @param request ListPermissionResourceRequest
     * @return ListPermissionResourceResponse
     */
    public ListPermissionResourceResponse listPermissionResource(ListPermissionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端资源权限，如按钮、页面</p>
     * 
     * @param request ListPermissionResourceForFrontRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionResourceForFrontResponse
     */
    public ListPermissionResourceForFrontResponse listPermissionResourceForFrontWithOptions(ListPermissionResourceForFrontRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            query.put("operatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("queryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrefix)) {
            query.put("resourcePrefix", request.resourcePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionResourceForFront"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/permissions/command/front-permission"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionResourceForFrontResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取前端资源权限，如按钮、页面</p>
     * 
     * @param request ListPermissionResourceForFrontRequest
     * @return ListPermissionResourceForFrontResponse
     */
    public ListPermissionResourceForFrontResponse listPermissionResourceForFront(ListPermissionResourceForFrontRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionResourceForFrontWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取有权限的资源,请求来源POP</p>
     * 
     * @param request ListPermissionResourcePopRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionResourcePopResponse
     */
    public ListPermissionResourcePopResponse listPermissionResourcePopWithOptions(ListPermissionResourcePopRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            query.put("operatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrefix)) {
            query.put("resourcePrefix", request.resourcePrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionResourcePop"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/permissions/pop"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionResourcePopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取有权限的资源,请求来源POP</p>
     * 
     * @param request ListPermissionResourcePopRequest
     * @return ListPermissionResourcePopResponse
     */
    public ListPermissionResourcePopResponse listPermissionResourcePop(ListPermissionResourcePopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionResourcePopWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取该角色下的权限</p>
     * 
     * @param request ListPrivilegeByRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivilegeByRoleResponse
     */
    public ListPrivilegeByRoleResponse listPrivilegeByRoleWithOptions(String roleId, ListPrivilegeByRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("accountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivilegeByRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/privileges"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivilegeByRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取该角色下的权限</p>
     * 
     * @param request ListPrivilegeByRoleRequest
     * @return ListPrivilegeByRoleResponse
     */
    public ListPrivilegeByRoleResponse listPrivilegeByRole(String roleId, ListPrivilegeByRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrivilegeByRoleWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品环境</p>
     * 
     * @param request ListProductEnvInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductEnvInfosResponse
     */
    public ListProductEnvInfosResponse listProductEnvInfosWithOptions(ListProductEnvInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductEnvInfos"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/commands/list-product-env"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductEnvInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品环境</p>
     * 
     * @param request ListProductEnvInfosRequest
     * @return ListProductEnvInfosResponse
     */
    public ListProductEnvInfosResponse listProductEnvInfos(ListProductEnvInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductEnvInfosWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品环境</p>
     * 
     * @param request ListProductEnvsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductEnvsResponse
     */
    public ListProductEnvsResponse listProductEnvsWithOptions(ListProductEnvsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductEnvs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources/commands/list-product-env"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductEnvsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品环境</p>
     * 
     * @param request ListProductEnvsRequest
     * @return ListProductEnvsResponse
     */
    public ListProductEnvsResponse listProductEnvs(ListProductEnvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductEnvsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索产品列表</p>
     * 
     * @param request ListProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(ListProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索产品列表</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源列表</p>
     * 
     * @param request ListResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源列表</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有审核人信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReviewersResponse
     */
    public ListReviewersResponse listReviewersWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReviewers"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/commands/listReviewers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReviewersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有审核人信息</p>
     * @return ListReviewersResponse
     */
    public ListReviewersResponse listReviewers() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReviewersWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色列表</p>
     * 
     * @param tmpReq ListRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRolesShrinkRequest request = new ListRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleIds)) {
            request.roleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleIds, "roleIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            query.put("authorizerId", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizerType)) {
            query.put("authorizerType", request.authorizerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIdsShrink)) {
            query.put("roleIds", request.roleIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("roleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色列表</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询token列表</p>
     * 
     * @param request ListRuntimeTokensRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRuntimeTokensResponse
     */
    public ListRuntimeTokensResponse listRuntimeTokensWithOptions(ListRuntimeTokensRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("enterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pbcId)) {
            query.put("pbcId", request.pbcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuntimeTokens"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services/env/tokens"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuntimeTokensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询token列表</p>
     * 
     * @param request ListRuntimeTokensRequest
     * @return ListRuntimeTokensResponse
     */
    public ListRuntimeTokensResponse listRuntimeTokens(ListRuntimeTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuntimeTokensWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerInstancesResponse
     */
    public ListServerInstancesResponse listServerInstancesWithOptions(String env, String serviceGroupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerInstances"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceGroupId) + "/env/" + com.aliyun.openapiutil.Client.getEncodeParam(env) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务实例列表</p>
     * @return ListServerInstancesResponse
     */
    public ListServerInstancesResponse listServerInstances(String env, String serviceGroupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServerInstancesWithOptions(env, serviceGroupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询多个服务监控指标</p>
     * 
     * @param request ListServiceMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceMetricsResponse
     */
    public ListServiceMetricsResponse listServiceMetricsWithOptions(ListServiceMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalInSec)) {
            query.put("intervalInSec", request.intervalInSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measures)) {
            query.put("measures", request.measures);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("topicId", request.topicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceMetrics"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询多个服务监控指标</p>
     * 
     * @param request ListServiceMetricsRequest
     * @return ListServiceMetricsResponse
     */
    public ListServiceMetricsResponse listServiceMetrics(ListServiceMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceMetricsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询申请记录列表</p>
     * 
     * @param request ListSettledsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSettledsResponse
     */
    public ListSettledsResponse listSettledsWithOptions(ListSettledsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseName)) {
            query.put("enterpriseName", request.enterpriseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSettleds"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/settleds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSettledsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询申请记录列表</p>
     * 
     * @param request ListSettledsRequest
     * @return ListSettledsResponse
     */
    public ListSettledsResponse listSettleds(ListSettledsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSettledsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询订阅当前组件的pbc的列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscribePbcsResponse
     */
    public ListSubscribePbcsResponse listSubscribePbcsWithOptions(String pbcName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscribePbcs"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/subscribe-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscribePbcsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询订阅当前组件的pbc的列表</p>
     * @return ListSubscribePbcsResponse
     */
    public ListSubscribePbcsResponse listSubscribePbcs(String pbcName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscribePbcsWithOptions(pbcName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>依赖此PBC的列表(上游PBC)</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpstreamPbcResponse
     */
    public ListUpstreamPbcResponse listUpstreamPbcWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/list-upstream"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>依赖此PBC的列表(上游PBC)</p>
     * @return ListUpstreamPbcResponse
     */
    public ListUpstreamPbcResponse listUpstreamPbc(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUpstreamPbcWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询我关注的资产列表</p>
     * 
     * @param request ListWatchAssetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWatchAssetsResponse
     */
    public ListWatchAssetsResponse listWatchAssetsWithOptions(ListWatchAssetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("assetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upshelfAssetId)) {
            query.put("upshelfAssetId", request.upshelfAssetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWatchAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watchs/commands/list-watch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWatchAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询我关注的资产列表</p>
     * 
     * @param request ListWatchAssetsRequest
     * @return ListWatchAssetsResponse
     */
    public ListWatchAssetsResponse listWatchAssets(ListWatchAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWatchAssetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成跳转mq控制台链接</p>
     * 
     * @param request ObtainMqConsoleLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainMqConsoleLinkResponse
     */
    public ObtainMqConsoleLinkResponse obtainMqConsoleLinkWithOptions(ObtainMqConsoleLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainMqConsoleLink"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/mq/topic/commonds/obtainMqConsoleLink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ObtainMqConsoleLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成跳转mq控制台链接</p>
     * 
     * @param request ObtainMqConsoleLinkRequest
     * @return ObtainMqConsoleLinkResponse
     */
    public ObtainMqConsoleLinkResponse obtainMqConsoleLink(ObtainMqConsoleLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.obtainMqConsoleLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>已有微服务开启分组</p>
     * 
     * @param request OpenServiceGroupForServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenServiceGroupForServiceResponse
     */
    public OpenServiceGroupForServiceResponse openServiceGroupForServiceWithOptions(OpenServiceGroupForServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenServiceGroupForService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/commands/open-group"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenServiceGroupForServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>已有微服务开启分组</p>
     * 
     * @param request OpenServiceGroupForServiceRequest
     * @return OpenServiceGroupForServiceResponse
     */
    public OpenServiceGroupForServiceResponse openServiceGroupForService(OpenServiceGroupForServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openServiceGroupForServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览组件CRD</p>
     * 
     * @param request PreviewComponentCrdSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewComponentCrdSchemaResponse
     */
    public PreviewComponentCrdSchemaResponse previewComponentCrdSchemaWithOptions(PreviewComponentCrdSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewComponentCrdSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components/commonds/preview-component-schema"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewComponentCrdSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预览组件CRD</p>
     * 
     * @param request PreviewComponentCrdSchemaRequest
     * @return PreviewComponentCrdSchemaResponse
     */
    public PreviewComponentCrdSchemaResponse previewComponentCrdSchema(PreviewComponentCrdSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewComponentCrdSchemaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册Buc用户</p>
     * 
     * @param request RegisterBucUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterBucUserResponse
     */
    public RegisterBucUserResponse registerBucUserWithOptions(RegisterBucUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterBucUser"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/bucs/logins/register"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterBucUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册Buc用户</p>
     * 
     * @param request RegisterBucUserRequest
     * @return RegisterBucUserResponse
     */
    public RegisterBucUserResponse registerBucUser(RegisterBucUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerBucUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消关注资产</p>
     * 
     * @param request RemoveAssetWatchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAssetWatchResponse
     */
    public RemoveAssetWatchResponse removeAssetWatchWithOptions(String assetId, RemoveAssetWatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            query.put("assetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAssetWatch"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/asset-watchs/" + com.aliyun.openapiutil.Client.getEncodeParam(assetId) + "/commands/remove-watch"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAssetWatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消关注资产</p>
     * 
     * @param request RemoveAssetWatchRequest
     * @return RemoveAssetWatchResponse
     */
    public RemoveAssetWatchResponse removeAssetWatch(String assetId, RemoveAssetWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeAssetWatchWithOptions(assetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消依赖二方包</p>
     * 
     * @param request RemoveDependLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDependLibraryResponse
     */
    public RemoveDependLibraryResponse removeDependLibraryWithOptions(String id, RemoveDependLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDependLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/remove-dependency"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDependLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消依赖二方包</p>
     * 
     * @param request RemoveDependLibraryRequest
     * @return RemoveDependLibraryResponse
     */
    public RemoveDependLibraryResponse removeDependLibrary(String id, RemoveDependLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeDependLibraryWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用指定版本部署</p>
     * 
     * @param request RevertPdpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevertPdpServiceResponse
     */
    public RevertPdpServiceResponse revertPdpServiceWithOptions(RevertPdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertPdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/commands/revert"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertPdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用指定版本部署</p>
     * 
     * @param request RevertPdpServiceRequest
     * @return RevertPdpServiceResponse
     */
    public RevertPdpServiceResponse revertPdpService(RevertPdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revertPdpServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤销二方包上架审核</p>
     * 
     * @param request RevokeLibraryReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeLibraryReviewResponse
     */
    public RevokeLibraryReviewResponse revokeLibraryReviewWithOptions(RevokeLibraryReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeLibraryReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/library-reviews/commands/revoke-review"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeLibraryReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销二方包上架审核</p>
     * 
     * @param request RevokeLibraryReviewRequest
     * @return RevokeLibraryReviewResponse
     */
    public RevokeLibraryReviewResponse revokeLibraryReview(RevokeLibraryReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeLibraryReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤销Pbc上架审核</p>
     * 
     * @param request RevokePbcReviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokePbcReviewResponse
     */
    public RevokePbcReviewResponse revokePbcReviewWithOptions(RevokePbcReviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokePbcReview"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-reviews/commands/revoke-review"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokePbcReviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销Pbc上架审核</p>
     * 
     * @param request RevokePbcReviewRequest
     * @return RevokePbcReviewResponse
     */
    public RevokePbcReviewResponse revokePbcReview(RevokePbcReviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokePbcReviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消授权</p>
     * 
     * @param request RevokeRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeRoleResponse
     */
    public RevokeRoleResponse revokeRoleWithOptions(String roleId, RevokeRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + "/commands/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消授权</p>
     * 
     * @param request RevokeRoleRequest
     * @return RevokeRoleResponse
     */
    public RevokeRoleResponse revokeRole(String roleId, RevokeRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRoleWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回滚</p>
     * 
     * @param request RollbackPdpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackPdpServiceResponse
     */
    public RollbackPdpServiceResponse rollbackPdpServiceWithOptions(RollbackPdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackPdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments/commands/rollback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackPdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回滚</p>
     * 
     * @param request RollbackPdpServiceRequest
     * @return RollbackPdpServiceResponse
     */
    public RollbackPdpServiceResponse rollbackPdpService(RollbackPdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackPdpServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索资产列表信息</p>
     * 
     * @param tmpReq SearchAssetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAssetsResponse
     */
    public SearchAssetsResponse searchAssetsWithOptions(SearchAssetsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchAssetsShrinkRequest request = new SearchAssetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetIndustrys)) {
            request.assetIndustrysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetIndustrys, "assetIndustrys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetTypes)) {
            request.assetTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetTypes, "assetTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetIndustrysShrink)) {
            query.put("assetIndustrys", request.assetIndustrysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            query.put("assetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetTypesShrink)) {
            query.put("assetTypes", request.assetTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyId)) {
            query.put("companyId", request.companyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets/commands/search-asset"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索资产列表信息</p>
     * 
     * @param request SearchAssetsRequest
     * @return SearchAssetsResponse
     */
    public SearchAssetsResponse searchAssets(SearchAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchAssetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索pbc资产列表信息</p>
     * 
     * @param request SearchPbcAssetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPbcAssetsResponse
     */
    public SearchPbcAssetsResponse searchPbcAssetsWithOptions(SearchPbcAssetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPbcAssets"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/markets/commands/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPbcAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询/搜索pbc资产列表信息</p>
     * 
     * @param request SearchPbcAssetsRequest
     * @return SearchPbcAssetsResponse
     */
    public SearchPbcAssetsResponse searchPbcAssets(SearchPbcAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchPbcAssetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询调用链列表信息</p>
     * 
     * @param request SearchTracesByPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTracesByPageResponse
     */
    public SearchTracesByPageResponse searchTracesByPageWithOptions(SearchTracesByPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("minDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationName)) {
            query.put("operationName", request.operationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroupId)) {
            query.put("serviceGroupId", request.serviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTracesByPage"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/traces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTracesByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询调用链列表信息</p>
     * 
     * @param request SearchTracesByPageRequest
     * @return SearchTracesByPageResponse
     */
    public SearchTracesByPageResponse searchTracesByPage(SearchTracesByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchTracesByPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ARMS告警联系人发送手机号码验证</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTTSVerifyLinkResponse
     */
    public SendTTSVerifyLinkResponse sendTTSVerifyLinkWithOptions(String contactId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTTSVerifyLink"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact/commands/phoneVerify/" + com.aliyun.openapiutil.Client.getEncodeParam(contactId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTTSVerifyLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ARMS告警联系人发送手机号码验证</p>
     * @return SendTTSVerifyLinkResponse
     */
    public SendTTSVerifyLinkResponse sendTTSVerifyLink(String contactId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendTTSVerifyLinkWithOptions(contactId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>订阅pbc</p>
     * 
     * @param request SubscribePbcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscribePbcResponse
     */
    public SubscribePbcResponse subscribePbcWithOptions(String pbcName, SubscribePbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribePbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbcs/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcName) + "/commands/subscribe"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribePbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>订阅pbc</p>
     * 
     * @param request SubscribePbcRequest
     * @return SubscribePbcResponse
     */
    public SubscribePbcResponse subscribePbc(String pbcName, SubscribePbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.subscribePbcWithOptions(pbcName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步组件的模板配置</p>
     * 
     * @param request SyncComponentTemplateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncComponentTemplateConfigResponse
     */
    public SyncComponentTemplateConfigResponse syncComponentTemplateConfigWithOptions(SyncComponentTemplateConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncComponentTemplateConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components/commonds/sync-template-config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncComponentTemplateConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步组件的模板配置</p>
     * 
     * @param request SyncComponentTemplateConfigRequest
     * @return SyncComponentTemplateConfigResponse
     */
    public SyncComponentTemplateConfigResponse syncComponentTemplateConfig(SyncComponentTemplateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncComponentTemplateConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>转移公司</p>
     * 
     * @param request TransferEnterpriseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferEnterpriseResponse
     */
    public TransferEnterpriseResponse transferEnterpriseWithOptions(String enterpriseId, TransferEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + "/commands/transfer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>转移公司</p>
     * 
     * @param request TransferEnterpriseRequest
     * @return TransferEnterpriseResponse
     */
    public TransferEnterpriseResponse transferEnterprise(String enterpriseId, TransferEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferEnterpriseWithOptions(enterpriseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发部署</p>
     * 
     * @param request TriggerDeploymentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerDeploymentResponse
     */
    public TriggerDeploymentResponse triggerDeploymentWithOptions(TriggerDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerDeployment"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/deployments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerDeploymentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>触发部署</p>
     * 
     * @param request TriggerDeploymentRequest
     * @return TriggerDeploymentResponse
     */
    public TriggerDeploymentResponse triggerDeployment(TriggerDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerDeploymentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上架二方包</p>
     * 
     * @param request UpShelfLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpShelfLibraryResponse
     */
    public UpShelfLibraryResponse upShelfLibraryWithOptions(String id, UpShelfLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpShelfLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/up-shelf-library"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpShelfLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上架二方包</p>
     * 
     * @param request UpShelfLibraryRequest
     * @return UpShelfLibraryResponse
     */
    public UpShelfLibraryResponse upShelfLibrary(String id, UpShelfLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upShelfLibraryWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上架pbc版本</p>
     * 
     * @param request UpShelfPbcVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpShelfPbcVersionResponse
     */
    public UpShelfPbcVersionResponse upShelfPbcVersionWithOptions(String id, UpShelfPbcVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marketId)) {
            query.put("marketId", request.marketId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpShelfPbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + "/commands/upShelf"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpShelfPbcVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上架pbc版本</p>
     * 
     * @param request UpShelfPbcVersionRequest
     * @return UpShelfPbcVersionResponse
     */
    public UpShelfPbcVersionResponse upShelfPbcVersion(String id, UpShelfPbcVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upShelfPbcVersionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新组件</p>
     * 
     * @param request UpdateComponentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponentWithOptions(String id, UpdateComponentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComponent"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/components/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新组件</p>
     * 
     * @param request UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponent(String id, UpdateComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComponentWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新组件模板</p>
     * 
     * @param request UpdateComponentTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComponentTemplateResponse
     */
    public UpdateComponentTemplateResponse updateComponentTemplateWithOptions(String id, UpdateComponentTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComponentTemplate"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/component-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComponentTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新组件模板</p>
     * 
     * @param request UpdateComponentTemplateRequest
     * @return UpdateComponentTemplateResponse
     */
    public UpdateComponentTemplateResponse updateComponentTemplate(String id, UpdateComponentTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComponentTemplateWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新开发者信息</p>
     * 
     * @param request UpdateDeveloperRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeveloperResponse
     */
    public UpdateDeveloperResponse updateDeveloperWithOptions(String accountId, UpdateDeveloperRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeveloper"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/developers/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeveloperResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新开发者信息</p>
     * 
     * @param request UpdateDeveloperRequest
     * @return UpdateDeveloperResponse
     */
    public UpdateDeveloperResponse updateDeveloper(String accountId, UpdateDeveloperRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeveloperWithOptions(accountId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新公司信息</p>
     * 
     * @param request UpdateEnterpriseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnterpriseResponse
     */
    public UpdateEnterpriseResponse updateEnterpriseWithOptions(String enterpriseId, UpdateEnterpriseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnterprise"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/enterprises/" + com.aliyun.openapiutil.Client.getEncodeParam(enterpriseId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新公司信息</p>
     * 
     * @param request UpdateEnterpriseRequest
     * @return UpdateEnterpriseResponse
     */
    public UpdateEnterpriseResponse updateEnterprise(String enterpriseId, UpdateEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnterpriseWithOptions(enterpriseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改二方包信息</p>
     * 
     * @param request UpdateLibraryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibraryWithOptions(UpdateLibraryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrary"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改二方包信息</p>
     * 
     * @param request UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    public UpdateLibraryResponse updateLibrary(UpdateLibraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新二方包使用说明文档</p>
     * 
     * @param request UpdateLibraryInstructionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLibraryInstructionResponse
     */
    public UpdateLibraryInstructionResponse updateLibraryInstructionWithOptions(String libraryId, UpdateLibraryInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibraryInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/instructions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibraryInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新二方包使用说明文档</p>
     * 
     * @param request UpdateLibraryInstructionRequest
     * @return UpdateLibraryInstructionResponse
     */
    public UpdateLibraryInstructionResponse updateLibraryInstruction(String libraryId, UpdateLibraryInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibraryInstructionWithOptions(libraryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新二方包规格</p>
     * 
     * @param request UpdateLibrarySchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLibrarySchemaResponse
     */
    public UpdateLibrarySchemaResponse updateLibrarySchemaWithOptions(String libraryId, UpdateLibrarySchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLibrarySchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/librarys/" + com.aliyun.openapiutil.Client.getEncodeParam(libraryId) + "/schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLibrarySchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新二方包规格</p>
     * 
     * @param request UpdateLibrarySchemaRequest
     * @return UpdateLibrarySchemaResponse
     */
    public UpdateLibrarySchemaResponse updateLibrarySchema(String libraryId, UpdateLibrarySchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLibrarySchemaWithOptions(libraryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑应用报警任务</p>
     * 
     * @param request UpdateMonitorArmsAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorArmsAlertResponse
     */
    public UpdateMonitorArmsAlertResponse updateMonitorArmsAlertWithOptions(UpdateMonitorArmsAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorArmsAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/updateMonitorArmsAlert"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorArmsAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑应用报警任务</p>
     * 
     * @param request UpdateMonitorArmsAlertRequest
     * @return UpdateMonitorArmsAlertResponse
     */
    public UpdateMonitorArmsAlertResponse updateMonitorArmsAlert(UpdateMonitorArmsAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorArmsAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人</p>
     * 
     * @param request UpdateMonitorContactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorContactResponse
     */
    public UpdateMonitorContactResponse updateMonitorContactWithOptions(UpdateMonitorContactRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorContact"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/contact"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人</p>
     * 
     * @param request UpdateMonitorContactRequest
     * @return UpdateMonitorContactResponse
     */
    public UpdateMonitorContactResponse updateMonitorContact(UpdateMonitorContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorContactWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人组</p>
     * 
     * @param request UpdateMonitorContactGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorContactGroupResponse
     */
    public UpdateMonitorContactGroupResponse updateMonitorContactGroupWithOptions(UpdateMonitorContactGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorContactGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/group"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人组</p>
     * 
     * @param request UpdateMonitorContactGroupRequest
     * @return UpdateMonitorContactGroupResponse
     */
    public UpdateMonitorContactGroupResponse updateMonitorContactGroup(UpdateMonitorContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorContactGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑MQ报警任务</p>
     * 
     * @param request UpdateMonitorMqAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorMqAlertResponse
     */
    public UpdateMonitorMqAlertResponse updateMonitorMqAlertWithOptions(UpdateMonitorMqAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorMqAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/updateMonitorMqAlert"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorMqAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑MQ报警任务</p>
     * 
     * @param request UpdateMonitorMqAlertRequest
     * @return UpdateMonitorMqAlertResponse
     */
    public UpdateMonitorMqAlertResponse updateMonitorMqAlert(UpdateMonitorMqAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorMqAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑日志报警任务</p>
     * 
     * @param request UpdateMonitorSlsAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorSlsAlertResponse
     */
    public UpdateMonitorSlsAlertResponse updateMonitorSlsAlertWithOptions(UpdateMonitorSlsAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorSlsAlert"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/alert/commands/updateMonitorSlsAlert"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorSlsAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑日志报警任务</p>
     * 
     * @param request UpdateMonitorSlsAlertRequest
     * @return UpdateMonitorSlsAlertResponse
     */
    public UpdateMonitorSlsAlertResponse updateMonitorSlsAlert(UpdateMonitorSlsAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorSlsAlertWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新webhook</p>
     * 
     * @param request UpdateMonitorWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMonitorWebhookResponse
     */
    public UpdateMonitorWebhookResponse updateMonitorWebhookWithOptions(UpdateMonitorWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitorWebhook"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-monitor/v1/monitor/webhook"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新webhook</p>
     * 
     * @param request UpdateMonitorWebhookRequest
     * @return UpdateMonitorWebhookResponse
     */
    public UpdateMonitorWebhookResponse updateMonitorWebhook(UpdateMonitorWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMonitorWebhookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC的api规格</p>
     * 
     * @param request UpdatePbcApiSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePbcApiSchemaResponse
     */
    public UpdatePbcApiSchemaResponse updatePbcApiSchemaWithOptions(String pbcVersionId, UpdatePbcApiSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcApiSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/api-schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcApiSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC的api规格</p>
     * 
     * @param request UpdatePbcApiSchemaRequest
     * @return UpdatePbcApiSchemaResponse
     */
    public UpdatePbcApiSchemaResponse updatePbcApiSchema(String pbcVersionId, UpdatePbcApiSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcApiSchemaWithOptions(pbcVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC使用说明文档</p>
     * 
     * @param request UpdatePbcInstructionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePbcInstructionResponse
     */
    public UpdatePbcInstructionResponse updatePbcInstructionWithOptions(String pbcVersionId, UpdatePbcInstructionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcInstruction"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/instructions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC使用说明文档</p>
     * 
     * @param request UpdatePbcInstructionRequest
     * @return UpdatePbcInstructionResponse
     */
    public UpdatePbcInstructionResponse updatePbcInstruction(String pbcVersionId, UpdatePbcInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcInstructionWithOptions(pbcVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC规格</p>
     * 
     * @param request UpdatePbcSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePbcSchemaResponse
     */
    public UpdatePbcSchemaResponse updatePbcSchemaWithOptions(String pbcVersionId, UpdatePbcSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcSchema"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(pbcVersionId) + "/schemas"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC规格</p>
     * 
     * @param request UpdatePbcSchemaRequest
     * @return UpdatePbcSchemaResponse
     */
    public UpdatePbcSchemaResponse updatePbcSchema(String pbcVersionId, UpdatePbcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcSchemaWithOptions(pbcVersionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC版本</p>
     * 
     * @param request UpdatePbcVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePbcVersionResponse
     */
    public UpdatePbcVersionResponse updatePbcVersionWithOptions(String id, UpdatePbcVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePbcVersion"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/catalog/v1/pbc-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePbcVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新PBC版本</p>
     * 
     * @param request UpdatePbcVersionRequest
     * @return UpdatePbcVersionResponse
     */
    public UpdatePbcVersionResponse updatePbcVersion(String id, UpdatePbcVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePbcVersionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务配置信息</p>
     * 
     * @param request UpdatePdpConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePdpConfigResponse
     */
    public UpdatePdpConfigResponse updatePdpConfigWithOptions(UpdatePdpConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpConfig"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/configs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务配置信息</p>
     * 
     * @param request UpdatePdpConfigRequest
     * @return UpdatePdpConfigResponse
     */
    public UpdatePdpConfigResponse updatePdpConfig(UpdatePdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新泳道</p>
     * 
     * @param request UpdatePdpLaneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePdpLaneResponse
     */
    public UpdatePdpLaneResponse updatePdpLaneWithOptions(String id, UpdatePdpLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpLane"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/lanes/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新泳道</p>
     * 
     * @param request UpdatePdpLaneRequest
     * @return UpdatePdpLaneResponse
     */
    public UpdatePdpLaneResponse updatePdpLane(String id, UpdatePdpLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpLaneWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新PdpPbc</p>
     * 
     * @param request UpdatePdpPbcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePdpPbcResponse
     */
    public UpdatePdpPbcResponse updatePdpPbcWithOptions(UpdatePdpPbcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpPbc"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/pbcs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpPbcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新PdpPbc</p>
     * 
     * @param request UpdatePdpPbcRequest
     * @return UpdatePdpPbcResponse
     */
    public UpdatePdpPbcResponse updatePdpPbc(UpdatePdpPbcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpPbcWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务信息</p>
     * 
     * @param request UpdatePdpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePdpServiceResponse
     */
    public UpdatePdpServiceResponse updatePdpServiceWithOptions(UpdatePdpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpService"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/services"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务信息</p>
     * 
     * @param request UpdatePdpServiceRequest
     * @return UpdatePdpServiceResponse
     */
    public UpdatePdpServiceResponse updatePdpService(UpdatePdpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务分组信息</p>
     * 
     * @param request UpdatePdpServiceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePdpServiceGroupResponse
     */
    public UpdatePdpServiceGroupResponse updatePdpServiceGroupWithOptions(UpdatePdpServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePdpServiceGroup"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-service/v1/groups"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePdpServiceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务分组信息</p>
     * 
     * @param request UpdatePdpServiceGroupRequest
     * @return UpdatePdpServiceGroupResponse
     */
    public UpdatePdpServiceGroupResponse updatePdpServiceGroup(UpdatePdpServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdpServiceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品</p>
     * 
     * @param request UpdateProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-pbc/v1/products"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新产品</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源</p>
     * 
     * @param request UpdateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResourceWithOptions(String id, UpdateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pdp-resource/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源</p>
     * 
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(String id, UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色信息</p>
     * 
     * @param request UpdateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRoleWithOptions(String roleId, UpdateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/roles/role-id/" + com.aliyun.openapiutil.Client.getEncodeParam(roleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色信息</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(String roleId, UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(roleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新申请记录</p>
     * 
     * @param request UpdateSettledRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSettledResponse
     */
    public UpdateSettledResponse updateSettledWithOptions(String id, UpdateSettledRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSettled"),
            new TeaPair("version", "2021-11-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/manager/v1/settleds/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSettledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新申请记录</p>
     * 
     * @param request UpdateSettledRequest
     * @return UpdateSettledResponse
     */
    public UpdateSettledResponse updateSettled(String id, UpdateSettledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSettledWithOptions(id, request, headers, runtime);
    }
}
