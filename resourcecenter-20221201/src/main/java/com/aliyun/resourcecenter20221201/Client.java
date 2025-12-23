// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201;

import com.aliyun.tea.*;
import com.aliyun.resourcecenter20221201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resourcecenter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Sets a default filter.</p>
     * 
     * @param request AssociateDefaultFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateDefaultFilterResponse
     */
    public AssociateDefaultFilterResponse associateDefaultFilterWithOptions(AssociateDefaultFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterName)) {
            query.put("FilterName", request.filterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateDefaultFilter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateDefaultFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a default filter.</p>
     * 
     * @param request AssociateDefaultFilterRequest
     * @return AssociateDefaultFilterResponse
     */
    public AssociateDefaultFilterResponse associateDefaultFilter(AssociateDefaultFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateDefaultFilterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the ResourceSnapshotDelivery.CustomExpression parameter empty.</li>
     * <li>Custom delivery: Set the ResourceSnapshotDelivery.CustomExpression parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a single-account delivery channel.</p>
     * 
     * @param request CreateDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeliveryChannelResponse
     */
    public CreateDeliveryChannelResponse createDeliveryChannelWithOptions(CreateDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelDescription)) {
            query.put("DeliveryChannelDescription", request.deliveryChannelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelFilter)) {
            query.put("DeliveryChannelFilter", request.deliveryChannelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceChangeDelivery)) {
            query.put("ResourceChangeDelivery", request.resourceChangeDelivery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSnapshotDelivery)) {
            query.put("ResourceSnapshotDelivery", request.resourceSnapshotDelivery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the ResourceSnapshotDelivery.CustomExpression parameter empty.</li>
     * <li>Custom delivery: Set the ResourceSnapshotDelivery.CustomExpression parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a single-account delivery channel.</p>
     * 
     * @param request CreateDeliveryChannelRequest
     * @return CreateDeliveryChannelResponse
     */
    public CreateDeliveryChannelResponse createDeliveryChannel(CreateDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a filter.</p>
     * 
     * @param request CreateFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFilterResponse
     */
    public CreateFilterResponse createFilterWithOptions(CreateFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterConfiguration)) {
            query.put("FilterConfiguration", request.filterConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterName)) {
            query.put("FilterName", request.filterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFilter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a filter.</p>
     * 
     * @param request CreateFilterRequest
     * @return CreateFilterResponse
     */
    public CreateFilterResponse createFilter(CreateFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFilterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In Resource Center, you can create multi-account delivery channels by using the management account of your resource directory or the delegated administrator account of Resource Center to deliver resource configuration change events and scheduled resource snapshots within the members in your resource directory to Object Storage Service (OSS) or Simple Log Service. Then, other Alibaba Cloud services consume standardized resource information from OSS or Simple Log Service.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multi-account delivery channel.</p>
     * 
     * @param request CreateMultiAccountDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMultiAccountDeliveryChannelResponse
     */
    public CreateMultiAccountDeliveryChannelResponse createMultiAccountDeliveryChannelWithOptions(CreateMultiAccountDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelDescription)) {
            query.put("DeliveryChannelDescription", request.deliveryChannelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelFilter)) {
            query.put("DeliveryChannelFilter", request.deliveryChannelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceChangeDelivery)) {
            query.put("ResourceChangeDelivery", request.resourceChangeDelivery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSnapshotDelivery)) {
            query.put("ResourceSnapshotDelivery", request.resourceSnapshotDelivery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMultiAccountDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMultiAccountDeliveryChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>In Resource Center, you can create multi-account delivery channels by using the management account of your resource directory or the delegated administrator account of Resource Center to deliver resource configuration change events and scheduled resource snapshots within the members in your resource directory to Object Storage Service (OSS) or Simple Log Service. Then, other Alibaba Cloud services consume standardized resource information from OSS or Simple Log Service.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multi-account delivery channel.</p>
     * 
     * @param request CreateMultiAccountDeliveryChannelRequest
     * @return CreateMultiAccountDeliveryChannelResponse
     */
    public CreateMultiAccountDeliveryChannelResponse createMultiAccountDeliveryChannel(CreateMultiAccountDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMultiAccountDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom query template.</p>
     * 
     * @param request CreateSavedQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSavedQueryResponse
     */
    public CreateSavedQueryResponse createSavedQueryWithOptions(CreateSavedQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavedQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavedQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom query template.</p>
     * 
     * @param request CreateSavedQueryRequest
     * @return CreateSavedQueryResponse
     */
    public CreateSavedQueryResponse createSavedQuery(CreateSavedQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSavedQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a single-account delivery channel.</p>
     * 
     * @param request DeleteDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeliveryChannelResponse
     */
    public DeleteDeliveryChannelResponse deleteDeliveryChannelWithOptions(DeleteDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeliveryChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a single-account delivery channel.</p>
     * 
     * @param request DeleteDeliveryChannelRequest
     * @return DeleteDeliveryChannelResponse
     */
    public DeleteDeliveryChannelResponse deleteDeliveryChannel(DeleteDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a filter.</p>
     * 
     * @param request DeleteFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFilterResponse
     */
    public DeleteFilterResponse deleteFilterWithOptions(DeleteFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterName)) {
            query.put("FilterName", request.filterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFilter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a filter.</p>
     * 
     * @param request DeleteFilterRequest
     * @return DeleteFilterResponse
     */
    public DeleteFilterResponse deleteFilter(DeleteFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFilterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a multi-account delivery channel.</p>
     * 
     * @param request DeleteMultiAccountDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMultiAccountDeliveryChannelResponse
     */
    public DeleteMultiAccountDeliveryChannelResponse deleteMultiAccountDeliveryChannelWithOptions(DeleteMultiAccountDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultiAccountDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMultiAccountDeliveryChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a multi-account delivery channel.</p>
     * 
     * @param request DeleteMultiAccountDeliveryChannelRequest
     * @return DeleteMultiAccountDeliveryChannelResponse
     */
    public DeleteMultiAccountDeliveryChannelResponse deleteMultiAccountDeliveryChannel(DeleteMultiAccountDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMultiAccountDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom query template.</p>
     * 
     * @param request DeleteSavedQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSavedQueryResponse
     */
    public DeleteSavedQueryResponse deleteSavedQueryWithOptions(DeleteSavedQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSavedQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSavedQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom query template.</p>
     * 
     * @param request DeleteSavedQueryRequest
     * @return DeleteSavedQueryResponse
     */
    public DeleteSavedQueryResponse deleteSavedQuery(DeleteSavedQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSavedQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request DisableMultiAccountResourceCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableMultiAccountResourceCenterResponse
     */
    public DisableMultiAccountResourceCenterResponse disableMultiAccountResourceCenterWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableMultiAccountResourceCenter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableMultiAccountResourceCenterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * @return DisableMultiAccountResourceCenterResponse
     */
    public DisableMultiAccountResourceCenterResponse disableMultiAccountResourceCenter() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableMultiAccountResourceCenterWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deactivates the Resource Center service.</p>
     * 
     * @param request DisableResourceCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableResourceCenterResponse
     */
    public DisableResourceCenterResponse disableResourceCenterWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableResourceCenter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableResourceCenterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deactivates the Resource Center service.</p>
     * @return DisableResourceCenterResponse
     */
    public DisableResourceCenterResponse disableResourceCenter() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableResourceCenterWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the default filter.</p>
     * 
     * @param request DisassociateDefaultFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateDefaultFilterResponse
     */
    public DisassociateDefaultFilterResponse disassociateDefaultFilterWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateDefaultFilter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateDefaultFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the default filter.</p>
     * @return DisassociateDefaultFilterResponse
     */
    public DisassociateDefaultFilterResponse disassociateDefaultFilter() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateDefaultFilterWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have created a resource directory for your enterprise, you can enable the cross-account resource search feature by using the management account of the resource directory or a delegated administrator account of Resource Center to view the resources of members in the resource directory. For more information about a resource directory, see <a href="https://help.aliyun.com/document_detail/200506.html">Resource Directory overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request EnableMultiAccountResourceCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableMultiAccountResourceCenterResponse
     */
    public EnableMultiAccountResourceCenterResponse enableMultiAccountResourceCenterWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableMultiAccountResourceCenter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableMultiAccountResourceCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you have created a resource directory for your enterprise, you can enable the cross-account resource search feature by using the management account of the resource directory or a delegated administrator account of Resource Center to view the resources of members in the resource directory. For more information about a resource directory, see <a href="https://help.aliyun.com/document_detail/200506.html">Resource Directory overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * @return EnableMultiAccountResourceCenterResponse
     */
    public EnableMultiAccountResourceCenterResponse enableMultiAccountResourceCenter() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableMultiAccountResourceCenterWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Resource Center service.</p>
     * 
     * @param request EnableResourceCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableResourceCenterResponse
     */
    public EnableResourceCenterResponse enableResourceCenterWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableResourceCenter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableResourceCenterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Resource Center service.</p>
     * @return EnableResourceCenterResponse
     */
    public EnableResourceCenterResponse enableResourceCenter() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableResourceCenterWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes an SQL statement to query resources across accounts.</p>
     * 
     * @param request ExecuteMultiAccountSQLQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteMultiAccountSQLQueryResponse
     */
    public ExecuteMultiAccountSQLQueryResponse executeMultiAccountSQLQueryWithOptions(ExecuteMultiAccountSQLQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteMultiAccountSQLQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteMultiAccountSQLQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes an SQL statement to query resources across accounts.</p>
     * 
     * @param request ExecuteMultiAccountSQLQueryRequest
     * @return ExecuteMultiAccountSQLQueryResponse
     */
    public ExecuteMultiAccountSQLQueryResponse executeMultiAccountSQLQuery(ExecuteMultiAccountSQLQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeMultiAccountSQLQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes an SQL statement to query the resources that can be accessed within the current account.</p>
     * 
     * @param request ExecuteSQLQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSQLQueryResponse
     */
    public ExecuteSQLQueryResponse executeSQLQueryWithOptions(ExecuteSQLQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSQLQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSQLQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes an SQL statement to query the resources that can be accessed within the current account.</p>
     * 
     * @param request ExecuteSQLQueryRequest
     * @return ExecuteSQLQueryResponse
     */
    public ExecuteSQLQueryResponse executeSQLQuery(ExecuteSQLQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeSQLQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a single-account delivery channel.</p>
     * 
     * @param request GetDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeliveryChannelResponse
     */
    public GetDeliveryChannelResponse getDeliveryChannelWithOptions(GetDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliveryChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a single-account delivery channel.</p>
     * 
     * @param request GetDeliveryChannelRequest
     * @return GetDeliveryChannelResponse
     */
    public GetDeliveryChannelResponse getDeliveryChannel(GetDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on a single-account delivery channel.</p>
     * 
     * @param request GetDeliveryChannelStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeliveryChannelStatisticsResponse
     */
    public GetDeliveryChannelStatisticsResponse getDeliveryChannelStatisticsWithOptions(GetDeliveryChannelStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliveryChannelStatistics"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliveryChannelStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on a single-account delivery channel.</p>
     * 
     * @param request GetDeliveryChannelStatisticsRequest
     * @return GetDeliveryChannelStatisticsResponse
     */
    public GetDeliveryChannelStatisticsResponse getDeliveryChannelStatistics(GetDeliveryChannelStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeliveryChannelStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a sample query template.</p>
     * 
     * @param request GetExampleQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExampleQueryResponse
     */
    public GetExampleQueryResponse getExampleQueryWithOptions(GetExampleQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExampleQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExampleQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a sample query template.</p>
     * 
     * @param request GetExampleQueryRequest
     * @return GetExampleQueryResponse
     */
    public GetExampleQueryResponse getExampleQuery(GetExampleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExampleQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a multi-account delivery channel.</p>
     * 
     * @param request GetMultiAccountDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiAccountDeliveryChannelResponse
     */
    public GetMultiAccountDeliveryChannelResponse getMultiAccountDeliveryChannelWithOptions(GetMultiAccountDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiAccountDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiAccountDeliveryChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a multi-account delivery channel.</p>
     * 
     * @param request GetMultiAccountDeliveryChannelRequest
     * @return GetMultiAccountDeliveryChannelResponse
     */
    public GetMultiAccountDeliveryChannelResponse getMultiAccountDeliveryChannel(GetMultiAccountDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiAccountDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on a multi-account delivery channel.</p>
     * 
     * @param request GetMultiAccountDeliveryChannelStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiAccountDeliveryChannelStatisticsResponse
     */
    public GetMultiAccountDeliveryChannelStatisticsResponse getMultiAccountDeliveryChannelStatisticsWithOptions(GetMultiAccountDeliveryChannelStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiAccountDeliveryChannelStatistics"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiAccountDeliveryChannelStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on a multi-account delivery channel.</p>
     * 
     * @param request GetMultiAccountDeliveryChannelStatisticsRequest
     * @return GetMultiAccountDeliveryChannelStatisticsResponse
     */
    public GetMultiAccountDeliveryChannelStatisticsResponse getMultiAccountDeliveryChannelStatistics(GetMultiAccountDeliveryChannelStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiAccountDeliveryChannelStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request GetMultiAccountResourceCenterServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiAccountResourceCenterServiceStatusResponse
     */
    public GetMultiAccountResourceCenterServiceStatusResponse getMultiAccountResourceCenterServiceStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiAccountResourceCenterServiceStatus"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiAccountResourceCenterServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the cross-account resource search feature by using the management account of a resource directory or a delegated administrator account of Resource Center.</p>
     * @return GetMultiAccountResourceCenterServiceStatusResponse
     */
    public GetMultiAccountResourceCenterServiceStatusResponse getMultiAccountResourceCenterServiceStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiAccountResourceCenterServiceStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a resource within the management account or a member of a resource directory.</p>
     * 
     * @param request GetMultiAccountResourceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiAccountResourceConfigurationResponse
     */
    public GetMultiAccountResourceConfigurationResponse getMultiAccountResourceConfigurationWithOptions(GetMultiAccountResourceConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiAccountResourceConfiguration"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiAccountResourceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a resource within the management account or a member of a resource directory.</p>
     * 
     * @param request GetMultiAccountResourceConfigurationRequest
     * @return GetMultiAccountResourceConfigurationResponse
     */
    public GetMultiAccountResourceConfigurationResponse getMultiAccountResourceConfiguration(GetMultiAccountResourceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiAccountResourceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取多账号资源数量</p>
     * 
     * @param request GetMultiAccountResourceCountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiAccountResourceCountsResponse
     */
    public GetMultiAccountResourceCountsResponse getMultiAccountResourceCountsWithOptions(GetMultiAccountResourceCountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByKey)) {
            query.put("GroupByKey", request.groupByKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiAccountResourceCounts"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMultiAccountResourceCountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取多账号资源数量</p>
     * 
     * @param request GetMultiAccountResourceCountsRequest
     * @return GetMultiAccountResourceCountsResponse
     */
    public GetMultiAccountResourceCountsResponse getMultiAccountResourceCounts(GetMultiAccountResourceCountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultiAccountResourceCountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Resource Center service.</p>
     * 
     * @param request GetResourceCenterServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceCenterServiceStatusResponse
     */
    public GetResourceCenterServiceStatusResponse getResourceCenterServiceStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceCenterServiceStatus"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceCenterServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Resource Center service.</p>
     * @return GetResourceCenterServiceStatusResponse
     */
    public GetResourceCenterServiceStatusResponse getResourceCenterServiceStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceCenterServiceStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a resource within the current account.</p>
     * 
     * @param request GetResourceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceConfigurationResponse
     */
    public GetResourceConfigurationResponse getResourceConfigurationWithOptions(GetResourceConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceConfiguration"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a resource within the current account.</p>
     * 
     * @param request GetResourceConfigurationRequest
     * @return GetResourceConfigurationResponse
     */
    public GetResourceConfigurationResponse getResourceConfiguration(GetResourceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the numbers of resources on which the current account has access permissions.</p>
     * 
     * @param request GetResourceCountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceCountsResponse
     */
    public GetResourceCountsResponse getResourceCountsWithOptions(GetResourceCountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByKey)) {
            query.put("GroupByKey", request.groupByKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDeletedResources)) {
            query.put("IncludeDeletedResources", request.includeDeletedResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchExpression)) {
            query.put("SearchExpression", request.searchExpression);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceCounts"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceCountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the numbers of resources on which the current account has access permissions.</p>
     * 
     * @param request GetResourceCountsRequest
     * @return GetResourceCountsResponse
     */
    public GetResourceCountsResponse getResourceCounts(GetResourceCountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceCountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a custom query template.</p>
     * 
     * @param request GetSavedQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavedQueryResponse
     */
    public GetSavedQueryResponse getSavedQueryWithOptions(GetSavedQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavedQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavedQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a custom query template.</p>
     * 
     * @param request GetSavedQueryRequest
     * @return GetSavedQueryResponse
     */
    public GetSavedQueryResponse getSavedQuery(GetSavedQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSavedQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of single-account delivery channels.</p>
     * 
     * @param request ListDeliveryChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeliveryChannelsResponse
     */
    public ListDeliveryChannelsResponse listDeliveryChannelsWithOptions(ListDeliveryChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListDeliveryChannels"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryChannelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of single-account delivery channels.</p>
     * 
     * @param request ListDeliveryChannelsRequest
     * @return ListDeliveryChannelsResponse
     */
    public ListDeliveryChannelsResponse listDeliveryChannels(ListDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all sample query templates.</p>
     * 
     * @param request ListExampleQueriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExampleQueriesResponse
     */
    public ListExampleQueriesResponse listExampleQueriesWithOptions(ListExampleQueriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListExampleQueries"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExampleQueriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all sample query templates.</p>
     * 
     * @param request ListExampleQueriesRequest
     * @return ListExampleQueriesResponse
     */
    public ListExampleQueriesResponse listExampleQueries(ListExampleQueriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExampleQueriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of filters.</p>
     * 
     * @param request ListFiltersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFiltersResponse
     */
    public ListFiltersResponse listFiltersWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFilters"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFiltersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of filters.</p>
     * @return ListFiltersResponse
     */
    public ListFiltersResponse listFilters() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFiltersWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of multi-account delivery channels.</p>
     * 
     * @param request ListMultiAccountDeliveryChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiAccountDeliveryChannelsResponse
     */
    public ListMultiAccountDeliveryChannelsResponse listMultiAccountDeliveryChannelsWithOptions(ListMultiAccountDeliveryChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListMultiAccountDeliveryChannels"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiAccountDeliveryChannelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of multi-account delivery channels.</p>
     * 
     * @param request ListMultiAccountDeliveryChannelsRequest
     * @return ListMultiAccountDeliveryChannelsResponse
     */
    public ListMultiAccountDeliveryChannelsResponse listMultiAccountDeliveryChannels(ListMultiAccountDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiAccountDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource groups within the management account or a member of a resource directory by using the management account of the resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request ListMultiAccountResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiAccountResourceGroupsResponse
     */
    public ListMultiAccountResourceGroupsResponse listMultiAccountResourceGroupsWithOptions(ListMultiAccountResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiAccountResourceGroups"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiAccountResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource groups within the management account or a member of a resource directory by using the management account of the resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request ListMultiAccountResourceGroupsRequest
     * @return ListMultiAccountResourceGroupsResponse
     */
    public ListMultiAccountResourceGroupsResponse listMultiAccountResourceGroups(ListMultiAccountResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiAccountResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the relationships between resources within the management account or members of your resource directory.</p>
     * 
     * @param request ListMultiAccountResourceRelationshipsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiAccountResourceRelationshipsResponse
     */
    public ListMultiAccountResourceRelationshipsResponse listMultiAccountResourceRelationshipsWithOptions(ListMultiAccountResourceRelationshipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedResourceFilter)) {
            query.put("RelatedResourceFilter", request.relatedResourceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiAccountResourceRelationships"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiAccountResourceRelationshipsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the relationships between resources within the management account or members of your resource directory.</p>
     * 
     * @param request ListMultiAccountResourceRelationshipsRequest
     * @return ListMultiAccountResourceRelationshipsResponse
     */
    public ListMultiAccountResourceRelationshipsResponse listMultiAccountResourceRelationships(ListMultiAccountResourceRelationshipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiAccountResourceRelationshipsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys of resources within the management account or a member of your resource directory.</p>
     * 
     * @param request ListMultiAccountTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiAccountTagKeysResponse
     */
    public ListMultiAccountTagKeysResponse listMultiAccountTagKeysWithOptions(ListMultiAccountTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiAccountTagKeys"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiAccountTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys of resources within the management account or a member of your resource directory.</p>
     * 
     * @param request ListMultiAccountTagKeysRequest
     * @return ListMultiAccountTagKeysResponse
     */
    public ListMultiAccountTagKeysResponse listMultiAccountTagKeys(ListMultiAccountTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiAccountTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of resources within the management account or a member of a resource directory by using the management account of the resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request ListMultiAccountTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMultiAccountTagValuesResponse
     */
    public ListMultiAccountTagValuesResponse listMultiAccountTagValuesWithOptions(ListMultiAccountTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("TagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultiAccountTagValues"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMultiAccountTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of resources within the management account or a member of a resource directory by using the management account of the resource directory or a delegated administrator account of Resource Center.</p>
     * 
     * @param request ListMultiAccountTagValuesRequest
     * @return ListMultiAccountTagValuesResponse
     */
    public ListMultiAccountTagValuesResponse listMultiAccountTagValues(ListMultiAccountTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMultiAccountTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query only the resource relationships on which the current account has access permissions.</p>
     * <ul>
     * <li>By default, this operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the query scope. For information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only entries that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Entries that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource relationships on which the current account has access permissions.</p>
     * 
     * @param request ListResourceRelationshipsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceRelationshipsResponse
     */
    public ListResourceRelationshipsResponse listResourceRelationshipsWithOptions(ListResourceRelationshipsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedResourceFilter)) {
            query.put("RelatedResourceFilter", request.relatedResourceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceRelationships"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceRelationshipsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query only the resource relationships on which the current account has access permissions.</p>
     * <ul>
     * <li>By default, this operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the query scope. For information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only entries that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Entries that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resource relationships on which the current account has access permissions.</p>
     * 
     * @param request ListResourceRelationshipsRequest
     * @return ListResourceRelationshipsResponse
     */
    public ListResourceRelationshipsResponse listResourceRelationships(ListResourceRelationshipsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceRelationshipsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of resource types</p>
     * 
     * @param request ListResourceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypesWithOptions(ListResourceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of resource types</p>
     * 
     * @param request ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all custom query templates.</p>
     * 
     * @param request ListSavedQueriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSavedQueriesResponse
     */
    public ListSavedQueriesResponse listSavedQueriesWithOptions(ListSavedQueriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListSavedQueries"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSavedQueriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all custom query templates.</p>
     * 
     * @param request ListSavedQueriesRequest
     * @return ListSavedQueriesResponse
     */
    public ListSavedQueriesResponse listSavedQueries(ListSavedQueriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSavedQueriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys of resources within the current account.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys of resources within the current account.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of resources within the current account.</p>
     * 
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("TagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of resources within the current account.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</li>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.alibabacloud.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for resources within the management account or members of a resource directory.</p>
     * 
     * @param request SearchMultiAccountResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMultiAccountResourcesResponse
     */
    public SearchMultiAccountResourcesResponse searchMultiAccountResourcesWithOptions(SearchMultiAccountResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriterion)) {
            query.put("SortCriterion", request.sortCriterion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMultiAccountResources"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMultiAccountResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</li>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.alibabacloud.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for resources within the management account or members of a resource directory.</p>
     * 
     * @param request SearchMultiAccountResourcesRequest
     * @return SearchMultiAccountResourcesResponse
     */
    public SearchMultiAccountResourcesResponse searchMultiAccountResources(SearchMultiAccountResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMultiAccountResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.aliyun.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Search for resources that you can access within the current account.</p>
     * 
     * @param request SearchResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchResourcesResponse
     */
    public SearchResourcesResponse searchResourcesWithOptions(SearchResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDeletedResources)) {
            query.put("IncludeDeletedResources", request.includeDeletedResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchExpression)) {
            query.put("SearchExpression", request.searchExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriterion)) {
            query.put("SortCriterion", request.sortCriterion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchResources"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.aliyun.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Search for resources that you can access within the current account.</p>
     * 
     * @param request SearchResourcesRequest
     * @return SearchResourcesResponse
     */
    public SearchResourcesResponse searchResources(SearchResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a single-account delivery channel.</p>
     * 
     * @param request UpdateDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeliveryChannelResponse
     */
    public UpdateDeliveryChannelResponse updateDeliveryChannelWithOptions(UpdateDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelDescription)) {
            query.put("DeliveryChannelDescription", request.deliveryChannelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelFilter)) {
            query.put("DeliveryChannelFilter", request.deliveryChannelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceChangeDelivery)) {
            query.put("ResourceChangeDelivery", request.resourceChangeDelivery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSnapshotDelivery)) {
            query.put("ResourceSnapshotDelivery", request.resourceSnapshotDelivery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeliveryChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a single-account delivery channel.</p>
     * 
     * @param request UpdateDeliveryChannelRequest
     * @return UpdateDeliveryChannelResponse
     */
    public UpdateDeliveryChannelResponse updateDeliveryChannel(UpdateDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a filter.</p>
     * 
     * @param request UpdateFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFilterResponse
     */
    public UpdateFilterResponse updateFilterWithOptions(UpdateFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterConfiguration)) {
            query.put("FilterConfiguration", request.filterConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterName)) {
            query.put("FilterName", request.filterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFilter"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a filter.</p>
     * 
     * @param request UpdateFilterRequest
     * @return UpdateFilterResponse
     */
    public UpdateFilterResponse updateFilter(UpdateFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFilterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a multi-account delivery channel.</p>
     * 
     * @param request UpdateMultiAccountDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMultiAccountDeliveryChannelResponse
     */
    public UpdateMultiAccountDeliveryChannelResponse updateMultiAccountDeliveryChannelWithOptions(UpdateMultiAccountDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelDescription)) {
            query.put("DeliveryChannelDescription", request.deliveryChannelDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelFilter)) {
            query.put("DeliveryChannelFilter", request.deliveryChannelFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceChangeDelivery)) {
            query.put("ResourceChangeDelivery", request.resourceChangeDelivery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSnapshotDelivery)) {
            query.put("ResourceSnapshotDelivery", request.resourceSnapshotDelivery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMultiAccountDeliveryChannel"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMultiAccountDeliveryChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resource delivery supports the delivery of resource configuration change events and scheduled resource snapshots.
     * Scheduled resource snapshots support the following delivery scenarios:</p>
     * <ul>
     * <li>Standard delivery: Leave the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter empty.</li>
     * <li>Custom delivery: Set the <code>ResourceSnapshotDelivery.CustomExpression</code> parameter to an appropriate value.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a multi-account delivery channel.</p>
     * 
     * @param request UpdateMultiAccountDeliveryChannelRequest
     * @return UpdateMultiAccountDeliveryChannelResponse
     */
    public UpdateMultiAccountDeliveryChannelResponse updateMultiAccountDeliveryChannel(UpdateMultiAccountDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMultiAccountDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom query template.</p>
     * 
     * @param request UpdateSavedQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSavedQueryResponse
     */
    public UpdateSavedQueryResponse updateSavedQueryWithOptions(UpdateSavedQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            query.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSavedQuery"),
            new TeaPair("version", "2022-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSavedQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom query template.</p>
     * 
     * @param request UpdateSavedQueryRequest
     * @return UpdateSavedQueryResponse
     */
    public UpdateSavedQueryResponse updateSavedQuery(UpdateSavedQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSavedQueryWithOptions(request, runtime);
    }
}
