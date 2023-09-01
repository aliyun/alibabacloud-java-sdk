// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttachRecordsResponseBody extends TeaModel {
    /**
     * <p>The results of automatically connecting applications on the ECS instance to the application protection feature.</p>
     */
    @NameInMap("AccessList")
    public java.util.List<DescribeAttachRecordsResponseBodyAccessList> accessList;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The status of connecting applications on the ECS instance to the application protection feature. Valid values:</p>
         * <br>
         * <p>*   **0**: All applications are connected to the application protection feature.</p>
         * <p>*   **1**: Partial applications are connected to the application protection feature.</p>
         * <p>*   **2**: Applications failed to be connected to the application protection feature.</p>
         * <p>*   **3**: Applications are being connected to the application protection feature.</p>
         * <p>*   **4**: Applications are not connected to the application protection feature.</p>
         */
        @NameInMap("AttachState")
        public Long attachState;

        /**
         * <p>Indicates whether automatic protection is enabled for the applications on the ECS instance. Valid values:</p>
         * <br>
         * <p>*   **ON**: Automatic protection is enabled for the applications on the ECS instance.</p>
         * <p>*   **OFF**: Automatic protection is disabled for the applications on the ECS instance.</p>
         */
        @NameInMap("AttachSwitch")
        public String attachSwitch;

        /**
         * <p>The UUID of the ECS instance.</p>
         */
        @NameInMap("EcsUUID")
        public String ecsUUID;

        /**
         * <p>The message that shows the results of installing the RASP agent on the ECS instance.</p>
         */
        @NameInMap("InstallMsg")
        public String installMsg;

        /**
         * <p>The status of installing the RASP agent on the ECS instance to enable automatic application connection. Valid values:</p>
         * <br>
         * <p>*   **0**: installed</p>
         * <p>*   **1**: installing</p>
         * <p>*   **2**: installation failed</p>
         * <p>*   **3**: installation timeout</p>
         * <p>*   **4**: uninstalled</p>
         * <p>*   **5**: uninstalling</p>
         * <p>*   **6**: uninstallation failed</p>
         * <p>*   **7**: uninstallation timeout</p>
         */
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
