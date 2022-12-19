// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesResponseBody extends TeaModel {
    // An array that consists of the information about the installation command.
    @NameInMap("InstallCodes")
    public java.util.List<DescribeInstallCodesResponseBodyInstallCodes> installCodes;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The installation verification code for you to manually install the Security Center agent.
        @NameInMap("CaptchaCode")
        public String captchaCode;

        // The timestamp when the installation command expires. Unit: milliseconds.
        @NameInMap("ExpiredDate")
        public Long expiredDate;

        // The ID of the server group to which the server belongs.
        @NameInMap("GroupId")
        public Long groupId;

        // The name of the server group to which the server belongs.
        @NameInMap("GroupName")
        public String groupName;

        // Indicates whether an image is used to install the Security Center agent. Valid values:
        // 
        // *   **true**: An image is used to install the Security Center agent.
        // *   **false**: An image is not used to install the Security Center agent.
        @NameInMap("OnlyImage")
        public Boolean onlyImage;

        // The operating system of the server. Valid values:
        // *   **linux**: Linux.
        // *   **windows**: Windows.
        @NameInMap("Os")
        public String os;

        // The name of the server provider.
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

        public DescribeInstallCodesResponseBodyInstallCodes setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

}
