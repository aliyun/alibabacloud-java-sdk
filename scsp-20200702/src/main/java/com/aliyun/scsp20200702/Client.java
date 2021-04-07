// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702;

import com.aliyun.tea.*;
import com.aliyun.scsp20200702.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "scsp-vpc.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("scsp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetUserTokenResponse getUserTokenWithOptions(GetUserTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserToken", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserTokenResponse());
    }

    public GetUserTokenResponse getUserToken(GetUserTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserTokenWithOptions(request, runtime);
    }

    public SearchTicketListResponse searchTicketListWithOptions(SearchTicketListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTicketList", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new SearchTicketListResponse());
    }

    public SearchTicketListResponse searchTicketList(SearchTicketListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketListWithOptions(request, runtime);
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeatWithOptions(SendHotlineHeartBeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendHotlineHeartBeat", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new SendHotlineHeartBeatResponse());
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendHotlineHeartBeatWithOptions(request, runtime);
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroupWithOptions(TransferCallToSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferCallToSkillGroup", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new TransferCallToSkillGroupResponse());
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroup(TransferCallToSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToSkillGroupWithOptions(request, runtime);
    }

    public EditEntityRouteResponse editEntityRouteWithOptions(EditEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditEntityRoute", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new EditEntityRouteResponse());
    }

    public EditEntityRouteResponse editEntityRoute(EditEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editEntityRouteWithOptions(request, runtime);
    }

    public GetTagListResponse getTagListWithOptions(GetTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTagList", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetTagListResponse());
    }

    public GetTagListResponse getTagList(GetTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTagListWithOptions(request, runtime);
    }

    public GetDeploymentArchiveResponse getDeploymentArchiveWithOptions(GetDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeploymentArchive", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeploymentArchiveResponse());
    }

    public GetDeploymentArchiveResponse getDeploymentArchive(GetDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeploymentArchiveWithOptions(request, runtime);
    }

    public UpdateTicketResponse updateTicketWithOptions(UpdateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTicket", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTicketResponse());
    }

    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTicketWithOptions(request, runtime);
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumberWithOptions(ListOutboundPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundPhoneNumber", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new ListOutboundPhoneNumberResponse());
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundPhoneNumberWithOptions(request, runtime);
    }

    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSkillGroup", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSkillGroupResponse());
    }

    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdWithOptions(ListAgentBySkillGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentBySkillGroupId", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new ListAgentBySkillGroupIdResponse());
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    public QueryHotlineSessionResponse queryHotlineSessionWithOptions(QueryHotlineSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHotlineSession", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryHotlineSessionResponse());
    }

    public QueryHotlineSessionResponse queryHotlineSession(QueryHotlineSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotlineSessionWithOptions(request, runtime);
    }

    public HangupThirdCallResponse hangupThirdCallWithOptions(HangupThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HangupThirdCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new HangupThirdCallResponse());
    }

    public HangupThirdCallResponse hangupThirdCall(HangupThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupThirdCallWithOptions(request, runtime);
    }

    public StartHotlineServiceResponse startHotlineServiceWithOptions(StartHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartHotlineService", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new StartHotlineServiceResponse());
    }

    public StartHotlineServiceResponse startHotlineService(StartHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startHotlineServiceWithOptions(request, runtime);
    }

    public StartCallV2Response startCallV2WithOptions(StartCallV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCallV2", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new StartCallV2Response());
    }

    public StartCallV2Response startCallV2(StartCallV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallV2WithOptions(request, runtime);
    }

    public EnableRoleResponse enableRoleWithOptions(EnableRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableRole", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new EnableRoleResponse());
    }

    public EnableRoleResponse enableRole(EnableRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableRoleWithOptions(request, runtime);
    }

    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgent", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentResponse());
    }

    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    public GetCMSIdByForeignIdResponse getCMSIdByForeignIdWithOptions(GetCMSIdByForeignIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCMSIdByForeignId", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetCMSIdByForeignIdResponse());
    }

    public GetCMSIdByForeignIdResponse getCMSIdByForeignId(GetCMSIdByForeignIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCMSIdByForeignIdWithOptions(request, runtime);
    }

    public TransferToThirdCallResponse transferToThirdCallWithOptions(TransferToThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferToThirdCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new TransferToThirdCallResponse());
    }

    public TransferToThirdCallResponse transferToThirdCall(TransferToThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferToThirdCallWithOptions(request, runtime);
    }

    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAgent", "2020-07-02", "HTTPS", "PUT", "AK", "json", req, runtime), new UpdateAgentResponse());
    }

    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    public GenerateWebSocketSignResponse generateWebSocketSignWithOptions(GenerateWebSocketSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateWebSocketSign", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateWebSocketSignResponse());
    }

    public GenerateWebSocketSignResponse generateWebSocketSign(GenerateWebSocketSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateWebSocketSignWithOptions(request, runtime);
    }

    public UpdateRingStatusResponse updateRingStatusWithOptions(UpdateRingStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRingStatus", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRingStatusResponse());
    }

    public UpdateRingStatusResponse updateRingStatus(UpdateRingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRingStatusWithOptions(request, runtime);
    }

    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAgent", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAgentResponse());
    }

    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    public DeleteEntityRouteResponse deleteEntityRouteWithOptions(DeleteEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEntityRoute", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEntityRouteResponse());
    }

    public DeleteEntityRouteResponse deleteEntityRoute(DeleteEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEntityRouteWithOptions(request, runtime);
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReportWithOptions(GetHotlineGroupDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineGroupDetailReport", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineGroupDetailReportResponse());
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineGroupDetailReportWithOptions(request, runtime);
    }

    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTicket", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTicketResponse());
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    public UpdateCustomerResponse updateCustomerWithOptions(UpdateCustomerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCustomer", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCustomerResponse());
    }

    public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomerWithOptions(request, runtime);
    }

    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AnswerCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new AnswerCallResponse());
    }

    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAgent", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAgentResponse());
    }

    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    public GetEntityTagRelationResponse getEntityTagRelationWithOptions(GetEntityTagRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEntityTagRelation", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetEntityTagRelationResponse());
    }

    public GetEntityTagRelationResponse getEntityTagRelation(GetEntityTagRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityTagRelationWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetailWithOptions(GetHotlineAgentDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentDetail", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetHotlineAgentDetailResponse());
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetail(GetHotlineAgentDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailWithOptions(request, runtime);
    }

    public SuspendHotlineServiceResponse suspendHotlineServiceWithOptions(SuspendHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendHotlineService", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendHotlineServiceResponse());
    }

    public SuspendHotlineServiceResponse suspendHotlineService(SuspendHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendHotlineServiceWithOptions(request, runtime);
    }

    public QueryDeploymentArchiveResponse queryDeploymentArchiveWithOptions(QueryDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDeploymentArchive", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new QueryDeploymentArchiveResponse());
    }

    public QueryDeploymentArchiveResponse queryDeploymentArchive(QueryDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeploymentArchiveWithOptions(request, runtime);
    }

    public GetOrgAccountResponse getOrgAccountWithOptions(GetOrgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOrgAccount", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetOrgAccountResponse());
    }

    public GetOrgAccountResponse getOrgAccount(GetOrgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrgAccountWithOptions(request, runtime);
    }

    public GetCallsPerDayResponse getCallsPerDayWithOptions(GetCallsPerDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCallsPerDay", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetCallsPerDayResponse());
    }

    public GetCallsPerDayResponse getCallsPerDay(GetCallsPerDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallsPerDayWithOptions(request, runtime);
    }

    public FetchCallResponse fetchCallWithOptions(FetchCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new FetchCallResponse());
    }

    public FetchCallResponse fetchCall(FetchCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchCallWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReportWithOptions(GetHotlineAgentDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentDetailReport", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineAgentDetailReportResponse());
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailReportWithOptions(request, runtime);
    }

    public QueryTicketCountResponse queryTicketCountWithOptions(QueryTicketCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTicketCount", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTicketCountResponse());
    }

    public QueryTicketCountResponse queryTicketCount(QueryTicketCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketCountWithOptions(request, runtime);
    }

    public AppMessagePushResponse appMessagePushWithOptions(AppMessagePushRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AppMessagePush", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new AppMessagePushResponse());
    }

    public AppMessagePushResponse appMessagePush(AppMessagePushRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appMessagePushWithOptions(request, runtime);
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatusWithOptions(GetHotlineAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentStatus", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineAgentStatusResponse());
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatus(GetHotlineAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentStatusWithOptions(request, runtime);
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumberWithOptions(GetHotlineWaitingNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineWaitingNumber", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetHotlineWaitingNumberResponse());
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineWaitingNumberWithOptions(request, runtime);
    }

    public StartCallResponse startCallWithOptions(StartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new StartCallResponse());
    }

    public StartCallResponse startCall(StartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallWithOptions(request, runtime);
    }

    public AssignTicketResponse assignTicketWithOptions(AssignTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignTicket", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new AssignTicketResponse());
    }

    public AssignTicketResponse assignTicket(AssignTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignTicketWithOptions(request, runtime);
    }

    public HangupCallResponse hangupCallWithOptions(HangupCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HangupCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new HangupCallResponse());
    }

    public HangupCallResponse hangupCall(HangupCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupCallWithOptions(request, runtime);
    }

    public GetOutbounNumListResponse getOutbounNumListWithOptions(GetOutbounNumListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOutbounNumList", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetOutbounNumListResponse());
    }

    public GetOutbounNumListResponse getOutbounNumList(GetOutbounNumListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOutbounNumListWithOptions(request, runtime);
    }

    public CreateTicketWithBizDataResponse createTicketWithBizDataWithOptions(CreateTicketWithBizDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("createTicketWithBizData", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTicketWithBizDataResponse());
    }

    public CreateTicketWithBizDataResponse createTicketWithBizData(CreateTicketWithBizDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketWithBizDataWithOptions(request, runtime);
    }

    public SearchTicketByPhoneResponse searchTicketByPhoneWithOptions(SearchTicketByPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTicketByPhone", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new SearchTicketByPhoneResponse());
    }

    public SearchTicketByPhoneResponse searchTicketByPhone(SearchTicketByPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketByPhoneWithOptions(request, runtime);
    }

    public CreateEntityIvrRouteResponse createEntityIvrRouteWithOptions(CreateEntityIvrRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEntityIvrRoute", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEntityIvrRouteResponse());
    }

    public CreateEntityIvrRouteResponse createEntityIvrRoute(CreateEntityIvrRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEntityIvrRouteWithOptions(request, runtime);
    }

    public CloseTicketResponse closeTicketWithOptions(CloseTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseTicket", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CloseTicketResponse());
    }

    public CloseTicketResponse closeTicket(CloseTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeTicketWithOptions(request, runtime);
    }

    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HoldCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new HoldCallResponse());
    }

    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    public QueryRingDetailListResponse queryRingDetailListWithOptions(QueryRingDetailListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryRingDetailListShrinkRequest request = new QueryRingDetailListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fromPhoneNumList)) {
            request.fromPhoneNumListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fromPhoneNumList, "FromPhoneNumList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toPhoneNumList)) {
            request.toPhoneNumListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toPhoneNumList, "ToPhoneNumList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRingDetailList", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRingDetailListResponse());
    }

    public QueryRingDetailListResponse queryRingDetailList(QueryRingDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRingDetailListWithOptions(request, runtime);
    }

    public SearchTicketByIdResponse searchTicketByIdWithOptions(SearchTicketByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTicketById", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new SearchTicketByIdResponse());
    }

    public SearchTicketByIdResponse searchTicketById(SearchTicketByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTicketByIdWithOptions(request, runtime);
    }

    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSkillGroup", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSkillGroupResponse());
    }

    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }

    public QueryServiceConfigResponse queryServiceConfigWithOptions(QueryServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryServiceConfig", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new QueryServiceConfigResponse());
    }

    public QueryServiceConfigResponse queryServiceConfig(QueryServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServiceConfigWithOptions(request, runtime);
    }

    public DisableRoleResponse disableRoleWithOptions(DisableRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableRole", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new DisableRoleResponse());
    }

    public DisableRoleResponse disableRole(DisableRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableRoleWithOptions(request, runtime);
    }

    public GetEntityRouteListResponse getEntityRouteListWithOptions(GetEntityRouteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEntityRouteList", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetEntityRouteListResponse());
    }

    public GetEntityRouteListResponse getEntityRouteList(GetEntityRouteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityRouteListWithOptions(request, runtime);
    }

    public GetAuthInfoResponse getAuthInfoWithOptions(GetAuthInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthInfo", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthInfoResponse());
    }

    public GetAuthInfoResponse getAuthInfo(GetAuthInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthInfoWithOptions(request, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRole", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchemaWithOptions(GetTicketTemplateSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTicketTemplateSchema", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetTicketTemplateSchemaResponse());
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchema(GetTicketTemplateSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketTemplateSchemaWithOptions(request, runtime);
    }

    public TransferCallToPhoneResponse transferCallToPhoneWithOptions(TransferCallToPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferCallToPhone", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new TransferCallToPhoneResponse());
    }

    public TransferCallToPhoneResponse transferCallToPhone(TransferCallToPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToPhoneWithOptions(request, runtime);
    }

    public QueryAppResValueResponse queryAppResValueWithOptions(QueryAppResValueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAppResValue", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new QueryAppResValueResponse());
    }

    public QueryAppResValueResponse queryAppResValue(QueryAppResValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppResValueWithOptions(request, runtime);
    }

    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySkillGroups", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySkillGroupsResponse());
    }

    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    public GetEntityRouteResponse getEntityRouteWithOptions(GetEntityRouteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEntityRoute", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetEntityRouteResponse());
    }

    public GetEntityRouteResponse getEntityRoute(GetEntityRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityRouteWithOptions(request, runtime);
    }

    public UpdateEntityTagRelationResponse updateEntityTagRelationWithOptions(UpdateEntityTagRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEntityTagRelation", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEntityTagRelationResponse());
    }

    public UpdateEntityTagRelationResponse updateEntityTagRelation(UpdateEntityTagRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEntityTagRelationWithOptions(request, runtime);
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterDataWithOptions(CreateOuterCallCenterDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOuterCallCenterData", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOuterCallCenterDataResponse());
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterData(CreateOuterCallCenterDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOuterCallCenterDataWithOptions(request, runtime);
    }

    public SendOutboundCommandResponse sendOutboundCommandWithOptions(SendOutboundCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendOutboundCommand", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new SendOutboundCommandResponse());
    }

    public SendOutboundCommandResponse sendOutboundCommand(SendOutboundCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendOutboundCommandWithOptions(request, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRole", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoleResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    public ListSkillGroupResponse listSkillGroupWithOptions(ListSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroup", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new ListSkillGroupResponse());
    }

    public ListSkillGroupResponse listSkillGroup(ListSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupWithOptions(request, runtime);
    }

    public GrantRolesResponse grantRolesWithOptions(GrantRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantRoles", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GrantRolesResponse());
    }

    public GrantRolesResponse grantRoles(GrantRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantRolesWithOptions(request, runtime);
    }

    public GetOuterCallCenterDataListResponse getOuterCallCenterDataListWithOptions(GetOuterCallCenterDataListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOuterCallCenterDataList", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new GetOuterCallCenterDataListResponse());
    }

    public GetOuterCallCenterDataListResponse getOuterCallCenterDataList(GetOuterCallCenterDataListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOuterCallCenterDataListWithOptions(request, runtime);
    }

    public CreateDeploymentTaskResponse createDeploymentTaskWithOptions(CreateDeploymentTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeploymentTaskShrinkRequest request = new CreateDeploymentTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appArchiveIds)) {
            request.appArchiveIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appArchiveIds, "AppArchiveIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeploymentTask", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new CreateDeploymentTaskResponse());
    }

    public CreateDeploymentTaskResponse createDeploymentTask(CreateDeploymentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentTaskWithOptions(request, runtime);
    }

    public QueryTicketsResponse queryTicketsWithOptions(QueryTicketsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTicketsShrinkRequest request = new QueryTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTickets", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTicketsResponse());
    }

    public QueryTicketsResponse queryTickets(QueryTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketsWithOptions(request, runtime);
    }

    public QueryTicketActionsResponse queryTicketActionsWithOptions(QueryTicketActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTicketActions", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTicketActionsResponse());
    }

    public QueryTicketActionsResponse queryTicketActions(QueryTicketActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketActionsWithOptions(request, runtime);
    }

    public TransferCallToAgentResponse transferCallToAgentWithOptions(TransferCallToAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferCallToAgent", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new TransferCallToAgentResponse());
    }

    public TransferCallToAgentResponse transferCallToAgent(TransferCallToAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToAgentWithOptions(request, runtime);
    }

    public FinishHotlineServiceResponse finishHotlineServiceWithOptions(FinishHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FinishHotlineService", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new FinishHotlineServiceResponse());
    }

    public FinishHotlineServiceResponse finishHotlineService(FinishHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishHotlineServiceWithOptions(request, runtime);
    }

    public JoinThirdCallResponse joinThirdCallWithOptions(JoinThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinThirdCall", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new JoinThirdCallResponse());
    }

    public JoinThirdCallResponse joinThirdCall(JoinThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinThirdCallWithOptions(request, runtime);
    }

    public CollectDeploymentArchiveResponse collectDeploymentArchiveWithOptions(CollectDeploymentArchiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CollectDeploymentArchive", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new CollectDeploymentArchiveResponse());
    }

    public CollectDeploymentArchiveResponse collectDeploymentArchive(CollectDeploymentArchiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.collectDeploymentArchiveWithOptions(request, runtime);
    }

    public ExecuteActivityResponse executeActivityWithOptions(ExecuteActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteActivity", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteActivityResponse());
    }

    public ExecuteActivityResponse executeActivity(ExecuteActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeActivityWithOptions(request, runtime);
    }

    public GetGrantedRoleIdsResponse getGrantedRoleIdsWithOptions(GetGrantedRoleIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGrantedRoleIds", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetGrantedRoleIdsResponse());
    }

    public GetGrantedRoleIdsResponse getGrantedRoleIds(GetGrantedRoleIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGrantedRoleIdsWithOptions(request, runtime);
    }

    public ListHotlineRecordResponse listHotlineRecordWithOptions(ListHotlineRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotlineRecord", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new ListHotlineRecordResponse());
    }

    public ListHotlineRecordResponse listHotlineRecord(ListHotlineRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineRecordWithOptions(request, runtime);
    }

    public GetAppArchivesResponse getAppArchivesWithOptions(GetAppArchivesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppArchives", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetAppArchivesResponse());
    }

    public GetAppArchivesResponse getAppArchives(GetAppArchivesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppArchivesWithOptions(request, runtime);
    }

    public GetNumLocationResponse getNumLocationWithOptions(GetNumLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNumLocation", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetNumLocationResponse());
    }

    public GetNumLocationResponse getNumLocation(GetNumLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNumLocationWithOptions(request, runtime);
    }

    public QueryAppResDiffResponse queryAppResDiffWithOptions(QueryAppResDiffRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAppResDiff", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new QueryAppResDiffResponse());
    }

    public QueryAppResDiffResponse queryAppResDiff(QueryAppResDiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppResDiffWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroup", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public CreateCustomerResponse createCustomerWithOptions(CreateCustomerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCustomer", "2020-07-02", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCustomerResponse());
    }

    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomerWithOptions(request, runtime);
    }

    public GetAppTasksResponse getAppTasksWithOptions(GetAppTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppTasks", "2020-07-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetAppTasksResponse());
    }

    public GetAppTasksResponse getAppTasks(GetAppTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppTasksWithOptions(request, runtime);
    }
}
