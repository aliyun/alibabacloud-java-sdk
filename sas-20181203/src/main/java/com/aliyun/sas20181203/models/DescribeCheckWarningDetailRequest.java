// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailRequest extends TeaModel {
    /**
     * <p>The ID of the alert that is triggered by the check item.</p>
     * <br>
     * <p>>  To query the details about a specified check item, you must provide the ID of the alert that is triggered by the check item. You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of alerts.</p>
     */
    @NameInMap("CheckWarningId")
    public Long checkWarningId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCheckWarningDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailRequest self = new DescribeCheckWarningDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailRequest setCheckWarningId(Long checkWarningId) {
        this.checkWarningId = checkWarningId;
        return this;
    }
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    public DescribeCheckWarningDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
