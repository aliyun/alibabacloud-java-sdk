// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019;

import com.aliyun.tea.*;
import com.aliyun.starrocks20221019.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("starrocks", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of CUs for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyCuRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCuResponse
     */
    public ModifyCuResponse modifyCuWithOptions(ModifyCuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCu"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyCu"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of CUs for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyCuRequest
     * @return ModifyCuResponse
     */
    public ModifyCuResponse modifyCu(ModifyCuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyCuWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of CUs for a warehouse.</p>
     * 
     * @param request ModifyCuPreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCuPreCheckResponse
     */
    public ModifyCuPreCheckResponse modifyCuPreCheckWithOptions(ModifyCuPreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCuPreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyCuPreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCuPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of CUs for a warehouse.</p>
     * 
     * @param request ModifyCuPreCheckRequest
     * @return ModifyCuPreCheckResponse
     */
    public ModifyCuPreCheckResponse modifyCuPreCheck(ModifyCuPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyCuPreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskNumberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskNumberResponse
     */
    public ModifyDiskNumberResponse modifyDiskNumberWithOptions(ModifyDiskNumberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskNumber"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Increases the number of disks for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskNumberRequest
     * @return ModifyDiskNumberResponse
     */
    public ModifyDiskNumberResponse modifyDiskNumber(ModifyDiskNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the disk performance level for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskPerformanceLevelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskPerformanceLevelResponse
     */
    public ModifyDiskPerformanceLevelResponse modifyDiskPerformanceLevelWithOptions(ModifyDiskPerformanceLevelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskPerformanceLevel"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskPerformanceLevel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskPerformanceLevelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the disk performance level for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskPerformanceLevelRequest
     * @return ModifyDiskPerformanceLevelResponse
     */
    public ModifyDiskPerformanceLevelResponse modifyDiskPerformanceLevel(ModifyDiskPerformanceLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskPerformanceLevelWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Expands the disk size for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskSizeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskSizeResponse
     */
    public ModifyDiskSizeResponse modifyDiskSizeWithOptions(ModifyDiskSizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskSize"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyDiskSize"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskSizeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Expands the disk size for a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyDiskSizeRequest
     * @return ModifyDiskSizeResponse
     */
    public ModifyDiskSizeResponse modifyDiskSize(ModifyDiskSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiskSizeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodeNumberResponse
     */
    public ModifyNodeNumberResponse modifyNodeNumberWithOptions(ModifyNodeNumberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionOptionNo)) {
            query.put("PromotionOptionNo", request.promotionOptionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeNumber"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyNodeNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeNumberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberRequest
     * @return ModifyNodeNumberResponse
     */
    public ModifyNodeNumberResponse modifyNodeNumber(ModifyNodeNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberPreCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodeNumberPreCheckResponse
     */
    public ModifyNodeNumberPreCheckResponse modifyNodeNumberPreCheckWithOptions(ModifyNodeNumberPreCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeNumberPreCheck"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resourceChange/modifyNodeNumberPreCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeNumberPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a precheck before you modify the number of nodes in a warehouse of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request ModifyNodeNumberPreCheckRequest
     * @return ModifyNodeNumberPreCheckResponse
     */
    public ModifyNodeNumberPreCheckResponse modifyNodeNumberPreCheck(ModifyNodeNumberPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodeNumberPreCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an E-MapReduce (EMR) Serverless StarRocks instance that the versions that you can upgrade to. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. You can call this operation to query the minor versions or major versions that the versions that you can upgrade to.</p>
     * 
     * @param request QueryUpgradableVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUpgradableVersionsResponse
     */
    public QueryUpgradableVersionsResponse queryUpgradableVersionsWithOptions(QueryUpgradableVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minor)) {
            query.put("Minor", request.minor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUpgradableVersions"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/queryUpgradableVersions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUpgradableVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an E-MapReduce (EMR) Serverless StarRocks instance that the versions that you can upgrade to. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. You can call this operation to query the minor versions or major versions that the versions that you can upgrade to.</p>
     * 
     * @param request QueryUpgradableVersionsRequest
     * @return QueryUpgradableVersionsResponse
     */
    public QueryUpgradableVersionsResponse queryUpgradableVersions(QueryUpgradableVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUpgradableVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go E-MapReduce (EMR) Serverless StarRocks instance. To unsubscribe from a subscription instance, go to the Unsubscribe page of the Expenses and Costs console.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/release"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go E-MapReduce (EMR) Serverless StarRocks instance. To unsubscribe from a subscription instance, go to the Unsubscribe page of the Expenses and Costs console.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request RestartInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/restartCluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceNameWithOptions(UpdateInstanceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceName"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/cluster/update_name"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an E-MapReduce (EMR) Serverless StarRocks instance.</p>
     * 
     * @param request UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an E-MapReduce (EMR) Serverless StarRocks instance. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. This operation can be used to upgrade the minor version or major version of a StarRocks instance. You can call the QueryUpgradableVersions operation to query the versions that you can upgrade to.</p>
     * 
     * @param request UpgradeVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeVersionResponse
     */
    public UpgradeVersionResponse upgradeVersionWithOptions(UpgradeVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fastMode)) {
            query.put("FastMode", request.fastMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minor)) {
            query.put("Minor", request.minor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeVersion"),
            new TeaPair("version", "2022-10-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/starrocks/upgradeVersion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the version of an E-MapReduce (EMR) Serverless StarRocks instance. The versions of a StarRocks instance include the major version and minor version. You can view the major version and minor version of a StarRocks instance in the Version Information section of the Instance Details tab in the EMR console. This operation can be used to upgrade the minor version or major version of a StarRocks instance. You can call the QueryUpgradableVersions operation to query the versions that you can upgrade to.</p>
     * 
     * @param request UpgradeVersionRequest
     * @return UpgradeVersionResponse
     */
    public UpgradeVersionResponse upgradeVersion(UpgradeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeVersionWithOptions(request, headers, runtime);
    }
}
