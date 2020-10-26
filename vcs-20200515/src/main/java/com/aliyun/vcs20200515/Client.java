// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515;

import com.aliyun.tea.*;
import com.aliyun.vcs20200515.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vcs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public UnsubscribeDeviceEventResponse unsubscribeDeviceEventWithOptions(UnsubscribeDeviceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnsubscribeDeviceEvent", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UnsubscribeDeviceEventResponse());
    }

    public UnsubscribeDeviceEventResponse unsubscribeDeviceEvent(UnsubscribeDeviceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeDeviceEventWithOptions(request, runtime);
    }

    public ListSubscribeDeviceResponse listSubscribeDeviceWithOptions(ListSubscribeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSubscribeDevice", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListSubscribeDeviceResponse());
    }

    public ListSubscribeDeviceResponse listSubscribeDevice(ListSubscribeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubscribeDeviceWithOptions(request, runtime);
    }

    public SubscribeDeviceEventResponse subscribeDeviceEventWithOptions(SubscribeDeviceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscribeDeviceEvent", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SubscribeDeviceEventResponse());
    }

    public SubscribeDeviceEventResponse subscribeDeviceEvent(SubscribeDeviceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeDeviceEventWithOptions(request, runtime);
    }

    public SubscribeSpaceEventResponse subscribeSpaceEventWithOptions(SubscribeSpaceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscribeSpaceEvent", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SubscribeSpaceEventResponse());
    }

    public SubscribeSpaceEventResponse subscribeSpaceEvent(SubscribeSpaceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeSpaceEventWithOptions(request, runtime);
    }

    public UnsubscribeSpaceEventResponse unsubscribeSpaceEventWithOptions(UnsubscribeSpaceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnsubscribeSpaceEvent", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UnsubscribeSpaceEventResponse());
    }

    public UnsubscribeSpaceEventResponse unsubscribeSpaceEvent(UnsubscribeSpaceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeSpaceEventWithOptions(request, runtime);
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetailsWithOptions(ListPersonTraceDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonTraceDetails", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonTraceDetailsResponse());
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetails(ListPersonTraceDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTraceDetailsWithOptions(request, runtime);
    }

    public GetMonitorListResponse getMonitorListWithOptions(GetMonitorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMonitorList", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetMonitorListResponse());
    }

    public GetMonitorListResponse getMonitorList(GetMonitorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonitorListWithOptions(request, runtime);
    }

    public ListDeviceGroupsResponse listDeviceGroupsWithOptions(ListDeviceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeviceGroups", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListDeviceGroupsResponse());
    }

    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupsWithOptions(request, runtime);
    }

    public SearchObjectResponse searchObjectWithOptions(SearchObjectRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        SearchObjectShrinkRequest request = new SearchObjectShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.deviceList)) {
            request.deviceListShrink = com.aliyun.teautil.Common.toJSONString(tmp.deviceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.conditions)) {
            request.conditionsShrink = com.aliyun.teautil.Common.toJSONString(tmp.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.imagePath)) {
            request.imagePathShrink = com.aliyun.teautil.Common.toJSONString(tmp.imagePath);
        }

        return TeaModel.toModel(this.doRequest("SearchObject", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SearchObjectResponse());
    }

    public SearchObjectResponse searchObject(SearchObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchObjectWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDevices", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public GetProfileListResponse getProfileListWithOptions(GetProfileListRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        GetProfileListShrinkRequest request = new GetProfileListShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.personIdList)) {
            request.personIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.personIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.profileIdList)) {
            request.profileIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.profileIdList);
        }

        return TeaModel.toModel(this.doRequest("GetProfileList", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetProfileListResponse());
    }

    public GetProfileListResponse getProfileList(GetProfileListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProfileListWithOptions(request, runtime);
    }

    public GetProfileDetailResponse getProfileDetailWithOptions(GetProfileDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetProfileDetail", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetProfileDetailResponse());
    }

    public GetProfileDetailResponse getProfileDetail(GetProfileDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProfileDetailWithOptions(request, runtime);
    }

    public DeleteProfileCatalogResponse deleteProfileCatalogWithOptions(DeleteProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProfileCatalog", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProfileCatalogResponse());
    }

    public DeleteProfileCatalogResponse deleteProfileCatalog(DeleteProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProfileCatalogWithOptions(request, runtime);
    }

    public BindPersonResponse bindPersonWithOptions(BindPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindPerson", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new BindPersonResponse());
    }

    public BindPersonResponse bindPerson(BindPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPersonWithOptions(request, runtime);
    }

    public UpdateProfileResponse updateProfileWithOptions(UpdateProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProfile", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProfileResponse());
    }

    public UpdateProfileResponse updateProfile(UpdateProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProfileWithOptions(request, runtime);
    }

    public UnbindPersonResponse unbindPersonWithOptions(UnbindPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindPerson", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UnbindPersonResponse());
    }

    public UnbindPersonResponse unbindPerson(UnbindPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPersonWithOptions(request, runtime);
    }

    public AddProfileResponse addProfileWithOptions(AddProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddProfile", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new AddProfileResponse());
    }

    public AddProfileResponse addProfile(AddProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProfileWithOptions(request, runtime);
    }

    public UpdateProfileCatalogResponse updateProfileCatalogWithOptions(UpdateProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProfileCatalog", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProfileCatalogResponse());
    }

    public UpdateProfileCatalogResponse updateProfileCatalog(UpdateProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProfileCatalogWithOptions(request, runtime);
    }

    public AddProfileCatalogResponse addProfileCatalogWithOptions(AddProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddProfileCatalog", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new AddProfileCatalogResponse());
    }

    public AddProfileCatalogResponse addProfileCatalog(AddProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProfileCatalogWithOptions(request, runtime);
    }

    public GetCatalogListResponse getCatalogListWithOptions(GetCatalogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCatalogList", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetCatalogListResponse());
    }

    public GetCatalogListResponse getCatalogList(GetCatalogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCatalogListWithOptions(request, runtime);
    }

    public DeleteProfileResponse deleteProfileWithOptions(DeleteProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProfile", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProfileResponse());
    }

    public DeleteProfileResponse deleteProfile(DeleteProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProfileWithOptions(request, runtime);
    }

    public UnbindCorpGroupResponse unbindCorpGroupWithOptions(UnbindCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindCorpGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UnbindCorpGroupResponse());
    }

    public UnbindCorpGroupResponse unbindCorpGroup(UnbindCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindCorpGroupWithOptions(request, runtime);
    }

    public BindCorpGroupResponse bindCorpGroupWithOptions(BindCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindCorpGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new BindCorpGroupResponse());
    }

    public BindCorpGroupResponse bindCorpGroup(BindCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindCorpGroupWithOptions(request, runtime);
    }

    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUserGroups", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListUserGroupsResponse());
    }

    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    public GetPersonListResponse getPersonListWithOptions(GetPersonListRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        GetPersonListShrinkRequest request = new GetPersonListShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.corpIdList)) {
            request.corpIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.personIdList)) {
            request.personIdListShrink = com.aliyun.teautil.Common.toJSONString(tmp.personIdList);
        }

        return TeaModel.toModel(this.doRequest("GetPersonList", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetPersonListResponse());
    }

    public GetPersonListResponse getPersonList(GetPersonListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPersonListWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListUsersShrinkRequest request = new ListUsersShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.personList)) {
            request.personListShrink = com.aliyun.teautil.Common.toJSONString(tmp.personList);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.userList)) {
            request.userListShrink = com.aliyun.teautil.Common.toJSONString(tmp.userList);
        }

        return TeaModel.toModel(this.doRequest("ListUsers", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUser", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public BindUserResponse bindUserWithOptions(BindUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindUser", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new BindUserResponse());
    }

    public BindUserResponse bindUser(BindUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindUserWithOptions(request, runtime);
    }

    public GetUserDetailResponse getUserDetailWithOptions(GetUserDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUserDetail", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetUserDetailResponse());
    }

    public GetUserDetailResponse getUserDetail(GetUserDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDetailWithOptions(request, runtime);
    }

    public UploadImageResponse uploadImageWithOptions(UploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadImage", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UploadImageResponse());
    }

    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadImageWithOptions(request, runtime);
    }

    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUserGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUserGroupResponse());
    }

    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUserGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateUserGroupResponse());
    }

    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    public UnbindUserResponse unbindUserWithOptions(UnbindUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindUser", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UnbindUserResponse());
    }

    public UnbindUserResponse unbindUser(UnbindUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindUserWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUser", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUser", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUserGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteUserGroupResponse());
    }

    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    public ListPersonVisitCountResponse listPersonVisitCountWithOptions(ListPersonVisitCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonVisitCount", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonVisitCountResponse());
    }

    public ListPersonVisitCountResponse listPersonVisitCount(ListPersonVisitCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonVisitCountWithOptions(request, runtime);
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetailsWithOptions(ListEventAlgorithmDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListEventAlgorithmDetails", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListEventAlgorithmDetailsResponse());
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetails(ListEventAlgorithmDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventAlgorithmDetailsWithOptions(request, runtime);
    }

    public ListCorpMetricsResponse listCorpMetricsWithOptions(ListCorpMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCorpMetrics", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCorpMetricsResponse());
    }

    public ListCorpMetricsResponse listCorpMetrics(ListCorpMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpMetricsWithOptions(request, runtime);
    }

    public ListPersonTraceResponse listPersonTraceWithOptions(ListPersonTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersonTrace", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListPersonTraceResponse());
    }

    public ListPersonTraceResponse listPersonTrace(ListPersonTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTraceWithOptions(request, runtime);
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetricsWithOptions(ListCorpGroupMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCorpGroupMetrics", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCorpGroupMetricsResponse());
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetrics(ListCorpGroupMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpGroupMetricsWithOptions(request, runtime);
    }

    public GetFaceModelResultResponse getFaceModelResultWithOptions(GetFaceModelResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFaceModelResult", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetFaceModelResultResponse());
    }

    public GetFaceModelResultResponse getFaceModelResult(GetFaceModelResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFaceModelResultWithOptions(request, runtime);
    }

    public CreateCorpGroupResponse createCorpGroupWithOptions(CreateCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCorpGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateCorpGroupResponse());
    }

    public CreateCorpGroupResponse createCorpGroup(CreateCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCorpGroupWithOptions(request, runtime);
    }

    public ListCorpGroupsResponse listCorpGroupsWithOptions(ListCorpGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCorpGroups", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCorpGroupsResponse());
    }

    public ListCorpGroupsResponse listCorpGroups(ListCorpGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpGroupsWithOptions(request, runtime);
    }

    public DeleteCorpGroupResponse deleteCorpGroupWithOptions(DeleteCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCorpGroup", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCorpGroupResponse());
    }

    public DeleteCorpGroupResponse deleteCorpGroup(DeleteCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCorpGroupWithOptions(request, runtime);
    }

    public InvokeMotorModelResponse invokeMotorModelWithOptions(InvokeMotorModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeMotorModel", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new InvokeMotorModelResponse());
    }

    public InvokeMotorModelResponse invokeMotorModel(InvokeMotorModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeMotorModelWithOptions(request, runtime);
    }

    public GetDeviceConfigResponse getDeviceConfigWithOptions(GetDeviceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeviceConfig", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetDeviceConfigResponse());
    }

    public GetDeviceConfigResponse getDeviceConfig(GetDeviceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceConfigWithOptions(request, runtime);
    }

    public SyncDeviceTimeResponse syncDeviceTimeWithOptions(SyncDeviceTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SyncDeviceTime", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SyncDeviceTimeResponse());
    }

    public SyncDeviceTimeResponse syncDeviceTime(SyncDeviceTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDeviceTimeWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RegisterDevice", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public ReportDeviceCapacityResponse reportDeviceCapacityWithOptions(ReportDeviceCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReportDeviceCapacity", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ReportDeviceCapacityResponse());
    }

    public ReportDeviceCapacityResponse reportDeviceCapacity(ReportDeviceCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportDeviceCapacityWithOptions(request, runtime);
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideoWithOptions(SaveVideoSummaryTaskVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveVideoSummaryTaskVideo", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SaveVideoSummaryTaskVideoResponse());
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideo(SaveVideoSummaryTaskVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveVideoSummaryTaskVideoWithOptions(request, runtime);
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResultsWithOptions(ListBodyAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBodyAlgorithmResults", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListBodyAlgorithmResultsResponse());
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResults(ListBodyAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBodyAlgorithmResultsWithOptions(request, runtime);
    }

    public AddDataSourceResponse addDataSourceWithOptions(AddDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDataSource", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new AddDataSourceResponse());
    }

    public AddDataSourceResponse addDataSource(AddDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataSourceWithOptions(request, runtime);
    }

    public GetVideoComposeResultResponse getVideoComposeResultWithOptions(GetVideoComposeResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoComposeResult", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoComposeResultResponse());
    }

    public GetVideoComposeResultResponse getVideoComposeResult(GetVideoComposeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoComposeResultWithOptions(request, runtime);
    }

    public CreateVideoComposeTaskResponse createVideoComposeTaskWithOptions(CreateVideoComposeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVideoComposeTask", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateVideoComposeTaskResponse());
    }

    public CreateVideoComposeTaskResponse createVideoComposeTask(CreateVideoComposeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoComposeTaskWithOptions(request, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDataSource", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDataSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadFile", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UploadFileResponse());
    }

    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResultsWithOptions(ListEventAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListEventAlgorithmResults", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListEventAlgorithmResultsResponse());
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResults(ListEventAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventAlgorithmResultsWithOptions(request, runtime);
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTaskWithOptions(DeleteVideoSummaryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVideoSummaryTask", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVideoSummaryTaskResponse());
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTask(DeleteVideoSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoSummaryTaskWithOptions(request, runtime);
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResultWithOptions(GetVideoSummaryTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVideoSummaryTaskResult", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetVideoSummaryTaskResultResponse());
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResult(GetVideoSummaryTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoSummaryTaskResultWithOptions(request, runtime);
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTaskWithOptions(CreateVideoSummaryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVideoSummaryTask", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateVideoSummaryTaskResponse());
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTask(CreateVideoSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoSummaryTaskWithOptions(request, runtime);
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResultsWithOptions(ListMotorAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListMotorAlgorithmResults", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListMotorAlgorithmResultsResponse());
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResults(ListMotorAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMotorAlgorithmResultsWithOptions(request, runtime);
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResultsWithOptions(ListFaceAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFaceAlgorithmResults", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListFaceAlgorithmResultsResponse());
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResults(ListFaceAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFaceAlgorithmResultsWithOptions(request, runtime);
    }

    public ListMetricsResponse listMetricsWithOptions(ListMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListMetrics", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListMetricsResponse());
    }

    public ListMetricsResponse listMetrics(ListMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetricsWithOptions(request, runtime);
    }

    public DeleteRecordsResponse deleteRecordsWithOptions(DeleteRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRecords", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRecordsResponse());
    }

    public DeleteRecordsResponse deleteRecords(DeleteRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordsWithOptions(request, runtime);
    }

    public RecognizeFaceQualityResponse recognizeFaceQualityWithOptions(RecognizeFaceQualityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeFaceQuality", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeFaceQualityResponse());
    }

    public RecognizeFaceQualityResponse recognizeFaceQuality(RecognizeFaceQualityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeFaceQualityWithOptions(request, runtime);
    }

    public ListPersonsResponse listPersonsWithOptions(ListPersonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPersons", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListPersonsResponse());
    }

    public ListPersonsResponse listPersons(ListPersonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonsWithOptions(request, runtime);
    }

    public GetPersonDetailResponse getPersonDetailWithOptions(GetPersonDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPersonDetail", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetPersonDetailResponse());
    }

    public GetPersonDetailResponse getPersonDetail(GetPersonDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPersonDetailWithOptions(request, runtime);
    }

    public GetFaceOptionsResponse getFaceOptionsWithOptions(GetFaceOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFaceOptions", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetFaceOptionsResponse());
    }

    public GetFaceOptionsResponse getFaceOptions(GetFaceOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFaceOptionsWithOptions(request, runtime);
    }

    public GetBodyOptionsResponse getBodyOptionsWithOptions(GetBodyOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBodyOptions", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetBodyOptionsResponse());
    }

    public GetBodyOptionsResponse getBodyOptions(GetBodyOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBodyOptionsWithOptions(request, runtime);
    }

    public StopMonitorResponse stopMonitorWithOptions(StopMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopMonitor", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new StopMonitorResponse());
    }

    public StopMonitorResponse stopMonitor(StopMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMonitorWithOptions(request, runtime);
    }

    public SearchBodyResponse searchBodyWithOptions(SearchBodyRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        SearchBodyShrinkRequest request = new SearchBodyShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.optionList)) {
            request.optionListShrink = com.aliyun.teautil.Common.toJSONString(tmp.optionList);
        }

        return TeaModel.toModel(this.doRequest("SearchBody", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SearchBodyResponse());
    }

    public SearchBodyResponse searchBody(SearchBodyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchBodyWithOptions(request, runtime);
    }

    public AddMonitorResponse addMonitorWithOptions(AddMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMonitor", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new AddMonitorResponse());
    }

    public AddMonitorResponse addMonitor(AddMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMonitorWithOptions(request, runtime);
    }

    public GetMonitorResultResponse getMonitorResultWithOptions(GetMonitorResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMonitorResult", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetMonitorResultResponse());
    }

    public GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonitorResultWithOptions(request, runtime);
    }

    public UpdateMonitorResponse updateMonitorWithOptions(UpdateMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMonitor", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMonitorResponse());
    }

    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMonitorWithOptions(request, runtime);
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrlWithOptions(GetDeviceVideoUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeviceVideoUrl", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetDeviceVideoUrlResponse());
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrl(GetDeviceVideoUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceVideoUrlWithOptions(request, runtime);
    }

    public GetInventoryResponse getInventoryWithOptions(GetInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInventory", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetInventoryResponse());
    }

    public GetInventoryResponse getInventory(GetInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInventoryWithOptions(request, runtime);
    }

    public RecognizeImageResponse recognizeImageWithOptions(RecognizeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeImage", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeImageResponse());
    }

    public RecognizeImageResponse recognizeImage(RecognizeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeImageWithOptions(request, runtime);
    }

    public ListCorpsResponse listCorpsWithOptions(ListCorpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCorps", "HTTPS", "POST", "2020-05-15", "AK,APP", null, TeaModel.buildMap(request), runtime), new ListCorpsResponse());
    }

    public ListCorpsResponse listCorps(ListCorpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpsWithOptions(request, runtime);
    }

    public UpdateCorpResponse updateCorpWithOptions(UpdateCorpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCorp", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateCorpResponse());
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCorpWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDevice", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDevices", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrlWithOptions(GetDeviceLiveUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeviceLiveUrl", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new GetDeviceLiveUrlResponse());
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrl(GetDeviceLiveUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceLiveUrlWithOptions(request, runtime);
    }

    public SearchFaceResponse searchFaceWithOptions(SearchFaceRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        SearchFaceShrinkRequest request = new SearchFaceShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.optionList)) {
            request.optionListShrink = com.aliyun.teautil.Common.toJSONString(tmp.optionList);
        }

        return TeaModel.toModel(this.doRequest("SearchFace", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new SearchFaceResponse());
    }

    public SearchFaceResponse searchFace(SearchFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchFaceWithOptions(request, runtime);
    }

    public AddDeviceResponse addDeviceWithOptions(AddDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDevice", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new AddDeviceResponse());
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceWithOptions(request, runtime);
    }

    public CreateCorpResponse createCorpWithOptions(CreateCorpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCorp", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new CreateCorpResponse());
    }

    public CreateCorpResponse createCorp(CreateCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCorpWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDevice", "HTTPS", "POST", "2020-05-15", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
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
}
