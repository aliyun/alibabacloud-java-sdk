// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DeleteDataLimitRequest extends TeaModel {
    /**
     * <p>The ID of the data asset.</p>
     * <br>
     * <p>You can call the DescribeDataLimits operation to query the IDs of data assets. The value of the Id response parameter indicates the ID of a data asset.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteDataLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLimitRequest self = new DeleteDataLimitRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataLimitRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
