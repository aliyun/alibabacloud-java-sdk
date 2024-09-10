// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration time. Unit: hours.</p>
     * <blockquote>
     * <p> A value <strong>0</strong> indicates that asset fingerprint collection is disabled for this type of asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScheduleConfigResponseBody self = new DescribePropertyScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScheduleConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribePropertyScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
