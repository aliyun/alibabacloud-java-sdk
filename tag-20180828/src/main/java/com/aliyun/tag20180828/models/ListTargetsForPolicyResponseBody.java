// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTargetsForPolicyResponseBody extends TeaModel {
    @NameInMap("IsRd")
    public Boolean isRd;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RdId")
    public String rdId;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("TargetId")
        public String targetId;

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
