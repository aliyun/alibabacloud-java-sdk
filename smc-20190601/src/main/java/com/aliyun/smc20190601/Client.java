// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601;

import com.aliyun.tea.*;
import com.aliyun.smc20190601.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("smc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>A migration source can be associated with only one workgroup.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates multiple migration sources with a workgroup.</p>
     * 
     * @param request AssociateSourceServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateSourceServersResponse
     */
    public AssociateSourceServersResponse associateSourceServersWithOptions(AssociateSourceServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateSourceServers"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateSourceServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>A migration source can be associated with only one workgroup.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates multiple migration sources with a workgroup.</p>
     * 
     * @param request AssociateSourceServersRequest
     * @return AssociateSourceServersResponse
     */
    public AssociateSourceServersResponse associateSourceServers(AssociateSourceServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateSourceServersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to import the information of migration sources by using an activation code, you can call this operation to create one.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an activation code.</p>
     * 
     * @param request CreateAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessTokenResponse
     */
    public CreateAccessTokenResponse createAccessTokenWithOptions(CreateAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeToLiveInDays)) {
            query.put("TimeToLiveInDays", request.timeToLiveInDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessToken"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you want to import the information of migration sources by using an activation code, you can call this operation to create one.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an activation code.</p>
     * 
     * @param request CreateAccessTokenRequest
     * @return CreateAccessTokenResponse
     */
    public CreateAccessTokenResponse createAccessToken(CreateAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cross-zone migration job.</p>
     * 
     * @param request CreateCrossZoneMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCrossZoneMigrationJobResponse
     */
    public CreateCrossZoneMigrationJobResponse createCrossZoneMigrationJobWithOptions(CreateCrossZoneMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disk)) {
            query.put("Disk", request.disk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceType)) {
            query.put("TargetInstanceType", request.targetInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVSwitchId)) {
            query.put("TargetVSwitchId", request.targetVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetZoneId)) {
            query.put("TargetZoneId", request.targetZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCrossZoneMigrationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCrossZoneMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cross-zone migration job.</p>
     * 
     * @param request CreateCrossZoneMigrationJobRequest
     * @return CreateCrossZoneMigrationJobResponse
     */
    public CreateCrossZoneMigrationJobResponse createCrossZoneMigrationJob(CreateCrossZoneMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCrossZoneMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can create migration jobs only for source servers that are in the Available state.</li>
     * <li>Each source server can be associated with only one migration job that is in the Ready, Running, Stopped, Waiting, InError, or Expired state.</li>
     * <li>You can create a maximum of 1,000 migration jobs within each Alibaba Cloud account.</li>
     * <li>If you migrate a source server to an image, you must specify the ImageName, SystemDiskSize, and DataDisk parameters.</li>
     * <li>If you use a virtual private cloud (VPC) to migrate data, the VSwitchId parameter is required and the VpcId parameter is optional.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. This allows you to migrate containerized applications in a cost-effective way.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration job for a source server.</p>
     * 
     * @param request CreateReplicationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReplicationJobResponse
     */
    public CreateReplicationJobResponse createReplicationJobWithOptions(CreateReplicationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerNamespace)) {
            query.put("ContainerNamespace", request.containerNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerRepository)) {
            query.put("ContainerRepository", request.containerRepository);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerTag)) {
            query.put("ContainerTag", request.containerTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            query.put("DataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRamRole)) {
            query.put("InstanceRamRole", request.instanceRamRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            query.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxNumberOfImageToKeep)) {
            query.put("MaxNumberOfImageToKeep", request.maxNumberOfImageToKeep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netMode)) {
            query.put("NetMode", request.netMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationParameters)) {
            query.put("ReplicationParameters", request.replicationParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runOnce)) {
            query.put("RunOnce", request.runOnce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledStartTime)) {
            query.put("ScheduledStartTime", request.scheduledStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskPart)) {
            query.put("SystemDiskPart", request.systemDiskPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            query.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTime)) {
            query.put("ValidTime", request.validTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReplicationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReplicationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can create migration jobs only for source servers that are in the Available state.</li>
     * <li>Each source server can be associated with only one migration job that is in the Ready, Running, Stopped, Waiting, InError, or Expired state.</li>
     * <li>You can create a maximum of 1,000 migration jobs within each Alibaba Cloud account.</li>
     * <li>If you migrate a source server to an image, you must specify the ImageName, SystemDiskSize, and DataDisk parameters.</li>
     * <li>If you use a virtual private cloud (VPC) to migrate data, the VSwitchId parameter is required and the VpcId parameter is optional.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. This allows you to migrate containerized applications in a cost-effective way.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a migration job for a source server.</p>
     * 
     * @param request CreateReplicationJobRequest
     * @return CreateReplicationJobResponse
     */
    public CreateReplicationJobResponse createReplicationJob(CreateReplicationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReplicationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can create up to 50 workgroups within an Alibaba Cloud account.</p>
     * <ul>
     * <li>A workgroup can be associated with a maximum of 50 migration sources.</li>
     * <li>A migration source can be associated with only one workgroup.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a workgroup. You can create a workgroup to manage the lifecycles of multiple migration tasks at a time. This is suitable for scenarios in which multiple servers are migrated.</p>
     * 
     * @param request CreateWorkgroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkgroupResponse
     */
    public CreateWorkgroupResponse createWorkgroupWithOptions(CreateWorkgroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkgroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkgroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can create up to 50 workgroups within an Alibaba Cloud account.</p>
     * <ul>
     * <li>A workgroup can be associated with a maximum of 50 migration sources.</li>
     * <li>A migration source can be associated with only one workgroup.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a workgroup. You can create a workgroup to manage the lifecycles of multiple migration tasks at a time. This is suitable for scenarios in which multiple servers are migrated.</p>
     * 
     * @param request CreateWorkgroupRequest
     * @return CreateWorkgroupResponse
     */
    public CreateWorkgroupResponse createWorkgroup(CreateWorkgroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkgroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The incremental migration job must be in the Waiting state.</li>
     * <li>After you call this operation, the incremental migration job no longer periodically runs. In the meantime, Server Migration Center (SMC) determines whether to perform a full data migration for the last time based on the value of the <code>SyncData</code> parameter. If you set the SyncData parameter to <code>false</code>, SMC releases intermediate resources without data migration before the migration job is complete. If you set the SyncData parameter to <code>true</code>, SMC performs a full data migration and releases intermediate resources before the migration job is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an incremental migration job that periodically runs. After you call this operation to stop an incremental migration job, the migration job is complete.</p>
     * 
     * @param request CutOverReplicationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CutOverReplicationJobResponse
     */
    public CutOverReplicationJobResponse cutOverReplicationJobWithOptions(CutOverReplicationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncData)) {
            query.put("SyncData", request.syncData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CutOverReplicationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CutOverReplicationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The incremental migration job must be in the Waiting state.</li>
     * <li>After you call this operation, the incremental migration job no longer periodically runs. In the meantime, Server Migration Center (SMC) determines whether to perform a full data migration for the last time based on the value of the <code>SyncData</code> parameter. If you set the SyncData parameter to <code>false</code>, SMC releases intermediate resources without data migration before the migration job is complete. If you set the SyncData parameter to <code>true</code>, SMC performs a full data migration and releases intermediate resources before the migration job is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an incremental migration job that periodically runs. After you call this operation to stop an incremental migration job, the migration job is complete.</p>
     * 
     * @param request CutOverReplicationJobRequest
     * @return CutOverReplicationJobResponse
     */
    public CutOverReplicationJobResponse cutOverReplicationJob(CutOverReplicationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cutOverReplicationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete an activation code if you no longer need to import the information about migration sources by using the activation code or if the activation code has expired.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an activation code.</p>
     * 
     * @param request DeleteAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessTokenResponse
     */
    public DeleteAccessTokenResponse deleteAccessTokenWithOptions(DeleteAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenId)) {
            query.put("AccessTokenId", request.accessTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessToken"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete an activation code if you no longer need to import the information about migration sources by using the activation code or if the activation code has expired.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an activation code.</p>
     * 
     * @param request DeleteAccessTokenRequest
     * @return DeleteAccessTokenResponse
     */
    public DeleteAccessTokenResponse deleteAccessToken(DeleteAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Deleted migration jobs cannot be restored.</li>
     * <li>After a migration job is deleted, associated resources, such as the intermediate instance, are automatically released.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration job.</p>
     * 
     * @param request DeleteReplicationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteReplicationJobResponse
     */
    public DeleteReplicationJobResponse deleteReplicationJobWithOptions(DeleteReplicationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteReplicationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteReplicationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Deleted migration jobs cannot be restored.</li>
     * <li>After a migration job is deleted, associated resources, such as the intermediate instance, are automatically released.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration job.</p>
     * 
     * @param request DeleteReplicationJobRequest
     * @return DeleteReplicationJobResponse
     */
    public DeleteReplicationJobResponse deleteReplicationJob(DeleteReplicationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteReplicationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>If a migration job is created for the migration source and the migration job is in the Running state, the migration source cannot be deleted.</li>
     * <li>If a migration job is created for the migration source but the migration job is not in the Running state, you can set the <code>Force</code> parameter to true to delete the migration source.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration source.</p>
     * 
     * @param request DeleteSourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSourceServerResponse
     */
    public DeleteSourceServerResponse deleteSourceServerWithOptions(DeleteSourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSourceServer"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSourceServerResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>If a migration job is created for the migration source and the migration job is in the Running state, the migration source cannot be deleted.</li>
     * <li>If a migration job is created for the migration source but the migration job is not in the Running state, you can set the <code>Force</code> parameter to true to delete the migration source.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a migration source.</p>
     * 
     * @param request DeleteSourceServerRequest
     * @return DeleteSourceServerResponse
     */
    public DeleteSourceServerResponse deleteSourceServer(DeleteSourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSourceServerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To delete a workgroup, you must delete or dissociate the migration source that is associated with the workgroup. For more information, see <a href="https://help.aliyun.com/document_detail/2402124.html">DeleteSourceServer</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workgroup.</p>
     * 
     * @param request DeleteWorkgroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkgroupResponse
     */
    public DeleteWorkgroupResponse deleteWorkgroupWithOptions(DeleteWorkgroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkgroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkgroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>To delete a workgroup, you must delete or dissociate the migration source that is associated with the workgroup. For more information, see <a href="https://help.aliyun.com/document_detail/2402124.html">DeleteSourceServer</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workgroup.</p>
     * 
     * @param request DeleteWorkgroupRequest
     * @return DeleteWorkgroupResponse
     */
    public DeleteWorkgroupResponse deleteWorkgroup(DeleteWorkgroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkgroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. You can use SMC to migrate containerized applications in a cost-effective way. For more information, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of migration jobs.</p>
     * 
     * @param request DescribeReplicationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeReplicationJobsResponse
     */
    public DescribeReplicationJobsResponse describeReplicationJobsWithOptions(DescribeReplicationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessStatus)) {
            query.put("BusinessStatus", request.businessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReplicationJobs"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicationJobsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</li>
     * <li>Server Migration Center (SMC) allows you to migrate source servers to Docker container images. You can use SMC to migrate containerized applications in a cost-effective way. For more information, see <a href="https://help.aliyun.com/document_detail/60744.html">Terms</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of migration jobs.</p>
     * 
     * @param request DescribeReplicationJobsRequest
     * @return DescribeReplicationJobsResponse
     */
    public DescribeReplicationJobsResponse describeReplicationJobs(DescribeReplicationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReplicationJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about migration sources.</p>
     * 
     * @param request DescribeSourceServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSourceServersResponse
     */
    public DescribeSourceServersResponse describeSourceServersWithOptions(DescribeSourceServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.relatedJobType)) {
            query.put("RelatedJobType", request.relatedJobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSourceServers"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSourceServersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are used as filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about migration sources.</p>
     * 
     * @param request DescribeSourceServersRequest
     * @return DescribeSourceServersResponse
     */
    public DescribeSourceServersResponse describeSourceServers(DescribeSourceServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSourceServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about workgroups. After you create a workgroup, you can query the information about the workgroup, such as the name, description, and alert information.</p>
     * 
     * @param request DescribeWorkgroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkgroupsResponse
     */
    public DescribeWorkgroupsResponse describeWorkgroupsWithOptions(DescribeWorkgroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkgroups"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkgroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about workgroups. After you create a workgroup, you can query the information about the workgroup, such as the name, description, and alert information.</p>
     * 
     * @param request DescribeWorkgroupsRequest
     * @return DescribeWorkgroupsResponse
     */
    public DescribeWorkgroupsResponse describeWorkgroups(DescribeWorkgroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWorkgroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To prevent an activation code from being leaked, you can call this operation to disable the activation code. Disabled activation codes can no longer be used to import the information about migration sources. However, migration sources whose information has been imported are not affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an activation code.</p>
     * 
     * @param request DisableAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAccessTokenResponse
     */
    public DisableAccessTokenResponse disableAccessTokenWithOptions(DisableAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenId)) {
            query.put("AccessTokenId", request.accessTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAccessToken"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>To prevent an activation code from being leaked, you can call this operation to disable the activation code. Disabled activation codes can no longer be used to import the information about migration sources. However, migration sources whose information has been imported are not affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an activation code.</p>
     * 
     * @param request DisableAccessTokenRequest
     * @return DisableAccessTokenResponse
     */
    public DisableAccessTokenResponse disableAccessToken(DisableAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates migration sources from a workgroup. If you do not need to use a workgroup to migrate migration sources, you can disassociate the migration sources from the workgroup.</p>
     * 
     * @param request DisassociateSourceServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateSourceServersResponse
     */
    public DisassociateSourceServersResponse disassociateSourceServersWithOptions(DisassociateSourceServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateSourceServers"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateSourceServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates migration sources from a workgroup. If you do not need to use a workgroup to migrate migration sources, you can disassociate the migration sources from the workgroup.</p>
     * 
     * @param request DisassociateSourceServersRequest
     * @return DisassociateSourceServersResponse
     */
    public DisassociateSourceServersResponse disassociateSourceServers(DisassociateSourceServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateSourceServersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query activation codes and the usage details of the activation codes. An activation code can be in the activated, unactivated, or expired state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries activation codes and the usage details of the activation codes.</p>
     * 
     * @param request ListAccessTokensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessTokensResponse
     */
    public ListAccessTokensResponse listAccessTokensWithOptions(ListAccessTokensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenId)) {
            query.put("AccessTokenId", request.accessTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessTokens"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessTokensResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query activation codes and the usage details of the activation codes. An activation code can be in the activated, unactivated, or expired state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries activation codes and the usage details of the activation codes.</p>
     * 
     * @param request ListAccessTokensRequest
     * @return ListAccessTokensResponse
     */
    public ListAccessTokensResponse listAccessTokens(ListAccessTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessTokensWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to Server Migration Center (SMC) resources. SMC resources include migration sources and migration jobs.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
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
            new TeaPair("version", "2019-06-01"),
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
     * <p>Queries the tags that are attached to Server Migration Center (SMC) resources. SMC resources include migration sources and migration jobs.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you modify the parameters of a migration job, take note of the following information:</p>
     * <ul>
     * <li>The <code>Name</code> and <code>Description</code> parameters can be modified during the lifecycle of the migration job.</li>
     * <li>The <code>Frequency</code> and <code>MaxNumberOfImageToKeep</code> parameters can be modified only before the migration job is executed or when the migration job is in the <code>Waiting</code> state.</li>
     * <li>Other parameters can be modified only before the migration job is executed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the parameters of a migration job.</p>
     * 
     * @param request ModifyReplicationJobAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyReplicationJobAttributeResponse
     */
    public ModifyReplicationJobAttributeResponse modifyReplicationJobAttributeWithOptions(ModifyReplicationJobAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerNamespace)) {
            query.put("ContainerNamespace", request.containerNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerRepository)) {
            query.put("ContainerRepository", request.containerRepository);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerTag)) {
            query.put("ContainerTag", request.containerTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            query.put("DataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRamRole)) {
            query.put("InstanceRamRole", request.instanceRamRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxNumberOfImageToKeep)) {
            query.put("MaxNumberOfImageToKeep", request.maxNumberOfImageToKeep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netMode)) {
            query.put("NetMode", request.netMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationParameters)) {
            query.put("ReplicationParameters", request.replicationParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledStartTime)) {
            query.put("ScheduledStartTime", request.scheduledStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskPart)) {
            query.put("SystemDiskPart", request.systemDiskPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            query.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTime)) {
            query.put("ValidTime", request.validTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyReplicationJobAttribute"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyReplicationJobAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you modify the parameters of a migration job, take note of the following information:</p>
     * <ul>
     * <li>The <code>Name</code> and <code>Description</code> parameters can be modified during the lifecycle of the migration job.</li>
     * <li>The <code>Frequency</code> and <code>MaxNumberOfImageToKeep</code> parameters can be modified only before the migration job is executed or when the migration job is in the <code>Waiting</code> state.</li>
     * <li>Other parameters can be modified only before the migration job is executed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the parameters of a migration job.</p>
     * 
     * @param request ModifyReplicationJobAttributeRequest
     * @return ModifyReplicationJobAttributeResponse
     */
    public ModifyReplicationJobAttributeResponse modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReplicationJobAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation regardless of the status of the migration source.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a migration source.</p>
     * 
     * @param request ModifySourceServerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySourceServerAttributeResponse
     */
    public ModifySourceServerAttributeResponse modifySourceServerAttributeWithOptions(ModifySourceServerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySourceServerAttribute"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySourceServerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation regardless of the status of the migration source.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a migration source.</p>
     * 
     * @param request ModifySourceServerAttributeRequest
     * @return ModifySourceServerAttributeResponse
     */
    public ModifySourceServerAttributeResponse modifySourceServerAttribute(ModifySourceServerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySourceServerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a workgroup.</p>
     * 
     * @param request ModifyWorkgroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWorkgroupAttributeResponse
     */
    public ModifyWorkgroupAttributeResponse modifyWorkgroupAttributeWithOptions(ModifyWorkgroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workgroupId)) {
            query.put("WorkgroupId", request.workgroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWorkgroupAttribute"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWorkgroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a workgroup.</p>
     * 
     * @param request ModifyWorkgroupAttributeRequest
     * @return ModifyWorkgroupAttributeResponse
     */
    public ModifyWorkgroupAttributeResponse modifyWorkgroupAttribute(ModifyWorkgroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWorkgroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation can only be used to start the migration jobs that are in the Ready, Stopped, or InError state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a migration job.</p>
     * 
     * @param request StartReplicationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartReplicationJobResponse
     */
    public StartReplicationJobResponse startReplicationJobWithOptions(StartReplicationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartReplicationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartReplicationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation can only be used to start the migration jobs that are in the Ready, Stopped, or InError state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a migration job.</p>
     * 
     * @param request StartReplicationJobRequest
     * @return StartReplicationJobResponse
     */
    public StartReplicationJobResponse startReplicationJob(StartReplicationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startReplicationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to pause only a migration job whose primary status is Running and business status is Syncing.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses a migration job.</p>
     * 
     * @param request StopReplicationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopReplicationJobResponse
     */
    public StopReplicationJobResponse stopReplicationJobWithOptions(StopReplicationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopReplicationJob"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopReplicationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to pause only a migration job whose primary status is Running and business status is Syncing.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses a migration job.</p>
     * 
     * @param request StopReplicationJobRequest
     * @return StopReplicationJobResponse
     */
    public StopReplicationJobResponse stopReplicationJob(StopReplicationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopReplicationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Up to 20 tags can be added to each SMC resource.
     * Before you add tags to an SMC resource, Alibaba Cloud checks the number of the tags that have been added to the resource. If the maximum number is reached, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to Server Migration Center (SMC) resources. The SMC resources include migration sources and jobs.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
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
            new TeaPair("version", "2019-06-01"),
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
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Up to 20 tags can be added to each SMC resource.
     * Before you add tags to an SMC resource, Alibaba Cloud checks the number of the tags that have been added to the resource. If the maximum number is reached, an error message is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to Server Migration Center (SMC) resources. The SMC resources include migration sources and jobs.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove tags that are added to one or more SMC resources and delete the tags if the tags are no longer used.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags that are added to Server Migration Center (SMC) resources. The SMC resources include migration sources and jobs.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
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
            new TeaPair("version", "2019-06-01"),
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
     * <b>description</b> :
     * <p>You can call this operation to remove tags that are added to one or more SMC resources and delete the tags if the tags are no longer used.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags that are added to Server Migration Center (SMC) resources. The SMC resources include migration sources and jobs.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
