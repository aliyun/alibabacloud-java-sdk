// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNisInspectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNisInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNisInspectionTaskResponseBody self = new DeleteNisInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNisInspectionTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteNisInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
