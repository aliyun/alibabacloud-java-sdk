// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeUserServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusRequest self = new DescribeUserServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
