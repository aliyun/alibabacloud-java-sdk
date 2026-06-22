// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedStrategyTargetsRequest extends TeaModel {
    /**
     * <p>The language type for requests and responses. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>39.170.43.**</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCustomizedStrategyTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedStrategyTargetsRequest self = new DescribeCustomizedStrategyTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedStrategyTargetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustomizedStrategyTargetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
