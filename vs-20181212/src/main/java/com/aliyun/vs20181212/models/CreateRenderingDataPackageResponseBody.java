// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDataPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dp-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRenderingDataPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDataPackageResponseBody self = new CreateRenderingDataPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDataPackageResponseBody setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public CreateRenderingDataPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
