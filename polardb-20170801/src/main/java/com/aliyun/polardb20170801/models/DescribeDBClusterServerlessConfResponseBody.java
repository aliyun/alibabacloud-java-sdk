// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterServerlessConfResponseBody extends TeaModel {
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleMax")
    public String scaleMax;

    @NameInMap("ScaleMin")
    public String scaleMin;

    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    @NameInMap("SecondsUntilAutoPause")
    public String secondsUntilAutoPause;

    public static DescribeDBClusterServerlessConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterServerlessConfResponseBody self = new DescribeDBClusterServerlessConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterServerlessConfResponseBody setAllowShutDown(String allowShutDown) {
        this.allowShutDown = allowShutDown;
        return this;
    }
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    public DescribeDBClusterServerlessConfResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterServerlessConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public DescribeDBClusterServerlessConfResponseBody setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public DescribeDBClusterServerlessConfResponseBody setSecondsUntilAutoPause(String secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

}
