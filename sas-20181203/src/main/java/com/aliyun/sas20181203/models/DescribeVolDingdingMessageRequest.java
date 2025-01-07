// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVolDingdingMessageRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeVolDingdingMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVolDingdingMessageRequest self = new DescribeVolDingdingMessageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVolDingdingMessageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVolDingdingMessageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
