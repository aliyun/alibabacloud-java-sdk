// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901;

import com.aliyun.tea.*;
import com.aliyun.servicecatalog20210901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("servicecatalog", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Reviews a plan.</p>
     * 
     * @param request ApproveProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveProvisionedProductPlanResponse
     */
    public ApproveProvisionedProductPlanResponse approveProvisionedProductPlanWithOptions(ApproveProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalAction)) {
            body.put("ApprovalAction", request.approvalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reviews a plan.</p>
     * 
     * @param request ApproveProvisionedProductPlanRequest
     * @return ApproveProvisionedProductPlanResponse
     */
    public ApproveProvisionedProductPlanResponse approveProvisionedProductPlan(ApproveProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将产品组合授权给某个RAM实体</p>
     * 
     * @param request AssociatePrincipalWithPortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociatePrincipalWithPortfolioResponse
     */
    public AssociatePrincipalWithPortfolioResponse associatePrincipalWithPortfolioWithOptions(AssociatePrincipalWithPortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            body.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociatePrincipalWithPortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociatePrincipalWithPortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将产品组合授权给某个RAM实体</p>
     * 
     * @param request AssociatePrincipalWithPortfolioRequest
     * @return AssociatePrincipalWithPortfolioResponse
     */
    public AssociatePrincipalWithPortfolioResponse associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associatePrincipalWithPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a product to a product portfolio.</p>
     * 
     * @param request AssociateProductWithPortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateProductWithPortfolioResponse
     */
    public AssociateProductWithPortfolioResponse associateProductWithPortfolioWithOptions(AssociateProductWithPortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateProductWithPortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateProductWithPortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a product to a product portfolio.</p>
     * 
     * @param request AssociateProductWithPortfolioRequest
     * @return AssociateProductWithPortfolioResponse
     */
    public AssociateProductWithPortfolioResponse associateProductWithPortfolio(AssociateProductWithPortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateProductWithPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates the tag option with a resource.</p>
     * 
     * @param request AssociateTagOptionWithResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateTagOptionWithResourceResponse
     */
    public AssociateTagOptionWithResourceResponse associateTagOptionWithResourceWithOptions(AssociateTagOptionWithResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOptionId)) {
            body.put("TagOptionId", request.tagOptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateTagOptionWithResource"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTagOptionWithResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates the tag option with a resource.</p>
     * 
     * @param request AssociateTagOptionWithResourceRequest
     * @return AssociateTagOptionWithResourceResponse
     */
    public AssociateTagOptionWithResourceResponse associateTagOptionWithResource(AssociateTagOptionWithResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateTagOptionWithResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a plan.</p>
     * 
     * @param request CancelProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelProvisionedProductPlanResponse
     */
    public CancelProvisionedProductPlanResponse cancelProvisionedProductPlanWithOptions(CancelProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a plan.</p>
     * 
     * @param request CancelProvisionedProductPlanRequest
     * @return CancelProvisionedProductPlanResponse
     */
    public CancelProvisionedProductPlanResponse cancelProvisionedProductPlan(CancelProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Replicates a product.</p>
     * 
     * @param request CopyProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyProductResponse
     */
    public CopyProductResponse copyProductWithOptions(CopyProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceProductArn)) {
            body.put("SourceProductArn", request.sourceProductArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProductName)) {
            body.put("TargetProductName", request.targetProductName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Replicates a product.</p>
     * 
     * @param request CopyProductRequest
     * @return CopyProductResponse
     */
    public CopyProductResponse copyProduct(CopyProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a constraint.</p>
     * 
     * @param request CreateConstraintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConstraintResponse
     */
    public CreateConstraintResponse createConstraintWithOptions(CreateConstraintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraintType)) {
            body.put("ConstraintType", request.constraintType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConstraint"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConstraintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a constraint.</p>
     * 
     * @param request CreateConstraintRequest
     * @return CreateConstraintResponse
     */
    public CreateConstraintResponse createConstraint(CreateConstraintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConstraintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a product portfolio.</p>
     * 
     * @param request CreatePortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePortfolioResponse
     */
    public CreatePortfolioResponse createPortfolioWithOptions(CreatePortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioName)) {
            body.put("PortfolioName", request.portfolioName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a product portfolio.</p>
     * 
     * @param request CreatePortfolioRequest
     * @return CreatePortfolioResponse
     */
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProduct operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a product.</p>
     * 
     * @param tmpReq CreateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProductShrinkRequest request = new CreateProductShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productVersionParameters)) {
            request.productVersionParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productVersionParameters, "ProductVersionParameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionParametersShrink)) {
            body.put("ProductVersionParameters", request.productVersionParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProduct operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a product.</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProductVersion operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a product version.</p>
     * 
     * @param request CreateProductVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductVersionResponse
     */
    public CreateProductVersionResponse createProductVersionWithOptions(CreateProductVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            body.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guidance)) {
            body.put("Guidance", request.guidance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionName)) {
            body.put("ProductVersionName", request.productVersionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateUrl)) {
            body.put("TemplateUrl", request.templateUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductVersion"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProductVersion operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a product version.</p>
     * 
     * @param request CreateProductVersionRequest
     * @return CreateProductVersionResponse
     */
    public CreateProductVersionResponse createProductVersion(CreateProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProductVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a plan.</p>
     * 
     * @param request CreateProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProvisionedProductPlanResponse
     */
    public CreateProvisionedProductPlanResponse createProvisionedProductPlanWithOptions(CreateProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            body.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planType)) {
            body.put("PlanType", request.planType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductName)) {
            body.put("ProvisionedProductName", request.provisionedProductName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackRegionId)) {
            body.put("StackRegionId", request.stackRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a plan.</p>
     * 
     * @param request CreateProvisionedProductPlanRequest
     * @return CreateProvisionedProductPlanResponse
     */
    public CreateProvisionedProductPlanResponse createProvisionedProductPlan(CreateProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a tag option.</p>
     * 
     * @param request CreateTagOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagOptionResponse
     */
    public CreateTagOptionResponse createTagOptionWithOptions(CreateTagOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTagOption"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagOptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a tag option.</p>
     * 
     * @param request CreateTagOptionRequest
     * @return CreateTagOptionResponse
     */
    public CreateTagOptionResponse createTagOption(CreateTagOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagOptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template. Service Catalog saves the template based on the parameters that you specify and returns the URL of the template.</p>
     * 
     * @param request CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateBody)) {
            body.put("TemplateBody", request.templateBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terraformVariables)) {
            body.put("TerraformVariables", request.terraformVariables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2021-09-01"),
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
     * <p>Creates a template. Service Catalog saves the template based on the parameters that you specify and returns the URL of the template.</p>
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
     * <p>Deletes a constraint.</p>
     * 
     * @param request DeleteConstraintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConstraintResponse
     */
    public DeleteConstraintResponse deleteConstraintWithOptions(DeleteConstraintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.constraintId)) {
            body.put("ConstraintId", request.constraintId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConstraint"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConstraintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a constraint.</p>
     * 
     * @param request DeleteConstraintRequest
     * @return DeleteConstraintResponse
     */
    public DeleteConstraintResponse deleteConstraint(DeleteConstraintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConstraintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product portfolio.</p>
     * 
     * @param request DeletePortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePortfolioResponse
     */
    public DeletePortfolioResponse deletePortfolioWithOptions(DeletePortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product portfolio.</p>
     * 
     * @param request DeletePortfolioRequest
     * @return DeletePortfolioResponse
     */
    public DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product.</p>
     * 
     * @param request DeleteProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product.</p>
     * 
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product version.</p>
     * 
     * @param request DeleteProductVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductVersionResponse
     */
    public DeleteProductVersionResponse deleteProductVersionWithOptions(DeleteProductVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductVersion"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a product version.</p>
     * 
     * @param request DeleteProductVersionRequest
     * @return DeleteProductVersionResponse
     */
    public DeleteProductVersionResponse deleteProductVersion(DeleteProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProductVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a plan.</p>
     * 
     * @param request DeleteProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProvisionedProductPlanResponse
     */
    public DeleteProvisionedProductPlanResponse deleteProvisionedProductPlanWithOptions(DeleteProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a plan.</p>
     * 
     * @param request DeleteProvisionedProductPlanRequest
     * @return DeleteProvisionedProductPlanResponse
     */
    public DeleteProvisionedProductPlanResponse deleteProvisionedProductPlan(DeleteProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a tag option.</p>
     * 
     * @param request DeleteTagOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagOptionResponse
     */
    public DeleteTagOptionResponse deleteTagOptionWithOptions(DeleteTagOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagOptionId)) {
            body.put("TagOptionId", request.tagOptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTagOption"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagOptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a tag option.</p>
     * 
     * @param request DeleteTagOptionRequest
     * @return DeleteTagOptionResponse
     */
    public DeleteTagOptionResponse deleteTagOption(DeleteTagOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagOptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a tag option from a resource.</p>
     * 
     * @param request DisAssociateTagOptionFromResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisAssociateTagOptionFromResourceResponse
     */
    public DisAssociateTagOptionFromResourceResponse disAssociateTagOptionFromResourceWithOptions(DisAssociateTagOptionFromResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOptionId)) {
            body.put("TagOptionId", request.tagOptionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisAssociateTagOptionFromResource"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisAssociateTagOptionFromResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a tag option from a resource.</p>
     * 
     * @param request DisAssociateTagOptionFromResourceRequest
     * @return DisAssociateTagOptionFromResourceResponse
     */
    public DisAssociateTagOptionFromResourceResponse disAssociateTagOptionFromResource(DisAssociateTagOptionFromResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disAssociateTagOptionFromResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access a product portfolio.</p>
     * 
     * @param request DisassociatePrincipalFromPortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociatePrincipalFromPortfolioResponse
     */
    public DisassociatePrincipalFromPortfolioResponse disassociatePrincipalFromPortfolioWithOptions(DisassociatePrincipalFromPortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            body.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociatePrincipalFromPortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociatePrincipalFromPortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access a product portfolio.</p>
     * 
     * @param request DisassociatePrincipalFromPortfolioRequest
     * @return DisassociatePrincipalFromPortfolioResponse
     */
    public DisassociatePrincipalFromPortfolioResponse disassociatePrincipalFromPortfolio(DisassociatePrincipalFromPortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociatePrincipalFromPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a product from the product portfolio.</p>
     * 
     * @param request DisassociateProductFromPortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateProductFromPortfolioResponse
     */
    public DisassociateProductFromPortfolioResponse disassociateProductFromPortfolioWithOptions(DisassociateProductFromPortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateProductFromPortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateProductFromPortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a product from the product portfolio.</p>
     * 
     * @param request DisassociateProductFromPortfolioRequest
     * @return DisassociateProductFromPortfolioResponse
     */
    public DisassociateProductFromPortfolioResponse disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateProductFromPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a plan.</p>
     * 
     * @param request ExecuteProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteProvisionedProductPlanResponse
     */
    public ExecuteProvisionedProductPlanResponse executeProvisionedProductPlanWithOptions(ExecuteProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a plan.</p>
     * 
     * @param request ExecuteProvisionedProductPlanRequest
     * @return ExecuteProvisionedProductPlanResponse
     */
    public ExecuteProvisionedProductPlanResponse executeProvisionedProductPlan(ExecuteProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a constraint.</p>
     * 
     * @param request GetConstraintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConstraintResponse
     */
    public GetConstraintResponse getConstraintWithOptions(GetConstraintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.constraintId)) {
            query.put("ConstraintId", request.constraintId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConstraint"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConstraintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a constraint.</p>
     * 
     * @param request GetConstraintRequest
     * @return GetConstraintResponse
     */
    public GetConstraintResponse getConstraint(GetConstraintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConstraintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product portfolio.</p>
     * 
     * @param request GetPortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPortfolioResponse
     */
    public GetPortfolioResponse getPortfolioWithOptions(GetPortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            query.put("PortfolioId", request.portfolioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product portfolio.</p>
     * 
     * @param request GetPortfolioRequest
     * @return GetPortfolioResponse
     */
    public GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product as the administrator.</p>
     * 
     * @param request GetProductAsAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductAsAdminResponse
     */
    public GetProductAsAdminResponse getProductAsAdminWithOptions(GetProductAsAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductAsAdmin"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductAsAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product as the administrator.</p>
     * 
     * @param request GetProductAsAdminRequest
     * @return GetProductAsAdminResponse
     */
    public GetProductAsAdminResponse getProductAsAdmin(GetProductAsAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductAsAdminWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a product as a user.</p>
     * 
     * @param request GetProductAsEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductAsEndUserResponse
     */
    public GetProductAsEndUserResponse getProductAsEndUserWithOptions(GetProductAsEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductAsEndUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductAsEndUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a product as a user.</p>
     * 
     * @param request GetProductAsEndUserRequest
     * @return GetProductAsEndUserResponse
     */
    public GetProductAsEndUserResponse getProductAsEndUser(GetProductAsEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductAsEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a product version.</p>
     * 
     * @param request GetProductVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductVersionResponse
     */
    public GetProductVersionResponse getProductVersionWithOptions(GetProductVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            query.put("ProductVersionId", request.productVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductVersion"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProductVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a product version.</p>
     * 
     * @param request GetProductVersionRequest
     * @return GetProductVersionResponse
     */
    public GetProductVersionResponse getProductVersion(GetProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product instance.</p>
     * 
     * @param request GetProvisionedProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProvisionedProductResponse
     */
    public GetProvisionedProductResponse getProvisionedProductWithOptions(GetProvisionedProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductId)) {
            query.put("ProvisionedProductId", request.provisionedProductId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProvisionedProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProvisionedProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a product instance.</p>
     * 
     * @param request GetProvisionedProductRequest
     * @return GetProvisionedProductResponse
     */
    public GetProvisionedProductResponse getProvisionedProduct(GetProvisionedProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProvisionedProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a plan.</p>
     * 
     * @param request GetProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProvisionedProductPlanResponse
     */
    public GetProvisionedProductPlanResponse getProvisionedProductPlanWithOptions(GetProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a plan.</p>
     * 
     * @param request GetProvisionedProductPlanRequest
     * @return GetProvisionedProductPlanResponse
     */
    public GetProvisionedProductPlanResponse getProvisionedProductPlan(GetProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a tag option.</p>
     * 
     * @param request GetTagOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTagOptionResponse
     */
    public GetTagOptionResponse getTagOptionWithOptions(GetTagOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTagOption"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTagOptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a tag option.</p>
     * 
     * @param request GetTagOptionRequest
     * @return GetTagOptionResponse
     */
    public GetTagOptionResponse getTagOption(GetTagOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTagOptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a task.</p>
     * 
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a task.</p>
     * 
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a template.</p>
     * 
     * @param request GetTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            query.put("ProductVersionId", request.productVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a template.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Launches a product.</p>
     * 
     * @param request LaunchProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchProductResponse
     */
    public LaunchProductResponse launchProductWithOptions(LaunchProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductName)) {
            body.put("ProvisionedProductName", request.provisionedProductName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stackRegionId)) {
            body.put("StackRegionId", request.stackRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Launches a product.</p>
     * 
     * @param request LaunchProductRequest
     * @return LaunchProductResponse
     */
    public LaunchProductResponse launchProduct(LaunchProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries launch options.</p>
     * 
     * @param request ListLaunchOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLaunchOptionsResponse
     */
    public ListLaunchOptionsResponse listLaunchOptionsWithOptions(ListLaunchOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLaunchOptions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLaunchOptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries launch options.</p>
     * 
     * @param request ListLaunchOptionsRequest
     * @return ListLaunchOptionsResponse
     */
    public ListLaunchOptionsResponse listLaunchOptions(ListLaunchOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLaunchOptionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The number of entries returned per page.</p>
     * 
     * @param request ListPortfoliosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPortfoliosResponse
     */
    public ListPortfoliosResponse listPortfoliosWithOptions(ListPortfoliosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPortfolios"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPortfoliosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The number of entries returned per page.</p>
     * 
     * @param request ListPortfoliosRequest
     * @return ListPortfoliosResponse
     */
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPortfoliosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Resource Access Management (RAM) users and RAM roles that are granted the permissions to access a product portfolio.</p>
     * 
     * @param request ListPrincipalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrincipalsResponse
     */
    public ListPrincipalsResponse listPrincipalsWithOptions(ListPrincipalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            query.put("PortfolioId", request.portfolioId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrincipals"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrincipalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Resource Access Management (RAM) users and RAM roles that are granted the permissions to access a product portfolio.</p>
     * 
     * @param request ListPrincipalsRequest
     * @return ListPrincipalsResponse
     */
    public ListPrincipalsResponse listPrincipals(ListPrincipalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrincipalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a product.</p>
     * 
     * @param request ListProductVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductVersionsResponse
     */
    public ListProductVersionsResponse listProductVersionsWithOptions(ListProductVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductVersions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a product.</p>
     * 
     * @param request ListProductVersionsRequest
     * @return ListProductVersionsResponse
     */
    public ListProductVersionsResponse listProductVersions(ListProductVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries products as an administrator.</p>
     * 
     * @param request ListProductsAsAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsAsAdminResponse
     */
    public ListProductsAsAdminResponse listProductsAsAdminWithOptions(ListProductsAsAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            query.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductsAsAdmin"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsAsAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries products as an administrator.</p>
     * 
     * @param request ListProductsAsAdminRequest
     * @return ListProductsAsAdminResponse
     */
    public ListProductsAsAdminResponse listProductsAsAdmin(ListProductsAsAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsAsAdminWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries products as a user.</p>
     * 
     * @param request ListProductsAsEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsAsEndUserResponse
     */
    public ListProductsAsEndUserResponse listProductsAsEndUserWithOptions(ListProductsAsEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductsAsEndUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsAsEndUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries products as a user.</p>
     * 
     * @param request ListProductsAsEndUserRequest
     * @return ListProductsAsEndUserResponse
     */
    public ListProductsAsEndUserResponse listProductsAsEndUser(ListProductsAsEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductsAsEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of plan reviewers.</p>
     * 
     * @param request ListProvisionedProductPlanApproversRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProvisionedProductPlanApproversResponse
     */
    public ListProvisionedProductPlanApproversResponse listProvisionedProductPlanApproversWithOptions(ListProvisionedProductPlanApproversRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProvisionedProductPlanApprovers"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProvisionedProductPlanApproversResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of plan reviewers.</p>
     * 
     * @param request ListProvisionedProductPlanApproversRequest
     * @return ListProvisionedProductPlanApproversResponse
     */
    public ListProvisionedProductPlanApproversResponse listProvisionedProductPlanApprovers(ListProvisionedProductPlanApproversRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProvisionedProductPlanApproversWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of plans. You can query plans from the end user dimension or from the review dimension.</p>
     * 
     * @param request ListProvisionedProductPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProvisionedProductPlansResponse
     */
    public ListProvisionedProductPlansResponse listProvisionedProductPlansWithOptions(ListProvisionedProductPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevelFilter)) {
            query.put("AccessLevelFilter", request.accessLevelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalFilter)) {
            query.put("ApprovalFilter", request.approvalFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductId)) {
            query.put("ProvisionedProductId", request.provisionedProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProvisionedProductPlans"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProvisionedProductPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of plans. You can query plans from the end user dimension or from the review dimension.</p>
     * 
     * @param request ListProvisionedProductPlansRequest
     * @return ListProvisionedProductPlansResponse
     */
    public ListProvisionedProductPlansResponse listProvisionedProductPlans(ListProvisionedProductPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProvisionedProductPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries product instances.</p>
     * 
     * @param request ListProvisionedProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProvisionedProductsResponse
     */
    public ListProvisionedProductsResponse listProvisionedProductsWithOptions(ListProvisionedProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevelFilter)) {
            query.put("AccessLevelFilter", request.accessLevelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProvisionedProducts"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProvisionedProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries product instances.</p>
     * 
     * @param request ListProvisionedProductsRequest
     * @return ListProvisionedProductsResponse
     */
    public ListProvisionedProductsResponse listProvisionedProducts(ListProvisionedProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProvisionedProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with a tag option.</p>
     * 
     * @param request ListResourcesForTagOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesForTagOptionResponse
     */
    public ListResourcesForTagOptionResponse listResourcesForTagOptionWithOptions(ListResourcesForTagOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourcesForTagOption"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesForTagOptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with a tag option.</p>
     * 
     * @param request ListResourcesForTagOptionRequest
     * @return ListResourcesForTagOptionResponse
     */
    public ListResourcesForTagOptionResponse listResourcesForTagOption(ListResourcesForTagOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcesForTagOptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tag options.</p>
     * 
     * @param tmpReq ListTagOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagOptionsResponse
     */
    public ListTagOptionsResponse listTagOptionsWithOptions(ListTagOptionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagOptionsShrinkRequest request = new ListTagOptionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagOptions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagOptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tag options.</p>
     * 
     * @param request ListTagOptionsRequest
     * @return ListTagOptionsResponse
     */
    public ListTagOptionsResponse listTagOptions(ListTagOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagOptionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The page number of the returned page.</p>
     * 
     * @param request ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductId)) {
            query.put("ProvisionedProductId", request.provisionedProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The page number of the returned page.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a product instance is terminated, the product instance is deleted from the product instance list. End users cannot manage the product instance throughout its lifecycle. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Terminates a product instance.</p>
     * 
     * @param request TerminateProvisionedProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateProvisionedProductResponse
     */
    public TerminateProvisionedProductResponse terminateProvisionedProductWithOptions(TerminateProvisionedProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductId)) {
            body.put("ProvisionedProductId", request.provisionedProductId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateProvisionedProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateProvisionedProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a product instance is terminated, the product instance is deleted from the product instance list. End users cannot manage the product instance throughout its lifecycle. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Terminates a product instance.</p>
     * 
     * @param request TerminateProvisionedProductRequest
     * @return TerminateProvisionedProductResponse
     */
    public TerminateProvisionedProductResponse terminateProvisionedProduct(TerminateProvisionedProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateProvisionedProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a constraint.</p>
     * 
     * @param request UpdateConstraintRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConstraintResponse
     */
    public UpdateConstraintResponse updateConstraintWithOptions(UpdateConstraintRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraintId)) {
            body.put("ConstraintId", request.constraintId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConstraint"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConstraintResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a constraint.</p>
     * 
     * @param request UpdateConstraintRequest
     * @return UpdateConstraintResponse
     */
    public UpdateConstraintResponse updateConstraint(UpdateConstraintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConstraintWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the product portfolio.</p>
     * 
     * @param request UpdatePortfolioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePortfolioResponse
     */
    public UpdatePortfolioResponse updatePortfolioWithOptions(UpdatePortfolioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioName)) {
            body.put("PortfolioName", request.portfolioName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePortfolio"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePortfolioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the product portfolio.</p>
     * 
     * @param request UpdatePortfolioRequest
     * @return UpdatePortfolioResponse
     */
    public UpdatePortfolioResponse updatePortfolio(UpdatePortfolioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePortfolioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the product.</p>
     * 
     * @param request UpdateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the product.</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a product version.</p>
     * 
     * @param request UpdateProductVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductVersionResponse
     */
    public UpdateProductVersionResponse updateProductVersionWithOptions(UpdateProductVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            body.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guidance)) {
            body.put("Guidance", request.guidance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionName)) {
            body.put("ProductVersionName", request.productVersionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductVersion"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a product version.</p>
     * 
     * @param request UpdateProductVersionRequest
     * @return UpdateProductVersionResponse
     */
    public UpdateProductVersionResponse updateProductVersion(UpdateProductVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a product instance.</p>
     * 
     * @param request UpdateProvisionedProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProvisionedProductResponse
     */
    public UpdateProvisionedProductResponse updateProvisionedProductWithOptions(UpdateProvisionedProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedProductId)) {
            body.put("ProvisionedProductId", request.provisionedProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProvisionedProduct"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProvisionedProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a product instance.</p>
     * 
     * @param request UpdateProvisionedProductRequest
     * @return UpdateProvisionedProductResponse
     */
    public UpdateProvisionedProductResponse updateProvisionedProduct(UpdateProvisionedProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProvisionedProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a plan.</p>
     * 
     * @param request UpdateProvisionedProductPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProvisionedProductPlanResponse
     */
    public UpdateProvisionedProductPlanResponse updateProvisionedProductPlanWithOptions(UpdateProvisionedProductPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portfolioId)) {
            body.put("PortfolioId", request.portfolioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersionId)) {
            body.put("ProductVersionId", request.productVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProvisionedProductPlan"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProvisionedProductPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a plan.</p>
     * 
     * @param request UpdateProvisionedProductPlanRequest
     * @return UpdateProvisionedProductPlanResponse
     */
    public UpdateProvisionedProductPlanResponse updateProvisionedProductPlan(UpdateProvisionedProductPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProvisionedProductPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tag option.</p>
     * 
     * @param request UpdateTagOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTagOptionResponse
     */
    public UpdateTagOptionResponse updateTagOptionWithOptions(UpdateTagOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            body.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOptionId)) {
            body.put("TagOptionId", request.tagOptionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTagOption"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTagOptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the tag option.</p>
     * 
     * @param request UpdateTagOptionRequest
     * @return UpdateTagOptionResponse
     */
    public UpdateTagOptionResponse updateTagOption(UpdateTagOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTagOptionWithOptions(request, runtime);
    }
}
