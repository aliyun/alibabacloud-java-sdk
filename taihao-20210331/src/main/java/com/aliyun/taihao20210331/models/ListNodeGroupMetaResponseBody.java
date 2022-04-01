// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeGroupMetaResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    // List<NodeGroupMetaDTO>
    @NameInMap("data")
    public java.util.List<NodeGroupMetaDTO> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListNodeGroupMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupMetaResponseBody self = new ListNodeGroupMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodeGroupMetaResponseBody setData(java.util.List<NodeGroupMetaDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NodeGroupMetaDTO> getData() {
        return this.data;
    }

    public ListNodeGroupMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodeGroupMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeGroupMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
