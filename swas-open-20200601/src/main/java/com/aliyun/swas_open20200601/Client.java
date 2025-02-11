// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601;

import com.aliyun.tea.*;
import com.aliyun.swas_open20200601.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("swas-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  Before you share a custom image, make sure that all sensitive data and files are removed from the image.</p>
     * <ul>
     * <li>The IDs of the Alibaba Cloud accounts with which you want to share the image is obtained. Move the pointer over the profile in the upper-right corner of the Simple Application Server console. In the card that appears, if Main Account is displayed, the showed account ID is the Alibaba Cloud account ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares a custom image with other Alibaba Cloud accounts in the same region to quickly deploy the same environment configurations for multiple simple application servers at a time. This improves deployment efficiency.</p>
     * 
     * @param request AddCustomImageShareAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomImageShareAccountResponse
     */
    public AddCustomImageShareAccountResponse addCustomImageShareAccountWithOptions(AddCustomImageShareAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomImageShareAccount"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomImageShareAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddCustomImageShareAccountResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you share a custom image, make sure that all sensitive data and files are removed from the image.</p>
     * <ul>
     * <li>The IDs of the Alibaba Cloud accounts with which you want to share the image is obtained. Move the pointer over the profile in the upper-right corner of the Simple Application Server console. In the card that appears, if Main Account is displayed, the showed account ID is the Alibaba Cloud account ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares a custom image with other Alibaba Cloud accounts in the same region to quickly deploy the same environment configurations for multiple simple application servers at a time. This improves deployment efficiency.</p>
     * 
     * @param request AddCustomImageShareAccountRequest
     * @return AddCustomImageShareAccountResponse
     */
    public AddCustomImageShareAccountResponse addCustomImageShareAccount(AddCustomImageShareAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomImageShareAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, no public endpoints are assigned to Simple Database Service instances. If you want to access the databases of a Simple Database Service instance over the Internet by using Simple Container Service or Data Management (DMS), you must apply for a public endpoint for the Simple Database Service instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for a Simple Database Service instance.</p>
     * 
     * @param request AllocatePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocatePublicConnectionResponse
     */
    public AllocatePublicConnectionResponse allocatePublicConnectionWithOptions(AllocatePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocatePublicConnection"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AllocatePublicConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AllocatePublicConnectionResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>By default, no public endpoints are assigned to Simple Database Service instances. If you want to access the databases of a Simple Database Service instance over the Internet by using Simple Container Service or Data Management (DMS), you must apply for a public endpoint for the Simple Database Service instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for a Simple Database Service instance.</p>
     * 
     * @param request AllocatePublicConnectionRequest
     * @return AllocatePublicConnectionResponse
     */
    public AllocatePublicConnectionResponse allocatePublicConnection(AllocatePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocatePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the port range, protocol, and source IP address of a firewall rule in a firewall template are the same as the port range, protocol, and source IP address of an existing rule, the new rule overwrites the existing rule regardless of whether the existing rule is enabled or disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a firewall template to apply firewall rules to multiple simple application servers at a time. This improves your efficiency of setting firewall rules.</p>
     * 
     * @param request ApplyFirewallTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyFirewallTemplateResponse
     */
    public ApplyFirewallTemplateResponse applyFirewallTemplateWithOptions(ApplyFirewallTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyFirewallTemplate"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyFirewallTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ApplyFirewallTemplateResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If the port range, protocol, and source IP address of a firewall rule in a firewall template are the same as the port range, protocol, and source IP address of an existing rule, the new rule overwrites the existing rule regardless of whether the existing rule is enabled or disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a firewall template to apply firewall rules to multiple simple application servers at a time. This improves your efficiency of setting firewall rules.</p>
     * 
     * @param request ApplyFirewallTemplateRequest
     * @return ApplyFirewallTemplateResponse
     */
    public ApplyFirewallTemplateResponse applyFirewallTemplate(ApplyFirewallTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyFirewallTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can bind only one key pair to a simple application server in the Simple Application Server console. If a simple application server has a key pair bound, the new key pair overwrites the original key pair.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a key pair to simple application servers.</p>
     * 
     * @param request AttachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AttachKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AttachKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can bind only one key pair to a simple application server in the Simple Application Server console. If a simple application server has a key pair bound, the new key pair overwrites the original key pair.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a key pair to simple application servers.</p>
     * 
     * @param request AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Cloud Assistant command.</p>
     * 
     * @param request CreateCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableParameter)) {
            query.put("EnableParameter", request.enableParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDir)) {
            query.put("WorkingDir", request.workingDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommand"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommandResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCommandResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Cloud Assistant command.</p>
     * 
     * @param request CreateCommandRequest
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A custom image is created from a snapshot of a simple application server. You can use a custom image to create multiple simple application servers that have the same configurations. You can also share custom images to ECS and use the shared images to create ECS instances or replace the OSs of existing ECS instances. For more information about custom images, see <a href="https://help.aliyun.com/document_detail/199375.html">Overview of custom images</a>.
     * You must create a system disk snapshot of a simple application server before you create a custom image based on the snapshot. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.</p>
     * <blockquote>
     * <p> If you need the data on the data disk of a simple application server when you create a custom image, create a snapshot for the data disk first.
     * Before you create a custom image, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The custom image and the corresponding simple application server must reside in the same region.</li>
     * <li>The maximum number of custom images that you can create is 3 times the number of simple application servers that you have, but cannot exceed 15.</li>
     * <li>You can directly create a custom image only based on the system disk snapshot of a simple application server. If you want a custom image to contain the data on the data disk of the simple application server, you must select a data disk snapshot in addition to a system disk snapshot when you create the custom image.</li>
     * <li>If a simple application server is released due to expiration or refunds, the custom images that are created based on the server are also released.</li>
     * <li>Resetting the system or changing the image of a simple application server clears the disk data on the server. Back up the data as needed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom image based on a snapshot of a simple application server.</p>
     * 
     * @param request CreateCustomImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImageWithOptions(CreateCustomImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSnapshotId)) {
            query.put("DataSnapshotId", request.dataSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemSnapshotId)) {
            query.put("SystemSnapshotId", request.systemSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomImage"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCustomImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>A custom image is created from a snapshot of a simple application server. You can use a custom image to create multiple simple application servers that have the same configurations. You can also share custom images to ECS and use the shared images to create ECS instances or replace the OSs of existing ECS instances. For more information about custom images, see <a href="https://help.aliyun.com/document_detail/199375.html">Overview of custom images</a>.
     * You must create a system disk snapshot of a simple application server before you create a custom image based on the snapshot. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.</p>
     * <blockquote>
     * <p> If you need the data on the data disk of a simple application server when you create a custom image, create a snapshot for the data disk first.
     * Before you create a custom image, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The custom image and the corresponding simple application server must reside in the same region.</li>
     * <li>The maximum number of custom images that you can create is 3 times the number of simple application servers that you have, but cannot exceed 15.</li>
     * <li>You can directly create a custom image only based on the system disk snapshot of a simple application server. If you want a custom image to contain the data on the data disk of the simple application server, you must select a data disk snapshot in addition to a system disk snapshot when you create the custom image.</li>
     * <li>If a simple application server is released due to expiration or refunds, the custom images that are created based on the server are also released.</li>
     * <li>Resetting the system or changing the image of a simple application server clears the disk data on the server. Back up the data as needed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom image based on a snapshot of a simple application server.</p>
     * 
     * @param request CreateCustomImageRequest
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a firewall rule for a simple application server.</p>
     * 
     * @param request CreateFirewallRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFirewallRuleResponse
     */
    public CreateFirewallRuleResponse createFirewallRuleWithOptions(CreateFirewallRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleProtocol)) {
            query.put("RuleProtocol", request.ruleProtocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirewallRule"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirewallRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFirewallRuleResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a firewall rule for a simple application server.</p>
     * 
     * @param request CreateFirewallRuleRequest
     * @return CreateFirewallRuleResponse
     */
    public CreateFirewallRuleResponse createFirewallRule(CreateFirewallRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFirewallRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple firewall rules for a simple application server at a time.</p>
     * 
     * @param tmpReq CreateFirewallRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFirewallRulesResponse
     */
    public CreateFirewallRulesResponse createFirewallRulesWithOptions(CreateFirewallRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFirewallRulesShrinkRequest request = new CreateFirewallRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.firewallRules)) {
            request.firewallRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.firewallRules, "FirewallRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallRulesShrink)) {
            query.put("FirewallRules", request.firewallRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirewallRules"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirewallRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFirewallRulesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple firewall rules for a simple application server at a time.</p>
     * 
     * @param request CreateFirewallRulesRequest
     * @return CreateFirewallRulesResponse
     */
    public CreateFirewallRulesResponse createFirewallRules(CreateFirewallRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFirewallRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Simple Application Server supports the firewall template feature that provides multiple firewall rules. You can use a template to add a group of firewall rules to one or more simple application servers at a time. This improves the efficiency of setting firewall rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a firewall template.</p>
     * 
     * @param request CreateFirewallTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFirewallTemplateResponse
     */
    public CreateFirewallTemplateResponse createFirewallTemplateWithOptions(CreateFirewallTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallRule)) {
            query.put("FirewallRule", request.firewallRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirewallTemplate"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirewallTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFirewallTemplateResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Simple Application Server supports the firewall template feature that provides multiple firewall rules. You can use a template to add a group of firewall rules to one or more simple application servers at a time. This improves the efficiency of setting firewall rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a firewall template.</p>
     * 
     * @param request CreateFirewallTemplateRequest
     * @return CreateFirewallTemplateResponse
     */
    public CreateFirewallTemplateResponse createFirewallTemplate(CreateFirewallTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFirewallTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Adding firewall rules to a firewall template does not affect the firewall rules that have been applied to simple application servers..</p>
     * 
     * <b>summary</b> : 
     * <p>Adds firewall rules to a firewall template based on your business requirements.</p>
     * 
     * @param request CreateFirewallTemplateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFirewallTemplateRulesResponse
     */
    public CreateFirewallTemplateRulesResponse createFirewallTemplateRulesWithOptions(CreateFirewallTemplateRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallRule)) {
            query.put("FirewallRule", request.firewallRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFirewallTemplateRules"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFirewallTemplateRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFirewallTemplateRulesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Adding firewall rules to a firewall template does not affect the firewall rules that have been applied to simple application servers..</p>
     * 
     * <b>summary</b> : 
     * <p>Adds firewall rules to a firewall template based on your business requirements.</p>
     * 
     * @param request CreateFirewallTemplateRulesRequest
     * @return CreateFirewallTemplateRulesResponse
     */
    public CreateFirewallTemplateRulesResponse createFirewallTemplateRules(CreateFirewallTemplateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFirewallTemplateRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a key pair for a simple application server.</p>
     * 
     * @param request CreateInstanceKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceKeyPairResponse
     */
    public CreateInstanceKeyPairResponse createInstanceKeyPairWithOptions(CreateInstanceKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateInstanceKeyPairResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a key pair for a simple application server.</p>
     * 
     * @param request CreateInstanceKeyPairRequest
     * @return CreateInstanceKeyPairResponse
     */
    public CreateInstanceKeyPairResponse createInstanceKeyPair(CreateInstanceKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing rules of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <blockquote>
     * <p> If you have coupons in your Alibaba Cloud account, the coupons are preferentially used to pay for the simple application servers.</p>
     * </blockquote>
     * <ul>
     * <li>You can create a maximum of 50 simple application servers in a region for an Alibaba Cloud account.</li>
     * <li>When you call this operation to create simple application servers, make sure that the balance in your account is sufficient to pay for the servers. If the balance in your account is insufficient, the servers cannot be created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates subscription simple application servers.</p>
     * 
     * @param request CreateInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstancesResponse
     */
    public CreateInstancesResponse createInstancesWithOptions(CreateInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateInstancesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing rules of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <blockquote>
     * <p> If you have coupons in your Alibaba Cloud account, the coupons are preferentially used to pay for the simple application servers.</p>
     * </blockquote>
     * <ul>
     * <li>You can create a maximum of 50 simple application servers in a region for an Alibaba Cloud account.</li>
     * <li>When you call this operation to create simple application servers, make sure that the balance in your account is sufficient to pay for the servers. If the balance in your account is insufficient, the servers cannot be created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates subscription simple application servers.</p>
     * 
     * @param request CreateInstancesRequest
     * @return CreateInstancesResponse
     */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud SSH key pairs offer a secure and efficient logon authentication mechanism, facilitating both verification and encrypted communication within the SSH protocol framework. An SSH key pair is essentially constituted by a public key and a private key. Tailored for Linux-based simple application servers, this security measure enhances security and convenience, effectively addressing your heightened security requirements.</p>
     * <ul>
     * <li>The key pair logon method is only valid for Linux-based simple application servers.</li>
     * <li>A maximum of 10 key pairs can be created in a region for an Alibaba Cloud account.</li>
     * <li>Only RSA 2048-bit key pairs can be created in the Simple Application Server console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a key pair.</p>
     * 
     * @param request CreateKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud SSH key pairs offer a secure and efficient logon authentication mechanism, facilitating both verification and encrypted communication within the SSH protocol framework. An SSH key pair is essentially constituted by a public key and a private key. Tailored for Linux-based simple application servers, this security measure enhances security and convenience, effectively addressing your heightened security requirements.</p>
     * <ul>
     * <li>The key pair logon method is only valid for Linux-based simple application servers.</li>
     * <li>A maximum of 10 key pairs can be created in a region for an Alibaba Cloud account.</li>
     * <li>Only RSA 2048-bit key pairs can be created in the Simple Application Server console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a key pair.</p>
     * 
     * @param request CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A snapshot is a point-in-time backup of a disk. Snapshots can be used to back up data, recover data after misoperations on servers, recover data after network attacks, and create custom images.</p>
     * <blockquote>
     * <p> You are not charged for creating snapshots in Simple Application Server.</p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You can create up to three snapshots for each simple application server.</li>
     * <li>The maximum number of snapshots that you create per Alibaba Cloud account is triple of the number of simple application servers that are created. The value cannot be greater than 15.</li>
     * <li>If a simple application server is automatically released due to expiration, the snapshots created for the server are deleted.</li>
     * <li>If you reset a simple application server after you create a snapshot for the server, the snapshot is retained but cannot be used to restore the disks of the server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot for a disk.</p>
     * 
     * @param request CreateSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSnapshotResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>A snapshot is a point-in-time backup of a disk. Snapshots can be used to back up data, recover data after misoperations on servers, recover data after network attacks, and create custom images.</p>
     * <blockquote>
     * <p> You are not charged for creating snapshots in Simple Application Server.</p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You can create up to three snapshots for each simple application server.</li>
     * <li>The maximum number of snapshots that you create per Alibaba Cloud account is triple of the number of simple application servers that are created. The value cannot be greater than 15.</li>
     * <li>If a simple application server is automatically released due to expiration, the snapshots created for the server are deleted.</li>
     * <li>If you reset a simple application server after you create a snapshot for the server, the snapshot is retained but cannot be used to restore the disks of the server.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot for a disk.</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete commands that are being run.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Command Assistant command.</p>
     * 
     * @param request DeleteCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommandWithOptions(DeleteCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCommand"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCommandResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCommandResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You cannot delete commands that are being run.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Command Assistant command.</p>
     * 
     * @param request DeleteCommandRequest
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a custom image that you no longer need. After the custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.</p>
     * <blockquote>
     * <p> To delete a shared image, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or API. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see <a href="https://help.aliyun.com/document_detail/199378.html">Copy a shared image of a simple application server in the ECS console</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
     * 
     * @param request DeleteCustomImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomImageResponse
     */
    public DeleteCustomImageResponse deleteCustomImageWithOptions(DeleteCustomImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomImage"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCustomImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can delete a custom image that you no longer need. After the custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.</p>
     * <blockquote>
     * <p> To delete a shared image, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or API. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see <a href="https://help.aliyun.com/document_detail/199378.html">Copy a shared image of a simple application server in the ECS console</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
     * 
     * @param request DeleteCustomImageRequest
     * @return DeleteCustomImageResponse
     */
    public DeleteCustomImageResponse deleteCustomImage(DeleteCustomImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a custom image is shared, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or by calling an ECS API operation. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see <a href="https://help.aliyun.com/document_detail/199378.html">Copy a custom image</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes custom images. If you no longer require a custom image, you can call this operation to delete the custom image. You can also call this operation to delete multiple custom images at the same time. After a custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.</p>
     * 
     * @param request DeleteCustomImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomImagesResponse
     */
    public DeleteCustomImagesResponse deleteCustomImagesWithOptions(DeleteCustomImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            query.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomImages"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomImagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCustomImagesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If a custom image is shared, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or by calling an ECS API operation. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see <a href="https://help.aliyun.com/document_detail/199378.html">Copy a custom image</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes custom images. If you no longer require a custom image, you can call this operation to delete the custom image. You can also call this operation to delete multiple custom images at the same time. After a custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.</p>
     * 
     * @param request DeleteCustomImagesRequest
     * @return DeleteCustomImagesResponse
     */
    public DeleteCustomImagesResponse deleteCustomImages(DeleteCustomImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a firewall rule of a simple application server.</p>
     * 
     * @param request DeleteFirewallRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFirewallRuleResponse
     */
    public DeleteFirewallRuleResponse deleteFirewallRuleWithOptions(DeleteFirewallRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFirewallRule"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFirewallRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFirewallRuleResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a firewall rule of a simple application server.</p>
     * 
     * @param request DeleteFirewallRuleRequest
     * @return DeleteFirewallRuleResponse
     */
    public DeleteFirewallRuleResponse deleteFirewallRule(DeleteFirewallRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFirewallRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple firewall rules of a simple application server.</p>
     * 
     * @param tmpReq DeleteFirewallRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFirewallRulesResponse
     */
    public DeleteFirewallRulesResponse deleteFirewallRulesWithOptions(DeleteFirewallRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteFirewallRulesShrinkRequest request = new DeleteFirewallRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ruleIds)) {
            request.ruleIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ruleIds, "RuleIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIdsShrink)) {
            query.put("RuleIds", request.ruleIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFirewallRules"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFirewallRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFirewallRulesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple firewall rules of a simple application server.</p>
     * 
     * @param request DeleteFirewallRulesRequest
     * @return DeleteFirewallRulesResponse
     */
    public DeleteFirewallRulesResponse deleteFirewallRules(DeleteFirewallRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFirewallRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletion of firewall rules does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes firewall rules from a firewall template based on your requirements.</p>
     * 
     * @param request DeleteFirewallTemplateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFirewallTemplateRulesResponse
     */
    public DeleteFirewallTemplateRulesResponse deleteFirewallTemplateRulesWithOptions(DeleteFirewallTemplateRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateRuleId)) {
            query.put("FirewallTemplateRuleId", request.firewallTemplateRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFirewallTemplateRules"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFirewallTemplateRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFirewallTemplateRulesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Deletion of firewall rules does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes firewall rules from a firewall template based on your requirements.</p>
     * 
     * @param request DeleteFirewallTemplateRulesRequest
     * @return DeleteFirewallTemplateRulesResponse
     */
    public DeleteFirewallTemplateRulesResponse deleteFirewallTemplateRules(DeleteFirewallTemplateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFirewallTemplateRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deleting a firewall template does not affect the firewall rules that have been applied to simple application servers. You can delete firewall templates that you no longer need.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes firewall templates from a simple application server.</p>
     * 
     * @param request DeleteFirewallTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFirewallTemplatesResponse
     */
    public DeleteFirewallTemplatesResponse deleteFirewallTemplatesWithOptions(DeleteFirewallTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFirewallTemplates"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFirewallTemplatesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFirewallTemplatesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Deleting a firewall template does not affect the firewall rules that have been applied to simple application servers. You can delete firewall templates that you no longer need.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes firewall templates from a simple application server.</p>
     * 
     * @param request DeleteFirewallTemplatesRequest
     * @return DeleteFirewallTemplatesResponse
     */
    public DeleteFirewallTemplatesResponse deleteFirewallTemplates(DeleteFirewallTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFirewallTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the key pair of a simple application server.</p>
     * 
     * @param request DeleteInstanceKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceKeyPairResponse
     */
    public DeleteInstanceKeyPairResponse deleteInstanceKeyPairWithOptions(DeleteInstanceKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteInstanceKeyPairResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the key pair of a simple application server.</p>
     * 
     * @param request DeleteInstanceKeyPairRequest
     * @return DeleteInstanceKeyPairResponse
     */
    public DeleteInstanceKeyPairResponse deleteInstanceKeyPair(DeleteInstanceKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must unbind SSH key pairs that you no longer use from simple application servers before you delete the SSH key pairs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the SSH key pairs of simple application servers.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairNames)) {
            query.put("KeyPairNames", request.keyPairNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteKeyPairsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You must unbind SSH key pairs that you no longer use from simple application servers before you delete the SSH key pairs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the SSH key pairs of simple application servers.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a snapshot if you no longer need it.</p>
     * <blockquote>
     * <p> If a custom image was created from the snapshot, delete the custom image before you delete the snapshot.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a snapshot of a simple application server.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSnapshotResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can delete a snapshot if you no longer need it.</p>
     * <blockquote>
     * <p> If a custom image was created from the snapshot, delete the custom image before you delete the snapshot.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a snapshot of a simple application server.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes snapshots of a simple application server.</p>
     * 
     * @param request DeleteSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotsResponse
     */
    public DeleteSnapshotsResponse deleteSnapshotsWithOptions(DeleteSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshots"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSnapshotsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes snapshots of a simple application server.</p>
     * 
     * @param request DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     */
    public DeleteSnapshotsResponse deleteSnapshots(DeleteSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Command Assistant information of simple application servers.</p>
     * 
     * @param tmpReq DescribeCloudAssistantAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudAssistantAttributesResponse
     */
    public DescribeCloudAssistantAttributesResponse describeCloudAssistantAttributesWithOptions(DescribeCloudAssistantAttributesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCloudAssistantAttributesShrinkRequest request = new DescribeCloudAssistantAttributesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
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
            new TeaPair("action", "DescribeCloudAssistantAttributes"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudAssistantAttributesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCloudAssistantAttributesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Command Assistant information of simple application servers.</p>
     * 
     * @param request DescribeCloudAssistantAttributesRequest
     * @return DescribeCloudAssistantAttributesResponse
     */
    public DescribeCloudAssistantAttributesResponse describeCloudAssistantAttributes(DescribeCloudAssistantAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudAssistantAttributesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall the client. Otherwise, you cannot run commands on the servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the Cloud Assistant client is installed on simple application servers.</p>
     * 
     * @param tmpReq DescribeCloudAssistantStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudAssistantStatusResponse
     */
    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatusWithOptions(DescribeCloudAssistantStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCloudAssistantStatusShrinkRequest request = new DescribeCloudAssistantStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
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
            new TeaPair("action", "DescribeCloudAssistantStatus"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudAssistantStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCloudAssistantStatusResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall the client. Otherwise, you cannot run commands on the servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the Cloud Assistant client is installed on simple application servers.</p>
     * 
     * @param request DescribeCloudAssistantStatusRequest
     * @return DescribeCloudAssistantStatusResponse
     */
    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudAssistantStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the CloudMonitor agent on simple application servers.</p>
     * 
     * @param request DescribeCloudMonitorAgentStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudMonitorAgentStatusesResponse
     */
    public DescribeCloudMonitorAgentStatusesResponse describeCloudMonitorAgentStatusesWithOptions(DescribeCloudMonitorAgentStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudMonitorAgentStatuses"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudMonitorAgentStatusesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCloudMonitorAgentStatusesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the CloudMonitor agent on simple application servers.</p>
     * 
     * @param request DescribeCloudMonitorAgentStatusesRequest
     * @return DescribeCloudMonitorAgentStatusesResponse
     */
    public DescribeCloudMonitorAgentStatusesResponse describeCloudMonitorAgentStatuses(DescribeCloudMonitorAgentStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudMonitorAgentStatusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the executions and execution status of a Cloud Assistant command.</p>
     * 
     * @param request DescribeCommandInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommandInvocationsResponse
     */
    public DescribeCommandInvocationsResponse describeCommandInvocationsWithOptions(DescribeCommandInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandName)) {
            query.put("CommandName", request.commandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            query.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationStatus)) {
            query.put("InvocationStatus", request.invocationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
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
            new TeaPair("action", "DescribeCommandInvocations"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommandInvocationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCommandInvocationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the executions and execution status of a Cloud Assistant command.</p>
     * 
     * @param request DescribeCommandInvocationsRequest
     * @return DescribeCommandInvocationsResponse
     */
    public DescribeCommandInvocationsResponse describeCommandInvocations(DescribeCommandInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommandInvocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the commands that you created or the common commands that Alibaba Cloud provides.</p>
     * 
     * @param request DescribeCommandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommandsResponse
     */
    public DescribeCommandsResponse describeCommandsWithOptions(DescribeCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommands"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommandsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCommandsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the commands that you created or the common commands that Alibaba Cloud provides.</p>
     * 
     * @param request DescribeCommandsRequest
     * @return DescribeCommandsResponse
     */
    public DescribeCommandsResponse describeCommands(DescribeCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommandsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of databases in a Simple Database Service instance and locate faults based on the error logs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries error logs of databases in a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseErrorLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabaseErrorLogsResponse
     */
    public DescribeDatabaseErrorLogsResponse describeDatabaseErrorLogsWithOptions(DescribeDatabaseErrorLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeDatabaseErrorLogs"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabaseErrorLogsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDatabaseErrorLogsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of databases in a Simple Database Service instance and locate faults based on the error logs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries error logs of databases in a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseErrorLogsRequest
     * @return DescribeDatabaseErrorLogsResponse
     */
    public DescribeDatabaseErrorLogsResponse describeDatabaseErrorLogs(DescribeDatabaseErrorLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabaseErrorLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can query the details about the instance, including CPU, memory, and disk usage, storage IOPS, and total number of connections.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring information about a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseInstanceMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabaseInstanceMetricDataResponse
     */
    public DescribeDatabaseInstanceMetricDataResponse describeDatabaseInstanceMetricDataWithOptions(DescribeDatabaseInstanceMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
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
            new TeaPair("action", "DescribeDatabaseInstanceMetricData"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabaseInstanceMetricDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDatabaseInstanceMetricDataResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can query the details about the instance, including CPU, memory, and disk usage, storage IOPS, and total number of connections.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring information about a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseInstanceMetricDataRequest
     * @return DescribeDatabaseInstanceMetricDataResponse
     */
    public DescribeDatabaseInstanceMetricDataResponse describeDatabaseInstanceMetricData(DescribeDatabaseInstanceMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabaseInstanceMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about parameters of a Simple Database Service instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the parameters of a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseInstanceParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabaseInstanceParametersResponse
     */
    public DescribeDatabaseInstanceParametersResponse describeDatabaseInstanceParametersWithOptions(DescribeDatabaseInstanceParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatabaseInstanceParameters"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabaseInstanceParametersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDatabaseInstanceParametersResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about parameters of a Simple Database Service instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the parameters of a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseInstanceParametersRequest
     * @return DescribeDatabaseInstanceParametersResponse
     */
    public DescribeDatabaseInstanceParametersResponse describeDatabaseInstanceParameters(DescribeDatabaseInstanceParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabaseInstanceParametersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of Simple Database Service instances in a region, including the IDs, names, plans, database versions, public endpoints, internal endpoints, creation time, and expiration time of the instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Simple Database Service instances.</p>
     * 
     * @param request DescribeDatabaseInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabaseInstancesResponse
     */
    public DescribeDatabaseInstancesResponse describeDatabaseInstancesWithOptions(DescribeDatabaseInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceIds)) {
            query.put("DatabaseInstanceIds", request.databaseInstanceIds);
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
            new TeaPair("action", "DescribeDatabaseInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabaseInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDatabaseInstancesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of Simple Database Service instances in a region, including the IDs, names, plans, database versions, public endpoints, internal endpoints, creation time, and expiration time of the instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Simple Database Service instances.</p>
     * 
     * @param request DescribeDatabaseInstancesRequest
     * @return DescribeDatabaseInstancesResponse
     */
    public DescribeDatabaseInstancesResponse describeDatabaseInstances(DescribeDatabaseInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabaseInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the slow query log details of a Simple Database Service instance and locate faults based on the log details.</p>
     * <blockquote>
     * <p> Slow query log details are retained for 7 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the slow query log details of a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseSlowLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabaseSlowLogRecordsResponse
     */
    public DescribeDatabaseSlowLogRecordsResponse describeDatabaseSlowLogRecordsWithOptions(DescribeDatabaseSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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
            new TeaPair("action", "DescribeDatabaseSlowLogRecords"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabaseSlowLogRecordsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDatabaseSlowLogRecordsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can query the slow query log details of a Simple Database Service instance and locate faults based on the log details.</p>
     * <blockquote>
     * <p> Slow query log details are retained for 7 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the slow query log details of a Simple Database Service instance.</p>
     * 
     * @param request DescribeDatabaseSlowLogRecordsRequest
     * @return DescribeDatabaseSlowLogRecordsResponse
     */
    public DescribeDatabaseSlowLogRecordsResponse describeDatabaseSlowLogRecords(DescribeDatabaseSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabaseSlowLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of applying a firewall template to simple application servers.</p>
     * 
     * @param request DescribeFirewallTemplateApplyResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallTemplateApplyResultsResponse
     */
    public DescribeFirewallTemplateApplyResultsResponse describeFirewallTemplateApplyResultsWithOptions(DescribeFirewallTemplateApplyResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallTemplateApplyResults"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallTemplateApplyResultsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeFirewallTemplateApplyResultsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of applying a firewall template to simple application servers.</p>
     * 
     * @param request DescribeFirewallTemplateApplyResultsRequest
     * @return DescribeFirewallTemplateApplyResultsResponse
     */
    public DescribeFirewallTemplateApplyResultsResponse describeFirewallTemplateApplyResults(DescribeFirewallTemplateApplyResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallTemplateApplyResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of applying a firewall template rule to simple application servers.</p>
     * 
     * @param request DescribeFirewallTemplateRulesApplyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallTemplateRulesApplyResultResponse
     */
    public DescribeFirewallTemplateRulesApplyResultResponse describeFirewallTemplateRulesApplyResultWithOptions(DescribeFirewallTemplateRulesApplyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallTemplateRulesApplyResult"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallTemplateRulesApplyResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeFirewallTemplateRulesApplyResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of applying a firewall template rule to simple application servers.</p>
     * 
     * @param request DescribeFirewallTemplateRulesApplyResultRequest
     * @return DescribeFirewallTemplateRulesApplyResultResponse
     */
    public DescribeFirewallTemplateRulesApplyResultResponse describeFirewallTemplateRulesApplyResult(DescribeFirewallTemplateRulesApplyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallTemplateRulesApplyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about firewall templates.</p>
     * 
     * @param request DescribeFirewallTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallTemplatesResponse
     */
    public DescribeFirewallTemplatesResponse describeFirewallTemplatesWithOptions(DescribeFirewallTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "DescribeFirewallTemplates"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallTemplatesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeFirewallTemplatesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about firewall templates.</p>
     * 
     * @param request DescribeFirewallTemplatesRequest
     * @return DescribeFirewallTemplatesResponse
     */
    public DescribeFirewallTemplatesResponse describeFirewallTemplates(DescribeFirewallTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the key pair of a simple application server.</p>
     * 
     * @param request DescribeInstanceKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceKeyPairResponse
     */
    public DescribeInstanceKeyPairResponse describeInstanceKeyPairWithOptions(DescribeInstanceKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceKeyPairResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the key pair of a simple application server.</p>
     * 
     * @param request DescribeInstanceKeyPairRequest
     * @return DescribeInstanceKeyPairResponse
     */
    public DescribeInstanceKeyPairResponse describeInstanceKeyPair(DescribeInstanceKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a password is set for a simple application server.</p>
     * 
     * @param request DescribeInstancePasswordsSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancePasswordsSettingResponse
     */
    public DescribeInstancePasswordsSettingResponse describeInstancePasswordsSettingWithOptions(DescribeInstancePasswordsSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstancePasswordsSetting"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancePasswordsSettingResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstancePasswordsSettingResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a password is set for a simple application server.</p>
     * 
     * @param request DescribeInstancePasswordsSettingRequest
     * @return DescribeInstancePasswordsSettingResponse
     */
    public DescribeInstancePasswordsSettingResponse describeInstancePasswordsSetting(DescribeInstancePasswordsSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancePasswordsSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the VNC connection address of a simple application server.</p>
     * 
     * @param request DescribeInstanceVncUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceVncUrlResponse
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceVncUrl"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceVncUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceVncUrlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the VNC connection address of a simple application server.</p>
     * 
     * @param request DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the execution result of a command.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. A maximum of 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of a command.</p>
     * 
     * @param request DescribeInvocationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationResultResponse
     */
    public DescribeInvocationResultResponse describeInvocationResultWithOptions(DescribeInvocationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocationResult"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInvocationResultResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the execution result of a command.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. A maximum of 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of a command.</p>
     * 
     * @param request DescribeInvocationResultRequest
     * @return DescribeInvocationResultResponse
     */
    public DescribeInvocationResultResponse describeInvocationResult(DescribeInvocationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. Up to 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries details about command execution.</p>
     * 
     * @param request DescribeInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeStatus)) {
            query.put("InvokeStatus", request.invokeStatus);
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
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInvocationsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. Up to 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries details about command execution.</p>
     * 
     * @param request DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring information about vCPUs, memory, disk IOPS, and traffic of a simple application server.</p>
     * 
     * @param request DescribeMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorDataResponse
     */
    public DescribeMonitorDataResponse describeMonitorDataWithOptions(DescribeMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
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
            new TeaPair("action", "DescribeMonitorData"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeMonitorDataResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring information about vCPUs, memory, disk IOPS, and traffic of a simple application server.</p>
     * 
     * @param request DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    public DescribeMonitorDataResponse describeMonitorData(DescribeMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Security Center agent on a simple application server.</p>
     * 
     * @param request DescribeSecurityAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityAgentStatusResponse
     */
    public DescribeSecurityAgentStatusResponse describeSecurityAgentStatusWithOptions(DescribeSecurityAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityAgentStatus"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityAgentStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeSecurityAgentStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Security Center agent on a simple application server.</p>
     * 
     * @param request DescribeSecurityAgentStatusRequest
     * @return DescribeSecurityAgentStatusResponse
     */
    public DescribeSecurityAgentStatusResponse describeSecurityAgentStatus(DescribeSecurityAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to change the SSH key pairs that are bound to your simple application servers or your end user no longer needs to access a specific simple application server, you can unbind the SSH key pairs from simple application servers to improve the security of the simple application servers or restrict access to the specific simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds key pairs from simple application servers.</p>
     * 
     * @param request DetachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetachKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetachKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If you want to change the SSH key pairs that are bound to your simple application servers or your end user no longer needs to access a specific simple application server, you can unbind the SSH key pairs from simple application servers to improve the security of the simple application servers or restrict access to the specific simple application server.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds key pairs from simple application servers.</p>
     * 
     * @param request DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a firewall rule of a simple application server.</p>
     * 
     * @param request DisableFirewallRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableFirewallRuleResponse
     */
    public DisableFirewallRuleResponse disableFirewallRuleWithOptions(DisableFirewallRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableFirewallRule"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableFirewallRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableFirewallRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Disables a firewall rule of a simple application server.</p>
     * 
     * @param request DisableFirewallRuleRequest
     * @return DisableFirewallRuleResponse
     */
    public DisableFirewallRuleResponse disableFirewallRule(DisableFirewallRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableFirewallRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a firewall rule for a simple application server.</p>
     * 
     * @param request EnableFirewallRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableFirewallRuleResponse
     */
    public EnableFirewallRuleResponse enableFirewallRuleWithOptions(EnableFirewallRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableFirewallRule"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableFirewallRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableFirewallRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Enables a firewall rule for a simple application server.</p>
     * 
     * @param request EnableFirewallRuleRequest
     * @return EnableFirewallRuleResponse
     */
    public EnableFirewallRuleResponse enableFirewallRule(EnableFirewallRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableFirewallRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to import an existing key pair to the Simple Application Server console. This way, you can use the key pair to log on to simple application servers. The existing key pair that you want to import must use a supported encryption method. For more information, see <a href="https://help.aliyun.com/document_detail/59085.html">Q2: Which encryption methods must be used by key pairs when I import existing key pairs to the Simple Application Server console?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Imports an existing key pair to the Simple Application Server console.</p>
     * 
     * @param request ImportKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBody)) {
            query.put("PublicKeyBody", request.publicKeyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ImportKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to import an existing key pair to the Simple Application Server console. This way, you can use the key pair to log on to simple application servers. The existing key pair that you want to import must use a supported encryption method. For more information, see <a href="https://help.aliyun.com/document_detail/59085.html">Q2: Which encryption methods must be used by key pairs when I import existing key pairs to the Simple Application Server console?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Imports an existing key pair to the Simple Application Server console.</p>
     * 
     * @param request ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To run commands on your simple application servers, you must install the Cloud Assistant client on your servers. You can call the <a href="https://help.aliyun.com/document_detail/439512.html">DescribeCloudAssistantStatus</a> operation to check whether the Cloud Assistant client is installed on your simple application servers. If you have not installed the Cloud Assistant client, you can call the InstallCloudAssistant operation to install the client. Then, you can call the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation to restart the servers to allow the client to take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs the Cloud Assistant client on simple application servers at a time.</p>
     * 
     * @param tmpReq InstallCloudAssistantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallCloudAssistantResponse
     */
    public InstallCloudAssistantResponse installCloudAssistantWithOptions(InstallCloudAssistantRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallCloudAssistantShrinkRequest request = new InstallCloudAssistantShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallCloudAssistant"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InstallCloudAssistantResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InstallCloudAssistantResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>To run commands on your simple application servers, you must install the Cloud Assistant client on your servers. You can call the <a href="https://help.aliyun.com/document_detail/439512.html">DescribeCloudAssistantStatus</a> operation to check whether the Cloud Assistant client is installed on your simple application servers. If you have not installed the Cloud Assistant client, you can call the InstallCloudAssistant operation to install the client. Then, you can call the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation to restart the servers to allow the client to take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs the Cloud Assistant client on simple application servers at a time.</p>
     * 
     * @param request InstallCloudAssistantRequest
     * @return InstallCloudAssistantResponse
     */
    public InstallCloudAssistantResponse installCloudAssistant(InstallCloudAssistantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installCloudAssistantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs the CloudMonitor agent for a simple application server.</p>
     * 
     * @param request InstallCloudMonitorAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallCloudMonitorAgentResponse
     */
    public InstallCloudMonitorAgentResponse installCloudMonitorAgentWithOptions(InstallCloudMonitorAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallCloudMonitorAgent"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InstallCloudMonitorAgentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InstallCloudMonitorAgentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Installs the CloudMonitor agent for a simple application server.</p>
     * 
     * @param request InstallCloudMonitorAgentRequest
     * @return InstallCloudMonitorAgentResponse
     */
    public InstallCloudMonitorAgentResponse installCloudMonitorAgent(InstallCloudMonitorAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installCloudMonitorAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The simple application servers for which you want to call the operation must meet the following conditions. If a simple application server cannot meet the conditions, you must call this operation again.
     *     *   The simple application servers are in the <code>Running</code> state. You can call the <a href="https://help.aliyun.com/document_detail/2361065.html">ListInstances</a> operation to query the status of simple application servers.
     *     *   Cloud Assistant Agent is installed on the simple application servers. For more information, see <a href="https://help.aliyun.com/document_detail/2361030.html">InstallCloudAssistant</a>.
     *     *   If you run a PowerShell command, make sure that the PowerShell module is configured for the simple application servers.</p>
     * <ul>
     * <li>The command may fail to be run due to the abnormal states of simple application servers, network exceptions, or exceptions in Cloud Assistant Agent. If the command fails to be run, no execution information is generated.</li>
     * <li>If you enable the custom parameter feature when you create a command, you must set the <code>Parameters</code> parameter to specify custom parameters when you run the command.</li>
     * <li>When you call this operation, you can select only one common command or a custom command that you have created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs a Command Assistant command for one or more simple application servers.</p>
     * 
     * @param tmpReq InvokeCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeCommandResponse
     */
    public InvokeCommandResponse invokeCommandWithOptions(InvokeCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvokeCommandShrinkRequest request = new InvokeCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeCommand"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeCommandResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InvokeCommandResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  The simple application servers for which you want to call the operation must meet the following conditions. If a simple application server cannot meet the conditions, you must call this operation again.
     *     *   The simple application servers are in the <code>Running</code> state. You can call the <a href="https://help.aliyun.com/document_detail/2361065.html">ListInstances</a> operation to query the status of simple application servers.
     *     *   Cloud Assistant Agent is installed on the simple application servers. For more information, see <a href="https://help.aliyun.com/document_detail/2361030.html">InstallCloudAssistant</a>.
     *     *   If you run a PowerShell command, make sure that the PowerShell module is configured for the simple application servers.</p>
     * <ul>
     * <li>The command may fail to be run due to the abnormal states of simple application servers, network exceptions, or exceptions in Cloud Assistant Agent. If the command fails to be run, no execution information is generated.</li>
     * <li>If you enable the custom parameter feature when you create a command, you must set the <code>Parameters</code> parameter to specify custom parameters when you run the command.</li>
     * <li>When you call this operation, you can select only one common command or a custom command that you have created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs a Command Assistant command for one or more simple application servers.</p>
     * 
     * @param request InvokeCommandRequest
     * @return InvokeCommandResponse
     */
    public InvokeCommandResponse invokeCommand(InvokeCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about custom images that are shared across Alibaba Cloud accounts in a region.</p>
     * 
     * @param request ListCustomImageShareAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomImageShareAccountsResponse
     */
    public ListCustomImageShareAccountsResponse listCustomImageShareAccountsWithOptions(ListCustomImageShareAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
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
            new TeaPair("action", "ListCustomImageShareAccounts"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomImageShareAccountsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCustomImageShareAccountsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about custom images that are shared across Alibaba Cloud accounts in a region.</p>
     * 
     * @param request ListCustomImageShareAccountsRequest
     * @return ListCustomImageShareAccountsResponse
     */
    public ListCustomImageShareAccountsResponse listCustomImageShareAccounts(ListCustomImageShareAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomImageShareAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about custom images in a region.</p>
     * 
     * @param request ListCustomImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomImagesResponse
     */
    public ListCustomImagesResponse listCustomImagesWithOptions(ListCustomImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSnapshotId)) {
            query.put("DataSnapshotId", request.dataSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            query.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNames)) {
            query.put("ImageNames", request.imageNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.share)) {
            query.put("Share", request.share);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemSnapshotId)) {
            query.put("SystemSnapshotId", request.systemSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomImages"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomImagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCustomImagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about custom images in a region.</p>
     * 
     * @param request ListCustomImagesRequest
     * @return ListCustomImagesResponse
     */
    public ListCustomImagesResponse listCustomImages(ListCustomImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <code>InstanceId</code>, <code>DiskIds</code>, and <code>ResourceGroupId</code> parameters are optional. However, you can specify them as filter conditions and combine them with the logical AND operator to filter disks that you want to query.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about disks in a region.</p>
     * 
     * @param request ListDisksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDisksResponse
     */
    public ListDisksResponse listDisksWithOptions(ListDisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDisks"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDisksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDisksResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The <code>InstanceId</code>, <code>DiskIds</code>, and <code>ResourceGroupId</code> parameters are optional. However, you can specify them as filter conditions and combine them with the logical AND operator to filter disks that you want to query.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about disks in a region.</p>
     * 
     * @param request ListDisksRequest
     * @return ListDisksResponse
     */
    public ListDisksResponse listDisks(ListDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDisksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListFirewallRules operation to query the firewall rule details of a simple application server, including the port range, firewall rule ID, and transport layer protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the firewall rules of a simple application server.</p>
     * 
     * @param request ListFirewallRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFirewallRulesResponse
     */
    public ListFirewallRulesResponse listFirewallRulesWithOptions(ListFirewallRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallRuleId)) {
            query.put("FirewallRuleId", request.firewallRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFirewallRules"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListFirewallRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListFirewallRulesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the ListFirewallRules operation to query the firewall rule details of a simple application server, including the port range, firewall rule ID, and transport layer protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the firewall rules of a simple application server.</p>
     * 
     * @param request ListFirewallRulesRequest
     * @return ListFirewallRulesResponse
     */
    public ListFirewallRulesResponse listFirewallRules(ListFirewallRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFirewallRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query details about one or more images in a specified region, including the IDs, names, and types of the images.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about images in a region.</p>
     * 
     * @param request ListImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            query.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListImagesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can query details about one or more images in a specified region, including the IDs, names, and types of the images.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about images in a region.</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the plan of your simple application server does not meet your business requirements, you can call the ListInstancePlansModification operation to obtain a list of plans that can be upgraded for your simple application server. Then, you can call the <a href="https://help.aliyun.com/document_detail/190445.html">UpgradeInstance</a> operation to upgrade the plan.</p>
     * <blockquote>
     * <p> We recommend that you create snapshots for the disks of your simple application server to back up data before you upgrade the plan. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.
     * For the precautions about plan upgrade, see <a href="https://help.aliyun.com/document_detail/61433.html">Upgrade a simple application server</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the plans to which you can upgrade your simple application server.</p>
     * 
     * @param request ListInstancePlansModificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancePlansModificationResponse
     */
    public ListInstancePlansModificationResponse listInstancePlansModificationWithOptions(ListInstancePlansModificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancePlansModification"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancePlansModificationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancePlansModificationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If the plan of your simple application server does not meet your business requirements, you can call the ListInstancePlansModification operation to obtain a list of plans that can be upgraded for your simple application server. Then, you can call the <a href="https://help.aliyun.com/document_detail/190445.html">UpgradeInstance</a> operation to upgrade the plan.</p>
     * <blockquote>
     * <p> We recommend that you create snapshots for the disks of your simple application server to back up data before you upgrade the plan. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.
     * For the precautions about plan upgrade, see <a href="https://help.aliyun.com/document_detail/61433.html">Upgrade a simple application server</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the plans to which you can upgrade your simple application server.</p>
     * 
     * @param request ListInstancePlansModificationRequest
     * @return ListInstancePlansModificationResponse
     */
    public ListInstancePlansModificationResponse listInstancePlansModification(ListInstancePlansModificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancePlansModificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of simple application servers.</p>
     * 
     * @param request ListInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatusWithOptions(ListInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
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
            new TeaPair("action", "ListInstanceStatus"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstanceStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of simple application servers.</p>
     * 
     * @param request ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatus(ListInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of simple application servers in a specified region, including the names, public IP addresses, internal IP addresses, creation time, and expiration time of the servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about simple application servers in a region.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.publicIpAddresses)) {
            query.put("PublicIpAddresses", request.publicIpAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of simple application servers in a specified region, including the names, public IP addresses, internal IP addresses, creation time, and expiration time of the servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about simple application servers in a region.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of data transfer plans of simple application servers, including the total quota, used quota, unused quota, and excess data transfers in the current month.
     * Simple Application Server provides data transfer plans that can be used to offset data transfer fees. You are charged for excess data transfers. Take note of the following items:</p>
     * <ul>
     * <li>Only outbound data transfers of simple application servers over the Internet are calculated. Outbound data transfers include the data transfer quota and the excess data transfers beyond the quota. Inbound data transfers of simple application servers over the Internet are not calculated.</li>
     * <li>Outbound data transfers from simple application servers to other Alibaba Cloud services over the Internet first consume data transfer quotas. If the quotas are exhausted, you are charged for excess data transfers.</li>
     * <li>You are not charged for data transfers between simple application servers within the same virtual private cloud (VPC).
     * For more information, see <a href="https://help.aliyun.com/document_detail/86281.html">Quotas and billing of data transfers</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about data transfer plans of simple application servers.</p>
     * 
     * @param request ListInstancesTrafficPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesTrafficPackagesResponse
     */
    public ListInstancesTrafficPackagesResponse listInstancesTrafficPackagesWithOptions(ListInstancesTrafficPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesTrafficPackages"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesTrafficPackagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancesTrafficPackagesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can query the details of data transfer plans of simple application servers, including the total quota, used quota, unused quota, and excess data transfers in the current month.
     * Simple Application Server provides data transfer plans that can be used to offset data transfer fees. You are charged for excess data transfers. Take note of the following items:</p>
     * <ul>
     * <li>Only outbound data transfers of simple application servers over the Internet are calculated. Outbound data transfers include the data transfer quota and the excess data transfers beyond the quota. Inbound data transfers of simple application servers over the Internet are not calculated.</li>
     * <li>Outbound data transfers from simple application servers to other Alibaba Cloud services over the Internet first consume data transfer quotas. If the quotas are exhausted, you are charged for excess data transfers.</li>
     * <li>You are not charged for data transfers between simple application servers within the same virtual private cloud (VPC).
     * For more information, see <a href="https://help.aliyun.com/document_detail/86281.html">Quotas and billing of data transfers</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about data transfer plans of simple application servers.</p>
     * 
     * @param request ListInstancesTrafficPackagesRequest
     * @return ListInstancesTrafficPackagesResponse
     */
    public ListInstancesTrafficPackagesResponse listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesTrafficPackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey pairs that are bound to simple application servers in a specific region.</p>
     * 
     * @param request ListKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKeyPairsResponse
     */
    public ListKeyPairsResponse listKeyPairsWithOptions(ListKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKeyPairs"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListKeyPairsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListKeyPairsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey pairs that are bound to simple application servers in a specific region.</p>
     * 
     * @param request ListKeyPairsRequest
     * @return ListKeyPairsResponse
     */
    public ListKeyPairsResponse listKeyPairs(ListKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of all plans provided by Simple Application Server in a region, including the IDs, prices, disk sizes, and disk categories of the plans.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all plans provided by Simple Application Server in a region.</p>
     * 
     * @param request ListPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPlansResponse
     */
    public ListPlansResponse listPlansWithOptions(ListPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPlans"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPlansResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPlansResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can query the details of all plans provided by Simple Application Server in a region, including the IDs, prices, disk sizes, and disk categories of the plans.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all plans provided by Simple Application Server in a region.</p>
     * 
     * @param request ListPlansRequest
     * @return ListPlansResponse
     */
    public ListPlansResponse listPlans(ListPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPlansWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The query results include all the Alibaba Cloud regions where Simple Application Server is supported on the international site (alibabacloud.com) and the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all regions in which Simple Application Server is supported.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRegionsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The query results include all the Alibaba Cloud regions where Simple Application Server is supported on the international site (alibabacloud.com) and the China site (aliyun.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all regions in which Simple Application Server is supported.</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <code>InstanceId</code>, <code>DiskId</code>, <code>SnapshotIds</code>, and <code>ResourceGroupId</code> parameters are optional. However, you can specify them as filter conditions and combine them with the logical AND operator to filter snapshots that you want to query.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about snapshots that are created for a simple application server.</p>
     * 
     * @param request ListSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshotsWithOptions(ListSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDiskType)) {
            query.put("SourceDiskType", request.sourceDiskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshots"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSnapshotsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The <code>InstanceId</code>, <code>DiskId</code>, <code>SnapshotIds</code>, and <code>ResourceGroupId</code> parameters are optional. However, you can specify them as filter conditions and combine them with the logical AND operator to filter snapshots that you want to query.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about snapshots that are created for a simple application server.</p>
     * 
     * @param request ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to simple resources, such as instances, snapshots, disks, images, commands, and firewall rules.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

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
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to simple resources, such as instances, snapshots, disks, images, commands, and firewall rules.</p>
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
     * <p>After you create a simple application server, you can log on to the simple application server to build environments and applications on the server.</p>
     * 
     * <b>summary</b> : 
     * <p>Logs on to a simple application server on Workbench.</p>
     * 
     * @param request LoginInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoginInstanceResponse
     */
    public LoginInstanceResponse loginInstanceWithOptions(LoginInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoginInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LoginInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LoginInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you create a simple application server, you can log on to the simple application server to build environments and applications on the server.</p>
     * 
     * <b>summary</b> : 
     * <p>Logs on to a simple application server on Workbench.</p>
     * 
     * @param request LoginInstanceRequest
     * @return LoginInstanceResponse
     */
    public LoginInstanceResponse loginInstance(LoginInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loginInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a Simple Database Service instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a Simple Database Service instance.</p>
     * 
     * @param request ModifyDatabaseInstanceDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseInstanceDescriptionResponse
     */
    public ModifyDatabaseInstanceDescriptionResponse modifyDatabaseInstanceDescriptionWithOptions(ModifyDatabaseInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceDescription)) {
            query.put("DatabaseInstanceDescription", request.databaseInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabaseInstanceDescription"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseInstanceDescriptionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDatabaseInstanceDescriptionResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a Simple Database Service instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a Simple Database Service instance.</p>
     * 
     * @param request ModifyDatabaseInstanceDescriptionRequest
     * @return ModifyDatabaseInstanceDescriptionResponse
     */
    public ModifyDatabaseInstanceDescriptionResponse modifyDatabaseInstanceDescription(ModifyDatabaseInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.</p>
     * 
     * @param request ModifyDatabaseInstanceParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseInstanceParameterResponse
     */
    public ModifyDatabaseInstanceParameterResponse modifyDatabaseInstanceParameterWithOptions(ModifyDatabaseInstanceParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceRestart)) {
            query.put("ForceRestart", request.forceRestart);
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
            new TeaPair("action", "ModifyDatabaseInstanceParameter"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseInstanceParameterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDatabaseInstanceParameterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.</p>
     * 
     * @param request ModifyDatabaseInstanceParameterRequest
     * @return ModifyDatabaseInstanceParameterResponse
     */
    public ModifyDatabaseInstanceParameterResponse modifyDatabaseInstanceParameter(ModifyDatabaseInstanceParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseInstanceParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the firewall rule of a simple application server.</p>
     * 
     * @param request ModifyFirewallRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFirewallRuleResponse
     */
    public ModifyFirewallRuleResponse modifyFirewallRuleWithOptions(ModifyFirewallRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleProtocol)) {
            query.put("RuleProtocol", request.ruleProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFirewallRule"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFirewallRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyFirewallRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the firewall rule of a simple application server.</p>
     * 
     * @param request ModifyFirewallRuleRequest
     * @return ModifyFirewallRuleResponse
     */
    public ModifyFirewallRuleResponse modifyFirewallRule(ModifyFirewallRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFirewallRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifying a firewall template does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the firewall rule in a firewall template. You can apply the new firewall rule to simple application servers.</p>
     * 
     * @param request ModifyFirewallTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFirewallTemplateResponse
     */
    public ModifyFirewallTemplateResponse modifyFirewallTemplateWithOptions(ModifyFirewallTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateId)) {
            query.put("FirewallTemplateId", request.firewallTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallTemplateRule)) {
            query.put("FirewallTemplateRule", request.firewallTemplateRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFirewallTemplate"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFirewallTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyFirewallTemplateResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Modifying a firewall template does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the firewall rule in a firewall template. You can apply the new firewall rule to simple application servers.</p>
     * 
     * @param request ModifyFirewallTemplateRequest
     * @return ModifyFirewallTemplateResponse
     */
    public ModifyFirewallTemplateResponse modifyFirewallTemplate(ModifyFirewallTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFirewallTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Custom images can be shared to ECS. If the configurations of your simple application server cannot meet your business requirements, or you want to deploy your business on ECS instances, you can share your custom image to ECS to transfer your business from Simple Application Server to ECS.</p>
     * <blockquote>
     * <p> The region in which the shared image resides in ECS is the same as the region in which the custom image resides in Simple Application Server.
     * You can unshare a custom image based on your business requirements or when you want to delete the custom image. After you unshare a custom image, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>You cannot query or use the custom image by using the ECS console or API.</li>
     * <li>You cannot re-initialize the disks of the ECS instances that were created based on the shared image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares or unshares a custom image to Elastic Compute Service (ECS).</p>
     * 
     * @param request ModifyImageShareStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyImageShareStatusResponse
     */
    public ModifyImageShareStatusResponse modifyImageShareStatusWithOptions(ModifyImageShareStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
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
            new TeaPair("action", "ModifyImageShareStatus"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageShareStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyImageShareStatusResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Custom images can be shared to ECS. If the configurations of your simple application server cannot meet your business requirements, or you want to deploy your business on ECS instances, you can share your custom image to ECS to transfer your business from Simple Application Server to ECS.</p>
     * <blockquote>
     * <p> The region in which the shared image resides in ECS is the same as the region in which the custom image resides in Simple Application Server.
     * You can unshare a custom image based on your business requirements or when you want to delete the custom image. After you unshare a custom image, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>You cannot query or use the custom image by using the ECS console or API.</li>
     * <li>You cannot re-initialize the disks of the ECS instances that were created based on the shared image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares or unshares a custom image to Elastic Compute Service (ECS).</p>
     * 
     * @param request ModifyImageShareStatusRequest
     * @return ModifyImageShareStatusResponse
     */
    public ModifyImageShareStatusResponse modifyImageShareStatus(ModifyImageShareStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageShareStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the VNC password of a simple application server.</p>
     * 
     * @param request ModifyInstanceVncPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceVncPasswordResponse
     */
    public ModifyInstanceVncPasswordResponse modifyInstanceVncPasswordWithOptions(ModifyInstanceVncPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vncPassword)) {
            query.put("VncPassword", request.vncPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceVncPassword"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceVncPasswordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyInstanceVncPasswordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Changes the VNC password of a simple application server.</p>
     * 
     * @param request ModifyInstanceVncPasswordRequest
     * @return ModifyInstanceVncPasswordResponse
     */
    public ModifyInstanceVncPasswordResponse modifyInstanceVncPassword(ModifyInstanceVncPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceVncPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only simple application servers that are in the Running state can be restarted.</p>
     * <ul>
     * <li>After you restart a simple application server, it enters the Starting state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts a simple application server.</p>
     * 
     * @param request RebootInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootInstanceResponse
     */
    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RebootInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Only simple application servers that are in the Running state can be restarted.</p>
     * <ul>
     * <li>After you restart a simple application server, it enters the Starting state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts a simple application server.</p>
     * 
     * @param request RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts simple application servers.</p>
     * 
     * @param request RebootInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootInstancesResponse
     */
    public RebootInstancesResponse rebootInstancesWithOptions(RebootInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceReboot)) {
            query.put("ForceReboot", request.forceReboot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RebootInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Restarts simple application servers.</p>
     * 
     * @param request RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.</p>
     * 
     * @param request ReleasePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleasePublicConnectionResponse
     */
    public ReleasePublicConnectionResponse releasePublicConnectionWithOptions(ReleasePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePublicConnection"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePublicConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReleasePublicConnectionResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.</p>
     * 
     * @param request ReleasePublicConnectionRequest
     * @return ReleasePublicConnectionResponse
     */
    public ReleasePublicConnectionResponse releasePublicConnection(ReleasePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unshares a custom image that is shared across Alibaba Cloud accounts.</p>
     * 
     * @param request RemoveCustomImageShareAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveCustomImageShareAccountResponse
     */
    public RemoveCustomImageShareAccountResponse removeCustomImageShareAccountWithOptions(RemoveCustomImageShareAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCustomImageShareAccount"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveCustomImageShareAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveCustomImageShareAccountResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Unshares a custom image that is shared across Alibaba Cloud accounts.</p>
     * 
     * @param request RemoveCustomImageShareAccountRequest
     * @return RemoveCustomImageShareAccountResponse
     */
    public RemoveCustomImageShareAccountResponse removeCustomImageShareAccount(RemoveCustomImageShareAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeCustomImageShareAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the renewal fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renews a simple application server.</p>
     * 
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RenewInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the renewal fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renews a simple application server.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.</p>
     * 
     * @param request ResetDatabaseAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDatabaseAccountPasswordResponse
     */
    public ResetDatabaseAccountPasswordResponse resetDatabaseAccountPasswordWithOptions(ResetDatabaseAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDatabaseAccountPassword"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDatabaseAccountPasswordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetDatabaseAccountPasswordResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.</p>
     * 
     * @param request ResetDatabaseAccountPasswordRequest
     * @return ResetDatabaseAccountPasswordResponse
     */
    public ResetDatabaseAccountPasswordResponse resetDatabaseAccountPassword(ResetDatabaseAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDatabaseAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only if the associated simple application server is in the Stopped state.</p>
     * <ul>
     * <li>If you restore a disk from a snapshot, the incremental data after the snapshot is created is lost. We recommend that you back up the data before you perform this operation.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>Resetting the system or changing the image of a simple application server clears the disk data on the server. Snapshots created before the reset or change are retained but cannot be used to restore disks.</p>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a disk based on a snapshot.</p>
     * 
     * @param request ResetDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDiskResponse
     */
    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDisk"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDiskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetDiskResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only if the associated simple application server is in the Stopped state.</p>
     * <ul>
     * <li>If you restore a disk from a snapshot, the incremental data after the snapshot is created is lost. We recommend that you back up the data before you perform this operation.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>Resetting the system or changing the image of a simple application server clears the disk data on the server. Snapshots created before the reset or change are retained but cannot be used to restore disks.</p>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a disk based on a snapshot.</p>
     * 
     * @param request ResetDiskRequest
     * @return ResetDiskResponse
     */
    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can reset a simple application server to re-install its applications or operating system and re-initialize the server. You can reset a simple application server by resetting the current system or changing the image.</p>
     * <ul>
     * <li>Reset the current system: You can re-install the operating system without changing the image.</li>
     * <li>Change the image: You can select another Alibaba Cloud image or a custom image to re-install the operating system.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>Resetting the system or changing the image of a simple application server clears the disk data on the server. Back up the data as needed.</li>
     * <li>After you reset a simple application server, monitoring may fail. In this case, you can use one of the following methods to install the CloudMonitor agent on the server:<ul>
     * <li>Connect to the server: For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">Manually install the CloudMonitor agent for C++ on an ECS instance</a>.</li>
     * <li>Use Command Assistant: For more information, see <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a>. You can obtain the command that can be used to install CloudMonitor from the &quot;Common commands&quot; section of the <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a> topic.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>Snapshots that are created before the reset are retained, but the snapshots cannot be used to restore the disks of the server.</li>
     * <li>You cannot reset simple application servers that were created from custom images that contain data of data disks.</li>
     * <li>If you reset a simple application server by replacing the existing image with a custom image, the following limits apply:<ul>
     * <li>The custom image must reside in the same region as the current server.</li>
     * <li>The custom image cannot be created based on the current server. If you want to restore the data on the server, you can use a snapshot of the server to restore disk data.</li>
     * <li>If your simple application server resides in a region outside the Chinese mainland, you cannot switch the operating system of the server between Windows Server and Linux. You cannot use a Windows Server custom image to reset a Linux simple application server. Similarly, you cannot use a Linux custom image to reset a Windows Server simple application server. You can switch the operating systems of simple application servers only between Windows Server versions or between Linux distributions.</li>
     * <li>The following limits apply to the disks attached to the simple application server:<ul>
     * <li>If the custom image contains a system disk and a data disk but only a system disk is attached to the simple application server, you cannot use the custom image to reset the simple application server.</li>
     * <li>If the system disk size of the custom image is greater than the system disk size of the simple application server, you cannot directly use the custom image to reset the simple application server.</li>
     * <li>Only if the system disk size of the simple application server is greater than or equal to the system disk size of the custom image, you can use the custom image to reset the simple application server. To increase the system disk size of your server, you can upgrade the server configuration. For more information, see Upgrade a simple application server.</li>
     * <li>If the data disk size of the custom image is greater than the data disk size of the simple application server, you cannot use the custom image to reset the simple application server.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets a simple application server.</p>
     * 
     * @param request ResetSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSystemResponse
     */
    public ResetSystemResponse resetSystemWithOptions(ResetSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginCredentials)) {
            query.put("LoginCredentials", request.loginCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSystem"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSystemResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetSystemResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can reset a simple application server to re-install its applications or operating system and re-initialize the server. You can reset a simple application server by resetting the current system or changing the image.</p>
     * <ul>
     * <li>Reset the current system: You can re-install the operating system without changing the image.</li>
     * <li>Change the image: You can select another Alibaba Cloud image or a custom image to re-install the operating system.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>Resetting the system or changing the image of a simple application server clears the disk data on the server. Back up the data as needed.</li>
     * <li>After you reset a simple application server, monitoring may fail. In this case, you can use one of the following methods to install the CloudMonitor agent on the server:<ul>
     * <li>Connect to the server: For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">Manually install the CloudMonitor agent for C++ on an ECS instance</a>.</li>
     * <li>Use Command Assistant: For more information, see <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a>. You can obtain the command that can be used to install CloudMonitor from the &quot;Common commands&quot; section of the <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a> topic.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>Snapshots that are created before the reset are retained, but the snapshots cannot be used to restore the disks of the server.</li>
     * <li>You cannot reset simple application servers that were created from custom images that contain data of data disks.</li>
     * <li>If you reset a simple application server by replacing the existing image with a custom image, the following limits apply:<ul>
     * <li>The custom image must reside in the same region as the current server.</li>
     * <li>The custom image cannot be created based on the current server. If you want to restore the data on the server, you can use a snapshot of the server to restore disk data.</li>
     * <li>If your simple application server resides in a region outside the Chinese mainland, you cannot switch the operating system of the server between Windows Server and Linux. You cannot use a Windows Server custom image to reset a Linux simple application server. Similarly, you cannot use a Linux custom image to reset a Windows Server simple application server. You can switch the operating systems of simple application servers only between Windows Server versions or between Linux distributions.</li>
     * <li>The following limits apply to the disks attached to the simple application server:<ul>
     * <li>If the custom image contains a system disk and a data disk but only a system disk is attached to the simple application server, you cannot use the custom image to reset the simple application server.</li>
     * <li>If the system disk size of the custom image is greater than the system disk size of the simple application server, you cannot directly use the custom image to reset the simple application server.</li>
     * <li>Only if the system disk size of the simple application server is greater than or equal to the system disk size of the custom image, you can use the custom image to reset the simple application server. To increase the system disk size of your server, you can upgrade the server configuration. For more information, see Upgrade a simple application server.</li>
     * <li>If the data disk size of the custom image is greater than the data disk size of the simple application server, you cannot use the custom image to reset the simple application server.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets a simple application server.</p>
     * 
     * @param request ResetSystemRequest
     * @return ResetSystemResponse
     */
    public ResetSystemResponse resetSystem(ResetSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to restart a Simple Database Service instance that is in the Running state.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to restart a Simple Database Service instance that is in the Running state.</p>
     * 
     * @param request RestartDatabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDatabaseInstanceResponse
     */
    public RestartDatabaseInstanceResponse restartDatabaseInstanceWithOptions(RestartDatabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDatabaseInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDatabaseInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RestartDatabaseInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to restart a Simple Database Service instance that is in the Running state.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to restart a Simple Database Service instance that is in the Running state.</p>
     * 
     * @param request RestartDatabaseInstanceRequest
     * @return RestartDatabaseInstanceResponse
     */
    public RestartDatabaseInstanceResponse restartDatabaseInstance(RestartDatabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDatabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Command Assistant is an automated O\&amp;M tool for Simple Application Server. You can maintain simple application servers by running shell, PowerShell, and batch commands in the Simple Application Server console without remotely logging on to the servers.
     * Before you use Command Assistant, take note of the following items:</p>
     * <ul>
     * <li>The simple application server must be in the Running state.</li>
     * <li>The Cloud Assistant client is installed on the server. By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall it. For more information, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs commands on a simple application server.</p>
     * 
     * @param tmpReq RunCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommandWithOptions(RunCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunCommandShrinkRequest request = new RunCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableParameter)) {
            query.put("EnableParameter", request.enableParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowsPasswordName)) {
            query.put("WindowsPasswordName", request.windowsPasswordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDir)) {
            query.put("WorkingDir", request.workingDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingUser)) {
            query.put("WorkingUser", request.workingUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunCommandResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Command Assistant is an automated O\&amp;M tool for Simple Application Server. You can maintain simple application servers by running shell, PowerShell, and batch commands in the Simple Application Server console without remotely logging on to the servers.
     * Before you use Command Assistant, take note of the following items:</p>
     * <ul>
     * <li>The simple application server must be in the Running state.</li>
     * <li>The Cloud Assistant client is installed on the server. By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall it. For more information, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs commands on a simple application server.</p>
     * 
     * @param request RunCommandRequest
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a Simple Database Service instance that is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a Simple Database Service instance.</p>
     * 
     * @param request StartDatabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDatabaseInstanceResponse
     */
    public StartDatabaseInstanceResponse startDatabaseInstanceWithOptions(StartDatabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDatabaseInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartDatabaseInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartDatabaseInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a Simple Database Service instance that is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a Simple Database Service instance.</p>
     * 
     * @param request StartDatabaseInstanceRequest
     * @return StartDatabaseInstanceResponse
     */
    public StartDatabaseInstanceResponse startDatabaseInstance(StartDatabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDatabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a simple application server that is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a simple application server.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a simple application server that is in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a simple application server.</p>
     * 
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts simple application servers.</p>
     * 
     * @param request StartInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstancesResponse
     */
    public StartInstancesResponse startInstancesWithOptions(StartInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Starts simple application servers.</p>
     * 
     * @param request StartInstancesRequest
     * @return StartInstancesResponse
     */
    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session for a simple application server.</p>
     * 
     * @param request StartTerminalSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTerminalSessionResponse
     */
    public StartTerminalSessionResponse startTerminalSessionWithOptions(StartTerminalSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTerminalSession"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartTerminalSessionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartTerminalSessionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session for a simple application server.</p>
     * 
     * @param request StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
    public StartTerminalSessionResponse startTerminalSession(StartTerminalSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTerminalSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a Simple Database Service instance that is in the Running state. After the instance is stopped, you cannot log on to or access the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a Simple Database Service instance.</p>
     * 
     * @param request StopDatabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDatabaseInstanceResponse
     */
    public StopDatabaseInstanceResponse stopDatabaseInstanceWithOptions(StopDatabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInstanceId)) {
            query.put("DatabaseInstanceId", request.databaseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDatabaseInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopDatabaseInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopDatabaseInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a Simple Database Service instance that is in the Running state. After the instance is stopped, you cannot log on to or access the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a Simple Database Service instance.</p>
     * 
     * @param request StopDatabaseInstanceRequest
     * @return StopDatabaseInstanceResponse
     */
    public StopDatabaseInstanceResponse stopDatabaseInstance(StopDatabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDatabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can stop a simple application server that you do not use for the time being.</p>
     * <blockquote>
     * <p> Stopping a simple application server may interrupt your business. We recommend that you perform this operation during off-peak hours.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Stops a simple application server.</p>
     * 
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can stop a simple application server that you do not use for the time being.</p>
     * <blockquote>
     * <p> Stopping a simple application server may interrupt your business. We recommend that you perform this operation during off-peak hours.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Stops a simple application server.</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops simple application servers.</p>
     * 
     * @param request StopInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstances"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Stops simple application servers.</p>
     * 
     * @param request StopInstancesRequest
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to simple application servers, snapshots, custom images, commands, firewall rules, and disks to facilitate the viewing and management of the preceding resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to simple application servers, snapshots, custom images, commands, firewall rules, and disks to facilitate the viewing and management of the preceding resources.</p>
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
     * <p>Unbinds and deletes tags from specified lightweight resources, such as instances, snapshots, disks, images, commands, and firewall rules.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UntagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds and deletes tags from specified lightweight resources, such as instances, snapshots, disks, images, commands, and firewall rules.</p>
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
     * <p>Modifys the parameter of a command.</p>
     * 
     * @param request UpdateCommandAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCommandAttributeResponse
     */
    public UpdateCommandAttributeResponse updateCommandAttributeWithOptions(UpdateCommandAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            query.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDir)) {
            query.put("WorkingDir", request.workingDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCommandAttribute"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCommandAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateCommandAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifys the parameter of a command.</p>
     * 
     * @param request UpdateCommandAttributeRequest
     * @return UpdateCommandAttributeResponse
     */
    public UpdateCommandAttributeResponse updateCommandAttribute(UpdateCommandAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCommandAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remarks for the data disk that is attached to a simple application server.</p>
     * 
     * @param request UpdateDiskAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDiskAttributeResponse
     */
    public UpdateDiskAttributeResponse updateDiskAttributeWithOptions(UpdateDiskAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDiskAttribute"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDiskAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDiskAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remarks for the data disk that is attached to a simple application server.</p>
     * 
     * @param request UpdateDiskAttributeRequest
     * @return UpdateDiskAttributeResponse
     */
    public UpdateDiskAttributeResponse updateDiskAttribute(UpdateDiskAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDiskAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you change the password of a simple application server, you must restart the server by calling the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation for the new password to take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a simple application server, including the server name and the password that you use to log on to the server.</p>
     * 
     * @param request UpdateInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceAttributeResponse
     */
    public UpdateInstanceAttributeResponse updateInstanceAttributeWithOptions(UpdateInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceAttribute"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateInstanceAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you change the password of a simple application server, you must restart the server by calling the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation for the new password to take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a simple application server, including the server name and the password that you use to log on to the server.</p>
     * 
     * @param request UpdateInstanceAttributeRequest
     * @return UpdateInstanceAttributeResponse
     */
    public UpdateInstanceAttributeResponse updateInstanceAttribute(UpdateInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remarks of a snapshot of a simple application server.</p>
     * 
     * @param request UpdateSnapshotAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSnapshotAttributeResponse
     */
    public UpdateSnapshotAttributeResponse updateSnapshotAttributeWithOptions(UpdateSnapshotAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSnapshotAttribute"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSnapshotAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSnapshotAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remarks of a snapshot of a simple application server.</p>
     * 
     * @param request UpdateSnapshotAttributeRequest
     * @return UpdateSnapshotAttributeResponse
     */
    public UpdateSnapshotAttributeResponse updateSnapshotAttribute(UpdateSnapshotAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSnapshotAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The plan of a simple application server can only be upgraded. For more information about plans, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the upgrade fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the plan for a simple application server.</p>
     * 
     * @param request UpgradeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstanceWithOptions(UpgradeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstance"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  The plan of a simple application server can only be upgraded. For more information about plans, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the upgrade fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the plan for a simple application server.</p>
     * 
     * @param request UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstance(UpgradeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a key pair for a simple application server.</p>
     * 
     * @param request UploadInstanceKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadInstanceKeyPairResponse
     */
    public UploadInstanceKeyPairResponse uploadInstanceKeyPairWithOptions(UploadInstanceKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadInstanceKeyPair"),
            new TeaPair("version", "2020-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UploadInstanceKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UploadInstanceKeyPairResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Imports a key pair for a simple application server.</p>
     * 
     * @param request UploadInstanceKeyPairRequest
     * @return UploadInstanceKeyPairResponse
     */
    public UploadInstanceKeyPairResponse uploadInstanceKeyPair(UploadInstanceKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadInstanceKeyPairWithOptions(request, runtime);
    }
}
