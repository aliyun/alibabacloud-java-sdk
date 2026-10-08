// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceVncUrlResponseBody extends TeaModel {
    /**
     * <p>The VNC logon URL.</p>
     * <blockquote>
     * <p>Notice: The VNC logon URL is time-sensitive and valid for 15 seconds. If you do not use the URL within 15 seconds after the call succeeds, the URL automatically expires. In this case, call the operation again to obtain a new URL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=****&instanceId=i-2vcb1qjj8z5dl8iw****&isWindows=false">https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=****&amp;instanceId=i-2vcb1qjj8z5dl8iw****&amp;isWindows=false</a></p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCInstanceVncUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceVncUrlResponseBody self = new DescribeRCInstanceVncUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceVncUrlResponseBody setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public DescribeRCInstanceVncUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
