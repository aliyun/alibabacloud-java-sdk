// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetIAMCurrentAccessorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Id")
    public String id;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Tenant")
    public String tenant;

    @NameInMap("Type")
    public String type;

    public static GetIAMCurrentAccessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIAMCurrentAccessorResponseBody self = new GetIAMCurrentAccessorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIAMCurrentAccessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIAMCurrentAccessorResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetIAMCurrentAccessorResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetIAMCurrentAccessorResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetIAMCurrentAccessorResponseBody setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetIAMCurrentAccessorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetIAMCurrentAccessorResponseBody setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetIAMCurrentAccessorResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
