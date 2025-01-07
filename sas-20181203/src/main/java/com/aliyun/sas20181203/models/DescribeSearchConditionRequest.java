// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSearchConditionRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>117.220.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: Elastic Compute Service (ECS) instances.</li>
     * <li><strong>cloud_product</strong>: cloud services except ECS.</li>
     * </ul>
     * 
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
