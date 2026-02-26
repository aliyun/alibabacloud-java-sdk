// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckInstanceExistResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the instance exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance exists.</li>
     * <li><strong>false</strong>: The instance does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsExistInstance")
    public Boolean isExistInstance;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11439B36-F703-49EB-8656-D3C87BE28B57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstanceExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceExistResponseBody self = new CheckInstanceExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceExistResponseBody setIsExistInstance(Boolean isExistInstance) {
        this.isExistInstance = isExistInstance;
        return this;
    }
    public Boolean getIsExistInstance() {
        return this.isExistInstance;
    }

    public CheckInstanceExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
