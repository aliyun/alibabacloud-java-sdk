// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsScaProcessNumRequest extends TeaModel {
    /**
     * <p>The type of the application process. Default value: java. Valid values:</p>
     * <ul>
     * <li><strong>java</strong></li>
     * <li><strong>php</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The UUIDs of the servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static DescribeAssetsScaProcessNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsScaProcessNumRequest self = new DescribeAssetsScaProcessNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsScaProcessNumRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeAssetsScaProcessNumRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
