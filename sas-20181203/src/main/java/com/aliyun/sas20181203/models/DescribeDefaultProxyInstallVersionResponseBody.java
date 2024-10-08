// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDefaultProxyInstallVersionResponseBody extends TeaModel {
    /**
     * <p>The default installation version.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy_01_03</p>
     */
    @NameInMap("InstallVersion")
    public String installVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F9FCB51A-5078-5D31-9C4D-3B25BEF068C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefaultProxyInstallVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultProxyInstallVersionResponseBody self = new DescribeDefaultProxyInstallVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultProxyInstallVersionResponseBody setInstallVersion(String installVersion) {
        this.installVersion = installVersion;
        return this;
    }
    public String getInstallVersion() {
        return this.installVersion;
    }

    public DescribeDefaultProxyInstallVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
