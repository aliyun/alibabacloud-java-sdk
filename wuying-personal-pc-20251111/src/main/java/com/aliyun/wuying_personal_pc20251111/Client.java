// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111;

import com.aliyun.tea.*;
import com.aliyun.wuying_personal_pc20251111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wuying-personal-pc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建桌面镜像</p>
     * 
     * @param tmpReq CreateDesktopImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDesktopImageResponse
     */
    public CreateDesktopImageResponse createDesktopImageWithOptions(CreateDesktopImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDesktopImageShrinkRequest request = new CreateDesktopImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startUpFilePathList)) {
            request.startUpFilePathListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startUpFilePathList, "StartUpFilePathList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCleanUserData)) {
            query.put("AutoCleanUserData", request.autoCleanUserData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStartUpConfig)) {
            query.put("EnableStartUpConfig", request.enableStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startUpFilePathListShrink)) {
            query.put("StartUpFilePathList", request.startUpFilePathListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktopImage"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new CreateDesktopImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建桌面镜像</p>
     * 
     * @param request CreateDesktopImageRequest
     * @return CreateDesktopImageResponse
     */
    public CreateDesktopImageResponse createDesktopImage(CreateDesktopImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDesktopImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下单套餐包和核时包</p>
     * 
     * @param tmpReq CreateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrderShrinkRequest request = new CreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dynamicProductParams)) {
            request.dynamicProductParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dynamicProductParams, "DynamicProductParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicProductParamsShrink)) {
            query.put("DynamicProductParams", request.dynamicProductParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFrom)) {
            query.put("OrderFrom", request.orderFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new CreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下单套餐包和核时包</p>
     * 
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云桌面</p>
     * 
     * @param request DeleteDesktopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDesktopResponse
     */
    public DeleteDesktopResponse deleteDesktopWithOptions(DeleteDesktopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktop"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DeleteDesktopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云桌面</p>
     * 
     * @param request DeleteDesktopRequest
     * @return DeleteDesktopResponse
     */
    public DeleteDesktopResponse deleteDesktop(DeleteDesktopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDesktopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除桌面镜像</p>
     * 
     * @param request DeleteDesktopImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDesktopImageResponse
     */
    public DeleteDesktopImageResponse deleteDesktopImageWithOptions(DeleteDesktopImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCleanImageCode)) {
            query.put("IsCleanImageCode", request.isCleanImageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktopImage"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DeleteDesktopImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除桌面镜像</p>
     * 
     * @param request DeleteDesktopImageRequest
     * @return DeleteDesktopImageResponse
     */
    public DeleteDesktopImageResponse deleteDesktopImage(DeleteDesktopImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDesktopImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户可变更的镜像</p>
     * 
     * @param request DescribeAccessibleImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessibleImagesResponse
     */
    public DescribeAccessibleImagesResponse describeAccessibleImagesWithOptions(DescribeAccessibleImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizSource)) {
            query.put("BizSource", request.bizSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessibleImages"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DescribeAccessibleImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户可变更的镜像</p>
     * 
     * @param request DescribeAccessibleImagesRequest
     * @return DescribeAccessibleImagesResponse
     */
    public DescribeAccessibleImagesResponse describeAccessibleImages(DescribeAccessibleImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessibleImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询核时包包列表</p>
     * 
     * @param request DescribeCorePackageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCorePackageListResponse
     */
    public DescribeCorePackageListResponse describeCorePackageListWithOptions(DescribeCorePackageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDeductionInstances)) {
            query.put("QueryDeductionInstances", request.queryDeductionInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryScenario)) {
            query.put("QueryScenario", request.queryScenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCorePackageList"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DescribeCorePackageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询核时包包列表</p>
     * 
     * @param request DescribeCorePackageListRequest
     * @return DescribeCorePackageListResponse
     */
    public DescribeCorePackageListResponse describeCorePackageList(DescribeCorePackageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCorePackageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>软终端分tab查询云桌面列表 &amp; 组织信息</p>
     * 
     * @param request DescribeDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopsResponse
     */
    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayType)) {
            query.put("DisplayType", request.displayType);
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
            new TeaPair("action", "DescribeDesktops"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DescribeDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>软终端分tab查询云桌面列表 &amp; 组织信息</p>
     * 
     * @param request DescribeDesktopsRequest
     * @return DescribeDesktopsResponse
     */
    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据分享码查询镜像</p>
     * 
     * @param request DescribeImageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageDetailResponse
     */
    public DescribeImageDetailResponse describeImageDetailWithOptions(DescribeImageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareCode)) {
            query.put("ShareCode", request.shareCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageDetail"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DescribeImageDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据分享码查询镜像</p>
     * 
     * @param request DescribeImageDetailRequest
     * @return DescribeImageDetailResponse
     */
    public DescribeImageDetailResponse describeImageDetail(DescribeImageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询套餐包订单列表</p>
     * 
     * @param tmpReq DescribePackageOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackageOrdersResponse
     */
    public DescribePackageOrdersResponse describePackageOrdersWithOptions(DescribePackageOrdersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePackageOrdersShrinkRequest request = new DescribePackageOrdersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.desktopIdList)) {
            request.desktopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.desktopIdList, "DesktopIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderIdList)) {
            request.orderIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderIdList, "OrderIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderStatusList)) {
            request.orderStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderStatusList, "OrderStatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productTypeList)) {
            request.productTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productTypeList, "ProductTypeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIdList)) {
            request.resourceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIdList, "ResourceIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIdListShrink)) {
            query.put("DesktopIdList", request.desktopIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderIdListShrink)) {
            query.put("OrderIdList", request.orderIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatusListShrink)) {
            query.put("OrderStatusList", request.orderStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTypeListShrink)) {
            query.put("ProductTypeList", request.productTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdListShrink)) {
            query.put("ResourceIdList", request.resourceIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackageOrders"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new DescribePackageOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询套餐包订单列表</p>
     * 
     * @param request DescribePackageOrdersRequest
     * @return DescribePackageOrdersResponse
     */
    public DescribePackageOrdersResponse describePackageOrders(DescribePackageOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackageOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成无影工作站的场景url</p>
     * 
     * @param request GenerateWuyingServerSceneUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateWuyingServerSceneUrlResponse
     */
    public GenerateWuyingServerSceneUrlResponse generateWuyingServerSceneUrlWithOptions(GenerateWuyingServerSceneUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateWuyingServerSceneUrl"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new GenerateWuyingServerSceneUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成无影工作站的场景url</p>
     * 
     * @param request GenerateWuyingServerSceneUrlRequest
     * @return GenerateWuyingServerSceneUrlResponse
     */
    public GenerateWuyingServerSceneUrlResponse generateWuyingServerSceneUrl(GenerateWuyingServerSceneUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateWuyingServerSceneUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询展示商品列表</p>
     * 
     * @param request GetProductListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProductListResponse
     */
    public GetProductListResponse getProductListWithOptions(GetProductListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configVersion)) {
            query.put("ConfigVersion", request.configVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProductList"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new GetProductListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询展示商品列表</p>
     * 
     * @param request GetProductListRequest
     * @return GetProductListResponse
     */
    public GetProductListResponse getProductList(GetProductListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProductListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户信息</p>
     * 
     * @param request GetUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new GetUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户信息</p>
     * 
     * @param request GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开机</p>
     * 
     * @param request StartDesktopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDesktopResponse
     */
    public StartDesktopResponse startDesktopWithOptions(StartDesktopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDesktop"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new StartDesktopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开机</p>
     * 
     * @param request StartDesktopRequest
     * @return StartDesktopResponse
     */
    public StartDesktopResponse startDesktop(StartDesktopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDesktopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关机</p>
     * 
     * @param request StopDesktopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDesktopResponse
     */
    public StopDesktopResponse stopDesktopWithOptions(StopDesktopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDesktop"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new StopDesktopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关机</p>
     * 
     * @param request StopDesktopRequest
     * @return StopDesktopResponse
     */
    public StopDesktopResponse stopDesktop(StopDesktopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDesktopWithOptions(request, runtime);
    }
}
