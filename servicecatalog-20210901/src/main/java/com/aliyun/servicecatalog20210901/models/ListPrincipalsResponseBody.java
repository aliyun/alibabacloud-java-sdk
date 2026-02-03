// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPrincipalsResponseBody extends TeaModel {
    /**
     * <p>The RAM entities.</p>
     */
    @NameInMap("Principals")
    public java.util.List<ListPrincipalsResponseBodyPrincipals> principals;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
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
         * 
         * <strong>example:</strong>
         * <p>24477111603637****</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalPattern")
        public String principalPattern;

        /**
         * <p>The type of the RAM entity. Valid values:</p>
         * <ul>
         * <li>RamUser: a RAM user</li>
         * <li>RamRole: a RAM role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
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

        public ListPrincipalsResponseBodyPrincipals setPrincipalPattern(String principalPattern) {
            this.principalPattern = principalPattern;
            return this;
        }
        public String getPrincipalPattern() {
            return this.principalPattern;
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
