// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706;

import com.aliyun.tea.*;
import com.aliyun.support_plan20210706.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("support-plan", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembersWithOptions(ListEnterpriseDingtalkGroupCustomerMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnterpriseDingtalkGroupCustomerMembers", "2021-07-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnterpriseDingtalkGroupCustomerMembersResponse());
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnterpriseDingtalkGroupCustomerMembersWithOptions(request, runtime);
    }

    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroupsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListEnterpriseDingtalkGroups", "2021-07-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnterpriseDingtalkGroupsResponse());
    }

    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroups() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnterpriseDingtalkGroupsWithOptions(runtime);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(DeleteEnterpriseDingtalkGroupCustomerMemberRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest request = new DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mobiles)) {
            request.mobilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mobiles, "Mobiles", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEnterpriseDingtalkGroupCustomerMember", "2021-07-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEnterpriseDingtalkGroupCustomerMemberResponse());
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMember(DeleteEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMemberWithOptions(GetEnterpriseDingtalkGroupCustomerMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEnterpriseDingtalkGroupCustomerMember", "2021-07-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEnterpriseDingtalkGroupCustomerMemberResponse());
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMember(GetEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroupWithOptions(GetEnterpriseDingtalkGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEnterpriseDingtalkGroup", "2021-07-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEnterpriseDingtalkGroupResponse());
    }

    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroup(GetEnterpriseDingtalkGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEnterpriseDingtalkGroupWithOptions(request, runtime);
    }
}
