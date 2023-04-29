// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetRequest extends TeaModel {
    /**
     * <p>WB01014029</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Queries the information about the assets to which a baseline check policy is applied.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>DescribeStrategyTarget</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeStrategyTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyTargetRequest self = new DescribeStrategyTargetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeStrategyTargetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyTargetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
