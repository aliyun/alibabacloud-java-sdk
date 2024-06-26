// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoResponseBody extends TeaModel {
    @NameInMap("DeviceInfo")
    public QueryDeviceInfoResponseBodyDeviceInfo deviceInfo;

    /**
     * <strong>example:</strong>
     * <p>6EEF262B-EA7D-41DC-89B9-20F3D1E28194</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoResponseBody self = new QueryDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoResponseBody setDeviceInfo(QueryDeviceInfoResponseBodyDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public QueryDeviceInfoResponseBodyDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public QueryDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDeviceInfoResponseBodyDeviceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>test_alias,test_alias2</p>
         */
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Brand")
        public String brand;

        /**
         * <strong>example:</strong>
         * <p>a64ae296f3b04a58a05b30c95****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>5ecc7b4012aaa801b63******5543ccbda6b4930d09629e936e1ac4b762a7df</p>
         */
        @NameInMap("DeviceToken")
        public String deviceToken;

        /**
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>2018-03-27T02:19:40Z</p>
         */
        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>133********</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PushEnabled")
        public Boolean pushEnabled;

        /**
         * <strong>example:</strong>
         * <p>test_tag,test_tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static QueryDeviceInfoResponseBodyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceInfoResponseBodyDeviceInfo self = new QueryDeviceInfoResponseBodyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setPushEnabled(Boolean pushEnabled) {
            this.pushEnabled = pushEnabled;
            return this;
        }
        public Boolean getPushEnabled() {
            return this.pushEnabled;
        }

        public QueryDeviceInfoResponseBodyDeviceInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
