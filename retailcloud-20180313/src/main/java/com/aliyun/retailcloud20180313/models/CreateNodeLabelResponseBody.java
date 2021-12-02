// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateNodeLabelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateNodeLabelResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateNodeLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeLabelResponseBody self = new CreateNodeLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeLabelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateNodeLabelResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateNodeLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNodeLabelResponseBody setResult(CreateNodeLabelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateNodeLabelResponseBodyResult getResult() {
        return this.result;
    }

    public CreateNodeLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateNodeLabelResponseBodyResult extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LabelKey")
        public String labelKey;

        @NameInMap("LabelValue")
        public String labelValue;

        public static CreateNodeLabelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeLabelResponseBodyResult self = new CreateNodeLabelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateNodeLabelResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateNodeLabelResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateNodeLabelResponseBodyResult setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public CreateNodeLabelResponseBodyResult setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
