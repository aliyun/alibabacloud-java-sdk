// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the ports that can be used by a hybrid cloud cluster.</p>
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
         * <p>The HTTP ports. The value is a string. If multiple ports are returned, the value is in the **port1,port2,port3** format.</p>
         */
        @NameInMap("HttpPorts")
        public String httpPorts;

        /**
         * <p>The HTTPS ports. The value is a string. If multiple ports are returned, the value is in the **port1,port2,port3** format.</p>
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
