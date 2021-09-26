// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionQueryConditionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    @NameInMap("DbServerList")
    public java.util.List<String> dbServerList;

    public static GetSessionQueryConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionQueryConditionResponseBody self = new GetSessionQueryConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionQueryConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionQueryConditionResponseBody setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetSessionQueryConditionResponseBody setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetSessionQueryConditionResponseBody setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    public GetSessionQueryConditionResponseBody setDbServerList(java.util.List<String> dbServerList) {
        this.dbServerList = dbServerList;
        return this;
    }
    public java.util.List<String> getDbServerList() {
        return this.dbServerList;
    }

}
