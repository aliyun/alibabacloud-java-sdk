// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceSSLResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponseBody self = new DescribeDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLResponseBody setData(DescribeDBInstanceSSLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceSSLResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceSSLResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-sddddddcym7g7w****.polarx.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("CertCommonName")
        public String certCommonName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SSLEnabled")
        public Boolean SSLEnabled;

        /**
         * <strong>example:</strong>
         * <p>2022-11-04T09:39:07Z</p>
         */
        @NameInMap("SSLExpiredTime")
        public String SSLExpiredTime;

        public static DescribeDBInstanceSSLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSSLResponseBodyData self = new DescribeDBInstanceSSLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSSLResponseBodyData setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

        public DescribeDBInstanceSSLResponseBodyData setSSLEnabled(Boolean SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }
        public Boolean getSSLEnabled() {
            return this.SSLEnabled;
        }

        public DescribeDBInstanceSSLResponseBodyData setSSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }
        public String getSSLExpiredTime() {
            return this.SSLExpiredTime;
        }

    }

}
