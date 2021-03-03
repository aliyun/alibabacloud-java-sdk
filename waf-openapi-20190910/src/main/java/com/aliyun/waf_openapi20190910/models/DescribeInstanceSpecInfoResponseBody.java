// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecInfoResponseBody extends TeaModel {
    @NameInMap("InstanceSpecInfos")
    public java.util.List<DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos> instanceSpecInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Version")
    public String version;

    @NameInMap("ExpireTime")
    public Long expireTime;

    public static DescribeInstanceSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecInfoResponseBody self = new DescribeInstanceSpecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecInfoResponseBody setInstanceSpecInfos(java.util.List<DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos> instanceSpecInfos) {
        this.instanceSpecInfos = instanceSpecInfos;
        return this;
    }
    public java.util.List<DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos> getInstanceSpecInfos() {
        return this.instanceSpecInfos;
    }

    public DescribeInstanceSpecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSpecInfoResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeInstanceSpecInfoResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public static class DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Code")
        public String code;

        public static DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos self = new DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstanceSpecInfoResponseBodyInstanceSpecInfos setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
