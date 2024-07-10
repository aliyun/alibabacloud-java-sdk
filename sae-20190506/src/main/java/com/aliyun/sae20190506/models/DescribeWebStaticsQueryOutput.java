// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebStaticsQueryOutput extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("WebStatics")
    public java.util.List<WebStaticsInfo> webStatics;

    public static DescribeWebStaticsQueryOutput build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebStaticsQueryOutput self = new DescribeWebStaticsQueryOutput();
        return TeaModel.build(map, self);
    }

    public DescribeWebStaticsQueryOutput setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeWebStaticsQueryOutput setWebStatics(java.util.List<WebStaticsInfo> webStatics) {
        this.webStatics = webStatics;
        return this;
    }
    public java.util.List<WebStaticsInfo> getWebStatics() {
        return this.webStatics;
    }

}
