// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>117.220.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchConditionRequest self = new DescribeSearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSearchConditionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSearchConditionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSearchConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
