// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlanApproversResponseBody extends TeaModel {
    /**
     * <p>An array that consists of reviewers.</p>
     */
    @NameInMap("Approvers")
    public java.util.List<ListProvisionedProductPlanApproversResponseBodyApprovers> approvers;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProvisionedProductPlanApproversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlanApproversResponseBody self = new ListProvisionedProductPlanApproversResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlanApproversResponseBody setApprovers(java.util.List<ListProvisionedProductPlanApproversResponseBodyApprovers> approvers) {
        this.approvers = approvers;
        return this;
    }
    public java.util.List<ListProvisionedProductPlanApproversResponseBodyApprovers> getApprovers() {
        return this.approvers;
    }

    public ListProvisionedProductPlanApproversResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProvisionedProductPlanApproversResponseBodyApprovers extends TeaModel {
        /**
         * <p>The name of the reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>approver-1</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the Resource Access Management (RAM) entity of the reviewer. Valid values:</p>
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

        public static ListProvisionedProductPlanApproversResponseBodyApprovers build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlanApproversResponseBodyApprovers self = new ListProvisionedProductPlanApproversResponseBodyApprovers();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlanApproversResponseBodyApprovers setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListProvisionedProductPlanApproversResponseBodyApprovers setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
