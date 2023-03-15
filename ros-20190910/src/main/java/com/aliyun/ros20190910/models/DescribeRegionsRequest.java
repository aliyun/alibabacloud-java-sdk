// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The language in which the returned results are displayed.</p>
     * <br>
     * <p>Default value: zh-CN. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   en-US: English</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
