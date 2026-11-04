// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWifiResponseBody extends TeaModel {
    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: Authentication is disabled.</li>
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
     * <p>The spectrum bandwidth. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong>.</li>
     * <li><strong>20MHz</strong>.</li>
     * <li><strong>40MHz</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automatic</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li><strong>AUTO</strong>: Automatic encryption.</li>
     * <li><strong>TKIP</strong>: Temporal Key Integrity Protocol.</li>
     * <li><strong>AES</strong>: Advanced Encryption Standard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Indicates whether the wireless security feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The wireless security feature is enabled.</li>
     * <li><strong>False</strong>: The wireless security feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsAuth")
    public String isAuth;

    /**
     * <p>Indicates whether the Wi-Fi broadcast feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The Wi-Fi broadcast feature is enabled.</li>
     * <li><strong>False</strong>: The Wi-Fi broadcast feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsBroadcast")
    public String isBroadcast;

    /**
     * <p>Indicates whether the wireless feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Enabled.</li>
     * <li><strong>False</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsEnable")
    public String isEnable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Wi-Fi name.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_sag_123456***</p>
     */
    @NameInMap("Ssid")
    public String ssid;

    /**
     * <p>The status of the query task.</p>
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
         * <p>The error code. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this feature.</li>
         * <li><strong>BuildRequestError</strong>: The management system does not support the operation.</li>
         * <li><strong>HardwareError</strong>: The query task fails to be delivered due to device errors.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered even after the device goes online.</li>
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
