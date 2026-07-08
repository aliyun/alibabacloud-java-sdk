// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9178CB86-285F-5679-A30A-3B3F007E4206</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the available HTTP and HTTPS port ranges for hybrid cloud access.</p>
     */
    @NameInMap("UserInfo")
    public DescribeHybridCloudUserResponseBodyUserInfo userInfo;

    public static DescribeHybridCloudUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUserResponseBody self = new DescribeHybridCloudUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudUserResponseBody setUserInfo(DescribeHybridCloudUserResponseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DescribeHybridCloudUserResponseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DescribeHybridCloudUserResponseBodyUserInfo extends TeaModel {
        /**
         * <p>The available HTTP ports. The value is a string. If multiple ports are returned, they are separated by commas (,). Example: <strong>port1,port2,port3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80,8080</p>
         */
        @NameInMap("HttpPorts")
        public String httpPorts;

        /**
         * <p>The available HTTPS ports. The value is a string. If multiple ports are returned, they are separated by commas (,). Example: <strong>port1,port2,port3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8443,443</p>
         */
        @NameInMap("HttpsPorts")
        public String httpsPorts;

        public static DescribeHybridCloudUserResponseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudUserResponseBodyUserInfo self = new DescribeHybridCloudUserResponseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudUserResponseBodyUserInfo setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeHybridCloudUserResponseBodyUserInfo setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

    }

}
