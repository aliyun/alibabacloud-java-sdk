// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttachRecordsResponseBody extends TeaModel {
    @NameInMap("AccessList")
    public java.util.List<DescribeAttachRecordsResponseBodyAccessList> accessList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttachRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttachRecordsResponseBody self = new DescribeAttachRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttachRecordsResponseBody setAccessList(java.util.List<DescribeAttachRecordsResponseBodyAccessList> accessList) {
        this.accessList = accessList;
        return this;
    }
    public java.util.List<DescribeAttachRecordsResponseBodyAccessList> getAccessList() {
        return this.accessList;
    }

    public DescribeAttachRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAttachRecordsResponseBodyAccessList extends TeaModel {
        @NameInMap("AttachState")
        public Long attachState;

        @NameInMap("AttachSwitch")
        public String attachSwitch;

        @NameInMap("EcsUUID")
        public String ecsUUID;

        @NameInMap("InstallMsg")
        public String installMsg;

        @NameInMap("InstallState")
        public Long installState;

        public static DescribeAttachRecordsResponseBodyAccessList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttachRecordsResponseBodyAccessList self = new DescribeAttachRecordsResponseBodyAccessList();
            return TeaModel.build(map, self);
        }

        public DescribeAttachRecordsResponseBodyAccessList setAttachState(Long attachState) {
            this.attachState = attachState;
            return this;
        }
        public Long getAttachState() {
            return this.attachState;
        }

        public DescribeAttachRecordsResponseBodyAccessList setAttachSwitch(String attachSwitch) {
            this.attachSwitch = attachSwitch;
            return this;
        }
        public String getAttachSwitch() {
            return this.attachSwitch;
        }

        public DescribeAttachRecordsResponseBodyAccessList setEcsUUID(String ecsUUID) {
            this.ecsUUID = ecsUUID;
            return this;
        }
        public String getEcsUUID() {
            return this.ecsUUID;
        }

        public DescribeAttachRecordsResponseBodyAccessList setInstallMsg(String installMsg) {
            this.installMsg = installMsg;
            return this;
        }
        public String getInstallMsg() {
            return this.installMsg;
        }

        public DescribeAttachRecordsResponseBodyAccessList setInstallState(Long installState) {
            this.installState = installState;
            return this;
        }
        public Long getInstallState() {
            return this.installState;
        }

    }

}
