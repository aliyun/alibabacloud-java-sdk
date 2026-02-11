// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ApplyBastionAccountRequest extends TeaModel {
    /**
     * <p>Mobile Phone Number</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Mobile")
    public Long mobile;

    /**
     * <p>Project ID</p>
     * 
     * <strong>example:</strong>
     * <p>90912</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ApplyBastionAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBastionAccountRequest self = new ApplyBastionAccountRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBastionAccountRequest setMobile(Long mobile) {
        this.mobile = mobile;
        return this;
    }
    public Long getMobile() {
        return this.mobile;
    }

    public ApplyBastionAccountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
