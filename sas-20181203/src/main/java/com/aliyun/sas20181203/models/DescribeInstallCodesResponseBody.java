// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesResponseBody extends TeaModel {
    /**
     * <p>The information about the installation commands.</p>
     */
    @NameInMap("InstallCodes")
    public java.util.List<DescribeInstallCodesResponseBodyInstallCodes> installCodes;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C0D6119F-92EE-1276-B8B6-C81A7F9D57F5</p>
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
         * <p>The verification code for you to manually install the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>15v02r</p>
         */
        @NameInMap("CaptchaCode")
        public String captchaCode;

        /**
         * <p>The timestamp generated when the commands used to install the Security Center agent expire. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637810007000</p>
         */
        @NameInMap("ExpiredDate")
        public Long expiredDate;

        /**
         * <p>The ID of the server group to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>9165712</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the server group to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether an image is used to install the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OnlyImage")
        public Boolean onlyImage;

        /**
         * <p>The operating system of the server. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The ID of the PrivateLink endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PrivateLinkEndpointId")
        public Long privateLinkEndpointId;

        /**
         * <p>The name of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy_test</p>
         */
        @NameInMap("ProxyCluster")
        public String proxyCluster;

        /**
         * <p>The name of the server provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
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

        public DescribeInstallCodesResponseBodyInstallCodes setPrivateLinkEndpointId(Long privateLinkEndpointId) {
            this.privateLinkEndpointId = privateLinkEndpointId;
            return this;
        }
        public Long getPrivateLinkEndpointId() {
            return this.privateLinkEndpointId;
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
