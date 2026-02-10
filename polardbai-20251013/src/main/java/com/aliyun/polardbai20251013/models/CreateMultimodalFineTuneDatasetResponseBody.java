// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalFineTuneDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>执行成功返回数据集ID，失败返回错误信息
     * &quot;Data&quot;:{&quot;DatasetId&quot;:&quot;ds-htev80p61324x8qlbn&quot;}</p>
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

    public static CreateMultimodalFineTuneDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalFineTuneDatasetResponseBody self = new CreateMultimodalFineTuneDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalFineTuneDatasetResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CreateMultimodalFineTuneDatasetResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateMultimodalFineTuneDatasetResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateMultimodalFineTuneDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMultimodalFineTuneDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
