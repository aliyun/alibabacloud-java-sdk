// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209;

import com.aliyun.tea.*;
import com.aliyun.tablestore20201209.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("tablestore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>绑定vpc</p>
     * 
     * @param request BindInstance2VpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindInstance2VpcResponse
     */
    public BindInstance2VpcResponse bindInstance2VpcWithOptions(BindInstance2VpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceVpcName)) {
            body.put("InstanceVpcName", request.instanceVpcName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualSwitchId)) {
            body.put("VirtualSwitchId", request.virtualSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindInstance2Vpc"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/bindinstance2vpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindInstance2VpcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定vpc</p>
     * 
     * @param request BindInstance2VpcRequest
     * @return BindInstance2VpcResponse
     */
    public BindInstance2VpcResponse bindInstance2Vpc(BindInstance2VpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindInstance2VpcWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/changeresourcegroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the validity of a Resource Access Management (RAM) policy for an instance.</p>
     * 
     * @param request CheckInstancePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstancePolicyResponse
     */
    public CheckInstancePolicyResponse checkInstancePolicyWithOptions(CheckInstancePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstancePolicy"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/checkinstancepolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstancePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the validity of a Resource Access Management (RAM) policy for an instance.</p>
     * 
     * @param request CheckInstancePolicyRequest
     * @return CheckInstancePolicyResponse
     */
    public CheckInstancePolicyResponse checkInstancePolicy(CheckInstancePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkInstancePolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 10 instances. The name of an instance must be unique within the region in which the instance resides.</li>
     * <li>After you create an instance, you cannot change the type of the instance. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableReplication)) {
            body.put("DisableReplication", request.disableReplication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            body.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkSourceACL)) {
            body.put("NetworkSourceACL", request.networkSourceACL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkTypeACL)) {
            body.put("NetworkTypeACL", request.networkTypeACL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/createinstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 10 instances. The name of an instance must be unique within the region in which the instance resides.</li>
     * <li>After you create an instance, you cannot change the type of the instance. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建VCU实例</p>
     * 
     * @param request CreateVCUInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVCUInstanceResponse
     */
    public CreateVCUInstanceResponse createVCUInstanceWithOptions(CreateVCUInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            body.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriodInMonth)) {
            body.put("AutoRenewPeriodInMonth", request.autoRenewPeriodInMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoRenew)) {
            body.put("EnableAutoRenew", request.enableAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableElasticVCU)) {
            body.put("EnableElasticVCU", request.enableElasticVCU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            body.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodInMonth)) {
            body.put("PeriodInMonth", request.periodInMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VCU)) {
            body.put("VCU", request.VCU);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVCUInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/createvcuinstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVCUInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建VCU实例</p>
     * 
     * @param request CreateVCUInstanceRequest
     * @return CreateVCUInstanceResponse
     */
    public CreateVCUInstanceResponse createVCUInstance(CreateVCUInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVCUInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an instance, make sure that all data tables and time series tables in the instance are deleted and virtual private clouds (VPCs) are unbound from the instance.</p>
     * <ul>
     * <li>To prevent conflicts, do not create an instance that has the same name as the instance that is being deleted.</li>
     * <li>After an instance is deleted, the instance becomes unavailable and the tables, table data, and related indexes in the instance cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/deleteinstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an instance, make sure that all data tables and time series tables in the instance are deleted and virtual private clouds (VPCs) are unbound from the instance.</p>
     * <ul>
     * <li>To prevent conflicts, do not create an instance that has the same name as the instance that is being deleted.</li>
     * <li>After an instance is deleted, the instance becomes unavailable and the tables, table data, and related indexes in the instance cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot recover a deleted instance policy. Proceed with caution.</p>
     * <ul>
     * <li>After you delete an instance policy, the access control that is specified by the instance policy becomes invalid. Make sure that your instance is in a secure environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) policy of an instance.</p>
     * 
     * @param request DeleteInstancePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstancePolicyResponse
     */
    public DeleteInstancePolicyResponse deleteInstancePolicyWithOptions(DeleteInstancePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyVersion)) {
            body.put("PolicyVersion", request.policyVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstancePolicy"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/deleteinstancepolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstancePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You cannot recover a deleted instance policy. Proceed with caution.</p>
     * <ul>
     * <li>After you delete an instance policy, the access control that is specified by the instance policy becomes invalid. Make sure that your instance is in a secure environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) policy of an instance.</p>
     * 
     * @param request DeleteInstancePolicyRequest
     * @return DeleteInstancePolicyResponse
     */
    public DeleteInstancePolicyResponse deleteInstancePolicy(DeleteInstancePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstancePolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除VCU实例</p>
     * 
     * @param request DeleteVCUInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVCUInstanceResponse
     */
    public DeleteVCUInstanceResponse deleteVCUInstanceWithOptions(DeleteVCUInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVCUInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/deletevcuinstance"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVCUInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除VCU实例</p>
     * 
     * @param request DeleteVCUInstanceRequest
     * @return DeleteVCUInstanceResponse
     */
    public DeleteVCUInstanceResponse deleteVCUInstance(DeleteVCUInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVCUInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/region/DescribeRegions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance information.</p>
     * 
     * @param request GetInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/getinstance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance information.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举集群类型</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterTypeResponse
     */
    public ListClusterTypeResponse listClusterTypeWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterType"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/listclustertype"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举集群类型</p>
     * @return ListClusterTypeResponse
     */
    public ListClusterTypeResponse listClusterType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterTypeWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances.</p>
     * 
     * @param tmpReq ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesShrinkRequest request = new ListInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceNameList)) {
            request.instanceNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceNameList, "InstanceNameList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNameListShrink)) {
            query.put("InstanceNameList", request.instanceNameListShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/listinstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tagged resources.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/listtagresources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tagged resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的vpcInfo列表</p>
     * 
     * @param request ListVpcInfoByInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcInfoByInstanceResponse
     */
    public ListVpcInfoByInstanceResponse listVpcInfoByInstanceWithOptions(ListVpcInfoByInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcInfoByInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/listvpcinfobyinstance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcInfoByInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的vpcInfo列表</p>
     * 
     * @param request ListVpcInfoByInstanceRequest
     * @return ListVpcInfoByInstanceResponse
     */
    public ListVpcInfoByInstanceResponse listVpcInfoByInstance(ListVpcInfoByInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcInfoByInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的vpcInfo列表</p>
     * 
     * @param request ListVpcInfoByVpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcInfoByVpcResponse
     */
    public ListVpcInfoByVpcResponse listVpcInfoByVpcWithOptions(ListVpcInfoByVpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcInfoByVpc"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/listvpcinfobyvpc"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcInfoByVpcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例的vpcInfo列表</p>
     * 
     * @param request ListVpcInfoByVpcRequest
     * @return ListVpcInfoByVpcResponse
     */
    public ListVpcInfoByVpcResponse listVpcInfoByVpc(ListVpcInfoByVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcInfoByVpcWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to instances.</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/tagresources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to instances.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑vpc</p>
     * 
     * @param request UnbindInstance2VpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindInstance2VpcResponse
     */
    public UnbindInstance2VpcResponse unbindInstance2VpcWithOptions(UnbindInstance2VpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceVpcName)) {
            body.put("InstanceVpcName", request.instanceVpcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindInstance2Vpc"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/unbindinstance2vpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindInstance2VpcResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑vpc</p>
     * 
     * @param request UnbindInstance2VpcRequest
     * @return UnbindInstance2VpcResponse
     */
    public UnbindInstance2VpcResponse unbindInstance2Vpc(UnbindInstance2VpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindInstance2VpcWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Removing tags from resources helps simplify resource management, optimize system performance, and mitigate potential security vulnerabilities. After a tag is removed from a resource, the system automatically deletes the tag if the tag is not added to other resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            body.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/untagresources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Removing tags from resources helps simplify resource management, optimize system performance, and mitigate potential security vulnerabilities. After a tag is removed from a resource, the system automatically deletes the tag if the tag is not added to other resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates instance information.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            body.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            body.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkSourceACL)) {
            body.put("NetworkSourceACL", request.networkSourceACL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkTypeACL)) {
            body.put("NetworkTypeACL", request.networkTypeACL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/updateinstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates instance information.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>After you enable scalability for an instance, the default upper limit for the VCUs of the instance is the sum of the scalability and the reserved VCUs.</li>
     * <li>To use more computing resources when your business grows, you can modify the upper limit for the VCUs of your instance. The new upper limit for the VCUs of your instance immediately takes effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the upper limit for the VCUs of an instance in VCU mode (formerly reserved mode).</p>
     * 
     * @param request UpdateInstanceElasticVCUUpperLimitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceElasticVCUUpperLimitResponse
     */
    public UpdateInstanceElasticVCUUpperLimitResponse updateInstanceElasticVCUUpperLimitWithOptions(UpdateInstanceElasticVCUUpperLimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticVCUUpperLimit)) {
            body.put("ElasticVCUUpperLimit", request.elasticVCUUpperLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceElasticVCUUpperLimit"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/updateinstanceelasticvcuupperlimit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceElasticVCUUpperLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>After you enable scalability for an instance, the default upper limit for the VCUs of the instance is the sum of the scalability and the reserved VCUs.</li>
     * <li>To use more computing resources when your business grows, you can modify the upper limit for the VCUs of your instance. The new upper limit for the VCUs of your instance immediately takes effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the upper limit for the VCUs of an instance in VCU mode (formerly reserved mode).</p>
     * 
     * @param request UpdateInstanceElasticVCUUpperLimitRequest
     * @return UpdateInstanceElasticVCUUpperLimitResponse
     */
    public UpdateInstanceElasticVCUUpperLimitResponse updateInstanceElasticVCUUpperLimit(UpdateInstanceElasticVCUUpperLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceElasticVCUUpperLimitWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Resource Access Management (RAM) policy for an instance.</p>
     * 
     * @param request UpdateInstancePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstancePolicyResponse
     */
    public UpdateInstancePolicyResponse updateInstancePolicyWithOptions(UpdateInstancePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyVersion)) {
            body.put("PolicyVersion", request.policyVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstancePolicy"),
            new TeaPair("version", "2020-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/updateinstancepolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstancePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Resource Access Management (RAM) policy for an instance.</p>
     * 
     * @param request UpdateInstancePolicyRequest
     * @return UpdateInstancePolicyResponse
     */
    public UpdateInstancePolicyResponse updateInstancePolicy(UpdateInstancePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstancePolicyWithOptions(request, headers, runtime);
    }
}
