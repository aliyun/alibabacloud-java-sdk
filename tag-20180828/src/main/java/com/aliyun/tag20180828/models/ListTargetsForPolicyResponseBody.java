// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTargetsForPolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the object belongs to the resource directory. Valid values:</p>
     * <br>
     * <p>*   true: The object belongs to the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
     * <p>*   false: The object does not belong to the resource directory. This value is available if you use the Tag Policy feature in single-account mode.</p>
     */
    @NameInMap("IsRd")
    public Boolean isRd;

    /**
     * <p>Indicates whether the next query is required.</p>
     * <br>
     * <p>*   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.</p>
     * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource directory.</p>
     * <br>
     * <p>>  This parameter is returned only if you use the Tag Policy feature in multi-account mode.</p>
     */
    @NameInMap("RdId")
    public String rdId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The objects to which the tag policy is attached.</p>
     */
    @NameInMap("Targets")
    public java.util.List<ListTargetsForPolicyResponseBodyTargets> targets;

    public static ListTargetsForPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTargetsForPolicyResponseBody self = new ListTargetsForPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTargetsForPolicyResponseBody setIsRd(Boolean isRd) {
        this.isRd = isRd;
        return this;
    }
    public Boolean getIsRd() {
        return this.isRd;
    }

    public ListTargetsForPolicyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTargetsForPolicyResponseBody setRdId(String rdId) {
        this.rdId = rdId;
        return this;
    }
    public String getRdId() {
        return this.rdId;
    }

    public ListTargetsForPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTargetsForPolicyResponseBody setTargets(java.util.List<ListTargetsForPolicyResponseBodyTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<ListTargetsForPolicyResponseBodyTargets> getTargets() {
        return this.targets;
    }

    public static class ListTargetsForPolicyResponseBodyTargets extends TeaModel {
        /**
         * <p>The ID of the object.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The type of the object. Valid values:</p>
         * <br>
         * <p>*   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</p>
         * <p>*   ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         */
        @NameInMap("TargetType")
        public Integer targetType;

        public static ListTargetsForPolicyResponseBodyTargets build(java.util.Map<String, ?> map) throws Exception {
            ListTargetsForPolicyResponseBodyTargets self = new ListTargetsForPolicyResponseBodyTargets();
            return TeaModel.build(map, self);
        }

        public ListTargetsForPolicyResponseBodyTargets setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListTargetsForPolicyResponseBodyTargets setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

    }

}
