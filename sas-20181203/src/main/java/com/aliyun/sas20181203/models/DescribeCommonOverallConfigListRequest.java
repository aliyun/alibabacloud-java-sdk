// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigListRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>119.136.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The types of the configuration items.</p>
     * <blockquote>
     * <p> You can query up to 50 types at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TypeList")
    public java.util.List<String> typeList;

    public static DescribeCommonOverallConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigListRequest self = new DescribeCommonOverallConfigListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCommonOverallConfigListRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
