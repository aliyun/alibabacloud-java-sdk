// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeQualificationStatusRequest extends TeaModel {
    @NameInMap("TbUid")
    public String tbUid;

    public static DescribeQualificationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualificationStatusRequest self = new DescribeQualificationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQualificationStatusRequest setTbUid(String tbUid) {
        this.tbUid = tbUid;
        return this;
    }
    public String getTbUid() {
        return this.tbUid;
    }

}
