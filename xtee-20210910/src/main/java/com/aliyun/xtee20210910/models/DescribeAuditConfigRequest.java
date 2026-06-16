// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuditConfigRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The approval type.</p>
     * 
     * <strong>example:</strong>
     * <p>RULE</p>
     */
    @NameInMap("auditRelationType")
    public String auditRelationType;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeAuditConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditConfigRequest self = new DescribeAuditConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAuditConfigRequest setAuditRelationType(String auditRelationType) {
        this.auditRelationType = auditRelationType;
        return this;
    }
    public String getAuditRelationType() {
        return this.auditRelationType;
    }

    public DescribeAuditConfigRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
