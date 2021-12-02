// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateClusterResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateClusterResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterResponseBody setResult(CreateClusterResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateClusterResponseBodyResult getResult() {
        return this.result;
    }

    public CreateClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateClusterResponseBodyResult extends TeaModel {
        @NameInMap("ClusterInstanceId")
        public String clusterInstanceId;

        public static CreateClusterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterResponseBodyResult self = new CreateClusterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateClusterResponseBodyResult setClusterInstanceId(String clusterInstanceId) {
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }
        public String getClusterInstanceId() {
            return this.clusterInstanceId;
        }

    }

}
