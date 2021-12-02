// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppResourceAllocResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppResourceAllocResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAppResourceAllocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResourceAllocResponseBody self = new DescribeAppResourceAllocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResourceAllocResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppResourceAllocResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeAppResourceAllocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppResourceAllocResponseBody setResult(DescribeAppResourceAllocResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppResourceAllocResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAppResourceAllocResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAppResourceAllocResponseBodyResult extends TeaModel {
        @NameInMap("AppEnvId")
        public Long appEnvId;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceDef")
        public String resourceDef;

        public static DescribeAppResourceAllocResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResourceAllocResponseBodyResult self = new DescribeAppResourceAllocResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppResourceAllocResponseBodyResult setAppEnvId(Long appEnvId) {
            this.appEnvId = appEnvId;
            return this;
        }
        public Long getAppEnvId() {
            return this.appEnvId;
        }

        public DescribeAppResourceAllocResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppResourceAllocResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAppResourceAllocResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAppResourceAllocResponseBodyResult setResourceDef(String resourceDef) {
            this.resourceDef = resourceDef;
            return this;
        }
        public String getResourceDef() {
            return this.resourceDef;
        }

    }

}
