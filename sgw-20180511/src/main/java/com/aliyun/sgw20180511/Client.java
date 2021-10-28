// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511;

import com.aliyun.tea.*;
import com.aliyun.sgw20180511.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-chengdu", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "sgw.cn-shanghai.aliyuncs.com"),
            new TeaPair("us-east-1", "sgw.us-west-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sgw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateAllInOneGatewayResponse activateAllInOneGatewayWithOptions(ActivateAllInOneGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("DeviceNumber", request.deviceNumber);
        query.put("GatewayId", request.gatewayId);
        query.put("Model", request.model);
        query.put("SecurityToken", request.securityToken);
        query.put("SerialNumber", request.serialNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateAllInOneGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateAllInOneGatewayResponse());
    }

    public ActivateAllInOneGatewayResponse activateAllInOneGateway(ActivateAllInOneGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateAllInOneGatewayWithOptions(request, runtime);
    }

    public ActivateGatewayResponse activateGatewayWithOptions(ActivateGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("ClientUUID", request.clientUUID);
        query.put("Model", request.model);
        query.put("SecurityToken", request.securityToken);
        query.put("SerialNumber", request.serialNumber);
        query.put("Token", request.token);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateGatewayResponse());
    }

    public ActivateGatewayResponse activateGateway(ActivateGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateGatewayWithOptions(request, runtime);
    }

    public AddSharesToExpressSyncResponse addSharesToExpressSyncWithOptions(AddSharesToExpressSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpressSyncId", request.expressSyncId);
        query.put("GatewayShares", request.gatewayShares);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSharesToExpressSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSharesToExpressSyncResponse());
    }

    public AddSharesToExpressSyncResponse addSharesToExpressSync(AddSharesToExpressSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSharesToExpressSyncWithOptions(request, runtime);
    }

    public AddTagsToGatewayResponse addTagsToGatewayWithOptions(AddTagsToGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTagsToGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsToGatewayResponse());
    }

    public AddTagsToGatewayResponse addTagsToGateway(AddTagsToGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsToGatewayWithOptions(request, runtime);
    }

    public CheckActivationKeyResponse checkActivationKeyWithOptions(CheckActivationKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CryptKey", request.cryptKey);
        query.put("CryptText", request.cryptText);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Token", request.token);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckActivationKey"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckActivationKeyResponse());
    }

    public CheckActivationKeyResponse checkActivationKey(CheckActivationKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkActivationKeyWithOptions(request, runtime);
    }

    public CheckBlockVolumeNameResponse checkBlockVolumeNameWithOptions(CheckBlockVolumeNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketEndpoint", request.bucketEndpoint);
        query.put("BucketName", request.bucketName);
        query.put("SecurityToken", request.securityToken);
        query.put("VolumeName", request.volumeName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckBlockVolumeName"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBlockVolumeNameResponse());
    }

    public CheckBlockVolumeNameResponse checkBlockVolumeName(CheckBlockVolumeNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkBlockVolumeNameWithOptions(request, runtime);
    }

    public CheckGatewayEssdSupportResponse checkGatewayEssdSupportWithOptions(CheckGatewayEssdSupportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckGatewayEssdSupport"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckGatewayEssdSupportResponse());
    }

    public CheckGatewayEssdSupportResponse checkGatewayEssdSupport(CheckGatewayEssdSupportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkGatewayEssdSupportWithOptions(request, runtime);
    }

    public CheckMnsServiceResponse checkMnsServiceWithOptions(CheckMnsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMnsService"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMnsServiceResponse());
    }

    public CheckMnsServiceResponse checkMnsService(CheckMnsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMnsServiceWithOptions(request, runtime);
    }

    public CheckRoleResponse checkRoleWithOptions(CheckRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RoleType", request.roleType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRole"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRoleResponse());
    }

    public CheckRoleResponse checkRole(CheckRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRoleWithOptions(request, runtime);
    }

    public CheckSlrRoleResponse checkSlrRoleWithOptions(CheckSlrRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CreateIfNotExist", request.createIfNotExist);
        query.put("RoleName", request.roleName);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSlrRole"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSlrRoleResponse());
    }

    public CheckSlrRoleResponse checkSlrRole(CheckSlrRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSlrRoleWithOptions(request, runtime);
    }

    public CheckUpgradeVersionResponse checkUpgradeVersionWithOptions(CheckUpgradeVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("GatewayVersion", request.gatewayVersion);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUpgradeVersion"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUpgradeVersionResponse());
    }

    public CheckUpgradeVersionResponse checkUpgradeVersion(CheckUpgradeVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUpgradeVersionWithOptions(request, runtime);
    }

    public CreateCacheResponse createCacheWithOptions(CreateCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("SizeInGB", request.sizeInGB);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCache"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCacheResponse());
    }

    public CreateCacheResponse createCache(CreateCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCacheWithOptions(request, runtime);
    }

    public CreateElasticGatewayPrivateZoneResponse createElasticGatewayPrivateZoneWithOptions(CreateElasticGatewayPrivateZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticGatewayPrivateZone"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateElasticGatewayPrivateZoneResponse());
    }

    public CreateElasticGatewayPrivateZoneResponse createElasticGatewayPrivateZone(CreateElasticGatewayPrivateZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createElasticGatewayPrivateZoneWithOptions(request, runtime);
    }

    public CreateExpressSyncResponse createExpressSyncWithOptions(CreateExpressSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketName", request.bucketName);
        query.put("BucketPrefix", request.bucketPrefix);
        query.put("BucketRegion", request.bucketRegion);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressSyncResponse());
    }

    public CreateExpressSyncResponse createExpressSync(CreateExpressSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExpressSyncWithOptions(request, runtime);
    }

    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("GatewayClass", request.gatewayClass);
        query.put("Location", request.location);
        query.put("Name", request.name);
        query.put("PostPaid", request.postPaid);
        query.put("PublicNetworkBandwidth", request.publicNetworkBandwidth);
        query.put("ReleaseAfterExpiration", request.releaseAfterExpiration);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        query.put("Type", request.type);
        query.put("VSwitchId", request.vSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayResponse());
    }

    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewayWithOptions(request, runtime);
    }

    public CreateGatewayBlockVolumeResponse createGatewayBlockVolumeWithOptions(CreateGatewayBlockVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheMode", request.cacheMode);
        query.put("ChapEnabled", request.chapEnabled);
        query.put("ChapInPassword", request.chapInPassword);
        query.put("ChapInUser", request.chapInUser);
        query.put("ChunkSize", request.chunkSize);
        query.put("GatewayId", request.gatewayId);
        query.put("LocalFilePath", request.localFilePath);
        query.put("Name", request.name);
        query.put("OssBucketName", request.ossBucketName);
        query.put("OssBucketSsl", request.ossBucketSsl);
        query.put("OssEndpoint", request.ossEndpoint);
        query.put("Recovery", request.recovery);
        query.put("SecurityToken", request.securityToken);
        query.put("Size", request.size);
        query.put("VolumeProtocol", request.volumeProtocol);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayBlockVolume"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayBlockVolumeResponse());
    }

    public CreateGatewayBlockVolumeResponse createGatewayBlockVolume(CreateGatewayBlockVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewayBlockVolumeWithOptions(request, runtime);
    }

    public CreateGatewayCacheDiskResponse createGatewayCacheDiskWithOptions(CreateGatewayCacheDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheDiskCategory", request.cacheDiskCategory);
        query.put("CacheDiskSizeInGB", request.cacheDiskSizeInGB);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayCacheDisk"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayCacheDiskResponse());
    }

    public CreateGatewayCacheDiskResponse createGatewayCacheDisk(CreateGatewayCacheDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewayCacheDiskWithOptions(request, runtime);
    }

    public CreateGatewayFileShareResponse createGatewayFileShareWithOptions(CreateGatewayFileShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessBasedEnumeration", request.accessBasedEnumeration);
        query.put("BackendLimit", request.backendLimit);
        query.put("Browsable", request.browsable);
        query.put("BypassCacheRead", request.bypassCacheRead);
        query.put("CacheMode", request.cacheMode);
        query.put("ClientSideCmk", request.clientSideCmk);
        query.put("ClientSideEncryption", request.clientSideEncryption);
        query.put("DirectIO", request.directIO);
        query.put("DownloadLimit", request.downloadLimit);
        query.put("FastReclaim", request.fastReclaim);
        query.put("FrontendLimit", request.frontendLimit);
        query.put("GatewayId", request.gatewayId);
        query.put("IgnoreDelete", request.ignoreDelete);
        query.put("InPlace", request.inPlace);
        query.put("KmsRotatePeriod", request.kmsRotatePeriod);
        query.put("LagPeriod", request.lagPeriod);
        query.put("LocalFilePath", request.localFilePath);
        query.put("Name", request.name);
        query.put("NfsV4Optimization", request.nfsV4Optimization);
        query.put("OssBucketName", request.ossBucketName);
        query.put("OssBucketSsl", request.ossBucketSsl);
        query.put("OssEndpoint", request.ossEndpoint);
        query.put("PartialSyncPaths", request.partialSyncPaths);
        query.put("PathPrefix", request.pathPrefix);
        query.put("PollingInterval", request.pollingInterval);
        query.put("ReadOnlyClientList", request.readOnlyClientList);
        query.put("ReadOnlyUserList", request.readOnlyUserList);
        query.put("ReadWriteClientList", request.readWriteClientList);
        query.put("ReadWriteUserList", request.readWriteUserList);
        query.put("RemoteSync", request.remoteSync);
        query.put("RemoteSyncDownload", request.remoteSyncDownload);
        query.put("SecurityToken", request.securityToken);
        query.put("ServerSideAlgorithm", request.serverSideAlgorithm);
        query.put("ServerSideCmk", request.serverSideCmk);
        query.put("ServerSideEncryption", request.serverSideEncryption);
        query.put("ShareProtocol", request.shareProtocol);
        query.put("Squash", request.squash);
        query.put("SupportArchive", request.supportArchive);
        query.put("TransferAcceleration", request.transferAcceleration);
        query.put("WindowsAcl", request.windowsAcl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayFileShare"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayFileShareResponse());
    }

    public CreateGatewayFileShareResponse createGatewayFileShare(CreateGatewayFileShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewayFileShareWithOptions(request, runtime);
    }

    public CreateGatewayLoggingResponse createGatewayLoggingWithOptions(CreateGatewayLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("SlsLogstore", request.slsLogstore);
        query.put("SlsProject", request.slsProject);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayLogging"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayLoggingResponse());
    }

    public CreateGatewayLoggingResponse createGatewayLogging(CreateGatewayLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewayLoggingWithOptions(request, runtime);
    }

    public CreateGatewaySMBUserResponse createGatewaySMBUserWithOptions(CreateGatewaySMBUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("Password", request.password);
        query.put("SecurityToken", request.securityToken);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewaySMBUser"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewaySMBUserResponse());
    }

    public CreateGatewaySMBUserResponse createGatewaySMBUser(CreateGatewaySMBUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGatewaySMBUserWithOptions(request, runtime);
    }

    public CreateStorageBundleResponse createStorageBundleWithOptions(CreateStorageBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendBucketRegionId", request.backendBucketRegionId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStorageBundle"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStorageBundleResponse());
    }

    public CreateStorageBundleResponse createStorageBundle(CreateStorageBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStorageBundleWithOptions(request, runtime);
    }

    public DeleteCSGClientsResponse deleteCSGClientsWithOptions(DeleteCSGClientsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCSGClientsShrinkRequest request = new DeleteCSGClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientIds", request.clientIdsShrink);
        query.put("ClientRegionId", request.clientRegionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCSGClients"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCSGClientsResponse());
    }

    public DeleteCSGClientsResponse deleteCSGClients(DeleteCSGClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCSGClientsWithOptions(request, runtime);
    }

    public DeleteElasticGatewayPrivateZoneResponse deleteElasticGatewayPrivateZoneWithOptions(DeleteElasticGatewayPrivateZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteElasticGatewayPrivateZone"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteElasticGatewayPrivateZoneResponse());
    }

    public DeleteElasticGatewayPrivateZoneResponse deleteElasticGatewayPrivateZone(DeleteElasticGatewayPrivateZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteElasticGatewayPrivateZoneWithOptions(request, runtime);
    }

    public DeleteExpressSyncResponse deleteExpressSyncWithOptions(DeleteExpressSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpressSyncId", request.expressSyncId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressSyncResponse());
    }

    public DeleteExpressSyncResponse deleteExpressSync(DeleteExpressSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExpressSyncWithOptions(request, runtime);
    }

    public DeleteGatewayResponse deleteGatewayWithOptions(DeleteGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("ReasonDetail", request.reasonDetail);
        query.put("ReasonType", request.reasonType);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayWithOptions(request, runtime);
    }

    public DeleteGatewayBlockVolumesResponse deleteGatewayBlockVolumesWithOptions(DeleteGatewayBlockVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("IsSourceDeletion", request.isSourceDeletion);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayBlockVolumes"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayBlockVolumesResponse());
    }

    public DeleteGatewayBlockVolumesResponse deleteGatewayBlockVolumes(DeleteGatewayBlockVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayBlockVolumesWithOptions(request, runtime);
    }

    public DeleteGatewayCacheDiskResponse deleteGatewayCacheDiskWithOptions(DeleteGatewayCacheDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheId", request.cacheId);
        query.put("GatewayId", request.gatewayId);
        query.put("LocalFilePath", request.localFilePath);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayCacheDisk"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayCacheDiskResponse());
    }

    public DeleteGatewayCacheDiskResponse deleteGatewayCacheDisk(DeleteGatewayCacheDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayCacheDiskWithOptions(request, runtime);
    }

    public DeleteGatewayFileSharesResponse deleteGatewayFileSharesWithOptions(DeleteGatewayFileSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Force", request.force);
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayFileShares"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayFileSharesResponse());
    }

    public DeleteGatewayFileSharesResponse deleteGatewayFileShares(DeleteGatewayFileSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayFileSharesWithOptions(request, runtime);
    }

    public DeleteGatewayLoggingResponse deleteGatewayLoggingWithOptions(DeleteGatewayLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayLogging"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayLoggingResponse());
    }

    public DeleteGatewayLoggingResponse deleteGatewayLogging(DeleteGatewayLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayLoggingWithOptions(request, runtime);
    }

    public DeleteGatewaySMBUserResponse deleteGatewaySMBUserWithOptions(DeleteGatewaySMBUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewaySMBUser"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewaySMBUserResponse());
    }

    public DeleteGatewaySMBUserResponse deleteGatewaySMBUser(DeleteGatewaySMBUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewaySMBUserWithOptions(request, runtime);
    }

    public DeleteStorageBundleResponse deleteStorageBundleWithOptions(DeleteStorageBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStorageBundle"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStorageBundleResponse());
    }

    public DeleteStorageBundleResponse deleteStorageBundle(DeleteStorageBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStorageBundleWithOptions(request, runtime);
    }

    public DeployCSGClientsResponse deployCSGClientsWithOptions(DeployCSGClientsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeployCSGClientsShrinkRequest request = new DeployCSGClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecsInstanceIds)) {
            request.ecsInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecsInstanceIds, "EcsInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientRegionId", request.clientRegionId);
        query.put("EcsInstanceIds", request.ecsInstanceIdsShrink);
        query.put("SecurityToken", request.securityToken);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployCSGClients"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployCSGClientsResponse());
    }

    public DeployCSGClientsResponse deployCSGClients(DeployCSGClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployCSGClientsWithOptions(request, runtime);
    }

    public DeployCacheDiskResponse deployCacheDiskWithOptions(DeployCacheDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheConfig", request.cacheConfig);
        query.put("DiskCategory", request.diskCategory);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("SizeInGB", request.sizeInGB);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployCacheDisk"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployCacheDiskResponse());
    }

    public DeployCacheDiskResponse deployCacheDisk(DeployCacheDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployCacheDiskWithOptions(request, runtime);
    }

    public DeployGatewayResponse deployGatewayWithOptions(DeployGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayClass", request.gatewayClass);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployGatewayResponse());
    }

    public DeployGatewayResponse deployGateway(DeployGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployGatewayWithOptions(request, runtime);
    }

    public DescribeAccountConfigResponse describeAccountConfigWithOptions(DescribeAccountConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountConfig"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountConfigResponse());
    }

    public DescribeAccountConfigResponse describeAccountConfig(DescribeAccountConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountConfigWithOptions(request, runtime);
    }

    public DescribeBlockVolumeSnapshotsResponse describeBlockVolumeSnapshotsWithOptions(DescribeBlockVolumeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockVolumeSnapshots"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockVolumeSnapshotsResponse());
    }

    public DescribeBlockVolumeSnapshotsResponse describeBlockVolumeSnapshots(DescribeBlockVolumeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBlockVolumeSnapshotsWithOptions(request, runtime);
    }

    public DescribeCSGClientTasksResponse describeCSGClientTasksWithOptions(DescribeCSGClientTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientId", request.clientId);
        query.put("ClientRegionId", request.clientRegionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCSGClientTasks"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCSGClientTasksResponse());
    }

    public DescribeCSGClientTasksResponse describeCSGClientTasks(DescribeCSGClientTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCSGClientTasksWithOptions(request, runtime);
    }

    public DescribeCSGClientsResponse describeCSGClientsWithOptions(DescribeCSGClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientRegionId", request.clientRegionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCSGClients"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCSGClientsResponse());
    }

    public DescribeCSGClientsResponse describeCSGClients(DescribeCSGClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCSGClientsWithOptions(request, runtime);
    }

    public DescribeDashboardResponse describeDashboardWithOptions(DescribeDashboardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendBucketRegionId", request.backendBucketRegionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboard"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardResponse());
    }

    public DescribeDashboardResponse describeDashboard(DescribeDashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDashboardWithOptions(request, runtime);
    }

    public DescribeExpireCachesResponse describeExpireCachesWithOptions(DescribeExpireCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpireCaches"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpireCachesResponse());
    }

    public DescribeExpireCachesResponse describeExpireCaches(DescribeExpireCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExpireCachesWithOptions(request, runtime);
    }

    public DescribeExpressSyncSharesResponse describeExpressSyncSharesWithOptions(DescribeExpressSyncSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpressSyncIds", request.expressSyncIds);
        query.put("IsExternal", request.isExternal);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressSyncShares"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressSyncSharesResponse());
    }

    public DescribeExpressSyncSharesResponse describeExpressSyncShares(DescribeExpressSyncSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExpressSyncSharesWithOptions(request, runtime);
    }

    public DescribeExpressSyncsResponse describeExpressSyncsWithOptions(DescribeExpressSyncsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketName", request.bucketName);
        query.put("BucketPrefix", request.bucketPrefix);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressSyncs"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressSyncsResponse());
    }

    public DescribeExpressSyncsResponse describeExpressSyncs(DescribeExpressSyncsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExpressSyncsWithOptions(request, runtime);
    }

    public DescribeGatewayResponse describeGatewayWithOptions(DescribeGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayResponse());
    }

    public DescribeGatewayResponse describeGateway(DescribeGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayWithOptions(request, runtime);
    }

    public DescribeGatewayADInfoResponse describeGatewayADInfoWithOptions(DescribeGatewayADInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayADInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayADInfoResponse());
    }

    public DescribeGatewayADInfoResponse describeGatewayADInfo(DescribeGatewayADInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayADInfoWithOptions(request, runtime);
    }

    public DescribeGatewayActionsResponse describeGatewayActionsWithOptions(DescribeGatewayActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayActions"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayActionsResponse());
    }

    public DescribeGatewayActionsResponse describeGatewayActions(DescribeGatewayActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayActionsWithOptions(request, runtime);
    }

    public DescribeGatewayAuthInfoResponse describeGatewayAuthInfoWithOptions(DescribeGatewayAuthInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayAuthInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayAuthInfoResponse());
    }

    public DescribeGatewayAuthInfoResponse describeGatewayAuthInfo(DescribeGatewayAuthInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayAuthInfoWithOptions(request, runtime);
    }

    public DescribeGatewayBlockVolumesResponse describeGatewayBlockVolumesWithOptions(DescribeGatewayBlockVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("Refresh", request.refresh);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayBlockVolumes"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayBlockVolumesResponse());
    }

    public DescribeGatewayBlockVolumesResponse describeGatewayBlockVolumes(DescribeGatewayBlockVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayBlockVolumesWithOptions(request, runtime);
    }

    public DescribeGatewayBucketCachesResponse describeGatewayBucketCachesWithOptions(DescribeGatewayBucketCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketName", request.bucketName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayBucketCaches"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayBucketCachesResponse());
    }

    public DescribeGatewayBucketCachesResponse describeGatewayBucketCaches(DescribeGatewayBucketCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayBucketCachesWithOptions(request, runtime);
    }

    public DescribeGatewayCachesResponse describeGatewayCachesWithOptions(DescribeGatewayCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayCaches"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayCachesResponse());
    }

    public DescribeGatewayCachesResponse describeGatewayCaches(DescribeGatewayCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayCachesWithOptions(request, runtime);
    }

    public DescribeGatewayCapacityLimitResponse describeGatewayCapacityLimitWithOptions(DescribeGatewayCapacityLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("SizeInGB", request.sizeInGB);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayCapacityLimit"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayCapacityLimitResponse());
    }

    public DescribeGatewayCapacityLimitResponse describeGatewayCapacityLimit(DescribeGatewayCapacityLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayCapacityLimitWithOptions(request, runtime);
    }

    public DescribeGatewayCategoriesResponse describeGatewayCategoriesWithOptions(DescribeGatewayCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayLocation", request.gatewayLocation);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayCategories"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayCategoriesResponse());
    }

    public DescribeGatewayCategoriesResponse describeGatewayCategories(DescribeGatewayCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayCategoriesWithOptions(request, runtime);
    }

    public DescribeGatewayClassesResponse describeGatewayClassesWithOptions(DescribeGatewayClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayClasses"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayClassesResponse());
    }

    public DescribeGatewayClassesResponse describeGatewayClasses(DescribeGatewayClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayClassesWithOptions(request, runtime);
    }

    public DescribeGatewayCredentialResponse describeGatewayCredentialWithOptions(DescribeGatewayCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayCredential"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayCredentialResponse());
    }

    public DescribeGatewayCredentialResponse describeGatewayCredential(DescribeGatewayCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayCredentialWithOptions(request, runtime);
    }

    public DescribeGatewayDNSResponse describeGatewayDNSWithOptions(DescribeGatewayDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayDNS"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayDNSResponse());
    }

    public DescribeGatewayDNSResponse describeGatewayDNS(DescribeGatewayDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayDNSWithOptions(request, runtime);
    }

    public DescribeGatewayFileSharesResponse describeGatewayFileSharesWithOptions(DescribeGatewayFileSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("Refresh", request.refresh);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayFileShares"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayFileSharesResponse());
    }

    public DescribeGatewayFileSharesResponse describeGatewayFileShares(DescribeGatewayFileSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayFileSharesWithOptions(request, runtime);
    }

    public DescribeGatewayFileStatusResponse describeGatewayFileStatusWithOptions(DescribeGatewayFileStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FilePath", request.filePath);
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayFileStatus"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayFileStatusResponse());
    }

    public DescribeGatewayFileStatusResponse describeGatewayFileStatus(DescribeGatewayFileStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayFileStatusWithOptions(request, runtime);
    }

    public DescribeGatewayImagesResponse describeGatewayImagesWithOptions(DescribeGatewayImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayImages"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayImagesResponse());
    }

    public DescribeGatewayImagesResponse describeGatewayImages(DescribeGatewayImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayImagesWithOptions(request, runtime);
    }

    public DescribeGatewayInfoResponse describeGatewayInfoWithOptions(DescribeGatewayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayInfoResponse());
    }

    public DescribeGatewayInfoResponse describeGatewayInfo(DescribeGatewayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayInfoWithOptions(request, runtime);
    }

    public DescribeGatewayLDAPInfoResponse describeGatewayLDAPInfoWithOptions(DescribeGatewayLDAPInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayLDAPInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayLDAPInfoResponse());
    }

    public DescribeGatewayLDAPInfoResponse describeGatewayLDAPInfo(DescribeGatewayLDAPInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayLDAPInfoWithOptions(request, runtime);
    }

    public DescribeGatewayLocationsResponse describeGatewayLocationsWithOptions(DescribeGatewayLocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayLocations"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayLocationsResponse());
    }

    public DescribeGatewayLocationsResponse describeGatewayLocations(DescribeGatewayLocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayLocationsWithOptions(request, runtime);
    }

    public DescribeGatewayLoggingResponse describeGatewayLoggingWithOptions(DescribeGatewayLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayLogging"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayLoggingResponse());
    }

    public DescribeGatewayLoggingResponse describeGatewayLogging(DescribeGatewayLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayLoggingWithOptions(request, runtime);
    }

    public DescribeGatewayLogsResponse describeGatewayLogsWithOptions(DescribeGatewayLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("LogFilePath", request.logFilePath);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayLogs"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayLogsResponse());
    }

    public DescribeGatewayLogsResponse describeGatewayLogs(DescribeGatewayLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayLogsWithOptions(request, runtime);
    }

    public DescribeGatewayModificationClassesResponse describeGatewayModificationClassesWithOptions(DescribeGatewayModificationClassesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayModificationClasses"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayModificationClassesResponse());
    }

    public DescribeGatewayModificationClassesResponse describeGatewayModificationClasses(DescribeGatewayModificationClassesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayModificationClassesWithOptions(request, runtime);
    }

    public DescribeGatewayNFSClientsResponse describeGatewayNFSClientsWithOptions(DescribeGatewayNFSClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayNFSClients"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayNFSClientsResponse());
    }

    public DescribeGatewayNFSClientsResponse describeGatewayNFSClients(DescribeGatewayNFSClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayNFSClientsWithOptions(request, runtime);
    }

    public DescribeGatewaySMBUsersResponse describeGatewaySMBUsersWithOptions(DescribeGatewaySMBUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewaySMBUsers"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaySMBUsersResponse());
    }

    public DescribeGatewaySMBUsersResponse describeGatewaySMBUsers(DescribeGatewaySMBUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaySMBUsersWithOptions(request, runtime);
    }

    public DescribeGatewayStatisticsResponse describeGatewayStatisticsWithOptions(DescribeGatewayStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTimestamp", request.endTimestamp);
        query.put("GatewayCategory", request.gatewayCategory);
        query.put("GatewayLocation", request.gatewayLocation);
        query.put("SecurityToken", request.securityToken);
        query.put("StartTimestamp", request.startTimestamp);
        query.put("TargetAccountId", request.targetAccountId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayStatistics"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayStatisticsResponse());
    }

    public DescribeGatewayStatisticsResponse describeGatewayStatistics(DescribeGatewayStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayStatisticsWithOptions(request, runtime);
    }

    public DescribeGatewayStockResponse describeGatewayStockWithOptions(DescribeGatewayStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayRegionId", request.gatewayRegionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayStock"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayStockResponse());
    }

    public DescribeGatewayStockResponse describeGatewayStock(DescribeGatewayStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayStockWithOptions(request, runtime);
    }

    public DescribeGatewayTypesResponse describeGatewayTypesWithOptions(DescribeGatewayTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayLocation", request.gatewayLocation);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewayTypes"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayTypesResponse());
    }

    public DescribeGatewayTypesResponse describeGatewayTypes(DescribeGatewayTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayTypesWithOptions(request, runtime);
    }

    public DescribeGatewaysResponse describeGatewaysWithOptions(DescribeGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGateways"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaysResponse());
    }

    public DescribeGatewaysResponse describeGateways(DescribeGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaysWithOptions(request, runtime);
    }

    public DescribeGatewaysForCmsResponse describeGatewaysForCmsWithOptions(DescribeGatewaysForCmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayRegionId", request.gatewayRegionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewaysForCms"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaysForCmsResponse());
    }

    public DescribeGatewaysForCmsResponse describeGatewaysForCms(DescribeGatewaysForCmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaysForCmsWithOptions(request, runtime);
    }

    public DescribeGatewaysTagsResponse describeGatewaysTagsWithOptions(DescribeGatewaysTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayIds", request.gatewayIds);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        query.put("TagCategory", request.tagCategory);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGatewaysTags"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaysTagsResponse());
    }

    public DescribeGatewaysTagsResponse describeGatewaysTags(DescribeGatewaysTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaysTagsWithOptions(request, runtime);
    }

    public DescribeKmsKeyResponse describeKmsKeyWithOptions(DescribeKmsKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("KmsKey", request.kmsKey);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKmsKey"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKmsKeyResponse());
    }

    public DescribeKmsKeyResponse describeKmsKey(DescribeKmsKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKmsKeyWithOptions(request, runtime);
    }

    public DescribeMqttConfigResponse describeMqttConfigWithOptions(DescribeMqttConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMqttConfig"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMqttConfigResponse());
    }

    public DescribeMqttConfigResponse describeMqttConfig(DescribeMqttConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMqttConfigWithOptions(request, runtime);
    }

    public DescribeOssBucketInfoResponse describeOssBucketInfoWithOptions(DescribeOssBucketInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketEndpoint", request.bucketEndpoint);
        query.put("BucketName", request.bucketName);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssBucketInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssBucketInfoResponse());
    }

    public DescribeOssBucketInfoResponse describeOssBucketInfo(DescribeOssBucketInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssBucketInfoWithOptions(request, runtime);
    }

    public DescribeOssBucketsResponse describeOssBucketsWithOptions(DescribeOssBucketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketEndpoint", request.bucketEndpoint);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssBuckets"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssBucketsResponse());
    }

    public DescribeOssBucketsResponse describeOssBuckets(DescribeOssBucketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssBucketsWithOptions(request, runtime);
    }

    public DescribePayAsYouGoPriceResponse describePayAsYouGoPriceWithOptions(DescribePayAsYouGoPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayClass", request.gatewayClass);
        query.put("RegionId", request.regionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePayAsYouGoPrice"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePayAsYouGoPriceResponse());
    }

    public DescribePayAsYouGoPriceResponse describePayAsYouGoPrice(DescribePayAsYouGoPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePayAsYouGoPriceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSharesBucketInfoForExpressSyncResponse describeSharesBucketInfoForExpressSyncWithOptions(DescribeSharesBucketInfoForExpressSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketName", request.bucketName);
        query.put("BucketRegion", request.bucketRegion);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSharesBucketInfoForExpressSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSharesBucketInfoForExpressSyncResponse());
    }

    public DescribeSharesBucketInfoForExpressSyncResponse describeSharesBucketInfoForExpressSync(DescribeSharesBucketInfoForExpressSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSharesBucketInfoForExpressSyncWithOptions(request, runtime);
    }

    public DescribeStorageBundleResponse describeStorageBundleWithOptions(DescribeStorageBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageBundle"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageBundleResponse());
    }

    public DescribeStorageBundleResponse describeStorageBundle(DescribeStorageBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageBundleWithOptions(request, runtime);
    }

    public DescribeStorageBundlesResponse describeStorageBundlesWithOptions(DescribeStorageBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendBucketRegionId", request.backendBucketRegionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageBundles"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageBundlesResponse());
    }

    public DescribeStorageBundlesResponse describeStorageBundles(DescribeStorageBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageBundlesWithOptions(request, runtime);
    }

    public DescribeSubscriptionPriceResponse describeSubscriptionPriceWithOptions(DescribeSubscriptionPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheCloudEfficiencySize", request.cacheCloudEfficiencySize);
        query.put("CacheSSDSize", request.cacheSSDSize);
        query.put("GatewayClass", request.gatewayClass);
        query.put("PeriodQuantity", request.periodQuantity);
        query.put("PeriodUnit", request.periodUnit);
        query.put("RegionId", request.regionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionPrice"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionPriceResponse());
    }

    public DescribeSubscriptionPriceResponse describeSubscriptionPrice(DescribeSubscriptionPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionPriceWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("TargetId", request.targetId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeUserBusinessStatusResponse describeUserBusinessStatusWithOptions(DescribeUserBusinessStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBusinessStatus"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBusinessStatusResponse());
    }

    public DescribeUserBusinessStatusResponse describeUserBusinessStatus(DescribeUserBusinessStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBusinessStatusWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcs"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DisableGatewayLoggingResponse disableGatewayLoggingWithOptions(DisableGatewayLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableGatewayLogging"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableGatewayLoggingResponse());
    }

    public DisableGatewayLoggingResponse disableGatewayLogging(DisableGatewayLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableGatewayLoggingWithOptions(request, runtime);
    }

    public DisableGatewayNFSVersionResponse disableGatewayNFSVersionWithOptions(DisableGatewayNFSVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("NFSVersion", request.NFSVersion);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableGatewayNFSVersion"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableGatewayNFSVersionResponse());
    }

    public DisableGatewayNFSVersionResponse disableGatewayNFSVersion(DisableGatewayNFSVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableGatewayNFSVersionWithOptions(request, runtime);
    }

    public EnableGatewayIpv6Response enableGatewayIpv6WithOptions(EnableGatewayIpv6Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableGatewayIpv6"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableGatewayIpv6Response());
    }

    public EnableGatewayIpv6Response enableGatewayIpv6(EnableGatewayIpv6Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableGatewayIpv6WithOptions(request, runtime);
    }

    public EnableGatewayLoggingResponse enableGatewayLoggingWithOptions(EnableGatewayLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableGatewayLogging"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableGatewayLoggingResponse());
    }

    public EnableGatewayLoggingResponse enableGatewayLogging(EnableGatewayLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableGatewayLoggingWithOptions(request, runtime);
    }

    public ExpandCacheDiskResponse expandCacheDiskWithOptions(ExpandCacheDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("LocalFilePath", request.localFilePath);
        query.put("NewSizeInGB", request.newSizeInGB);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpandCacheDisk"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpandCacheDiskResponse());
    }

    public ExpandCacheDiskResponse expandCacheDisk(ExpandCacheDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.expandCacheDiskWithOptions(request, runtime);
    }

    public ExpandGatewayNetworkBandwidthResponse expandGatewayNetworkBandwidthWithOptions(ExpandGatewayNetworkBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("NewNetworkBandwidth", request.newNetworkBandwidth);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpandGatewayNetworkBandwidth"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpandGatewayNetworkBandwidthResponse());
    }

    public ExpandGatewayNetworkBandwidthResponse expandGatewayNetworkBandwidth(ExpandGatewayNetworkBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.expandGatewayNetworkBandwidthWithOptions(request, runtime);
    }

    public GenerateGatewayTokenResponse generateGatewayTokenWithOptions(GenerateGatewayTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateGatewayToken"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateGatewayTokenResponse());
    }

    public GenerateGatewayTokenResponse generateGatewayToken(GenerateGatewayTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateGatewayTokenWithOptions(request, runtime);
    }

    public GenerateMqttTokenResponse generateMqttTokenWithOptions(GenerateMqttTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateMqttToken"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateMqttTokenResponse());
    }

    public GenerateMqttTokenResponse generateMqttToken(GenerateMqttTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateMqttTokenWithOptions(request, runtime);
    }

    public GenerateStsTokenResponse generateStsTokenWithOptions(GenerateStsTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpireInSeconds", request.expireInSeconds);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("TokenType", request.tokenType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateStsToken"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateStsTokenResponse());
    }

    public GenerateStsTokenResponse generateStsToken(GenerateStsTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateStsTokenWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceRegionId", request.resourceRegionId);
        query.put("ResourceType", request.resourceType);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyGatewayResponse modifyGatewayWithOptions(ModifyGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("GatewayId", request.gatewayId);
        query.put("Name", request.name);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayResponse());
    }

    public ModifyGatewayResponse modifyGateway(ModifyGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGatewayWithOptions(request, runtime);
    }

    public ModifyGatewayBlockVolumeResponse modifyGatewayBlockVolumeWithOptions(ModifyGatewayBlockVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheConfig", request.cacheConfig);
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGatewayBlockVolume"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayBlockVolumeResponse());
    }

    public ModifyGatewayBlockVolumeResponse modifyGatewayBlockVolume(ModifyGatewayBlockVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGatewayBlockVolumeWithOptions(request, runtime);
    }

    public ModifyGatewayClassResponse modifyGatewayClassWithOptions(ModifyGatewayClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayClass", request.gatewayClass);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGatewayClass"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayClassResponse());
    }

    public ModifyGatewayClassResponse modifyGatewayClass(ModifyGatewayClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGatewayClassWithOptions(request, runtime);
    }

    public ModifyGatewayFileShareResponse modifyGatewayFileShareWithOptions(ModifyGatewayFileShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CacheConfig", request.cacheConfig);
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGatewayFileShare"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayFileShareResponse());
    }

    public ModifyGatewayFileShareResponse modifyGatewayFileShare(ModifyGatewayFileShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGatewayFileShareWithOptions(request, runtime);
    }

    public ModifyGatewayFileShareWatermarkResponse modifyGatewayFileShareWatermarkWithOptions(ModifyGatewayFileShareWatermarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        query.put("Watermark", request.watermark);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGatewayFileShareWatermark"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGatewayFileShareWatermarkResponse());
    }

    public ModifyGatewayFileShareWatermarkResponse modifyGatewayFileShareWatermark(ModifyGatewayFileShareWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGatewayFileShareWatermarkWithOptions(request, runtime);
    }

    public ModifyStorageBundleResponse modifyStorageBundleWithOptions(ModifyStorageBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("SecurityToken", request.securityToken);
        query.put("StorageBundleId", request.storageBundleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStorageBundle"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStorageBundleResponse());
    }

    public ModifyStorageBundleResponse modifyStorageBundle(ModifyStorageBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageBundleWithOptions(request, runtime);
    }

    public OpenSgwServiceResponse openSgwServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenSgwService"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenSgwServiceResponse());
    }

    public OpenSgwServiceResponse openSgwService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openSgwServiceWithOptions(runtime);
    }

    public OperateGatewayResponse operateGatewayWithOptions(OperateGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("OperateAction", request.operateAction);
        query.put("Params", request.params);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateGatewayResponse());
    }

    public OperateGatewayResponse operateGateway(OperateGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateGatewayWithOptions(request, runtime);
    }

    public ReleaseServiceResponse releaseServiceWithOptions(ReleaseServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseService"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseServiceResponse());
    }

    public ReleaseServiceResponse releaseService(ReleaseServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseServiceWithOptions(request, runtime);
    }

    public RemoveSharesFromExpressSyncResponse removeSharesFromExpressSyncWithOptions(RemoveSharesFromExpressSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpressSyncId", request.expressSyncId);
        query.put("GatewayShares", request.gatewayShares);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSharesFromExpressSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSharesFromExpressSyncResponse());
    }

    public RemoveSharesFromExpressSyncResponse removeSharesFromExpressSync(RemoveSharesFromExpressSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSharesFromExpressSyncWithOptions(request, runtime);
    }

    public RemoveTagsFromGatewayResponse removeTagsFromGatewayWithOptions(RemoveTagsFromGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTagsFromGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagsFromGatewayResponse());
    }

    public RemoveTagsFromGatewayResponse removeTagsFromGateway(RemoveTagsFromGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsFromGatewayWithOptions(request, runtime);
    }

    public ReportBlockVolumesResponse reportBlockVolumesWithOptions(ReportBlockVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("Info", request.info);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportBlockVolumes"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportBlockVolumesResponse());
    }

    public ReportBlockVolumesResponse reportBlockVolumes(ReportBlockVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportBlockVolumesWithOptions(request, runtime);
    }

    public ReportFileSharesResponse reportFileSharesWithOptions(ReportFileSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("Info", request.info);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportFileShares"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportFileSharesResponse());
    }

    public ReportFileSharesResponse reportFileShares(ReportFileSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportFileSharesWithOptions(request, runtime);
    }

    public ReportGatewayInfoResponse reportGatewayInfoWithOptions(ReportGatewayInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("GatewayStatus", request.gatewayStatus);
        query.put("Info", request.info);
        query.put("SecurityToken", request.securityToken);
        query.put("Time", request.time);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportGatewayInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportGatewayInfoResponse());
    }

    public ReportGatewayInfoResponse reportGatewayInfo(ReportGatewayInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportGatewayInfoWithOptions(request, runtime);
    }

    public ReportGatewayUsageResponse reportGatewayUsageWithOptions(ReportGatewayUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientUUID", request.clientUUID);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("Usage", request.usage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportGatewayUsage"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportGatewayUsageResponse());
    }

    public ReportGatewayUsageResponse reportGatewayUsage(ReportGatewayUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportGatewayUsageWithOptions(request, runtime);
    }

    public ResetGatewayPasswordResponse resetGatewayPasswordWithOptions(ResetGatewayPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("Password", request.password);
        query.put("SecurityToken", request.securityToken);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetGatewayPassword"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetGatewayPasswordResponse());
    }

    public ResetGatewayPasswordResponse resetGatewayPassword(ResetGatewayPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetGatewayPasswordWithOptions(request, runtime);
    }

    public RestartFileSharesResponse restartFileSharesWithOptions(RestartFileSharesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        query.put("ShareProtocol", request.shareProtocol);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartFileShares"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartFileSharesResponse());
    }

    public RestartFileSharesResponse restartFileShares(RestartFileSharesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartFileSharesWithOptions(request, runtime);
    }

    public SetGatewayADInfoResponse setGatewayADInfoWithOptions(SetGatewayADInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IsEnabled", request.isEnabled);
        query.put("Password", request.password);
        query.put("SecurityToken", request.securityToken);
        query.put("ServerIp", request.serverIp);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGatewayADInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGatewayADInfoResponse());
    }

    public SetGatewayADInfoResponse setGatewayADInfo(SetGatewayADInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGatewayADInfoWithOptions(request, runtime);
    }

    public SetGatewayDNSResponse setGatewayDNSWithOptions(SetGatewayDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DnsServer", request.dnsServer);
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGatewayDNS"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGatewayDNSResponse());
    }

    public SetGatewayDNSResponse setGatewayDNS(SetGatewayDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGatewayDNSWithOptions(request, runtime);
    }

    public SetGatewayLDAPInfoResponse setGatewayLDAPInfoWithOptions(SetGatewayLDAPInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BaseDN", request.baseDN);
        query.put("GatewayId", request.gatewayId);
        query.put("IsEnabled", request.isEnabled);
        query.put("IsTls", request.isTls);
        query.put("Password", request.password);
        query.put("RootDN", request.rootDN);
        query.put("SecurityToken", request.securityToken);
        query.put("ServerIp", request.serverIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGatewayLDAPInfo"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGatewayLDAPInfoResponse());
    }

    public SetGatewayLDAPInfoResponse setGatewayLDAPInfo(SetGatewayLDAPInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGatewayLDAPInfoWithOptions(request, runtime);
    }

    public SwitchCSGClientsReverseSyncConfigurationResponse switchCSGClientsReverseSyncConfigurationWithOptions(SwitchCSGClientsReverseSyncConfigurationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SwitchCSGClientsReverseSyncConfigurationShrinkRequest request = new SwitchCSGClientsReverseSyncConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientIds", request.clientIdsShrink);
        query.put("ClientRegionId", request.clientRegionId);
        query.put("IsReverseSync", request.isReverseSync);
        query.put("ReverseSyncInternalSecond", request.reverseSyncInternalSecond);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchCSGClientsReverseSyncConfiguration"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchCSGClientsReverseSyncConfigurationResponse());
    }

    public SwitchCSGClientsReverseSyncConfigurationResponse switchCSGClientsReverseSyncConfiguration(SwitchCSGClientsReverseSyncConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchCSGClientsReverseSyncConfigurationWithOptions(request, runtime);
    }

    public SwitchGatewayExpirationPolicyResponse switchGatewayExpirationPolicyWithOptions(SwitchGatewayExpirationPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchGatewayExpirationPolicy"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchGatewayExpirationPolicyResponse());
    }

    public SwitchGatewayExpirationPolicyResponse switchGatewayExpirationPolicy(SwitchGatewayExpirationPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchGatewayExpirationPolicyWithOptions(request, runtime);
    }

    public SwitchToSubscriptionResponse switchToSubscriptionWithOptions(SwitchToSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchToSubscription"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchToSubscriptionResponse());
    }

    public SwitchToSubscriptionResponse switchToSubscription(SwitchToSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchToSubscriptionWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceRegionId", request.resourceRegionId);
        query.put("ResourceType", request.resourceType);
        query.put("SecurityToken", request.securityToken);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TriggerGatewayRemoteSyncResponse triggerGatewayRemoteSyncWithOptions(TriggerGatewayRemoteSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("Path", request.path);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerGatewayRemoteSync"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerGatewayRemoteSyncResponse());
    }

    public TriggerGatewayRemoteSyncResponse triggerGatewayRemoteSync(TriggerGatewayRemoteSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerGatewayRemoteSyncWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceRegionId", request.resourceRegionId);
        query.put("ResourceType", request.resourceType);
        query.put("SecurityToken", request.securityToken);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateGatewayBlockVolumeResponse updateGatewayBlockVolumeWithOptions(UpdateGatewayBlockVolumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChapEnabled", request.chapEnabled);
        query.put("ChapInPassword", request.chapInPassword);
        query.put("ChapInUser", request.chapInUser);
        query.put("GatewayId", request.gatewayId);
        query.put("IndexId", request.indexId);
        query.put("SecurityToken", request.securityToken);
        query.put("Size", request.size);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayBlockVolume"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayBlockVolumeResponse());
    }

    public UpdateGatewayBlockVolumeResponse updateGatewayBlockVolume(UpdateGatewayBlockVolumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayBlockVolumeWithOptions(request, runtime);
    }

    public UpdateGatewayFileShareResponse updateGatewayFileShareWithOptions(UpdateGatewayFileShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessBasedEnumeration", request.accessBasedEnumeration);
        query.put("BackendLimit", request.backendLimit);
        query.put("Browsable", request.browsable);
        query.put("BypassCacheRead", request.bypassCacheRead);
        query.put("CacheMode", request.cacheMode);
        query.put("ClientSideCmk", request.clientSideCmk);
        query.put("ClientSideEncryption", request.clientSideEncryption);
        query.put("DirectIO", request.directIO);
        query.put("DownloadLimit", request.downloadLimit);
        query.put("FastReclaim", request.fastReclaim);
        query.put("FrontendLimit", request.frontendLimit);
        query.put("GatewayId", request.gatewayId);
        query.put("IgnoreDelete", request.ignoreDelete);
        query.put("InPlace", request.inPlace);
        query.put("IndexId", request.indexId);
        query.put("KmsRotatePeriod", request.kmsRotatePeriod);
        query.put("LagPeriod", request.lagPeriod);
        query.put("Name", request.name);
        query.put("NfsV4Optimization", request.nfsV4Optimization);
        query.put("PollingInterval", request.pollingInterval);
        query.put("ReadOnlyClientList", request.readOnlyClientList);
        query.put("ReadOnlyUserList", request.readOnlyUserList);
        query.put("ReadWriteClientList", request.readWriteClientList);
        query.put("ReadWriteUserList", request.readWriteUserList);
        query.put("RemoteSync", request.remoteSync);
        query.put("RemoteSyncDownload", request.remoteSyncDownload);
        query.put("SecurityToken", request.securityToken);
        query.put("ServerSideCmk", request.serverSideCmk);
        query.put("ServerSideEncryption", request.serverSideEncryption);
        query.put("Squash", request.squash);
        query.put("TransferAcceleration", request.transferAcceleration);
        query.put("WindowsAcl", request.windowsAcl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayFileShare"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayFileShareResponse());
    }

    public UpdateGatewayFileShareResponse updateGatewayFileShare(UpdateGatewayFileShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayFileShareWithOptions(request, runtime);
    }

    public UpgradeGatewayResponse upgradeGatewayWithOptions(UpgradeGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeGateway"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeGatewayResponse());
    }

    public UpgradeGatewayResponse upgradeGateway(UpgradeGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeGatewayWithOptions(request, runtime);
    }

    public UploadCSGClientLogResponse uploadCSGClientLogWithOptions(UploadCSGClientLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientId", request.clientId);
        query.put("ClientRegionId", request.clientRegionId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadCSGClientLog"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCSGClientLogResponse());
    }

    public UploadCSGClientLogResponse uploadCSGClientLog(UploadCSGClientLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadCSGClientLogWithOptions(request, runtime);
    }

    public UploadGatewayLogResponse uploadGatewayLogWithOptions(UploadGatewayLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadGatewayLog"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadGatewayLogResponse());
    }

    public UploadGatewayLogResponse uploadGatewayLog(UploadGatewayLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadGatewayLogWithOptions(request, runtime);
    }

    public ValidateExpressSyncConfigResponse validateExpressSyncConfigWithOptions(ValidateExpressSyncConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BucketName", request.bucketName);
        query.put("BucketPrefix", request.bucketPrefix);
        query.put("BucketRegion", request.bucketRegion);
        query.put("Name", request.name);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateExpressSyncConfig"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateExpressSyncConfigResponse());
    }

    public ValidateExpressSyncConfigResponse validateExpressSyncConfig(ValidateExpressSyncConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateExpressSyncConfigWithOptions(request, runtime);
    }

    public ValidateGatewayNameResponse validateGatewayNameWithOptions(ValidateGatewayNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("StorageBundleId", request.storageBundleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateGatewayName"),
            new TeaPair("version", "2018-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateGatewayNameResponse());
    }

    public ValidateGatewayNameResponse validateGatewayName(ValidateGatewayNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateGatewayNameWithOptions(request, runtime);
    }
}
