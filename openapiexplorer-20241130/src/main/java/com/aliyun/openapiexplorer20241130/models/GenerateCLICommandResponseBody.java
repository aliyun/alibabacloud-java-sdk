// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliyun ecs DescribeRegions --ResourceType instance</p>
     */
    @NameInMap("cli")
    public String cli;

    public static GenerateCLICommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCLICommandResponseBody self = new GenerateCLICommandResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCLICommandResponseBody setCli(String cli) {
        this.cli = cli;
        return this;
    }
    public String getCli() {
        return this.cli;
    }

}
