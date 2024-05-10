// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailRequest extends TeaModel {
    /**
     * <p>The ID of the baseline check policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeStrategyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyDetailRequest self = new DescribeStrategyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStrategyDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeStrategyDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
