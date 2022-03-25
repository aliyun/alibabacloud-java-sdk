// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateV3InstanceByUserResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IdList")
    public java.util.List<Long> idList;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UserSet")
    public java.util.List<String> userSet;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateV3InstanceByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateV3InstanceByUserResponseBody self = new UpdateV3InstanceByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateV3InstanceByUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateV3InstanceByUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateV3InstanceByUserResponseBody setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public UpdateV3InstanceByUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateV3InstanceByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateV3InstanceByUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateV3InstanceByUserResponseBody setUserSet(java.util.List<String> userSet) {
        this.userSet = userSet;
        return this;
    }
    public java.util.List<String> getUserSet() {
        return this.userSet;
    }

    public UpdateV3InstanceByUserResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
