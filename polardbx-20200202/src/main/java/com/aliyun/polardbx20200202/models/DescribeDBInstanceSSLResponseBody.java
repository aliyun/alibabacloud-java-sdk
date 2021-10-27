// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceSSLResponseBodyData data;

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
        @NameInMap("CertCommonName")
        public String certCommonName;

        @NameInMap("SSLEnabled")
        public Boolean SSLEnabled;

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
