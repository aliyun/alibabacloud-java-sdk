// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteOssScanConfigRequest extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * <br>
     * <p>>  You can call the [ListOssScanConfig](~~ListOssScanConfig~~) operation to query the IDs of rules.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssScanConfigRequest self = new DeleteOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOssScanConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
