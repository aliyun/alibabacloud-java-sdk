// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigRequest extends TeaModel {
    /**
     * <p>Notification configuration type, with values:</p>
     * <ul>
     * <li><strong>Default (not provided)</strong>: SMS/Email/Site Message </li>
     * <li><strong>cms</strong>: Cloud Monitor Push</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60.191.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeNoticeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigRequest self = new DescribeNoticeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeNoticeConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
