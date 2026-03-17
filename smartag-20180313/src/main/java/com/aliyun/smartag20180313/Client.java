// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313;

import com.aliyun.tea.*;
import com.aliyun.smartag20180313.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("smartag", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Activates a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ActivateSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateSmartAccessGatewayResponse
     */
    public ActivateSmartAccessGatewayResponse activateSmartAccessGatewayWithOptions(ActivateSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ActivateSmartAccessGatewayRequest
     * @return ActivateSmartAccessGatewayResponse
     */
    public ActivateSmartAccessGatewayResponse activateSmartAccessGateway(ActivateSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a flow log.</p>
     * 
     * @param request ActiveFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveFlowLogResponse
     */
    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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
            new TeaPair("action", "ActiveFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a flow log.</p>
     * 
     * @param request ActiveFlowLogRequest
     * @return ActiveFlowLogResponse
     */
    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) rule.</p>
     * 
     * @param request AddACLRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddACLRuleResponse
     */
    public AddACLRuleResponse addACLRuleWithOptions(AddACLRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCidr)) {
            query.put("DestCidr", request.destCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortRange)) {
            query.put("DestPortRange", request.destPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupIds)) {
            query.put("DpiGroupIds", request.dpiGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureIds)) {
            query.put("DpiSignatureIds", request.dpiSignatureIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddACLRule"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddACLRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL) rule.</p>
     * 
     * @param request AddACLRuleRequest
     * @return AddACLRuleResponse
     */
    public AddACLRuleResponse addACLRule(AddACLRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addACLRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a destination network address translation (DNAT) entry to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AddDnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnatEntryResponse
     */
    public AddDnatEntryResponse addDnatEntryWithOptions(AddDnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalIp)) {
            query.put("ExternalIp", request.externalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalPort)) {
            query.put("ExternalPort", request.externalPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internalIp)) {
            query.put("InternalIp", request.internalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internalPort)) {
            query.put("InternalPort", request.internalPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDnatEntry"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a destination network address translation (DNAT) entry to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AddDnatEntryRequest
     * @return AddDnatEntryResponse
     */
    public AddDnatEntryResponse addDnatEntry(AddDnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds DNS forwarding configurations to an SCG5000 or SCG5000-5G instance. The device version must be 3.4.2 or later.</p>
     * 
     * @param request AddSmartAccessGatewayDnsForwardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSmartAccessGatewayDnsForwardResponse
     */
    public AddSmartAccessGatewayDnsForwardResponse addSmartAccessGatewayDnsForwardWithOptions(AddSmartAccessGatewayDnsForwardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterIp)) {
            query.put("MasterIp", request.masterIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortIndex)) {
            query.put("OutboundPortIndex", request.outboundPortIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortName)) {
            query.put("OutboundPortName", request.outboundPortName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortType)) {
            query.put("OutboundPortType", request.outboundPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveIp)) {
            query.put("SlaveIp", request.slaveIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmartAccessGatewayDnsForward"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmartAccessGatewayDnsForwardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds DNS forwarding configurations to an SCG5000 or SCG5000-5G instance. The device version must be 3.4.2 or later.</p>
     * 
     * @param request AddSmartAccessGatewayDnsForwardRequest
     * @return AddSmartAccessGatewayDnsForwardResponse
     */
    public AddSmartAccessGatewayDnsForwardResponse addSmartAccessGatewayDnsForward(AddSmartAccessGatewayDnsForwardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmartAccessGatewayDnsForwardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to add a source network address translation (SNAT) entry to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AddSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSnatEntryResponse
     */
    public AddSnatEntryResponse addSnatEntryWithOptions(AddSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSnatEntry"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to add a source network address translation (SNAT) entry to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AddSnatEntryRequest
     * @return AddSnatEntryResponse
     */
    public AddSnatEntryResponse addSnatEntry(AddSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an access control list (ACL) with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateACLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateACLResponse
     */
    public AssociateACLResponse associateACLWithOptions(AssociateACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateACL"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateACLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an access control list (ACL) with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateACLRequest
     * @return AssociateACLResponse
     */
    public AssociateACLResponse associateACL(AssociateACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateACLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a flow log with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateFlowLogResponse
     */
    public AssociateFlowLogResponse associateFlowLogWithOptions(AssociateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a flow log with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateFlowLogRequest
     * @return AssociateFlowLogResponse
     */
    public AssociateFlowLogResponse associateFlowLog(AssociateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies a Quality of Service (QoS) policy to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateQosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateQosResponse
     */
    public AssociateQosResponse associateQosWithOptions(AssociateQosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateQos"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateQosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies a Quality of Service (QoS) policy to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateQosRequest
     * @return AssociateQosResponse
     */
    public AssociateQosResponse associateQos(AssociateQosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateQosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you associate a bandwidth plan for application acceleration with an SAG instance, make sure that the following requirements are met:</p>
     * <ul>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG CPE instance, the version of the SAG device associated with the SAG CPE instance must be 2.4.0 or later.
     * If the version of the SAG device is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/163948.html">Update the version of an SAG device</a>.</li>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG app instance, the version of the SAG app must be 2.4.0 or later.
     * If the version of the SAG app is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/102544.html">Install the SAG app</a>.</li>
     * <li>The SAG instance to be associated is in the available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan for application acceleration with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateSmartAGWithApplicationBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateSmartAGWithApplicationBandwidthPackageResponse
     */
    public AssociateSmartAGWithApplicationBandwidthPackageResponse associateSmartAGWithApplicationBandwidthPackageWithOptions(AssociateSmartAGWithApplicationBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationBandwidthPackageId)) {
            query.put("ApplicationBandwidthPackageId", request.applicationBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associateConfigs)) {
            query.put("AssociateConfigs", request.associateConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateSmartAGWithApplicationBandwidthPackage"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateSmartAGWithApplicationBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you associate a bandwidth plan for application acceleration with an SAG instance, make sure that the following requirements are met:</p>
     * <ul>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG CPE instance, the version of the SAG device associated with the SAG CPE instance must be 2.4.0 or later.
     * If the version of the SAG device is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/163948.html">Update the version of an SAG device</a>.</li>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG app instance, the version of the SAG app must be 2.4.0 or later.
     * If the version of the SAG app is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/102544.html">Install the SAG app</a>.</li>
     * <li>The SAG instance to be associated is in the available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan for application acceleration with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request AssociateSmartAGWithApplicationBandwidthPackageRequest
     * @return AssociateSmartAGWithApplicationBandwidthPackageResponse
     */
    public AssociateSmartAGWithApplicationBandwidthPackageResponse associateSmartAGWithApplicationBandwidthPackage(AssociateSmartAGWithApplicationBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateSmartAGWithApplicationBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) device with an SAG instance.</p>
     * 
     * @param request BindSerialNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindSerialNumberResponse
     */
    public BindSerialNumberResponse bindSerialNumberWithOptions(BindSerialNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSerialNumber"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSerialNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) device with an SAG instance.</p>
     * 
     * @param request BindSerialNumberRequest
     * @return BindSerialNumberResponse
     */
    public BindSerialNumberResponse bindSerialNumber(BindSerialNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindSerialNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) instance with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request BindSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindSmartAccessGatewayResponse
     */
    public BindSmartAccessGatewayResponse bindSmartAccessGatewayWithOptions(BindSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGUid)) {
            query.put("SmartAGUid", request.smartAGUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) instance with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request BindSmartAccessGatewayRequest
     * @return BindSmartAccessGatewayResponse
     */
    public BindSmartAccessGatewayResponse bindSmartAccessGateway(BindSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) instance with a virtual border router (VBR).</p>
     * 
     * @param request BindVbrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindVbrResponse
     */
    public BindVbrResponse bindVbrWithOptions(BindVbrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGUid)) {
            query.put("SmartAGUid", request.smartAGUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrId)) {
            query.put("VbrId", request.vbrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrRegionId)) {
            query.put("VbrRegionId", request.vbrRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindVbr"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindVbrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) instance with a virtual border router (VBR).</p>
     * 
     * @param request BindVbrRequest
     * @return BindVbrResponse
     */
    public BindVbrResponse bindVbr(BindVbrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindVbrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of a virtual customer-premises equipment (vCPE) device of Smart Access Gateway (SAG).</p>
     * 
     * @param request ClearSagCipherRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearSagCipherResponse
     */
    public ClearSagCipherResponse clearSagCipherWithOptions(ClearSagCipherRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snNumber)) {
            query.put("SnNumber", request.snNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearSagCipher"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearSagCipherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of a virtual customer-premises equipment (vCPE) device of Smart Access Gateway (SAG).</p>
     * 
     * @param request ClearSagCipherRequest
     * @return ClearSagCipherResponse
     */
    public ClearSagCipherResponse clearSagCipher(ClearSagCipherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearSagCipherWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the routable IP addresses of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ClearSagRouteableAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearSagRouteableAddressResponse
     */
    public ClearSagRouteableAddressResponse clearSagRouteableAddressWithOptions(ClearSagRouteableAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearSagRouteableAddress"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearSagRouteableAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the routable IP addresses of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ClearSagRouteableAddressRequest
     * @return ClearSagRouteableAddressResponse
     */
    public ClearSagRouteableAddressResponse clearSagRouteableAddress(ClearSagRouteableAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearSagRouteableAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL).</p>
     * 
     * @param request CreateACLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateACLResponse
     */
    public CreateACLResponse createACLWithOptions(CreateACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "CreateACL"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateACLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access control list (ACL).</p>
     * 
     * @param request CreateACLRequest
     * @return CreateACLResponse
     */
    public CreateACLResponse createACL(CreateACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createACLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>CCN is a matrix consisting of Alibaba Cloud distributed access gateways. It is an important component of Smart Access Gateway (SAG). After you associate an SAG instance with a CCN instance, the SAG instance connects the private networks associated with Alibaba Cloud. For more information, see <a href="https://help.aliyun.com/document_detail/93667.html">Overview of Cloud Connect Network</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request CreateCloudConnectNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudConnectNetworkResponse
     */
    public CreateCloudConnectNetworkResponse createCloudConnectNetworkWithOptions(CreateCloudConnectNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.snatCidrBlock)) {
            query.put("SnatCidrBlock", request.snatCidrBlock);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudConnectNetwork"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudConnectNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <p>CCN is a matrix consisting of Alibaba Cloud distributed access gateways. It is an important component of Smart Access Gateway (SAG). After you associate an SAG instance with a CCN instance, the SAG instance connects the private networks associated with Alibaba Cloud. For more information, see <a href="https://help.aliyun.com/document_detail/93667.html">Overview of Cloud Connect Network</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request CreateCloudConnectNetworkRequest
     * @return CreateCloudConnectNetworkResponse
     */
    public CreateCloudConnectNetworkResponse createCloudConnectNetwork(CreateCloudConnectNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudConnectNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise code.</p>
     * 
     * @param request CreateEnterpriseCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseCodeResponse
     */
    public CreateEnterpriseCodeResponse createEnterpriseCodeWithOptions(CreateEnterpriseCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseCode)) {
            query.put("EnterpriseCode", request.enterpriseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseCode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an enterprise code.</p>
     * 
     * @param request CreateEnterpriseCodeRequest
     * @return CreateEnterpriseCodeResponse
     */
    public CreateEnterpriseCodeResponse createEnterpriseCode(CreateEnterpriseCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a flow log.</p>
     * 
     * @param request CreateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowLogResponse
     */
    public CreateFlowLogResponse createFlowLogWithOptions(CreateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAging)) {
            query.put("ActiveAging", request.activeAging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inactiveAging)) {
            query.put("InactiveAging", request.inactiveAging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            query.put("LogstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowServerIp)) {
            query.put("NetflowServerIp", request.netflowServerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowServerPort)) {
            query.put("NetflowServerPort", request.netflowServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowVersion)) {
            query.put("NetflowVersion", request.netflowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            query.put("SlsRegionId", request.slsRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a flow log.</p>
     * 
     * @param request CreateFlowLogRequest
     * @return CreateFlowLogResponse
     */
    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a health check for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request CreateHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHealthCheckResponse
     */
    public CreateHealthCheckResponse createHealthCheckWithOptions(CreateHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIpAddr)) {
            query.put("DstIpAddr", request.dstIpAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPort)) {
            query.put("DstPort", request.dstPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failCountThreshold)) {
            query.put("FailCountThreshold", request.failCountThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeCount)) {
            query.put("ProbeCount", request.probeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeInterval)) {
            query.put("ProbeInterval", request.probeInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTimeout)) {
            query.put("ProbeTimeout", request.probeTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rttFailThreshold)) {
            query.put("RttFailThreshold", request.rttFailThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rttThreshold)) {
            query.put("RttThreshold", request.rttThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIpAddr)) {
            query.put("SrcIpAddr", request.srcIpAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPort)) {
            query.put("SrcPort", request.srcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHealthCheck"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHealthCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a health check for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request CreateHealthCheckRequest
     * @return CreateHealthCheckResponse
     */
    public CreateHealthCheckResponse createHealthCheck(CreateHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only SAG-1000 devices whose software version is 2.7.0 or later support the probing feature.</p>
     * <ul>
     * <li>The SAG instance must have the deep packet inspection (DPI) feature enabled. You can call the <a href="https://help.aliyun.com/document_detail/476404.html">SetAdvancedMonitorState</a> operation to enable or disable the DPI feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a probing task for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request CreateProbeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProbeTaskResponse
     */
    public CreateProbeTaskResponse createProbeTaskWithOptions(CreateProbeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packetNumber)) {
            query.put("PacketNumber", request.packetNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTaskSourceAddress)) {
            query.put("ProbeTaskSourceAddress", request.probeTaskSourceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProbeTask"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProbeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only SAG-1000 devices whose software version is 2.7.0 or later support the probing feature.</p>
     * <ul>
     * <li>The SAG instance must have the deep packet inspection (DPI) feature enabled. You can call the <a href="https://help.aliyun.com/document_detail/476404.html">SetAdvancedMonitorState</a> operation to enable or disable the DPI feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a probing task for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request CreateProbeTaskRequest
     * @return CreateProbeTaskResponse
     */
    public CreateProbeTaskResponse createProbeTask(CreateProbeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProbeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQosResponse
     */
    public CreateQosResponse createQosWithOptions(CreateQosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosDescription)) {
            query.put("QosDescription", request.qosDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosName)) {
            query.put("QosName", request.qosName);
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
            new TeaPair("action", "CreateQos"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosRequest
     * @return CreateQosResponse
     */
    public CreateQosResponse createQos(CreateQosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a traffic throttling rule for a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosCarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQosCarResponse
     */
    public CreateQosCarResponse createQosCarWithOptions(CreateQosCarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitType)) {
            query.put("LimitType", request.limitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBandwidthAbs)) {
            query.put("MaxBandwidthAbs", request.maxBandwidthAbs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBandwidthPercent)) {
            query.put("MaxBandwidthPercent", request.maxBandwidthPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minBandwidthAbs)) {
            query.put("MinBandwidthAbs", request.minBandwidthAbs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minBandwidthPercent)) {
            query.put("MinBandwidthPercent", request.minBandwidthPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.percentSourceType)) {
            query.put("PercentSourceType", request.percentSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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
            new TeaPair("action", "CreateQosCar"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQosCarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a traffic throttling rule for a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosCarRequest
     * @return CreateQosCarResponse
     */
    public CreateQosCarResponse createQosCar(CreateQosCarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQosCarWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>A traffic throttling rule is created. For more information, see <a href="https://help.aliyun.com/document_detail/131806.html">CreateQosCar</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a traffic classification rule for a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQosPolicyResponse
     */
    public CreateQosPolicyResponse createQosPolicyWithOptions(CreateQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCidr)) {
            query.put("DestCidr", request.destCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortRange)) {
            query.put("DestPortRange", request.destPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupIds)) {
            query.put("DpiGroupIds", request.dpiGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureIds)) {
            query.put("DpiSignatureIds", request.dpiSignatureIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQosPolicy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQosPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>A traffic throttling rule is created. For more information, see <a href="https://help.aliyun.com/document_detail/131806.html">CreateQosCar</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a traffic classification rule for a quality of service (QoS) policy.</p>
     * 
     * @param request CreateQosPolicyRequest
     * @return CreateQosPolicyResponse
     */
    public CreateQosPolicyResponse createQosPolicy(CreateQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a subinterface for an Express Connect circuit.</p>
     * 
     * @param request CreateSagExpressConnectInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSagExpressConnectInterfaceResponse
     */
    public CreateSagExpressConnectInterfaceResponse createSagExpressConnectInterfaceWithOptions(CreateSagExpressConnectInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSagExpressConnectInterface"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSagExpressConnectInterfaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a subinterface for an Express Connect circuit.</p>
     * 
     * @param request CreateSagExpressConnectInterfaceRequest
     * @return CreateSagExpressConnectInterfaceResponse
     */
    public CreateSagExpressConnectInterfaceResponse createSagExpressConnectInterface(CreateSagExpressConnectInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSagExpressConnectInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a static route to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request CreateSagStaticRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSagStaticRouteResponse
     */
    public CreateSagStaticRouteResponse createSagStaticRouteWithOptions(CreateSagStaticRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            query.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            query.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSagStaticRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSagStaticRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a static route to a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request CreateSagStaticRouteRequest
     * @return CreateSagStaticRouteResponse
     */
    public CreateSagStaticRouteResponse createSagStaticRoute(CreateSagStaticRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSagStaticRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a service address for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request CreateServiceAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceAddressResponse
     */
    public CreateServiceAddressResponse createServiceAddressWithOptions(CreateServiceAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceAddress"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a service address for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request CreateServiceAddressRequest
     * @return CreateServiceAddressResponse
     */
    public CreateServiceAddressResponse createServiceAddress(CreateServiceAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Smart Access Gateway (SAG) CPE or vCPE instance.</p>
     * 
     * @param request CreateSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmartAccessGatewayResponse
     */
    public CreateSmartAccessGatewayResponse createSmartAccessGatewayWithOptions(CreateSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alreadyHaveSag)) {
            query.put("AlreadyHaveSag", request.alreadyHaveSag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerMessage)) {
            query.put("BuyerMessage", request.buyerMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CPEVersion)) {
            query.put("CPEVersion", request.CPEVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.haType)) {
            query.put("HaType", request.haType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardWareSpec)) {
            query.put("HardWareSpec", request.hardWareSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBandWidth)) {
            query.put("MaxBandWidth", request.maxBandWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverAddress)) {
            query.put("ReceiverAddress", request.receiverAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverCity)) {
            query.put("ReceiverCity", request.receiverCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverCountry)) {
            query.put("ReceiverCountry", request.receiverCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverDistrict)) {
            query.put("ReceiverDistrict", request.receiverDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverEmail)) {
            query.put("ReceiverEmail", request.receiverEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverMobile)) {
            query.put("ReceiverMobile", request.receiverMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverName)) {
            query.put("ReceiverName", request.receiverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverPhone)) {
            query.put("ReceiverPhone", request.receiverPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverState)) {
            query.put("ReceiverState", request.receiverState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverTown)) {
            query.put("ReceiverTown", request.receiverTown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverZip)) {
            query.put("ReceiverZip", request.receiverZip);
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
            new TeaPair("action", "CreateSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Smart Access Gateway (SAG) CPE or vCPE instance.</p>
     * 
     * @param request CreateSmartAccessGatewayRequest
     * @return CreateSmartAccessGatewayResponse
     */
    public CreateSmartAccessGatewayResponse createSmartAccessGateway(CreateSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a client account.</p>
     * 
     * @param request CreateSmartAccessGatewayClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmartAccessGatewayClientUserResponse
     */
    public CreateSmartAccessGatewayClientUserResponse createSmartAccessGatewayClientUserWithOptions(CreateSmartAccessGatewayClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMail)) {
            query.put("UserMail", request.userMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmartAccessGatewayClientUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmartAccessGatewayClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a client account.</p>
     * 
     * @param request CreateSmartAccessGatewayClientUserRequest
     * @return CreateSmartAccessGatewayClientUserResponse
     */
    public CreateSmartAccessGatewayClientUserResponse createSmartAccessGatewayClientUser(CreateSmartAccessGatewayClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request CreateSmartAccessGatewaySoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmartAccessGatewaySoftwareResponse
     */
    public CreateSmartAccessGatewaySoftwareResponse createSmartAccessGatewaySoftwareWithOptions(CreateSmartAccessGatewaySoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPlan)) {
            query.put("DataPlan", request.dataPlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            query.put("UserCount", request.userCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmartAccessGatewaySoftware"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmartAccessGatewaySoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request CreateSmartAccessGatewaySoftwareRequest
     * @return CreateSmartAccessGatewaySoftwareResponse
     */
    public CreateSmartAccessGatewaySoftwareResponse createSmartAccessGatewaySoftware(CreateSmartAccessGatewaySoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a flow log.</p>
     * 
     * @param request DeactiveFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactiveFlowLogResponse
     */
    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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
            new TeaPair("action", "DeactiveFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a flow log.</p>
     * 
     * @param request DeactiveFlowLogRequest
     * @return DeactiveFlowLogResponse
     */
    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL).</p>
     * 
     * @param request DeleteACLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteACLResponse
     */
    public DeleteACLResponse deleteACLWithOptions(DeleteACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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
            new TeaPair("action", "DeleteACL"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteACLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control list (ACL).</p>
     * 
     * @param request DeleteACLRequest
     * @return DeleteACLResponse
     */
    public DeleteACLResponse deleteACL(DeleteACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteACLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rule from an ACL.</p>
     * 
     * @param request DeleteACLRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteACLRuleResponse
     */
    public DeleteACLRuleResponse deleteACLRuleWithOptions(DeleteACLRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acrId)) {
            query.put("AcrId", request.acrId);
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
            new TeaPair("action", "DeleteACLRule"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteACLRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rule from an ACL.</p>
     * 
     * @param request DeleteACLRuleRequest
     * @return DeleteACLRuleResponse
     */
    public DeleteACLRuleResponse deleteACLRule(DeleteACLRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteACLRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Make sure that the CCN instance you want to delete is not associated with a Smart Access Gateway (SAG) instance or a Cloud Enterprise Network (CEN) instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DeleteCloudConnectNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudConnectNetworkResponse
     */
    public DeleteCloudConnectNetworkResponse deleteCloudConnectNetworkWithOptions(DeleteCloudConnectNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
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
            new TeaPair("action", "DeleteCloudConnectNetwork"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudConnectNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Make sure that the CCN instance you want to delete is not associated with a Smart Access Gateway (SAG) instance or a Cloud Enterprise Network (CEN) instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DeleteCloudConnectNetworkRequest
     * @return DeleteCloudConnectNetworkResponse
     */
    public DeleteCloudConnectNetworkResponse deleteCloudConnectNetwork(DeleteCloudConnectNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudConnectNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a DNAT entry from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteDnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDnatEntryResponse
     */
    public DeleteDnatEntryResponse deleteDnatEntryWithOptions(DeleteDnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnatEntryId)) {
            query.put("DnatEntryId", request.dnatEntryId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDnatEntry"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a DNAT entry from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteDnatEntryRequest
     * @return DeleteDnatEntryResponse
     */
    public DeleteDnatEntryResponse deleteDnatEntry(DeleteDnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following rules:</p>
     * <ul>
     * <li>You cannot delete default enterprise codes.
     * To delete a default enterprise code, change it to a custom enterprise code and then delete it. For more information, see <a href="https://help.aliyun.com/document_detail/197700.html">UpdateEnterpriseCode</a>.</li>
     * <li>You cannot delete enterprise codes that are associated with a Smart Access Gateway (SAG) APP instance.
     * To delete an enterprise code that is associated with an SAG APP instance, associate the SAG APP instance with another enterprise code, and then delete the enterprise code. For more information, see <a href="https://help.aliyun.com/document_detail/197701.html">UpdateSmartAGEnterpriseCode</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified enterprise code.</p>
     * 
     * @param request DeleteEnterpriseCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseCodeResponse
     */
    public DeleteEnterpriseCodeResponse deleteEnterpriseCodeWithOptions(DeleteEnterpriseCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseCode)) {
            query.put("EnterpriseCode", request.enterpriseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseCode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following rules:</p>
     * <ul>
     * <li>You cannot delete default enterprise codes.
     * To delete a default enterprise code, change it to a custom enterprise code and then delete it. For more information, see <a href="https://help.aliyun.com/document_detail/197700.html">UpdateEnterpriseCode</a>.</li>
     * <li>You cannot delete enterprise codes that are associated with a Smart Access Gateway (SAG) APP instance.
     * To delete an enterprise code that is associated with an SAG APP instance, associate the SAG APP instance with another enterprise code, and then delete the enterprise code. For more information, see <a href="https://help.aliyun.com/document_detail/197701.html">UpdateSmartAGEnterpriseCode</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified enterprise code.</p>
     * 
     * @param request DeleteEnterpriseCodeRequest
     * @return DeleteEnterpriseCodeResponse
     */
    public DeleteEnterpriseCodeResponse deleteEnterpriseCode(DeleteEnterpriseCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a flow log.</p>
     * 
     * @param request DeleteFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowLogResponse
     */
    public DeleteFlowLogResponse deleteFlowLogWithOptions(DeleteFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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
            new TeaPair("action", "DeleteFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a flow log.</p>
     * 
     * @param request DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     */
    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a health check instance.</p>
     * 
     * @param request DeleteHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHealthCheckResponse
     */
    public DeleteHealthCheckResponse deleteHealthCheckWithOptions(DeleteHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hcInstanceId)) {
            query.put("HcInstanceId", request.hcInstanceId);
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
            new TeaPair("action", "DeleteHealthCheck"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHealthCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a health check instance.</p>
     * 
     * @param request DeleteHealthCheckRequest
     * @return DeleteHealthCheckResponse
     */
    public DeleteHealthCheckResponse deleteHealthCheck(DeleteHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a probe task.</p>
     * 
     * @param request DeleteProbeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProbeTaskResponse
     */
    public DeleteProbeTaskResponse deleteProbeTaskWithOptions(DeleteProbeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.probeTaskId)) {
            query.put("ProbeTaskId", request.probeTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProbeTask"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProbeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a probe task.</p>
     * 
     * @param request DeleteProbeTaskRequest
     * @return DeleteProbeTaskResponse
     */
    public DeleteProbeTaskResponse deleteProbeTask(DeleteProbeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProbeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQosResponse
     */
    public DeleteQosResponse deleteQosWithOptions(DeleteQosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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
            new TeaPair("action", "DeleteQos"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosRequest
     * @return DeleteQosResponse
     */
    public DeleteQosResponse deleteQos(DeleteQosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a speed limiting rule of a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosCarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQosCarResponse
     */
    public DeleteQosCarResponse deleteQosCarWithOptions(DeleteQosCarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosCarId)) {
            query.put("QosCarId", request.qosCarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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
            new TeaPair("action", "DeleteQosCar"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQosCarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a speed limiting rule of a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosCarRequest
     * @return DeleteQosCarResponse
     */
    public DeleteQosCarResponse deleteQosCar(DeleteQosCarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQosCarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quintuple rule of a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQosPolicyResponse
     */
    public DeleteQosPolicyResponse deleteQosPolicyWithOptions(DeleteQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosPolicyId)) {
            query.put("QosPolicyId", request.qosPolicyId);
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
            new TeaPair("action", "DeleteQosPolicy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQosPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a quintuple rule of a Quality of Service (QoS) policy.</p>
     * 
     * @param request DeleteQosPolicyRequest
     * @return DeleteQosPolicyResponse
     */
    public DeleteQosPolicyResponse deleteQosPolicy(DeleteQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a route advertisement policy.</p>
     * 
     * @param request DeleteRouteDistributionStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteDistributionStrategyResponse
     */
    public DeleteRouteDistributionStrategyResponse deleteRouteDistributionStrategyWithOptions(DeleteRouteDistributionStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCidrBlock)) {
            query.put("DestCidrBlock", request.destCidrBlock);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeSource)) {
            query.put("RouteSource", request.routeSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteDistributionStrategy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteDistributionStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a route advertisement policy.</p>
     * 
     * @param request DeleteRouteDistributionStrategyRequest
     * @return DeleteRouteDistributionStrategyResponse
     */
    public DeleteRouteDistributionStrategyResponse deleteRouteDistributionStrategy(DeleteRouteDistributionStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteDistributionStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a subinterface from a leased line port.</p>
     * 
     * @param request DeleteSagExpressConnectInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSagExpressConnectInterfaceResponse
     */
    public DeleteSagExpressConnectInterfaceResponse deleteSagExpressConnectInterfaceWithOptions(DeleteSagExpressConnectInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSagExpressConnectInterface"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSagExpressConnectInterfaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a subinterface from a leased line port.</p>
     * 
     * @param request DeleteSagExpressConnectInterfaceRequest
     * @return DeleteSagExpressConnectInterfaceResponse
     */
    public DeleteSagExpressConnectInterfaceResponse deleteSagExpressConnectInterface(DeleteSagExpressConnectInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSagExpressConnectInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a static route.</p>
     * 
     * @param request DeleteSagStaticRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSagStaticRouteResponse
     */
    public DeleteSagStaticRouteResponse deleteSagStaticRouteWithOptions(DeleteSagStaticRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            query.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSagStaticRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSagStaticRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a static route.</p>
     * 
     * @param request DeleteSagStaticRouteRequest
     * @return DeleteSagStaticRouteResponse
     */
    public DeleteSagStaticRouteResponse deleteSagStaticRoute(DeleteSagStaticRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSagStaticRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service address from a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DeleteServiceAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceAddressResponse
     */
    public DeleteServiceAddressResponse deleteServiceAddressWithOptions(DeleteServiceAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceAddress"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service address from a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DeleteServiceAddressRequest
     * @return DeleteServiceAddressResponse
     */
    public DeleteServiceAddressResponse deleteServiceAddress(DeleteServiceAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The SAG instance that you want to delete is an SAG CPE instance or an SAG vCPE instance.</p>
     * <ul>
     * <li>The SAG instance that you want to delete is locked due to overdue payments.</li>
     * <li>The SAG instance that you want to delete is not associated with a Cloud Connect Network (CCN) instance or a virtual border router (VBR). If the SAG instance is associated with a CCN instance or a VBR, dissociate the SAG instance from the CCN instance or VBR first. For more information, see <a href="https://help.aliyun.com/document_detail/164903.html">Detach a network</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmartAccessGatewayResponse
     */
    public DeleteSmartAccessGatewayResponse deleteSmartAccessGatewayWithOptions(DeleteSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmartAccessGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The SAG instance that you want to delete is an SAG CPE instance or an SAG vCPE instance.</p>
     * <ul>
     * <li>The SAG instance that you want to delete is locked due to overdue payments.</li>
     * <li>The SAG instance that you want to delete is not associated with a Cloud Connect Network (CCN) instance or a virtual border router (VBR). If the SAG instance is associated with a CCN instance or a VBR, dissociate the SAG instance from the CCN instance or VBR first. For more information, see <a href="https://help.aliyun.com/document_detail/164903.html">Detach a network</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteSmartAccessGatewayRequest
     * @return DeleteSmartAccessGatewayResponse
     */
    public DeleteSmartAccessGatewayResponse deleteSmartAccessGateway(DeleteSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client account from a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DeleteSmartAccessGatewayClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmartAccessGatewayClientUserResponse
     */
    public DeleteSmartAccessGatewayClientUserResponse deleteSmartAccessGatewayClientUserWithOptions(DeleteSmartAccessGatewayClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmartAccessGatewayClientUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmartAccessGatewayClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client account from a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DeleteSmartAccessGatewayClientUserRequest
     * @return DeleteSmartAccessGatewayClientUserResponse
     */
    public DeleteSmartAccessGatewayClientUserResponse deleteSmartAccessGatewayClientUser(DeleteSmartAccessGatewayClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables DNS forwarding for SCG5000 or SCG5000-5G devices whose software version is 3.4.2 or later.</p>
     * 
     * @param request DeleteSmartAccessGatewayDnsForwardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmartAccessGatewayDnsForwardResponse
     */
    public DeleteSmartAccessGatewayDnsForwardResponse deleteSmartAccessGatewayDnsForwardWithOptions(DeleteSmartAccessGatewayDnsForwardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmartAccessGatewayDnsForward"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmartAccessGatewayDnsForwardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables DNS forwarding for SCG5000 or SCG5000-5G devices whose software version is 3.4.2 or later.</p>
     * 
     * @param request DeleteSmartAccessGatewayDnsForwardRequest
     * @return DeleteSmartAccessGatewayDnsForwardResponse
     */
    public DeleteSmartAccessGatewayDnsForwardResponse deleteSmartAccessGatewayDnsForward(DeleteSmartAccessGatewayDnsForwardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmartAccessGatewayDnsForwardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an SNAT entry from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnatEntryResponse
     */
    public DeleteSnatEntryResponse deleteSnatEntryWithOptions(DeleteSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnatEntry"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an SNAT entry from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
     */
    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an access control list (ACL).</p>
     * 
     * @param request DescribeACLAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeACLAttributeResponse
     */
    public DescribeACLAttributeResponse describeACLAttributeWithOptions(DescribeACLAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeACLAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeACLAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an access control list (ACL).</p>
     * 
     * @param request DescribeACLAttributeRequest
     * @return DescribeACLAttributeResponse
     */
    public DescribeACLAttributeResponse describeACLAttribute(DescribeACLAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeACLAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs) in a specified region.</p>
     * 
     * @param request DescribeACLsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeACLsResponse
     */
    public DescribeACLsResponse describeACLsWithOptions(DescribeACLsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeACLs"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeACLsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access control lists (ACLs) in a specified region.</p>
     * 
     * @param request DescribeACLsRequest
     * @return DescribeACLsResponse
     */
    public DescribeACLsResponse describeACLs(DescribeACLsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeACLsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Smart Access Gateway (SAG) instances in a region that can be associated with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DescribeBindableSmartAccessGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBindableSmartAccessGatewaysResponse
     */
    public DescribeBindableSmartAccessGatewaysResponse describeBindableSmartAccessGatewaysWithOptions(DescribeBindableSmartAccessGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBindableSmartAccessGateways"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBindableSmartAccessGatewaysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Smart Access Gateway (SAG) instances in a region that can be associated with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DescribeBindableSmartAccessGatewaysRequest
     * @return DescribeBindableSmartAccessGatewaysResponse
     */
    public DescribeBindableSmartAccessGatewaysResponse describeBindableSmartAccessGateways(DescribeBindableSmartAccessGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBindableSmartAccessGatewaysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS settings of a Smart Access Gateway (SAG) instance associated with SAG app.</p>
     * 
     * @param request DescribeClientUserDNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientUserDNSResponse
     */
    public DescribeClientUserDNSResponse describeClientUserDNSWithOptions(DescribeClientUserDNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientUserDNS"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientUserDNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS settings of a Smart Access Gateway (SAG) instance associated with SAG app.</p>
     * 
     * @param request DescribeClientUserDNSRequest
     * @return DescribeClientUserDNSResponse
     */
    public DescribeClientUserDNSResponse describeClientUserDNS(DescribeClientUserDNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientUserDNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Cloud Connect Network (CCN) instances that you have created in a specific region.</p>
     * 
     * @param request DescribeCloudConnectNetworksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudConnectNetworksResponse
     */
    public DescribeCloudConnectNetworksResponse describeCloudConnectNetworksWithOptions(DescribeCloudConnectNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudConnectNetworks"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudConnectNetworksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Cloud Connect Network (CCN) instances that you have created in a specific region.</p>
     * 
     * @param request DescribeCloudConnectNetworksRequest
     * @return DescribeCloudConnectNetworksResponse
     */
    public DescribeCloudConnectNetworksResponse describeCloudConnectNetworks(DescribeCloudConnectNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudConnectNetworksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic upgrade policy of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeDeviceAutoUpgradePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceAutoUpgradePolicyResponse
     */
    public DescribeDeviceAutoUpgradePolicyResponse describeDeviceAutoUpgradePolicyWithOptions(DescribeDeviceAutoUpgradePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceAutoUpgradePolicy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceAutoUpgradePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic upgrade policy of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeDeviceAutoUpgradePolicyRequest
     * @return DescribeDeviceAutoUpgradePolicyResponse
     */
    public DescribeDeviceAutoUpgradePolicyResponse describeDeviceAutoUpgradePolicy(DescribeDeviceAutoUpgradePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceAutoUpgradePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DNAT entries that are associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeDnatEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnatEntriesResponse
     */
    public DescribeDnatEntriesResponse describeDnatEntriesWithOptions(DescribeDnatEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnatEntries"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnatEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DNAT entries that are associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeDnatEntriesRequest
     * @return DescribeDnatEntriesResponse
     */
    public DescribeDnatEntriesResponse describeDnatEntries(DescribeDnatEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnatEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances that are associated with a specified flow log.</p>
     * 
     * @param request DescribeFlowLogSagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowLogSagsResponse
     */
    public DescribeFlowLogSagsResponse describeFlowLogSagsWithOptions(DescribeFlowLogSagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowLogSags"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowLogSagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances that are associated with a specified flow log.</p>
     * 
     * @param request DescribeFlowLogSagsRequest
     * @return DescribeFlowLogSagsResponse
     */
    public DescribeFlowLogSagsResponse describeFlowLogSags(DescribeFlowLogSagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowLogSagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries flow logs in a specified region.</p>
     * 
     * @param request DescribeFlowLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowLogsResponse
     */
    public DescribeFlowLogsResponse describeFlowLogsWithOptions(DescribeFlowLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            query.put("FlowLogName", request.flowLogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowLogs"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries flow logs in a specified region.</p>
     * 
     * @param request DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     */
    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the authorization information about a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DescribeGrantRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGrantRulesResponse
     */
    public DescribeGrantRulesResponse describeGrantRulesWithOptions(DescribeGrantRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associatedCcnId)) {
            query.put("AssociatedCcnId", request.associatedCcnId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGrantRules"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the authorization information about a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request DescribeGrantRulesRequest
     * @return DescribeGrantRulesResponse
     */
    public DescribeGrantRulesResponse describeGrantRules(DescribeGrantRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission information about a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeGrantSagRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGrantSagRulesResponse
     */
    public DescribeGrantSagRulesResponse describeGrantSagRulesWithOptions(DescribeGrantSagRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGrantSagRules"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantSagRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission information about a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeGrantSagRulesRequest
     * @return DescribeGrantSagRulesResponse
     */
    public DescribeGrantSagRulesResponse describeGrantSagRules(DescribeGrantSagRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantSagRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries authorization information about Smart Access Gateway (SAG) instances and cross-account virtual border routers (VBRs).</p>
     * 
     * @param request DescribeGrantSagVbrRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGrantSagVbrRulesResponse
     */
    public DescribeGrantSagVbrRulesResponse describeGrantSagVbrRulesWithOptions(DescribeGrantSagVbrRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGrantSagVbrRules"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantSagVbrRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries authorization information about Smart Access Gateway (SAG) instances and cross-account virtual border routers (VBRs).</p>
     * 
     * @param request DescribeGrantSagVbrRulesRequest
     * @return DescribeGrantSagVbrRulesResponse
     */
    public DescribeGrantSagVbrRulesResponse describeGrantSagVbrRules(DescribeGrantSagVbrRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantSagVbrRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a health check instance.</p>
     * 
     * @param request DescribeHealthCheckAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthCheckAttributeResponse
     */
    public DescribeHealthCheckAttributeResponse describeHealthCheckAttributeWithOptions(DescribeHealthCheckAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hcInstanceId)) {
            query.put("HcInstanceId", request.hcInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHealthCheckAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthCheckAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a health check instance.</p>
     * 
     * @param request DescribeHealthCheckAttributeRequest
     * @return DescribeHealthCheckAttributeResponse
     */
    public DescribeHealthCheckAttributeResponse describeHealthCheckAttribute(DescribeHealthCheckAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthCheckAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health checks that are associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeHealthChecksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthChecksResponse
     */
    public DescribeHealthChecksResponse describeHealthChecksWithOptions(DescribeHealthChecksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hcInstanceId)) {
            query.put("HcInstanceId", request.hcInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHealthChecks"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthChecksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health checks that are associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeHealthChecksRequest
     * @return DescribeHealthChecksResponse
     */
    public DescribeHealthChecksResponse describeHealthChecks(DescribeHealthChecksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthChecksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries traffic throttling rules of a quality of service (QoS) policy.</p>
     * 
     * @param request DescribeQosCarsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQosCarsResponse
     */
    public DescribeQosCarsResponse describeQosCarsWithOptions(DescribeQosCarsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
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

        if (!com.aliyun.teautil.Common.isUnset(request.qosCarId)) {
            query.put("QosCarId", request.qosCarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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
            new TeaPair("action", "DescribeQosCars"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQosCarsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries traffic throttling rules of a quality of service (QoS) policy.</p>
     * 
     * @param request DescribeQosCarsRequest
     * @return DescribeQosCarsResponse
     */
    public DescribeQosCarsResponse describeQosCars(DescribeQosCarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQosCarsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) rules that contain 5-tuples.</p>
     * 
     * @param request DescribeQosPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQosPoliciesResponse
     */
    public DescribeQosPoliciesResponse describeQosPoliciesWithOptions(DescribeQosPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosPolicyId)) {
            query.put("QosPolicyId", request.qosPolicyId);
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
            new TeaPair("action", "DescribeQosPolicies"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQosPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) rules that contain 5-tuples.</p>
     * 
     * @param request DescribeQosPoliciesRequest
     * @return DescribeQosPoliciesResponse
     */
    public DescribeQosPoliciesResponse describeQosPolicies(DescribeQosPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQosPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) policies in a specified region.</p>
     * 
     * @param request DescribeQosesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQosesResponse
     */
    public DescribeQosesResponse describeQosesWithOptions(DescribeQosesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.qosIds)) {
            query.put("QosIds", request.qosIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosName)) {
            query.put("QosName", request.qosName);
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
            new TeaPair("action", "DescribeQoses"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQosesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) policies in a specified region.</p>
     * 
     * @param request DescribeQosesRequest
     * @return DescribeQosesResponse
     */
    public DescribeQosesResponse describeQoses(DescribeQosesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQosesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-03-13"),
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
     * <p>Queries available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route advertisement policies.</p>
     * 
     * @param request DescribeRouteDistributionStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRouteDistributionStrategiesResponse
     */
    public DescribeRouteDistributionStrategiesResponse describeRouteDistributionStrategiesWithOptions(DescribeRouteDistributionStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteDistributionStrategies"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteDistributionStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route advertisement policies.</p>
     * 
     * @param request DescribeRouteDistributionStrategiesRequest
     * @return DescribeRouteDistributionStrategiesResponse
     */
    public DescribeRouteDistributionStrategiesResponse describeRouteDistributionStrategies(DescribeRouteDistributionStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteDistributionStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSAGDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSAGDeviceInfoResponse
     */
    public DescribeSAGDeviceInfoResponse describeSAGDeviceInfoWithOptions(DescribeSAGDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSAGDeviceInfo"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSAGDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSAGDeviceInfoRequest
     * @return DescribeSAGDeviceInfoResponse
     */
    public DescribeSAGDeviceInfoResponse describeSAGDeviceInfo(DescribeSAGDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSAGDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS servers used by a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagCurrentDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagCurrentDnsResponse
     */
    public DescribeSagCurrentDnsResponse describeSagCurrentDnsWithOptions(DescribeSagCurrentDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagCurrentDns"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagCurrentDnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS servers used by a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagCurrentDnsRequest
     * @return DescribeSagCurrentDnsResponse
     */
    public DescribeSagCurrentDnsResponse describeSagCurrentDns(DescribeSagCurrentDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagCurrentDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the top 10 Smart Access Gateway (SAG) instances that have the highest packet loss rates in a specific region.</p>
     * 
     * @param request DescribeSagDropTopNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagDropTopNResponse
     */
    public DescribeSagDropTopNResponse describeSagDropTopNWithOptions(DescribeSagDropTopNRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagDropTopN"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagDropTopNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the top 10 Smart Access Gateway (SAG) instances that have the highest packet loss rates in a specific region.</p>
     * 
     * @param request DescribeSagDropTopNRequest
     * @return DescribeSagDropTopNResponse
     */
    public DescribeSagDropTopNResponse describeSagDropTopN(DescribeSagDropTopNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagDropTopNWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sub-interfaces added to an Express Connect circuit port.</p>
     * 
     * @param request DescribeSagExpressConnectInterfaceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagExpressConnectInterfaceListResponse
     */
    public DescribeSagExpressConnectInterfaceListResponse describeSagExpressConnectInterfaceListWithOptions(DescribeSagExpressConnectInterfaceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagExpressConnectInterfaceList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagExpressConnectInterfaceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sub-interfaces added to an Express Connect circuit port.</p>
     * 
     * @param request DescribeSagExpressConnectInterfaceListRequest
     * @return DescribeSagExpressConnectInterfaceListResponse
     */
    public DescribeSagExpressConnectInterfaceListResponse describeSagExpressConnectInterfaceList(DescribeSagExpressConnectInterfaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagExpressConnectInterfaceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global routing protocol.</p>
     * 
     * @param request DescribeSagGlobalRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagGlobalRouteProtocolResponse
     */
    public DescribeSagGlobalRouteProtocolResponse describeSagGlobalRouteProtocolWithOptions(DescribeSagGlobalRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagGlobalRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagGlobalRouteProtocolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global routing protocol.</p>
     * 
     * @param request DescribeSagGlobalRouteProtocolRequest
     * @return DescribeSagGlobalRouteProtocolResponse
     */
    public DescribeSagGlobalRouteProtocolResponse describeSagGlobalRouteProtocol(DescribeSagGlobalRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagGlobalRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the high availability (HA) configuration of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagHaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagHaResponse
     */
    public DescribeSagHaResponse describeSagHaWithOptions(DescribeSagHaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagHa"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagHaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the high availability (HA) configuration of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagHaRequest
     * @return DescribeSagHaResponse
     */
    public DescribeSagHaResponse describeSagHa(DescribeSagHaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagHaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the LAN port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagLanListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagLanListResponse
     */
    public DescribeSagLanListResponse describeSagLanListWithOptions(DescribeSagLanListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagLanList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagLanListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the LAN port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagLanListRequest
     * @return DescribeSagLanListResponse
     */
    public DescribeSagLanListResponse describeSagLanList(DescribeSagLanListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagLanListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the management port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagManagementPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagManagementPortResponse
     */
    public DescribeSagManagementPortResponse describeSagManagementPortWithOptions(DescribeSagManagementPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagManagementPort"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagManagementPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the management port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagManagementPortRequest
     * @return DescribeSagManagementPortResponse
     */
    public DescribeSagManagementPortResponse describeSagManagementPort(DescribeSagManagementPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagManagementPortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of clients connected to Alibaba Cloud through a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeSagOnlineClientStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagOnlineClientStatisticsResponse
     */
    public DescribeSagOnlineClientStatisticsResponse describeSagOnlineClientStatisticsWithOptions(DescribeSagOnlineClientStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGIds)) {
            query.put("SmartAGIds", request.smartAGIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagOnlineClientStatistics"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagOnlineClientStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of clients connected to Alibaba Cloud through a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeSagOnlineClientStatisticsRequest
     * @return DescribeSagOnlineClientStatisticsResponse
     */
    public DescribeSagOnlineClientStatisticsResponse describeSagOnlineClientStatistics(DescribeSagOnlineClientStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagOnlineClientStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information of a physical port.</p>
     * 
     * @param request DescribeSagPortListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagPortListResponse
     */
    public DescribeSagPortListResponse describeSagPortListWithOptions(DescribeSagPortListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagPortList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagPortListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information of a physical port.</p>
     * 
     * @param request DescribeSagPortListRequest
     * @return DescribeSagPortListResponse
     */
    public DescribeSagPortListResponse describeSagPortList(DescribeSagPortListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagPortListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports for which the specified routing protocol is enabled.</p>
     * 
     * @param request DescribeSagPortRouteProtocolListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagPortRouteProtocolListResponse
     */
    public DescribeSagPortRouteProtocolListResponse describeSagPortRouteProtocolListWithOptions(DescribeSagPortRouteProtocolListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagPortRouteProtocolList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagPortRouteProtocolListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports for which the specified routing protocol is enabled.</p>
     * 
     * @param request DescribeSagPortRouteProtocolListRequest
     * @return DescribeSagPortRouteProtocolListResponse
     */
    public DescribeSagPortRouteProtocolListResponse describeSagPortRouteProtocolList(DescribeSagPortRouteProtocolListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagPortRouteProtocolListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries remote logon information about a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagRemoteAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagRemoteAccessResponse
     */
    public DescribeSagRemoteAccessResponse describeSagRemoteAccessWithOptions(DescribeSagRemoteAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagRemoteAccess"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagRemoteAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries remote logon information about a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagRemoteAccessRequest
     * @return DescribeSagRemoteAccessResponse
     */
    public DescribeSagRemoteAccessResponse describeSagRemoteAccess(DescribeSagRemoteAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagRemoteAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagRouteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagRouteListResponse
     */
    public DescribeSagRouteListResponse describeSagRouteListWithOptions(DescribeSagRouteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagRouteList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagRouteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagRouteListRequest
     * @return DescribeSagRouteListResponse
     */
    public DescribeSagRouteListResponse describeSagRouteList(DescribeSagRouteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagRouteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of Border Gateway Protocol (BGP) dynamic routing.</p>
     * 
     * @param request DescribeSagRouteProtocolBgpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagRouteProtocolBgpResponse
     */
    public DescribeSagRouteProtocolBgpResponse describeSagRouteProtocolBgpWithOptions(DescribeSagRouteProtocolBgpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagRouteProtocolBgp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagRouteProtocolBgpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of Border Gateway Protocol (BGP) dynamic routing.</p>
     * 
     * @param request DescribeSagRouteProtocolBgpRequest
     * @return DescribeSagRouteProtocolBgpResponse
     */
    public DescribeSagRouteProtocolBgpResponse describeSagRouteProtocolBgp(DescribeSagRouteProtocolBgpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagRouteProtocolBgpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the OSPF settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagRouteProtocolOspfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagRouteProtocolOspfResponse
     */
    public DescribeSagRouteProtocolOspfResponse describeSagRouteProtocolOspfWithOptions(DescribeSagRouteProtocolOspfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagRouteProtocolOspf"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagRouteProtocolOspfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the OSPF settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagRouteProtocolOspfRequest
     * @return DescribeSagRouteProtocolOspfResponse
     */
    public DescribeSagRouteProtocolOspfResponse describeSagRouteProtocolOspf(DescribeSagRouteProtocolOspfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagRouteProtocolOspfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the static routes of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagStaticRouteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagStaticRouteListResponse
     */
    public DescribeSagStaticRouteListResponse describeSagStaticRouteListWithOptions(DescribeSagStaticRouteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagStaticRouteList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagStaticRouteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the static routes of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagStaticRouteListRequest
     * @return DescribeSagStaticRouteListResponse
     */
    public DescribeSagStaticRouteListResponse describeSagStaticRouteList(DescribeSagStaticRouteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagStaticRouteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the top 10 Smart Access Gateway (SAG) instances that have the highest data transfer rates in a specific region.</p>
     * 
     * @param request DescribeSagTrafficTopNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagTrafficTopNResponse
     */
    public DescribeSagTrafficTopNResponse describeSagTrafficTopNWithOptions(DescribeSagTrafficTopNRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagTrafficTopN"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagTrafficTopNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the top 10 Smart Access Gateway (SAG) instances that have the highest data transfer rates in a specific region.</p>
     * 
     * @param request DescribeSagTrafficTopNRequest
     * @return DescribeSagTrafficTopNResponse
     */
    public DescribeSagTrafficTopNResponse describeSagTrafficTopN(DescribeSagTrafficTopNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagTrafficTopNWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS servers used by a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagUserDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagUserDnsResponse
     */
    public DescribeSagUserDnsResponse describeSagUserDnsWithOptions(DescribeSagUserDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagUserDns"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagUserDnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS servers used by a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagUserDnsRequest
     * @return DescribeSagUserDnsResponse
     */
    public DescribeSagUserDnsResponse describeSagUserDns(DescribeSagUserDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagUserDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a specified virtual border router (VBR) is associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagVbrRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagVbrRelationsResponse
     */
    public DescribeSagVbrRelationsResponse describeSagVbrRelationsWithOptions(DescribeSagVbrRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceIds)) {
            query.put("VbrInstanceIds", request.vbrInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrRegionId)) {
            query.put("VbrRegionId", request.vbrRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagVbrRelations"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagVbrRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a specified virtual border router (VBR) is associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagVbrRelationsRequest
     * @return DescribeSagVbrRelationsResponse
     */
    public DescribeSagVbrRelationsResponse describeSagVbrRelations(DescribeSagVbrRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagVbrRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the 4G subscriber identity module (SIM) card used by the WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWan4GRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagWan4GResponse
     */
    public DescribeSagWan4GResponse describeSagWan4GWithOptions(DescribeSagWan4GRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagWan4G"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagWan4GResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the 4G subscriber identity module (SIM) card used by the WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWan4GRequest
     * @return DescribeSagWan4GResponse
     */
    public DescribeSagWan4GResponse describeSagWan4G(DescribeSagWan4GRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagWan4GWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the WAN port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWanListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagWanListResponse
     */
    public DescribeSagWanListResponse describeSagWanListWithOptions(DescribeSagWanListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagWanList"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagWanListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the WAN port settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWanListRequest
     * @return DescribeSagWanListResponse
     */
    public DescribeSagWanListResponse describeSagWanList(DescribeSagWanListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagWanListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SNAT settings of the WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWanSnatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagWanSnatResponse
     */
    public DescribeSagWanSnatResponse describeSagWanSnatWithOptions(DescribeSagWanSnatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagWanSnat"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagWanSnatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SNAT settings of the WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSagWanSnatRequest
     * @return DescribeSagWanSnatResponse
     */
    public DescribeSagWanSnatResponse describeSagWanSnat(DescribeSagWanSnatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagWanSnatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the Wi-Fi settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagWifiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSagWifiResponse
     */
    public DescribeSagWifiResponse describeSagWifiWithOptions(DescribeSagWifiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSagWifi"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSagWifiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the Wi-Fi settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSagWifiRequest
     * @return DescribeSagWifiResponse
     */
    public DescribeSagWifiResponse describeSagWifi(DescribeSagWifiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSagWifiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartAccessGatewayAttributeResponse
     */
    public DescribeSmartAccessGatewayAttributeResponse describeSmartAccessGatewayAttributeWithOptions(DescribeSmartAccessGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartAccessGatewayAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartAccessGatewayAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayAttributeRequest
     * @return DescribeSmartAccessGatewayAttributeResponse
     */
    public DescribeSmartAccessGatewayAttributeResponse describeSmartAccessGatewayAttribute(DescribeSmartAccessGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartAccessGatewayAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries client accounts added to a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayClientUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartAccessGatewayClientUsersResponse
     */
    public DescribeSmartAccessGatewayClientUsersResponse describeSmartAccessGatewayClientUsersWithOptions(DescribeSmartAccessGatewayClientUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMail)) {
            query.put("UserMail", request.userMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartAccessGatewayClientUsers"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartAccessGatewayClientUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries client accounts added to a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayClientUsersRequest
     * @return DescribeSmartAccessGatewayClientUsersResponse
     */
    public DescribeSmartAccessGatewayClientUsersResponse describeSmartAccessGatewayClientUsers(DescribeSmartAccessGatewayClientUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartAccessGatewayClientUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the high availability (HA) settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayHaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartAccessGatewayHaResponse
     */
    public DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHaWithOptions(DescribeSmartAccessGatewayHaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartAccessGatewayHa"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartAccessGatewayHaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the high availability (HA) settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSmartAccessGatewayHaRequest
     * @return DescribeSmartAccessGatewayHaResponse
     */
    public DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHa(DescribeSmartAccessGatewayHaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartAccessGatewayHaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSmartAccessGatewayVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartAccessGatewayVersionsResponse
     */
    public DescribeSmartAccessGatewayVersionsResponse describeSmartAccessGatewayVersionsWithOptions(DescribeSmartAccessGatewayVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartAccessGatewayVersions"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartAccessGatewayVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DescribeSmartAccessGatewayVersionsRequest
     * @return DescribeSmartAccessGatewayVersionsResponse
     */
    public DescribeSmartAccessGatewayVersionsResponse describeSmartAccessGatewayVersions(DescribeSmartAccessGatewayVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartAccessGatewayVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances.</p>
     * 
     * @param request DescribeSmartAccessGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartAccessGatewaysResponse
     */
    public DescribeSmartAccessGatewaysResponse describeSmartAccessGatewaysWithOptions(DescribeSmartAccessGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclIds)) {
            query.put("AclIds", request.aclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedCcnId)) {
            query.put("AssociatedCcnId", request.associatedCcnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedCcnName)) {
            query.put("AssociatedCcnName", request.associatedCcnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessState)) {
            query.put("BusinessState", request.businessState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canAssociateQos)) {
            query.put("CanAssociateQos", request.canAssociateQos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareType)) {
            query.put("HardwareType", request.hardwareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGIds)) {
            query.put("SmartAGIds", request.smartAGIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softwareVersion)) {
            query.put("SoftwareVersion", request.softwareVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unboundAclIds)) {
            query.put("UnboundAclIds", request.unboundAclIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionComparator)) {
            query.put("VersionComparator", request.versionComparator);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartAccessGateways"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartAccessGatewaysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances.</p>
     * 
     * @param request DescribeSmartAccessGatewaysRequest
     * @return DescribeSmartAccessGatewaysResponse
     */
    public DescribeSmartAccessGatewaysResponse describeSmartAccessGateways(DescribeSmartAccessGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartAccessGatewaysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query source network address translation (SNAT) entries associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSnatEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnatEntriesResponse
     */
    public DescribeSnatEntriesResponse describeSnatEntriesWithOptions(DescribeSnatEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnatEntries"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnatEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query source network address translation (SNAT) entries associated with a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DescribeSnatEntriesRequest
     * @return DescribeSnatEntriesResponse
     */
    public DescribeSnatEntriesResponse describeSnatEntries(DescribeSnatEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnatEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances that are not associated with a flow log in a specific region.</p>
     * 
     * @param request DescribeUnbindFlowLogSagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnbindFlowLogSagsResponse
     */
    public DescribeUnbindFlowLogSagsResponse describeUnbindFlowLogSagsWithOptions(DescribeUnbindFlowLogSagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeUnbindFlowLogSags"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnbindFlowLogSagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Smart Access Gateway (SAG) instances that are not associated with a flow log in a specific region.</p>
     * 
     * @param request DescribeUnbindFlowLogSagsRequest
     * @return DescribeUnbindFlowLogSagsResponse
     */
    public DescribeUnbindFlowLogSagsResponse describeUnbindFlowLogSags(DescribeUnbindFlowLogSagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnbindFlowLogSagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the amount of data transfer generated by each client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeUserFlowStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserFlowStatisticsResponse
     */
    public DescribeUserFlowStatisticsResponse describeUserFlowStatisticsWithOptions(DescribeUserFlowStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsDate)) {
            query.put("StatisticsDate", request.statisticsDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNames)) {
            query.put("UserNames", request.userNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserFlowStatistics"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserFlowStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the amount of data transfer generated by each client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeUserFlowStatisticsRequest
     * @return DescribeUserFlowStatisticsResponse
     */
    public DescribeUserFlowStatisticsResponse describeUserFlowStatistics(DescribeUserFlowStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserFlowStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of clients that are connected to Alibaba Cloud through a specific Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeUserOnlineClientStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserOnlineClientStatisticsResponse
     */
    public DescribeUserOnlineClientStatisticsResponse describeUserOnlineClientStatisticsWithOptions(DescribeUserOnlineClientStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNames)) {
            query.put("UserNames", request.userNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserOnlineClientStatistics"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserOnlineClientStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of clients that are connected to Alibaba Cloud through a specific Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DescribeUserOnlineClientStatisticsRequest
     * @return DescribeUserOnlineClientStatisticsResponse
     */
    public DescribeUserOnlineClientStatisticsResponse describeUserOnlineClientStatistics(DescribeUserOnlineClientStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserOnlineClientStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the connection information about a client based on the ID of the Smart Access Gateway (SAG) APP instance and username of the client account.</p>
     * 
     * @param request DescribeUserOnlineClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserOnlineClientsResponse
     */
    public DescribeUserOnlineClientsResponse describeUserOnlineClientsWithOptions(DescribeUserOnlineClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserOnlineClients"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserOnlineClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the connection information about a client based on the ID of the Smart Access Gateway (SAG) APP instance and username of the client account.</p>
     * 
     * @param request DescribeUserOnlineClientsRequest
     * @return DescribeUserOnlineClientsResponse
     */
    public DescribeUserOnlineClientsResponse describeUserOnlineClients(DescribeUserOnlineClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserOnlineClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables diagnostics for Smart Access Gateway (SAG) devices</p>
     * 
     * @param request DiagnoseSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiagnoseSmartAccessGatewayResponse
     */
    public DiagnoseSmartAccessGatewayResponse diagnoseSmartAccessGatewayWithOptions(DiagnoseSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiagnoseSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiagnoseSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables diagnostics for Smart Access Gateway (SAG) devices</p>
     * 
     * @param request DiagnoseSmartAccessGatewayRequest
     * @return DiagnoseSmartAccessGatewayResponse
     */
    public DiagnoseSmartAccessGatewayResponse diagnoseSmartAccessGateway(DiagnoseSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.diagnoseSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DisableSmartAGDpiMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSmartAGDpiMonitorResponse
     */
    public DisableSmartAGDpiMonitorResponse disableSmartAGDpiMonitorWithOptions(DisableSmartAGDpiMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSmartAGDpiMonitor"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSmartAGDpiMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DisableSmartAGDpiMonitorRequest
     * @return DisableSmartAGDpiMonitorResponse
     */
    public DisableSmartAGDpiMonitorResponse disableSmartAGDpiMonitor(DisableSmartAGDpiMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSmartAGDpiMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DisableSmartAccessGatewayUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSmartAccessGatewayUserResponse
     */
    public DisableSmartAccessGatewayUserResponse disableSmartAccessGatewayUserWithOptions(DisableSmartAccessGatewayUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSmartAccessGatewayUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSmartAccessGatewayUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DisableSmartAccessGatewayUserRequest
     * @return DisableSmartAccessGatewayUserResponse
     */
    public DisableSmartAccessGatewayUserResponse disableSmartAccessGatewayUser(DisableSmartAccessGatewayUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSmartAccessGatewayUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an access control list (ACL) from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DisassociateACLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateACLResponse
     */
    public DisassociateACLResponse disassociateACLWithOptions(DisassociateACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateACL"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateACLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an access control list (ACL) from a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DisassociateACLRequest
     * @return DisassociateACLResponse
     */
    public DisassociateACLResponse disassociateACL(DisassociateACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateACLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a flow log.</p>
     * 
     * @param request DisassociateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateFlowLogResponse
     */
    public DisassociateFlowLogResponse disassociateFlowLogWithOptions(DisassociateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateFlowLog"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateFlowLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a flow log.</p>
     * 
     * @param request DisassociateFlowLogRequest
     * @return DisassociateFlowLogResponse
     */
    public DisassociateFlowLogResponse disassociateFlowLog(DisassociateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a Quality of Service (QoS) policy.</p>
     * 
     * @param request DisassociateQosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateQosResponse
     */
    public DisassociateQosResponse disassociateQosWithOptions(DisassociateQosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateQos"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateQosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a Quality of Service (QoS) policy.</p>
     * 
     * @param request DisassociateQosRequest
     * @return DisassociateQosResponse
     */
    public DisassociateQosResponse disassociateQos(DisassociateQosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateQosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a diagnosis report for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DiscribeSmartAccessGatewayDiagnosisReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiscribeSmartAccessGatewayDiagnosisReportResponse
     */
    public DiscribeSmartAccessGatewayDiagnosisReportResponse discribeSmartAccessGatewayDiagnosisReportWithOptions(DiscribeSmartAccessGatewayDiagnosisReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiscribeSmartAccessGatewayDiagnosisReport"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiscribeSmartAccessGatewayDiagnosisReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a diagnosis report for a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request DiscribeSmartAccessGatewayDiagnosisReportRequest
     * @return DiscribeSmartAccessGatewayDiagnosisReportResponse
     */
    public DiscribeSmartAccessGatewayDiagnosisReportResponse discribeSmartAccessGatewayDiagnosisReport(DiscribeSmartAccessGatewayDiagnosisReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.discribeSmartAccessGatewayDiagnosisReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>DissociateSmartAGFromApplicationBandwidthPackage</strong>, you can set the <strong>SmartAGId</strong> parameter to specify an SAG instance, or set the <strong>SmartAGIdList</strong> to specify multiple SAG instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a bandwidth plan for application acceleration.</p>
     * 
     * @param request DissociateSmartAGFromApplicationBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateSmartAGFromApplicationBandwidthPackageResponse
     */
    public DissociateSmartAGFromApplicationBandwidthPackageResponse dissociateSmartAGFromApplicationBandwidthPackageWithOptions(DissociateSmartAGFromApplicationBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationBandwidthPackageId)) {
            query.put("ApplicationBandwidthPackageId", request.applicationBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGIdList)) {
            query.put("SmartAGIdList", request.smartAGIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateSmartAGFromApplicationBandwidthPackage"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateSmartAGFromApplicationBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>DissociateSmartAGFromApplicationBandwidthPackage</strong>, you can set the <strong>SmartAGId</strong> parameter to specify an SAG instance, or set the <strong>SmartAGIdList</strong> to specify multiple SAG instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a bandwidth plan for application acceleration.</p>
     * 
     * @param request DissociateSmartAGFromApplicationBandwidthPackageRequest
     * @return DissociateSmartAGFromApplicationBandwidthPackageResponse
     */
    public DissociateSmartAGFromApplicationBandwidthPackageResponse dissociateSmartAGFromApplicationBandwidthPackage(DissociateSmartAGFromApplicationBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateSmartAGFromApplicationBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades the bandwidth of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DowngradeSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeSmartAccessGatewayResponse
     */
    public DowngradeSmartAccessGatewayResponse downgradeSmartAccessGatewayWithOptions(DowngradeSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandWidthSpec)) {
            query.put("BandWidthSpec", request.bandWidthSpec);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradeSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades the bandwidth of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request DowngradeSmartAccessGatewayRequest
     * @return DowngradeSmartAccessGatewayResponse
     */
    public DowngradeSmartAccessGatewayResponse downgradeSmartAccessGateway(DowngradeSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradeSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Decreases the quota of client accounts that can be connected to a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DowngradeSmartAccessGatewaySoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeSmartAccessGatewaySoftwareResponse
     */
    public DowngradeSmartAccessGatewaySoftwareResponse downgradeSmartAccessGatewaySoftwareWithOptions(DowngradeSmartAccessGatewaySoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPlan)) {
            query.put("DataPlan", request.dataPlan);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            query.put("UserCount", request.userCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradeSmartAccessGatewaySoftware"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeSmartAccessGatewaySoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Decreases the quota of client accounts that can be connected to a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request DowngradeSmartAccessGatewaySoftwareRequest
     * @return DowngradeSmartAccessGatewaySoftwareResponse
     */
    public DowngradeSmartAccessGatewaySoftwareResponse downgradeSmartAccessGatewaySoftware(DowngradeSmartAccessGatewaySoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradeSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The DPI feature is enabled for the SAG instance. For more information, see <a href="https://help.aliyun.com/document_detail/196146.html">UpdateSmartAGDpiAttribute</a>.</p>
     * <ul>
     * <li>Log Service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Quick Start</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables monitoring based on the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request EnableSmartAGDpiMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSmartAGDpiMonitorResponse
     */
    public EnableSmartAGDpiMonitorResponse enableSmartAGDpiMonitorWithOptions(EnableSmartAGDpiMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            query.put("SlsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectName)) {
            query.put("SlsProjectName", request.slsProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSmartAGDpiMonitor"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSmartAGDpiMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The DPI feature is enabled for the SAG instance. For more information, see <a href="https://help.aliyun.com/document_detail/196146.html">UpdateSmartAGDpiAttribute</a>.</p>
     * <ul>
     * <li>Log Service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Quick Start</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables monitoring based on the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request EnableSmartAGDpiMonitorRequest
     * @return EnableSmartAGDpiMonitorResponse
     */
    public EnableSmartAGDpiMonitorResponse enableSmartAGDpiMonitor(EnableSmartAGDpiMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSmartAGDpiMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates a client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request EnableSmartAccessGatewayUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSmartAccessGatewayUserResponse
     */
    public EnableSmartAccessGatewayUserResponse enableSmartAccessGatewayUserWithOptions(EnableSmartAccessGatewayUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSmartAccessGatewayUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSmartAccessGatewayUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates a client account of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request EnableSmartAccessGatewayUserRequest
     * @return EnableSmartAccessGatewayUserResponse
     */
    public EnableSmartAccessGatewayUserResponse enableSmartAccessGatewayUser(EnableSmartAccessGatewayUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSmartAccessGatewayUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  An application-aware ACL is created. For more information, see <a href="https://help.aliyun.com/document_detail/114012.html">AddACLRule</a>.</p>
     * <ul>
     * <li>The application-aware ACL is applied to a Smart Access Gateway (SAG) instance. For more information, see <a href="https://help.aliyun.com/document_detail/114009.html">AssociateACL</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration errors of the deep packet inspection (DPI) feature in an access control list (ACL).</p>
     * 
     * @param request GetAclAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAclAttributeResponse
     */
    public GetAclAttributeResponse getAclAttributeWithOptions(GetAclAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAclAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAclAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  An application-aware ACL is created. For more information, see <a href="https://help.aliyun.com/document_detail/114012.html">AddACLRule</a>.</p>
     * <ul>
     * <li>The application-aware ACL is applied to a Smart Access Gateway (SAG) instance. For more information, see <a href="https://help.aliyun.com/document_detail/114009.html">AssociateACL</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration errors of the deep packet inspection (DPI) feature in an access control list (ACL).</p>
     * 
     * @param request GetAclAttributeRequest
     * @return GetAclAttributeResponse
     */
    public GetAclAttributeResponse getAclAttribute(GetAclAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAclAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the deep packet inspection (DPI) feature of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request GetAdvancedMonitorStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdvancedMonitorStateResponse
     */
    public GetAdvancedMonitorStateResponse getAdvancedMonitorStateWithOptions(GetAdvancedMonitorStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvancedMonitorState"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvancedMonitorStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the deep packet inspection (DPI) feature of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request GetAdvancedMonitorStateRequest
     * @return GetAdvancedMonitorStateResponse
     */
    public GetAdvancedMonitorStateResponse getAdvancedMonitorState(GetAdvancedMonitorStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdvancedMonitorStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Cloud Connect Network (CCN) instances that can be created within the current account in a region.</p>
     * 
     * @param request GetCloudConnectNetworkUseLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudConnectNetworkUseLimitResponse
     */
    public GetCloudConnectNetworkUseLimitResponse getCloudConnectNetworkUseLimitWithOptions(GetCloudConnectNetworkUseLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "GetCloudConnectNetworkUseLimit"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudConnectNetworkUseLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Cloud Connect Network (CCN) instances that can be created within the current account in a region.</p>
     * 
     * @param request GetCloudConnectNetworkUseLimitRequest
     * @return GetCloudConnectNetworkUseLimitResponse
     */
    public GetCloudConnectNetworkUseLimitResponse getCloudConnectNetworkUseLimit(GetCloudConnectNetworkUseLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudConnectNetworkUseLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a quality of service (QoS) policy.</p>
     * 
     * @param request GetQosAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQosAttributeResponse
     */
    public GetQosAttributeResponse getQosAttributeWithOptions(GetQosAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQosAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQosAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attributes of a quality of service (QoS) policy.</p>
     * 
     * @param request GetQosAttributeRequest
     * @return GetQosAttributeResponse
     */
    public GetQosAttributeResponse getQosAttribute(GetQosAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQosAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request GetSmartAGDpiAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmartAGDpiAttributeResponse
     */
    public GetSmartAGDpiAttributeResponse getSmartAGDpiAttributeWithOptions(GetSmartAGDpiAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmartAGDpiAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmartAGDpiAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request GetSmartAGDpiAttributeRequest
     * @return GetSmartAGDpiAttributeResponse
     */
    public GetSmartAGDpiAttributeResponse getSmartAGDpiAttribute(GetSmartAGDpiAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmartAGDpiAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Smart Access Gateway (SAG) instances that you can purchase.</p>
     * 
     * @param request GetSmartAccessGatewayUseLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmartAccessGatewayUseLimitResponse
     */
    public GetSmartAccessGatewayUseLimitResponse getSmartAccessGatewayUseLimitWithOptions(GetSmartAccessGatewayUseLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "GetSmartAccessGatewayUseLimit"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmartAccessGatewayUseLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Smart Access Gateway (SAG) instances that you can purchase.</p>
     * 
     * @param request GetSmartAccessGatewayUseLimitRequest
     * @return GetSmartAccessGatewayUseLimitResponse
     */
    public GetSmartAccessGatewayUseLimitResponse getSmartAccessGatewayUseLimit(GetSmartAccessGatewayUseLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmartAccessGatewayUseLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a Cloud Enterprise Network (CEN) instance to communicate with a Cloud Connect Network (CCN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request GrantInstanceToCbnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantInstanceToCbnResponse
     */
    public GrantInstanceToCbnResponse grantInstanceToCbnWithOptions(GrantInstanceToCbnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnInstanceId)) {
            query.put("CcnInstanceId", request.ccnInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenInstanceId)) {
            query.put("CenInstanceId", request.cenInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenUid)) {
            query.put("CenUid", request.cenUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTrafficService)) {
            query.put("GrantTrafficService", request.grantTrafficService);
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
            new TeaPair("action", "GrantInstanceToCbn"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToCbnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a Cloud Enterprise Network (CEN) instance to communicate with a Cloud Connect Network (CCN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request GrantInstanceToCbnRequest
     * @return GrantInstanceToCbnResponse
     */
    public GrantInstanceToCbnResponse grantInstanceToCbn(GrantInstanceToCbnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantInstanceToCbnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a Smart Access Gateway (SAG) instance to communicate with a Cloud Connect Network (CCN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request GrantSagInstanceToCcnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantSagInstanceToCcnResponse
     */
    public GrantSagInstanceToCcnResponse grantSagInstanceToCcnWithOptions(GrantSagInstanceToCcnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnInstanceId)) {
            query.put("CcnInstanceId", request.ccnInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ccnUid)) {
            query.put("CcnUid", request.ccnUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTrafficService)) {
            query.put("GrantTrafficService", request.grantTrafficService);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantSagInstanceToCcn"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantSagInstanceToCcnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a Smart Access Gateway (SAG) instance to communicate with a Cloud Connect Network (CCN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request GrantSagInstanceToCcnRequest
     * @return GrantSagInstanceToCcnResponse
     */
    public GrantSagInstanceToCcnResponse grantSagInstanceToCcn(GrantSagInstanceToCcnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantSagInstanceToCcnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Acquires permissions from a virtual border router (VBR) under another account.</p>
     * 
     * @param request GrantSagInstanceToVbrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantSagInstanceToVbrResponse
     */
    public GrantSagInstanceToVbrResponse grantSagInstanceToVbrWithOptions(GrantSagInstanceToVbrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrRegionId)) {
            query.put("VbrRegionId", request.vbrRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrUid)) {
            query.put("VbrUid", request.vbrUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantSagInstanceToVbr"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantSagInstanceToVbrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Acquires permissions from a virtual border router (VBR) under another account.</p>
     * 
     * @param request GrantSagInstanceToVbrRequest
     * @return GrantSagInstanceToVbrResponse
     */
    public GrantSagInstanceToVbrResponse grantSagInstanceToVbr(GrantSagInstanceToVbrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantSagInstanceToVbrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Closes a connection based on the Smart Access Gateway (SAG) app instance ID and username.</p>
     * 
     * @param request KickOutClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KickOutClientsResponse
     */
    public KickOutClientsResponse kickOutClientsWithOptions(KickOutClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KickOutClients"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KickOutClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Closes a connection based on the Smart Access Gateway (SAG) app instance ID and username.</p>
     * 
     * @param request KickOutClientsRequest
     * @return KickOutClientsResponse
     */
    public KickOutClientsResponse kickOutClients(KickOutClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kickOutClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network qualities of endpoints for Smart Access Gateway (SAG) instances.</p>
     * 
     * @param request ListAccessPointNetworkQualitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessPointNetworkQualitiesResponse
     */
    public ListAccessPointNetworkQualitiesResponse listAccessPointNetworkQualitiesWithOptions(ListAccessPointNetworkQualitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessPointNetworkQualities"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessPointNetworkQualitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network qualities of endpoints for Smart Access Gateway (SAG) instances.</p>
     * 
     * @param request ListAccessPointNetworkQualitiesRequest
     * @return ListAccessPointNetworkQualitiesResponse
     */
    public ListAccessPointNetworkQualitiesResponse listAccessPointNetworkQualities(ListAccessPointNetworkQualitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessPointNetworkQualitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An access point connects Smart Access Gateway (SAG) instances to Cloud Connect Network (CCN). Some regions may contain more than one access point. After an SAG instance is associated with a CCN instance, the system selects the nearest access point to establish connections to Alibaba Cloud. This topic describes how to query access points in a specific region. For more information about the areas that support CCN, see <a href="https://help.aliyun.com/document_detail/93667.html">Introduction to CCN</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access points in a region.</p>
     * 
     * @param request ListAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessPointsResponse
     */
    public ListAccessPointsResponse listAccessPointsWithOptions(ListAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessPoints"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>An access point connects Smart Access Gateway (SAG) instances to Cloud Connect Network (CCN). Some regions may contain more than one access point. After an SAG instance is associated with a CCN instance, the system selects the nearest access point to establish connections to Alibaba Cloud. This topic describes how to query access points in a specific region. For more information about the areas that support CCN, see <a href="https://help.aliyun.com/document_detail/93667.html">Introduction to CCN</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access points in a region.</p>
     * 
     * @param request ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    public ListAccessPointsResponse listAccessPoints(ListAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service addresses of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ListAvailableServiceAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableServiceAddressResponse
     */
    public ListAvailableServiceAddressResponse listAvailableServiceAddressWithOptions(ListAvailableServiceAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableServiceAddress"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableServiceAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service addresses of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ListAvailableServiceAddressRequest
     * @return ListAvailableServiceAddressResponse
     */
    public ListAvailableServiceAddressResponse listAvailableServiceAddress(ListAvailableServiceAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableServiceAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Background information</h2>
     * <p>If you have configured an application-aware access control list (ACL) or a quality of service (QoS) policy and associated it with a Smart Access Gateway (SAG) instance, you can call this operation to query whether the ACL rules or 5-tuples in the QoS policy are applied to the SAG instance. If settings are not applied to the SAG instance, the error information is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries configuration errors of the deep packet inspection (DPI) feature.</p>
     * 
     * @param request ListDpiConfigErrorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDpiConfigErrorResponse
     */
    public ListDpiConfigErrorResponse listDpiConfigErrorWithOptions(ListDpiConfigErrorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dpiConfigType)) {
            query.put("DpiConfigType", request.dpiConfigType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleInstanceId)) {
            query.put("RuleInstanceId", request.ruleInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDpiConfigError"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDpiConfigErrorResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Background information</h2>
     * <p>If you have configured an application-aware access control list (ACL) or a quality of service (QoS) policy and associated it with a Smart Access Gateway (SAG) instance, you can call this operation to query whether the ACL rules or 5-tuples in the QoS policy are applied to the SAG instance. If settings are not applied to the SAG instance, the error information is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries configuration errors of the deep packet inspection (DPI) feature.</p>
     * 
     * @param request ListDpiConfigErrorRequest
     * @return ListDpiConfigErrorResponse
     */
    public ListDpiConfigErrorResponse listDpiConfigError(ListDpiConfigErrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDpiConfigErrorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about application groups supported by Smart Access Gateway (SAG) instances in a specified region.</p>
     * 
     * @param request ListDpiGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDpiGroupsResponse
     */
    public ListDpiGroupsResponse listDpiGroupsWithOptions(ListDpiGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupIds)) {
            query.put("DpiGroupIds", request.dpiGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupNames)) {
            query.put("DpiGroupNames", request.dpiGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("action", "ListDpiGroups"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDpiGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about application groups supported by Smart Access Gateway (SAG) instances in a specified region.</p>
     * 
     * @param request ListDpiGroupsRequest
     * @return ListDpiGroupsResponse
     */
    public ListDpiGroupsResponse listDpiGroups(ListDpiGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDpiGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following features:</p>
     * <ul>
     * <li>Queries the information about all applications supported by the SAG instance in a specified region.</li>
     * <li>Queries the information about an application by application ID in a specified region.</li>
     * <li>Queries the information about an application by application name in a specified region.</li>
     * <li>Queries the information about an application group by group ID in a specified region.
     * If this is the first time you call this operation, we recommend that you query all applications supported by the SAG instance in the specified region by region ID. Then, you can query the information about a specified application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an application or an application group in a region, or about the applications supported by Smart Access Gateway (SAG) in a region.</p>
     * 
     * @param request ListDpiSignaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDpiSignaturesResponse
     */
    public ListDpiSignaturesResponse listDpiSignaturesWithOptions(ListDpiSignaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupId)) {
            query.put("DpiGroupId", request.dpiGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureIds)) {
            query.put("DpiSignatureIds", request.dpiSignatureIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureNames)) {
            query.put("DpiSignatureNames", request.dpiSignatureNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("action", "ListDpiSignatures"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDpiSignaturesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following features:</p>
     * <ul>
     * <li>Queries the information about all applications supported by the SAG instance in a specified region.</li>
     * <li>Queries the information about an application by application ID in a specified region.</li>
     * <li>Queries the information about an application by application name in a specified region.</li>
     * <li>Queries the information about an application group by group ID in a specified region.
     * If this is the first time you call this operation, we recommend that you query all applications supported by the SAG instance in the specified region by region ID. Then, you can query the information about a specified application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an application or an application group in a region, or about the applications supported by Smart Access Gateway (SAG) in a region.</p>
     * 
     * @param request ListDpiSignaturesRequest
     * @return ListDpiSignaturesResponse
     */
    public ListDpiSignaturesResponse listDpiSignatures(ListDpiSignaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDpiSignaturesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries enterprise codes.</p>
     * 
     * @param request ListEnterpriseCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseCodeResponse
     */
    public ListEnterpriseCodeResponse listEnterpriseCodeWithOptions(ListEnterpriseCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseCode)) {
            query.put("EnterpriseCode", request.enterpriseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
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
            new TeaPair("action", "ListEnterpriseCode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries enterprise codes.</p>
     * 
     * @param request ListEnterpriseCodeRequest
     * @return ListEnterpriseCodeResponse
     */
    public ListEnterpriseCodeResponse listEnterpriseCode(ListEnterpriseCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a probe task.</p>
     * 
     * @param request ListProbeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProbeTaskResponse
     */
    public ListProbeTaskResponse listProbeTaskWithOptions(ListProbeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTaskId)) {
            query.put("ProbeTaskId", request.probeTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagName)) {
            query.put("SagName", request.sagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProbeTask"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProbeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a probe task.</p>
     * 
     * @param request ListProbeTaskRequest
     * @return ListProbeTaskResponse
     */
    public ListProbeTaskResponse listProbeTask(ListProbeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProbeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries features that are not supported by a specified Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ListSmartAGApiUnsupportedFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmartAGApiUnsupportedFeatureResponse
     */
    public ListSmartAGApiUnsupportedFeatureResponse listSmartAGApiUnsupportedFeatureWithOptions(ListSmartAGApiUnsupportedFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openApiName)) {
            query.put("OpenApiName", request.openApiName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmartAGApiUnsupportedFeature"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmartAGApiUnsupportedFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries features that are not supported by a specified Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ListSmartAGApiUnsupportedFeatureRequest
     * @return ListSmartAGApiUnsupportedFeatureResponse
     */
    public ListSmartAGApiUnsupportedFeatureResponse listSmartAGApiUnsupportedFeature(ListSmartAGApiUnsupportedFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmartAGApiUnsupportedFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Smart Access Gateway (SAG) instances within specific access points in a specific region.</p>
     * 
     * @param request ListSmartAGByAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSmartAGByAccessPointResponse
     */
    public ListSmartAGByAccessPointResponse listSmartAGByAccessPointWithOptions(ListSmartAGByAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGStatus)) {
            query.put("SmartAGStatus", request.smartAGStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSmartAGByAccessPoint"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSmartAGByAccessPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Smart Access Gateway (SAG) instances within specific access points in a specific region.</p>
     * 
     * @param request ListSmartAGByAccessPointRequest
     * @return ListSmartAGByAccessPointResponse
     */
    public ListSmartAGByAccessPointResponse listSmartAGByAccessPoint(ListSmartAGByAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSmartAGByAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an access control list (ACL).</p>
     * 
     * @param request ModifyACLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyACLResponse
     */
    public ModifyACLResponse modifyACLWithOptions(ModifyACLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "ModifyACL"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyACLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of an access control list (ACL).</p>
     * 
     * @param request ModifyACLRequest
     * @return ModifyACLResponse
     */
    public ModifyACLResponse modifyACL(ModifyACLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyACLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an access control list (ACL) rule.</p>
     * 
     * @param request ModifyACLRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyACLRuleResponse
     */
    public ModifyACLRuleResponse modifyACLRuleWithOptions(ModifyACLRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclId)) {
            query.put("AclId", request.aclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acrId)) {
            query.put("AcrId", request.acrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCidr)) {
            query.put("DestCidr", request.destCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortRange)) {
            query.put("DestPortRange", request.destPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupIds)) {
            query.put("DpiGroupIds", request.dpiGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureIds)) {
            query.put("DpiSignatureIds", request.dpiSignatureIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyACLRule"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyACLRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an access control list (ACL) rule.</p>
     * 
     * @param request ModifyACLRuleRequest
     * @return ModifyACLRuleResponse
     */
    public ModifyACLRuleResponse modifyACLRule(ModifyACLRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyACLRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS settings of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request ModifyClientUserDNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClientUserDNSResponse
     */
    public ModifyClientUserDNSResponse modifyClientUserDNSWithOptions(ModifyClientUserDNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appDNS)) {
            query.put("AppDNS", request.appDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveredDNS)) {
            query.put("RecoveredDNS", request.recoveredDNS);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClientUserDNS"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClientUserDNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS settings of a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request ModifyClientUserDNSRequest
     * @return ModifyClientUserDNSResponse
     */
    public ModifyClientUserDNSResponse modifyClientUserDNS(ModifyClientUserDNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClientUserDNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request ModifyCloudConnectNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudConnectNetworkResponse
     */
    public ModifyCloudConnectNetworkResponse modifyCloudConnectNetworkWithOptions(ModifyCloudConnectNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interworkingStatus)) {
            query.put("InterworkingStatus", request.interworkingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "ModifyCloudConnectNetwork"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudConnectNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request ModifyCloudConnectNetworkRequest
     * @return ModifyCloudConnectNetworkResponse
     */
    public ModifyCloudConnectNetworkResponse modifyCloudConnectNetwork(ModifyCloudConnectNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudConnectNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the automatic upgrade policy of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifyDeviceAutoUpgradePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceAutoUpgradePolicyResponse
     */
    public ModifyDeviceAutoUpgradePolicyResponse modifyDeviceAutoUpgradePolicyWithOptions(ModifyDeviceAutoUpgradePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeviceAutoUpgradePolicy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceAutoUpgradePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the automatic upgrade policy of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifyDeviceAutoUpgradePolicyRequest
     * @return ModifyDeviceAutoUpgradePolicyResponse
     */
    public ModifyDeviceAutoUpgradePolicyResponse modifyDeviceAutoUpgradePolicy(ModifyDeviceAutoUpgradePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceAutoUpgradePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of a flow log.</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeAging)) {
            query.put("ActiveAging", request.activeAging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inactiveAging)) {
            query.put("InactiveAging", request.inactiveAging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            query.put("LogstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowServerIp)) {
            query.put("NetflowServerIp", request.netflowServerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowServerPort)) {
            query.put("NetflowServerPort", request.netflowServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netflowVersion)) {
            query.put("NetflowVersion", request.netflowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            query.put("OutputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            query.put("SlsRegionId", request.slsRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowLogAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowLogAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of a flow log.</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a health check.</p>
     * 
     * @param request ModifyHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHealthCheckResponse
     */
    public ModifyHealthCheckResponse modifyHealthCheckWithOptions(ModifyHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIpAddr)) {
            query.put("DstIpAddr", request.dstIpAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPort)) {
            query.put("DstPort", request.dstPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failCountThreshold)) {
            query.put("FailCountThreshold", request.failCountThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hcInstanceId)) {
            query.put("HcInstanceId", request.hcInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeCount)) {
            query.put("ProbeCount", request.probeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeInterval)) {
            query.put("ProbeInterval", request.probeInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTimeout)) {
            query.put("ProbeTimeout", request.probeTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rttFailThreshold)) {
            query.put("RttFailThreshold", request.rttFailThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rttThreshold)) {
            query.put("RttThreshold", request.rttThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIpAddr)) {
            query.put("SrcIpAddr", request.srcIpAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPort)) {
            query.put("SrcPort", request.srcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHealthCheck"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHealthCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a health check.</p>
     * 
     * @param request ModifyHealthCheckRequest
     * @return ModifyHealthCheckResponse
     */
    public ModifyHealthCheckResponse modifyHealthCheck(ModifyHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify a quality of service (QoS) policy, for example, its name.</p>
     * 
     * @param request ModifyQosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQosResponse
     */
    public ModifyQosResponse modifyQosWithOptions(ModifyQosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosDescription)) {
            query.put("QosDescription", request.qosDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosName)) {
            query.put("QosName", request.qosName);
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
            new TeaPair("action", "ModifyQos"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify a quality of service (QoS) policy, for example, its name.</p>
     * 
     * @param request ModifyQosRequest
     * @return ModifyQosResponse
     */
    public ModifyQosResponse modifyQos(ModifyQosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a traffic throttling rule in a quality of service (QoS) policy.</p>
     * 
     * @param request ModifyQosCarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQosCarResponse
     */
    public ModifyQosCarResponse modifyQosCarWithOptions(ModifyQosCarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitType)) {
            query.put("LimitType", request.limitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBandwidthAbs)) {
            query.put("MaxBandwidthAbs", request.maxBandwidthAbs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBandwidthPercent)) {
            query.put("MaxBandwidthPercent", request.maxBandwidthPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minBandwidthAbs)) {
            query.put("MinBandwidthAbs", request.minBandwidthAbs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minBandwidthPercent)) {
            query.put("MinBandwidthPercent", request.minBandwidthPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.percentSourceType)) {
            query.put("PercentSourceType", request.percentSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosCarId)) {
            query.put("QosCarId", request.qosCarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
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
            new TeaPair("action", "ModifyQosCar"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQosCarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a traffic throttling rule in a quality of service (QoS) policy.</p>
     * 
     * @param request ModifyQosCarRequest
     * @return ModifyQosCarResponse
     */
    public ModifyQosCarResponse modifyQosCar(ModifyQosCarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQosCarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a traffic classification rule of a quality of service (QoS) policy.</p>
     * 
     * @param request ModifyQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQosPolicyResponse
     */
    public ModifyQosPolicyResponse modifyQosPolicyWithOptions(ModifyQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCidr)) {
            query.put("DestCidr", request.destCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortRange)) {
            query.put("DestPortRange", request.destPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiGroupIds)) {
            query.put("DpiGroupIds", request.dpiGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiSignatureIds)) {
            query.put("DpiSignatureIds", request.dpiSignatureIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosId)) {
            query.put("QosId", request.qosId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosPolicyId)) {
            query.put("QosPolicyId", request.qosPolicyId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQosPolicy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQosPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a traffic classification rule of a quality of service (QoS) policy.</p>
     * 
     * @param request ModifyQosPolicyRequest
     * @return ModifyQosPolicyResponse
     */
    public ModifyQosPolicyResponse modifyQosPolicy(ModifyQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the route advertisement policy for a CIDR block.</p>
     * 
     * @param request ModifyRouteDistributionStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRouteDistributionStrategyResponse
     */
    public ModifyRouteDistributionStrategyResponse modifyRouteDistributionStrategyWithOptions(ModifyRouteDistributionStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCidrBlock)) {
            query.put("DestCidrBlock", request.destCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hcInstanceId)) {
            query.put("HcInstanceId", request.hcInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeDistribution)) {
            query.put("RouteDistribution", request.routeDistribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeSource)) {
            query.put("RouteSource", request.routeSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRouteDistributionStrategy"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRouteDistributionStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the route advertisement policy for a CIDR block.</p>
     * 
     * @param request ModifyRouteDistributionStrategyRequest
     * @return ModifyRouteDistributionStrategyResponse
     */
    public ModifyRouteDistributionStrategyResponse modifyRouteDistributionStrategy(ModifyRouteDistributionStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRouteDistributionStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password that is used to log on to a smart access gateway (SAG) device.</p>
     * 
     * @param request ModifySAGAdminPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySAGAdminPasswordResponse
     */
    public ModifySAGAdminPasswordResponse modifySAGAdminPasswordWithOptions(ModifySAGAdminPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySAGAdminPassword"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySAGAdminPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password that is used to log on to a smart access gateway (SAG) device.</p>
     * 
     * @param request ModifySAGAdminPasswordRequest
     * @return ModifySAGAdminPasswordResponse
     */
    public ModifySAGAdminPasswordResponse modifySAGAdminPassword(ModifySAGAdminPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySAGAdminPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the sub-interface information of an Express Connect circuit port.</p>
     * 
     * @param request ModifySagExpressConnectInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagExpressConnectInterfaceResponse
     */
    public ModifySagExpressConnectInterfaceResponse modifySagExpressConnectInterfaceWithOptions(ModifySagExpressConnectInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagExpressConnectInterface"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagExpressConnectInterfaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the sub-interface information of an Express Connect circuit port.</p>
     * 
     * @param request ModifySagExpressConnectInterfaceRequest
     * @return ModifySagExpressConnectInterfaceResponse
     */
    public ModifySagExpressConnectInterfaceResponse modifySagExpressConnectInterface(ModifySagExpressConnectInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagExpressConnectInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the routing protocol of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagGlobalRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagGlobalRouteProtocolResponse
     */
    public ModifySagGlobalRouteProtocolResponse modifySagGlobalRouteProtocolWithOptions(ModifySagGlobalRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeProtocol)) {
            query.put("RouteProtocol", request.routeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagGlobalRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagGlobalRouteProtocolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the routing protocol of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagGlobalRouteProtocolRequest
     * @return ModifySagGlobalRouteProtocolResponse
     */
    public ModifySagGlobalRouteProtocolResponse modifySagGlobalRouteProtocol(ModifySagGlobalRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagGlobalRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the high availability (HA) settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagHaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagHaResponse
     */
    public ModifySagHaResponse modifySagHaWithOptions(ModifySagHaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualIp)) {
            query.put("VirtualIp", request.virtualIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagHa"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagHaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the high availability (HA) settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagHaRequest
     * @return ModifySagHaResponse
     */
    public ModifySagHaResponse modifySagHa(ModifySagHaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagHaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the LAN port configurations of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagLanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagLanResponse
     */
    public ModifySagLanResponse modifySagLanWithOptions(ModifySagLanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endIp)) {
            query.put("EndIp", request.endIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lease)) {
            query.put("Lease", request.lease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startIp)) {
            query.put("StartIp", request.startIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagLan"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagLanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the LAN port configurations of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagLanRequest
     * @return ModifySagLanResponse
     */
    public ModifySagLanResponse modifySagLan(ModifySagLanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagLanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of a Smart Access Gateway (SAG) device port.</p>
     * 
     * @param request ModifySagManagementPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagManagementPortResponse
     */
    public ModifySagManagementPortResponse modifySagManagementPortWithOptions(ModifySagManagementPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gateway)) {
            query.put("Gateway", request.gateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagManagementPort"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagManagementPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the settings of a Smart Access Gateway (SAG) device port.</p>
     * 
     * @param request ModifySagManagementPortRequest
     * @return ModifySagManagementPortResponse
     */
    public ModifySagManagementPortResponse modifySagManagementPort(ModifySagManagementPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagManagementPortWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you modify the role of a port, the current role configurations of the port are deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the role of a port.</p>
     * 
     * @param request ModifySagPortRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagPortRoleResponse
     */
    public ModifySagPortRoleResponse modifySagPortRoleWithOptions(ModifySagPortRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagPortRole"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagPortRoleResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you modify the role of a port, the current role configurations of the port are deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the role of a port.</p>
     * 
     * @param request ModifySagPortRoleRequest
     * @return ModifySagPortRoleResponse
     */
    public ModifySagPortRoleResponse modifySagPortRole(ModifySagPortRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagPortRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the routing protocol of a port.</p>
     * 
     * @param request ModifySagPortRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagPortRouteProtocolResponse
     */
    public ModifySagPortRouteProtocolResponse modifySagPortRouteProtocolWithOptions(ModifySagPortRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteAs)) {
            query.put("RemoteAs", request.remoteAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteIp)) {
            query.put("RemoteIp", request.remoteIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeProtocol)) {
            query.put("RouteProtocol", request.routeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagPortRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagPortRouteProtocolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the routing protocol of a port.</p>
     * 
     * @param request ModifySagPortRouteProtocolRequest
     * @return ModifySagPortRouteProtocolResponse
     */
    public ModifySagPortRouteProtocolResponse modifySagPortRouteProtocol(ModifySagPortRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagPortRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remote access IP address of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagRemoteAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagRemoteAccessResponse
     */
    public ModifySagRemoteAccessResponse modifySagRemoteAccessWithOptions(ModifySagRemoteAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteAccessIp)) {
            query.put("RemoteAccessIp", request.remoteAccessIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagRemoteAccess"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagRemoteAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the remote access IP address of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagRemoteAccessRequest
     * @return ModifySagRemoteAccessResponse
     */
    public ModifySagRemoteAccessResponse modifySagRemoteAccess(ModifySagRemoteAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagRemoteAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the Border Gateway Protocol (BGP) settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagRouteProtocolBgpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagRouteProtocolBgpResponse
     */
    public ModifySagRouteProtocolBgpResponse modifySagRouteProtocolBgpWithOptions(ModifySagRouteProtocolBgpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.holdTime)) {
            query.put("HoldTime", request.holdTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAlive)) {
            query.put("KeepAlive", request.keepAlive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localAs)) {
            query.put("LocalAs", request.localAs);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routerId)) {
            query.put("RouterId", request.routerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagRouteProtocolBgp"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagRouteProtocolBgpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the Border Gateway Protocol (BGP) settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagRouteProtocolBgpRequest
     * @return ModifySagRouteProtocolBgpResponse
     */
    public ModifySagRouteProtocolBgpResponse modifySagRouteProtocolBgp(ModifySagRouteProtocolBgpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagRouteProtocolBgpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the Open Shortest Path First (OSPF) settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagRouteProtocolOspfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagRouteProtocolOspfResponse
     */
    public ModifySagRouteProtocolOspfResponse modifySagRouteProtocolOspfWithOptions(ModifySagRouteProtocolOspfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.areaId)) {
            query.put("AreaId", request.areaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadTime)) {
            query.put("DeadTime", request.deadTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.helloTime)) {
            query.put("HelloTime", request.helloTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5Key)) {
            query.put("Md5Key", request.md5Key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5KeyId)) {
            query.put("Md5KeyId", request.md5KeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routerId)) {
            query.put("RouterId", request.routerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagRouteProtocolOspf"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagRouteProtocolOspfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the Open Shortest Path First (OSPF) settings of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagRouteProtocolOspfRequest
     * @return ModifySagRouteProtocolOspfResponse
     */
    public ModifySagRouteProtocolOspfResponse modifySagRouteProtocolOspf(ModifySagRouteProtocolOspfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagRouteProtocolOspfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a static route.</p>
     * 
     * @param request ModifySagStaticRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagStaticRouteResponse
     */
    public ModifySagStaticRouteResponse modifySagStaticRouteWithOptions(ModifySagStaticRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            query.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            query.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagStaticRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagStaticRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a static route.</p>
     * 
     * @param request ModifySagStaticRouteRequest
     * @return ModifySagStaticRouteResponse
     */
    public ModifySagStaticRouteResponse modifySagStaticRoute(ModifySagStaticRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagStaticRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS servers used by a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagUserDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagUserDnsResponse
     */
    public ModifySagUserDnsResponse modifySagUserDnsWithOptions(ModifySagUserDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.masterDns)) {
            query.put("MasterDns", request.masterDns);
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

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDns)) {
            query.put("SlaveDns", request.slaveDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagUserDns"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagUserDnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS servers used by a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySagUserDnsRequest
     * @return ModifySagUserDnsResponse
     */
    public ModifySagUserDnsResponse modifySagUserDns(ModifySagUserDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagUserDnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you understand the functionality of a WAN port before you modify its settings. For more information, see <a href="https://help.aliyun.com/document_detail/163955.html">Configure a WAN port</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the WAN port configurations of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagWanResponse
     */
    public ModifySagWanResponse modifySagWanWithOptions(ModifySagWanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gateway)) {
            query.put("Gateway", request.gateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ISP)) {
            query.put("ISP", request.ISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            query.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagWan"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagWanResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you understand the functionality of a WAN port before you modify its settings. For more information, see <a href="https://help.aliyun.com/document_detail/163955.html">Configure a WAN port</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the WAN port configurations of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWanRequest
     * @return ModifySagWanResponse
     */
    public ModifySagWanResponse modifySagWan(ModifySagWanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagWanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the SNAT configurations of a WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWanSnatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagWanSnatResponse
     */
    public ModifySagWanSnatResponse modifySagWanSnatWithOptions(ModifySagWanSnatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snat)) {
            query.put("Snat", request.snat);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagWanSnat"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagWanSnatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the SNAT configurations of a WAN port of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWanSnatRequest
     * @return ModifySagWanSnatResponse
     */
    public ModifySagWanSnatResponse modifySagWanSnat(ModifySagWanSnatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagWanSnatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the Wi-Fi settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWifiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySagWifiResponse
     */
    public ModifySagWifiResponse modifySagWifiWithOptions(ModifySagWifiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptAlgorithm)) {
            query.put("EncryptAlgorithm", request.encryptAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAuth)) {
            query.put("IsAuth", request.isAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBroadcast)) {
            query.put("IsBroadcast", request.isBroadcast);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
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

        if (!com.aliyun.teautil.Common.isUnset(request.SSID)) {
            query.put("SSID", request.SSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySagWifi"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySagWifiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the Wi-Fi settings of a Smart Access Gateway (SAG) device.</p>
     * 
     * @param request ModifySagWifiRequest
     * @return ModifySagWifiResponse
     */
    public ModifySagWifiResponse modifySagWifi(ModifySagWifiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySagWifiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmartAccessGatewayResponse
     */
    public ModifySmartAccessGatewayResponse modifySmartAccessGatewayWithOptions(ModifySmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSoftwareConnectionAudit)) {
            query.put("EnableSoftwareConnectionAudit", request.enableSoftwareConnectionAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("Position", request.position);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routingStrategy)) {
            query.put("RoutingStrategy", request.routingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityLockThreshold)) {
            query.put("SecurityLockThreshold", request.securityLockThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySmartAccessGatewayRequest
     * @return ModifySmartAccessGatewayResponse
     */
    public ModifySmartAccessGatewayResponse modifySmartAccessGateway(ModifySmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth and email address of a client account on a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request ModifySmartAccessGatewayClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmartAccessGatewayClientUserResponse
     */
    public ModifySmartAccessGatewayClientUserResponse modifySmartAccessGatewayClientUserWithOptions(ModifySmartAccessGatewayClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmartAccessGatewayClientUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmartAccessGatewayClientUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth and email address of a client account on a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request ModifySmartAccessGatewayClientUserRequest
     * @return ModifySmartAccessGatewayClientUserResponse
     */
    public ModifySmartAccessGatewayClientUserResponse modifySmartAccessGatewayClientUser(ModifySmartAccessGatewayClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmartAccessGatewayClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySmartAccessGatewayUpBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmartAccessGatewayUpBandwidthResponse
     */
    public ModifySmartAccessGatewayUpBandwidthResponse modifySmartAccessGatewayUpBandwidthWithOptions(ModifySmartAccessGatewayUpBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upBandwidth4G)) {
            query.put("UpBandwidth4G", request.upBandwidth4G);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upBandwidthWan)) {
            query.put("UpBandwidthWan", request.upBandwidthWan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmartAccessGatewayUpBandwidth"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmartAccessGatewayUpBandwidthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request ModifySmartAccessGatewayUpBandwidthRequest
     * @return ModifySmartAccessGatewayUpBandwidthResponse
     */
    public ModifySmartAccessGatewayUpBandwidthResponse modifySmartAccessGatewayUpBandwidth(ModifySmartAccessGatewayUpBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmartAccessGatewayUpBandwidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves Smart Access Gateway (SAG) resources from one resource group to another.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves Smart Access Gateway (SAG) resources from one resource group to another.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to test the connectivity between an SAG instance and a specified access point.</p>
     * <ul>
     * <li>If the SAG instance can connect to the access point, the ID of the request is returned in this operation.</li>
     * <li>If the SAG instance cannot connect to the access point, the ID of the request and corresponding error messages are returned in this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Probes the network connectivity between a Smart Access Gateway (SAG) instance and an access point.</p>
     * 
     * @param request ProbeAccessPointNetworkQualityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProbeAccessPointNetworkQualityResponse
     */
    public ProbeAccessPointNetworkQualityResponse probeAccessPointNetworkQualityWithOptions(ProbeAccessPointNetworkQualityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointIds)) {
            query.put("AccessPointIds", request.accessPointIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProbeAccessPointNetworkQuality"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProbeAccessPointNetworkQualityResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to test the connectivity between an SAG instance and a specified access point.</p>
     * <ul>
     * <li>If the SAG instance can connect to the access point, the ID of the request is returned in this operation.</li>
     * <li>If the SAG instance cannot connect to the access point, the ID of the request and corresponding error messages are returned in this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Probes the network connectivity between a Smart Access Gateway (SAG) instance and an access point.</p>
     * 
     * @param request ProbeAccessPointNetworkQualityRequest
     * @return ProbeAccessPointNetworkQualityResponse
     */
    public ProbeAccessPointNetworkQualityResponse probeAccessPointNetworkQuality(ProbeAccessPointNetworkQualityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.probeAccessPointNetworkQualityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request RebootSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootSmartAccessGatewayResponse
     */
    public RebootSmartAccessGatewayResponse rebootSmartAccessGatewayWithOptions(RebootSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request RebootSmartAccessGatewayRequest
     * @return RebootSmartAccessGatewayResponse
     */
    public RebootSmartAccessGatewayResponse rebootSmartAccessGateway(RebootSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password that a client account uses to log on to the Smart Access Gateway (SAG) app.</p>
     * 
     * @param request ResetSmartAccessGatewayClientUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSmartAccessGatewayClientUserPasswordResponse
     */
    public ResetSmartAccessGatewayClientUserPasswordResponse resetSmartAccessGatewayClientUserPasswordWithOptions(ResetSmartAccessGatewayClientUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSmartAccessGatewayClientUserPassword"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSmartAccessGatewayClientUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password that a client account uses to log on to the Smart Access Gateway (SAG) app.</p>
     * 
     * @param request ResetSmartAccessGatewayClientUserPasswordRequest
     * @return ResetSmartAccessGatewayClientUserPasswordResponse
     */
    public ResetSmartAccessGatewayClientUserPasswordResponse resetSmartAccessGatewayClientUserPassword(ResetSmartAccessGatewayClientUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSmartAccessGatewayClientUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disallows a Cloud Enterprise Network (CEN) instance to communicate with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request RevokeInstanceFromCbnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceFromCbnResponse
     */
    public RevokeInstanceFromCbnResponse revokeInstanceFromCbnWithOptions(RevokeInstanceFromCbnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnInstanceId)) {
            query.put("CcnInstanceId", request.ccnInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenInstanceId)) {
            query.put("CenInstanceId", request.cenInstanceId);
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
            new TeaPair("action", "RevokeInstanceFromCbn"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromCbnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disallows a Cloud Enterprise Network (CEN) instance to communicate with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request RevokeInstanceFromCbnRequest
     * @return RevokeInstanceFromCbnResponse
     */
    public RevokeInstanceFromCbnResponse revokeInstanceFromCbn(RevokeInstanceFromCbnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromCbnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions that a Smart Access Gateway (SAG) instance has on virtual border routers (VBRs) in a different Alibaba Cloud account.</p>
     * 
     * @param request RevokeInstanceFromVbrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceFromVbrResponse
     */
    public RevokeInstanceFromVbrResponse revokeInstanceFromVbrWithOptions(RevokeInstanceFromVbrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeInstanceFromVbr"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromVbrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions that a Smart Access Gateway (SAG) instance has on virtual border routers (VBRs) in a different Alibaba Cloud account.</p>
     * 
     * @param request RevokeInstanceFromVbrRequest
     * @return RevokeInstanceFromVbrResponse
     */
    public RevokeInstanceFromVbrResponse revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromVbrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disallows a Smart Access Gateway (SAG) instance to communicate with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request RevokeSagInstanceFromCcnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeSagInstanceFromCcnResponse
     */
    public RevokeSagInstanceFromCcnResponse revokeSagInstanceFromCcnWithOptions(RevokeSagInstanceFromCcnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnInstanceId)) {
            query.put("CcnInstanceId", request.ccnInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSagInstanceFromCcn"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSagInstanceFromCcnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disallows a Smart Access Gateway (SAG) instance to communicate with a Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request RevokeSagInstanceFromCcnRequest
     * @return RevokeSagInstanceFromCcnResponse
     */
    public RevokeSagInstanceFromCcnResponse revokeSagInstanceFromCcn(RevokeSagInstanceFromCcnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSagInstanceFromCcnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call <code>RoamClientUser</code>, we recommend that you read and understand the features and usage notes of roaming. For more information, see <a href="https://help.aliyun.com/document_detail/177220.html">Configure roaming on clients</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables roaming for the SAG app to allow clients to access Alibaba Cloud across regions.</p>
     * 
     * @param request RoamClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RoamClientUserResponse
     */
    public RoamClientUserResponse roamClientUserWithOptions(RoamClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originRegionId)) {
            query.put("OriginRegionId", request.originRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originSmartAGId)) {
            query.put("OriginSmartAGId", request.originSmartAGId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetSmartAGId)) {
            query.put("TargetSmartAGId", request.targetSmartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RoamClientUser"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RoamClientUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call <code>RoamClientUser</code>, we recommend that you read and understand the features and usage notes of roaming. For more information, see <a href="https://help.aliyun.com/document_detail/177220.html">Configure roaming on clients</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables roaming for the SAG app to allow clients to access Alibaba Cloud across regions.</p>
     * 
     * @param request RoamClientUserRequest
     * @return RoamClientUserResponse
     */
    public RoamClientUserResponse roamClientUser(RoamClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.roamClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request SetAdvancedMonitorStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAdvancedMonitorStateResponse
     */
    public SetAdvancedMonitorStateResponse setAdvancedMonitorStateWithOptions(SetAdvancedMonitorStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAdvancedMonitorState"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAdvancedMonitorStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request SetAdvancedMonitorStateRequest
     * @return SetAdvancedMonitorStateResponse
     */
    public SetAdvancedMonitorStateResponse setAdvancedMonitorState(SetAdvancedMonitorStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAdvancedMonitorStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>SynchronizeSmartAGWebConfig</em>* is an asynchronous operation. After you send a request, the request ID is returned but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/164279.html">DescribeSAGDeviceInfo</a> operation to query the status of an SAG device.</p>
     * <ul>
     * <li>If an SAG device is in the <strong>Synchronizing</strong> state, the settings of the SAG device are being synchronized to the associated SAG instance.</li>
     * <li>If an SAG device is in the <strong>Synchronized</strong> state, the settings of the SAG device are synchronized to the associated SAG instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the settings of a Smart Access Gateway (SAG) device to the associated SAG instance.</p>
     * 
     * @param request SynchronizeSmartAGWebConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeSmartAGWebConfigResponse
     */
    public SynchronizeSmartAGWebConfigResponse synchronizeSmartAGWebConfigWithOptions(SynchronizeSmartAGWebConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGSn)) {
            query.put("SmartAGSn", request.smartAGSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeSmartAGWebConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeSmartAGWebConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>SynchronizeSmartAGWebConfig</em>* is an asynchronous operation. After you send a request, the request ID is returned but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/164279.html">DescribeSAGDeviceInfo</a> operation to query the status of an SAG device.</p>
     * <ul>
     * <li>If an SAG device is in the <strong>Synchronizing</strong> state, the settings of the SAG device are being synchronized to the associated SAG instance.</li>
     * <li>If an SAG device is in the <strong>Synchronized</strong> state, the settings of the SAG device are synchronized to the associated SAG instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the settings of a Smart Access Gateway (SAG) device to the associated SAG instance.</p>
     * 
     * @param request SynchronizeSmartAGWebConfigRequest
     * @return SynchronizeSmartAGWebConfigResponse
     */
    public SynchronizeSmartAGWebConfigResponse synchronizeSmartAGWebConfig(SynchronizeSmartAGWebConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeSmartAGWebConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) device from the associated SAG instance.</p>
     * 
     * @param request UnbindSerialNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindSerialNumberResponse
     */
    public UnbindSerialNumberResponse unbindSerialNumberWithOptions(UnbindSerialNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSerialNumber"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSerialNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) device from the associated SAG instance.</p>
     * 
     * @param request UnbindSerialNumberRequest
     * @return UnbindSerialNumberResponse
     */
    public UnbindSerialNumberResponse unbindSerialNumber(UnbindSerialNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSerialNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from the associated Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request UnbindSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindSmartAccessGatewayResponse
     */
    public UnbindSmartAccessGatewayResponse unbindSmartAccessGatewayWithOptions(UnbindSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccnId)) {
            query.put("CcnId", request.ccnId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGUid)) {
            query.put("SmartAGUid", request.smartAGUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from the associated Cloud Connect Network (CCN) instance.</p>
     * 
     * @param request UnbindSmartAccessGatewayRequest
     * @return UnbindSmartAccessGatewayResponse
     */
    public UnbindSmartAccessGatewayResponse unbindSmartAccessGateway(UnbindSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a virtual border router (VBR).</p>
     * 
     * @param request UnbindVbrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindVbrResponse
     */
    public UnbindVbrResponse unbindVbrWithOptions(UnbindVbrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGUid)) {
            query.put("SmartAGUid", request.smartAGUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrId)) {
            query.put("VbrId", request.vbrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrRegionId)) {
            query.put("VbrRegionId", request.vbrRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindVbr"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindVbrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a Smart Access Gateway (SAG) instance from a virtual border router (VBR).</p>
     * 
     * @param request UnbindVbrRequest
     * @return UnbindVbrResponse
     */
    public UnbindVbrResponse unbindVbr(UnbindVbrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindVbrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UnlockSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockSmartAccessGatewayResponse
     */
    public UnlockSmartAccessGatewayResponse unlockSmartAccessGatewayWithOptions(UnlockSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UnlockSmartAccessGatewayRequest
     * @return UnlockSmartAccessGatewayResponse
     */
    public UnlockSmartAccessGatewayResponse unlockSmartAccessGateway(UnlockSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified enterprise code.</p>
     * 
     * @param request UpdateEnterpriseCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnterpriseCodeResponse
     */
    public UpdateEnterpriseCodeResponse updateEnterpriseCodeWithOptions(UpdateEnterpriseCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseCode)) {
            query.put("EnterpriseCode", request.enterpriseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnterpriseCode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnterpriseCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified enterprise code.</p>
     * 
     * @param request UpdateEnterpriseCodeRequest
     * @return UpdateEnterpriseCodeResponse
     */
    public UpdateEnterpriseCodeResponse updateEnterpriseCode(UpdateEnterpriseCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnterpriseCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a probe task.</p>
     * 
     * @param request UpdateProbeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProbeTaskResponse
     */
    public UpdateProbeTaskResponse updateProbeTaskWithOptions(UpdateProbeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packetNumber)) {
            query.put("PacketNumber", request.packetNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTaskId)) {
            query.put("ProbeTaskId", request.probeTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probeTaskSourceAddress)) {
            query.put("ProbeTaskSourceAddress", request.probeTaskSourceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagId)) {
            query.put("SagId", request.sagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProbeTask"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProbeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a probe task.</p>
     * 
     * @param request UpdateProbeTaskRequest
     * @return UpdateProbeTaskResponse
     */
    public UpdateProbeTaskResponse updateProbeTask(UpdateProbeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProbeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/183876.html">ListAccessPoints</a> operation to view the switchable access points of the SAG instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the access point of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpdateSmartAGAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAGAccessPointResponse
     */
    public UpdateSmartAGAccessPointResponse updateSmartAGAccessPointWithOptions(UpdateSmartAGAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAGAccessPoint"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAGAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/183876.html">ListAccessPoints</a> operation to view the switchable access points of the SAG instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches the access point of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpdateSmartAGAccessPointRequest
     * @return UpdateSmartAGAccessPointResponse
     */
    public UpdateSmartAGAccessPointResponse updateSmartAGAccessPoint(UpdateSmartAGAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAGAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpdateSmartAGDpiAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAGDpiAttributeResponse
     */
    public UpdateSmartAGDpiAttributeResponse updateSmartAGDpiAttributeWithOptions(UpdateSmartAGDpiAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dpiEnabled)) {
            query.put("DpiEnabled", request.dpiEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAGDpiAttribute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAGDpiAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the deep packet inspection (DPI) feature for a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpdateSmartAGDpiAttributeRequest
     * @return UpdateSmartAGDpiAttributeResponse
     */
    public UpdateSmartAGDpiAttributeResponse updateSmartAGDpiAttribute(UpdateSmartAGDpiAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAGDpiAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) APP instance with another enterprise code.</p>
     * 
     * @param request UpdateSmartAGEnterpriseCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAGEnterpriseCodeResponse
     */
    public UpdateSmartAGEnterpriseCodeResponse updateSmartAGEnterpriseCodeWithOptions(UpdateSmartAGEnterpriseCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseCode)) {
            query.put("EnterpriseCode", request.enterpriseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAGEnterpriseCode"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAGEnterpriseCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Smart Access Gateway (SAG) APP instance with another enterprise code.</p>
     * 
     * @param request UpdateSmartAGEnterpriseCodeRequest
     * @return UpdateSmartAGEnterpriseCodeResponse
     */
    public UpdateSmartAGEnterpriseCodeResponse updateSmartAGEnterpriseCode(UpdateSmartAGEnterpriseCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAGEnterpriseCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you set a maximum bandwidth value for a client, take note of the following rules:</p>
     * <ul>
     * <li>The maximum bandwidth value of a client cannot exceed that of the SAG app instance to which the client belongs.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is less than 5 Mbit/s, for example, 4 Mbit/s, the maximum bandwidth value of each client that belongs to the SAG app instance is 4 Mbit/s by default.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is 5 Mbit/s or higher, the maximum bandwidth value of each client that belongs to the SAG app instance is 5 Mbit/s by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth for application acceleration of client accounts on Smart Access Gateway (SAG) app.</p>
     * 
     * @param request UpdateSmartAGUserAccelerateConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAGUserAccelerateConfigResponse
     */
    public UpdateSmartAGUserAccelerateConfigResponse updateSmartAGUserAccelerateConfigWithOptions(UpdateSmartAGUserAccelerateConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAGUserAccelerateConfig"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAGUserAccelerateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you set a maximum bandwidth value for a client, take note of the following rules:</p>
     * <ul>
     * <li>The maximum bandwidth value of a client cannot exceed that of the SAG app instance to which the client belongs.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is less than 5 Mbit/s, for example, 4 Mbit/s, the maximum bandwidth value of each client that belongs to the SAG app instance is 4 Mbit/s by default.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is 5 Mbit/s or higher, the maximum bandwidth value of each client that belongs to the SAG app instance is 5 Mbit/s by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth for application acceleration of client accounts on Smart Access Gateway (SAG) app.</p>
     * 
     * @param request UpdateSmartAGUserAccelerateConfigRequest
     * @return UpdateSmartAGUserAccelerateConfigResponse
     */
    public UpdateSmartAGUserAccelerateConfigResponse updateSmartAGUserAccelerateConfig(UpdateSmartAGUserAccelerateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAGUserAccelerateConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify passwords that are used to log on to only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the password that is used to log on to an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayAdminPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayAdminPasswordResponse
     */
    public UpdateSmartAccessGatewayAdminPasswordResponse updateSmartAccessGatewayAdminPasswordWithOptions(UpdateSmartAccessGatewayAdminPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayAdminPassword"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayAdminPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify passwords that are used to log on to only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the password that is used to log on to an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayAdminPasswordRequest
     * @return UpdateSmartAccessGatewayAdminPasswordResponse
     */
    public UpdateSmartAccessGatewayAdminPasswordResponse updateSmartAccessGatewayAdminPassword(UpdateSmartAccessGatewayAdminPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayAdminPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the BGP configurations of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayBgpRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayBgpRouteResponse
     */
    public UpdateSmartAccessGatewayBgpRouteResponse updateSmartAccessGatewayBgpRouteWithOptions(UpdateSmartAccessGatewayBgpRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdTime)) {
            query.put("HoldTime", request.holdTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAlive)) {
            query.put("KeepAlive", request.keepAlive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localAs)) {
            query.put("LocalAs", request.localAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routerId)) {
            query.put("RouterId", request.routerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayBgpRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayBgpRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the BGP configurations of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayBgpRouteRequest
     * @return UpdateSmartAccessGatewayBgpRouteResponse
     */
    public UpdateSmartAccessGatewayBgpRouteResponse updateSmartAccessGatewayBgpRoute(UpdateSmartAccessGatewayBgpRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayBgpRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the DNS configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayDnsResponse
     */
    public UpdateSmartAccessGatewayDnsResponse updateSmartAccessGatewayDnsWithOptions(UpdateSmartAccessGatewayDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterDns)) {
            query.put("MasterDns", request.masterDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDns)) {
            query.put("SlaveDns", request.slaveDns);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayDns"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayDnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the DNS configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayDnsRequest
     * @return UpdateSmartAccessGatewayDnsResponse
     */
    public UpdateSmartAccessGatewayDnsResponse updateSmartAccessGatewayDns(UpdateSmartAccessGatewayDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS forwarding configurations for a Smart Access Gateway (SAG) SCG5000 or SCG5000-5G instance. The version of the device must be 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayDnsForwardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayDnsForwardResponse
     */
    public UpdateSmartAccessGatewayDnsForwardResponse updateSmartAccessGatewayDnsForwardWithOptions(UpdateSmartAccessGatewayDnsForwardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterIp)) {
            query.put("MasterIp", request.masterIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortIndex)) {
            query.put("OutboundPortIndex", request.outboundPortIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortName)) {
            query.put("OutboundPortName", request.outboundPortName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundPortType)) {
            query.put("OutboundPortType", request.outboundPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveIp)) {
            query.put("SlaveIp", request.slaveIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayDnsForward"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayDnsForwardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the DNS forwarding configurations for a Smart Access Gateway (SAG) SCG5000 or SCG5000-5G instance. The version of the device must be 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayDnsForwardRequest
     * @return UpdateSmartAccessGatewayDnsForwardResponse
     */
    public UpdateSmartAccessGatewayDnsForwardResponse updateSmartAccessGatewayDnsForward(UpdateSmartAccessGatewayDnsForwardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayDnsForwardWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the global routing protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the global routing protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayGlobalRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayGlobalRouteProtocolResponse
     */
    public UpdateSmartAccessGatewayGlobalRouteProtocolResponse updateSmartAccessGatewayGlobalRouteProtocolWithOptions(UpdateSmartAccessGatewayGlobalRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeProtocol)) {
            query.put("RouteProtocol", request.routeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayGlobalRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayGlobalRouteProtocolResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the global routing protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the global routing protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayGlobalRouteProtocolRequest
     * @return UpdateSmartAccessGatewayGlobalRouteProtocolResponse
     */
    public UpdateSmartAccessGatewayGlobalRouteProtocolResponse updateSmartAccessGatewayGlobalRouteProtocol(UpdateSmartAccessGatewayGlobalRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayGlobalRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the OSPF configurations for an SAG SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayOspfRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayOspfRouteResponse
     */
    public UpdateSmartAccessGatewayOspfRouteResponse updateSmartAccessGatewayOspfRouteWithOptions(UpdateSmartAccessGatewayOspfRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.areaId)) {
            query.put("AreaId", request.areaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            query.put("AuthenticationType", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadTime)) {
            query.put("DeadTime", request.deadTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.helloTime)) {
            query.put("HelloTime", request.helloTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interfaceName)) {
            query.put("InterfaceName", request.interfaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5Key)) {
            query.put("Md5Key", request.md5Key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5KeyId)) {
            query.put("Md5KeyId", request.md5KeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networks)) {
            query.put("Networks", request.networks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ospfCost)) {
            query.put("OspfCost", request.ospfCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ospfNetworkType)) {
            query.put("OspfNetworkType", request.ospfNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redistributeProtocol)) {
            query.put("RedistributeProtocol", request.redistributeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routerId)) {
            query.put("RouterId", request.routerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayOspfRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayOspfRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the OSPF configurations for an SAG SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayOspfRouteRequest
     * @return UpdateSmartAccessGatewayOspfRouteResponse
     */
    public UpdateSmartAccessGatewayOspfRouteResponse updateSmartAccessGatewayOspfRoute(UpdateSmartAccessGatewayOspfRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayOspfRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the port protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the port protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayPortRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayPortRouteProtocolResponse
     */
    public UpdateSmartAccessGatewayPortRouteProtocolResponse updateSmartAccessGatewayPortRouteProtocolWithOptions(UpdateSmartAccessGatewayPortRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portName)) {
            query.put("PortName", request.portName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteAs)) {
            query.put("RemoteAs", request.remoteAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteIp)) {
            query.put("RemoteIp", request.remoteIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeProtocol)) {
            query.put("RouteProtocol", request.routeProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlan)) {
            query.put("Vlan", request.vlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayPortRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayPortRouteProtocolResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the port protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the port protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayPortRouteProtocolRequest
     * @return UpdateSmartAccessGatewayPortRouteProtocolResponse
     */
    public UpdateSmartAccessGatewayPortRouteProtocolResponse updateSmartAccessGatewayPortRouteProtocol(UpdateSmartAccessGatewayPortRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayPortRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a SAG device to a later version.</p>
     * 
     * @param request UpdateSmartAccessGatewayVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayVersionResponse
     */
    public UpdateSmartAccessGatewayVersionResponse updateSmartAccessGatewayVersionWithOptions(UpdateSmartAccessGatewayVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayVersion"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a SAG device to a later version.</p>
     * 
     * @param request UpdateSmartAccessGatewayVersionRequest
     * @return UpdateSmartAccessGatewayVersionResponse
     */
    public UpdateSmartAccessGatewayVersionResponse updateSmartAccessGatewayVersion(UpdateSmartAccessGatewayVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the SNAT configuration of the WAN port only on SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Source Network Address Translation (SNAT) configuration of the WAN port on an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayWanSnatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmartAccessGatewayWanSnatResponse
     */
    public UpdateSmartAccessGatewayWanSnatResponse updateSmartAccessGatewayWanSnatWithOptions(UpdateSmartAccessGatewayWanSnatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snat)) {
            query.put("Snat", request.snat);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmartAccessGatewayWanSnat"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmartAccessGatewayWanSnatResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the SNAT configuration of the WAN port only on SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Source Network Address Translation (SNAT) configuration of the WAN port on an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request UpdateSmartAccessGatewayWanSnatRequest
     * @return UpdateSmartAccessGatewayWanSnatResponse
     */
    public UpdateSmartAccessGatewayWanSnatResponse updateSmartAccessGatewayWanSnat(UpdateSmartAccessGatewayWanSnatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmartAccessGatewayWanSnatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Increases the bandwidth of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpgradeSmartAccessGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeSmartAccessGatewayResponse
     */
    public UpgradeSmartAccessGatewayResponse upgradeSmartAccessGatewayWithOptions(UpgradeSmartAccessGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandWidthSpec)) {
            query.put("BandWidthSpec", request.bandWidthSpec);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeSmartAccessGateway"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeSmartAccessGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Increases the bandwidth of a Smart Access Gateway (SAG) instance.</p>
     * 
     * @param request UpgradeSmartAccessGatewayRequest
     * @return UpgradeSmartAccessGatewayResponse
     */
    public UpgradeSmartAccessGatewayResponse upgradeSmartAccessGateway(UpgradeSmartAccessGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeSmartAccessGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Increases the maximum number of client accounts supported by a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request UpgradeSmartAccessGatewaySoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeSmartAccessGatewaySoftwareResponse
     */
    public UpgradeSmartAccessGatewaySoftwareResponse upgradeSmartAccessGatewaySoftwareWithOptions(UpgradeSmartAccessGatewaySoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPlan)) {
            query.put("DataPlan", request.dataPlan);
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

        if (!com.aliyun.teautil.Common.isUnset(request.smartAGId)) {
            query.put("SmartAGId", request.smartAGId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            query.put("UserCount", request.userCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeSmartAccessGatewaySoftware"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeSmartAccessGatewaySoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Increases the maximum number of client accounts supported by a Smart Access Gateway (SAG) app instance.</p>
     * 
     * @param request UpgradeSmartAccessGatewaySoftwareRequest
     * @return UpgradeSmartAccessGatewaySoftwareResponse
     */
    public UpgradeSmartAccessGatewaySoftwareResponse upgradeSmartAccessGatewaySoftware(UpgradeSmartAccessGatewaySoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeSmartAccessGatewaySoftwareWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the BGP configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayBgpRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayBgpRouteResponse
     */
    public ViewSmartAccessGatewayBgpRouteResponse viewSmartAccessGatewayBgpRouteWithOptions(ViewSmartAccessGatewayBgpRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayBgpRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayBgpRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the BGP configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayBgpRouteRequest
     * @return ViewSmartAccessGatewayBgpRouteResponse
     */
    public ViewSmartAccessGatewayBgpRouteResponse viewSmartAccessGatewayBgpRoute(ViewSmartAccessGatewayBgpRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayBgpRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the DNS configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayDnsResponse
     */
    public ViewSmartAccessGatewayDnsResponse viewSmartAccessGatewayDnsWithOptions(ViewSmartAccessGatewayDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayDns"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayDnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the DNS configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayDnsRequest
     * @return ViewSmartAccessGatewayDnsResponse
     */
    public ViewSmartAccessGatewayDnsResponse viewSmartAccessGatewayDns(ViewSmartAccessGatewayDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS forwarding list of a Smart Access Gateway (SAG) SCG5000 or SCG5000-5G instance. The version of the device must be 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayDnsForwardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayDnsForwardsResponse
     */
    public ViewSmartAccessGatewayDnsForwardsResponse viewSmartAccessGatewayDnsForwardsWithOptions(ViewSmartAccessGatewayDnsForwardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayDnsForwards"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayDnsForwardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS forwarding list of a Smart Access Gateway (SAG) SCG5000 or SCG5000-5G instance. The version of the device must be 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayDnsForwardsRequest
     * @return ViewSmartAccessGatewayDnsForwardsResponse
     */
    public ViewSmartAccessGatewayDnsForwardsResponse viewSmartAccessGatewayDnsForwards(ViewSmartAccessGatewayDnsForwardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayDnsForwardsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the global protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the global routing protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayGlobalRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayGlobalRouteProtocolResponse
     */
    public ViewSmartAccessGatewayGlobalRouteProtocolResponse viewSmartAccessGatewayGlobalRouteProtocolWithOptions(ViewSmartAccessGatewayGlobalRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayGlobalRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayGlobalRouteProtocolResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the global protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the global routing protocol of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayGlobalRouteProtocolRequest
     * @return ViewSmartAccessGatewayGlobalRouteProtocolResponse
     */
    public ViewSmartAccessGatewayGlobalRouteProtocolResponse viewSmartAccessGatewayGlobalRouteProtocol(ViewSmartAccessGatewayGlobalRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayGlobalRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later and have OSPF enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the BGP configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later and has OSPF enabled.</p>
     * 
     * @param request ViewSmartAccessGatewayOspfRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayOspfRouteResponse
     */
    public ViewSmartAccessGatewayOspfRouteResponse viewSmartAccessGatewayOspfRouteWithOptions(ViewSmartAccessGatewayOspfRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayOspfRoute"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayOspfRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later and have OSPF enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the BGP configuration of an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later and has OSPF enabled.</p>
     * 
     * @param request ViewSmartAccessGatewayOspfRouteRequest
     * @return ViewSmartAccessGatewayOspfRouteResponse
     */
    public ViewSmartAccessGatewayOspfRouteResponse viewSmartAccessGatewayOspfRoute(ViewSmartAccessGatewayOspfRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayOspfRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports that have routing protocols enabled on an SAG SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayPortRouteProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayPortRouteProtocolResponse
     */
    public ViewSmartAccessGatewayPortRouteProtocolResponse viewSmartAccessGatewayPortRouteProtocolWithOptions(ViewSmartAccessGatewayPortRouteProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayPortRouteProtocol"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayPortRouteProtocolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ports that have routing protocols enabled on an SAG SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayPortRouteProtocolRequest
     * @return ViewSmartAccessGatewayPortRouteProtocolResponse
     */
    public ViewSmartAccessGatewayPortRouteProtocolResponse viewSmartAccessGatewayPortRouteProtocol(ViewSmartAccessGatewayPortRouteProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayPortRouteProtocolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the route details only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the route details about an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayRoutesResponse
     */
    public ViewSmartAccessGatewayRoutesResponse viewSmartAccessGatewayRoutesWithOptions(ViewSmartAccessGatewayRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayRoutes"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayRoutesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the route details only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the route details about an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayRoutesRequest
     * @return ViewSmartAccessGatewayRoutesResponse
     */
    public ViewSmartAccessGatewayRoutesResponse viewSmartAccessGatewayRoutes(ViewSmartAccessGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayRoutesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the SNAT configuration of the WAN port only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Source Network Address Translation (SNAT) configuration of the WAN port on an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayWanSnatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewSmartAccessGatewayWanSnatResponse
     */
    public ViewSmartAccessGatewayWanSnatResponse viewSmartAccessGatewayWanSnatWithOptions(ViewSmartAccessGatewayWanSnatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccount)) {
            query.put("CrossAccount", request.crossAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagInsId)) {
            query.put("SagInsId", request.sagInsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sagSn)) {
            query.put("SagSn", request.sagSn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewSmartAccessGatewayWanSnat"),
            new TeaPair("version", "2018-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewSmartAccessGatewayWanSnatResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the SNAT configuration of the WAN port only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Source Network Address Translation (SNAT) configuration of the WAN port on an SCG5000 or SCG5000-5G device whose version is 3.4.2 or later.</p>
     * 
     * @param request ViewSmartAccessGatewayWanSnatRequest
     * @return ViewSmartAccessGatewayWanSnatResponse
     */
    public ViewSmartAccessGatewayWanSnatResponse viewSmartAccessGatewayWanSnat(ViewSmartAccessGatewayWanSnatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewSmartAccessGatewayWanSnatWithOptions(request, runtime);
    }
}
