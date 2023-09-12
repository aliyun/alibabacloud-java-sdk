// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllGroupsRequest extends TeaModel {
    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeAllGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllGroupsRequest self = new DescribeAllGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
