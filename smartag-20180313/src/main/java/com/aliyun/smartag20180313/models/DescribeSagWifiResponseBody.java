// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWifiResponseBody extends TeaModel {
    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: authentication is disabled.</li>
     * <li><strong>WPA-PSK</strong>: WPA-PSK authentication is enabled.</li>
     * <li><strong>WPA2-PSK</strong>: WPA2-PSK authentication is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WPA2-PSK</p>
     */
    @NameInMap("AuthenticationType")
    public String authenticationType;

    /**
     * <p>The bandwidth of the Wi-Fi channel. Valid values:</p>
     * <ul>
     * <li><strong>Automatic</strong></li>
     * <li><strong>20 HMz</strong></li>
     * <li><strong>40 MHz</strong></li>
     * </ul>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The Wi-Fi channel.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The encryption algorithm.</p>
     * <ul>
     * <li><strong>AUTO</strong>: automatically selects the encryption algorithm.</li>
     * <li><strong>TKIP</strong>: uses the Temporal Key Integrity Protocol (TKIP).</li>
     * <li><strong>AES</strong>: uses the Advanced Encryption Standard authorized by Wi-Fi®.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Indicates whether wireless security is enabled.</p>
     * <ul>
     * <li><strong>True</strong>: wireless security is enabled.</li>
     * <li><strong>False</strong>: wireless security is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsAuth")
    public String isAuth;

    /**
     * <p>Indicates whether broadcast over Wi-Fi is enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: broadcast is enabled.</li>
     * <li><strong>False</strong>: broadcast is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsBroadcast")
    public String isBroadcast;

    /**
     * <p>Indicates whether wireless connections are enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: wireless connections are enabled.</li>
     * <li><strong>False</strong>: wireless connections are disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsEnable")
    public String isEnable;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service set identifier (SSID) of the Wi-Fi network.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_sag_123456***</p>
     */
    @NameInMap("Ssid")
    public String ssid;

    /**
     * <p>The information about the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWifiResponseBodyTaskStates> taskStates;

    public static DescribeSagWifiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWifiResponseBody self = new DescribeSagWifiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWifiResponseBody setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public DescribeSagWifiResponseBody setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public DescribeSagWifiResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DescribeSagWifiResponseBody setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public DescribeSagWifiResponseBody setIsAuth(String isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public String getIsAuth() {
        return this.isAuth;
    }

    public DescribeSagWifiResponseBody setIsBroadcast(String isBroadcast) {
        this.isBroadcast = isBroadcast;
        return this;
    }
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    public DescribeSagWifiResponseBody setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public String getIsEnable() {
        return this.isEnable;
    }

    public DescribeSagWifiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWifiResponseBody setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public DescribeSagWifiResponseBody setTaskStates(java.util.List<DescribeSagWifiResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWifiResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagWifiResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586843621000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned for a query task. The 200 error code indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned for a query task. The Successful error message indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task has been initialized.</li>
         * <li><strong>Offline</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will be dispatched after the SAG device is connected to Alibaba Cloud.</li>
         * <li><strong>Succeed</strong>: The query task has been dispatched.</li>
         * <li><strong>Processing</strong>: The query task is being dispatched.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the SAG device does not support query tasks.</li>
         * <li><strong>BuildRequestError</strong>: The SAG control system does not support query tasks.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be dispatched due to device errors.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will not be dispatched after the device is connected to Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagWifiResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWifiResponseBodyTaskStates self = new DescribeSagWifiResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWifiResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWifiResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWifiResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWifiResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
