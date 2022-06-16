// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppGroupDeploySettingResponseBody extends TeaModel {
    // CodeEnum
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppGroupDeploySettingResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAppGroupDeploySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupDeploySettingResponseBody self = new DescribeAppGroupDeploySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupDeploySettingResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppGroupDeploySettingResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeAppGroupDeploySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppGroupDeploySettingResponseBody setResult(DescribeAppGroupDeploySettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppGroupDeploySettingResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAppGroupDeploySettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAppGroupDeploySettingResponseBodyResult extends TeaModel {
        // 默认代码包描述
        @NameInMap("DefaultPacketComment")
        public String defaultPacketComment;

        // 默认代码包id
        @NameInMap("DefaultPacketId")
        public Long defaultPacketId;

        public static DescribeAppGroupDeploySettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupDeploySettingResponseBodyResult self = new DescribeAppGroupDeploySettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupDeploySettingResponseBodyResult setDefaultPacketComment(String defaultPacketComment) {
            this.defaultPacketComment = defaultPacketComment;
            return this;
        }
        public String getDefaultPacketComment() {
            return this.defaultPacketComment;
        }

        public DescribeAppGroupDeploySettingResponseBodyResult setDefaultPacketId(Long defaultPacketId) {
            this.defaultPacketId = defaultPacketId;
            return this;
        }
        public Long getDefaultPacketId() {
            return this.defaultPacketId;
        }

    }

}
