// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202;

import com.aliyun.tea.*;
import com.aliyun.polardbx20200202.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "polardbx.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "polardbx.aliyuncs.com"),
            new TeaPair("ap-south-1", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "polardbx.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-edge-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-fujian", "polardbx.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "polardbx.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "polardbx.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-wuhan", "polardbx.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "polardbx.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "polardbx.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-central-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-west-1", "polardbx.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "polardbx.aliyuncs.com"),
            new TeaPair("me-east-1", "polardbx.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "polardbx.aliyuncs.com"),
            new TeaPair("us-west-1", "polardbx.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "polardbx.us-east-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "polardbx.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "polardbx.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "polardbx.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "polardbx.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "polardbx.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "polardbx.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "polardbx.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "polardbx.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "polardbx.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "polardbx.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("polardbx", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AlignStoragePrimaryAzoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AlignStoragePrimaryAzoneResponse
     */
    public AlignStoragePrimaryAzoneResponse alignStoragePrimaryAzoneWithOptions(AlignStoragePrimaryAzoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageInstanceName)) {
            query.put("StorageInstanceName", request.storageInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTimeMode)) {
            query.put("SwitchTimeMode", request.switchTimeMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlignStoragePrimaryAzone"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlignStoragePrimaryAzoneResponse());
    }

    /**
     * @param request AlignStoragePrimaryAzoneRequest
     * @return AlignStoragePrimaryAzoneResponse
     */
    public AlignStoragePrimaryAzoneResponse alignStoragePrimaryAzone(AlignStoragePrimaryAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.alignStoragePrimaryAzoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the AllocateColdDataVolume operation.</p>
     * 
     * @param request AllocateColdDataVolumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateColdDataVolumeResponse
     */
    public AllocateColdDataVolumeResponse allocateColdDataVolumeWithOptions(AllocateColdDataVolumeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateColdDataVolume"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateColdDataVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the AllocateColdDataVolume operation.</p>
     * 
     * @param request AllocateColdDataVolumeRequest
     * @return AllocateColdDataVolumeResponse
     */
    public AllocateColdDataVolumeResponse allocateColdDataVolume(AllocateColdDataVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateColdDataVolumeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the AllocateInstancePublicConnection operation to create a public IP address.</p>
     * 
     * @param request AllocateInstancePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateInstancePublicConnectionResponse
     */
    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterName)) {
            query.put("InstanceClusterName", request.instanceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateInstancePublicConnection"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the AllocateInstancePublicConnection operation to create a public IP address.</p>
     * 
     * @param request AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to confirm that no active connections exist before a rollback task, to ensure operation safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a public domain name for a Mem0 instance.</p>
     * 
     * @param request AllocateMem0PublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateMem0PublicConnectionResponse
     */
    public AllocateMem0PublicConnectionResponse allocateMem0PublicConnectionWithOptions(AllocateMem0PublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateMem0PublicConnection"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateMem0PublicConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to confirm that no active connections exist before a rollback task, to ensure operation safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a public domain name for a Mem0 instance.</p>
     * 
     * @param request AllocateMem0PublicConnectionRequest
     * @return AllocateMem0PublicConnectionResponse
     */
    public AllocateMem0PublicConnectionResponse allocateMem0PublicConnection(AllocateMem0PublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateMem0PublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Mounts a columnar instance to a specified primary database instance.</p>
     * 
     * @param request AttachColumnarInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachColumnarInstanceResponse
     */
    public AttachColumnarInstanceResponse attachColumnarInstanceWithOptions(AttachColumnarInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachColumnarInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachColumnarInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Mounts a columnar instance to a specified primary database instance.</p>
     * 
     * @param request AttachColumnarInstanceRequest
     * @return AttachColumnarInstanceResponse
     */
    public AttachColumnarInstanceResponse attachColumnarInstance(AttachColumnarInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachColumnarInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels active O&amp;M event tasks by calling the CancelActiveOperationTasks operation.</p>
     * 
     * @param request CancelActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelActiveOperationTasksResponse
     */
    public CancelActiveOperationTasksResponse cancelActiveOperationTasksWithOptions(CancelActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelActiveOperationTasks"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels active O&amp;M event tasks by calling the CancelActiveOperationTasks operation.</p>
     * 
     * @param request CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    public CancelActiveOperationTasksResponse cancelActiveOperationTasks(CancelActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note: </p>
     * <ul>
     * <li>The <strong>endpoint</strong> differs from other operations. Use <strong>polardbx.aliyuncs.com</strong> for Chinese mainland regions and Singapore. For other regions, use <strong>polardbx.{region id}.aliyunc.com</strong>.</li>
     * <li>When testing this API operation, if a service unavailable error is returned, verify that the <strong>endpoint</strong> is correct. You can switch the <strong>service address</strong> to <strong>Dubai</strong> or <strong>India</strong> to change the <strong>endpoint</strong> to <strong>polardbx.aliyuncs.com</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group of an instance.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Note: </p>
     * <ul>
     * <li>The <strong>endpoint</strong> differs from other operations. Use <strong>polardbx.aliyuncs.com</strong> for Chinese mainland regions and Singapore. For other regions, use <strong>polardbx.{region id}.aliyunc.com</strong>.</li>
     * <li>When testing this API operation, if a service unavailable error is returned, verify that the <strong>endpoint</strong> is correct. You can switch the <strong>service address</strong> to <strong>Dubai</strong> or <strong>India</strong> to change the <strong>endpoint</strong> to <strong>polardbx.aliyuncs.com</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group of an instance.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a PolarDB-X instance is authorized to use Key Management Service (KMS).</p>
     * 
     * @param request CheckCloudResourceAuthorizedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckCloudResourceAuthorizedResponse
     */
    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCloudResourceAuthorized"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCloudResourceAuthorizedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a PolarDB-X instance is authorized to use Key Management Service (KMS).</p>
     * 
     * @param request CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a service health check.</p>
     * 
     * @param request CheckHealthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckHealthResponse
     */
    public CheckHealthResponse checkHealthWithOptions(CheckHealthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckHealth"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckHealthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a service health check.</p>
     * 
     * @param request CheckHealthRequest
     * @return CheckHealthResponse
     */
    public CheckHealthResponse checkHealth(CheckHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkHealthWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Simple Log Service charges fees for storage space, read traffic, number of requests, data transformation, and data delivery. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether SQL audit logs of a specified database instance have been successfully connected to Simple Log Service (SLS).
     * After the call, the system returns the connection status between the SQL audit feature and SLS for the current instance, the project and Logstore configuration information, and whether synchronization is normal.</p>
     * 
     * @param request CheckSqlAuditSlsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSqlAuditSlsStatusResponse
     */
    public CheckSqlAuditSlsStatusResponse checkSqlAuditSlsStatusWithOptions(CheckSqlAuditSlsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSqlAuditSlsStatus"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSqlAuditSlsStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Simple Log Service charges fees for storage space, read traffic, number of requests, data transformation, and data delivery. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Checks whether SQL audit logs of a specified database instance have been successfully connected to Simple Log Service (SLS).
     * After the call, the system returns the connection status between the SQL audit feature and SLS for the current instance, the project and Logstore configuration information, and whether synchronization is normal.</p>
     * 
     * @param request CheckSqlAuditSlsStatusRequest
     * @return CheckSqlAuditSlsStatusResponse
     */
    public CheckSqlAuditSlsStatusResponse checkSqlAuditSlsStatus(CheckSqlAuditSlsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSqlAuditSlsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Closes the database engine migration process for a specified instance. After you start a data migration task from another database (such as a self-managed MySQL database or an ApsaraDB RDS instance) to PolarDB-X, you can call this operation to safely stop the migration process if you need to terminate or clean up the migration state.</p>
     * 
     * @param request CloseEngineMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseEngineMigrationResponse
     */
    public CloseEngineMigrationResponse closeEngineMigrationWithOptions(CloseEngineMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continueEnableBinlog)) {
            query.put("ContinueEnableBinlog", request.continueEnableBinlog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseEngineMigration"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseEngineMigrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Closes the database engine migration process for a specified instance. After you start a data migration task from another database (such as a self-managed MySQL database or an ApsaraDB RDS instance) to PolarDB-X, you can call this operation to safely stop the migration process if you need to terminate or clean up the migration state.</p>
     * 
     * @param request CloseEngineMigrationRequest
     * @return CloseEngineMigrationResponse
     */
    public CloseEngineMigrationResponse closeEngineMigration(CloseEngineMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeEngineMigrationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Confirms that no active connections exist before a rollback task to ensure operation safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms that no active connections exist before performing a rollback switchover.</p>
     * 
     * @param request ConfirmNoConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmNoConnectionResponse
     */
    public ConfirmNoConnectionResponse confirmNoConnectionWithOptions(ConfirmNoConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmNoConnection"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmNoConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Confirms that no active connections exist before a rollback task to ensure operation safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms that no active connections exist before performing a rollback switchover.</p>
     * 
     * @param request ConfirmNoConnectionRequest
     * @return ConfirmNoConnectionResponse
     */
    public ConfirmNoConnectionResponse confirmNoConnection(ConfirmNoConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmNoConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account by calling the CreateAccount operation.</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account by calling the CreateAccount operation.</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the CreateBackup operation to create a backup.</p>
     * 
     * @param request CreateBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackup"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the CreateBackup operation to create a backup.</p>
     * 
     * @param request CreateBackupRequest
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;For more information about instance accounts, see <a href="https://help.aliyun.com/document_detail/172163.html">Account management</a>..</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom endpoint for a database instance.</p>
     * 
     * @param request CreateCustomEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomEndpointResponse
     */
    public CreateCustomEndpointResponse createCustomEndpointWithOptions(CreateCustomEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAutoEnter)) {
            query.put("NodeAutoEnter", request.nodeAutoEnter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeRole)) {
            query.put("NodeRole", request.nodeRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomEndpoint"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;For more information about instance accounts, see <a href="https://help.aliyun.com/document_detail/172163.html">Account management</a>..</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom endpoint for a database instance.</p>
     * 
     * @param request CreateCustomEndpointRequest
     * @return CreateCustomEndpointResponse
     */
    public CreateCustomEndpointResponse createCustomEndpoint(CreateCustomEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database by calling the CreateDB operation.</p>
     * 
     * @param request CreateDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBResponse
     */
    public CreateDBResponse createDBWithOptions(CreateDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.charset)) {
            query.put("Charset", request.charset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbDescription)) {
            query.put("DbDescription", request.dbDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePoolName)) {
            query.put("StoragePoolName", request.storagePoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDB"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database by calling the CreateDB operation.</p>
     * 
     * @param request CreateDBRequest
     * @return CreateDBResponse
     */
    public CreateDBResponse createDB(CreateDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateDBInstance operation to create a PolarDB-X instance.</p>
     * 
     * @param tmpReq CreateDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDBInstanceShrinkRequest request = new CreateDBInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraParams)) {
            request.extraParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraParams, "ExtraParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CNNodeCount)) {
            query.put("CNNodeCount", request.CNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnClass)) {
            query.put("CnClass", request.cnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeClass)) {
            query.put("DBNodeClass", request.DBNodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeCount)) {
            query.put("DBNodeCount", request.DBNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNNodeCount)) {
            query.put("DNNodeCount", request.DNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnClass)) {
            query.put("DnClass", request.dnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnStorageSpace)) {
            query.put("DnStorageSpace", request.dnStorageSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParamsShrink)) {
            query.put("ExtraParams", request.extraParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isColumnarReadDBInstance)) {
            query.put("IsColumnarReadDBInstance", request.isColumnarReadDBInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReadDBInstance)) {
            query.put("IsReadDBInstance", request.isReadDBInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originMinorVersion)) {
            query.put("OriginMinorVersion", request.originMinorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryDBInstanceName)) {
            query.put("PrimaryDBInstanceName", request.primaryDBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZone)) {
            query.put("PrimaryZone", request.primaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZone)) {
            query.put("SecondaryZone", request.secondaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tertiaryZone)) {
            query.put("TertiaryZone", request.tertiaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topologyType)) {
            query.put("TopologyType", request.topologyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateDBInstance operation to create a PolarDB-X instance.</p>
     * 
     * @param request CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a data import task that imports SQL or CSV files stored in OSS or ECS, or directly provided files, into a target database instance. By specifying the instance ID, database name, engine type, data source (such as an OSS path), and import type, the system performs data write operations asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data import task to import external data files, such as SQL scripts and CSV files, into a target database instance.</p>
     * 
     * @param request CreateDataImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataImportTaskResponse
     */
    public CreateDataImportTaskResponse createDataImportTaskWithOptions(CreateDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDb)) {
            query.put("DstDb", request.dstDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPassword)) {
            query.put("DstPassword", request.dstPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstResId)) {
            query.put("DstResId", request.dstResId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstUserName)) {
            query.put("DstUserName", request.dstUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDb)) {
            query.put("SrcDb", request.srcDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPassword)) {
            query.put("SrcPassword", request.srcPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcResId)) {
            query.put("SrcResId", request.srcResId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUserName)) {
            query.put("SrcUserName", request.srcUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataImportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a data import task that imports SQL or CSV files stored in OSS or ECS, or directly provided files, into a target database instance. By specifying the instance ID, database name, engine type, data source (such as an OSS path), and import type, the system performs data write operations asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data import task to import external data files, such as SQL scripts and CSV files, into a target database instance.</p>
     * 
     * @param request CreateDataImportTaskRequest
     * @return CreateDataImportTaskResponse
     */
    public CreateDataImportTaskResponse createDataImportTask(CreateDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI gateway consumer for a PolarDB-X instance.</p>
     * 
     * @param request CreateGatewayConsumerForPolarDBXRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayConsumerForPolarDBXResponse
     */
    public CreateGatewayConsumerForPolarDBXResponse createGatewayConsumerForPolarDBXWithOptions(CreateGatewayConsumerForPolarDBXRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayConsumerForPolarDBX"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayConsumerForPolarDBXResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI gateway consumer for a PolarDB-X instance.</p>
     * 
     * @param request CreateGatewayConsumerForPolarDBXRequest
     * @return CreateGatewayConsumerForPolarDBXResponse
     */
    public CreateGatewayConsumerForPolarDBXResponse createGatewayConsumerForPolarDBX(CreateGatewayConsumerForPolarDBXRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayConsumerForPolarDBXWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Global Database Network (GDN) instance.</p>
     * 
     * @param request CreateGdnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGdnInstanceResponse
     */
    public CreateGdnInstanceResponse createGdnInstanceWithOptions(CreateGdnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gdnMode)) {
            query.put("GdnMode", request.gdnMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rplConflictStrategy)) {
            query.put("RplConflictStrategy", request.rplConflictStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rplDmlStrategy)) {
            query.put("RplDmlStrategy", request.rplDmlStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rplSyncDdl)) {
            query.put("RplSyncDdl", request.rplSyncDdl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGdnInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGdnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Global Database Network (GDN) instance.</p>
     * 
     * @param request CreateGdnInstanceRequest
     * @return CreateGdnInstanceResponse
     */
    public CreateGdnInstanceResponse createGdnInstance(CreateGdnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGdnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;更多关于实例账号的信息，请参见<a href="https://help.aliyun.com/document_detail/172163.html">账号管理</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>创建GDN从实例</p>
     * 
     * @param request CreateGdnStandbyMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGdnStandbyMemberResponse
     */
    public CreateGdnStandbyMemberResponse createGdnStandbyMemberWithOptions(CreateGdnStandbyMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CNNodeCount)) {
            query.put("CNNodeCount", request.CNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloneInstanceName)) {
            query.put("CloneInstanceName", request.cloneInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnClass)) {
            query.put("CnClass", request.cnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNNodeCount)) {
            query.put("DNNodeCount", request.DNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnClass)) {
            query.put("DnClass", request.dnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZone)) {
            query.put("PrimaryZone", request.primaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZone)) {
            query.put("SecondaryZone", request.secondaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceRegion)) {
            query.put("SourceInstanceRegion", request.sourceInstanceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tertiaryZone)) {
            query.put("TertiaryZone", request.tertiaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topologyType)) {
            query.put("TopologyType", request.topologyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGdnStandbyMember"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGdnStandbyMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;更多关于实例账号的信息，请参见<a href="https://help.aliyun.com/document_detail/172163.html">账号管理</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>创建GDN从实例</p>
     * 
     * @param request CreateGdnStandbyMemberRequest
     * @return CreateGdnStandbyMemberResponse
     */
    public CreateGdnStandbyMemberResponse createGdnStandbyMember(CreateGdnStandbyMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGdnStandbyMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;For more information about instance accounts, see <a href="https://help.aliyun.com/document_detail/172163.html">Account management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable Memory Engine</p>
     * 
     * @param request CreateMem0Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMem0Response
     */
    public CreateMem0Response createMem0WithOptions(CreateMem0Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMem0"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMem0Response());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;For more information about instance accounts, see <a href="https://help.aliyun.com/document_detail/172163.html">Account management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable Memory Engine</p>
     * 
     * @param request CreateMem0Request
     * @return CreateMem0Response
     */
    public CreateMem0Response createMem0(CreateMem0Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMem0WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Creates a Supabase instance.</p>
     * 
     * @param request CreatePolardbxSupabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolardbxSupabaseInstanceResponse
     */
    public CreatePolardbxSupabaseInstanceResponse createPolardbxSupabaseInstanceWithOptions(CreatePolardbxSupabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardPassword)) {
            query.put("DashboardPassword", request.dashboardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceDescription)) {
            query.put("DbInstanceDescription", request.dbInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPassword)) {
            query.put("DbPassword", request.dbPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantMode)) {
            query.put("TenantMode", request.tenantMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolardbxSupabaseInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolardbxSupabaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Creates a Supabase instance.</p>
     * 
     * @param request CreatePolardbxSupabaseInstanceRequest
     * @return CreatePolardbxSupabaseInstanceResponse
     */
    public CreatePolardbxSupabaseInstanceResponse createPolardbxSupabaseInstance(CreatePolardbxSupabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolardbxSupabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the data synchronization phase, proactively initiates a diagnostic task for the replication task to check for issues such as latency, replication interruption, or data inconsistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a health check on the replication task during data migration.</p>
     * 
     * @param request CreateRplInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRplInspectionTaskResponse
     */
    public CreateRplInspectionTaskResponse createRplInspectionTaskWithOptions(CreateRplInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstDb)) {
            query.put("DstDb", request.dstDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPassword)) {
            query.put("DstPassword", request.dstPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstResId)) {
            query.put("DstResId", request.dstResId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstUserName)) {
            query.put("DstUserName", request.dstUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPassword)) {
            query.put("SrcPassword", request.srcPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUserName)) {
            query.put("SrcUserName", request.srcUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRplInspectionTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRplInspectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>During the data synchronization phase, proactively initiates a diagnostic task for the replication task to check for issues such as latency, replication interruption, or data inconsistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a health check on the replication task during data migration.</p>
     * 
     * @param request CreateRplInspectionTaskRequest
     * @return CreateRplInspectionTaskResponse
     */
    public CreateRplInspectionTaskResponse createRplInspectionTask(CreateRplInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRplInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a SQL statement assessment task. You submit SQL statements through this operation, and the system performs static analysis and risk assessment to identify execution risks and compatibility issues on the target database instance.</p>
     * 
     * @param request CreateSQLEvaluateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSQLEvaluateTaskResponse
     */
    public CreateSQLEvaluateTaskResponse createSQLEvaluateTaskWithOptions(CreateSQLEvaluateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDb)) {
            query.put("DstDb", request.dstDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPassword)) {
            query.put("DstPassword", request.dstPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstResId)) {
            query.put("DstResId", request.dstResId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstUserName)) {
            query.put("DstUserName", request.dstUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskDesc)) {
            query.put("SlinkTaskDesc", request.slinkTaskDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDb)) {
            query.put("SrcDb", request.srcDb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPassword)) {
            query.put("SrcPassword", request.srcPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcResId)) {
            query.put("SrcResId", request.srcResId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcResType)) {
            query.put("SrcResType", request.srcResType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUserName)) {
            query.put("SrcUserName", request.srcUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSQLEvaluateTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSQLEvaluateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a SQL statement assessment task. You submit SQL statements through this operation, and the system performs static analysis and risk assessment to identify execution risks and compatibility issues on the target database instance.</p>
     * 
     * @param request CreateSQLEvaluateTaskRequest
     * @return CreateSQLEvaluateTaskResponse
     */
    public CreateSQLEvaluateTaskResponse createSQLEvaluateTask(CreateSQLEvaluateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSQLEvaluateTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource storage pool.</p>
     * 
     * @param request CreateStoragePoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoragePoolResponse
     */
    public CreateStoragePoolResponse createStoragePoolWithOptions(CreateStoragePoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePoolDNList)) {
            query.put("StoragePoolDNList", request.storagePoolDNList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePoolName)) {
            query.put("StoragePoolName", request.storagePoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStoragePool"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStoragePoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource storage pool.</p>
     * 
     * @param request CreateStoragePoolRequest
     * @return CreateStoragePoolResponse
     */
    public CreateStoragePoolResponse createStoragePool(CreateStoragePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStoragePoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database schema import task. This operation allows you to import SQL script files or text content that contains DDL statements into a target database instance, and automatically performs schema operations such as creating tables, indexes, views, and stored procedures.</p>
     * 
     * @param request CreateStructureImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStructureImportTaskResponse
     */
    public CreateStructureImportTaskResponse createStructureImportTaskWithOptions(CreateStructureImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStructureImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStructureImportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database schema import task. This operation allows you to import SQL script files or text content that contains DDL statements into a target database instance, and automatically performs schema operations such as creating tables, indexes, views, and stored procedures.</p>
     * 
     * @param request CreateStructureImportTaskRequest
     * @return CreateStructureImportTaskResponse
     */
    public CreateStructureImportTaskResponse createStructureImportTask(CreateStructureImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStructureImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom endpoint.</p>
     * 
     * @param request CreateSubCNInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubCNInstanceResponse
     */
    public CreateSubCNInstanceResponse createSubCNInstanceWithOptions(CreateSubCNInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoCreate)) {
            query.put("IsAutoCreate", request.isAutoCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readType)) {
            query.put("ReadType", request.readType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubCNInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubCNInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom endpoint.</p>
     * 
     * @param request CreateSubCNInstanceRequest
     * @return CreateSubCNInstanceResponse
     */
    public CreateSubCNInstanceResponse createSubCNInstance(CreateSubCNInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubCNInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Enables the public endpoint for a Supabase instance.</p>
     * 
     * @param request CreateSupabaseNetTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSupabaseNetTypeResponse
     */
    public CreateSupabaseNetTypeResponse createSupabaseNetTypeWithOptions(CreateSupabaseNetTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSupabaseNetType"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSupabaseNetTypeResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Enables the public endpoint for a Supabase instance.</p>
     * 
     * @param request CreateSupabaseNetTypeRequest
     * @return CreateSupabaseNetTypeResponse
     */
    public CreateSupabaseNetTypeResponse createSupabaseNetType(CreateSupabaseNetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSupabaseNetTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a privileged user. Each instance can have only one privileged user.</p>
     * 
     * @param request CreateSuperAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSuperAccountResponse
     */
    public CreateSuperAccountResponse createSuperAccountWithOptions(CreateSuperAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSuperAccount"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSuperAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a privileged user. Each instance can have only one privileged user.</p>
     * 
     * @param request CreateSuperAccountRequest
     * @return CreateSuperAccountResponse
     */
    public CreateSuperAccountResponse createSuperAccount(CreateSuperAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSuperAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a conversion task to change a specific status or configuration of an instance.</p>
     * 
     * @param request CreateTransformOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransformOperationResponse
     */
    public CreateTransformOperationResponse createTransformOperationWithOptions(CreateTransformOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransformOperation"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransformOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a conversion task to change a specific status or configuration of an instance.</p>
     * 
     * @param request CreateTransformOperationRequest
     * @return CreateTransformOperationResponse
     */
    public CreateTransformOperationResponse createTransformOperation(CreateTransformOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransformOperationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an account by calling the DeleteAccount operation.</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an account by calling the DeleteAccount operation.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables access through the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom endpoint domain name.</p>
     * 
     * @param request DeleteCustomEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomEndpointResponse
     */
    public DeleteCustomEndpointResponse deleteCustomEndpointWithOptions(DeleteCustomEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customEndpointId)) {
            query.put("CustomEndpointId", request.customEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomEndpoint"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables access through the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom endpoint domain name.</p>
     * 
     * @param request DeleteCustomEndpointRequest
     * @return DeleteCustomEndpointResponse
     */
    public DeleteCustomEndpointResponse deleteCustomEndpoint(DeleteCustomEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database by calling the DeleteDB operation.</p>
     * 
     * @param request DeleteDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBResponse
     */
    public DeleteDBResponse deleteDBWithOptions(DeleteDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDB"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database by calling the DeleteDB operation.</p>
     * 
     * @param request DeleteDBRequest
     * @return DeleteDBResponse
     */
    public DeleteDBResponse deleteDB(DeleteDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DeleteDBInstance operation to delete an instance.</p>
     * 
     * @param request DeleteDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DeleteDBInstance operation to delete an instance.</p>
     * 
     * @param request DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a created evaluation task and performs subsequent data import operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an evaluation import task.</p>
     * 
     * @param request DeleteEvaluateAndImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEvaluateAndImportTaskResponse
     */
    public DeleteEvaluateAndImportTaskResponse deleteEvaluateAndImportTaskWithOptions(DeleteEvaluateAndImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvaluateAndImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEvaluateAndImportTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a created evaluation task and performs subsequent data import operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an evaluation import task.</p>
     * 
     * @param request DeleteEvaluateAndImportTaskRequest
     * @return DeleteEvaluateAndImportTaskResponse
     */
    public DeleteEvaluateAndImportTaskResponse deleteEvaluateAndImportTask(DeleteEvaluateAndImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEvaluateAndImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global database network (GDN) instance.</p>
     * 
     * @param request DeleteGdnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGdnInstanceResponse
     */
    public DeleteGdnInstanceResponse deleteGdnInstanceWithOptions(DeleteGdnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gdnInstanceName)) {
            query.put("GdnInstanceName", request.gdnInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGdnInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGdnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global database network (GDN) instance.</p>
     * 
     * @param request DeleteGdnInstanceRequest
     * @return DeleteGdnInstanceResponse
     */
    public DeleteGdnInstanceResponse deleteGdnInstance(DeleteGdnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGdnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables the access entry for the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the memory engine.</p>
     * 
     * @param request DeleteMem0Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMem0Response
     */
    public DeleteMem0Response deleteMem0WithOptions(DeleteMem0Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMem0"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMem0Response());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables the access entry for the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the memory engine.</p>
     * 
     * @param request DeleteMem0Request
     * @return DeleteMem0Response
     */
    public DeleteMem0Response deleteMem0(DeleteMem0Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMem0WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Supabase instance.</p>
     * 
     * @param request DeletePolardbxSupabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolardbxSupabaseInstanceResponse
     */
    public DeletePolardbxSupabaseInstanceResponse deletePolardbxSupabaseInstanceWithOptions(DeletePolardbxSupabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolardbxSupabaseInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolardbxSupabaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Supabase instance.</p>
     * 
     * @param request DeletePolardbxSupabaseInstanceRequest
     * @return DeletePolardbxSupabaseInstanceResponse
     */
    public DeletePolardbxSupabaseInstanceResponse deletePolardbxSupabaseInstance(DeletePolardbxSupabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolardbxSupabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>删除自定义地址</p>
     * 
     * @param request DeleteSubCNInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubCNInstanceResponse
     */
    public DeleteSubCNInstanceResponse deleteSubCNInstanceWithOptions(DeleteSubCNInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterName)) {
            query.put("InstanceClusterName", request.instanceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubCNInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubCNInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>删除自定义地址</p>
     * 
     * @param request DeleteSubCNInstanceRequest
     * @return DeleteSubCNInstanceResponse
     */
    public DeleteSubCNInstanceResponse deleteSubCNInstance(DeleteSubCNInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubCNInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoint of a Supabase instance.</p>
     * 
     * @param request DeleteSupabaseNetTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSupabaseNetTypeResponse
     */
    public DeleteSupabaseNetTypeResponse deleteSupabaseNetTypeWithOptions(DeleteSupabaseNetTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSupabaseNetType"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSupabaseNetTypeResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoint of a Supabase instance.</p>
     * 
     * @param request DeleteSupabaseNetTypeRequest
     * @return DeleteSupabaseNetTypeResponse
     */
    public DeleteSupabaseNetTypeResponse deleteSupabaseNetType(DeleteSupabaseNetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSupabaseNetTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of accounts by calling the DescribeAccountList operation.</p>
     * 
     * @param request DescribeAccountListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountListResponse
     */
    public DescribeAccountListResponse describeAccountListWithOptions(DescribeAccountListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of accounts by calling the DescribeAccountList operation.</p>
     * 
     * @param request DescribeAccountListRequest
     * @return DescribeAccountListResponse
     */
    public DescribeAccountListResponse describeAccountList(DescribeAccountListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeActiveOperationMaintainConf operation to display the O&amp;M window configuration.</p>
     * 
     * @param request DescribeActiveOperationMaintainConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveOperationMaintainConfResponse
     */
    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConfWithOptions(DescribeActiveOperationMaintainConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationMaintainConf"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationMaintainConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeActiveOperationMaintainConf operation to display the O&amp;M window configuration.</p>
     * 
     * @param request DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    public DescribeActiveOperationMaintainConfResponse describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationMaintainConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the total number of O&amp;M events.</p>
     * 
     * @param request DescribeActiveOperationTaskCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveOperationTaskCountResponse
     */
    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCountWithOptions(DescribeActiveOperationTaskCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTaskCount"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTaskCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the total number of O&amp;M events.</p>
     * 
     * @param request DescribeActiveOperationTaskCountRequest
     * @return DescribeActiveOperationTaskCountResponse
     */
    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTaskCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries O&amp;M events by calling the DescribeActiveOperationTasks operation.</p>
     * 
     * @param request DescribeActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveOperationTasksResponse
     */
    public DescribeActiveOperationTasksResponse describeActiveOperationTasksWithOptions(DescribeActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTasks"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries O&amp;M events by calling the DescribeActiveOperationTasks operation.</p>
     * 
     * @param request DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    public DescribeActiveOperationTasksResponse describeActiveOperationTasks(DescribeActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists cold storage tables.</p>
     * 
     * @param request DescribeArchiveTableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeArchiveTableListResponse
     */
    public DescribeArchiveTableListResponse describeArchiveTableListWithOptions(DescribeArchiveTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeArchiveTableList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeArchiveTableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists cold storage tables.</p>
     * 
     * @param request DescribeArchiveTableListRequest
     * @return DescribeArchiveTableListResponse
     */
    public DescribeArchiveTableListResponse describeArchiveTableList(DescribeArchiveTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeArchiveTableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available regions that support cross-region operations, typically used for multi-region deployment or data replication scenarios.</p>
     * 
     * @param request DescribeAvailableCrossRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableCrossRegionsResponse
     */
    public DescribeAvailableCrossRegionsResponse describeAvailableCrossRegionsWithOptions(DescribeAvailableCrossRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableCrossRegions"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableCrossRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available regions that support cross-region operations, typically used for multi-region deployment or data replication scenarios.</p>
     * 
     * @param request DescribeAvailableCrossRegionsRequest
     * @return DescribeAvailableCrossRegionsResponse
     */
    public DescribeAvailableCrossRegionsResponse describeAvailableCrossRegions(DescribeAvailableCrossRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableCrossRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeBackupPolicy operation to query the backup settings of an instance.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeBackupPolicy operation to query the backup settings of an instance.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a backup set by calling the DescribeBackupSet operation.</p>
     * 
     * @param request DescribeBackupSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupSetResponse
     */
    public DescribeBackupSetResponse describeBackupSetWithOptions(DescribeBackupSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCrossRegion)) {
            query.put("DestCrossRegion", request.destCrossRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupSet"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a backup set by calling the DescribeBackupSet operation.</p>
     * 
     * @param request DescribeBackupSetRequest
     * @return DescribeBackupSetResponse
     */
    public DescribeBackupSetResponse describeBackupSet(DescribeBackupSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeBackupSetList operation to query the list of backup sets.</p>
     * 
     * @param request DescribeBackupSetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupSetListResponse
     */
    public DescribeBackupSetListResponse describeBackupSetListWithOptions(DescribeBackupSetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupSetList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeBackupSetList operation to query the list of backup sets.</p>
     * 
     * @param request DescribeBackupSetListRequest
     * @return DescribeBackupSetListResponse
     */
    public DescribeBackupSetListResponse describeBackupSetList(DescribeBackupSetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binlog files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose record end time is after the query start time and whose record start time is before the query end time.</li>
     * <li>When the DownloadLink is not NULL, you can use this URL to download the backup file. This URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DescribeBinaryLogList operation to query binlog logs.</p>
     * 
     * @param request DescribeBinaryLogListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBinaryLogListResponse
     */
    public DescribeBinaryLogListResponse describeBinaryLogListWithOptions(DescribeBinaryLogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBinaryLogList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBinaryLogListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binlog files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose record end time is after the query start time and whose record start time is before the query end time.</li>
     * <li>When the DownloadLink is not NULL, you can use this URL to download the backup file. This URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DescribeBinaryLogList operation to query binlog logs.</p>
     * 
     * @param request DescribeBinaryLogListRequest
     * @return DescribeBinaryLogListResponse
     */
    public DescribeBinaryLogListResponse describeBinaryLogList(DescribeBinaryLogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBinaryLogListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. This URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of instance specifications.</p>
     * 
     * @param request DescribeCdcClassListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdcClassListResponse
     */
    public DescribeCdcClassListResponse describeCdcClassListWithOptions(DescribeCdcClassListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdcClassList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdcClassListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. This URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of instance specifications.</p>
     * 
     * @param request DescribeCdcClassListRequest
     * @return DescribeCdcClassListResponse
     */
    public DescribeCdcClassListResponse describeCdcClassList(DescribeCdcClassListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdcClassListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CDC information.</p>
     * 
     * @param request DescribeCdcInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdcInfoResponse
     */
    public DescribeCdcInfoResponse describeCdcInfoWithOptions(DescribeCdcInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdcInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdcInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries CDC information.</p>
     * 
     * @param request DescribeCdcInfoRequest
     * @return DescribeCdcInfoResponse
     */
    public DescribeCdcInfoResponse describeCdcInfo(DescribeCdcInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdcInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>When DownloadLink is not NULL, you can download the backup file from this URL. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of CDC versions.</p>
     * 
     * @param request DescribeCdcVersionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdcVersionListResponse
     */
    public DescribeCdcVersionListResponse describeCdcVersionListWithOptions(DescribeCdcVersionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdcVersionList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdcVersionListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>When DownloadLink is not NULL, you can download the backup file from this URL. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of CDC versions.</p>
     * 
     * @param request DescribeCdcVersionListRequest
     * @return DescribeCdcVersionListResponse
     */
    public DescribeCdcVersionListResponse describeCdcVersionList(DescribeCdcVersionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdcVersionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the DescribeCharacterSet operation to query the character set types supported by databases in a target instance.</p>
     * 
     * @param request DescribeCharacterSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCharacterSetResponse
     */
    public DescribeCharacterSetResponse describeCharacterSetWithOptions(DescribeCharacterSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCharacterSet"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCharacterSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the DescribeCharacterSet operation to query the character set types supported by databases in a target instance.</p>
     * 
     * @param request DescribeCharacterSetRequest
     * @return DescribeCharacterSetResponse
     */
    public DescribeCharacterSetResponse describeCharacterSet(DescribeCharacterSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCharacterSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The cold storage basic information.</p>
     * 
     * @param request DescribeColdDataBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColdDataBasicInfoResponse
     */
    public DescribeColdDataBasicInfoResponse describeColdDataBasicInfoWithOptions(DescribeColdDataBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColdDataBasicInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColdDataBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The cold storage basic information.</p>
     * 
     * @param request DescribeColdDataBasicInfoRequest
     * @return DescribeColdDataBasicInfoResponse
     */
    public DescribeColdDataBasicInfoResponse describeColdDataBasicInfo(DescribeColdDataBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColdDataBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of column store specifications for an instance.</p>
     * 
     * @param request DescribeColumnarClassListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnarClassListResponse
     */
    public DescribeColumnarClassListResponse describeColumnarClassListWithOptions(DescribeColumnarClassListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumnarClassList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnarClassListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of column store specifications for an instance.</p>
     * 
     * @param request DescribeColumnarClassListRequest
     * @return DescribeColumnarClassListResponse
     */
    public DescribeColumnarClassListResponse describeColumnarClassList(DescribeColumnarClassListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnarClassListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries column store information.</p>
     * 
     * @param request DescribeColumnarInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnarInfoResponse
     */
    public DescribeColumnarInfoResponse describeColumnarInfoWithOptions(DescribeColumnarInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumnarInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnarInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries column store information.</p>
     * 
     * @param request DescribeColumnarInfoRequest
     * @return DescribeColumnarInfoResponse
     */
    public DescribeColumnarInfoResponse describeColumnarInfo(DescribeColumnarInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnarInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>When DownloadLink is not NULL, you can download the backup file from this URL. This URL is valid for 2 days after it is generated. Download the file before the expiration time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries column store version information.</p>
     * 
     * @param request DescribeColumnarVersionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnarVersionListResponse
     */
    public DescribeColumnarVersionListResponse describeColumnarVersionListWithOptions(DescribeColumnarVersionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumnarVersionList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnarVersionListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is after the query start time and whose log record start time is before the query end time.</li>
     * <li>When DownloadLink is not NULL, you can download the backup file from this URL. This URL is valid for 2 days after it is generated. Download the file before the expiration time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries column store version information.</p>
     * 
     * @param request DescribeColumnarVersionListRequest
     * @return DescribeColumnarVersionListResponse
     */
    public DescribeColumnarVersionListResponse describeColumnarVersionList(DescribeColumnarVersionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnarVersionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the property information of a specified component, including property names and types.</p>
     * 
     * @param request DescribeComponentPropetiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentPropetiesResponse
     */
    public DescribeComponentPropetiesResponse describeComponentPropetiesWithOptions(DescribeComponentPropetiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentPropeties"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentPropetiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the property information of a specified component, including property names and types.</p>
     * 
     * @param request DescribeComponentPropetiesRequest
     * @return DescribeComponentPropetiesResponse
     */
    public DescribeComponentPropetiesResponse describeComponentPropeties(DescribeComponentPropetiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentPropetiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of custom endpoints configured by the user. You can use this operation to manage and view the settings of private connections or VPC endpoint services.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of custom endpoints defined by the user.</p>
     * 
     * @param request DescribeCustomEndpointListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomEndpointListResponse
     */
    public DescribeCustomEndpointListResponse describeCustomEndpointListWithOptions(DescribeCustomEndpointListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkDeleteCN)) {
            query.put("CheckDeleteCN", request.checkDeleteCN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEndpointIds)) {
            query.put("CustomEndpointIds", request.customEndpointIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomEndpointList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomEndpointListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of custom endpoints configured by the user. You can use this operation to manage and view the settings of private connections or VPC endpoint services.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of custom endpoints defined by the user.</p>
     * 
     * @param request DescribeCustomEndpointListRequest
     * @return DescribeCustomEndpointListResponse
     */
    public DescribeCustomEndpointListResponse describeCustomEndpointList(DescribeCustomEndpointListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEndpointListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceAttribute operation to retrieve instance attributes.</p>
     * 
     * @param request DescribeDBInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceAttributeResponse
     */
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceAttribute"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceAttribute operation to retrieve instance attributes.</p>
     * 
     * @param request DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceConfig operation to retrieve the configuration parameters of an instance.</p>
     * 
     * @param request DescribeDBInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceConfigResponse
     */
    public DescribeDBInstanceConfigResponse describeDBInstanceConfigWithOptions(DescribeDBInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceConfig"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceConfig operation to retrieve the configuration parameters of an instance.</p>
     * 
     * @param request DescribeDBInstanceConfigRequest
     * @return DescribeDBInstanceConfigResponse
     */
    public DescribeDBInstanceConfigResponse describeDBInstanceConfig(DescribeDBInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>该接口用于获取用户已配置的自定义终端节点（Endpoint）列表，便于管理和查看私有连接或VPC终端服务的设置。</p>
     * 
     * <b>summary</b> : 
     * <p>查询endpoint列表</p>
     * 
     * @param request DescribeDBInstanceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceEndpointResponse
     */
    public DescribeDBInstanceEndpointResponse describeDBInstanceEndpointWithOptions(DescribeDBInstanceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceEndpoint"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>该接口用于获取用户已配置的自定义终端节点（Endpoint）列表，便于管理和查看私有连接或VPC终端服务的设置。</p>
     * 
     * <b>summary</b> : 
     * <p>查询endpoint列表</p>
     * 
     * @param request DescribeDBInstanceEndpointRequest
     * @return DescribeDBInstanceEndpointResponse
     */
    public DescribeDBInstanceEndpointResponse describeDBInstanceEndpoint(DescribeDBInstanceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the high availability (HA) information of an instance.</p>
     * 
     * @param request DescribeDBInstanceHARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceHAResponse
     */
    public DescribeDBInstanceHAResponse describeDBInstanceHAWithOptions(DescribeDBInstanceHARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceHA"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceHAResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the high availability (HA) information of an instance.</p>
     * 
     * @param request DescribeDBInstanceHARequest
     * @return DescribeDBInstanceHAResponse
     */
    public DescribeDBInstanceHAResponse describeDBInstanceHA(DescribeDBInstanceHARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceHAWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Views SSL information.</p>
     * 
     * @param request DescribeDBInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceSSL"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Views SSL information.</p>
     * 
     * @param request DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceTDE operation to retrieve the details of Transparent Data Encryption (TDE) for an instance.</p>
     * 
     * @param request DescribeDBInstanceTDERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceTDEResponse
     */
    public DescribeDBInstanceTDEResponse describeDBInstanceTDEWithOptions(DescribeDBInstanceTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceTDE"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceTDEResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceTDE operation to retrieve the details of Transparent Data Encryption (TDE) for an instance.</p>
     * 
     * @param request DescribeDBInstanceTDERequest
     * @return DescribeDBInstanceTDEResponse
     */
    public DescribeDBInstanceTDEResponse describeDBInstanceTDE(DescribeDBInstanceTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceTDEWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceTopology operation to retrieve the topology information of an instance.</p>
     * 
     * @param request DescribeDBInstanceTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceTopologyResponse
     */
    public DescribeDBInstanceTopologyResponse describeDBInstanceTopologyWithOptions(DescribeDBInstanceTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minuteSimple)) {
            query.put("MinuteSimple", request.minuteSimple);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceTopology"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceTopologyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstanceTopology operation to retrieve the topology information of an instance.</p>
     * 
     * @param request DescribeDBInstanceTopologyRequest
     * @return DescribeDBInstanceTopologyResponse
     */
    public DescribeDBInstanceTopologyResponse describeDBInstanceTopology(DescribeDBInstanceTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceTopologyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information about an instance by using the endpoint of the instance.</p>
     * 
     * @param request DescribeDBInstanceViaEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceViaEndpointResponse
     */
    public DescribeDBInstanceViaEndpointResponse describeDBInstanceViaEndpointWithOptions(DescribeDBInstanceViaEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceViaEndpoint"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceViaEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information about an instance by using the endpoint of the instance.</p>
     * 
     * @param request DescribeDBInstanceViaEndpointRequest
     * @return DescribeDBInstanceViaEndpointResponse
     */
    public DescribeDBInstanceViaEndpointResponse describeDBInstanceViaEndpoint(DescribeDBInstanceViaEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceViaEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstances operation to query a list of instances.</p>
     * 
     * @param request DescribeDBInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbVersion)) {
            query.put("DbVersion", request.dbVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mustHasCdc)) {
            query.put("MustHasCdc", request.mustHasCdc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstances"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDBInstances operation to query a list of instances.</p>
     * 
     * @param request DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note: </p>
     * <ul>
     * <li>The <strong>endpoint</strong> differs from other API operations. Use <strong>polardbx.aliyuncs.com</strong> for Chinese regions and Singapore. For other regions, use <strong>polardbx.{region id}.aliyunc.com</strong>.</li>
     * <li>When debugging this API operation, if a service not active error is returned, confirm that the <strong>endpoint</strong> is correct. You can switch the <strong>service address</strong> to <strong>Dubai</strong> or <strong>India</strong> and change the <strong>endpoint</strong> to <strong>polardbx.aliyuncs.com</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an instance by calling the DescribeDBNodePerformance operation.</p>
     * 
     * @param request DescribeDBNodePerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBNodePerformanceResponse
     */
    public DescribeDBNodePerformanceResponse describeDBNodePerformanceWithOptions(DescribeDBNodePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeRole)) {
            query.put("DBNodeRole", request.DBNodeRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBNodePerformance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBNodePerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Note: </p>
     * <ul>
     * <li>The <strong>endpoint</strong> differs from other API operations. Use <strong>polardbx.aliyuncs.com</strong> for Chinese regions and Singapore. For other regions, use <strong>polardbx.{region id}.aliyunc.com</strong>.</li>
     * <li>When debugging this API operation, if a service not active error is returned, confirm that the <strong>endpoint</strong> is correct. You can switch the <strong>service address</strong> to <strong>Dubai</strong> or <strong>India</strong> and change the <strong>endpoint</strong> to <strong>polardbx.aliyuncs.com</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an instance by calling the DescribeDBNodePerformance operation.</p>
     * 
     * @param request DescribeDBNodePerformanceRequest
     * @return DescribeDBNodePerformanceResponse
     */
    public DescribeDBNodePerformanceResponse describeDBNodePerformance(DescribeDBNodePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBNodePerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of a data import task.</p>
     * 
     * @param request DescribeDataImportTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataImportTaskInfoResponse
     */
    public DescribeDataImportTaskInfoResponse describeDataImportTaskInfoWithOptions(DescribeDataImportTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.failPageNumber)) {
            query.put("FailPageNumber", request.failPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failPageSize)) {
            query.put("FailPageSize", request.failPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successPageNumber)) {
            query.put("SuccessPageNumber", request.successPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successPageSize)) {
            query.put("SuccessPageSize", request.successPageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataImportTaskInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataImportTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of a data import task.</p>
     * 
     * @param request DescribeDataImportTaskInfoRequest
     * @return DescribeDataImportTaskInfoResponse
     */
    public DescribeDataImportTaskInfoResponse describeDataImportTaskInfo(DescribeDataImportTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataImportTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of databases by calling the DescribeDbList operation.</p>
     * 
     * @param request DescribeDbListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbListResponse
     */
    public DescribeDbListResponse describeDbListWithOptions(DescribeDbListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of databases by calling the DescribeDbList operation.</p>
     * 
     * @param request DescribeDbListRequest
     * @return DescribeDbListResponse
     */
    public DescribeDbListResponse describeDbList(DescribeDbListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDistributeTableList operation to retrieve the list of database tables.</p>
     * 
     * @param request DescribeDistributeTableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDistributeTableListResponse
     */
    public DescribeDistributeTableListResponse describeDistributeTableListWithOptions(DescribeDistributeTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDistributeTableList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDistributeTableListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeDistributeTableList operation to retrieve the list of database tables.</p>
     * 
     * @param request DescribeDistributeTableListRequest
     * @return DescribeDistributeTableListResponse
     */
    public DescribeDistributeTableListResponse describeDistributeTableList(DescribeDistributeTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDistributeTableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the currently enabled cross-zone configurations.</p>
     * 
     * @param request DescribeEnabledCrossRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnabledCrossRegionsResponse
     */
    public DescribeEnabledCrossRegionsResponse describeEnabledCrossRegionsWithOptions(DescribeEnabledCrossRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnabledCrossRegions"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnabledCrossRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the currently enabled cross-zone configurations.</p>
     * 
     * @param request DescribeEnabledCrossRegionsRequest
     * @return DescribeEnabledCrossRegionsResponse
     */
    public DescribeEnabledCrossRegionsResponse describeEnabledCrossRegions(DescribeEnabledCrossRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnabledCrossRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of PolarDB-X assessment import tasks. (Single).</p>
     * 
     * @param request DescribeEvaluateAndImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEvaluateAndImportTaskResponse
     */
    public DescribeEvaluateAndImportTaskResponse describeEvaluateAndImportTaskWithOptions(DescribeEvaluateAndImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvaluateAndImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEvaluateAndImportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of PolarDB-X assessment import tasks. (Single).</p>
     * 
     * @param request DescribeEvaluateAndImportTaskRequest
     * @return DescribeEvaluateAndImportTaskResponse
     */
    public DescribeEvaluateAndImportTaskResponse describeEvaluateAndImportTask(DescribeEvaluateAndImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluateAndImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a data import task. You can use this operation to import SQL or CSV files stored in OSS or ECS, or directly provided files, into a destination database instance. By specifying the instance ID, database name, engine type, data source (such as an OSS path), and import type, the system performs data write operations asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of assessment import tasks for PolarDB-X.</p>
     * 
     * @param request DescribeEvaluateAndImportTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEvaluateAndImportTasksResponse
     */
    public DescribeEvaluateAndImportTasksResponse describeEvaluateAndImportTasksWithOptions(DescribeEvaluateAndImportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvaluateAndImportTasks"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEvaluateAndImportTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a data import task. You can use this operation to import SQL or CSV files stored in OSS or ECS, or directly provided files, into a destination database instance. By specifying the instance ID, database name, engine type, data source (such as an OSS path), and import type, the system performs data write operations asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of assessment import tasks for PolarDB-X.</p>
     * 
     * @param request DescribeEvaluateAndImportTasksRequest
     * @return DescribeEvaluateAndImportTasksResponse
     */
    public DescribeEvaluateAndImportTasksResponse describeEvaluateAndImportTasks(DescribeEvaluateAndImportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluateAndImportTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves historical events.</p>
     * 
     * @param request DescribeEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves historical events.</p>
     * 
     * @param request DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of global database network (GDN) instances.</p>
     * 
     * @param request DescribeGdnInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGdnInstancesResponse
     */
    public DescribeGdnInstancesResponse describeGdnInstancesWithOptions(DescribeGdnInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            query.put("FilterType", request.filterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterValue)) {
            query.put("FilterValue", request.filterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGdnInstances"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGdnInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of global database network (GDN) instances.</p>
     * 
     * @param request DescribeGdnInstancesRequest
     * @return DescribeGdnInstancesResponse
     */
    public DescribeGdnInstancesResponse describeGdnInstances(DescribeGdnInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGdnInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Log Service charges fees for storage space, read traffic, the number of requests, data transformation, and data shipping. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>View Memory Engine Information</p>
     * 
     * @param request DescribeMem0InfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMem0InfoResponse
     */
    public DescribeMem0InfoResponse describeMem0InfoWithOptions(DescribeMem0InfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMem0Info"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMem0InfoResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Log Service charges fees for storage space, read traffic, the number of requests, data transformation, and data shipping. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>View Memory Engine Information</p>
     * 
     * @param request DescribeMem0InfoRequest
     * @return DescribeMem0InfoResponse
     */
    public DescribeMem0InfoResponse describeMem0Info(DescribeMem0InfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMem0InfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Log Service charges fees for storage space, read traffic, number of requests, data processing, and data shipping. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL Audit and Analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of a memory engine.</p>
     * 
     * @param request DescribeMem0SecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMem0SecurityIpsResponse
     */
    public DescribeMem0SecurityIpsResponse describeMem0SecurityIpsWithOptions(DescribeMem0SecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMem0SecurityIps"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMem0SecurityIpsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Log Service charges fees for storage space, read traffic, number of requests, data processing, and data shipping. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL Audit and Analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of a memory engine.</p>
     * 
     * @param request DescribeMem0SecurityIpsRequest
     * @return DescribeMem0SecurityIpsResponse
     */
    public DescribeMem0SecurityIpsResponse describeMem0SecurityIps(DescribeMem0SecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMem0SecurityIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exposes instance topology information and download links for commercial backup sets to support offline restoration of cloud instances.</p>
     * 
     * @param request DescribeOpenBackupSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpenBackupSetResponse
     */
    public DescribeOpenBackupSetResponse describeOpenBackupSetWithOptions(DescribeOpenBackupSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpenBackupSet"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpenBackupSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exposes instance topology information and download links for commercial backup sets to support offline restoration of cloud instances.</p>
     * 
     * @param request DescribeOpenBackupSetRequest
     * @return DescribeOpenBackupSetResponse
     */
    public DescribeOpenBackupSetResponse describeOpenBackupSet(DescribeOpenBackupSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpenBackupSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of database parameter templates created by users or supported by the system, including basic information, associated engine types, and modification times of each parameter template.</p>
     * 
     * @param request DescribeParameterGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParameterGroupsResponse
     */
    public DescribeParameterGroupsResponse describeParameterGroupsWithOptions(DescribeParameterGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterGroups"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of database parameter templates created by users or supported by the system, including basic information, associated engine types, and modification times of each parameter template.</p>
     * 
     * @param request DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    public DescribeParameterGroupsResponse describeParameterGroups(DescribeParameterGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeParameterTemplates operation to retrieve the parameter template list for an instance.</p>
     * 
     * @param request DescribeParameterTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParameterTemplatesResponse
     */
    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramLevel)) {
            query.put("ParamLevel", request.paramLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterTemplates"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeParameterTemplates operation to retrieve the parameter template list for an instance.</p>
     * 
     * @param request DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeParameters operation to retrieve instance parameters.</p>
     * 
     * @param request DescribeParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramLevel)) {
            query.put("ParamLevel", request.paramLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameters"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeParameters operation to retrieve instance parameters.</p>
     * 
     * @param request DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all data nodes (Data Nodes) in a PolarDB-X instance, including node status, storage usage, and network addresses, to facilitate operations management and monitoring.</p>
     * 
     * @param request DescribePolarxDataNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolarxDataNodesResponse
     */
    public DescribePolarxDataNodesResponse describePolarxDataNodesWithOptions(DescribePolarxDataNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolarxDataNodes"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolarxDataNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all data nodes (Data Nodes) in a PolarDB-X instance, including node status, storage usage, and network addresses, to facilitate operations management and monitoring.</p>
     * 
     * @param request DescribePolarxDataNodesRequest
     * @return DescribePolarxDataNodesResponse
     */
    public DescribePolarxDataNodesResponse describePolarxDataNodes(DescribePolarxDataNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolarxDataNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of Virtual Private Clouds (VPCs) available under your account for database instances. You can use this operation to select an appropriate network environment when creating or managing database instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of VPCs available for PolarDB-X.</p>
     * 
     * @param request DescribeRdsVpcsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsVpcsResponse
     */
    public DescribeRdsVpcsResponse describeRdsVpcsWithOptions(DescribeRdsVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsVpcs"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsVpcsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of Virtual Private Clouds (VPCs) available under your account for database instances. You can use this operation to select an appropriate network environment when creating or managing database instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of VPCs available for PolarDB-X.</p>
     * 
     * @param request DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    public DescribeRdsVpcsResponse describeRdsVpcs(DescribeRdsVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVpcsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of available virtual private clouds (VPCs) under your account for an instance, so that you can select an appropriate network environment when creating or managing a database instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available vSwitches in a virtual private cloud (VPC) for an ApsaraDB RDS instance.</p>
     * 
     * @param request DescribeRdsVswitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsVswitchesResponse
     */
    public DescribeRdsVswitchesResponse describeRdsVswitchesWithOptions(DescribeRdsVswitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsVswitches"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsVswitchesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of available virtual private clouds (VPCs) under your account for an instance, so that you can select an appropriate network environment when creating or managing a database instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available vSwitches in a virtual private cloud (VPC) for an ApsaraDB RDS instance.</p>
     * 
     * @param request DescribeRdsVswitchesRequest
     * @return DescribeRdsVswitchesResponse
     */
    public DescribeRdsVswitchesResponse describeRdsVswitches(DescribeRdsVswitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVswitchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeRegions operation to obtain the list of regions.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeRegions operation to obtain the list of regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the data synchronization phase, proactively initiates a diagnostic task for the replication task to check for exceptions such as latency, interruption, or data inconsistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a replication lag inspection task for an instance.</p>
     * 
     * @param request DescribeRplInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRplInspectionTaskResponse
     */
    public DescribeRplInspectionTaskResponse describeRplInspectionTaskWithOptions(DescribeRplInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.failPageNumber)) {
            query.put("FailPageNumber", request.failPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failPageSize)) {
            query.put("FailPageSize", request.failPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successPageNumber)) {
            query.put("SuccessPageNumber", request.successPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successPageSize)) {
            query.put("SuccessPageSize", request.successPageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRplInspectionTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRplInspectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>During the data synchronization phase, proactively initiates a diagnostic task for the replication task to check for exceptions such as latency, interruption, or data inconsistency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a replication lag inspection task for an instance.</p>
     * 
     * @param request DescribeRplInspectionTaskRequest
     * @return DescribeRplInspectionTaskResponse
     */
    public DescribeRplInspectionTaskResponse describeRplInspectionTask(DescribeRplInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRplInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Display the ScaleOut migration task progress.</p>
     * 
     * @param request DescribeScaleOutMigrateTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScaleOutMigrateTaskListResponse
     */
    public DescribeScaleOutMigrateTaskListResponse describeScaleOutMigrateTaskListWithOptions(DescribeScaleOutMigrateTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScaleOutMigrateTaskList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScaleOutMigrateTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Display the ScaleOut migration task progress.</p>
     * 
     * @param request DescribeScaleOutMigrateTaskListRequest
     * @return DescribeScaleOutMigrateTaskListResponse
     */
    public DescribeScaleOutMigrateTaskListResponse describeScaleOutMigrateTaskList(DescribeScaleOutMigrateTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScaleOutMigrateTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeSecurityIps operation to view the IP whitelist of an instance.</p>
     * 
     * @param request DescribeSecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityIpsResponse
     */
    public DescribeSecurityIpsResponse describeSecurityIpsWithOptions(DescribeSecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityIps"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityIpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeSecurityIps operation to view the IP whitelist of an instance.</p>
     * 
     * @param request DescribeSecurityIpsRequest
     * @return DescribeSecurityIpsResponse
     */
    public DescribeSecurityIpsResponse describeSecurityIps(DescribeSecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage details of an instance, including the total capacity, used space, remaining space, and other information.</p>
     * 
     * @param request DescribeShowStorageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeShowStorageInfoResponse
     */
    public DescribeShowStorageInfoResponse describeShowStorageInfoWithOptions(DescribeShowStorageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeShowStorageInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShowStorageInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage details of an instance, including the total capacity, used space, remaining space, and other information.</p>
     * 
     * @param request DescribeShowStorageInfoRequest
     * @return DescribeShowStorageInfoResponse
     */
    public DescribeShowStorageInfoResponse describeShowStorageInfo(DescribeShowStorageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShowStorageInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of slow SQL statements on compute nodes and storage nodes of a PolarDB-X instance.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogRecords"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of slow SQL statements on compute nodes and storage nodes of a PolarDB-X instance.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Simple Log Service charges fees for storage space, read traffic, number of requests, data transformation, and data delivery. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL audit information.</p>
     * 
     * @param request DescribeSqlAuditInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlAuditInfoResponse
     */
    public DescribeSqlAuditInfoResponse describeSqlAuditInfoWithOptions(DescribeSqlAuditInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountName)) {
            query.put("AuditAccountName", request.auditAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountPassword)) {
            query.put("AuditAccountPassword", request.auditAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlAuditInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlAuditInfoResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The SQL audit and analysis feature of PolarDB-X 2.0 is free of charge. However, Simple Log Service charges fees for storage space, read traffic, number of requests, data transformation, and data delivery. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL audit and analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL audit information.</p>
     * 
     * @param request DescribeSqlAuditInfoRequest
     * @return DescribeSqlAuditInfoResponse
     */
    public DescribeSqlAuditInfoResponse describeSqlAuditInfo(DescribeSqlAuditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlAuditInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of SQL flashback tasks by calling the DescribeSqlFlashbackTaskList operation.</p>
     * 
     * @param request DescribeSqlFlashbackTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlFlashbackTaskListResponse
     */
    public DescribeSqlFlashbackTaskListResponse describeSqlFlashbackTaskListWithOptions(DescribeSqlFlashbackTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.polardbxInstanceId)) {
            query.put("PolardbxInstanceId", request.polardbxInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlFlashbackTaskList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlFlashbackTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of SQL flashback tasks by calling the DescribeSqlFlashbackTaskList operation.</p>
     * 
     * @param request DescribeSqlFlashbackTaskListRequest
     * @return DescribeSqlFlashbackTaskListResponse
     */
    public DescribeSqlFlashbackTaskListResponse describeSqlFlashbackTaskList(DescribeSqlFlashbackTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlFlashbackTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a storage pool, including capacity, usage, and status.</p>
     * 
     * @param request DescribeStoragePoolInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStoragePoolInfoResponse
     */
    public DescribeStoragePoolInfoResponse describeStoragePoolInfoWithOptions(DescribeStoragePoolInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStoragePoolInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStoragePoolInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a storage pool, including capacity, usage, and status.</p>
     * 
     * @param request DescribeStoragePoolInfoRequest
     * @return DescribeStoragePoolInfoResponse
     */
    public DescribeStoragePoolInfoResponse describeStoragePoolInfo(DescribeStoragePoolInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoragePoolInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The CreateDataImportTask operation creates a data import task. You can use this operation to import SQL or CSV files stored in OSS or ECS, or directly provided, into a destination database instance. Specify the instance ID, database name, engine type, data source (such as an OSS path), and import type. The system performs the data write operation asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a database schema import task.</p>
     * 
     * @param request DescribeStructureImportTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStructureImportTaskInfoResponse
     */
    public DescribeStructureImportTaskInfoResponse describeStructureImportTaskInfoWithOptions(DescribeStructureImportTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStructureImportTaskInfo"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStructureImportTaskInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>The CreateDataImportTask operation creates a data import task. You can use this operation to import SQL or CSV files stored in OSS or ECS, or directly provided, into a destination database instance. Specify the instance ID, database name, engine type, data source (such as an OSS path), and import type. The system performs the data write operation asynchronously or synchronously. This operation is applicable to scenarios such as data migration, initialization, and data backfill. A task ID is returned for subsequent status queries and management.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a database schema import task.</p>
     * 
     * @param request DescribeStructureImportTaskInfoRequest
     * @return DescribeStructureImportTaskInfoResponse
     */
    public DescribeStructureImportTaskInfoResponse describeStructureImportTaskInfo(DescribeStructureImportTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStructureImportTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is later than the query start time and whose log record start time is earlier than the query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Supabase API key.</p>
     * 
     * @param request DescribeSupabaseApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupabaseApiKeyResponse
     */
    public DescribeSupabaseApiKeyResponse describeSupabaseApiKeyWithOptions(DescribeSupabaseApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupabaseApiKey"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupabaseApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is later than the query start time and whose log record start time is earlier than the query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Supabase API key.</p>
     * 
     * @param request DescribeSupabaseApiKeyRequest
     * @return DescribeSupabaseApiKeyResponse
     */
    public DescribeSupabaseApiKeyResponse describeSupabaseApiKey(DescribeSupabaseApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupabaseApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Supabase instance.</p>
     * 
     * @param request DescribeSupabaseInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupabaseInstanceAttributeResponse
     */
    public DescribeSupabaseInstanceAttributeResponse describeSupabaseInstanceAttributeWithOptions(DescribeSupabaseInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupabaseInstanceAttribute"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupabaseInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Supabase instance.</p>
     * 
     * @param request DescribeSupabaseInstanceAttributeRequest
     * @return DescribeSupabaseInstanceAttributeResponse
     */
    public DescribeSupabaseInstanceAttributeResponse describeSupabaseInstanceAttribute(DescribeSupabaseInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupabaseInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of custom endpoints configured by the user for managing and viewing private connection or VPC endpoint service settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Supabase instances.</p>
     * 
     * @param request DescribeSupabaseInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupabaseInstancesResponse
     */
    public DescribeSupabaseInstancesResponse describeSupabaseInstancesWithOptions(DescribeSupabaseInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupabaseInstances"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupabaseInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of custom endpoints configured by the user for managing and viewing private connection or VPC endpoint service settings.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Supabase instances.</p>
     * 
     * @param request DescribeSupabaseInstancesRequest
     * @return DescribeSupabaseInstancesResponse
     */
    public DescribeSupabaseInstancesResponse describeSupabaseInstances(DescribeSupabaseInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupabaseInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is later than the specified query start time and whose log record start time is earlier than the specified query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP whitelist of a Supabase instance.</p>
     * 
     * @param request DescribeSupabaseIpWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupabaseIpWhitelistResponse
     */
    public DescribeSupabaseIpWhitelistResponse describeSupabaseIpWhitelistWithOptions(DescribeSupabaseIpWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupabaseIpWhitelist"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupabaseIpWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Binary log files are retained for 15 days by default.</li>
     * <li>The returned log list includes all logs whose log record end time is later than the specified query start time and whose log record start time is earlier than the specified query end time.</li>
     * <li>If DownloadLink is not NULL, you can use this URL to download the backup file. The URL is valid for 2 days after it is generated. Download the file before the URL expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP whitelist of a Supabase instance.</p>
     * 
     * @param request DescribeSupabaseIpWhitelistRequest
     * @return DescribeSupabaseIpWhitelistResponse
     */
    public DescribeSupabaseIpWhitelistResponse describeSupabaseIpWhitelist(DescribeSupabaseIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupabaseIpWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves tag information.</p>
     * 
     * @param request DescribeTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves tag information.</p>
     * 
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the task list of an instance.</p>
     * 
     * @param request DescribeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the task list of an instance.</p>
     * 
     * @param request DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current status of a task that upgrades or converts a standard instance to an Enterprise instance.</p>
     * 
     * @param request DescribeTransformStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransformStatusResponse
     */
    public DescribeTransformStatusResponse describeTransformStatusWithOptions(DescribeTransformStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryReport)) {
            query.put("QueryReport", request.queryReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransformStatus"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransformStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current status of a task that upgrades or converts a standard instance to an Enterprise instance.</p>
     * 
     * @param request DescribeTransformStatusRequest
     * @return DescribeTransformStatusResponse
     */
    public DescribeTransformStatusResponse describeTransformStatus(DescribeTransformStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransformStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeUserEncryptionKeyList operation to retrieve the list of Transparent Data Encryption (TDE) keys for a user.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEncryptionKeyList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeUserEncryptionKeyList operation to retrieve the list of Transparent Data Encryption (TDE) keys for a user.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables three-role mode.</p>
     * 
     * @param request DisableRightsSeparationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableRightsSeparationResponse
     */
    public DisableRightsSeparationResponse disableRightsSeparationWithOptions(DisableRightsSeparationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbaAccountName)) {
            query.put("DbaAccountName", request.dbaAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbaAccountPassword)) {
            query.put("DbaAccountPassword", request.dbaAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableRightsSeparation"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableRightsSeparationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables three-role mode.</p>
     * 
     * @param request DisableRightsSeparationRequest
     * @return DisableRightsSeparationResponse
     */
    public DisableRightsSeparationResponse disableRightsSeparation(DisableRightsSeparationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableRightsSeparationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the SQL audit and analysis feature is disabled, data is no longer written to Simple Log Service. However, you can still view historical data, which incurs storage and indexing fees. You can delete all data to deactivate Simple Log Service. After Simple Log Service is deactivated, no further fees are incurred. For more information about deactivating Simple Log Service, see <a href="https://help.aliyun.com/document_detail/90650.html">Deactivate Simple Log Service</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the SQL audit feature.</p>
     * 
     * @param request DisableSqlAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSqlAuditResponse
     */
    public DisableSqlAuditResponse disableSqlAuditWithOptions(DisableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountName)) {
            query.put("AuditAccountName", request.auditAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountPassword)) {
            query.put("AuditAccountPassword", request.auditAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSqlAudit"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSqlAuditResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the SQL audit and analysis feature is disabled, data is no longer written to Simple Log Service. However, you can still view historical data, which incurs storage and indexing fees. You can delete all data to deactivate Simple Log Service. After Simple Log Service is deactivated, no further fees are incurred. For more information about deactivating Simple Log Service, see <a href="https://help.aliyun.com/document_detail/90650.html">Deactivate Simple Log Service</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the SQL audit feature.</p>
     * 
     * @param request DisableSqlAuditRequest
     * @return DisableSqlAuditResponse
     */
    public DisableSqlAuditResponse disableSqlAudit(DisableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables three-role mode.</p>
     * 
     * @param request EnableRightsSeparationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRightsSeparationResponse
     */
    public EnableRightsSeparationResponse enableRightsSeparationWithOptions(EnableRightsSeparationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountDescription)) {
            query.put("AuditAccountDescription", request.auditAccountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountName)) {
            query.put("AuditAccountName", request.auditAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountPassword)) {
            query.put("AuditAccountPassword", request.auditAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountDescription)) {
            query.put("SecurityAccountDescription", request.securityAccountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRightsSeparation"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRightsSeparationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables three-role mode.</p>
     * 
     * @param request EnableRightsSeparationRequest
     * @return EnableRightsSeparationResponse
     */
    public EnableRightsSeparationResponse enableRightsSeparation(EnableRightsSeparationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRightsSeparationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The PolarDB-X 2.0 SQL audit and analysis feature itself is free of charge. However, Log Service charges fees for storage space, read traffic, number of requests, data transformation, data shipping, and other services. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL Audit and Analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the SQL audit feature.</p>
     * 
     * @param request EnableSqlAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSqlAuditResponse
     */
    public EnableSqlAuditResponse enableSqlAuditWithOptions(EnableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountName)) {
            query.put("AuditAccountName", request.auditAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditAccountPassword)) {
            query.put("AuditAccountPassword", request.auditAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireAfterDays)) {
            query.put("ExpireAfterDays", request.expireAfterDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSqlAudit"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlAuditResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The PolarDB-X 2.0 SQL audit and analysis feature itself is free of charge. However, Log Service charges fees for storage space, read traffic, number of requests, data transformation, data shipping, and other services. For more information about the SQL audit feature, see <a href="https://help.aliyun.com/document_detail/184619.html">Enable SQL Audit and Analysis</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the SQL audit feature.</p>
     * 
     * @param request EnableSqlAuditRequest
     * @return EnableSqlAuditResponse
     */
    public EnableSqlAuditResponse enableSqlAudit(EnableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of labels.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of labels.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates an instance from one zone to another.</p>
     * 
     * @param request MigrateDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateDBInstanceResponse
     */
    public MigrateDBInstanceResponse migrateDBInstanceWithOptions(MigrateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZoneId)) {
            query.put("PrimaryZoneId", request.primaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZoneId)) {
            query.put("SecondaryZoneId", request.secondaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tertiaryZoneId)) {
            query.put("TertiaryZoneId", request.tertiaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topologyType)) {
            query.put("TopologyType", request.topologyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateDBInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateDBInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates an instance from one zone to another.</p>
     * 
     * @param request MigrateDBInstanceRequest
     * @return MigrateDBInstanceResponse
     */
    public MigrateDBInstanceResponse migrateDBInstance(MigrateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyAccountDescription operation to modify the description of an account.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyAccountDescription operation to modify the description of an account.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the permissions of a standard account.</p>
     * 
     * @param request ModifyAccountPrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilegeWithOptions(ModifyAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountPrivilege"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the permissions of a standard account.</p>
     * 
     * @param request ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilege(ModifyAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyActiveOperationMaintainConf operation to modify the time configuration of O&amp;M events.</p>
     * 
     * @param request ModifyActiveOperationMaintainConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyActiveOperationMaintainConfResponse
     */
    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConfWithOptions(ModifyActiveOperationMaintainConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyActiveOperationMaintainConf"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyActiveOperationMaintainConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyActiveOperationMaintainConf operation to modify the time configuration of O&amp;M events.</p>
     * 
     * @param request ModifyActiveOperationMaintainConfRequest
     * @return ModifyActiveOperationMaintainConfResponse
     */
    public ModifyActiveOperationMaintainConfResponse modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActiveOperationMaintainConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyActiveOperationTasks operation to modify the execution time of O&amp;M events.</p>
     * 
     * @param request ModifyActiveOperationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyActiveOperationTasksResponse
     */
    public ModifyActiveOperationTasksResponse modifyActiveOperationTasksWithOptions(ModifyActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediateStart)) {
            query.put("ImmediateStart", request.immediateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyActiveOperationTasks"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyActiveOperationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyActiveOperationTasks operation to modify the execution time of O&amp;M events.</p>
     * 
     * @param request ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    public ModifyActiveOperationTasksResponse modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyActiveOperationTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the CDC configuration.</p>
     * 
     * @param request ModifyCdcClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdcClassResponse
     */
    public ModifyCdcClassResponse modifyCdcClassWithOptions(ModifyCdcClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CDCNodeCount)) {
            query.put("CDCNodeCount", request.CDCNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdcClass)) {
            query.put("CdcClass", request.cdcClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdcClass"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdcClassResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the CDC configuration.</p>
     * 
     * @param request ModifyCdcClassRequest
     * @return ModifyCdcClassResponse
     */
    public ModifyCdcClassResponse modifyCdcClass(ModifyCdcClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdcClassWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the column store specifications.</p>
     * 
     * @param request ModifyColumnarClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyColumnarClassResponse
     */
    public ModifyColumnarClassResponse modifyColumnarClassWithOptions(ModifyColumnarClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnarClass)) {
            query.put("ColumnarClass", request.columnarClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnarNodeCount)) {
            query.put("ColumnarNodeCount", request.columnarNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyColumnarClass"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyColumnarClassResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the column store specifications.</p>
     * 
     * @param request ModifyColumnarClassRequest
     * @return ModifyColumnarClassResponse
     */
    public ModifyColumnarClassResponse modifyColumnarClass(ModifyColumnarClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyColumnarClassWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In PolarDB-X, in addition to the default primary endpoint and read-only endpoint, you can create custom endpoints to implement more flexible read/write splitting, load balancing, or business isolation strategies. The ModifyCustomEndpoint operation allows you to dynamically adjust the attributes of these custom endpoints without restarting the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a custom endpoint.</p>
     * 
     * @param request ModifyCustomEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomEndpointResponse
     */
    public ModifyCustomEndpointResponse modifyCustomEndpointWithOptions(ModifyCustomEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customEndpointId)) {
            query.put("CustomEndpointId", request.customEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAutoEnter)) {
            query.put("NodeAutoEnter", request.nodeAutoEnter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeRole)) {
            query.put("NodeRole", request.nodeRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomEndpoint"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <p>In PolarDB-X, in addition to the default primary endpoint and read-only endpoint, you can create custom endpoints to implement more flexible read/write splitting, load balancing, or business isolation strategies. The ModifyCustomEndpoint operation allows you to dynamically adjust the attributes of these custom endpoints without restarting the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a custom endpoint.</p>
     * 
     * @param request ModifyCustomEndpointRequest
     * @return ModifyCustomEndpointResponse
     */
    public ModifyCustomEndpointResponse modifyCustomEndpoint(ModifyCustomEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables access through the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network configurations of a custom network endpoint, such as the subnet, security group, and public network access settings.</p>
     * 
     * @param request ModifyCustomEndpointNetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomEndpointNetResponse
     */
    public ModifyCustomEndpointNetResponse modifyCustomEndpointNetWithOptions(ModifyCustomEndpointNetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connPrefix)) {
            query.put("ConnPrefix", request.connPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEndpointId)) {
            query.put("CustomEndpointId", request.customEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomEndpointNet"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomEndpointNetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes the custom endpoint of a specified database instance and disables access through the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network configurations of a custom network endpoint, such as the subnet, security group, and public network access settings.</p>
     * 
     * @param request ModifyCustomEndpointNetRequest
     * @return ModifyCustomEndpointNetResponse
     */
    public ModifyCustomEndpointNetResponse modifyCustomEndpointNet(ModifyCustomEndpointNetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomEndpointNetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceClass operation to modify the specifications of an instance.</p>
     * 
     * @param request ModifyDBInstanceClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceClassResponse
     */
    public ModifyDBInstanceClassResponse modifyDBInstanceClassWithOptions(ModifyDBInstanceClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnClass)) {
            query.put("CnClass", request.cnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnClass)) {
            query.put("DnClass", request.dnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnStorageSpace)) {
            query.put("DnStorageSpace", request.dnStorageSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedDNScale)) {
            query.put("SpecifiedDNScale", request.specifiedDNScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedDNSpecMapJson)) {
            query.put("SpecifiedDNSpecMapJson", request.specifiedDNSpecMapJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTimeMode)) {
            query.put("SwitchTimeMode", request.switchTimeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBInstanceClass)) {
            query.put("TargetDBInstanceClass", request.targetDBInstanceClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceClass"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceClassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceClass operation to modify the specifications of an instance.</p>
     * 
     * @param request ModifyDBInstanceClassRequest
     * @return ModifyDBInstanceClassResponse
     */
    public ModifyDBInstanceClassResponse modifyDBInstanceClass(ModifyDBInstanceClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceClassWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceConfig operation to modify instance configuration items.</p>
     * 
     * @param request ModifyDBInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceConfigResponse
     */
    public ModifyDBInstanceConfigResponse modifyDBInstanceConfigWithOptions(ModifyDBInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            query.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceConfig"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceConfig operation to modify instance configuration items.</p>
     * 
     * @param request ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    public ModifyDBInstanceConfigResponse modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the connection string of an instance.</p>
     * 
     * @param request ModifyDBInstanceConnectionStringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceConnectionStringResponse
     */
    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPort)) {
            query.put("NewPort", request.newPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPrefix)) {
            query.put("NewPrefix", request.newPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceConnectionString"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the connection string of an instance.</p>
     * 
     * @param request ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceDescription operation to modify the description of an instance.</p>
     * 
     * @param request ModifyDBInstanceDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceDescriptionResponse
     */
    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceDescription"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDBInstanceDescription operation to modify the description of an instance.</p>
     * 
     * @param request ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an instance.</p>
     * 
     * @param request ModifyDBInstanceMaintainTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainTime)) {
            query.put("MaintainTime", request.maintainTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceMaintainTime"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an instance.</p>
     * 
     * @param request ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the virtual IP (VIP) address or network properties bound to a database instance. This operation supports changing the internal IP address, adjusting the vSwitch, migrating across zones, and other operations.</p>
     * 
     * @param request ModifyDBInstanceVipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceVipResponse
     */
    public ModifyDBInstanceVipResponse modifyDBInstanceVipWithOptions(ModifyDBInstanceVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClusterName)) {
            query.put("InstanceClusterName", request.instanceClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceVip"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceVipResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the virtual IP (VIP) address or network properties bound to a database instance. This operation supports changing the internal IP address, adjusting the vSwitch, migrating across zones, and other operations.</p>
     * 
     * @param request ModifyDBInstanceVipRequest
     * @return ModifyDBInstanceVipResponse
     */
    public ModifyDBInstanceVipResponse modifyDBInstanceVip(ModifyDBInstanceVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceVipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDatabaseDescription operation to modify the description of a database.</p>
     * 
     * @param request ModifyDatabaseDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseDescriptionResponse
     */
    public ModifyDatabaseDescriptionResponse modifyDatabaseDescriptionWithOptions(ModifyDatabaseDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbDescription)) {
            query.put("DbDescription", request.dbDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabaseDescription"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyDatabaseDescription operation to modify the description of a database.</p>
     * 
     * @param request ModifyDatabaseDescriptionRequest
     * @return ModifyDatabaseDescriptionResponse
     */
    public ModifyDatabaseDescriptionResponse modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration or migration parameters of a database engine migration task, such as the source database, destination database, migration objects, or migration mode.</p>
     * 
     * @param request ModifyEngineMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEngineMigrationResponse
     */
    public ModifyEngineMigrationResponse modifyEngineMigrationWithOptions(ModifyEngineMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStrings)) {
            query.put("ConnectionStrings", request.connectionStrings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newMasterDBInstanceName)) {
            query.put("NewMasterDBInstanceName", request.newMasterDBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBInstanceName)) {
            query.put("SourceDBInstanceName", request.sourceDBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swapConnectionString)) {
            query.put("SwapConnectionString", request.swapConnectionString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEngineMigration"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEngineMigrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration or migration parameters of a database engine migration task, such as the source database, destination database, migration objects, or migration mode.</p>
     * 
     * @param request ModifyEngineMigrationRequest
     * @return ModifyEngineMigrationResponse
     */
    public ModifyEngineMigrationResponse modifyEngineMigration(ModifyEngineMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEngineMigrationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the whitelist of a memory engine.</p>
     * 
     * @param request ModifyMem0SecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMem0SecurityIpsResponse
     */
    public ModifyMem0SecurityIpsResponse modifyMem0SecurityIpsWithOptions(ModifyMem0SecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMem0SecurityIps"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMem0SecurityIpsResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the whitelist of a memory engine.</p>
     * 
     * @param request ModifyMem0SecurityIpsRequest
     * @return ModifyMem0SecurityIpsResponse
     */
    public ModifyMem0SecurityIpsResponse modifyMem0SecurityIps(ModifyMem0SecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMem0SecurityIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyParameter operation to modify instance parameters, including compute layer and storage layer parameters.</p>
     * 
     * @param request ModifyParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyParameterResponse
     */
    public ModifyParameterResponse modifyParameterWithOptions(ModifyParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramLevel)) {
            query.put("ParamLevel", request.paramLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyParameter"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifyParameter operation to modify instance parameters, including compute layer and storage layer parameters.</p>
     * 
     * @param request ModifyParameterRequest
     * @return ModifyParameterResponse
     */
    public ModifyParameterResponse modifyParameter(ModifyParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifySecurityIps operation to modify the whitelist of an instance.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIps"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ModifySecurityIps operation to modify the whitelist of an instance.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Supabase Dashboard password.</p>
     * 
     * @param request ModifySupabaseDashboardPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySupabaseDashboardPasswordResponse
     */
    public ModifySupabaseDashboardPasswordResponse modifySupabaseDashboardPasswordWithOptions(ModifySupabaseDashboardPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            query.put("NewPassword", request.newPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySupabaseDashboardPassword"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySupabaseDashboardPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Supabase Dashboard password.</p>
     * 
     * @param request ModifySupabaseDashboardPasswordRequest
     * @return ModifySupabaseDashboardPasswordResponse
     */
    public ModifySupabaseDashboardPasswordResponse modifySupabaseDashboardPassword(ModifySupabaseDashboardPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySupabaseDashboardPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of a Supabase instance.</p>
     * 
     * @param request ModifySupabaseSecurityIPListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySupabaseSecurityIPListResponse
     */
    public ModifySupabaseSecurityIPListResponse modifySupabaseSecurityIPListWithOptions(ModifySupabaseSecurityIPListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySupabaseSecurityIPList"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySupabaseSecurityIPListResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of a Supabase instance.</p>
     * 
     * @param request ModifySupabaseSecurityIPListRequest
     * @return ModifySupabaseSecurityIPListResponse
     */
    public ModifySupabaseSecurityIPListResponse modifySupabaseSecurityIPList(ModifySupabaseSecurityIPListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySupabaseSecurityIPListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pre-check and feasibility assessment for a recovery task before you execute SQL flashback recovery.</p>
     * 
     * @param request PreCheckSqlFlashbackTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreCheckSqlFlashbackTaskResponse
     */
    public PreCheckSqlFlashbackTaskResponse preCheckSqlFlashbackTaskWithOptions(PreCheckSqlFlashbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polardbxInstanceId)) {
            query.put("PolardbxInstanceId", request.polardbxInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreCheckSqlFlashbackTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreCheckSqlFlashbackTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a pre-check and feasibility assessment for a recovery task before you execute SQL flashback recovery.</p>
     * 
     * @param request PreCheckSqlFlashbackTaskRequest
     * @return PreCheckSqlFlashbackTaskResponse
     */
    public PreCheckSqlFlashbackTaskResponse preCheckSqlFlashbackTask(PreCheckSqlFlashbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preCheckSqlFlashbackTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the metadata of an import task.</p>
     * 
     * @param request RefreshImportMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshImportMetaResponse
     */
    public RefreshImportMetaResponse refreshImportMetaWithOptions(RefreshImportMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshImportMeta"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshImportMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes the metadata of an import task.</p>
     * 
     * @param request RefreshImportMetaRequest
     * @return RefreshImportMetaResponse
     */
    public RefreshImportMetaResponse refreshImportMeta(RefreshImportMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshImportMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ReleaseColdDataVolume operation.</p>
     * 
     * @param request ReleaseColdDataVolumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseColdDataVolumeResponse
     */
    public ReleaseColdDataVolumeResponse releaseColdDataVolumeWithOptions(ReleaseColdDataVolumeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseColdDataVolume"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseColdDataVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ReleaseColdDataVolume operation.</p>
     * 
     * @param request ReleaseColdDataVolumeRequest
     * @return ReleaseColdDataVolumeResponse
     */
    public ReleaseColdDataVolumeResponse releaseColdDataVolume(ReleaseColdDataVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseColdDataVolumeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public network connection of an instance by calling the ReleaseInstancePublicConnection operation.</p>
     * 
     * @param request ReleaseInstancePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstancePublicConnectionResponse
     */
    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstancePublicConnection"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public network connection of an instance by calling the ReleaseInstancePublicConnection operation.</p>
     * 
     * @param request ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to verify that no active connections exist before a rollback task to ensure operational safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases the public domain name for a Mem0 instance.</p>
     * 
     * @param request ReleaseMem0PublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseMem0PublicConnectionResponse
     */
    public ReleaseMem0PublicConnectionResponse releaseMem0PublicConnectionWithOptions(ReleaseMem0PublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseMem0PublicConnection"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseMem0PublicConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to verify that no active connections exist before a rollback task to ensure operational safety.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases the public domain name for a Mem0 instance.</p>
     * 
     * @param request ReleaseMem0PublicConnectionRequest
     * @return ReleaseMem0PublicConnectionResponse
     */
    public ReleaseMem0PublicConnectionResponse releaseMem0PublicConnection(ReleaseMem0PublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseMem0PublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of an account.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of an account.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of an account.</p>
     * 
     * @param request ResetAccountPasswordRestrictRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordRestrictResponse
     */
    public ResetAccountPasswordRestrictResponse resetAccountPasswordRestrictWithOptions(ResetAccountPasswordRestrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountName)) {
            query.put("SecurityAccountName", request.securityAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityAccountPassword)) {
            query.put("SecurityAccountPassword", request.securityAccountPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPasswordRestrict"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordRestrictResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of an account.</p>
     * 
     * @param request ResetAccountPasswordRestrictRequest
     * @return ResetAccountPasswordRestrictResponse
     */
    public ResetAccountPasswordRestrictResponse resetAccountPasswordRestrict(ResetAccountPasswordRestrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordRestrictWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the API key of the memory engine.</p>
     * 
     * @param request ResetMem0AccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetMem0AccountPasswordResponse
     */
    public ResetMem0AccountPasswordResponse resetMem0AccountPasswordWithOptions(ResetMem0AccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mem0ApiKey)) {
            query.put("Mem0ApiKey", request.mem0ApiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetMem0AccountPassword"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetMem0AccountPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the API key of the memory engine.</p>
     * 
     * @param request ResetMem0AccountPasswordRequest
     * @return ResetMem0AccountPasswordResponse
     */
    public ResetMem0AccountPasswordResponse resetMem0AccountPassword(ResetMem0AccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetMem0AccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an instance by calling the RestartDBInstance operation.</p>
     * 
     * @param request RestartDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDBInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an instance by calling the RestartDBInstance operation.</p>
     * 
     * @param request RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a data import task.</p>
     * 
     * @param request RestartDataImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDataImportTaskResponse
     */
    public RestartDataImportTaskResponse restartDataImportTaskWithOptions(RestartDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDataImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDataImportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a data import task.</p>
     * 
     * @param request RestartDataImportTaskRequest
     * @return RestartDataImportTaskResponse
     */
    public RestartDataImportTaskResponse restartDataImportTask(RestartDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDataImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Restarts a Supabase instance.</p>
     * 
     * @param request RestartSupabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartSupabaseInstanceResponse
     */
    public RestartSupabaseInstanceResponse restartSupabaseInstanceWithOptions(RestartSupabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartSupabaseInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartSupabaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Restarts a Supabase instance.</p>
     * 
     * @param request RestartSupabaseInstanceRequest
     * @return RestartSupabaseInstanceResponse
     */
    public RestartSupabaseInstanceResponse restartSupabaseInstance(RestartSupabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartSupabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>克隆PolarDB-X实例</p>
     * 
     * @param request RestoreDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreDBInstanceResponse
     */
    public RestoreDBInstanceResponse restoreDBInstanceWithOptions(RestoreDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetRegion)) {
            query.put("BackupSetRegion", request.backupSetRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CNNodeCount)) {
            query.put("CNNodeCount", request.CNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloneInstanceName)) {
            query.put("CloneInstanceName", request.cloneInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnClass)) {
            query.put("CnClass", request.cnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeClass)) {
            query.put("DBNodeClass", request.DBNodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeCount)) {
            query.put("DBNodeCount", request.DBNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNNodeCount)) {
            query.put("DNNodeCount", request.DNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnClass)) {
            query.put("DnClass", request.dnClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gdnRole)) {
            query.put("GdnRole", request.gdnRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZone)) {
            query.put("PrimaryZone", request.primaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryTypeCode)) {
            query.put("RecoveryTypeCode", request.recoveryTypeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZone)) {
            query.put("SecondaryZone", request.secondaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceRegion)) {
            query.put("SourceInstanceRegion", request.sourceInstanceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tertiaryZone)) {
            query.put("TertiaryZone", request.tertiaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topologyType)) {
            query.put("TopologyType", request.topologyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreDBInstance"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>克隆PolarDB-X实例</p>
     * 
     * @param request RestoreDBInstanceRequest
     * @return RestoreDBInstanceResponse
     */
    public RestoreDBInstanceResponse restoreDBInstance(RestoreDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to skip the current step.</p>
     * 
     * @param request SkipCurrentStepRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipCurrentStepResponse
     */
    public SkipCurrentStepResponse skipCurrentStepWithOptions(SkipCurrentStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentStep)) {
            query.put("CurrentStep", request.currentStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipCurrentStep"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipCurrentStepResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This API is used to skip the current step.</p>
     * 
     * @param request SkipCurrentStepRequest
     * @return SkipCurrentStepResponse
     */
    public SkipCurrentStepResponse skipCurrentStep(SkipCurrentStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipCurrentStepWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a database cutover for a database migration or synchronization task.</p>
     * 
     * @param request StartSwitchDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSwitchDatabaseResponse
     */
    public StartSwitchDatabaseResponse startSwitchDatabaseWithOptions(StartSwitchDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstMainConnectString)) {
            query.put("DstMainConnectString", request.dstMainConnectString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstMainPort)) {
            query.put("DstMainPort", request.dstMainPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isModifyEndpoint)) {
            query.put("IsModifyEndpoint", request.isModifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMainConnectString)) {
            query.put("SrcMainConnectString", request.srcMainConnectString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMainPort)) {
            query.put("SrcMainPort", request.srcMainPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSwitchDatabase"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSwitchDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a database cutover for a database migration or synchronization task.</p>
     * 
     * @param request StartSwitchDatabaseRequest
     * @return StartSwitchDatabaseResponse
     */
    public StartSwitchDatabaseResponse startSwitchDatabase(StartSwitchDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSwitchDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data import task.</p>
     * 
     * @param request StopDataImportTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDataImportTaskResponse
     */
    public StopDataImportTaskResponse stopDataImportTaskWithOptions(StopDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slinkTaskId)) {
            query.put("SlinkTaskId", request.slinkTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDataImportTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDataImportTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data import task.</p>
     * 
     * @param request StopDataImportTaskRequest
     * @return StopDataImportTaskResponse
     */
    public StopDataImportTaskResponse stopDataImportTask(StopDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataImportTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a SQL flashback task by calling the SubmitSqlFlashbackTask operation.</p>
     * 
     * @param request SubmitSqlFlashbackTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSqlFlashbackTaskResponse
     */
    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTaskWithOptions(SubmitSqlFlashbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polardbxInstanceId)) {
            query.put("PolardbxInstanceId", request.polardbxInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallRestoreType)) {
            query.put("RecallRestoreType", request.recallRestoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallType)) {
            query.put("RecallType", request.recallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlPk)) {
            query.put("SqlPk", request.sqlPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSqlFlashbackTask"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSqlFlashbackTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a SQL flashback task by calling the SubmitSqlFlashbackTask operation.</p>
     * 
     * @param request SubmitSqlFlashbackTaskRequest
     * @return SubmitSqlFlashbackTaskResponse
     */
    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSqlFlashbackTaskWithOptions(request, runtime);
    }

    /**
     * @param request SwitchDBInstanceHARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchDBInstanceHAResponse
     */
    public SwitchDBInstanceHAResponse switchDBInstanceHAWithOptions(SwitchDBInstanceHARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTimeMode)) {
            query.put("SwitchTimeMode", request.switchTimeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrimaryAzoneId)) {
            query.put("TargetPrimaryAzoneId", request.targetPrimaryAzoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrimaryRegionId)) {
            query.put("TargetPrimaryRegionId", request.targetPrimaryRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchDBInstanceHA"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchDBInstanceHAResponse());
    }

    /**
     * @param request SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     */
    public SwitchDBInstanceHAResponse switchDBInstanceHA(SwitchDBInstanceHARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceHAWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a primary/secondary switchover for a global database network (GDN).</p>
     * 
     * @param request SwitchGdnMemberRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchGdnMemberRoleResponse
     */
    public SwitchGdnMemberRoleResponse switchGdnMemberRoleWithOptions(SwitchGdnMemberRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstMainConnectString)) {
            query.put("DstMainConnectString", request.dstMainConnectString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstMainPort)) {
            query.put("DstMainPort", request.dstMainPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isModifyEndpoint)) {
            query.put("IsModifyEndpoint", request.isModifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMainConnectString)) {
            query.put("SrcMainConnectString", request.srcMainConnectString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMainPort)) {
            query.put("SrcMainPort", request.srcMainPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTimeout)) {
            query.put("TaskTimeout", request.taskTimeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchGdnMemberRole"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchGdnMemberRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a primary/secondary switchover for a global database network (GDN).</p>
     * 
     * @param request SwitchGdnMemberRoleRequest
     * @return SwitchGdnMemberRoleResponse
     */
    public SwitchGdnMemberRoleResponse switchGdnMemberRole(SwitchGdnMemberRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchGdnMemberRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the TagResources operation to add tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the TagResources operation to add tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdateBackupPolicy operation to modify the backup policy of an instance.</p>
     * 
     * @param request UpdateBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupPolicyResponse
     */
    public UpdateBackupPolicyResponse updateBackupPolicyWithOptions(UpdateBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPeriod)) {
            query.put("BackupPeriod", request.backupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanBegin)) {
            query.put("BackupPlanBegin", request.backupPlanBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetRetention)) {
            query.put("BackupSetRetention", request.backupSetRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupWay)) {
            query.put("BackupWay", request.backupWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldDataBackupInterval)) {
            query.put("ColdDataBackupInterval", request.coldDataBackupInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldDataBackupRetention)) {
            query.put("ColdDataBackupRetention", request.coldDataBackupRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionDataBackupRetention)) {
            query.put("CrossRegionDataBackupRetention", request.crossRegionDataBackupRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionFilterValue)) {
            query.put("CrossRegionFilterValue", request.crossRegionFilterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionLogBackupRetention)) {
            query.put("CrossRegionLogBackupRetention", request.crossRegionLogBackupRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCrossRegion)) {
            query.put("DestCrossRegion", request.destCrossRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceCleanOnHighSpaceUsage)) {
            query.put("ForceCleanOnHighSpaceUsage", request.forceCleanOnHighSpaceUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCrossRegionDataBackupEnabled)) {
            query.put("IsCrossRegionDataBackupEnabled", request.isCrossRegionDataBackupEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCrossRegionLogBackupEnabled)) {
            query.put("IsCrossRegionLogBackupEnabled", request.isCrossRegionLogBackupEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnabled)) {
            query.put("IsEnabled", request.isEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localLogRetention)) {
            query.put("LocalLogRetention", request.localLogRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localLogRetentionNumber)) {
            query.put("LocalLogRetentionNumber", request.localLogRetentionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLocalRetentionSpace)) {
            query.put("LogLocalRetentionSpace", request.logLocalRetentionSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeLogRetention)) {
            query.put("RemoveLogRetention", request.removeLogRetention);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackupPolicy"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdateBackupPolicy operation to modify the backup policy of an instance.</p>
     * 
     * @param request UpdateBackupPolicyRequest
     * @return UpdateBackupPolicyResponse
     */
    public UpdateBackupPolicyResponse updateBackupPolicy(UpdateBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;更多关于实例账号的信息，请参见<a href="https://help.aliyun.com/document_detail/172163.html">账号管理</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>更新实例的管控参数</p>
     * 
     * @param request UpdateCustinsParamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustinsParamResponse
     */
    public UpdateCustinsParamResponse updateCustinsParamWithOptions(UpdateCustinsParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustinsParam"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustinsParamResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;更多关于实例账号的信息，请参见<a href="https://help.aliyun.com/document_detail/172163.html">账号管理</a>。</p>
     * 
     * <b>summary</b> : 
     * <p>更新实例的管控参数</p>
     * 
     * @param request UpdateCustinsParamRequest
     * @return UpdateCustinsParamResponse
     */
    public UpdateCustinsParamResponse updateCustinsParam(UpdateCustinsParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustinsParamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the SSL configuration of an instance.</p>
     * 
     * @param request UpdateDBInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDBInstanceSSLResponse
     */
    public UpdateDBInstanceSSLResponse updateDBInstanceSSLWithOptions(UpdateDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certCommonName)) {
            query.put("CertCommonName", request.certCommonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSL)) {
            query.put("EnableSSL", request.enableSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDBInstanceSSL"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDBInstanceSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the SSL configuration of an instance.</p>
     * 
     * @param request UpdateDBInstanceSSLRequest
     * @return UpdateDBInstanceSSLResponse
     */
    public UpdateDBInstanceSSLResponse updateDBInstanceSSL(UpdateDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables Transparent Data Encryption (TDE) for an instance by calling the UpdateDBInstanceTDE operation.</p>
     * 
     * @param request UpdateDBInstanceTDERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDBInstanceTDEResponse
     */
    public UpdateDBInstanceTDEResponse updateDBInstanceTDEWithOptions(UpdateDBInstanceTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDEStatus)) {
            query.put("TDEStatus", request.TDEStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDBInstanceTDE"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDBInstanceTDEResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables Transparent Data Encryption (TDE) for an instance by calling the UpdateDBInstanceTDE operation.</p>
     * 
     * @param request UpdateDBInstanceTDERequest
     * @return UpdateDBInstanceTDEResponse
     */
    public UpdateDBInstanceTDEResponse updateDBInstanceTDE(UpdateDBInstanceTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDBInstanceTDEWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdatePolarDBXInstanceNode operation to change the number of nodes for an instance, including scaling out and scaling in. This request generates a billable order.</p>
     * 
     * @param request UpdatePolarDBXInstanceNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolarDBXInstanceNodeResponse
     */
    public UpdatePolarDBXInstanceNodeResponse updatePolarDBXInstanceNodeWithOptions(UpdatePolarDBXInstanceNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addDNSpec)) {
            query.put("AddDNSpec", request.addDNSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CNNodeCount)) {
            query.put("CNNodeCount", request.CNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNNodeCount)) {
            query.put("DNNodeCount", request.DNNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceNodeCount)) {
            query.put("DbInstanceNodeCount", request.dbInstanceNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteDNIds)) {
            query.put("DeleteDNIds", request.deleteDNIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePoolName)) {
            query.put("StoragePoolName", request.storagePoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolarDBXInstanceNode"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolarDBXInstanceNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdatePolarDBXInstanceNode operation to change the number of nodes for an instance, including scaling out and scaling in. This request generates a billable order.</p>
     * 
     * @param request UpdatePolarDBXInstanceNodeRequest
     * @return UpdatePolarDBXInstanceNodeResponse
     */
    public UpdatePolarDBXInstanceNodeResponse updatePolarDBXInstanceNode(UpdatePolarDBXInstanceNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolarDBXInstanceNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the CDC node version of a PolarDB-X instance.</p>
     * 
     * @param request UpgradeCDCVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeCDCVersionResponse
     */
    public UpgradeCDCVersionResponse upgradeCDCVersionWithOptions(UpgradeCDCVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdcDbVersion)) {
            query.put("CdcDbVersion", request.cdcDbVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdcMinorVersion)) {
            query.put("CdcMinorVersion", request.cdcMinorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeCDCVersion"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeCDCVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the CDC node version of a PolarDB-X instance.</p>
     * 
     * @param request UpgradeCDCVersionRequest
     * @return UpgradeCDCVersionResponse
     */
    public UpgradeCDCVersionResponse upgradeCDCVersion(UpgradeCDCVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeCDCVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the column store version.</p>
     * 
     * @param request UpgradeColumnarVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeColumnarVersionResponse
     */
    public UpgradeColumnarVersionResponse upgradeColumnarVersionWithOptions(UpgradeColumnarVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnarVersion)) {
            query.put("ColumnarVersion", request.columnarVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeColumnarVersion"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeColumnarVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the column store version.</p>
     * 
     * @param request UpgradeColumnarVersionRequest
     * @return UpgradeColumnarVersionResponse
     */
    public UpgradeColumnarVersionResponse upgradeColumnarVersion(UpgradeColumnarVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeColumnarVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the UpgradeDBInstanceKernelVersion operation to update the kernel version of an instance.</p>
     * 
     * @param request UpgradeDBInstanceKernelVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorVersion)) {
            query.put("MinorVersion", request.minorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeDBInstanceKernelVersion"),
            new TeaPair("version", "2020-02-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the UpgradeDBInstanceKernelVersion operation to update the kernel version of an instance.</p>
     * 
     * @param request UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }
}
