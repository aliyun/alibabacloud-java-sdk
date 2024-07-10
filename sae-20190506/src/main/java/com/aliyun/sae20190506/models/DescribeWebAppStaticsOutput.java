// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebAppStaticsOutput extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("WebAppStatics")
    public java.util.List<WebStaticsInfo> webAppStatics;

    public static DescribeWebAppStaticsOutput build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAppStaticsOutput self = new DescribeWebAppStaticsOutput();
        return TeaModel.build(map, self);
    }

    public DescribeWebAppStaticsOutput setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeWebAppStaticsOutput setWebAppStatics(java.util.List<WebStaticsInfo> webAppStatics) {
        this.webAppStatics = webAppStatics;
        return this;
    }
    public java.util.List<WebStaticsInfo> getWebAppStatics() {
        return this.webAppStatics;
    }

}
