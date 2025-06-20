// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CancelBlockRequest extends TeaModel {
    @NameInMap("BlockId")
    public Long blockId;

    @NameInMap("CancelBLockDesc")
    public String cancelBLockDesc;

    @NameInMap("CreateEmpId")
    public String createEmpId;

    public static CancelBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBlockRequest self = new CancelBlockRequest();
        return TeaModel.build(map, self);
    }

    public CancelBlockRequest setBlockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }
    public Long getBlockId() {
        return this.blockId;
    }

    public CancelBlockRequest setCancelBLockDesc(String cancelBLockDesc) {
        this.cancelBLockDesc = cancelBLockDesc;
        return this;
    }
    public String getCancelBLockDesc() {
        return this.cancelBLockDesc;
    }

    public CancelBlockRequest setCreateEmpId(String createEmpId) {
        this.createEmpId = createEmpId;
        return this;
    }
    public String getCreateEmpId() {
        return this.createEmpId;
    }

}
