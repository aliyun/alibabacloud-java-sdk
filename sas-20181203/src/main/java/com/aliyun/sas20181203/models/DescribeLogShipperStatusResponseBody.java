// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogShipperStatusResponseBody extends TeaModel {
    /**
     * <p>The log delivery status collection.</p>
     */
    @NameInMap("LogShipperStatus")
    public DescribeLogShipperStatusResponseBodyLogShipperStatus logShipperStatus;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogShipperStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogShipperStatusResponseBody self = new DescribeLogShipperStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogShipperStatusResponseBody setLogShipperStatus(DescribeLogShipperStatusResponseBodyLogShipperStatus logShipperStatus) {
        this.logShipperStatus = logShipperStatus;
        return this;
    }
    public DescribeLogShipperStatusResponseBodyLogShipperStatus getLogShipperStatus() {
        return this.logShipperStatus;
    }

    public DescribeLogShipperStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogShipperStatusResponseBodyLogShipperStatus extends TeaModel {
        /**
         * <p>The service authorization status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: authorized</li>
         * <li><strong>no</strong>: not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("AuthStatus")
        public String authStatus;

        /**
         * <p>The purchase status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: purchased</li>
         * <li><strong>no</strong>: not purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("BuyStatus")
        public String buyStatus;

        /**
         * <p>The version of the log delivery fields for log analysis. Valid values:</p>
         * <ul>
         * <li><strong>SAS_V1</strong></li>
         * <li><strong>SAS_V2</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAS_V1</p>
         */
        @NameInMap("EtlMetaVersion")
        public String etlMetaVersion;

        /**
         * <p>The enabling status of log analysis. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: enabled</li>
         * <li><strong>no</strong>: not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("OpenStatus")
        public String openStatus;

        /**
         * <p>The pay-as-you-go activation status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: activated</li>
         * <li><strong>no</strong>: not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("PostPaidOpenStatus")
        public String postPaidOpenStatus;

        /**
         * <p>The pay-as-you-go support status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: supported</li>
         * <li><strong>no</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("PostPaidSupportStatus")
        public String postPaidSupportStatus;

        /**
         * <p>The status of the log project used by the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SlsProjectStatus")
        public String slsProjectStatus;

        /**
         * <p>The activation status of Simple Log Service (SLS). Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: activated</li>
         * <li><strong>no</strong>: not activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("SlsServiceStatus")
        public String slsServiceStatus;

        public static DescribeLogShipperStatusResponseBodyLogShipperStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogShipperStatusResponseBodyLogShipperStatus self = new DescribeLogShipperStatusResponseBodyLogShipperStatus();
            return TeaModel.build(map, self);
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setAuthStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public String getAuthStatus() {
            return this.authStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setBuyStatus(String buyStatus) {
            this.buyStatus = buyStatus;
            return this;
        }
        public String getBuyStatus() {
            return this.buyStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setEtlMetaVersion(String etlMetaVersion) {
            this.etlMetaVersion = etlMetaVersion;
            return this;
        }
        public String getEtlMetaVersion() {
            return this.etlMetaVersion;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setOpenStatus(String openStatus) {
            this.openStatus = openStatus;
            return this;
        }
        public String getOpenStatus() {
            return this.openStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setPostPaidOpenStatus(String postPaidOpenStatus) {
            this.postPaidOpenStatus = postPaidOpenStatus;
            return this;
        }
        public String getPostPaidOpenStatus() {
            return this.postPaidOpenStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setPostPaidSupportStatus(String postPaidSupportStatus) {
            this.postPaidSupportStatus = postPaidSupportStatus;
            return this;
        }
        public String getPostPaidSupportStatus() {
            return this.postPaidSupportStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setSlsProjectStatus(String slsProjectStatus) {
            this.slsProjectStatus = slsProjectStatus;
            return this;
        }
        public String getSlsProjectStatus() {
            return this.slsProjectStatus;
        }

        public DescribeLogShipperStatusResponseBodyLogShipperStatus setSlsServiceStatus(String slsServiceStatus) {
            this.slsServiceStatus = slsServiceStatus;
            return this;
        }
        public String getSlsServiceStatus() {
            return this.slsServiceStatus;
        }

    }

}
