// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821;

import com.aliyun.tea.*;
import com.aliyun.rdc20180821.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rdc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddEnterpriseMemberResponse addEnterpriseMemberWithOptions(AddEnterpriseMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEnterpriseMember", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddEnterpriseMemberResponse());
    }

    public AddEnterpriseMemberResponse addEnterpriseMember(AddEnterpriseMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEnterpriseMemberWithOptions(request, runtime);
    }

    public AddRamMemberResponse addRamMemberWithOptions(AddRamMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRamMember", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new AddRamMemberResponse());
    }

    public AddRamMemberResponse addRamMember(AddRamMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRamMemberWithOptions(request, runtime);
    }

    public ApproveJoinCompanyResponse approveJoinCompanyWithOptions(ApproveJoinCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveJoinCompany", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveJoinCompanyResponse());
    }

    public ApproveJoinCompanyResponse approveJoinCompany(ApproveJoinCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveJoinCompanyWithOptions(request, runtime);
    }

    public CreateEnterpriseResponse createEnterpriseWithOptions(CreateEnterpriseRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEnterpriseShrinkRequest request = new CreateEnterpriseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.emails)) {
            request.emailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.emails, "Emails", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEnterprise", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEnterpriseResponse());
    }

    public CreateEnterpriseResponse createEnterprise(CreateEnterpriseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnterpriseWithOptions(request, runtime);
    }

    public CreateWorkitemResponse createWorkitemWithOptions(CreateWorkitemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWorkitem", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWorkitemResponse());
    }

    public CreateWorkitemResponse createWorkitem(CreateWorkitemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWorkitemWithOptions(request, runtime);
    }

    public GetBindedUserByDingIdResponse getBindedUserByDingIdWithOptions(GetBindedUserByDingIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBindedUserByDingId", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetBindedUserByDingIdResponse());
    }

    public GetBindedUserByDingIdResponse getBindedUserByDingId(GetBindedUserByDingIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBindedUserByDingIdWithOptions(request, runtime);
    }

    public GetChangeLogResponse getChangeLogWithOptions(GetChangeLogRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetChangeLogShrinkRequest request = new GetChangeLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targetIds)) {
            request.targetIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targetIds, "TargetIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetChangeLog", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetChangeLogResponse());
    }

    public GetChangeLogResponse getChangeLog(GetChangeLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChangeLogWithOptions(request, runtime);
    }

    public GetCustomFieldsByTemplateIdResponse getCustomFieldsByTemplateIdWithOptions(GetCustomFieldsByTemplateIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCustomFieldsByTemplateId", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetCustomFieldsByTemplateIdResponse());
    }

    public GetCustomFieldsByTemplateIdResponse getCustomFieldsByTemplateId(GetCustomFieldsByTemplateIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomFieldsByTemplateIdWithOptions(request, runtime);
    }

    public GetIssueByIdResponse getIssueByIdWithOptions(GetIssueByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIssueById", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetIssueByIdResponse());
    }

    public GetIssueByIdResponse getIssueById(GetIssueByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIssueByIdWithOptions(request, runtime);
    }

    public GetJoinCodeResponse getJoinCodeWithOptions(GetJoinCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJoinCode", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetJoinCodeResponse());
    }

    public GetJoinCodeResponse getJoinCode(GetJoinCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJoinCodeWithOptions(request, runtime);
    }

    public GetProjectMembersResponse getProjectMembersWithOptions(GetProjectMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProjectMembers", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetProjectMembersResponse());
    }

    public GetProjectMembersResponse getProjectMembers(GetProjectMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectMembersWithOptions(request, runtime);
    }

    public GetUserByAliyunPkResponse getUserByAliyunPkWithOptions(GetUserByAliyunPkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserByAliyunPk", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetUserByAliyunPkResponse());
    }

    public GetUserByAliyunPkResponse getUserByAliyunPk(GetUserByAliyunPkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserByAliyunPkWithOptions(request, runtime);
    }

    public GetWorkitemByIdResponse getWorkitemByIdWithOptions(GetWorkitemByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWorkitemById", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new GetWorkitemByIdResponse());
    }

    public GetWorkitemByIdResponse getWorkitemById(GetWorkitemByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkitemByIdWithOptions(request, runtime);
    }

    public JoinCompanyResponse joinCompanyWithOptions(JoinCompanyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinCompany", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new JoinCompanyResponse());
    }

    public JoinCompanyResponse joinCompany(JoinCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinCompanyWithOptions(request, runtime);
    }

    public SearchProjectsByRegionResponse searchProjectsByRegionWithOptions(SearchProjectsByRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchProjectsByRegion", "2018-08-21", "HTTPS", "GET", "AK", "json", req, runtime), new SearchProjectsByRegionResponse());
    }

    public SearchProjectsByRegionResponse searchProjectsByRegion(SearchProjectsByRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchProjectsByRegionWithOptions(request, runtime);
    }

    public SearchTestCaseResponse searchTestCaseWithOptions(SearchTestCaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTestCase", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTestCaseResponse());
    }

    public SearchTestCaseResponse searchTestCase(SearchTestCaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTestCaseWithOptions(request, runtime);
    }

    public SearchWorkitemResponse searchWorkitemWithOptions(SearchWorkitemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchWorkitem", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new SearchWorkitemResponse());
    }

    public SearchWorkitemResponse searchWorkitem(SearchWorkitemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchWorkitemWithOptions(request, runtime);
    }

    public SearchWorkitemWithTotalCountResponse searchWorkitemWithTotalCountWithOptions(SearchWorkitemWithTotalCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchWorkitemWithTotalCount", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new SearchWorkitemWithTotalCountResponse());
    }

    public SearchWorkitemWithTotalCountResponse searchWorkitemWithTotalCount(SearchWorkitemWithTotalCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchWorkitemWithTotalCountWithOptions(request, runtime);
    }

    public SyncUserToRdcResponse syncUserToRdcWithOptions(SyncUserToRdcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncUserToRdc", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new SyncUserToRdcResponse());
    }

    public SyncUserToRdcResponse syncUserToRdc(SyncUserToRdcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncUserToRdcWithOptions(request, runtime);
    }

    public UpdateWorkitemResponse updateWorkitemWithOptions(UpdateWorkitemRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkitemShrinkRequest request = new UpdateWorkitemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cfList)) {
            request.cfListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cfList, "CfList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cfs)) {
            request.cfsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cfs, "Cfs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWorkitem", "2018-08-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWorkitemResponse());
    }

    public UpdateWorkitemResponse updateWorkitem(UpdateWorkitemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWorkitemWithOptions(request, runtime);
    }
}
