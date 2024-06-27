// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSDKDownloadListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeSDKDownloadListResponseBodyResultObject> resultObject;

    public static DescribeSDKDownloadListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKDownloadListResponseBody self = new DescribeSDKDownloadListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKDownloadListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKDownloadListResponseBody setResultObject(java.util.List<DescribeSDKDownloadListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSDKDownloadListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSDKDownloadListResponseBodyResultObject extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("developer")
        public String developer;

        @NameInMap("deviceType")
        public String deviceType;

        @NameInMap("downloadUrl")
        public String downloadUrl;

        @NameInMap("md5")
        public String md5;

        @NameInMap("packageName")
        public String packageName;

        @NameInMap("privacyLink")
        public String privacyLink;

        @NameInMap("pushTime")
        public String pushTime;

        @NameInMap("sdkVersion")
        public String sdkVersion;

        @NameInMap("size")
        public String size;

        public static DescribeSDKDownloadListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKDownloadListResponseBodyResultObject self = new DescribeSDKDownloadListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSDKDownloadListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setPrivacyLink(String privacyLink) {
            this.privacyLink = privacyLink;
            return this;
        }
        public String getPrivacyLink() {
            return this.privacyLink;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeSDKDownloadListResponseBodyResultObject setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
