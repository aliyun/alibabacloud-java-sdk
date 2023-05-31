// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogShipperStatusResponseBody extends TeaModel {
    /**
     * <p>The status information.</p>
     */
    @NameInMap("LogShipperStatus")
    public DescribeLogShipperStatusResponseBodyLogShipperStatus logShipperStatus;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>Indicates whether Security Center is authorized to access Log Service. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
         */
        @NameInMap("AuthStatus")
        public String authStatus;

        /**
         * <p>Indicates whether the log analysis feature is purchased. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
         */
        @NameInMap("BuyStatus")
        public String buyStatus;

        /**
         * <p>The status of the log analysis feature. Valid values:</p>
         * <br>
         * <p>*   **yes**: enabled</p>
         * <p>*   **no**: disabled</p>
         */
        @NameInMap("OpenStatus")
        public String openStatus;

        /**
         * <p>Indicates whether the pay-as-you-go billing method is used. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
         */
        @NameInMap("PostPaidOpenStatus")
        public String postPaidOpenStatus;

        /**
         * <p>Indicates whether the log analysis feature supports the pay-as-you-go billing method. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
         */
        @NameInMap("PostPaidSupportStatus")
        public String postPaidSupportStatus;

        /**
         * <p>The status of the dedicated Log Service project. Valid values:</p>
         * <br>
         * <p>*   **Normal**: normal</p>
         * <p>*   **Disable**: disabled</p>
         */
        @NameInMap("SlsProjectStatus")
        public String slsProjectStatus;

        /**
         * <p>Indicates whether Log Service is activated. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
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
