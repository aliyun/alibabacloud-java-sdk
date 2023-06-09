// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeUserAnalyzerRequest extends TeaModel {
    /**
     * <p>all</p>
     */
    @NameInMap("with")
    public String with;

    public static DescribeUserAnalyzerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAnalyzerRequest self = new DescribeUserAnalyzerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAnalyzerRequest setWith(String with) {
        this.with = with;
        return this;
    }
    public String getWith() {
        return this.with;
    }

}
