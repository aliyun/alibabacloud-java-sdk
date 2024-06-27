// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDocTypesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDocTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocTypesRequest self = new DescribeDocTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
