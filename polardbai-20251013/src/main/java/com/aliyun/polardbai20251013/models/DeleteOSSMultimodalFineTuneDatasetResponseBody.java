// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteOSSMultimodalFineTuneDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>数据集列表，每一项包括数据集id，数据集名，创建时间，修改时间，标签，描述，导入信息，embedding列表相关字段</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>983863E2-****-1D15-A4AE-3468CD75383D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteOSSMultimodalFineTuneDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOSSMultimodalFineTuneDatasetResponseBody self = new DeleteOSSMultimodalFineTuneDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOSSMultimodalFineTuneDatasetResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteOSSMultimodalFineTuneDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
