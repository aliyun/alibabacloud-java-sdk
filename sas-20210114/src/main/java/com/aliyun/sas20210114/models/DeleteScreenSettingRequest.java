// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DeleteScreenSettingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteScreenSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScreenSettingRequest self = new DeleteScreenSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScreenSettingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
