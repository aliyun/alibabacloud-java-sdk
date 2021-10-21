// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetSupportPrincipalNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Principals")
    public java.util.List<GetSupportPrincipalNameResponseBodyPrincipals> principals;

    public static GetSupportPrincipalNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupportPrincipalNameResponseBody self = new GetSupportPrincipalNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupportPrincipalNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupportPrincipalNameResponseBody setPrincipals(java.util.List<GetSupportPrincipalNameResponseBodyPrincipals> principals) {
        this.principals = principals;
        return this;
    }
    public java.util.List<GetSupportPrincipalNameResponseBodyPrincipals> getPrincipals() {
        return this.principals;
    }

    public static class GetSupportPrincipalNameResponseBodyPrincipals extends TeaModel {
        @NameInMap("PrincipalDescription")
        public String principalDescription;

        @NameInMap("DefaultPrincipal")
        public Boolean defaultPrincipal;

        @NameInMap("PrincipalValue")
        public Integer principalValue;

        public static GetSupportPrincipalNameResponseBodyPrincipals build(java.util.Map<String, ?> map) throws Exception {
            GetSupportPrincipalNameResponseBodyPrincipals self = new GetSupportPrincipalNameResponseBodyPrincipals();
            return TeaModel.build(map, self);
        }

        public GetSupportPrincipalNameResponseBodyPrincipals setPrincipalDescription(String principalDescription) {
            this.principalDescription = principalDescription;
            return this;
        }
        public String getPrincipalDescription() {
            return this.principalDescription;
        }

        public GetSupportPrincipalNameResponseBodyPrincipals setDefaultPrincipal(Boolean defaultPrincipal) {
            this.defaultPrincipal = defaultPrincipal;
            return this;
        }
        public Boolean getDefaultPrincipal() {
            return this.defaultPrincipal;
        }

        public GetSupportPrincipalNameResponseBodyPrincipals setPrincipalValue(Integer principalValue) {
            this.principalValue = principalValue;
            return this;
        }
        public Integer getPrincipalValue() {
            return this.principalValue;
        }

    }

}
