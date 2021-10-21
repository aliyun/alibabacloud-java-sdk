// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalResponseBody extends TeaModel {
    @NameInMap("PrincipalDescription")
    public String principalDescription;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrincipalValue")
    public Integer principalValue;

    public static GetDefaultPrincipalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalResponseBody self = new GetDefaultPrincipalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalResponseBody setPrincipalDescription(String principalDescription) {
        this.principalDescription = principalDescription;
        return this;
    }
    public String getPrincipalDescription() {
        return this.principalDescription;
    }

    public GetDefaultPrincipalResponseBody setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public GetDefaultPrincipalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultPrincipalResponseBody setPrincipalValue(Integer principalValue) {
        this.principalValue = principalValue;
        return this;
    }
    public Integer getPrincipalValue() {
        return this.principalValue;
    }

}
