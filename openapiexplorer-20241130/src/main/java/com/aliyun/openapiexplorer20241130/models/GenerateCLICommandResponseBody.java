// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GenerateCLICommandResponseBody extends TeaModel {
    /**
     * <p>CLI command.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun ecs DescribeRegions --ResourceType instance</p>
     */
    @NameInMap("cli")
    public String cli;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A707AFA8-1A4C-5B2A-A165-8436C1EA38DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("unifiedCli")
    public String unifiedCli;

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

    public GenerateCLICommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateCLICommandResponseBody setUnifiedCli(String unifiedCli) {
        this.unifiedCli = unifiedCli;
        return this;
    }
    public String getUnifiedCli() {
        return this.unifiedCli;
    }

}
