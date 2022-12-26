// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

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
