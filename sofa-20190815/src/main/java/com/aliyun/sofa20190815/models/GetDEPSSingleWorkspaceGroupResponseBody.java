// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDEPSSingleWorkspaceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("DomainSuffix")
    public String domainSuffix;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("Name")
    public String name;

    @NameInMap("ReleaseMode")
    public String releaseMode;

    @NameInMap("Workspaces")
    public java.util.List<String> workspaces;

    public static GetDEPSSingleWorkspaceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDEPSSingleWorkspaceGroupResponseBody self = new GetDEPSSingleWorkspaceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public GetDEPSSingleWorkspaceGroupResponseBody setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
