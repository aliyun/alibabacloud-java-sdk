// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEciConfigResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // result
    @NameInMap("Result")
    public DescribeEciConfigResponseBodyResult result;

    public static DescribeEciConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciConfigResponseBody self = new DescribeEciConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEciConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEciConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeEciConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEciConfigResponseBody setResult(DescribeEciConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEciConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeEciConfigResponseBodyResult extends TeaModel {
        // appEnvId
        @NameInMap("AppEnvId")
        public Long appEnvId;

        // eipBandwidth
        @NameInMap("EipBandwidth")
        public Integer eipBandwidth;

        // enableEciSchedulePolicy
        @NameInMap("EnableEciSchedulePolicy")
        public Boolean enableEciSchedulePolicy;

        // mirrorCache
        @NameInMap("MirrorCache")
        public Boolean mirrorCache;

        // normalInstanceLimit
        @NameInMap("NormalInstanceLimit")
        public Integer normalInstanceLimit;

        // scheduleVirtualNode
        @NameInMap("ScheduleVirtualNode")
        public Boolean scheduleVirtualNode;

        public static DescribeEciConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEciConfigResponseBodyResult self = new DescribeEciConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEciConfigResponseBodyResult setAppEnvId(Long appEnvId) {
            this.appEnvId = appEnvId;
            return this;
        }
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        public DescribeEciConfigResponseBodyResult setEipBandwidth(Integer eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeEciConfigResponseBodyResult setEnableEciSchedulePolicy(Boolean enableEciSchedulePolicy) {
            this.enableEciSchedulePolicy = enableEciSchedulePolicy;
            return this;
        }
        public Boolean getEnableEciSchedulePolicy() {
            return this.enableEciSchedulePolicy;
        }

        public DescribeEciConfigResponseBodyResult setMirrorCache(Boolean mirrorCache) {
            this.mirrorCache = mirrorCache;
            return this;
        }
        public Boolean getMirrorCache() {
            return this.mirrorCache;
        }

        public DescribeEciConfigResponseBodyResult setNormalInstanceLimit(Integer normalInstanceLimit) {
            this.normalInstanceLimit = normalInstanceLimit;
            return this;
        }
        public Integer getNormalInstanceLimit() {
            return this.normalInstanceLimit;
        }

        public DescribeEciConfigResponseBodyResult setScheduleVirtualNode(Boolean scheduleVirtualNode) {
            this.scheduleVirtualNode = scheduleVirtualNode;
            return this;
        }
        public Boolean getScheduleVirtualNode() {
            return this.scheduleVirtualNode;
        }

    }

}
