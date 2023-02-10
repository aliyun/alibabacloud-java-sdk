// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    @NameInMap("RebootStatuses")
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceRebootStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRebootStatusResponseBody self = new DescribeInstanceRebootStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRebootStatusResponseBody setRebootStatuses(java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses) {
        this.rebootStatuses = rebootStatuses;
        return this;
    }
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> getRebootStatuses() {
        return this.rebootStatuses;
    }

    public DescribeInstanceRebootStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRebootStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceRebootStatusResponseBodyRebootStatuses extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("RebootStatus")
        public Integer rebootStatus;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeInstanceRebootStatusResponseBodyRebootStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRebootStatusResponseBodyRebootStatuses self = new DescribeInstanceRebootStatusResponseBodyRebootStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setRebootStatus(Integer rebootStatus) {
            this.rebootStatus = rebootStatus;
            return this;
        }
        public Integer getRebootStatus() {
            return this.rebootStatus;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
