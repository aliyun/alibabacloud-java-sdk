// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvDeployBaselineResponseBody extends TeaModel {
    // CodeEnum
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppEnvDeployBaselineResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAppEnvDeployBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvDeployBaselineResponseBody self = new DescribeAppEnvDeployBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvDeployBaselineResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAppEnvDeployBaselineResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeAppEnvDeployBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppEnvDeployBaselineResponseBody setResult(DescribeAppEnvDeployBaselineResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppEnvDeployBaselineResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAppEnvDeployBaselineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAppEnvDeployBaselineResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnvId")
        public Long envId;

        // 代码包描述
        @NameInMap("PacketComment")
        public String packetComment;

        // 代码包id
        @NameInMap("PacketId")
        public Long packetId;

        // 指定代码包发布时，为代码包Url；纯镜像发布时，为镜像地址
        @NameInMap("PacketUrl")
        public String packetUrl;

        // 部署配置schema_id
        @NameInMap("SchemaId")
        public Long schemaId;

        public static DescribeAppEnvDeployBaselineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvDeployBaselineResponseBodyResult self = new DescribeAppEnvDeployBaselineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setPacketComment(String packetComment) {
            this.packetComment = packetComment;
            return this;
        }
        public String getPacketComment() {
            return this.packetComment;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setPacketId(Long packetId) {
            this.packetId = packetId;
            return this;
        }
        public Long getPacketId() {
            return this.packetId;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setPacketUrl(String packetUrl) {
            this.packetUrl = packetUrl;
            return this;
        }
        public String getPacketUrl() {
            return this.packetUrl;
        }

        public DescribeAppEnvDeployBaselineResponseBodyResult setSchemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Long getSchemaId() {
            return this.schemaId;
        }

    }

}
