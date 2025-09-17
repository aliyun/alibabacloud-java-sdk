// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUnsupportPortsResponseBody extends TeaModel {
    /**
     * <p>The HTTP ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>80,8080</p>
     */
    @NameInMap("HttpPorts")
    public String httpPorts;

    /**
     * <p>The HTTPS ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>443,8443,8021,3443,2443,9011</p>
     */
    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2E97B3F-1623-4CDF-A7E2-FD9D****027A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudUnsupportPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUnsupportPortsResponseBody self = new DescribeHybridCloudUnsupportPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUnsupportPortsResponseBody setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public DescribeHybridCloudUnsupportPortsResponseBody setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    public DescribeHybridCloudUnsupportPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
