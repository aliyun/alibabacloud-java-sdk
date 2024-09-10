// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageTopRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprint. Valid value:</p>
     * <ul>
     * <li><strong>port</strong>: port</li>
     * <li><strong>process</strong>: process</li>
     * <li><strong>software</strong>: software</li>
     * <li><strong>user</strong>: account</li>
     * <li><strong>sca</strong>: middleware</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribePropertyUsageTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageTopRequest self = new DescribePropertyUsageTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageTopRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
