// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the server.</p>
     */
    @NameInMap("Targets")
    public java.util.List<DescribeTargetResponseBodyTargets> targets;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTargetResponseBody self = new DescribeTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTargetResponseBody setTargets(java.util.List<DescribeTargetResponseBodyTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<DescribeTargetResponseBodyTargets> getTargets() {
        return this.targets;
    }

    public DescribeTargetResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTargetResponseBodyTargets extends TeaModel {
        /**
         * <p>The flag that is added to the server. This parameter can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>del</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The UUID of the server or the ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>5c5f0169-3527-40a2-b5ff-0bc1db8f****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the object. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: a server</li>
         * <li><strong>groupId</strong>: a server group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeTargetResponseBodyTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeTargetResponseBodyTargets self = new DescribeTargetResponseBodyTargets();
            return TeaModel.build(map, self);
        }

        public DescribeTargetResponseBodyTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeTargetResponseBodyTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeTargetResponseBodyTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
