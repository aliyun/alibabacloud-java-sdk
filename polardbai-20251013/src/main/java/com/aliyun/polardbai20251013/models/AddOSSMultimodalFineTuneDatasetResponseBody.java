// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class AddOSSMultimodalFineTuneDatasetResponseBody extends TeaModel {
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

    public static AddOSSMultimodalFineTuneDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOSSMultimodalFineTuneDatasetResponseBody self = new AddOSSMultimodalFineTuneDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOSSMultimodalFineTuneDatasetResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AddOSSMultimodalFineTuneDatasetResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddOSSMultimodalFineTuneDatasetResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AddOSSMultimodalFineTuneDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddOSSMultimodalFineTuneDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
