// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209;

import com.aliyun.tea.*;
import com.aliyun.yundun_bastionhost20191209.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yundun-bastionhost", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddHostsToGroupResponse addHostsToGroupWithOptions(AddHostsToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddHostsToGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddHostsToGroupResponse());
    }

    public AddHostsToGroupResponse addHostsToGroup(AddHostsToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addHostsToGroupWithOptions(request, runtime);
    }

    public AddUsersToGroupResponse addUsersToGroupWithOptions(AddUsersToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUsersToGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddUsersToGroupResponse());
    }

    public AddUsersToGroupResponse addUsersToGroup(AddUsersToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUsersToGroupWithOptions(request, runtime);
    }

    public AttachHostAccountsToUserResponse attachHostAccountsToUserWithOptions(AttachHostAccountsToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachHostAccountsToUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AttachHostAccountsToUserResponse());
    }

    public AttachHostAccountsToUserResponse attachHostAccountsToUser(AttachHostAccountsToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachHostAccountsToUserWithOptions(request, runtime);
    }

    public AttachHostAccountsToUserGroupResponse attachHostAccountsToUserGroupWithOptions(AttachHostAccountsToUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachHostAccountsToUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AttachHostAccountsToUserGroupResponse());
    }

    public AttachHostAccountsToUserGroupResponse attachHostAccountsToUserGroup(AttachHostAccountsToUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachHostAccountsToUserGroupWithOptions(request, runtime);
    }

    public AttachHostGroupAccountsToUserResponse attachHostGroupAccountsToUserWithOptions(AttachHostGroupAccountsToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachHostGroupAccountsToUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AttachHostGroupAccountsToUserResponse());
    }

    public AttachHostGroupAccountsToUserResponse attachHostGroupAccountsToUser(AttachHostGroupAccountsToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachHostGroupAccountsToUserWithOptions(request, runtime);
    }

    public AttachHostGroupAccountsToUserGroupResponse attachHostGroupAccountsToUserGroupWithOptions(AttachHostGroupAccountsToUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachHostGroupAccountsToUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new AttachHostGroupAccountsToUserGroupResponse());
    }

    public AttachHostGroupAccountsToUserGroupResponse attachHostGroupAccountsToUserGroup(AttachHostGroupAccountsToUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachHostGroupAccountsToUserGroupWithOptions(request, runtime);
    }

    public ConfigInstanceSecurityGroupsResponse configInstanceSecurityGroupsWithOptions(ConfigInstanceSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigInstanceSecurityGroups", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigInstanceSecurityGroupsResponse());
    }

    public ConfigInstanceSecurityGroupsResponse configInstanceSecurityGroups(ConfigInstanceSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configInstanceSecurityGroupsWithOptions(request, runtime);
    }

    public ConfigInstanceWhiteListResponse configInstanceWhiteListWithOptions(ConfigInstanceWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigInstanceWhiteList", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigInstanceWhiteListResponse());
    }

    public ConfigInstanceWhiteListResponse configInstanceWhiteList(ConfigInstanceWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configInstanceWhiteListWithOptions(request, runtime);
    }

    public CreateHostResponse createHostWithOptions(CreateHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHost", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHostResponse());
    }

    public CreateHostResponse createHost(CreateHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHostWithOptions(request, runtime);
    }

    public CreateHostAccountResponse createHostAccountWithOptions(CreateHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHostAccount", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHostAccountResponse());
    }

    public CreateHostAccountResponse createHostAccount(CreateHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHostAccountWithOptions(request, runtime);
    }

    public CreateHostGroupResponse createHostGroupWithOptions(CreateHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHostGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHostGroupResponse());
    }

    public CreateHostGroupResponse createHostGroup(CreateHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHostGroupWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserGroupResponse());
    }

    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    public DeleteHostResponse deleteHostWithOptions(DeleteHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHost", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHostResponse());
    }

    public DeleteHostResponse deleteHost(DeleteHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHostWithOptions(request, runtime);
    }

    public DeleteHostAccountResponse deleteHostAccountWithOptions(DeleteHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHostAccount", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHostAccountResponse());
    }

    public DeleteHostAccountResponse deleteHostAccount(DeleteHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHostAccountWithOptions(request, runtime);
    }

    public DeleteHostGroupResponse deleteHostGroupWithOptions(DeleteHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHostGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHostGroupResponse());
    }

    public DeleteHostGroupResponse deleteHostGroup(DeleteHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHostGroupWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserGroupResponse());
    }

    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAttribute", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DetachHostAccountsFromUserResponse detachHostAccountsFromUserWithOptions(DetachHostAccountsFromUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachHostAccountsFromUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DetachHostAccountsFromUserResponse());
    }

    public DetachHostAccountsFromUserResponse detachHostAccountsFromUser(DetachHostAccountsFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachHostAccountsFromUserWithOptions(request, runtime);
    }

    public DetachHostAccountsFromUserGroupResponse detachHostAccountsFromUserGroupWithOptions(DetachHostAccountsFromUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachHostAccountsFromUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DetachHostAccountsFromUserGroupResponse());
    }

    public DetachHostAccountsFromUserGroupResponse detachHostAccountsFromUserGroup(DetachHostAccountsFromUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachHostAccountsFromUserGroupWithOptions(request, runtime);
    }

    public DetachHostGroupAccountsFromUserResponse detachHostGroupAccountsFromUserWithOptions(DetachHostGroupAccountsFromUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachHostGroupAccountsFromUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DetachHostGroupAccountsFromUserResponse());
    }

    public DetachHostGroupAccountsFromUserResponse detachHostGroupAccountsFromUser(DetachHostGroupAccountsFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachHostGroupAccountsFromUserWithOptions(request, runtime);
    }

    public DetachHostGroupAccountsFromUserGroupResponse detachHostGroupAccountsFromUserGroupWithOptions(DetachHostGroupAccountsFromUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachHostGroupAccountsFromUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DetachHostGroupAccountsFromUserGroupResponse());
    }

    public DetachHostGroupAccountsFromUserGroupResponse detachHostGroupAccountsFromUserGroup(DetachHostGroupAccountsFromUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachHostGroupAccountsFromUserGroupWithOptions(request, runtime);
    }

    public DisableInstancePublicAccessResponse disableInstancePublicAccessWithOptions(DisableInstancePublicAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableInstancePublicAccess", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new DisableInstancePublicAccessResponse());
    }

    public DisableInstancePublicAccessResponse disableInstancePublicAccess(DisableInstancePublicAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableInstancePublicAccessWithOptions(request, runtime);
    }

    public EnableInstancePublicAccessResponse enableInstancePublicAccessWithOptions(EnableInstancePublicAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableInstancePublicAccess", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new EnableInstancePublicAccessResponse());
    }

    public EnableInstancePublicAccessResponse enableInstancePublicAccess(EnableInstancePublicAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableInstancePublicAccessWithOptions(request, runtime);
    }

    public GetHostResponse getHostWithOptions(GetHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHost", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetHostResponse());
    }

    public GetHostResponse getHost(GetHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHostWithOptions(request, runtime);
    }

    public GetHostAccountResponse getHostAccountWithOptions(GetHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHostAccount", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetHostAccountResponse());
    }

    public GetHostAccountResponse getHostAccount(GetHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHostAccountWithOptions(request, runtime);
    }

    public GetHostGroupResponse getHostGroupWithOptions(GetHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHostGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetHostGroupResponse());
    }

    public GetHostGroupResponse getHostGroup(GetHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHostGroupWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetUserGroupResponse getUserGroupWithOptions(GetUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserGroupResponse());
    }

    public GetUserGroupResponse getUserGroup(GetUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserGroupWithOptions(request, runtime);
    }

    public ListHostAccountsResponse listHostAccountsWithOptions(ListHostAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostAccounts", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostAccountsResponse());
    }

    public ListHostAccountsResponse listHostAccounts(ListHostAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostAccountsWithOptions(request, runtime);
    }

    public ListHostAccountsForUserResponse listHostAccountsForUserWithOptions(ListHostAccountsForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostAccountsForUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostAccountsForUserResponse());
    }

    public ListHostAccountsForUserResponse listHostAccountsForUser(ListHostAccountsForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostAccountsForUserWithOptions(request, runtime);
    }

    public ListHostAccountsForUserGroupResponse listHostAccountsForUserGroupWithOptions(ListHostAccountsForUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostAccountsForUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostAccountsForUserGroupResponse());
    }

    public ListHostAccountsForUserGroupResponse listHostAccountsForUserGroup(ListHostAccountsForUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostAccountsForUserGroupWithOptions(request, runtime);
    }

    public ListHostGroupAccountNamesForUserResponse listHostGroupAccountNamesForUserWithOptions(ListHostGroupAccountNamesForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostGroupAccountNamesForUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostGroupAccountNamesForUserResponse());
    }

    public ListHostGroupAccountNamesForUserResponse listHostGroupAccountNamesForUser(ListHostGroupAccountNamesForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostGroupAccountNamesForUserWithOptions(request, runtime);
    }

    public ListHostGroupAccountNamesForUserGroupResponse listHostGroupAccountNamesForUserGroupWithOptions(ListHostGroupAccountNamesForUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostGroupAccountNamesForUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostGroupAccountNamesForUserGroupResponse());
    }

    public ListHostGroupAccountNamesForUserGroupResponse listHostGroupAccountNamesForUserGroup(ListHostGroupAccountNamesForUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostGroupAccountNamesForUserGroupWithOptions(request, runtime);
    }

    public ListHostGroupsResponse listHostGroupsWithOptions(ListHostGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostGroups", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostGroupsResponse());
    }

    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostGroupsWithOptions(request, runtime);
    }

    public ListHostGroupsForUserResponse listHostGroupsForUserWithOptions(ListHostGroupsForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostGroupsForUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostGroupsForUserResponse());
    }

    public ListHostGroupsForUserResponse listHostGroupsForUser(ListHostGroupsForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostGroupsForUserWithOptions(request, runtime);
    }

    public ListHostGroupsForUserGroupResponse listHostGroupsForUserGroupWithOptions(ListHostGroupsForUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostGroupsForUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostGroupsForUserGroupResponse());
    }

    public ListHostGroupsForUserGroupResponse listHostGroupsForUserGroup(ListHostGroupsForUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostGroupsForUserGroupWithOptions(request, runtime);
    }

    public ListHostsResponse listHostsWithOptions(ListHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHosts", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostsResponse());
    }

    public ListHostsResponse listHosts(ListHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostsWithOptions(request, runtime);
    }

    public ListHostsForUserResponse listHostsForUserWithOptions(ListHostsForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostsForUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostsForUserResponse());
    }

    public ListHostsForUserResponse listHostsForUser(ListHostsForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostsForUserWithOptions(request, runtime);
    }

    public ListHostsForUserGroupResponse listHostsForUserGroupWithOptions(ListHostsForUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHostsForUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListHostsForUserGroupResponse());
    }

    public ListHostsForUserGroupResponse listHostsForUserGroup(ListHostsForUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHostsForUserGroupWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserGroups", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserGroupsResponse());
    }

    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public LockUsersResponse lockUsersWithOptions(LockUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockUsers", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new LockUsersResponse());
    }

    public LockUsersResponse lockUsers(LockUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockUsersWithOptions(request, runtime);
    }

    public ModifyHostResponse modifyHostWithOptions(ModifyHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHost", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostResponse());
    }

    public ModifyHostResponse modifyHost(ModifyHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostWithOptions(request, runtime);
    }

    public ModifyHostAccountResponse modifyHostAccountWithOptions(ModifyHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostAccount", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostAccountResponse());
    }

    public ModifyHostAccountResponse modifyHostAccount(ModifyHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostAccountWithOptions(request, runtime);
    }

    public ModifyHostGroupResponse modifyHostGroupWithOptions(ModifyHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostGroupResponse());
    }

    public ModifyHostGroupResponse modifyHostGroup(ModifyHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostGroupWithOptions(request, runtime);
    }

    public ModifyHostsActiveAddressTypeResponse modifyHostsActiveAddressTypeWithOptions(ModifyHostsActiveAddressTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostsActiveAddressType", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostsActiveAddressTypeResponse());
    }

    public ModifyHostsActiveAddressTypeResponse modifyHostsActiveAddressType(ModifyHostsActiveAddressTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostsActiveAddressTypeWithOptions(request, runtime);
    }

    public ModifyHostsPortResponse modifyHostsPortWithOptions(ModifyHostsPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostsPort", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostsPortResponse());
    }

    public ModifyHostsPortResponse modifyHostsPort(ModifyHostsPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostsPortWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttribute", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUser", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserResponse());
    }

    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    public ModifyUserGroupResponse modifyUserGroupWithOptions(ModifyUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserGroupResponse());
    }

    public ModifyUserGroupResponse modifyUserGroup(ModifyUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserGroupWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public RemoveHostsFromGroupResponse removeHostsFromGroupWithOptions(RemoveHostsFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveHostsFromGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveHostsFromGroupResponse());
    }

    public RemoveHostsFromGroupResponse removeHostsFromGroup(RemoveHostsFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeHostsFromGroupWithOptions(request, runtime);
    }

    public RemoveUsersFromGroupResponse removeUsersFromGroupWithOptions(RemoveUsersFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsersFromGroup", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersFromGroupResponse());
    }

    public RemoveUsersFromGroupResponse removeUsersFromGroup(RemoveUsersFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersFromGroupWithOptions(request, runtime);
    }

    public ResetHostAccountCredentialResponse resetHostAccountCredentialWithOptions(ResetHostAccountCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetHostAccountCredential", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new ResetHostAccountCredentialResponse());
    }

    public ResetHostAccountCredentialResponse resetHostAccountCredential(ResetHostAccountCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetHostAccountCredentialWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnlockUsersResponse unlockUsersWithOptions(UnlockUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockUsers", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockUsersResponse());
    }

    public UnlockUsersResponse unlockUsers(UnlockUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockUsersWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-12-09", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
