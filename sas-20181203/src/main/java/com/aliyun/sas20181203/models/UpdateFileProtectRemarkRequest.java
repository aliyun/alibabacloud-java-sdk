// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1764</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public java.util.List<String> remark;

    public static UpdateFileProtectRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRemarkRequest self = new UpdateFileProtectRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRemarkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFileProtectRemarkRequest setRemark(java.util.List<String> remark) {
        this.remark = remark;
        return this;
    }
    public java.util.List<String> getRemark() {
        return this.remark;
    }

}
