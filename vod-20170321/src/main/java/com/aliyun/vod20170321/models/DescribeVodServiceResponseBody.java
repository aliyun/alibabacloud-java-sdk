// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodServiceResponseBody extends TeaModel {
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("OpeningTime")
    public String openingTime;

    @NameInMap("OperationLocks")
    public DescribeVodServiceResponseBodyOperationLocks operationLocks;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodServiceResponseBody self = new DescribeVodServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeVodServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeVodServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVodServiceResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeVodServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeVodServiceResponseBody setOperationLocks(DescribeVodServiceResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeVodServiceResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeVodServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodServiceResponseBodyOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeVodServiceResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodServiceResponseBodyOperationLocksLockReason self = new DescribeVodServiceResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeVodServiceResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeVodServiceResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeVodServiceResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeVodServiceResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodServiceResponseBodyOperationLocks self = new DescribeVodServiceResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeVodServiceResponseBodyOperationLocks setLockReason(java.util.List<DescribeVodServiceResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeVodServiceResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
