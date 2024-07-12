// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLabelTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LabelTableId")
    public String labelTableId;

    /**
     * <strong>example:</strong>
     * <p>0FA90B3B-F30A-5C9D-A9FD-8114F8868062</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLabelTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTableResponseBody self = new CreateLabelTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabelTableResponseBody setLabelTableId(String labelTableId) {
        this.labelTableId = labelTableId;
        return this;
    }
    public String getLabelTableId() {
        return this.labelTableId;
    }

    public CreateLabelTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
