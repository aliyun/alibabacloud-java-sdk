// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessioninfoRequest extends TeaModel {
    @NameInMap("VPS")
    public String VPS;

    public static DescribeNewPlayVideoPlaySessioninfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessioninfoRequest self = new DescribeNewPlayVideoPlaySessioninfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessioninfoRequest setVPS(String VPS) {
        this.VPS = VPS;
        return this;
    }
    public String getVPS() {
        return this.VPS;
    }

}
