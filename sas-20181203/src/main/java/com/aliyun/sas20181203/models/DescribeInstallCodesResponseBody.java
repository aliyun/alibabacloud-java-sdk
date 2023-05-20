// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("InstallCodes")
    public java.util.List<DescribeInstallCodesResponseBodyInstallCodes> installCodes;

    /**
     * <p>The installation verification code for you to manually install the Security Center agent.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstallCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCodesResponseBody self = new DescribeInstallCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCodesResponseBody setInstallCodes(java.util.List<DescribeInstallCodesResponseBodyInstallCodes> installCodes) {
        this.installCodes = installCodes;
        return this;
    }
    public java.util.List<DescribeInstallCodesResponseBodyInstallCodes> getInstallCodes() {
        return this.installCodes;
    }

    public DescribeInstallCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstallCodesResponseBodyInstallCodes extends TeaModel {
        /**
         * <p>DescribeInstallCodes</p>
         */
        @NameInMap("CaptchaCode")
        public String captchaCode;

        @NameInMap("ExpiredDate")
        public Long expiredDate;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Queries the commands that are used to manually install the Security Center Agent.</p>
         */
        @NameInMap("OnlyImage")
        public Boolean onlyImage;

        @NameInMap("Os")
        public String os;

        @NameInMap("ProxyCluster")
        public String proxyCluster;

        @NameInMap("VendorName")
        public String vendorName;

        public static DescribeInstallCodesResponseBodyInstallCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstallCodesResponseBodyInstallCodes self = new DescribeInstallCodesResponseBodyInstallCodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstallCodesResponseBodyInstallCodes setCaptchaCode(String captchaCode) {
            this.captchaCode = captchaCode;
            return this;
        }
        public String getCaptchaCode() {
            return this.captchaCode;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setExpiredDate(Long expiredDate) {
            this.expiredDate = expiredDate;
            return this;
        }
        public Long getExpiredDate() {
            return this.expiredDate;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setOnlyImage(Boolean onlyImage) {
            this.onlyImage = onlyImage;
            return this;
        }
        public Boolean getOnlyImage() {
            return this.onlyImage;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setProxyCluster(String proxyCluster) {
            this.proxyCluster = proxyCluster;
            return this;
        }
        public String getProxyCluster() {
            return this.proxyCluster;
        }

        public DescribeInstallCodesResponseBodyInstallCodes setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

}
