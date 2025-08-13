// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSDKDownloadListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
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
        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Developer</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云安全-风险识别</p>
         */
        @NameInMap("developer")
        public String developer;

        /**
         * <p>Device type.</p>
         * 
         * <strong>example:</strong>
         * <p>ANDROID</p>
         */
        @NameInMap("deviceType")
        public String deviceType;

        /**
         * <p>Download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun-xxxx.oss-cn-xxx.xxx.com/sdk/xxx/10056.1/Android-AliyunDeviceEnhance-10056.1-20250611.tgz">https://aliyun-xxxx.oss-cn-xxx.xxx.com/sdk/xxx/10056.1/Android-AliyunDeviceEnhance-10056.1-20250611.tgz</a></p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <p>File MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>E582EEB6B4BC9B5CB168AA5A7DD0EE93</p>
         */
        @NameInMap("md5")
        public String md5;

        /**
         * <p>Package name</p>
         * 
         * <strong>example:</strong>
         * <p>net.security.device</p>
         */
        @NameInMap("packageName")
        public String packageName;

        /**
         * <p>Risk recognition SDK privacy policy link</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202111120818_92724.html">https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202111120818_92724.html</a></p>
         */
        @NameInMap("privacyLink")
        public String privacyLink;

        /**
         * <p>Release time</p>
         * 
         * <strong>example:</strong>
         * <p>1751212800000</p>
         */
        @NameInMap("pushTime")
        public String pushTime;

        /**
         * <p>SDK version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sdkVersion")
        public String sdkVersion;

        /**
         * <p>Size</p>
         * 
         * <strong>example:</strong>
         * <p>4.12 MB</p>
         */
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
