// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanSnatResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SNAT is enabled.</p>
     * <ul>
     * <li><strong>ENABLE</strong>: SNAT is enabled.</li>
     * <li><strong>DISABLE</strong>: SNAT is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("Snat")
    public String snat;

    /**
     * <p>The details about the status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWanSnatResponseBodyTaskStates> taskStates;

    public static DescribeSagWanSnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanSnatResponseBody self = new DescribeSagWanSnatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanSnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWanSnatResponseBody setSnat(String snat) {
        this.snat = snat;
        return this;
    }
    public String getSnat() {
        return this.snat;
    }

    public DescribeSagWanSnatResponseBody setTaskStates(java.util.List<DescribeSagWanSnatResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWanSnatResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagWanSnatResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The timestamp when the task was created.</p>
         * <p>The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1586847787000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
         * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
         * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
         * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
         * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
         * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagWanSnatResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanSnatResponseBodyTaskStates self = new DescribeSagWanSnatResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanSnatResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWanSnatResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
