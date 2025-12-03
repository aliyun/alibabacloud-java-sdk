// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>101786</p>
     */
    @NameInMap("Id")
    public String id;

    public static DescribeScreenSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSettingRequest self = new DescribeScreenSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSettingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
