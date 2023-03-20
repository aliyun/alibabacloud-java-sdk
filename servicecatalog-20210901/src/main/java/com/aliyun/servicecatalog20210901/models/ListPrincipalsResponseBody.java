// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPrincipalsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of RAM entities.</p>
     */
    @NameInMap("Principals")
    public java.util.List<ListPrincipalsResponseBodyPrincipals> principals;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrincipalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrincipalsResponseBody self = new ListPrincipalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrincipalsResponseBody setPrincipals(java.util.List<ListPrincipalsResponseBodyPrincipals> principals) {
        this.principals = principals;
        return this;
    }
    public java.util.List<ListPrincipalsResponseBodyPrincipals> getPrincipals() {
        return this.principals;
    }

    public ListPrincipalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrincipalsResponseBodyPrincipals extends TeaModel {
        /**
         * <p>The ID of the RAM entity.</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of the RAM entity. Valid values:</p>
         * <br>
         * <p>*   RamUser: a RAM user</p>
         * <p>*   RamRole: a RAM role</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListPrincipalsResponseBodyPrincipals build(java.util.Map<String, ?> map) throws Exception {
            ListPrincipalsResponseBodyPrincipals self = new ListPrincipalsResponseBodyPrincipals();
            return TeaModel.build(map, self);
        }

        public ListPrincipalsResponseBodyPrincipals setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListPrincipalsResponseBodyPrincipals setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
